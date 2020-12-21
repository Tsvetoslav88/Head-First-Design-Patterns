package ch06_command_object.remotecontrol.undo;

public interface Command {

	public void execute();

	public void undo();
}
