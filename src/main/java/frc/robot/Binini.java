package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;

public class Binini extends TimedRobot{

    TejuinoBoard mantita = new TejuinoBoard();
    Timer tiempo = new Timer();

     /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    mantita.init(0);
    
    
  
  }

  @Override
  public void robotPeriodic() 
  {

  }

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
    
  public void timerMantita(){
    tiempo.start();
    while (tiempo.get() <= 30){

    }
  }
}
