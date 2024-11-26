import javax.xml.stream.Location;
import java.awt.*;
import java.awt.Color;

public class Lions extends Agents{
    private String age;
    private int GPSid;

    public Lions(String name, String age, int GPSid) {
        super(name);
        this.GPSid = GPSid;
        this.age = age;
    }

    public LocationSystem get_location(int GPSid) {
        LocationSystem location = new LocationSystem();
        location.getCoords(GPSid);
        return location;
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(50,50,3,3);
        g.drawString(name, 50,50);
        g.drawString(age, 50,50);
    }

}