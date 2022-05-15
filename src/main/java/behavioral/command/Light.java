package behavioral.command;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@Log4j2
public class Light {
    private boolean isSwitchOn = false;


    public void switchLights() {
        log.info("switch : {} -> {}", isSwitchOn, !isSwitchOn);
        isSwitchOn = !isSwitchOn;
    }
}
