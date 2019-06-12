package org.usfirst.frc.team4653.robot;

public class Constants {
	
	public static final int FLdrive = 2,
			  FLturn = 1,
			  FRdrive = 4,
			  FRturn = 3,
			  BLdrive = 6,
			  BLturn = 5,
			  BRdrive = 8,
			  BRturn = 7;
	
	public static final int FLoffset = 0,
			  FRoffset = 0,
			  BLoffset = 0,
			  BRoffset = 0;

	public static final int stickPort = 0,
			kTimeoutMs = 10,
			kPIDLoopIdx = 0;
	
	public static final double kP = .000146484375,
			kI = 0,
			kD = 0, 
			kF = 0;

	public static final double kWheelbase = 19.0,
			kTrackwidth = 27.0,
			kTurnRadius = Math.hypot(kWheelbase, kTrackwidth);	

	//public static final double kP = 0.0046,
	//		kI = 0.000025,
	//		kD = 0,
	//		kF = 0;
	
	public enum ModuleLocation {
        FRONT_LEFT, FRONT_RIGHT, BACK_LEFT, BACK_RIGHT;
    }
}