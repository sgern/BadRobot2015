package org.usfirst.frc.team1014.robot.subsystems.interfaces;


/**
 * Interface for the drive train subsystem;
 * 
 * @author Steve Popovich
 */
public interface IDriveTrain 
{
    /**
     * Drives the robot in tank drive--two sticks represent the left and right
     * sides of the robot; pushing forward on the left stick moves the left side
     * forward, pushing backwards on the right stick moves the right side of the
     * robot backwards.
     * 
     * @param left the left side joystick value (-1 to 1)
     * @param right the right joystick value (-1 to 1)
     */
    public void tankDrive(double left, double right);
    
}