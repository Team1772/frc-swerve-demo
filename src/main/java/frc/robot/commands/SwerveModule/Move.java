package frc.robot.commands.SwerveModule;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SwerveModule;

public class Move extends CommandBase {

    private final SwerveModule swerveModule;

    public Move(SwerveModule swerveModule) {
        this.swerveModule = swerveModule;
        addRequirements(this.swerveModule);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        this.swerveModule.set(0.2, 0.2);
    }

    @Override
    public void end(boolean isInterrupted) {
        this.swerveModule.set(0, 0);
    }
}