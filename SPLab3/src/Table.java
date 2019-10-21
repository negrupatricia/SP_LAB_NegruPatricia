
public class Table implements Element {
	private String titlu;
	
	public Table(String titlu) {
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
		System.out.println("Table with Title: "+titlu);
	}
}
