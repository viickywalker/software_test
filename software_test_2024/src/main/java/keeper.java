import java.awt.*;
import java.awt.Color;

public class keeper extends Agents{
    private String phone_number;
    private int GPSid;

    public keeper(String name,String phone_number, int GPSid ) {
        super(name);
        this.phone_number = phone_number;
        this.GPSid = GPSid;
    }

    public LocationSystem get_location(int GPSid) {
        LocationSystem location = new LocationSystem();
        location.getCoords(GPSid);
        return location;
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(300,300,2,2);
        g.drawString(name, 50,50);
        g.drawString(phone_number, 50,50);
    }


}
