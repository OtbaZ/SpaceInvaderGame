package entities;

import javax.swing.ImageIcon;

import ressources.Constants;

public class Alien extends Entity{
    



    public Alien(int xPos, int yPos, String strImg1, String strImg2){
        super.dx=0;
        super.dy=0;
        super.largeur=Constants.LARGEUR_ALIEN;
        super.hauteur=Constants.HAUTEUR_ALIEN;
        super.xpos=xPos;
        super.ypos=yPos;
        super.vivant =true;
        super.strImg1=strImg1;
        super.strImg2=strImg2;
        super.strImg3="../img/alienMeurt.png";
        super.ico=new ImageIcon(getClass().getResource(super.strImg1));
        super.img= this.ico.getImage();

    }
}
