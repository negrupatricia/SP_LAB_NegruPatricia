import java.util.ArrayList;

public class DocumentManager {

	private static DocumentManager instance=null;
	private static Section book=null;
	private FirstObserver firstObserver = new FirstObserver();
	private SecondObserver secondObserver = new SecondObserver();
	public static ArrayList<Command> stack;
	
	private DocumentManager() {
		stack = new ArrayList<Command>();
	}
	
	public static DocumentManager getInstance() {
		if(instance == null)
		{
			instance = new DocumentManager();
		}

		return instance;
	}
	
	public static void setBook(Section booky) {
		book = booky;
	}
	
	public static Section getBook() {
		return book;
	}
	public FirstObserver getFirstObserver() {
		return this.firstObserver;
	}

	public SecondObserver getSecondObserver() {
		return this.secondObserver;
	}
	
	
}
