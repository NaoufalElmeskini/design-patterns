package config;

import behavioral.command.HomeDashBoard;
import behavioral.command.Room;
import behavioral.command.SwitchLightsCommand;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class Config {

    @Bean
    public HomeDashBoard homeDashBoard() {
        return new HomeDashBoard(room("Main_Room"));
    }

    @Bean
    public Room room(String name) {
        return new Room(name, new SwitchLightsCommand());
    }
}
