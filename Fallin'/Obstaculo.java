import greenfoot.*;  
public class Obstaculo extends Actor
{
    //Propiedades de Obsatculo
    int speed = 5/2;
    MyWorld thisMundo; //Referencia a propiedades y métodos de MyWorld
    public void act()
    {
        //Modificación de Speed después de un tiempo establecido.
        if(thisMundo.time > 1200){
            speed = 7/2;
        }
        //Movimiento del obstaculo de izquierda a derecha y remover el objeto en caso llegue X = 0.
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
