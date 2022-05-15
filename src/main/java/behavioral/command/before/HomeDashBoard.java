package behavioral.command.before;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HomeDashBoard {
    private Room room;

    public void lightsOn() {
        room.switchLight();
    }

}
