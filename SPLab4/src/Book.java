import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String titlu;
	List<Element> elements;
	List<Author> authors;
	
	public Book(String titlu)
	{
		this.elements = new ArrayList<Element>();
		this.authors = new ArrayList<Author>();
		this.setTitlu(titlu);
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	public void addContent(Element e) {
		elements.add(e);
	}
	public void print() {
		System.out.println("Book: "+titlu);
		System.out.println("");
		System.out.println("Authors: ");
		for(Author author : authors) {
			System.out.println("Author: "+author.getNume());
		}
		System.out.println("");
		for(Element element : elements) {
			element.print();
		}
	}
}
