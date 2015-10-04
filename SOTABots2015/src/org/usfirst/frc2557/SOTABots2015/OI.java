 //Jeebus
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

import org.usfirst.frc2557.SOTABots2015.commands.*;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    public Joystick gamepad1;
    public Joystick gamepad2;
    
    //Gamepad 1:
    public JoystickButton gp1A;
    public JoystickButton gp1B;
    public JoystickButton gp1X;
    public JoystickButton gp1Y;
    public JoystickButton gp1LB;
    public JoystickButton gp1RB;
    public JoystickButton gp1BACK;
    public JoystickButton gp1START;
    public JoystickButton gp1LJB;
    public JoystickButton gp1RJB;
    
    //Gamepad 2:
    public JoystickButton gp2A;
    public JoystickButton gp2B;
    public JoystickButton gp2X;
    public JoystickButton gp2Y;
    public JoystickButton gp2LB;
    public JoystickButton gp2RB;
    public JoystickButton gp2BACK;
    public JoystickButton gp2START;
    public JoystickButton gp2LJB;
    public JoystickButton gp2RJB;

    public OI() {
        gamepad1 = new Joystick(0);
        gamepad2 = new Joystick(1);
        //XBox360 Controller1 Buttons:
        gp1A = new JoystickButton(gamepad1, 1);       
        gp1B = new JoystickButton(gamepad1, 2);
        gp1X = new JoystickButton(gamepad1, 3);
        gp1Y = new JoystickButton(gamepad1, 4);
        gp1LB = new JoystickButton(gamepad1, 5);
        gp1RB = new JoystickButton(gamepad1, 6);
        gp1BACK = new JoystickButton(gamepad1, 7);
        gp1START = new JoystickButton(gamepad1, 8);
        gp1LJB = new JoystickButton(gamepad1, 9);
        gp1RJB = new JoystickButton(gamepad1, 10);
        
      //XBox360 Controller2 Buttons:
        gp2A = new JoystickButton(gamepad2, 1);       
        gp2B = new JoystickButton(gamepad2, 2);
        gp2X = new JoystickButton(gamepad2, 3);
        gp2Y = new JoystickButton(gamepad2, 4);
        gp2LB = new JoystickButton(gamepad2, 5);
        gp2RB = new JoystickButton(gamepad2, 6);
        gp2BACK = new JoystickButton(gamepad2, 7);
        gp2START = new JoystickButton(gamepad2, 8);
        gp2LJB = new JoystickButton(gamepad2, 9);
        gp2RJB = new JoystickButton(gamepad2, 10);

        //Button Commands
        //Drive Controller
        //Xbox1LB.whenPressed(new AutoIntake()); //Testing
        gp1A.whenPressed(new IntakeArm());
        gp1Y.whenPressed(new Eject());
//        
//        //Operator Controller
        gp2A.whenPressed(new Grab());
//        gp2Y.whenPressed(new BackHook());
//        gp2B.whenPressed(new RightHook());
//        gp2X.whenPressed(new LeftHook());
        gp2BACK.whenPressed(new AutoInitialize());
        //Left Joystick controls lift
        //Right Joystick controls intake motors
        
        //All Control
//        gp1A.whenPressed(new IntakeArm());
//        gp1Y.whenPressed(new BackHook());
//        gp1B.whenPressed(new RightHook());
//        gp1X.whenPressed(new LeftHook());
//        gp1BACK.whenPressed(new Eject());
//        gp1START.whenPressed(new Grab());
        /*Xbox1A.whenPressed(new IntakeArm());
         *Xbox1Y.whenPressed(new Eject());
         *Xbox1B.whenPressed(new Grab()); 
         *
         * 
         * 
         * 
         * 
         * 
         * 
         * */
        
        
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new Autonomous());

       
        
        
    }
    
    public Joystick getGamepad1() {
    	return gamepad1;
    }
    public Joystick getGamepad2() {
    	return gamepad2;
    }

}
