package org.usfirst.frc6468.SteamWorksJava.subsystems;

import org.usfirst.frc6468.SteamWorksJava.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem {

	private final SpeedController frontLeftMotor = RobotMap.driveBaseFrontLeftMotor;
    private final SpeedController frontRightMotor = RobotMap.driveBaseFrontRightMotor;
    private final SpeedController backLeftMotor = RobotMap.driveBaseBackLeftMotor;
    private final SpeedController backRightMotor = RobotMap.driveBaseBackRightMotor;
    public final RobotDrive robotDrive4 = RobotMap.driveBaseRobotDrive4;

    public void initDefaultCommand() {
    	
    }
}

