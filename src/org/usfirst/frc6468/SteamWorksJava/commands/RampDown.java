package org.usfirst.frc6468.SteamWorksJava.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.XboxController;
import org.usfirst.frc6468.SteamWorksJava.Robot;
import org.usfirst.frc6468.SteamWorksJava.RobotMap;

public class RampDown extends Command{
	
	Servo leftServo = RobotMap.rampLeftServo;
	Servo rightServo = RobotMap.rampRightServo;

	public RampDown(){
		
	}
	
	@Override
	protected void execute() {
		rightServo.setAngle(130);
		leftServo.setAngle(170);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}
