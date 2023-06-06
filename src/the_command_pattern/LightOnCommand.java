package the_command_pattern;

public class LightOnCommand implements Command{
	// Команда завернутая в класс-объект
	
	// Объект команды включает:
	// 1. Реализацию интерфейса "выполнения команды"
	// 2. Тот кто будет выполнять команду - исполнитель (объект)
	// 3. Какую команду будет выполнять испольнитель (метод испольнителя)
	
	// Исполнитель команды 
	Light light;
	// constructor
	public LightOnCommand(Light light) {
		// Параметр light затеняет член класса light, поэтому через this
		// Тот кто будет исполнять команду
		this.light = light;
	}

	@Override
	public void execute() {
	// Какой метод выполняет исполнитель при выполнении "команды"
		light.on();
	}
}
