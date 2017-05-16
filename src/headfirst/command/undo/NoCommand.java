package headfirst.command.undo;

// Null Object Pattern
public class NoCommand implements Command{
  public void execute(){}
  public void undo(){}
}