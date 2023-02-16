//Aidan Robertson
//OOP Project 1
package project1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testing constructor and toString for Instance class
		Instance testInstance = new Instance("rainy", 65, 90, "TRUE", "xbox");
		System.out.println("Testing toString for Instance class: " + testInstance);
		
		//testing constructor and read file for predictor class
		Predictor predict = new Predictor("./weather.numeric.txt");
		//testing to string method for predictor
		System.out.println("Testing toString for predictor class: \n" + predict);
		
		
		//testing add method of Predictor class
		predict.add(testInstance);
		System.out.println("Testing that add method works for Predictor class: \n" + predict);
		
		//testing using method of Predictor class
		Instance usingInstance = new Instance("sunny", 97, 80, "TRUE");
		System.out.println("Activity for " + usingInstance + ": " + predict.using(usingInstance));
		
		//testing using method for an exact match
		Instance usingInstance2 = new Instance("rainy", 65, 70, "TRUE");
		System.out.println("Activity for " + usingInstance2 + ": " + predict.using(usingInstance2));
		
		//testing using method for another exact match
		Instance usingInstance3 = new Instance("sunny", 80,90,"TRUE");
		System.out.println("Activity for " + usingInstance3 + ": " + predict.using(usingInstance3));
		
		
		//testing saveFile method for Predictor Class
		predict.saveFile();
	}

}
