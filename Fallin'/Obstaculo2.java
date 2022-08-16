import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstaculo2 extends Actor
{
    //Propiedades de Obsatculo2
    int speed = 5/2;
    MyWorld thisMundo; //Referencia a propiedades y métodos de MyWorld
    public void act()
    {
        //Modificación de Speed después de un tiempo establecido.
        if(thisMundo.time > 1200){
            speed = 7/2;
        }
        //Movimiento del obstaculo de derecha a izquierda y remover el objeto en caso llegue X = 0.
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
