import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public static int puntos = 0;
    public static int vidas = 3; 
    public static int time = 0;
    private static final GreenfootSound cancion = new GreenfootSound("musiquita.mp3");
    public MyWorld()
    {    
        super(300, 500, 1); 
        prepare();
    }
    
    
    private void prepare()
    {
        Jugador Jugador1 = new Jugador();
        addObject(Jugador1,150,200);
        vidas = 3;
        puntos = 0;
        time = 0;

    }

    public void act()
    {
        time++;
        showText("Puntos:" + puntos, 50, 25);
        showText("Vidas: " + vidas, 200, 25);
        showText("" + time, 150,150);
        if(Greenfoot.getRandomNumber(250) == 1)
        {
            addObject(new Obstaculo(),0, Greenfoot.getRandomNumber(100)+ 250);
        }
        if(Greenfoot.getRandomNumber(250) == 1)
        {
            addObject(new Obstaculo2(),299, Greenfoot.getRandomNumber(100)+ 250);
        }
        if(Greenfoot.getRandomNumber(200) == 1)
        {
            addObject(new Fichas(), Greenfoot.getRandomNumber(300),500);
        }
        if(Greenfoot.getRandomNumber(700) == 1)
        {
            addObject(new Vida(), Greenfoot.getRandomNumber(300),500);
        }
        if(Greenfoot.getRandomNumber(100) == 1)
        {
            addObject(new Nubes(), Greenfoot.getRandomNumber(300),500);
        }
    }
    public void started(){
        super.started();
        cancion.playLoop();
    }
    public void stopped(){
        super.stopped();
        cancion.pause();
    }
}
