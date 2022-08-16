import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    public static final GreenfootSound cancion = new GreenfootSound("musiquita3.mp3");
    public Start()
    {    
        super(300, 500, 1); 
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(400) == 1)
        {
            addObject(new Nubes(), Greenfoot.getRandomNumber(300),500);
        }
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
        }
        
    }
    //Correr la música de fondo.
    public void started(){
        super.started();
        cancion.setVolume(40);
        cancion.playLoop();
    }
}


