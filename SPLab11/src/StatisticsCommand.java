
public class StatisticsCommand implements Command{

	
	public void execute() {
	    
	    BookStatistics stats = new BookStatistics();
	    for(Element content:  DocumentManager.getInstance().getBook().elements )
	    content.accept(stats);
	    stats.printStatistics();
	    
	}
	public void unexecute() {}

}
