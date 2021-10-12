package entities;

import ressources.Constants;

public class GroupAlien {

    /****** Variables ******/
    private Alien[][] aliens;

    /****** Constructors *******/

    public GroupAlien() {

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
            for(int j=0, nbColumn=aliens.length;j<nbColumn;j++){
                if(aliens[i][j].vivant){
                    aliens[i][j].ypos = aliens[i][j].ypos-5;
                }
            }
        }
    }

    public void moveAlienRight(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens.length;j<nbColumn;j++){
                if(aliens[i][j].vivant){
                    aliens[i][j].xpos = aliens[i][j].xpos+5;
                }
            }
        }
    }

    public void moveAlienLeft(){
        for(int i=0, nbRow=aliens.length; i<nbRow; i++){
            for(int j=0, nbColumn=aliens.length;j<nbColumn;j++){
                if(aliens[i][j].vivant){
                    aliens[i][j].xpos = aliens[i][j].xpos-5;
                }
            }
        }
    }




    public Alien [][] getAliens(){
        return this.aliens;
    }


}
