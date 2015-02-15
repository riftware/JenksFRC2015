package org.usfirst.frc31.Recycle.subsystems;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

import org.usfirst.frc31.Recycle.RobotMap;
import org.usfirst.frc31.Recycle.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftAngle extends PIDSubsystem {
    AnalogPotentiometer pot1 = RobotMap.pot1;
    CANTalon talon7 = RobotMap.talon7;

    // Initialize your subsystem here
    public LiftAngle() {
    	super("LiftAngle", 1, 0, 0);
    	setAbsoluteTolerance(5);
    	getPIDController().setContinuous(false);
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	return pot1.get();
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    	talon7.pidWrite(output/1.5);
    }
    
    public void liftArm(Joystick one)
    {
    	if (one.getY() < 0)
    	{
    		if (pot1.get() < 35)
    		{
    			talon7.set(-one.getY());
    		}
    		else
    		{
    			talon7.set(0);
    		}
    	}
    	else if (one.getY() > 0)
    	{
    		if (pot1.get() > -82)
    		{
    			talon7.set(-one.getY());
    		}
    		else
    		{
    			talon7.set(0);
    		}
    	}
    }
}
