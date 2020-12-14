package ch06_command_object.remotecontrol.simpleremote;

public class SimpleRemoteControl {

	Command slot;

	public void setCommand(Command command) {
		this.slot = command;
	}

	public void buttonWasPased() {
		this.slot.execute();
	}
}
