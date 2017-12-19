package org.usfirst.frc6468.SteamWorksJava.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.XboxController;
import org.usfirst.frc6468.SteamWorksJava.Robot;

public class Turn extends Command{
	
	XboxController xBox = Robot.xbox;
	RobotDrive driver = Robot.driveBase.robotDrive4;
	GenericHID.Hand hand;
	
	public Turn(){
		
	}
	
	@Override
	protected void initialize() {
		if(xBox.getX(Hand.kRight) > 0) {
			driver.tankDrive(-0.5,.5);
		}
		if(xBox.getX(Hand.kRight) < 0) {
			driver.tankDrive(.5,-0.5);
		}
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}