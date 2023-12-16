// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.core.util.oi.DriverController;
import frc.robot.commands.SwerveModule.Move;
import frc.robot.commands.SwerveModule.MoveDegrees;
import frc.robot.commands.SwerveModule.ResetEncoders;
import frc.robot.subsystems.SwerveModule;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {

  DriverController driver;
  SwerveModule swerveModule;

  public RobotContainer() {
    this.swerveModule = new SwerveModule();
    this.swerveModule.resetEnconders();
    this.driver = new DriverController();

    configureBindings();
  }

  private void configureBindings() {
    this.buttonBindingsSwerve();

  }

  private void buttonBindingsSwerve() {
    this.driver.whileAButton(new Move(this.swerveModule));
    this.driver.whileLeftBumper(new MoveDegrees(this.swerveModule));
    this.driver.whileBButton(new ResetEncoders(this.swerveModule));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
