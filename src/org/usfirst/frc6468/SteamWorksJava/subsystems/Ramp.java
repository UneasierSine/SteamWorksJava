package org.usfirst.frc6468.SteamWorksJava.subsystems;

import org.usfirst.frc6468.SteamWorksJava.RobotMap;
import edu.wpi.first.wpilibj.Servo;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Ramp extends Subsystem {

    private final Servo leftServo = RobotMap.rampLeftServo;
    private final Servo rightServo = RobotMap.rampRightServo;

    public void initDefaultCommand() {

    }
}

