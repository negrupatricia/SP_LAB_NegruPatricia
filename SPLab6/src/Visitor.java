
public interface Visitor {

	public void visit(Image image);
	public void visit(ImageProxy imageproxy);
	public void visit(Paragraph paragraph);
	public void visit(Table table);
}
