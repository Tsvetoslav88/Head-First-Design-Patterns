package ch06_command_object.remotecontrol.party;

public interface Command {

	public void execute();

	public void undo();
}
