package frc.team2412.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2412.robot.subsystems.constants.HoodConstants;

public class HoodSubsystem extends SubsystemBase {

	private Servo m_hoodServo1;

	private Servo m_hoodServo2;

	public HoodSubsystem(Servo hoodServo1, Servo hoodServo2) {
		this.m_hoodServo1 = hoodServo1;
		this.m_hoodServo2 = hoodServo2;
	}

	public double getServo() {
		return m_hoodServo2.get();
	}

	public void servoExtend() {
		// changed for at home
		// setServo(HoodConstants.MAX_EXTENSION);
		setServo(HoodConstants.AT_HOME_ANGLE);
	}

	public void servoWithdraw() {
		// changed for at home
		// setServo(HoodConstants.MAX_WITHDRAWL);
		setServo(HoodConstants.AT_HOME_ANGLE);
	}

	public void setServo(double angle) {
		// changed for at home
		// angle = Math.min(angle, HoodConstants.MAX_EXTENSION);
		angle = Math.min(angle, HoodConstants.AT_HOME_ANGLE);
		m_hoodServo1.set(1 - angle);
		m_hoodServo2.set(angle);
	}

	public void add(double increment) {
		// changed for at home
		// setServo(getServo() + increment);
		setServo(HoodConstants.AT_HOME_ANGLE);
	}

}
