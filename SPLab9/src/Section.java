import java.util.ArrayList;
import java.util.List;

public class Section implements Element,Observable{
	public String sectionTitle;
	public String content;
	public String oldContent;
	public ArrayList<Observer> observeList;
	private List<Element> elements = new ArrayList<Element>();
	public Section(String sectionTitle) {
		this.sectionTitle = sectionTitle;
		observeList = new ArrayList<Observer>();
		observeList.add(DocumentManager.getInstance().getFirstObserver());
	}
		
	public int add(Element e) {
		elements.add(e);
		return elements.indexOf(e);
	}
	
	public void remove(Element e) {
		elements.remove(e);
	}
	public Element getElement(int index) {
		return elements.get(index);
	}
	
	public void print() {
		System.out.println(sectionTitle);
		for (Element element : elements ) {
			element.print();
		}
	}
		
	public void accept(Visitor visitor) {
		visitor.visit(this);
		for (Element element : elements ) {
			element.accept(visitor);
		}
		
	}

	public String getSectionTitle() {
		return sectionTitle;
	}

	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}

	@Override
	public void addObserver(Observer observer) {
		this.observeList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = this.observeList.indexOf(observer);
		this.observeList.remove(index);
		}


	public void notifyObservers() {
		for(Observer observer: observeList)	
		{
			observer.update(this.oldContent, this.content);
		}
	}

	
	public void setNewValue(String newValue) {
		this.oldContent = this.sectionTitle;
		this.content = newValue;
		this.notifyObservers();
	}
}
