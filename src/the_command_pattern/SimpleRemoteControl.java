package the_command_pattern;

public class SimpleRemoteControl {
	// Объявили массивы объектов типа интерфейс Command
	Command[] onCommands;
	Command[] offCommands;

	private int maxLimit = 7;
	
	//constructor
  public SimpleRemoteControl() {
  	// Создать объекты массивы команд
  	onCommands  = new Command[maxLimit];
  	offCommands = new Command[maxLimit];
  }
  
  public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot]  = onCommand;
		offCommands[slot] = offCommand;
	}
	
  public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
	}
  
  public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
	}
}
