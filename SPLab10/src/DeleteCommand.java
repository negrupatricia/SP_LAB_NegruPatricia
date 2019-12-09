import java.util.ArrayList;

public class DeleteCommand implements Command{
	public static Memento memento;
	
	public DeleteCommand() {
		memento = new Memento();
		DocumentManager.getInstance().stack.add(this);
	}

	public void execute() {
		Section sec = DocumentManager.getInstance().getBook();
		Element del = sec.elements.get(sec.elements.size() - 1);
		memento.setState(sec);
		sec.elements.remove(del);
		DocumentManager.getInstance().setBook(sec);
		
		
	}
	
	public void unexecute() {
		DocumentManager.getInstance().setBook((Section)memento.getState());
	}

}
