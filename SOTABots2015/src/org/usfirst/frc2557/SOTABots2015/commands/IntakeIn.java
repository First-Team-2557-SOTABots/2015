package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Change to just Intake.
 */
public class IntakeIn extends Command {
	
//	boolean done;
//	double wait = RobotMap.intakeWaitTime;
//	double targetTime;

    public IntakeIn() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.manipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	done = false;
//    	Robot.manipulator.intakeOut();
    	//targetTime = RobotMap.time.get() + wait;
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	if(RobotMap.time.get() >= targetTime){
//    		done = true;
//    	}
//    	else{
//    		done = false;
//    	}
    	RobotMap.intakeMotors.set(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       return false; //RobotMap.toteStop.get() || Robot.oi.XboxController1.getRawButton(6);
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.intakeMotors.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
