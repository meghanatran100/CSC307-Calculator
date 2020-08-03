package application;

public class Division implements Operation {
	private float x;
	private float y;
	
	public Division(float x, float y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public float Calc() {
		if (this.y == 0)
			return -1;
		return this.x / this.y;
	}

}
