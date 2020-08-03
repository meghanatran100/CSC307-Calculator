package application;


public class Logarithm implements Operation{
	private float x;
	private float y;
	
	public Logarithm(float x, float y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public float Calc() {
		if (this.y <= 0 || this.x <= 0)
			return -1;
		return (float) (Math.log(this.x) / Math.log(this.y));
	}
}
