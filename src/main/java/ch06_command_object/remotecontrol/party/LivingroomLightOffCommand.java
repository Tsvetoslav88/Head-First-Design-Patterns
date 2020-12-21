package ch06_command_object.remotecontrol.party;

public class LivingroomLightOffCommand implements Command {

    private Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
