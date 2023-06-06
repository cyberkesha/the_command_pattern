package the_command_pattern;

public class LightOnCommand implements Command{
	Light light;
	
	// constructor
	public LightOnCommand(Light light) {
		// don't shadow
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
