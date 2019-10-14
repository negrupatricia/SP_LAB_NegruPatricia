
public class Image extends Element{
	
	private String titlu;
	
	public Image(String titlu) {
		setTitlu(titlu);
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public void print()
	{
		System.out.println("Image with name:"+titlu);
	}
}
