package javastudy;

public class Car {
	private String model;
	private String color;
	private int power;
	private int curSpeed;
	
	// 积己磊, 可记
	public Car() {
		curSpeed = 0;
	}
	
	public Car(String color, String model, int power) {
		this.color = color;
		this.model = model;
		this.power = power;
	}
	
	public void go() {
		if(power < 200) {
			curSpeed += 10;
		}else if(power >= 200) {
			curSpeed += 20;
		}
        System.out.printf("Accelerate %s, Current Speed %d\n", model, curSpeed);
	}
	
	public void stop() {
		curSpeed = 0;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCurSpeed() {
		return curSpeed;
	}

	public void setCurSpeed(int curSpeed) {
		this.curSpeed = curSpeed;
	}
	
	
}
