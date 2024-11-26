import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private keeper keeper;
    private Lions lion;
    private Drones drone;

    public Drawing(keeper keeper, Lions lion, Drones drone) {
        this.keeper = keeper;
        this.lion = lion;
        this.drone = drone;

    }
}


