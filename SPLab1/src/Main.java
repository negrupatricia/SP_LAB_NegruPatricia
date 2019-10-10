
public class Main {
	public static void main(String[] args) {
	Book discoTitanic = new Book("Disco Titanic");
	Author rPavel = new Author("Raul Pavel");
	discoTitanic.addAuthor(rPavel);
	int indexofChapter = discoTitanic.createChapter("Chapter One");
	Chapter chpOne = discoTitanic.getChapter(indexofChapter);
	int indexofSubChapter = chpOne.createSubChapter("ChapterOneOne");
	SubChapter chpOneOne = chpOne.getSubChapter(indexofSubChapter);
	int indexOfParagraph = chpOneOne.createParagraph("Paragraph1");
	int indexOfImage = chpOneOne.createImage("Image1");
	int indexOfTable = chpOneOne.createTable("Table1");
	}
}
