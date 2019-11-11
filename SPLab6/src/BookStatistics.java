
public class BookStatistics implements Visitor {
	protected int nbImage = 0;
	protected int nbImageProxy = 0;
	protected int nbParagraph = 0;
	protected int nbTable = 0;

	public void visit(Image image) {
		nbImage++;
	}
	
	public void visit(ImageProxy imageproxy) {
		nbImageProxy++;
	}
	
	public void visit(Paragraph paragraph) {
		nbParagraph++;
	}
	
	public void visit(Table table) {
		nbTable++;
	}
	
	public void printStatistics() {
		System.out.println("Book Statistics:");
		System.out.println("*** Number of images: "+(nbImage+nbImageProxy));
		System.out.println("*** Number of tables: "+nbTable);
		System.out.println("*** Number of paragraphs: "+nbParagraph);
	}
	
}
