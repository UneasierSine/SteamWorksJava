package org.usfirst.frc6468.SteamWorksJava;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc6468.SteamWorksJava.commands.*;
import org.usfirst.frc6468.SteamWorksJava.subsystems.*;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static XboxController xbox;
    public static DriveBase driveBase;
    public static Ramp ramp;
    public static RobotDrive robotDrive = new RobotDrive(0, 1, 2, 3);
    
    GenericHID.hand hand;
    
    public void robotInit() {
    RobotMap.init();
        ramp = new Ramp();
        autonomousCommand = new AutonomousCommand();
    }

    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        if(xbox.getAButton == true){
            new RampDown();
        }
        if(xbox.getYButton == true){
            new RampUp();
        }
        if(xbox.getX(hand.kRight) != 0){
            new Turn();
        }
        if(xbox.getY(hand.kRight) != 0){
            new Move();
        }
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
