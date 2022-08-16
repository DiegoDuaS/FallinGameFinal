// Diego Duarte 22075
// 15 de agosto, 2022
// Objetivo: Juego Fallin' Greenfoot
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    //Propiedades de World 
    public static int puntos = 0;
    public static int vidas = 3; 
    public static int time = 0;
    private static final GreenfootSound cancion = new GreenfootSound("musiquita3.mp3");
    Start inicio; 
    
    //Dandole las medidas a la pantalla principal
    public MyWorld()
    {    
        super(300, 500, 1); 
        prepare();
    }
    
    //Apareciendo el avatar del jugador antes de inciar al juego, además se reinciaron los valores de tiempo, vidas y puntos.
    private void prepare()
    {
        Jugador Jugador1 = new Jugador();
        addObject(Jugador1,150,200);
        vidas = 3;
        puntos = 0;
        time = 0;

    }

    //Dandole Instrucciones de que aparecer mientras se corre el juego. 
    public void act()
    {
        time++;
        //Counter de vidas y puntos.
        showText("Puntos:" + puntos, 50, 25);
        showText("Vidas: " + vidas, 200, 25);
        //Hacer que los obstaculos aparezcan de una forma aleatoria 
        if(Greenfoot.getRandomNumber(250) == 1)
        {
            addObject(new Obstaculo(),0, Greenfoot.getRandomNumber(100)+ 250);
        }
        if(Greenfoot.getRandomNumber(250) == 1)
        {
            addObject(new Obstaculo2(),299, Greenfoot.getRandomNumber(100)+ 250);
        }
        //Hacer que las Fichas aparezcan de una forma aleatoria
        if(Greenfoot.getRandomNumber(200) == 1)
        {
            addObject(new Fichas(), Greenfoot.getRandomNumber(300),500);
        }
        //Hacer que las vidas aparezcan de una forma aleatoria
        if(Greenfoot.getRandomNumber(700) == 1)
        {
            addObject(new Vida(), Greenfoot.getRandomNumber(300),500);
        }
        //Hacer que las nubes aparezcan de una forma aleatoria
        if(Greenfoot.getRandomNumber(100) == 1)
        {
            addObject(new Nubes(), Greenfoot.getRandomNumber(300),500);
        }
    }
    //Correr la música de fondo.
    public void started(){
        super.started();
        cancion.setVolume(30);
        cancion.playLoop();
    }
    //Parar la música de fondo en caso de que el juego pare. 
    public void stopped(){
        super.stopped();
        inicio.cancion.pause();
    }
}
