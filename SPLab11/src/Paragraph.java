import java.util.ArrayList;

public class Paragraph implements Element,Observable {
	
	private String titlu;
	public AlignStrategy align;
	public ArrayList<Observer> observeList;
	public String value;
	public String oldValue;
	
	public Paragraph(String titlu) {
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
	public void print() {
		if(align == null)
		System.out.println("Paragraph: "+titlu);
		else this.align.print(titlu);
	}
	
	public void setAlignStrategy(AlignStrategy align)
	{
		this.align=align;
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	
	public void setNewValue(String newValue) {
		this.oldValue = titlu;
		this.value = newValue;
		this.notifyObservers();
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
	public Element copy() {
		Paragraph p = new Paragraph(this.titlu);
		return p;
	}
}
