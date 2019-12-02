import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Observable{
	
	public String titlu;
	public String value;
	public String oldValue;
	public ArrayList<Observer> observeList;
	
	public Image(String titlu) {
		setTitlu(titlu);
		observeList = new ArrayList<Observer>();
		observeList.add(DocumentManager.getInstance().getFirstObserver());
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public void print()
	{
		System.out.println("Image with name:"+titlu);
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}	

	public void addObserver(Observer observer) {
		this.observeList.add(observer);
	}

	public void removeObserver(Observer observer) {
		int index = this.observeList.indexOf(observer);
		this.observeList.remove(index);
	}


	public void notifyObservers() {
		for(Observer observer: observeList)	
		{
			observer.update(this.oldValue, this.value);
		}		
	}

	public void setNewValue(String newValue) {
		this.oldValue = this.titlu;
		this.value = newValue;
		this.notifyObservers();
	}

}
