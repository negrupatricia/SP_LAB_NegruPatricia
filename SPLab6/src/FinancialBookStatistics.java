
public class FinancialBookStatistics extends BookStatistics {
	private int costImage = 10;
	private int costTable = 7;
	private int costParagraph = 5;
	
	public void printFinancialStatistics() {
		System.out.println();
		System.out.println("Financial Book Statistics:");
		System.out.println("*** Total cost of images: "+(nbImage+nbImageProxy)*costImage);
		System.out.println("*** Total cost of tables: "+nbTable*costTable);
		System.out.println("*** Total cost of paragraphs: "+nbParagraph*costParagraph);
	}
}
