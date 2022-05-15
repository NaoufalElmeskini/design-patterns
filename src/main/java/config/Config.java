package config;

import behavioral.command.before.HomeDashBoard;
import behavioral.command.before.Room;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class Config {

    @Bean
    public HomeDashBoard homeDashBoard() {
        return new HomeDashBoard(room());
    }

    @Bean
    public Room room() {
        return new Room();
    }
}
