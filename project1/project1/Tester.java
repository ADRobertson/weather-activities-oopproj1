//Aidan Robertson
//OOP Project 1
package project1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testing constructor and toString for Instance class
		Instance testInstance = new Instance("rainy", 65, 90, "TRUE", "xbox"); // **WILL NEED TO EDIT THIS TO CHECK IF UPDATING IS WORKING**
		System.out.println("Testing toString for Instance class: " + testInstance);
		
		//testing constructor and read file for predictor class
		Predictor predict = new Predictor("./weather.numeric.txt");
		//testing to string method for predictor
		System.out.println("Testing toString for predictor class: \n" + predict);
		
		
		Instance updatingInstance = new Instance("overcast", 80, 80, "FALSE"); //this instance will be added without an activity to test if we can update the 
																				//instance to include an activity
		predict.updating(updatingInstance); //this should add the above instance to the dataset
		System.out.println("Testing Updating for predictor class (with new data instance): \n" + predict);
		
		Instance updatingInstanceWithActivity = new Instance("overcast", 80, 80, "FALSE", "tennis"); //this should return true from updatingInstance.equals()
																									//so activity should be updated in the existing instance
		predict.updating(updatingInstanceWithActivity);
		System.out.println("Testing Updating for predictor class (updating activity parameter of instance): \n" + predict);
		
		//testing using method of Predictor class
		Instance usingInstance = new Instance("sunny", 97, 80, "TRUE");
		System.out.println("Activity for " + usingInstance + ": " + predict.using(usingInstance));
		
		//testing using method for an exact match
		Instance usingInstance2 = new Instance("rainy", 65, 70, "TRUE");
		System.out.println("Activity for " + usingInstance2 + ": " + predict.using(usingInstance2));
		
		//testing using method for another exact match
		Instance usingInstance3 = new Instance("sunny", 80,90,"TRUE");
		System.out.println("Activity for " + usingInstance3 + ": " + predict.using(usingInstance3));
		
		//testing using method for today's weather...
		Instance usingInstance4 = new Instance("rainy", 70, 94, "FALSE");
		System.out.println("Activity for today's weather " + usingInstance4 + ": " + predict.using(usingInstance4));
		
		
		//testing saveFile method for Predictor Class
		predict.saveFile();
	}

}
