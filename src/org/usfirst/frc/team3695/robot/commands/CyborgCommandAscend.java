package org.usfirst.frc.team3695.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;

import org.usfirst.frc.team3695.robot.Robot;
import org.usfirst.frc.team3695.robot.enumeration.Position;

import edu.wpi.first.wpilibj.command.Command;

/**
 * toggles the state of the clamp
 */
public class CyborgCommandAscend extends Command {
	
	Boolean isFinished;
	
    public CyborgCommandAscend() {
        requires(Robot.SUB_MAST);
    }

    protected void initialize() {
    	DriverStation.reportError("AHHHHHH I'M FLYING AWAY", false);
    	//isFinished = Robot.SUB_MAST.goToMiddle();
    }

    protected void execute() {}

    protected boolean isFinished() { return isFinished; }

    protected void end() {
        DriverStation.reportWarning("CyborgCommandAscend finished", false);
    }

    protected void interrupted() {
    	end();
    }
}
