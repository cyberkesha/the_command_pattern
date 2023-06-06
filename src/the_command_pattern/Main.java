package the_command_pattern;

public class Main {

	public static void main(String[] args) {
		// Инициатор исполнения команды
		SimpleRemoteControl remote = new SimpleRemoteControl();

		// Объект, который будет выполнять "команду" от инициатора
		// Получатель запроса
		Light light = new Light();
		
		// Команда с получателем (исполнителем команды)
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
	
		// По нажатию выполняется команда-объект
		remote.buttonWasPressed();
	}
}
