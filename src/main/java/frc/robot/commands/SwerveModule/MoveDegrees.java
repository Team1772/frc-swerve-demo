package frc.robot.commands.SwerveModule;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SwerveModule;

public class MoveDegrees extends CommandBase {

    private final SwerveModule swerveModule;

    public MoveDegrees(SwerveModule swerveModule) {
        this.swerveModule = swerveModule;
        addRequirements(this.swerveModule);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        while (this.swerveModule.getEncoder() < 1.01) {
            this.swerveModule.set(0.2, 0);
        }
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end(boolean isFinished) {
        this.swerveModule.set(0, 0);
    }
}