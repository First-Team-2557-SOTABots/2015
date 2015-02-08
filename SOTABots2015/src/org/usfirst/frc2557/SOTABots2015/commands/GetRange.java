package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GetRange extends Command {

    public GetRange() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires(Robot.rangeSub);
    	requires(Robot.dashboard);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {               
//    	double rangeLeft 	= Robot.rangeSub.getRangeFrontLeft();
//    	double rangeRight 	= Robot.rangeSub.getRangeFrontRight();
//    	double rangeCenter = Robot.rangeSub.getRangeBack();
//    	SmartDashboard.putNumber("The Front Left Range Finder is seeing", rangeLeft/.009765);
//    	SmartDashboard.putNumber("The Front Right Range Finder is seeing", rangeRight/.009765);
//    	SmartDashboard.putNumber("The Back Range Finder is seeing",rangeCenter/.009765);
    	Robot.dashboard.smartDashboardOutputs();
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
