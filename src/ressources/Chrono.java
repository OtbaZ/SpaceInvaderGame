package ressources;

import game.App;
import game.Scene;

public class Chrono implements Runnable {

    private final int PAUSE = 5; // temps de pause entre 2 boucles de 5 milisecondes
    public static int compteTours = 0;

    private Scene scene;

    public Chrono(Scene scene){
        this.scene = scene;
    }


    @Override
    public void run() {
        while (true) {
            this.scene.repaint();
            try {
                Thread.sleep(PAUSE);
            } catch (InterruptedException e) {

            }
        }
    }

}
