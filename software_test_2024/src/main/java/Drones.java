import java.awt.*;
import java.awt.Color;

public class Drones extends Agents{
    private String frequency;
    private int GPSid;

    public Drones(String name, String frequency, int GPSid) {
        super(name);
        this.frequency = frequency;
        this.GPSid = GPSid;
    }

    public LocationSystem get_location(int GPSid) {
        LocationSystem location = new LocationSystem();
        location.getCoords(GPSid);
        return location;
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(location(GPSid).x, location(GPSid).y, 3,3);
        g.drawString(name, 310,310);
        g.drawString(frequency, 310,310);
    }


}