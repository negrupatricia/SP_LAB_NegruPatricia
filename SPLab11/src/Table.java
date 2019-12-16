import java.util.ArrayList;

public class Table implements Element,Observable {
	private String titlu;
	public String value;
	public String oldValue;
	public ArrayList<Observer> observeList;
	
	public Table(String titlu) {
		setTitlu(titlu);
		observeList = new ArrayList<Observer>();
		observeList.add(DocumentManager.getInstance().getFirstObserver());
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public void print()
	{
		System.out.println("Table with Title: "+titlu);
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
	public Element copy() {
		Table t = new Table(this.titlu);
		return t;
	}
}
