import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Antibody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Antibody extends Actor
{
    /**
     * Act - do whatever the Antibody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        
        if (isTouching(Virus.class))
        {
            removeTouching(Virus.class);
            Bloodstream bloodstream = (Bloodstream)getWorld();
            bloodstream.addScore(50);
        }
        
        if (getX() == 700)
        {
            getWorld().removeObject(this);
        }
    }
}
