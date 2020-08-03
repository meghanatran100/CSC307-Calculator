package application;

public class Subtraction implements Operation {
	private float x;
	private float y;
	
	public Subtraction(float x2, float y2) {
		this.x = x2;
		this.y = y2;
	}
	@Override
	public float Calc() {
		return this.x - this.y;
	}
}