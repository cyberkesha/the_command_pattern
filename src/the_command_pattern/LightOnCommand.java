package the_command_pattern;

public class LightOnCommand implements Command{
	// Исполнитель команды 
	Light light;
	// Команда завернутая в класс-объект
	// constructor
	public LightOnCommand(Light light) {
		// Параметр light затеняет член класса light, поэтому через this
		// Тот кто будет исполнять команду
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
