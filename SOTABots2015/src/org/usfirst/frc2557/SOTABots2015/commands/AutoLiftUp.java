package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoLiftUp extends Command {
	private int count;
    public AutoLiftUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	count = 0;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(2.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.liftMotor.set(1);
//    	if (RobotMap.liftSensor.get()){
//    		count = count + 1;
//    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
//        return count == 2;
//    	return RobotMap.liftSensor.get() == true;
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.liftMotor.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
