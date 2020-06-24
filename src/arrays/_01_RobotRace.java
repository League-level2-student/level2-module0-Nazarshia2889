package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		int x = 100;
		int y = 500;
		
		
		for(int i = 0;i<robots.length;i++) {
			robots[i] = new Robot();
			robots[i].setX(x);
			robots[i].setY(y);
			x += 150;
			
		}
		for(int i = 0;i<robots.length;i++) {
			Random rand = new Random();
			int z = rand.nextInt(50);
			robots[i].setSpeed(5);
			robots[i].move(z);
		}
		
		
	}

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
