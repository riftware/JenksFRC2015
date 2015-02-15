package org.usfirst.frc31.Recycle.commands;

import org.usfirst.frc31.Recycle.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftArm extends Command {

    public LiftArm() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.liftAngle);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //Robot.liftPSystem.enable();
        //Robot.liftPSystem.setSetpoint(180);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.liftAngle.liftArm(Robot.oi.joystick1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
