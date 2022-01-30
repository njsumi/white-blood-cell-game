import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lining are objects at the edge of the vein.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Lining extends Actor
{
    /**
     * Act - nothing to do.
    */
    public void act() 
    {
        //moves the lining to the left to make the cell appear moving
        setLocation(getX()-1, getY());
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }  
    
    

}
