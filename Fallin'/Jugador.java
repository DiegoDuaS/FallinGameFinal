import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    MyWorld thisMundo; 
    int vidas = 3;
    public void move(){
        if (Greenfoot.isKeyDown("right")){
            move(4);
            setImage("Right.png");
        }
        if (Greenfoot.isKeyDown("left")){
            move(-4);
            setImage("Left.png");
        }  
    }
    public void take(){
        Actor Fichas = getOneIntersectingObject(Fichas.class);
        if (Fichas!= null){
            getWorld().removeObject(Fichas); 
            thisMundo.puntos ++;
        }
    }
    public void damage(){
        Actor Obstaculo = getOneIntersectingObject(Obstaculo.class);
        if (Obstaculo!= null){
            getWorld().removeObject(Obstaculo); 
            vidas--;
            thisMundo.vidas --;
        }
    }
    public void damage2(){
        Actor Obstaculo2 = getOneIntersectingObject(Obstaculo2.class);
        if (Obstaculo2!= null){
            getWorld().removeObject(Obstaculo2);
            vidas--;
            thisMundo.vidas --;
        }
    }
    public void lifeplus(){
        Actor Vida = getOneIntersectingObject(Vida.class);
        if (Vida!= null){
            getWorld().removeObject(Vida);
            if (vidas < 3){
                vidas++;
                thisMundo.vidas ++;
            }
        }
        
    }
    public void lose(){
        if (vidas == 0){
            getWorld().addObject(new GameOver(), getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
    public void act(){
        move();
        take();
        damage();
        damage2();
        lifeplus();
        lose();
    }
    
}
