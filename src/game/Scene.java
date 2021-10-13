package game;

import javax.swing.JPanel;

import entities.GroupAlien;
import entities.Vaisseau;
import ressources.Chrono;
import ressources.Constants;
import ressources.DeplacementAlien;
import ressources.Keyboard;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.awt.Graphics2D;
import entities.Alien;

public class Scene extends JPanel{

    /******Variables******/

    private Vaisseau vaisseau;

    private GroupAlien groupAlien;

    private  Alien [][]  aliens;

    /******Constructors*******/

    public Scene(){
        super();

        this.vaisseau = new Vaisseau();

        this.groupAlien = new GroupAlien();

        this.aliens = this.groupAlien.getAliens();

        //Instanciation du clavier 
        this.setFocusable(true);
      
        this.requestFocusInWindow();
       
        this.addKeyListener(new Keyboard(this));

        Thread chronoThread = new Thread(new Chrono(this));

        chronoThread.start();

        Thread alienDeplacementThread = new Thread(new DeplacementAlien(this)); 

        alienDeplacementThread.start();

    }
    


    /******Methods******/

    public synchronized void paintComponent(Graphics g){  //Permet de gérer le graphique sur le panneau donc sur ce pannel.
        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g;


        //Dessin du fond d'écran 

        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, Constants.LARGEUR_FENETRE,Constants.HAUTEUR_FENETRE);
        g2.setColor(Color.GREEN);
        g2.fillRect(30, 530, 535, 5);

        g2.drawImage(vaisseau.getImg(), vaisseau.getXpos(), vaisseau.getYpos(), null);

        for(int i=0, nbRow=aliens.length;i<nbRow;i++){
            for(int j=0,nbColumn = aliens[1].length;j<nbColumn;j++){
                Alien alien = aliens[i][j];
                g2.drawImage(alien.getImg(), alien.getXpos(), alien.getYpos(), null);
            }
        }
    }
    

    public Vaisseau getVaisseau(){
        return this.vaisseau;
    }

    public void setVaisseau(Vaisseau vaisseau){
        this.vaisseau = vaisseau;
    }

    public GroupAlien getGroupAlien(){
        return this.groupAlien;
    }

}
