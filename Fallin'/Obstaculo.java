import greenfoot.*;  
public class Obstaculo extends Actor
{
    int speed = 5/2;
    MyWorld thisMundo; 
    public void act()
    {
        if(thisMundo.time > 1200){
            speed = 9/2;
        }
        if(getX() < 299){
            move(5/2);
            turn(270);
            move(2);
            turn(90);
        if(getX() == 299){
            getWorld().removeObject(this);
        }
    }
}
}
