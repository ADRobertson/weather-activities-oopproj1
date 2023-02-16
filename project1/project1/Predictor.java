//Aidan Robertson
//OOP Project 1
package project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Predictor {

	private ArrayList<Instance> instances;
	private String fn;

	public Predictor(String file) {
		instances = new ArrayList<Instance>();
		fn = file;
		readFile();
	}
	
	//private method to read data from passed filename and path, this is called in constructor
	private void readFile() {
		BufferedReader lineReader = null;
		try {
			FileReader fr = new FileReader(fn);
			lineReader = new BufferedReader(fr);
			String line = null;
			while ((line = lineReader.readLine())!=null) {
				String[] pieces = line.split(",");
				Instance temp = new Instance(pieces[0], Integer.parseInt(pieces[1]), Integer.parseInt(pieces[2]), pieces[3], pieces[4]);
				instances.add(temp);
			} 
		}catch (Exception e) {
			System.err.println("there was a problem with the file reader, try different read type.");				
		}
	}

	//public wrapper for writeFile
	public void saveFile() {
		writeFile(this.fn);
	}

	//prints this objects to string into the file is initially read from
	private void writeFile(String fn) {
		FileWriter fw;
		try {
			fw = new FileWriter(fn);
			BufferedWriter myOutFile = new BufferedWriter(fw);
			myOutFile.write(this.toString());
			myOutFile.flush();
			myOutFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("***There was an error reading the inputted file***!");
			e.printStackTrace();
		}		
	}

	public String using(Instance newInstance) {
		Instance match = null;
		int highestScore = 0;
		String activityToReturn = "";
		
		for (Instance instance : instances) {
			if (instance.score(newInstance) >= highestScore) {
				highestScore = instance.score(newInstance); // generate score for each instance in our data
				match = instance;
			}
		}
		if (highestScore == 0) { // if nothing similar could be found, default to take a nap
			activityToReturn = "take a nap";
		}
		else {
			activityToReturn = match.getActivity();
		}
		
		return activityToReturn;
	}

	public void add(Instance newInstance) {
		try {
			boolean existsInData = false;
			for (Instance instance : instances) {
				if (instance.equals(newInstance)) { //if instance we are trying to add already exists
					existsInData = true; //
				}	
			}
			if (!existsInData) { // if new instance is not in data already, add it
				instances.add(newInstance);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		String toReturn = "";
		for (Instance instance : instances) {
			toReturn += instance + "\n";
		}
		return toReturn;
	}
}

