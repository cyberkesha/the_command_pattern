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
}
