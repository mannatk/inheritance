package weather;

public class Cloud {
	
	//instance variables
	private float	bottom;
	private float	top;
	
	//ctor
	public Cloud(float bottom, float top) {
		this.bottom = bottom; 
		this.top = top;
	}
	
	//gets the height  
	public float getHeight() {
		return top - bottom;
	}
	
	//returns it is raining
	public String rain() {
		return "It is raining";
	}
}
