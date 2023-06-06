package the_command_pattern;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		System.out.print("it's undo for light.off: ");
		light.on();
		
	}
}
