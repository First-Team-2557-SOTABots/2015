package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    
    public  Autonomous() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	//Works
//    	addSequential(new AutoInitialize());
    	addSequential(new AutoDrive(0, -.3, 0, 280));
    	addSequential(new AutoBackHook());
     	addSequential(new AutoDrive(0, .3, -.03, 1300));
    	addSequential(new AutoGrabClose()); 
//    	addSequential(new AutoLiftUp()); //Cannot be completed as of yet
    	addSequential(new AutoDrive(0,-.5,0,100));
    	addSequential(new AutoDrive(0, 0, -.5, 1850));
    	addSequential(new AutoDrive(0, .7, -.18, 8050));
//    	addSequential(new AutoDrive(0, .65, -.03, 200));//Drive Forward
    	addSequential(new AutoGrabOpen());
    	addSequential(new AutoEjectOut());
//    	addSequential(new Eject());
    	addParallel(new AutoDrive(0, -.6, 0, 200));
    	addSequential(new AutoEjectIn());//Drive backwards
    	
    	
    	
    	
//    	addSequential(new AutoInitialize());
//    	addSequential(new AutoDrive(0, 0, 0, 0));
//    	addSequential(new BackHook());
//    	addSequential(new AutoDrive(0, -.3, 0, 60));
//     	addSequential(new AutoDrive(0, .3, -.03, 1200));
//     	addSequential(new AutoDriveUntil(0,.5,0));
//     	addParallel(new IntakeArm());
//    	addSequential(new AutoIntake());
//    	addSequential(new IntakeArm()); //Works to this point
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab()); 
//    	addSequential(new AutoLiftUp()); //Cannot be completed as of yet
//    	addSequential(new AutoDrive(0,-.5,0,100));
//    	addSequential(new AutoDrive(0, 0, -.5, 1850));
//    	addSequential(new AutoDrive(0, 0, .5, 1850));
//    	addSequential(new AutoDrive(-1, 0, 0, 1000));
//    	addSequential(new RightHook());
//    	addSequential(new AutoDrive(0, 0, .5, 1850));
//    	addSequential(new AutoDrive(0,.5,0,800)); //Drive Forwards
//    	addSequential(new IntakeArm());
//    	addSequential(new AutoIntake());
//    	addSequential(new IntakeArm());
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
    	//    	addSequential(new AutoLiftUp()); //Check
//    	addSequential(new AutoDrive(0, -.2, 0, 800)); //Backwards
//    	addSequential(new AutoDrive(0, 0, -.2, 1500)); //Rotate left
//    	addSequential(new AutoDrive(0, 0, -.2, 1500)); //Rotate left
//    	addSequential(new IntakeArm());
//    	addSequential(new AutoIntake());
//    	addSequential(new IntakeArm());
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
//    	addSequential(new AutoDrive());
//    	addSequential(new LeftHook());
//    	addSequential(new AutoDrive(0, .65, -.22, 5050));
//    	addSequential(new AutoDrive(0, .65, -.03, 200));//Drive Forward
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
//    	addSequential(new Eject());
//    	addSequential(new Eject());
//    	addSequential(new AutoDrive(0, -.6, 0, 200));
//    	addSequential(new Eject());//Drive backwards

    }
}
