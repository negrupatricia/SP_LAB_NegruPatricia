
public class Memento {
	Element state;

	public Element getState() {
		return state;
	}

	public void setState(Element state) {
		this.state = state.copy();
	}
	
}
