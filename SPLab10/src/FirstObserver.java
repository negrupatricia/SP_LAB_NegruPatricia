
public class FirstObserver implements Observer{

	
	public void update(String oldValue, String newValue) {
		System.out.println("First observer - oldvalue:"+oldValue+"--> new value: "+newValue);
	}

}
