// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot

import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard

val K_DEFAULT_AUTO = "Default";
val K_CUSTOM_AUTO = "My Auto";

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
class Robot : TimedRobot() {
  var m_autoSelected = K_DEFAULT_AUTO
  val m_chooser = SendableChooser<String>()

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  override fun robotInit() {
    m_chooser.setDefaultOption("Default Auto", K_DEFAULT_AUTO);
    m_chooser.addOption("My Auto", K_CUSTOM_AUTO);
    SmartDashboard.putData("Auto choices", m_chooser);
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  override fun robotPeriodic() {}

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to the switch structure
   * below with additional strings. If using the SendableChooser make sure to add them to the
   * chooser code above as well.
   */
  override fun autonomousInit() {
    m_autoSelected = m_chooser.getSelected()
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("Auto selected: " + m_autoSelected)
  }

  /** This function is called periodically during autonomous. */
  override fun autonomousPeriodic() {
    when (m_autoSelected) {
      K_CUSTOM_AUTO -> {
        // Put custom auto code here
      }
      K_DEFAULT_AUTO -> {
        // Put custom auto code here
      }
      else -> {
      }
    }
  }

  /** This function is called once when teleop is enabled. */
  override fun teleopInit() {}

  /** This function is called periodically during operator control. */
  override fun teleopPeriodic() {}

  /** This function is called once when the robot is disabled. */
  override fun disabledInit() {}

  /** This function is called periodically when disabled. */
  override fun disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  override fun testInit() {}

  /** This function is called periodically during test mode. */
  override fun testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  override fun simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  override fun simulationPeriodic() {}
}
