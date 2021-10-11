package game;

import javax.swing.JFrame;

import ressources.Constants;

public class App {



    /******Variables******/


     public static Scene scene; 

    /******Methods******/



    public static void main(String[] args) throws Exception {
        //Création de la fenetrede l'application. 
        JFrame fenetre= new JFrame("Space invaders game"); 
        fenetre.setSize(Constants.LARGEUR_FENETRE,Constants.HAUTEUR_FENETRE);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Pour fermer la fenetre
        fenetre.setAlwaysOnTop(true); //Elle soit toujours devant les autres fenetre
        
        //Association du panneau scene à la fenetre 
        scene = new Scene();
        fenetre.setContentPane(scene);
        fenetre.setVisible(true);
        }
}
