// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2557.SOTABots2015;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainFrontLeft;
    public static SpeedController driveTrainFrontRight;
    public static SpeedController driveTrainBackLeft;
    public static SpeedController driveTrainBackRight;
    public static RobotDrive driveTrainRobotDrive41;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Gyro locationGyro;
    public static AnalogAccelerometer locationAccelerometer;
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	driveTrainFrontLeft = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "FrontLeft", (Talon) driveTrainFrontLeft);
        
        driveTrainFrontRight = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "FrontRight", (Talon) driveTrainFrontRight);
        
        driveTrainBackLeft = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "BackLeft", (Talon) driveTrainBackLeft);
        
        driveTrainBackRight = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "BackRight", (Talon) driveTrainBackRight);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainFrontLeft, driveTrainBackLeft,
        		driveTrainFrontRight, driveTrainBackRight);
        
        locationGyro = new Gyro(0);
        LiveWindow.addSensor("Location", "Gyro", locationGyro);
        locationGyro.setSensitivity(0.007);
        locationAccelerometer = new AnalogAccelerometer(1);
        LiveWindow.addSensor("Location", "Accelerometer", locationAccelerometer);
        locationAccelerometer.setSensitivity(0.0);
        locationAccelerometer.setZero(2.5);
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
