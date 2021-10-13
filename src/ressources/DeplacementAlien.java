package ressources;

import entities.Alien;
import entities.GroupAlien;
import game.App;
import game.Scene;

public class DeplacementAlien implements Runnable {

    private Scene scene; 
    private GroupAlien groupAliens;



    public DeplacementAlien(Scene scene){
        this.scene=  scene;
         this.groupAliens= scene.getGroupAlien();

    }


    @Override
    public void run() {
    
        while (true) {
            groupAliens.moveAlien();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getStackTrace());
            }
        }
    }

}
