package entities;

import javax.swing.ImageIcon;

import java.awt.Image;

public abstract class Entity {
    
    /******Variables******/

    protected int largeur, hauteur, xpos, ypos, dx, dy;
    protected boolean vivant;
    protected String strImg1, strImg2, strImg3;
    protected ImageIcon ico;
    protected Image img;




    /******Constructors*******/

    //Classe abstraite pas de constructeur pas d'instance de cette classe. Elle va nous servir à faire des héritages pour d'autre classes qui vont quand à elle permettre de créer des objets

    


    /******Methods******/

    
    
    public int getLargeur() {
        return largeur;
    }
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    public int getHauteur() {
        return hauteur;
    }
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    public int getXpos() {
        return xpos;
    }
    public void setXpos(int xpos) {
        this.xpos = xpos;
    }
    public int getYpos() {
        return ypos;
    }
    public void setYpos(int ypos) {
        this.ypos = ypos;
    }
    public int getDx() {
        return dx;
    }
    public void setDx(int dx) {
        this.dx = dx;
    }
    public int getDy() {
        return dy;
    }
    public void setDy(int dy) {
        this.dy = dy;
    }
    public boolean isVivant() {
        return vivant;
    }
    public void setVivant(boolean vivant) {
        this.vivant = vivant;
    }
    public String getStrImg1() {
        return strImg1;
    }
    public void setStrImg1(String strImg1) {
        this.strImg1 = strImg1;
    }
    public String getStrImg2() {
        return strImg2;
    }
    public void setStrImg2(String strImg2) {
        this.strImg2 = strImg2;
    }
    public String getStrImg3() {
        return strImg3;
    }
    public void setStrImg3(String strImg3) {
        this.strImg3 = strImg3;
    }
    public ImageIcon getIco() {
        return ico;
    }
    public void setIco(ImageIcon ico) {
        this.ico = ico;
    }
    public Image getImg() {
        return img;
    }
    public void setImg(Image img) {
        this.img = img;
    }


}
