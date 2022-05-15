package behavioral.command;

public class SwitchLightsCommand implements Command {
    private Light light;


    @Override
    public void execute() {
        light.switchLights();
    }
}
