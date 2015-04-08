import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class RangeCorrection2 extends Command {
	
	private double lowPoint;
	private double lowPointInches; double firstLength;
	private double secondLength;
	private double length;
	private double width;
	private double lowPointAngle;
	private double inchesFront;
	private double inchesLeftBack;
	private double inchesRightBack;
	private double minSweepAngle;
	private double maxSweepAngle;
	
	private double hitInches;
	private double hitAngle;
	public boolean inRange;
	public double noHitInches;
	public double noHitAngle;
	public boolean notDone;
	public double x;
	public double z;
	public boolean widthIgnore;
	public boolean lengthIgnore;
	public double binLength;
	public boolean binIgnore;
	public boolean ig;
	public double p;
	public double firstWidth;
	public double secondWidth;
	public boolean isIncrementing;
	public double servo;
	public int a;
	public int b;
	double sweepAngle = 0;
    public RangeCorrection2(){ //boolean ig, double p){
    	//this.ig = ig;
    	//this.p = p;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);  
    }
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    

    // Called just before this Command runs the first time
    protected void initialize() {
    		minSweepAngle = 68;
    		maxSweepAngle = 112;
    		widthIgnore = false;
    		lengthIgnore = false;
    		binIgnore = false;
    		isIncrementing = true;
    		// This cast may not work properly. Check during testing.
    		a = (int) (RobotMap.servoCenter.getAngle() - 2);
    		b = (int) RobotMap.servoCenter.getAngle();
    
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	/*sweepAngle= RobotMap.servoCenter.getAngle();
    	
    	if (isIncrementing == true) {
    		sweepAngle += 2;
    	}
    	else {
    		sweepAngle -= 2;
    	}
    	if (sweepAngle >= maxSweepAngle) {
    		isIncrementing = false;
    	}
    	else if (sweepAngle <= minSweepAngle) {
    		isIncrementing = true;
    	}
    	RobotMap.servoCenter.setAngle(sweepAngle);
    	SmartDashboard.putNumber("sweepAngle", sweepAngle);*/
    	
    	
    	
 

    	notDone = true;
   
    	while(notDone){
    	
    		/*lowPoint = 200;
    		noHitAngle = maxSweepAngle;
    		inRange = false;
    		sweepAngle = minSweepAngle;
    	while(sweepAngle <= maxSweepAngle){
    		RobotMap.servoCenter.setAngle(sweepAngle);
    		inchesFront = RobotMap.rangeCenter.getVoltage()/.00765;
    		if(inchesFront < 40){
    			hitInches = inchesFront;
    			hitAngle = sweepAngle;
    			inRange = true;
    			if((Math.cos(hitAngle) / hitInches) < lowPoint){
    				lowPoint = (Math.cos(hitAngle) / hitInches);
    				lowPointAngle = sweepAngle;
    				lowPointInches = hitInches;*/
    			}
    		//else if(inRange == true){
    			//noHitInches = inchesFront;
    			//noHitAngle = sweepAngle;
    			//inRange = false;
    		//}
    	
    			if(RobotMap.rangeCenter.getVoltage() / .00765 > 40){ 
    					inRange = false;
    			}
    			else if(RobotMap.rangeCenter.getVoltage() / .00765 <= 40){
    					inRange = true;
    			}
    			sweepAngle= RobotMap.servoCenter.getAngle();	
    			
    		if(sweepAngle >= maxSweepAngle){
    			isIncrementing = false;
    		}
    		else if(sweepAngle <= minSweepAngle){
    			isIncrementing = true;
    		}
    		if(isIncrementing == true){
    			sweepAngle += 2;
    		}
    		else if(isIncrementing == false){
    			sweepAngle -= 2;
    		}
    		RobotMap.servoCenter.setAngle(sweepAngle);
    		
    		
    

  
    
    		
    		if(inRange == true){
    			hitInches = RobotMap.rangeCenter.getVoltage() / .00765;
    			hitAngle = RobotMap.servoCenter.getAngle();
    		}
    		else{
    			noHitInches = RobotMap.rangeCenter.getVoltage() / .00765;
    			noHitAngle = RobotMap.servoCenter.getAngle();
    			}
    		if(RobotMap.rfDetails[a] > RobotMap.rfDetails[b]){
    			lowPointInches = RobotMap.rangeCenter.getVoltage() / .00765;
    			lowPointAngle = RobotMap.servoCenter.getAngle();
    		}
    		
    			

    		if(inRange == true){
    		if(noHitInches > 0 || noHitInches < 0){
    		// Find length
    		firstLength = Math.pow(Math.cos((hitAngle-90) / hitInches) - Math.cos((lowPointAngle-90) / lowPointInches), 2);
    		secondLength = Math.pow(Math.sin((hitAngle-90) / hitInches) - Math.sin((lowPointAngle-90) / lowPointInches), 2);
    		length = Math.sqrt(firstLength + secondLength);
    		firstWidth = Math.pow(Math.cos((lowPointAngle-90) / lowPointInches) - Math.cos((noHitAngle-90) / noHitInches), 2);
    		secondWidth = Math.pow(Math.sin((lowPointAngle-90) / lowPointInches) - Math.sin((noHitAngle-90) / noHitInches), 2);
    		width = Math.sqrt(firstWidth + secondWidth);
    		

    
    		}
   


    		
    		
    		if(width < 17 || width > 21){
    			widthIgnore = true;
    		}
    		else if((secondLength + firstWidth) < 10 || (secondLength + firstWidth) > 14){
    			binIgnore = true;
    		}
    		if(hitAngle - noHitAngle < 5){
    			widthIgnore = true;
    		}
    		if(RobotMap.rangeCenter.getVoltage() / 0.00765 > 150){
    			
    		}
    			

    			
    	    if(!widthIgnore && noHitInches - lowPointInches >= 2){
    	    	z = 1;
    	    }
    	    else{
    	    	z = -1;
    	    }
    	    if((hitAngle + noHitAngle) / 2 > 2){
    	    	x = 1;
    	    	// SHOULD MOVE RIGHT
    	    }
    	    else if((hitAngle + noHitAngle) / 2 < -2){
    	    	x = -1;
    	    	// SHOULD MOVE LEFT
    	    }
        	
    	    	
    	    if ((hitAngle + noHitAngle) / 2 < -2){
        	RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(1, 0, 0, 0);
        	}
        	if ((hitAngle + noHitAngle) / 2 > 2){
        		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(-1, 0, 0, 0);
        	}
    RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(x,0,z,0);
        	
        	if(((Math.abs(hitAngle + noHitAngle) / 2) < 2) && (Math.abs(hitInches - noHitInches) < 2)){

        		while(!RobotMap.toteStop.get()){
        		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0,1,0,0);
        		}
        		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0,0,0,0);
        		//while(!ig){
        		//RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0, 0, p, 0);
        	//}
        		//if(ig){
        			RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0, 1, 0, 0);
        		//}
        		if(RobotMap.liftLevel == 0){
        			if(RobotMap.rangeCenter.getVoltage() / .00765 < 7){
        			RobotMap.intakeSol.set(DoubleSolenoid.Value.kForward);
        			while(!RobotMap.toteStop.get() && RobotMap.intakeSol.get() == DoubleSolenoid.Value.kForward){
            			RobotMap.intakeMotors.set(1);
        			}
        			if(RobotMap.toteStop.get()){
        				RobotMap.grab.set(DoubleSolenoid.Value.kForward);
        			}
        		while(RobotMap.liftLevel < 1){
        		RobotMap.liftMotor.set(1);
        		}
        		RobotMap.intakeMotors.set(0);
        		RobotMap.intakeSol.set(DoubleSolenoid.Value.kReverse);
   }
        			else{
        				if(RobotMap.rangeCenter.getVoltage() / .00765 < 7){
        			
        				RobotMap.intakeSol.set(DoubleSolenoid.Value.kForward);
            			while(!RobotMap.toteStop.get() && RobotMap.intakeSol.get() == DoubleSolenoid.Value.kForward){
                			RobotMap.intakeMotors.set(1);
            			}
            			if(RobotMap.toteStop.get()){
            				RobotMap.time.reset();
            				while(RobotMap.time.get() < 0.5){
            					RobotMap.liftMotor.set(-1);
            				}
            				RobotMap.grab.set(DoubleSolenoid.Value.kReverse);
            				while(RobotMap.liftLevel > 0){
            					RobotMap.liftMotor.set(-1);
            				}
            				RobotMap.grab.set(DoubleSolenoid.Value.kForward);
            				
            				while(RobotMap.liftLevel < 1){
            	        		RobotMap.liftMotor.set(1);
            	        		}
            	        		RobotMap.intakeMotors.set(0);
            	        		RobotMap.intakeSol.set(DoubleSolenoid.Value.kReverse);
            			}
            			}
            					
            				}
            				
            				
            			}
            			}
        				
        				
        		notDone = false;
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
