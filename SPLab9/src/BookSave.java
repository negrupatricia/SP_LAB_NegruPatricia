import java.io.FileWriter;
import java.io.IOException;

public class BookSave implements Visitor{
	FileWriter fw;
	public BookSave() throws IOException {
		 fw = new FileWriter("outputtt.txt"); 
	}
	
	public void visit(Image image) {
		String str = "Imagine -> " + image.getTitlu(); 
		try {    
		for (int i = 0; i < str.length(); i++)
				fw.write(str.charAt(i));
		fw.write(System.lineSeparator());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	  
	}
	
	public void visit(ImageProxy imageproxy)  {
		String str = "Imagine Proxy-> " + imageproxy.getTitlu(); 
				try {
					for (int i = 0; i < str.length(); i++)
						fw.write(str.charAt(i));
					fw.write(System.lineSeparator());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	  
	}
	
	public void visit(Paragraph paragraph) {
		String str = "Paragraph -> " + paragraph.getTitlu(); 
	        
				try {
					for (int i = 0; i < str.length(); i++)
						fw.write(str.charAt(i));
					fw.write(System.lineSeparator());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	  
	}
	
	public void visit(Table table) {
		String str = "Table -> " + table.getTitlu(); 
				try {
					for (int i = 0; i < str.length(); i++)
						fw.write(str.charAt(i));
					fw.write(System.lineSeparator());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	  
	}
	
	public void visit(Section section) {
		String str = "Section -> " + section.getSectionTitle(); 
	  
				try {
					for (int i = 0; i < str.length(); i++)
						fw.write(str.charAt(i));
					fw.write(System.lineSeparator());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	  
	}
	
	
	public void close() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
