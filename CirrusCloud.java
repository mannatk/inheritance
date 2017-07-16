package weather;

public class CirrusCloud extends Cloud{

	//ctor
	public CirrusCloud(float bottom, float top) {
		super(bottom, top);
	}
	
	@Override
	//this cloud cannot make rain
	public String rain() {
		return "I cannot make rain";
	}
}
