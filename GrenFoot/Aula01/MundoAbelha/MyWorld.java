import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,62,346);
        aranha.setLocation(98,326);
        aranha.setLocation(101,326);
        aranha.setLocation(95,325);
        aranha.setLocation(92,340);
        aranha.setLocation(88,330);
        aranha.setLocation(87,338);
        Abelha abelha = new Abelha();
        addObject(abelha,521,90);
        abelha.setLocation(528,88);
        abelha.setLocation(528,91);
        abelha.setLocation(505,88);
        Mosca mosca = new Mosca();
        addObject(mosca,88,38);
        aranha.setLocation(28,17);
        aranha.setLocation(28,17);
        mosca.setLocation(33,396);
        mosca.setLocation(33,396);
        mosca.setLocation(24,336);
        mosca.setLocation(24,335);
        aranha.setLocation(27,94);
        aranha.setLocation(27,91);
        abelha.setLocation(23,208);
        abelha.setLocation(23,208);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,387,99);
        mosca.setLocation(401,199);
        mosca.setLocation(401,199);
        mosca.setLocation(386,210);
        mosca.setLocation(385,210);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,385,332);
        mosca.setLocation(395,211);
        mosca.setLocation(380,211);
        mosca.setLocation(392,213);
        mosca.setLocation(392,213);
        mosca.setLocation(392,213);
        mosca3.setLocation(394,324);
        mosca3.setLocation(389,330);
        mosca2.setLocation(391,95);
        mosca2.setLocation(389,90);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,394,152);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,397,271);
        mosca5.setLocation(383,278);
        mosca5.setLocation(393,273);
        removeObject(mosca);
    }
}
