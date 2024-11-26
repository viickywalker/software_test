import java.awt.*;
import java.awt.event.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Frame frame_object = new Frame();
        keeper Geoff = new keeper("Geoff", "4392", 80);
        Lions Simba = new Lions("Simba", "7", 30);
        Drones Monitor1 = new Drones("Monitor1", "128MHz", 124);
        Drawing map = new Drawing(Geoff, Simba, Monitor1);
        map.setSize(600, 600);
        map.setBackground(Color.WHITE);
        frame_object.add(map);
        frame_object.setLayout(null);
        frame_object.setSize(600, 600);
        frame_object.setVisible(true);
        frame_object.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame_object.dispose();
            }
        });

    }
}
// I know that the program doesnt actually output the necessary circles but I am unsure about the graphic reaso as to why
// So i have done as much as I could of the requirements despite not actually obtaining any outputs
