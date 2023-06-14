package frc.robot

import java.util.function.Supplier
import edu.wpi.first.wpilibj.RobotBase

fun main() {
  RobotBase.startRobot(Supplier { Robot() })
}
