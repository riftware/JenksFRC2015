package org.usfirst.frc31.Recycle.subsystems;

import org.usfirst.frc31.Recycle.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CameraSideSystem extends Subsystem {
	Servo camServo2 = RobotMap.camServo2;
	double xPos = .5;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void takeJoystickButtons(Joystick one)
    {
    	if (one.getRawButton(8))
    	{
    		xPos += .05;
    		System.out.println(camServo2.get());
    	}
    	else if (one.getRawButton(9))
    	{
    		xPos -= .05;
    		System.out.println(camServo2.get());
    	}
    	
    	if (xPos > 1)
    	{
    		xPos = 1;
    	}
    	else if (xPos < 0)
    	{
    		xPos = 0;
    	}
    	
    	camServo2.set(xPos);
    }
}

