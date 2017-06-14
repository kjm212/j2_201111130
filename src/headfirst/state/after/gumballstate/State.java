package headfirst.state.after.gumballstate;

public interface State {
 public void insertQuarter();
 public void ejectQuarter();
 public void turnCrank();
 public void dispense();
}