package game;

import javax.swing.JPanel;

import entities.Vaisseau;
import ressources.Constants;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.awt.Graphics2D;

public class Scene extends JPanel{

    /******Variables******/

    private Vaisseau vaisseau;


    /******Constructors*******/

    public Scene(){
        super();

        this.vaisseau = new Vaisseau();

    }


    /******Methods******/

    public void paintComponent(Graphics g){  //Permet de gérer le graphique sur le panneau donc sur ce pannel.
        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g;


        //Dessin du fond d'écran 

        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, Constants.LARGEUR_FENETRE,Constants.HAUTEUR_FENETRE);
        g2.setColor(Color.GREEN);
        g2.fillRect(30, 530, 535, 5);

        g2.drawImage(vaisseau.getImg(), vaisseau.getXpos(), vaisseau.getYpos(), null);
    }
    
}
