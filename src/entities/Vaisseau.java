package entities;

import javax.swing.ImageIcon;

import ressources.Constants;

public class Vaisseau extends Entity{

     /******Variables******/

 
 
     /******Constructors*******/

     public Vaisseau(){
         super.xpos =Constants.X_POS_INIT_VAISSEAU;
         super.ypos =Constants.Y_POS_VAISSEAU;
         super.largeur = Constants.LARGEUR_VAISSEAU;
         super.hauteur = Constants.HAUTEUR_VAISSEAU;
         super.dx = Constants.DX_VAISSEAU;
         super.dy = 0; 
         super.strImg1 = "../img/vaisseau.png";
         super.strImg2 = "../img/vaisseauDetruit1.png";
         super.strImg3 = "../img/vaisseauDetruit2.png";

         //chargemnt de l'image
         super.ico= new ImageIcon(getClass().getResource(super.strImg1)); //il va chercher le fichier image et il va le charger dans l'objet ImageIcon ico
         

         //cet ico est chargé dans l'image et on récupére l'image qui est affiché à l'écran. 
         super.img= this.ico.getImage();
         
    }
 
 
     
 
 
     /******Methods******/
 
    
}
