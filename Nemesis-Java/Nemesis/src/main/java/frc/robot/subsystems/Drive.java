package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
public class Drive extends SubsystemBase {

  public Drive() {
    TalonFX L1 = new TalonFX (Constants.Drv_L1);
    TalonFX L2 = new TalonFX (Constants.Drv_L2);
    TalonFX R1 = new TalonFX (Constants.Drv_R1);
    TalonFX R2 = new TalonFX (Constants.Drv_R2);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  public void setLeft(double output){
    
  }
}

 