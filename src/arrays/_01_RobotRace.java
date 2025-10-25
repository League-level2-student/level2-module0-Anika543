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
			rob[i].setY(550);
			rob[i].setSpeed(5);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		
		rob[0].setX(50);
		rob[1].setX(150);
		rob[2].setX(250);
		rob[3].setX(350);
		rob[4].setX(450);
		rob[5].setX(550);
		rob[6].setX(650);
		rob[7].setX(750);
		rob[8].setX(850);
		rob[9].setX(950);

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		boolean y = true;
		int winningRobot = 0;

		while (y) {
			for (int i = 0; i < rob.length; i++) {
				int x = rand.nextInt(50);
				rob[i].move(x);
				for(int m = 1; m<360; m+=100) {
					rob[i].setAngle(m);
				}
				if (rob[i].getY() < 50) {
					y = false;
					winningRobot = i + 1;
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
