package ch06_command_object.party;

public class DimmerLightOffCommand implements Command {

    private Light light;
    private int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
