package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[10];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setY(800);
			rob[i].setSpeed(50);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		
		for(int i = 0; i<rob.length; i++) {
			rob[i].setX(500); 
			rob[i].turn(90);
		}
		

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		boolean y = true;
		int winningRobot = 0;
		int w = 0; 
		int[] p = new int[rob.length]; 

		while (y) {
			for (int i = 0; i < rob.length; i++) {
				//int x = rand.nextInt(50);
				if (rand.nextBoolean()) {
					rob[i].move(200);
					rob[i].turn(-30);
					p[i]++; 
				}
				if (p[i]==12) {
					y = false;
					winningRobot = i;
					break; 
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Robot " + winningRobot + " won!");

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
