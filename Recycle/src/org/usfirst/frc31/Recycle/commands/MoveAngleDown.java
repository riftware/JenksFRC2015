package org.usfirst.frc31.Recycle.commands;

import org.usfirst.frc31.Recycle.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveAngleDown extends Command {

    public MoveAngleDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.liftAngle);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.liftAngle.enable();
    	Robot.liftAngle.setSetpoint(-80);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.liftAngle.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.liftAngle.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.liftAngle.disable();
    }
}
