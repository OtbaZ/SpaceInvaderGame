package game;

import javax.swing.JPanel;

import ressources.Constants;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Graphics2D;

public class Scene extends JPanel{

    /******Variables******/



    /******Constructors*******/

    public Scene(){
        super();

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
    }
    
}
