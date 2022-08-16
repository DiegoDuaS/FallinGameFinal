import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    //Propiedades de Jugador
    MyWorld thisMundo; //Referencia a propiedades y métodos de MyWorld
    int vidas = 3;
    //Métodos del Jugador 
    //Movimiento del Jugador 
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
    //Aumento en el valor de puntos si el jugador toma una ficha.
    public void take(){
        Actor Fichas = getOneIntersectingObject(Fichas.class);
        if (Fichas!= null){
            getWorld().removeObject(Fichas); 
            thisMundo.puntos ++;
            GreenfootSound fischas = new GreenfootSound("fichas.mp3");
            fischas.setVolume(40);
            fischas.play();
        }
    }
    //Disminución del valor de vidas si el jugador es golpeado por un obstaculo.
    public void damage(){
        Actor Obstaculo = getOneIntersectingObject(Obstaculo.class);
        if (Obstaculo!= null){
            getWorld().removeObject(Obstaculo); 
            vidas--;
            thisMundo.vidas --;
            GreenfootSound damage = new GreenfootSound("damageFF.mp3");
            damage.setVolume(70);
            damage.play();
        }
    }
    public void damage2(){
        Actor Obstaculo2 = getOneIntersectingObject(Obstaculo2.class);
        if (Obstaculo2!= null){
            getWorld().removeObject(Obstaculo2);
            vidas--;
            thisMundo.vidas --;
            GreenfootSound damage2 = new GreenfootSound("damageFF.mp3");
            damage2.setVolume(70);
            damage2.play();
        }
    }
    //Aumento del valor de vidas si el jugador toma una vida, solo si se encuentra menor que 3.
    public void lifeplus(){
        Actor Vida = getOneIntersectingObject(Vida.class);
        if (Vida!= null){
            getWorld().removeObject(Vida);
            GreenfootSound life = new GreenfootSound("life.mp3");
            life.setVolume(70);
            life.play();
            if (vidas < 3){
                vidas++;
                thisMundo.vidas ++;
            }
        }
        
    }
    //Fin del Juego
    public void lose(){
        if (vidas == 0){
            getWorld().addObject(new GameOver(), getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
    //Realizar los métodos establecidos. 
    public void act(){
        move();
        take();
        damage();
        damage2();
        lifeplus();
        lose();
    }
    
}
