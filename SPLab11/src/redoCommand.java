
public class redoCommand implements Command{

	
	public void execute() {
		DeleteCommand redo = (DeleteCommand)DocumentManager.getInstance().stack.get(DocumentManager.getInstance().stack.size() - 1);
		DocumentManager.getInstance().setBook((Section)redo.memento.getState());
		redo.execute();
		
	}

	public void unexecute() {
		
	}

}
