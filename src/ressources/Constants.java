package ressources;

public abstract class Constants {

    /**************Fenêtre*******************************/


    public static final int LARGEUR_FENETRE= 600; 
    public static final int HAUTEUR_FENETRE= 600;
    public static final int MARGE_FENETRE=50; //marge à droite et à gauchede la fenetre pour que le vaisseau n'aille aux bords de la fenetre
    

    /**************Vaisseau*******************************/

    //Dimensions du vaisseau 
    public static final int LARGEUR_VAISSEAU = 39;
    public static final int HAUTEUR_VAISSEAU = 24;

    //Position intiale du vaisseau 

    public final static int X_POS_INIT_VAISSEAU = (LARGEUR_FENETRE-LARGEUR_VAISSEAU)/2; //POUR POSITIONNER LE VAISSEAU AU MILIEU DE LA FENETRE
    public final static int Y_POS_VAISSEAU = 490;

    //Unité de déplacement du vaisseau 

    public final static int DX_VAISSEAU = 10;


    //Limite déplacement vaisseau : 

    public final static int LIMITE_GAUCHE_VAISSEAU= 60;

    public final static int LIMITE_DROITE_VAISSEAU= 500;

    
    /**************ALIEN*******************************/

    //Dimension de l'alien
    public final static int LARGEUR_ALIEN = 33;

    public final static int HAUTEUR_ALIEN = 25; 

    //Paramètre de position des aliens 

    public final static int ALT_INIT_ALIEN = 120; 

    public final static  int X_POS_INIT_ALIEN = 29 + MARGE_FENETRE;

    public final static int ECART_LIGNES_ALIEN =40;

    public final static int ECART_COLONNES_ALIEN = 10;


    //Unité de déplacement de l'alien

    public final static int DX_ALIEN =5;

    public final static int DY_ALIEN= 25;


}
