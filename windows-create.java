import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartClass {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("My Simple Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on close
        frame.setSize(400, 300); // Set the size of the window

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello, World!");
        panel.add(label); // Add the label to the panel

        frame.add(panel); // Add the panel to the frame
        frame.setVisible(true); // Make the window visible
    }
}
