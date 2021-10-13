package entities;

import ressources.Constants;

public class GroupAlien {

    enum State {
        RIGHT,
        BOTTOM,
        LEFT
      }
      

    private State actualState;
    /****** Variables ******/
    private Alien[][] aliens;

    /****** Constructors *******/

    public GroupAlien() {

        actualState=State.RIGHT;

        aliens = new Alien[5][10];

        this.initAliensArray();

    }

    /****** Methods *******/


    private void initAliensArray() {

        for (int j = 0, nbColumn = aliens[0].length; j < nbColumn; j++) {
            this.aliens[0][j] = new Alien(
                    Constants.X_POS_INIT_ALIEN + (Constants.LARGEUR_ALIEN + Constants.ECART_COLONNES_ALIEN) * j,
                    Constants.ALT_INIT_ALIEN, "../img/alienHaut1.png", "../img/alienHaut2.png");
            for (int i = 1; i <= 2; i++) {
                this.aliens[i][j] = new Alien(
                        Constants.X_POS_INIT_ALIEN + (Constants.LARGEUR_ALIEN + Constants.ECART_COLONNES_ALIEN) * j,
                        Constants.ALT_INIT_ALIEN + (Constants.HAUTEUR_ALIEN + Constants.ECART_LIGNES_ALIEN) * i,
                        "../img/alienMilieu1.png", "../img/alienMilieu2.png");
            }

            for(int i=3;i<5;i++){
                this.aliens[i][j] = new Alien(Constants.X_POS_INIT_ALIEN + (Constants.LARGEUR_ALIEN + Constants.ECART_COLONNES_ALIEN) * j,Constants.ALT_INIT_ALIEN + (Constants.HAUTEUR_ALIEN + Constants.ECART_LIGNES_ALIEN) * i, "../img/alienBas1.png", "../img/alienBas2.png");
            }
        }
    }


    public void moveAlienButtom(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens[1].length;j<nbColumn;j++){
                if(aliens[i][j].vivant){
                    aliens[i][j].ypos = aliens[i][j].ypos+Constants.DY_ALIEN;
                }
            }
        }
    }

    public void moveAlienRight(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens[1].length;j<nbColumn;j++){
                if(aliens[i][j].vivant){
                    aliens[i][j].xpos = aliens[i][j].xpos+Constants.DX_ALIEN;
                }
            }
        }
    }

    public void moveAlienLeft(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens[1].length;j<nbColumn;j++){
                if(aliens[i][j].vivant){
                    aliens[i][j].xpos = aliens[i][j].xpos-Constants.DX_ALIEN;
                }
            }
        }
    }

    public void moveAlien(){
        if(allAliensAlive() && !reachBottomLimit()){
            switch(this.actualState){
                case RIGHT:
                    if(reachRightLimit()){
                        this.actualState=State.BOTTOM;
                    }
                    else{
                        moveAlienRight();
                    }
                    break;
    
                case LEFT:
                    if(reachLeftLimit()){
                        this.actualState=State.BOTTOM;
                    }
                    else{
                        moveAlienLeft();
                    }
                    break;
    
                case BOTTOM:
                    moveAlienButtom();
                    if(reachRightLimit()){
                        this.actualState=State.LEFT;
                    }
                    else{
                        this.actualState=State.RIGHT;
                    }
                    break;
                default :
                    break;
            }    
        }
    }


    public boolean reachRightLimit(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens[1].length;j<nbColumn;j++){
                if(aliens[i][j].vivant && aliens[i][j].xpos+Constants.DX_ALIEN>Constants.LIMITE_DROITE_VAISSEAU){
                    return true;
              }
            }
        }
        return false;
    }


    public boolean reachLeftLimit(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens[1].length;j<nbColumn;j++){
                if(aliens[i][j].vivant && aliens[i][j].xpos-Constants.DX_ALIEN<Constants.LIMITE_GAUCHE_VAISSEAU){
                    return true;
              }
            }
        }
        return false;
    }

    public boolean reachBottomLimit(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens[1].length;j<nbColumn;j++){
                if(aliens[i][j].vivant && aliens[i][j].ypos+Constants.DY_ALIEN>Constants.Y_POS_VAISSEAU){
                    return true;
              }
            }
        }
        return false;
    }

    public boolean allAliensAlive(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens[1].length;j<nbColumn;j++){
                if(!aliens[i][j].vivant){
                    return false;
                }
            }
        }
        return true; 
    }


    public Alien [][] getAliens(){
        return this.aliens;
    }


}
