package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		
	
	Robot hi = new Robot("mini");
	
	hi.setSpeed(100);
	
	hi.turn(-90);
	
	hi.penDown();
	
	hi.move(50);
	
	for (int i = 0; i < 23; i++) {
		hi.turn(-8);
		hi.move(8);
	}
	
	for (int i = 0; i < 23; i++) {
		hi.turn(8);
		hi.move(8);
	}
	
	hi.move(50);
	
	
	}	
}
