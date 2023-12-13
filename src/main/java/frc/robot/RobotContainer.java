// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.SwerveModule;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {

  XboxController driver;
  SwerveModule swerveModule;

  public RobotContainer() {
    this.swerveModule = new SwerveModule();
    this.driver = new XboxController(0);

    configureBindings();
  }

  private void configureBindings() {
    this.buttonBindingsSwerve();

  }

  private void buttonBindingsSwerve() {
    swerveModule.set(this.driver.getLeftY(), this.driver.getRightX());
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
