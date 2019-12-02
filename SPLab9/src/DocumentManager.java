
public class DocumentManager {

	private static DocumentManager instance=null;
	private static Book book=null;
	private FirstObserver firstObserver = new FirstObserver();
	private SecondObserver secondObserver = new SecondObserver();
	
	private DocumentManager() {}
	
	public static DocumentManager getInstance() {
		if(instance == null)
		{
			instance = new DocumentManager();
		}
		return instance;
	}
	
	public static void setBook(Book booky) {
		book = booky;
	}
	
	public static Book getBook() {
		return book;
	}
	public FirstObserver getFirstObserver() {
		return this.firstObserver;
	}

	public SecondObserver getSecondObserver() {
		return this.secondObserver;
	}
	
	
}
