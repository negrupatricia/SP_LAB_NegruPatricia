
public class undoCommand implements Command{

	
	public void execute() {
		DeleteCommand undo = (DeleteCommand)DocumentManager.getInstance().stack.get(DocumentManager.getInstance().stack.size() - 1);
		DocumentManager.getInstance().setBook((Section)undo.memento.getState());
		undo.unexecute();
	}

	public void unexecute() {
	}

}
