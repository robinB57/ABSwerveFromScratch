package org.usfirst.frc.team4653.robot.commands;

import org.usfirst.frc.team4653.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDrive extends Command {

	private double angle, startPos, targetPos, speed;

	/**
	 * @param angle angle in degrees to point wheels towards. forward is 0.
	 * @param distance units are encoder ticks. please don't try negative distance
	 * @param speed wheel speed from -1.0 to 1.0
	 */
	public AutoDrive(double angle, double distance, double speed) {
		requires(Robot.driveTrain);
		this.angle = angle;
		this.speed = speed;
		this.startPos = Robot.driveTrain.averageDrivePosition();
		this.targetPos = startPos + distance;
	}
	

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.driveTrain.crabDrive(angle, speed);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		double currentPos = Robot.driveTrain.averageDrivePosition();
		if(currentPos > targetPos) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
		Robot.driveTrain.crabDrive(0, 0);
	}
	
}
