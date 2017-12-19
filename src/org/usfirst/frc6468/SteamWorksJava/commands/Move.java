package org.usfirst.frc6468.SteamWorksJava.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.XboxController;
import org.usfirst.frc6468.SteamWorksJava.Robot;

public class Move extends Command{
	
	XboxController xBox = Robot.xbox;
	RobotDrive driver = Robot.driveBase.robotDrive4;
	GenericHID.Hand hand;
	
	public Move(){
		
	}
	
	@Override
	protected void initialize() {
		double counter = 1;
		double movement;
		//executes a pattern of moving forward using a cubic function f(x)=(yAxis)(increment)^3
		while(xBox.getY(Hand.kLeft) != 0) {
			movement = xBox.getY(Hand.kLeft);
			movement*=(counter*counter*counter);
			driver.tankDrive(movement, movement);
			counter++;
		}
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}