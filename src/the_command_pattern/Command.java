package the_command_pattern;

public interface Command {
	// Интерфейс "выполенения команды"
	public void execute();
	
	// Отмена
	public void undo();
}
