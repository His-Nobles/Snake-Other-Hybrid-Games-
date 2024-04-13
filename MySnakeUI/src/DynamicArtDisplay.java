import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DynamicArtDisplay extends JPanel implements ActionListener {
    private final int width = 600; // Width of the window
    private final int height = 100; // Height of the window
    private Timer timer, timerr ; // Timer to update the display
    private int dynamicController = 0;
   // private String text = "Snake Game The Snake"; // Initialize with default text
    private JButton btn = new JButton("Start"); // Initialize the button

    public DynamicArtDisplay() {
        timer = new Timer(50, this);
        timer.start();
        this.setPreferredSize(new Dimension(width, height));
        this.setLayout(null); // Use null layout to manually position components
        btn.setBounds(350, 130, 100, 30); // Set position and size of the button
        btn.addActionListener(e -> {
        remove(btn);
        validate();

        }); timer.start();
        this.add(btn);
        btn.setVisible(false);

        // Initially hide the button
        // Set the timer to trigger every 150 milliseconds

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawRandomShapes(g);
//        drawTextOverShapes(g); // Use the updated text

    }

    private void drawRandomShapes(Graphics g) {
        Random rand = new Random();
        for (int i = 0; i <= 10; i++) {
            int x = rand.nextInt(width);
            int y = rand.nextInt(height);
            int size = rand.nextInt(5) + 15;
            int r = rand.nextInt(256);
            int gColor = rand.nextInt(256);
            int b = rand.nextInt(256);
            g.setColor(new Color(r, gColor, b));
            if (rand.nextBoolean()) {
                g.fillOval(x, y, size, size);
            } else {
                g.fillRect(x, y, size, size);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        dynamicController++;
        if (dynamicController >= 200) {
            ((Timer) e.getSource()).stop();
            btn.setVisible(true); // Show the button
        }
        repaint(); // Request the component to be repainted
    }

//    private void drawTextOverShapes(Graphics g, String text) {
//        Font font = new Font("wide latin", Font.BOLD, 25);
//        g.setFont(font);
//        g.setColor(Color.BLACK);
//        FontMetrics metrics = g.getFontMetrics(font);
//        int x = (width - metrics.stringWidth(text)) / 2;
//        int y = ((height - metrics.getHeight()) / 2) + metrics.getAscent();
//        g.drawString(text, x, y);
//    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dynamic Art Display");
            DynamicArtDisplay display = new DynamicArtDisplay();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(display);
            frame.pack();
            frame.setLocationRelativeTo(null); // Center the window
            frame.setVisible(true);
        });
    }
}
