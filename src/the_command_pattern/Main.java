package the_command_pattern;

public class Main {

	public static void main(String[] args) {
		// Инициатор исполнения команды
		SimpleRemoteControl remote = new SimpleRemoteControl();

		System.out.print("--------ON COMMANDS-----\n");
		remote.showStateOnCommandArray();

		System.out.print("--------OFF COMMANDS-----\n");
		remote.showStateOffCommandArray();
		
  // ---------------------------------------------	
		
		System.out.print("========================\n");
		System.out.print("Light:\n\n");
		
		// Объект, который будет выполнять "команду" от инициатора
		// Получатель запроса
		Light light = new Light();
		
		// Команда с получателем (исполнителем команды)
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		remote.setCommand(0, lightOn, lightOff);

		// По нажатию выполняется команда-объект
		remote.onButtonWasPressed(0);
		remote.offButtonWasPressed(0);
		
		System.out.print("========================\n");
		System.out.print("Tv:\n\n");
		
		Tv tv = new Tv();
		TvOnCommand tvOn = new TvOnCommand(tv);
		TvOffCommand tvOff = new TvOffCommand(tv);
		
		remote.setCommand(1, tvOn, tvOff);
		
		remote.onButtonWasPressed(1);
		remote.offButtonWasPressed(1);

	  // ---------------------------------------------	

		System.out.print("--------ON COMMANDS-----\n");
		remote.showStateOnCommandArray();

		System.out.print("--------OFF COMMANDS-----\n");
		remote.showStateOffCommandArray();
	}
}