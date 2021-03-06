// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc31.Recycle.subsystems;

import org.usfirst.frc31.Recycle.RobotMap;
import org.usfirst.frc31.Recycle.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class PullSystem extends Subsystem {
	Solenoid pSolenoid1 = RobotMap.pSolenoid1;
    
    public void initDefaultCommand() {
    	
    }
    
    public void usePneumatics(Joystick one)
    {
    	if (one.getRawButton(4))
    	{
    		pSolenoid1.set(true);
    		System.out.println("solenoid on");
    	}
    	else
    	{
    		pSolenoid1.set(false);
    		System.out.println("solenoid off");
    	}
    }
    
    public void push()
    {
    	pSolenoid1.set(true);
    }
    
    public void pull()
    {
    	pSolenoid1.set(false);
    }
}

