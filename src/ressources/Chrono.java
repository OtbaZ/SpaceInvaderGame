package ressources;

import game.App;

public class Chrono implements Runnable{

    private final int PAUSE = 5 ;  //temps de pause entre 2 boucles de 5 milisecondes
    public static int compteTours=0;
    @Override
    public void run() {
        while(true){
            App.scene.repaint();
            try{
                Thread.sleep(PAUSE);
            }catch(InterruptedException e){

            }
        }        
    }
    
}
