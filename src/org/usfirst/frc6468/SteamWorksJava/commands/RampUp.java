package org.usfirst.frc6468.SteamWorksJava.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Servo;
import org.usfirst.frc6468.SteamWorksJava.RobotMap;

public class RampUp extends Command {
	
    Servo leftServo = RobotMap.rampLeftServo;
    Servo rightServo = RobotMap.rampRightServo;
	
    public RampUp() {
    
    }

    @Override
	protected void execute() {
    	   rightServo.setAngle(250);
    	   leftServo.setAngle(60);
    }
    
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
