import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Nubes extends Actor
{
    int speed = 3;
    MyWorld thisMundo;
    public void act()
    {
        if(thisMundo.time > 1200){
            speed = 5;
        }
            turn(270);
            move(speed);
            turn(90);
            move(1/100);
        if(getY() == 0 ){
            getWorld().removeObject(this);
        }
        } 
    }

