package frc.robot.commands.SwerveModule;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SwerveModule;

public class ResetEncoders extends CommandBase {

    private final SwerveModule swerveModule;

    public ResetEncoders(SwerveModule swerveModule) {
        this.swerveModule = swerveModule;
        addRequirements(this.swerveModule);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        this.swerveModule.resetEnconders();
    }

    @Override
    public void end(boolean isInterrupted) {
    }
}