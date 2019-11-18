import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
	private String sectionTitle;
	private List<Element> elements = new ArrayList<Element>();
	public Section(String sectionTitle) {
		this.sectionTitle = sectionTitle;
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
}
