package behavioral.command.before;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeDashBoardIT {
    private HomeDashBoard dashBoard;


    @Test
    public void doit() {

        dashBoard.lightsOn();
        Assertions.assertEquals("", "");

    }
}
