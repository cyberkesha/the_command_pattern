package the_command_pattern;

public class SimpleRemoteControl {
	// Объявили массивы объектов типа интерфейс Command
	Command[] onCommands;
	Command[] offCommands;
	// Заглушка
	NoCommand noCommand;
	
	private int maxLimit = 7;
	
	//constructor
  public SimpleRemoteControl() {
  	// Создать объекты массивы команд
  	onCommands  = new Command[maxLimit];
  	offCommands = new Command[maxLimit];
  	
  	// Заглушка
  	noCommand = new NoCommand();
  	
  	// Инициализация заглушками
  	for(int i = 0; i < maxLimit; i++) {
  		onCommands[i]  = noCommand;
  		offCommands[i] = noCommand;
  	}
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
