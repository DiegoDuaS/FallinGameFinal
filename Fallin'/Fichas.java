import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fichas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fichas extends Actor
{
    int speed = 2;
    MyWorld thisMundo; 
    public void act(){
        if(thisMundo.time > 1200){
            speed = 4;
        }
        if(getY() > 1 ){
            turn(270);
            move(speed);
            turn(90);
            move(1/100);
        if(getY() == 1 || getY() == 0){
            getWorld().removeObject(this);
        }
        }
    }
}
