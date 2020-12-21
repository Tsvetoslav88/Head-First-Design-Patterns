package ch06_command_object.party;

public interface Command {

	public void execute();

	public void undo();
}
