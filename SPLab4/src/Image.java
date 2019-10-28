import java.util.concurrent.TimeUnit;

public class Image implements Element{
	
	public String titlu;
	
	public Image(String titlu) {
		setTitlu(titlu);
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
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
