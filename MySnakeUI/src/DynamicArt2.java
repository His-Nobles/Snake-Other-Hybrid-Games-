import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DynamicArt2 extends JPanel implements ActionListener {
        Timer timer;
        ArrayList<Point> AdvancedDynamicplayer;
        int x = 50;
        int y = 12;



        public DynamicArt2() {
            setBackground(Color.green);
            setOpaque(false);
            setPreferredSize(new Dimension(280,50));
            DrawDynamics();
            timer = new Timer(50, this);
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            DrawDynamols(g);
        }
        public void DrawDynamols(Graphics g){
            g.setColor(new Color((int) (Math.random()*0x10000000)));
            for (Point dynamol:
                    AdvancedDynamicplayer) {
                g.fillRect(dynamol.x, dynamol.y, 60, 15);
            }
        }
        public void DrawDynamics(){

            AdvancedDynamicplayer = new ArrayList<>();
            int numberIs3 = 0;
            for (int i = 3; i > numberIs3; i--){
                int distance = 5;
                AdvancedDynamicplayer.add(new Point(x+(i*distance), y));
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //this is a debugging statement

           // System.out.println("this is an event for dynamic art 2 timer.isrunning ");

            Point newPoint = new Point(AdvancedDynamicplayer.get(0));

              AdvancedDynamicplayer.add(0, newPoint); repaint();
              newPoint.x += 80;
              AdvancedDynamicplayer.remove(AdvancedDynamicplayer.size()-1);
             repaint();

            for (int i = 0; i < AdvancedDynamicplayer.size()-1; i++){
                if(newPoint.x > getWidth()){
                    AdvancedDynamicplayer.get(i).x = 0;
                }
            }

        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Intro Screen");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBackground(Color.red);
            frame.add(new DynamicArt2());
            frame.setSize(400, 180);
            frame.setVisible(true);
        }


}
