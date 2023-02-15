package project1;

public class Instance {
	private int temperature;
	private int humidity;
	private String windy;
	private String activity;
	private String conditions;
	
	public Instance() {
		setTemperature(0);
		setHumidity(0);
		setWindy("FALSE");
		setActivity("none");
		setConditions("none");
	}
	
	public Instance(String c, int t, int h, String w, String a) {
		setConditions(c);
		setTemperature(t);
		setHumidity(h);
		setWindy(w);
		setActivity(a);
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public String getWindy() {
		return windy;
	}

	public void setWindy(String windy) {
		this.windy = windy;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	
	public String toString() {
		return (conditions + "," + temperature + "," + humidity + "," + windy + "," + activity);
	}
}
