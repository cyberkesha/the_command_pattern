package the_command_pattern;

public class TvOnCommand implements Command{

	Tv tv;
	
	public TvOnCommand(Tv tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOn();
	}

	@Override
	public void undo() {
		System.out.print("it's undo for TV turnOn: ");
		tv.turnOff();
	}
}
