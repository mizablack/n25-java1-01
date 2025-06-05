import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MizaBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MizaBack extends Actor
{
    /**
     * Act - do whatever the MizaBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action comovede here.
        move(2);
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
    }
}
