import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	
	private String titlu;
	List<Element> elements;
	
	
	public SubChapter(String titlu) {
		this.elements = new ArrayList<Element>();
		setTitlu(titlu);
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	public int createParagraph(String paragraphName) {
		Paragraph par = new Paragraph(paragraphName);
		elements.add(par);
		return elements.indexOf(par);
	}
	
	public int createImage(String imageName) {
		Image img = new Image(imageName);
		elements.add(img);
		return elements.indexOf(img);
	}
	
	public int createTable(String tableName) {
		Table tbl = new Table(tableName);
		elements.add(tbl);
		return elements.indexOf(tbl);
	}
	
	public void createNewParagraph(String paragraphName)
	{
		this.elements.add(new Paragraph(paragraphName));
	}
	
	public void createNewTable(String tableName)
	{
		this.elements.add(new Table(tableName));
	}
	
	public void createNewImage(String imageName)
	{
		this.elements.add(new Image(imageName));
	}
	
	public void print()
	{
		System.out.println("Subchapter:"+ titlu);
		for (Element element : elements ) {
			element.print();
		}
	
	}
}
