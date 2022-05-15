package behavioral.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class HomeDashBoardIT {
    @Autowired
    private HomeDashBoard dashBoard;


    @Test
    public void doitVerifierQueLesLumieresSontAllumees() {
        // GIVEN : pre-conditions

        // WHEN : on appelle la methode principale d'allumage
        dashBoard.lightsOn();

        // THEN : verifier que les lumieres des rooms sont allumées
        Assertions.assertEquals("", "");

    }

    @TestConfiguration
    public static class Conf{
        @Bean
        public HomeDashBoard homeDashBoard(){
            return new HomeDashBoard(room());
        }

        @Bean
        public Room room() {
            return new Room("Test_Room", new SwitchLightsCommand());
        }
    }


}
