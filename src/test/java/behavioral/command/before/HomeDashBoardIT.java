package behavioral.command.before;

import config.Config;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Config.class)
class HomeDashBoardIT {
    @Autowired
    private HomeDashBoard dashBoard;




    @Test
    public void doit() {

        dashBoard.lightsOn();
        Assertions.assertEquals("", "");

    }
}
