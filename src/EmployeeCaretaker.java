import java.util.Stack;

public class EmployeeCaretaker {
    private Stack<EmployeeMemento> history = new Stack<>();

    public void saveState(EmployeeMemento memento) {
        history.push(memento);
    }

    public EmployeeMemento undo() {
        if (!history.isEmpty()) {
            return history.pop(); // Restore the last saved state
        }
        return null; 
    }
}
