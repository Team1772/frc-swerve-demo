

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class SwerveModule extends SubsystemBase {

  private TalonFX motorTalon;
  private CANSparkMax motorNeo;

  public SwerveModule() {
    this.motorTalon = new TalonFX(10) ;
    this.motorNeo = new CANSparkMax(0, null);
  }

  public void set(double speedNeo, double speedTalon) {
    this.motorTalon.set(TalonFXControlMode.PercentOutput, speedTalon);
    this.motorNeo.set(speedNeo);
  }


  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }
}
