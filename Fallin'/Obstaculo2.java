import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstaculo2 extends Actor
{
    int speed = 5/2;
    MyWorld thisMundo; 
    public void act()
    {
        if(thisMundo.time > 1200){
            speed = 9/2;
        }
        if(getX() > 0){
            move(-(5/2));
            turn(90);
            move(-2);
            turn(270);
        if(getX() == 0){
            getWorld().removeObject(this);
        }
    }
}
}
