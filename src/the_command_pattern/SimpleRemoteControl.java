package the_command_pattern;

public class SimpleRemoteControl {
	// Объявили массивы объектов типа интерфейс Command
	Command[] onCommands;
	Command[] offCommands;
	
	// Отмена
	Command undoCommand;
	
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
  	// Отмена
  	undoCommand = noCommand;
  }
  
  public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot]  = onCommand;
		offCommands[slot] = offCommand;
	}
	
  public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		// Запомним какую команду выполнили, что бы применить undo к ней
		undoCommand = onCommands[slot];
	}
  
  public void undoButtonWasPressed() {
		undoCommand.undo();
	}
  
  public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
  
  public void showStateOnCommandArray() {
  	for(int i = 0; i < maxLimit; i++) {
  		System.out.print(onCommands[i] + "\n");
  	}
  }
  
   public void showStateOffCommandArray() {
    for(int i = 0; i < maxLimit; i++) {
    	System.out.print(offCommands[i] + "\n");
    }
	}
}
