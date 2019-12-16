import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element{
	String titlu;
	Image realImage;
	public ImageProxy(String titlu) {
		this.titlu=titlu;
	}
	
	public void print() {
		if(realImage!=null && realImage!=null)
			realImage.print();
		else
			(realImage=new Image(titlu)).print();
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		
	}
	public Element copy() {
		ImageProxy ip = new ImageProxy(this.titlu);
		return ip;
	}
}
