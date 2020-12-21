package ch06_command_object.undo;

public interface Command {

	public void execute();

	public void undo();
}
