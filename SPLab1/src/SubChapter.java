import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	
	private String titlu;
	List<Paragraph> paragraphs;
	List<Image> images;
	List<Table> tables;
	
	public SubChapter(String titlu) {
		this.paragraphs = new ArrayList<Paragraph>();
		this.images = new ArrayList<Image>();
		this.tables = new ArrayList<Table>();
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
		paragraphs.add(par);
		return paragraphs.indexOf(par);
	}
	
	public int createImage(String imageName) {
		Image img = new Image(imageName);
		images.add(img);
		return images.indexOf(img);
	}
	
	public int createTable(String tableName) {
		Table tbl = new Table(tableName);
		tables.add(tbl);
		return tables.indexOf(tbl);
	}
}
