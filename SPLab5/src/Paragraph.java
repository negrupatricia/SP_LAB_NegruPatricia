
public class Paragraph implements Element {
	
	private String titlu;
	public AlignStrategy align;
	
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
		if(align == null)
		System.out.println("Paragraph: "+titlu);
		else this.align.print(titlu);
	}
	
	public void setAlignStrategy(AlignStrategy align)
	{
		this.align=align;
	}
}
