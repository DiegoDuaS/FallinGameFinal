import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    public Vida(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    public void act()
    {
        if(getY() > 1 ){
            turn(270);
            move(2);
            turn(90);
            move(1/100);
        if(getY() == 1 ){
            getWorld().removeObject(this);
        }
        }
    }
}
