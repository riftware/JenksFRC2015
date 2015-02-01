// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc31.Jenks2015Example;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.can.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon totePivotCANTalonSRX1;
    public static AnalogPotentiometer totePivotAnalogPotentiometer1;
    public static CANTalon driveSystemLeftFront;
    public static CANTalon driveSystemRightFront;
    public static CANTalon driveSystemLeftRear;
    public static CANTalon driveSystemRightRear;
    public static Encoder driveSystemLfEncoder;
    public static Encoder driveSystemRfEncoder;
    public static Encoder driveSystemLrEncoder;
    public static Encoder driveSystemRrEncoder;
    public static Compressor toteElevatorCompressor;
    public static AnalogPotentiometer toteElevatorAnalogPotentiometer1;
    public static Solenoid toteElevatorElevator;
    public static Servo panTiltPanServo;
    public static Servo panTiltTiltServo;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        totePivotCANTalonSRX1 = new CANTalon(2);
        
        
        totePivotAnalogPotentiometer1 = new AnalogPotentiometer(0, 272.0, 136.0);
        LiveWindow.addSensor("TotePivot", "Analog Potentiometer 1", totePivotAnalogPotentiometer1);
        
        driveSystemLeftFront = new CANTalon(3);
        
        
        driveSystemRightFront = new CANTalon(4);
        
        
        driveSystemLeftRear = new CANTalon(5);
        
        
        driveSystemRightRear = new CANTalon(6);
        
        
        driveSystemLfEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveSystem", "LfEncoder", driveSystemLfEncoder);
        driveSystemLfEncoder.setDistancePerPulse(1.0);
        driveSystemLfEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveSystemRfEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveSystem", "RfEncoder", driveSystemRfEncoder);
        driveSystemRfEncoder.setDistancePerPulse(1.0);
        driveSystemRfEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveSystemLrEncoder = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveSystem", "LrEncoder", driveSystemLrEncoder);
        driveSystemLrEncoder.setDistancePerPulse(1.0);
        driveSystemLrEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveSystemRrEncoder = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveSystem", "RrEncoder", driveSystemRrEncoder);
        driveSystemRrEncoder.setDistancePerPulse(1.0);
        driveSystemRrEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        toteElevatorCompressor = new Compressor(1);
        
        
        toteElevatorAnalogPotentiometer1 = new AnalogPotentiometer(2, 270.0, 136.0);
        LiveWindow.addSensor("ToteElevator", "Analog Potentiometer 1", toteElevatorAnalogPotentiometer1);
        
        toteElevatorElevator = new Solenoid(1, 1);
        LiveWindow.addActuator("ToteElevator", "Elevator", toteElevatorElevator);
        
        panTiltPanServo = new Servo(0);
        LiveWindow.addActuator("PanTilt", "PanServo", panTiltPanServo);
        
        panTiltTiltServo = new Servo(1);
        LiveWindow.addActuator("PanTilt", "TiltServo", panTiltTiltServo);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
