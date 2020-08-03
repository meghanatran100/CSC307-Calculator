package application;

public class Addition implements Operation {
	private float x;
	private float y;
	
	public Addition(float x2, float y2) {
		this.x = x2;
		this.y = y2;
	}

	public float Calc() {
		return (this.x + this.y);
	}

}
