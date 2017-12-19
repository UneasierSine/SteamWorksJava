package org.usfirst.frc6468.SteamWorksJava;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
    public static SpeedController driveBaseFrontLeftMotor;
    public static SpeedController driveBaseFrontRightMotor;
    public static SpeedController driveBaseBackLeftMotor;
    public static SpeedController driveBaseBackRightMotor;
    public static RobotDrive driveBaseRobotDrive4;
    public static Servo rampLeftServo;
    public static Servo rampRightServo;

    public static void init() {
        driveBaseFrontLeftMotor = new Spark(0);
        LiveWindow.addActuator("Drive Base", "Front Left Motor", (Spark) driveBaseFrontLeftMotor);
        
        driveBaseFrontRightMotor = new Spark(1);
        LiveWindow.addActuator("Drive Base", "Front Right Motor", (Spark) driveBaseFrontRightMotor);
        
        driveBaseBackLeftMotor = new Spark(2);
        LiveWindow.addActuator("Drive Base", "Back Left Motor", (Spark) driveBaseBackLeftMotor);
        
        driveBaseBackRightMotor = new Spark(3);
        LiveWindow.addActuator("Drive Base", "Back Right Motor", (Spark) driveBaseBackRightMotor);
        
        driveBaseRobotDrive4 = new RobotDrive(driveBaseFrontLeftMotor, driveBaseFrontRightMotor,
              driveBaseBackLeftMotor, driveBaseBackRightMotor);
        
        driveBaseRobotDrive4.setSafetyEnabled(true);
        driveBaseRobotDrive4.setExpiration(0.1);
        driveBaseRobotDrive4.setSensitivity(0.5);
        driveBaseRobotDrive4.setMaxOutput(1.0);

        rampLeftServo = new Servo(4);
        LiveWindow.addActuator("Ramp", "Left Servo", rampLeftServo);
        
        rampRightServo = new Servo(5);
        LiveWindow.addActuator("Ramp", "Right Servo", rampRightServo);
    }
}
