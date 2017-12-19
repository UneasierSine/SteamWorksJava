package org.usfirst.frc6468.SteamWorksJava.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.XboxController;
import org.usfirst.frc6468.SteamWorksJava.Robot;
import org.usfirst.frc6468.SteamWorksJava.RobotMap;

public class RampUp extends Command {

	XboxController xBox = Robot.xbox;
	Servo leftServo = RobotMap.rampLeftServo;
	Servo rightServo = RobotMap.rampRightServo;
	
    public RampUp() {
    
    }

    @Override
	protected void initialize() {
    	if(xBox.getYButton() != false) {
    		rightServo.setAngle(250);
    		leftServo.setAngle(60);
    	}
    }
    
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
