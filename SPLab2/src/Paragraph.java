
public class Paragraph extends Element {
	
	private String titlu;
	
	public Paragraph(String titlu) {
		setTitlu(titlu);
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public void print() {
		System.out.println("Paragraph: "+titlu);
	}
}
