package org.usfirst.frc31.Recycle.subsystems;

import org.usfirst.frc31.Recycle.RobotMap;
import org.usfirst.frc31.Recycle.commands.LiftArm;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class LiftPSystem extends PIDSubsystem {

	CANTalon talon7 = RobotMap.talon7;
	AnalogPotentiometer pot1 = RobotMap.pot1;
	
    // Initialize your subsystem here
    public LiftPSystem() {
    	super("LiftPSystem", 1, 0, 0);
    	setAbsoluteTolerance(10);
    	getPIDController().setContinuous(false);
    	setSetpoint(50);
    	enable();
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new LiftArm());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	return pot1.pidGet();
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    	talon7.pidWrite(output);
    	System.out.println(pot1.pidGet());
    }
}
