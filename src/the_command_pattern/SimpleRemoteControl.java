package the_command_pattern;

public class SimpleRemoteControl {
	Command slot;
	// Контроллер - исполнения - инициатор
	
	//constructor
  public SimpleRemoteControl() {
	}
  
  public void setCommand(Command command) {
		slot = command;
	}
	
  public void buttonWasPressed() {
		slot.execute();
	}
}
