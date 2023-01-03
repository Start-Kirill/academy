package by.academy.tasks.OOP.Task7.details;

public class Engine {
	private double power;
	private String producer;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(double power, String producer) {
		super();
		this.power = power;
		this.producer = producer;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", producer=" + producer + "]";
	}
	
	

}
