
public class OpenCommand implements Command{
	public String path;
	@Override
	public void execute() {
		JSONBuilder jsonBuilder = new JSONBuilder(path);
	    jsonBuilder.build();
	    Book book = new Book("carte1");
	    book.addContent(jsonBuilder.getResult());
	    DocumentManager.setBook(book);
		
	}
	
	public OpenCommand(String path) {
		this.path = path;
	}

}
