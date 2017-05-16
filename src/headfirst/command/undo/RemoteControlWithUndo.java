package headfirst.command.undo;

public class RemoteControlWithUndo{
  Command[] slots;
  public RemoteControlWithUndo(){
    slots = new Command[7];
    
    //Null Object Pattern
    Command noCommand = new NoCommand();
    
    for(int i=0; i<7; i++){
       slots[i] = noCommand;
    }
  }
  
  public void setCommand(int slot, Command command){
    slots[slot] = command;
  }
  
  public void buttonWasPressed(int slot){
    slots[slot].execute();
  }
}