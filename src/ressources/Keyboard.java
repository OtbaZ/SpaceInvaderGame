package ressources;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entities.Vaisseau;
import game.App;
import game.Scene;

public class Keyboard implements KeyListener{
    private Scene scene;
    private Vaisseau vaisseau;
    public Keyboard(Scene scene){
        super();
        this.scene = scene;
        this.vaisseau= this.scene.getVaisseau();
    }


     


    //Si on a appuyé et relaché
    @Override
    public void keyTyped(KeyEvent e) {
    }

    //si on a appuyé sur une touche
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
    
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            vaisseau.deplacementVaisseau(Constants.DX_VAISSEAU);
        }

        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            vaisseau.deplacementVaisseau(-Constants.DX_VAISSEAU);
        }

        
    }

    //si on l'a relaché 
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
