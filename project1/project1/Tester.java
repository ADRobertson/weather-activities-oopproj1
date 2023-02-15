package project1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testing constructor and toString for Instance class
		Instance testInstance = new Instance("rainy", 65, 90, "TRUE", "xbox");
		System.out.println("Testing toString for Instance class: " + testInstance);
		
		//testing constructor and read file for predictor class
		Predictor predict = new Predictor("../weather.numeric.txt");
		//testing to string method for predictor
		System.out.println("Testing toString for predictor class: " + predict);
		
		
		//testing add method of Predictor class
		predict.add(testInstance);
		System.out.println("Testing that add method works for Predictor class: " + predict);
		
		
		//testing saveFile method for Predictor Class
		predict.saveFile();
	}

}
