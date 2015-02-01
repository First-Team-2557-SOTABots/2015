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
    public static Solenoid Shrek_is_love_Shrek_is_life;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Gyro locationGyro;
    public static BuiltInAccelerometer locationAccelerometer2 ;
    public static Servo servoLeft;
    public static Servo servoRight;
    public static AnalogInput rangeFrontLeft;
    public static AnalogInput rangeFrontRight;
    public static AnalogInput rangeBack;
    public static DigitalOutput limitswitch;
  //public static AnalogInput rangeFrontRight;
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
//Range Finders
      rangeFrontLeft = new AnalogInput(1); 
      rangeFrontRight = new AnalogInput(2);
      rangeBack = new AnalogInput(3);
      
//Servos for the RangeFinders
      servoRight = new Servo(9);
      servoLeft = new Servo(8);
      
      //Limit Switch
      limitswitch = new DigitalOutput(3);
      
      //Gyro Ports & Sensitivity
      locationGyro = new Gyro(0);
      locationGyro.reset();
      LiveWindow.addSensor("Location", "Gyro", locationGyro);
//      locationGyro.setSensitivity(0.0007);
      
     locationAccelerometer2 = new BuiltInAccelerometer();
//Drive Train Sensitivity, Max Output, and Inversions
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
