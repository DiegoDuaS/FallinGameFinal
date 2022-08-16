import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Nubes extends Actor
{
    //Propiedades de Nubes
    int speed = 3;
    MyWorld thisMundo;//Referencia a propiedades y métodos de MyWorld
    public void act()
    {
        //Modificación de Speed después de un tiempo establecido.
        if(thisMundo.time > 1200){
            speed = 4;
        }
        //Hacer que las nubes se muevan de abajo hacia arriba, y desaparezcan en caso lleguen y = 0.
            turn(270);
            move(speed);
            turn(90);
            move(1/100);
        if(getY() == 0 ){
            getWorld().removeObject(this);
        }
        } 
    }

