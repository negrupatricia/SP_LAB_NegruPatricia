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
}
