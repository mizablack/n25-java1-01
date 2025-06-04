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
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,91,97);
        Mosca mosca = new Mosca();
        addObject(mosca,325,155);
        Abelha abelha = new Abelha();
        addObject(abelha,93,281);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,508,36);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,512,265);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,285,348);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,515,156);
        aranha.setLocation(35,40);
        abelha.setLocation(40,147);
        Mosca mosca6 = new Mosca();
        addObject(mosca6,257,215);
        Mosca mosca7 = new Mosca();
        addObject(mosca7,212,279);
        Mosca mosca8 = new Mosca();
        addObject(mosca8,432,330);
        Mosca mosca9 = new Mosca();
        addObject(mosca9,564,331);
        removeObject(mosca8);
        removeObject(mosca6);
        removeObject(mosca2);
        removeObject(mosca9);
        mosca.setLocation(291,157);
    }
}
