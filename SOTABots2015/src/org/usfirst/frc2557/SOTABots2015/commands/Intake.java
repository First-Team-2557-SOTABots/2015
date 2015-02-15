package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake extends Command {

    public Intake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.manipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Math.abs(Robot.oi.XboxController2.getRawAxis(1)) > .3){
    		Robot.manipulator.intake(Robot.oi.XboxController2.getRawAxis(1));
    	}
    	else{
    		Robot.manipulator.intake(0.0);
    	}
    	
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