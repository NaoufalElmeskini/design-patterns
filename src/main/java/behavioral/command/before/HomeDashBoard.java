package behavioral.command.before;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomeDashBoard {
    private Room room;

    public void lightsOn() {
        room.switchLight();
    }

}
