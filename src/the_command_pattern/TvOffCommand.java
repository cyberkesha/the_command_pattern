package the_command_pattern;

public class TvOffCommand implements Command{
	Tv tv;
	
	public TvOffCommand(Tv tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOff();
	}

	@Override
	public void undo() {
		System.out.print("it's undo for TV turnOff: ");
		tv.turnOn();
	}
}
