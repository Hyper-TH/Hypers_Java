/*
    ENUM CLASS
    
    Classes for constant variables

Last edit: 17 / 05 / 2022
*/
package classes_and_objects.src.space;

public enum SpaceShipType 
{
    ROUND("wobble wobble"),
    PYRAMID("woaaaam"),
    COOL("I'm cool"),
    FAST("I'm fast"),
    SLOW("I'm slow");

    private String soundWhenFlying = "No sound";

    private SpaceShipType(String soundWhenFlying) 
    {
        this.soundWhenFlying = soundWhenFlying;
    }

    public String getSoundWhenFlying() 
    {
        return soundWhenFlying;
    }

    public void setSoundWhenFlying(String soundWhenFlying) 
    {
        this.soundWhenFlying = soundWhenFlying;
    }

} // end enum SpaceShipType