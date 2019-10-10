import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String titlu;
	List<Chapter> chapters;
	List<Author> authors;
	
	public Book(String titlu)
	{
		this.chapters = new ArrayList<Chapter>();
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
	public int createChapter(String chapterName) {
		Chapter chp = new Chapter(chapterName);
		chapters.add(chp);
		return chapters.indexOf(chp);
	}
	
	public Chapter getChapter(int index) {
		return chapters.get(index);
	}
}
