package ch06_command_object.remotecontrol.party;

public class LivingroomLightOnCommand implements Command {

    private Light light;

    public LivingroomLightOnCommand(Light light) {
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
