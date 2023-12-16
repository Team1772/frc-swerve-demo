

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogEncoder;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class SwerveModule extends SubsystemBase {

  private TalonFX motorTalon;
  private CANSparkMax motorNeo;
  AnalogEncoder encoder2;


  public SwerveModule() {
    this.motorTalon = new TalonFX(0) ;
    this.motorNeo = new CANSparkMax(1, MotorType.kBrushless);

    encoder2 = new AnalogEncoder(0);
    encoder2.reset();
  }

  public void resetEnconders(){
    this.encoder2.reset();
    this.motorNeo.getEncoder().setPosition(0);
  }

  public double grausEmRotacoes(double graus){
    double rotacao = this.getEncoder();
    double rotacoes = rotacao / graus;
    return rotacoes;    
  }


  public void set(double speedNeo, double speedTalon) {
    this.motorTalon.set(TalonFXControlMode.PercentOutput, speedTalon);
    this.motorNeo.set(speedNeo);
  }


  @Override
  public void periodic() {
    SmartDashboard.putNumber("[swerveModule] encoder2", this.encoder2.getDistance() * 0.54);
    SmartDashboard.putNumber("[swerveModule] EncoderSpark", this.motorNeo.getEncoder().getPosition() * 0.45 / 8);

  }

  public double getEncoder(){
    return this.motorNeo.getEncoder().getPosition() * 0.45 / 8;
  }

  @Override
  public void simulationPeriodic() {
  }
}
