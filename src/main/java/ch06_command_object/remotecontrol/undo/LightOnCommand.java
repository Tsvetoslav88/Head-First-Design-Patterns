package ch06_command_object.remotecontrol.undo;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();

	}

	@Override
	public void undo() {
		light.off();
	}

}
