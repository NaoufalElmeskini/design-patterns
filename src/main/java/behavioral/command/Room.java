package behavioral.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
public class Room {
    private final String name;
    private final Command switchLightsCommand;


    public void switchLight() {
        log.info("room: {}", name);
        switchLightsCommand.execute();
    }
}
