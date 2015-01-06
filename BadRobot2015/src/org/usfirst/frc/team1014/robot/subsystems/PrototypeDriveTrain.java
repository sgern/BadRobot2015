package org.usfirst.frc.team1014.robot.subsystems;

import org.usfirst.frc.team1014.robot.RobotMap;
import org.usfirst.frc.team1014.robot.subsystems.interfaces.IDriveTrain;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;


/*
 * @author Steve Popovich
 */
public class PrototypeDriveTrain extends Subsystem implements IDriveTrain 
{

	@Override
	public void tankDrive(double left, double right) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public static IDriveTrain getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
    
}

