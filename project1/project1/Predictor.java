package project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Predictor {

	private ArrayList<Instance> instances;
	private String fn;

	public Predictor(String file) {
		instances = new ArrayList<Instance>();
		fn = file;
		readFile();
	}

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
	
	public String toString() {
		String toReturn = "";
		for (Instance instance : instances) {
			toReturn += instance + "\n";
		}
		return toReturn;
	}
}

