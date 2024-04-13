import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class SnakeMain extends JFrame{
    public SnakeMain(){
        super("the snake game");
        setSize(833, 750);
        setLocation(360, 40);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLUE);


        LaunchAndSetting launchAndSetting = new LaunchAndSetting();
        launchAndSetting.setBounds(25, 0, 750, 700);
        add(launchAndSetting);
        setVisible(true);

    }
    public static class LaunchAndSetting extends JPanel implements ActionListener {
Timer timing;
        Timer timing1;

       private int colorChanger;
        JRadioButton snakes1, snakes2, snakes3, snakes4, snakes5, snakes6, snakes7, snakes8, snakes9;
        DynamicArt2 dynamicArt2;
        public LaunchAndSetting() {
            super();
            this.setLayout(null);
            setBackground(Color.ORANGE);

            JLabel welcome, hybrid, gamelevel, snake;

            Border border1 = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.red);
            Border border2 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);

            Border margin = new EmptyBorder(5,5,5,5);

            welcome = new JLabel("Welcome to Snake game | Easy to play");
            welcome.setFont(new Font("wide latin", Font.BOLD, 15));
            welcome.setForeground(Color.red);
            welcome.setOpaque(true);
            welcome.setBackground(Color.ORANGE);
            welcome.setBounds(105,0, 495, 50);
            welcome.setBorder(border2);


            KeyboardFocusManager.getCurrentKeyboardFocusManager().addPropertyChangeListener("focus", evt -> System.out.println("Focus is with "+ evt.getNewValue()));


           dynamicArt2 = new DynamicArt2();
            dynamicArt2.setVisible(true);

            JPanel dynamic1 = new JPanel();
            dynamic1.setOpaque(false);
            dynamic1.setLayout(new FlowLayout());
            dynamic1.setBounds(40, 50,265, 40);
            dynamic1.add(dynamicArt2, SwingConstants.CENTER);

            hybrid = new JLabel("HYBRID GAMES");
            hybrid.setFont(new Font("elephant", Font.ITALIC, 20));
            hybrid.setForeground(Color.black);
            hybrid.setOpaque(false);
            hybrid.setBounds(317, 30, 350, 75);
            hybrid.setBorder(new CompoundBorder(border1, margin));
            String string = "<html><p>Select A</p>"+
                             "<p>--------Game Level</p></html>";
            gamelevel = new JLabel(string);
            gamelevel.setFont(new Font("times new roman", Font.ITALIC, 21));
            gamelevel.setForeground(Color.red);
            gamelevel.setOpaque(false);
            gamelevel.setBounds(110, 115, 219, 63);

            String string2 = "<html><p> Select your  </p>"+
                             "<p>-----preferred Snake</p></html>";

            snake = new JLabel(string2);
            snake.setFont(new Font("times new roman", Font.ITALIC, 21));
            snake.setForeground(Color.blue);
            snake.setOpaque(false);
            snake.setBounds(420, 98, 315, 93);


            JButton gameCardbutton = new JButton("Start");
            gameCardbutton.setFont(new Font("elephant", Font.BOLD, 16));
            gameCardbutton.addActionListener(this);
            gameCardbutton.setOpaque(true);
            gameCardbutton.setBounds(573, 525, 75, 50);
            gameCardbutton.setBorder(BorderFactory.createLineBorder(Color.red, 2, true));

            JPanel levels, snakes;

            levels = new JPanel();
            levels.setBackground(Color.lightGray);
            levels.setBounds(80, 193, 171, 320);
            levels.setLayout(null);
            levels.setBorder(BorderFactory.createMatteBorder(1,1,0,0,Color.green));

            snakes = new JPanel();
            snakes.setBackground(Color.white);
            snakes.setBounds(450, 193, 200, 320);
            snakes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1,1,0,0,Color.green),"Select a snake here"));

            JCheckBox musicBox, soundBox;
            musicBox = new JCheckBox("Music ON/OFF", true);
            musicBox.setBackground(Color.green);
            musicBox.setFont(new Font("arial black", Font.BOLD, 15));
            musicBox.setBounds(280, 230, 150, 25);

            soundBox = new JCheckBox("Sound ON/OFF", true);
            soundBox.setBackground(Color.green);
            soundBox.setFont(new Font("arial black", Font.BOLD, 15));
            soundBox.setBounds(280, 260, 150, 25);


            Font font = new Font("Elephant", Font.PLAIN, 15);
            Color colorblue = new Color(225, 215, 19);

            JRadioButton level1 = new JRadioButton("Easy Grassy", true);
            level1.setFont(font);
            level1.setBounds(10,8,150, 25);
            level1.setBackground(colorblue);


            JRadioButton level2 = new JRadioButton("Medium Dunes");
            level2.setFont(font);
            level2.setBounds(10, 40, 150, 25);
            level2.setBackground(colorblue);


            JRadioButton level3 = new JRadioButton("Jungle Maze");
            level3.setFont(font);
            level3.setBounds(10, 72, 150, 25);
            level3.setBackground(colorblue);

            JRadioButton level4 = new JRadioButton("Grassy Trails");
            level4.setFont(font);
            level4.setBounds(10, 105, 150, 25);
            level4.setBackground(colorblue);

            JRadioButton level5 = new JRadioButton("Volcanic Burrows");
            level5.setFont(font);
            level5.setBounds(10, 138, 150, 25);
            level5.setBackground(colorblue);

            JRadioButton level6 = new JRadioButton("Neon Night ");
            level6.setFont(font);
            level6.setBounds(10,171, 150, 25 );
            level6.setBackground(colorblue);

            JRadioButton level7 = new JRadioButton("Water Loo");
            level7.setFont(font);
            level7.setBounds(10, 204, 150, 25);
            level7.setBackground(colorblue);

            JRadioButton level8 = new JRadioButton("Cosmic Vents");
            level8.setFont(font);
            level8.setBounds(10,237, 150, 25 );
            level8.setBackground(colorblue);

            JRadioButton level9 = new JRadioButton("Java levels");
            level9.setFont(font);
            level9.setBounds(10, 270, 150, 25);
            level9.setBackground(colorblue);





            snakes1 = new JRadioButton("Python", true);
            snakes2 = new JRadioButton("Cobra");
            snakes3 = new JRadioButton("Anaconda");
            snakes4 = new JRadioButton("Viper");
            snakes9 = new JRadioButton("Neon Snakes");
            snakes5 = new JRadioButton("king Snake");
            snakes6 = new JRadioButton("Black Mamba");
            snakes7 = new JRadioButton("White Mamba");
            snakes8 = new JRadioButton("King Java");

            level1.addActionListener(e -> snakes1.setSelected(true));
            level2.addActionListener(e -> snakes4.setSelected(true));
            level3.addActionListener(e -> snakes2.setSelected(true));
            level4.addActionListener(e -> snakes3.setSelected(true));
            level5.addActionListener(e -> snakes5.setSelected(true));
            level6.addActionListener(e -> snakes9.setSelected(true));
            level7.addActionListener(e -> snakes7.setSelected(true));
            level8.addActionListener(e -> snakes6.setSelected(true));
            level9.addActionListener(e -> snakes8.setSelected(true));

            snakes1.addActionListener(e -> level8.setSelected(true));
            snakes2.addActionListener(e -> level3.setSelected(true));
            snakes3.addActionListener(e -> level4.setSelected(true));
            snakes4.addActionListener(e -> level2.setSelected(true));
            snakes5.addActionListener(e -> level5.setSelected(true));
            snakes6.addActionListener(e -> level8.setSelected(true));
            snakes7.addActionListener(e -> level7.setSelected(true));
            snakes8.addActionListener(e -> level9.setSelected(true));
            snakes9.addActionListener(e -> level6.setSelected(true));

            ButtonGroup group = new ButtonGroup();
            group.add(level1);
            group.add(level2);
            group.add(level3);
            group.add(level4);
            group.add(level5);
            group.add(level6);
            group.add(level7);
            group.add(level7);
            group.add(level8);
            group.add(level9);

            levels.add(level1);
            levels.add(level2);
            levels.add(level3);
            levels.add(level4);
            levels.add(level5);
            levels.add(level6);
            levels.add(level7);
            levels.add(level8);
            levels.add(level9);

            ButtonGroup group1 = new ButtonGroup();
            group1.add(snakes1);
            group1.add(snakes2);
            group1.add(snakes3);
            group1.add(snakes4);
            group1.add(snakes5);
            group1.add(snakes9);
            group1.add(snakes6);
            group1.add(snakes7);
            group1.add(snakes8);

            snakes.add(snakes1);
            snakes.add(snakes2);
            snakes.add(snakes3);
            snakes.add(snakes3);
            snakes.add(snakes4);
            snakes.add(snakes9);
            snakes.add(snakes5);
            snakes.add(snakes6);
            snakes.add(snakes7);
            snakes.add(snakes8);


            JButton neon_key = new JButton("Neon");

            neon_key.setBounds(75, 525, 80, 50);
            neon_key.setBorder(BorderFactory.createLineBorder(Color.red, 2, true));
            neon_key.setFont(new Font("elephant", Font.BOLD, 16));

            neon_key.addActionListener(e -> {
               colorChanger ++;
               if (colorChanger == 1){
                  setBackground(Color.BLACK);
                  hybrid.setForeground(Color.white);
               }
               else if(colorChanger ==2){
                   setBackground(Color.magenta);
               }else if (colorChanger == 3){
                   setBackground(Color.gray);
               } else if (colorChanger==4) {
                   setBackground(Color.yellow);
               } else if (colorChanger==5) {
                   setBackground(Color.GREEN);
               } else if (colorChanger>5) {
                   colorChanger=0;
                   setBackground(Color.ORANGE);
                   hybrid.setForeground(Color.BLACK);
               }
            });

            timing1 = new Timer(100, e ->  {

                // this is a debugging statement
                System.out.println("this is a neon button timer.isrunning");

                Color color = new Color((int)(Math.random()*0x10000000));
                gameCardbutton.setBackground(color);
                neon_key.setBackground(color);
            });timing1.start();

            timing = new Timer(100, e -> {
                //this is a debbuging massege
                System.out.println("this is a game start button still running");
            Color color = new Color((int)(Math.random()*0x10000000));
            gameCardbutton.setForeground(color);
            neon_key.setForeground(color);
            });timing.start();

            add(neon_key);
            String string3 = "<html><p>Nobles Crown👑 Inc™</p></html>";

            JLabel NoblesCrownInc = new JLabel(string3, SwingConstants.CENTER);
            NoblesCrownInc.setBackground(Color.lightGray);
            NoblesCrownInc.setFont(new Font("Algerian", Font.BOLD, 18));
            NoblesCrownInc.setForeground(Color.red);
            NoblesCrownInc.setOpaque(true);
            NoblesCrownInc.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0,Color.red));
            NoblesCrownInc.setBounds(180, 610, 380, 50);

            add(welcome);
            add(dynamic1);
            add(hybrid);
            add(gamelevel);
            add(snake);
            add(levels);
            add(musicBox);
            add(soundBox);
            add(snakes);
            add(NoblesCrownInc);
            add(gameCardbutton);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            timing.stop();
            timing1.stop();
            dynamicArt2.timer.stop();

                GameMainLaucher();

        }
        public void GameMainLaucher() {
            SnakeMain snakeMain = (SnakeMain) SwingUtilities.getWindowAncestor(this);

            snakeMain.getContentPane().removeAll();
            if (snakes1.isSelected()) {
                PythonARENA pythonARENA = new PythonARENA();
                pythonARENA.setVisible(true);
                pythonARENA.requestFocusInWindow();
                snakeMain.getContentPane().setLayout(null);

                JPanel controlPanel = new JPanel();
                controlPanel.setLayout(null);

                controlPanel.setBounds(0, 0, 817, 720);
                controlPanel.add(pythonARENA);
                controlPanel.repaint();
                controlPanel.revalidate();
                controlPanel.setVisible(true);
//
                snakeMain.getContentPane().add(controlPanel);
                snakeMain.repaint();
                snakeMain.revalidate();
            } else if (snakes2.isSelected()) {
                cobraArena cobraArena = new cobraArena();
                cobraArena.setVisible(true);
                cobraArena.requestFocusInWindow();

                snakeMain.getContentPane().setLayout(null);
                JPanel controlPanel = new JPanel();
                controlPanel.setLayout(null);

                controlPanel.setBounds(0, 0, 817, 720);
                controlPanel.add(cobraArena);
                controlPanel.repaint();
                controlPanel.revalidate();
                controlPanel.setVisible(true);
//
                snakeMain.getContentPane().add(controlPanel);
                snakeMain.repaint();
                snakeMain.revalidate();

            }

        }

    }


    ///////////////////////Java™ A Product of _$Nobles Crown™ ❤💖 primary code by John mucheru
public static class PythonARENA extends JPanel {
        private ArrayList<Point> snakeBody;
        private static Point foodPositioning;
        private String direction = "RIGHT";
        public Timer myGameTimer;
        private final Point startPosition = new Point(380, 375);
        public int score_;
        private boolean isPaused;
        private boolean gameIsOver = false;
        JLabel ScoreLabel;
        int delay2 = 80;

        String string;
int cout = -50;


        JLabel  gameScore;
JLabel userNamePlay, jLabel;
        int decider;
        Timer userNamejogger, timer1, timer2, timer3, timer4, timer5, timer6;

JLabel l1, l2, l3, l4, l5, l6, r1, r2, r3, r4, r5, r6;



        JPanel leftArena, userNamePLayer, noblesPlayer,cog, noblesPanel, rightArena, firstScore,lastScore, bottomArena, toprightArena,topAnimatedPanel,topleftArna;
        JLabel greeting,crownLabel, userName, scoregame, infoONGame, forUser, forName;
        JTextField usersField;
        JButton okayName;
         JPanel tickers1, tickers2;
        int count  = 0;



        public PythonARENA() {
            super();
            setBackground(Color.black);
            setLayout(null);
            setBounds(0, 0, 833, 750);
            setFocusable(true);
            requestFocusInWindow();
            setPreferredSize(new Dimension(817, 720));

            Font font = new Font("wide latin", Font.BOLD, 20);

            l1 = new JLabel("<");
            l1.setFont(font);
            l2 = new JLabel("<");
            l2.setFont(font);
            l3 = new JLabel("<");
            l3.setFont(font);
            l4 = new JLabel("<");
            l4.setFont(font);
            l5 = new JLabel("<");
            l5.setFont(font);
            l6 = new JLabel("<");
            l6.setFont(font);

            r1 = new JLabel(">");
            r1.setFont(font);
            r2 = new JLabel(">");
            r2.setFont(font);
            r3 = new JLabel(">");
            r3.setFont(font);
            r4 = new JLabel(">");
            r4.setFont(font);
            r5 = new JLabel(">");
            r5.setFont(font);
            r6 = new JLabel(">");
            r6.setFont(font);

            timer1 = new Timer(100, e -> {
                Color color = new Color((int)(Math.random()*0x10000000));
                r1.setForeground(color);
                l1.setForeground(color);

            });

            timer2 = new Timer(100, e -> {
                Color color = new Color((int)(Math.random()*0x10000000));
                r2.setForeground(color);
                l2.setForeground(color);

            });

            timer3 = new Timer(100, e -> {
                Color color = new Color((int)(Math.random()*0x10000000));
                r3.setForeground(color);
                l3.setForeground(color);

            });

            timer4 = new Timer(100, e -> {
                Color color = new Color((int)(Math.random()*0x10000000));
                r4.setForeground(color);
                l4.setForeground(color);

            });

            timer5 = new Timer(100, e -> {
                Color color = new Color((int)(Math.random()*0x10000000));
                r5.setForeground(color);
                l5.setForeground(color);

            });

            timer6 = new Timer(100, e -> {
                Color color = new Color((int)(Math.random()*0x10000000));
                r6.setForeground(color);
                l6.setForeground(color);

            });


//This here below is the white panel whowing on the left side of the snake arena it contains the...

            leftArena = new JPanel();
            leftArena.setBounds(0, 150, 184, 450);
            leftArena.setOpaque(true);
            leftArena.setLayout(null);

             userNamePLayer = new JPanel();
            userNamePLayer.setBounds(2, 3, 180, 200);
            userNamePLayer.setBackground(Color.green);
            userNamePLayer.setLayout(null);

            leftArena.add(userNamePLayer);

            tickers1 = new JPanel();
            tickers1.setBackground(Color.white);
            tickers1.setBounds(2, 215, 180, 45);

            tickers1.add(l1);
            tickers1.add(l2);
            tickers1.add(l3);
            tickers1.add(l4);
            tickers1.add(l5);
            tickers1.add(l6);


            leftArena.add(tickers1);

            noblesPlayer = new JPanel();
            noblesPlayer.setBounds(2, 250, 180, 200);
            noblesPlayer.setBackground(Color.yellow);

            JLabel snakeTypes = new JLabel("PYTHON");
            snakeTypes.setForeground(Color.red);
            snakeTypes.setFont(new Font("algerian", Font.BOLD, 25));

            noblesPlayer.add(snakeTypes, SwingConstants.CENTER);

            leftArena.add(noblesPlayer);


            add(leftArena);

//This is the panel on exactly the opposite side of the one on top

             rightArena = new JPanel();
            rightArena.setBounds(634, 150, 184, 450);
            rightArena.setOpaque(true);
            rightArena.setLayout(null);

            firstScore = new JPanel();
            firstScore.setBackground(Color.green);
            firstScore.setBounds(2, 3, 180, 200);
            firstScore.setLayout(null);

            rightArena.add(firstScore);

            tickers2 = new JPanel();
            tickers2.setBackground(Color.white);
            tickers2.setBounds(2, 215, 182, 45);


            tickers2.add(r1);
            tickers2.add(r2);
            tickers2.add(r3);
            tickers2.add(r4);
            tickers2.add(r5);
            tickers2.add(r6);

            rightArena.add(tickers2);

            lastScore = new JPanel();
            lastScore.setBackground(Color.yellow);
            lastScore.setBounds(2, 250, 180, 200);

            JLabel snakeType = new JLabel("PYTHON");
            snakeType.setFont(new Font("algerian", Font.BOLD, 25));
            snakeType.setForeground(Color.red);

            lastScore.add(snakeType, SwingConstants.CENTER);

            rightArena.add(lastScore);

            add(rightArena);

//This is the bottom panel, will contain Nobles crown inc and more

             bottomArena = new JPanel();
            bottomArena.setOpaque(true);
            bottomArena.setBounds(0, 600, 833, 150);
            bottomArena.setLayout(null);
            bottomArena.setBackground(Color.blue);
            bottomArena.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.white));

             noblesPanel = new JPanel();
            noblesPanel.setBackground(Color.white);
            noblesPanel.setBorder(BorderFactory.createMatteBorder(3, 0, 3, 0, Color.black));
            noblesPanel.setBounds(166, 45, 500, 45);

             crownLabel = new JLabel("<html>Nobles👑 Crown Inc™");
            crownLabel.setForeground(Color.BLUE);
            crownLabel.setFont(new Font("wide latin", Font.ITALIC, 26));

            noblesPanel.add(crownLabel);
            bottomArena.add(noblesPanel);
            add(bottomArena);

//This panel is the topmost, it will say greeting and some animation done matually

             topAnimatedPanel = new JPanel();
            topAnimatedPanel.setBounds(0, 0, 820, 30);
            topAnimatedPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red));
            topAnimatedPanel.setOpaque(true);
            topAnimatedPanel.setLayout(null);

            greeting = new JLabel("Noble Sir. How a you doing today, welcome to the game", SwingConstants.CENTER);
            greeting.setForeground(Color.BLACK);
            greeting.setBounds(100, 0, 649, 30);

            ImageIcon imageIcon = new ImageIcon("my project cog.png");

             cog = new JPanel();
             cog.setLayout(null);
            cog.setBounds(5, 2, 100, 25);

            JButton anonymouslyHAHA = new JButton("settings", imageIcon);
            anonymouslyHAHA.setBounds(0,0, 100, 25);

            topAnimatedPanel.add(cog);
            topAnimatedPanel.add(greeting, SwingConstants.CENTER);
            add(topAnimatedPanel);

//This here is the panel on the left in mangeta or so, it is not topmost neither does it go down to end

            topleftArna = new JPanel();
            topleftArna.setBackground(Color.magenta);
            topleftArna.setOpaque(true);
            topleftArna.setBounds(0, 30, 184, 120);
            topleftArna.setLayout(null);

             userName = new JLabel("         Enter your user-Name");
            userName.setBounds(2, 5, 180, 30);

            topleftArna.add(userName, SwingConstants.CENTER);

             usersField = new JTextField();
            usersField.setBounds(2, 40, 180, 30);

            topleftArna.add(usersField);

            okayName = new JButton("Okay");
            okayName.setBackground(Color.green);
            okayName.setBounds(40, 80, 80, 30);
            okayName.setFocusable(false);


            add(topleftArna);


//this one is exactly opposite the one above, simply on the right side with game score on top

             toprightArena = new JPanel();
            toprightArena.setBackground(Color.magenta);
            toprightArena.setOpaque(true);
            toprightArena.setBounds(634, 30, 184, 120);
            toprightArena.setLayout(null);

             gameScore = new JLabel("Game");
            gameScore.setBounds(15, 10, 150, 35);
            gameScore.setForeground(Color.BLUE);
            gameScore.setFont(new Font("Elephant", Font.ITALIC, 35));

            toprightArena.add(gameScore);

            forUser = new JLabel("4");
            forUser.setForeground(Color.black);
            forUser.setFont(new Font("ink free", Font.ITALIC, 30));
            forUser.setBounds(113, 35, 30, 30);
            forUser.setVisible(false);

            toprightArena.add(forUser);

            forName = new JLabel("<html>Add your name<p> to see your <p>scores ", SwingConstants.CENTER);
            forName.setFont(new Font("wide latin", Font.PLAIN, 15));
            forName.setForeground(Color.black);
            forName.setBounds(2, 30, 184, 80);

            toprightArena.add(forName);

            scoregame = new JLabel("Score");
            scoregame.setFont(new Font("forte", Font.BOLD, 30));
            scoregame.setForeground(Color.white);
            scoregame.setBounds(45, 40, 90, 30);


            toprightArena.add(scoregame);

            add(toprightArena);

//this is a Label to trim the snake arena on in top,

           infoONGame = new JLabel("<html>                       Assertive snake!🐍<p> goes for food over itself</html>", SwingConstants.CENTER);
            infoONGame.setBackground(Color.white);
            infoONGame.setFont(new Font("algerian", Font.BOLD, 15));
            infoONGame.setOpaque(true);
            infoONGame.setBounds(184, 100, 450, 50);
            infoONGame.setBorder(BorderFactory.createMatteBorder(2, 0, 1, 0, Color.black));

            add(infoONGame);


            okayName.addActionListener(e -> {
                String[] greetings = {"Hello! Never get bored ", "Hae, have fun! ", "Welcome To The Game, ", "Big boss, how a you doing ", "Time Precious Time, Time To Play ", "Nailed it, Welcome back ","We pray, and we play, time to play ", "Lovely Quest i missed you ","Snake Game has never been fun, Taste this ", "Snake game, Snake game, fun is in pc ","😂i missed you " };

                try{

                    String name = usersField.getText();
                    if (name.isEmpty() && count == 0){
                        count++;
                        userName.setText("Enter Your UserName");
                    } else if (name.isEmpty() && count == 1){
                        count++;
                        userName.setText("To Start, Enter Name");
                    } else if(name.isEmpty() && count==2){
                        count =0;
                        userName.setText("Enter Name First:");
                    }
                    else {
                        forUser.setVisible(true);
                        forName.setText(name);
                        usersField.setText("");

                        userNamePLayer.removeAll();
                        userNamePLayer.repaint();
                        firstScore.removeAll();
                        firstScore.repaint();

                        timer1.start();timer2.start();timer3.start();
                        timer4.start();timer5.start();timer6.start();
                        Random random = new Random();
                        int index = random.nextInt(greetings.length);
                        greeting.setText(greetings[index] +name);
                        greeting.setForeground(new Color((int)(Math.random()*0x10000000)));
                        greeting.setFont(new Font("engravers mt", Font.BOLD, 15));

                        userNamePLayer.setBackground(Color.yellow);
                        noblesPlayer.setBackground(Color.green);
                        firstScore.setBackground(Color.yellow);
                        lastScore.setBackground(Color.green);

                          string = "<html><p>Crown Of Africa</p>"+
                                "<p>     object games</p>"+
                                "<p>we play we play</p></html>";
                       jLabel = new JLabel(string);
                       jLabel.setFont(new Font("wide latin", Font.ITALIC, 20));
                        jLabel.setBounds(2, 2, 184, 180);

                        userNamePlay = new JLabel(string);
                        userNamePlay.setFont(new Font("wide latin", Font.ITALIC, 15));
                        userNamePlay.setBounds(2,2,184, 180);
delay2 = 80;

                        userNamejogger = new Timer(delay2, e1 -> {
                            decider++;
                            boolean rules = false;
                            if (decider > 50 && decider <410){
                                    movePlayerName();userNamePLayer.repaint();firstScore.repaint();


                            }if (decider > 230) {
                                //exchange the colors
                                userNamePLayer.setBackground(new Color(146, 154, 180));
                                firstScore.setBackground(new Color(146,154,180));
                                noblesPlayer.setBackground(Color.green);
                                lastScore.setBackground(Color.green);

                                jLabel.setText("<html><p>*****************</p>" +
                                        "             <p>*****************</p>" +
                                        "             <p>*****************</p>" +
                                        "             <p>*****************</p>" +
                                        "             <p>*****************</p></html>");
                                jLabel.setFont(new Font("wide latin", Font.BOLD, 15));

                                userNamePlay.setText("<html><p>*****************</p>" +
                                        "             <p>*****************</p>" +
                                        "             <p>*****************</p>" +
                                        "             <p>*****************</p>" +
                                        "             <p>*****************</p></html>");
                                userNamePlay.setFont(new Font("wide latin", Font.BOLD, 15));
                            }
                                if (decider > 410 && decider < 970){

                                    setnewPlayer();
delay2 +=2;
                                    jLabel.setText("<html><p> Catch your good score Snake Masters score!, they score more that haha! </p>");

                                    firstScore.removeAll();
                                    firstScore.repaint();

                                     JLabel notify = new JLabel("Your Score:");
                                     notify.setFont(new Font("forte", Font.BOLD, 25));
                                     notify.setBounds(15, 20, 150, 80);
                                   firstScore.add(notify);

                                     JLabel scoreNotify = new JLabel(""+getScore_());
                                     scoreNotify.setBounds(60, 2, 100, 35);
                                     scoreNotify.setFont(new Font("san serif", Font.ITALIC, 20));

                                     JPanel Scorenotified = new JPanel();
                                     Scorenotified.setBackground(Color.gray);
                                     Scorenotified.setLayout(null);
                                     Scorenotified.setBounds(0, 100, 184, 40);
                                     Scorenotified.add(scoreNotify, BorderLayout.CENTER);

                                     firstScore.add(Scorenotified);
                                }
                                if (decider>770)decider=0;

                            Color radomColor = new Color((int) (Math.random()*0x200));
                            jLabel.setForeground(radomColor);
                            userNamePlay.setForeground(radomColor);
                            repaint();
                        });
                        userNamejogger.start();

                        firstScore.add(userNamePlay);
                        userNamePLayer.add(jLabel);


                    }
                } catch (Exception ignored) {

                }
                this.requestFocusInWindow();
            });

            topleftArna.add(okayName);



            JPanel scorePanel = new JPanel();
            scorePanel.setBackground(Color.gray);
            scorePanel.setBounds(184, 30, 450, 70);
            scorePanel.setLayout(null);
            Border newborder = BorderFactory.createMatteBorder(0, 0, 6, 0, Color.white);
            scorePanel.setBorder(newborder);

            ScoreLabel = new JLabel("Score: 0");
            ScoreLabel.setPreferredSize(new Dimension(80, 20));
            ScoreLabel.setLayout(new BorderLayout());
            ScoreLabel.setOpaque(true);
            ScoreLabel.setFont(new Font("wide latin", Font.BOLD, 25));
            ScoreLabel.setBackground(Color.lightGray);
            ScoreLabel.setForeground(Color.RED);
            ScoreLabel.setBounds(22, 10, 410, 50);

            scorePanel.add(ScoreLabel, SwingConstants.CENTER);
            topleftArna.add(scorePanel);

            anonymouslyHAHA.addActionListener(e -> {
                SwingUtilities.invokeLater(()-> {
                    myGameTimer.stop();
                    if (userNamejogger != null) {
                        SwingUtilities.invokeLater(() -> userNamejogger.stop());
                    }if (timer1 != null){
                        SwingUtilities.invokeLater(()-> timer1.stop());
                    }if (timer2 != null){
                        SwingUtilities.invokeLater(()-> timer2.stop());
                    }if (timer3 != null){
                        SwingUtilities.invokeLater(()-> timer3.stop());
                    }if (timer4 != null){
                        SwingUtilities.invokeLater(()-> timer4.stop());
                    }if (timer5 != null){
                        SwingUtilities.invokeLater(()-> timer5.stop());
                    }if (timer6 != null){
                        SwingUtilities.invokeLater(()-> timer6.stop());
                    }
                });
                setScore_(0);
                settingsButton();
            });

            cog.add(anonymouslyHAHA);

            Random random = new Random();


            int positionX = (random.nextInt(642-192 +4 )+187);
            int positionY = (random.nextInt(600-150 +4 )+154);

            initializeSnake();
            foodPositioning = new Point(positionX, positionY);

            int delay = 100;
            myGameTimer = new Timer(delay, e -> {
                System.out.println("this is a timer instance from the game arena class");
                moveSnake();
                repaint();
            });

            add(scorePanel);
            setUpKeyBindings();
        }


public void settingsButton(){  //this is the button at the top right corner of the game aren that takes you back to the setting frame
            JFrame myFrame = (SnakeMain) SwingUtilities.getWindowAncestor(this);
            myFrame.getContentPane().removeAll();
            myFrame.getContentPane().repaint();
            myFrame.getContentPane().revalidate();

            myFrame.setLayout(null);
            myFrame.setBackground(Color.BLUE);


             LaunchAndSetting launchAndSetting = new LaunchAndSetting();
             launchAndSetting.setBounds(25, 0, 750, 700);
             myFrame.getContentPane().add(launchAndSetting);
             setVisible(true);

           myFrame.getContentPane().repaint();
           myFrame.getContentPane().revalidate();
        }




        int counterX = 0;
        int counter2 = 0;
        public void movePlayerName(){   //method for moving the player name across the player panel
            System.out.println("move player name called");
            counterX ++;
            if (counterX>userNamePLayer.getWidth() || counterX > firstScore.getWidth()){
                counter2++;
                counterX=0;
                if (counter2==2){
                    System.out.println();
                    //it will do this
                    //i might add several if - else several like 20, to keep the enter name dynamic
                }

            }
            jLabel.setBounds(counterX, 2, 184, 180);
            userNamePlay.setBounds(counterX, 2, 184, 180);

        }
        int x = 184;
        public void setnewPlayer(){
            System.out.println("call me new setplayer method, haha");
            x--;
            jLabel.setBounds(x, 80, 1000, 50);
        }



        public void startGame(){
            if (!myGameTimer.isRunning()) SwingUtilities.invokeLater(()->myGameTimer.start());

        }

        @Override
       public void paintComponent(Graphics g){
           super.paintComponent(g);
           drawSnake(g);
           drawFood(g);
        }
        private void drawSnake(Graphics g){
            //code for snake
            g.setColor(Color.green);
            for (Point segment : snakeBody) {
                g.fillRect(segment.x, segment.y, 5,5);

            }
        }
        private void drawFood(Graphics g){
            //code for food
            g.setColor(Color.red);
            g.fillOval(foodPositioning.x, foodPositioning.y, 10,10);
        }

        private void initializeSnake(){
            snakeBody = new ArrayList<>();

            int initialLength = 0;
            for (int i = 10; i > initialLength; i--) {
                // Add new segments to the left of the starting position
                int segmentSize = 10;
                snakeBody.add(new Point(startPosition.x + (i * segmentSize), startPosition.y));

            }
        }
        private void moveSnake(){
           // System.out.println("moveSnake has been called");
           Point newHead = new Point(snakeBody.get(0));

            switch (direction) {
                case "RIGHT" -> {
                    newHead.x += 10;
                    {
                    }
                }
                case "LEFT" -> {
                    newHead.x -= 10;
                    {
                    }
                }
                case "UP" -> {
                    newHead.y -= 10;
                    {
                    }
                }
                case "DOWN" -> {
                    newHead.y += 10;
                    {
                    }
                }
            }
           //to move the snake the one step made so far
            snakeBody.add(0, newHead); repaint();

            if (checkHeadAtFood()){
                if (score_%10 == 0 && score_>=30){
                    score_= score_+50;
                } score_= score_ +5;
                ScoreLabel.setText("Score "+score_);
                upDateFoodPosition();
                repaint();

            } else {
                snakeBody.remove(snakeBody.size() - 1);
                repaint();
            }
            repaint();

           if (CheckBoundaryCollision()){
               gameOver1();

           }

        }
        public int getScore_() {
            return score_;
        }
        public int setScore_(int score){
            this.score_ = score;
            return score_;
        }

        private boolean CheckBoundaryCollision(){
            return snakeBody.get(0).x < 183 || snakeBody.get(0).x > 633 || snakeBody.get(0).y < 149 || snakeBody.get(0).y > 600;
        }
        private boolean checkHeadAtFood(){
            final int tolerance = 10;
            return Math.abs(snakeBody.get(0).x - foodPositioning.x) < tolerance && Math.abs(snakeBody.get(0).y - foodPositioning.y) < tolerance;
        }

        private void setUpKeyBindings() {
            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "UP");
            getActionMap().put("UP", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!"DOWN".equals(direction)) direction = "UP";
                }
            });

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "DOWN");
            getActionMap().put("DOWN", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!"UP".equals(direction)) direction = "DOWN";
                }
            });

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "LEFT");
            getActionMap().put("LEFT", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!"RIGHT".equals(direction)) direction = "LEFT";
                }
            });

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "RIGHT");
            getActionMap().put("RIGHT", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!"LEFT".equals(direction)) direction = "RIGHT";
                }
            });

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "SPACE");
            getActionMap().put("SPACE", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {

                        startGame(); // Implement your start game logic here
                        gamePaused(); // Implement your game pause/resume toggle here

                }
            });
        }


        private void gamePaused(){
            isPaused = !isPaused;
            if (isPaused) myGameTimer.stop();
            else myGameTimer.start();
        }
        private void gameOver1(){
            myGameTimer.stop();
            SwingUtilities.invokeLater(()-> {
                myGameTimer.stop();
                if (userNamejogger != null) {
                    SwingUtilities.invokeLater(() -> userNamejogger.stop());
                }if (timer1 != null){
                    SwingUtilities.invokeLater(()-> timer1.stop());
                }if (timer2 != null){
                    SwingUtilities.invokeLater(()-> timer2.stop());
                }if (timer3 != null){
                    SwingUtilities.invokeLater(()-> timer3.stop());
                }if (timer4 != null){
                    SwingUtilities.invokeLater(()-> timer4.stop());
                }if (timer5 != null){
                    SwingUtilities.invokeLater(()-> timer5.stop());
                }if (timer6 != null){
                    SwingUtilities.invokeLater(()-> timer6.stop());
                }

                setScore_(0);

            });
            gameIsOver = true;

            this.setVisible(false);
            GameOver gameOver = new GameOver(this);
            SnakeMain topFrame = (SnakeMain) SwingUtilities.getWindowAncestor(this);
             topFrame.getContentPane().removeAll();
             topFrame.getContentPane().setLayout(new FlowLayout());
            gameOver.setVisible(true);
             topFrame.getContentPane().add(gameOver);
             topFrame.repaint();
             topFrame.revalidate();

        }
        private static void upDateFoodPosition(){
            Random random2 = new Random();
            int positionX = (random2.nextInt(450)+183);
            int positionY = (random2.nextInt(450)+147);
            foodPositioning = new Point(positionX, positionY);
        }

        @Override
        public void addNotify() {
            super.addNotify();
            requestFocusInWindow();
        }

    }
//////////////////////////class cobra///////////////////////////////////////////////////////////
    public static class cobraArena extends PythonARENA{
    private final Point startPosition = new Point(380, 375);
    private static Point foodPositioning;
    private ArrayList<Point> snakeBody;
    private String direction = "RIGHT";
    private boolean gameIsOver = false;
    private boolean isPaused = false;
        public cobraArena(){
            super(); //calls the constructor of the python class

            Random random = new Random();

            int positionX = (random.nextInt(642-192 +4 )+187);
            int positionY = (random.nextInt(600-150 +4 )+154);

            initializeSnake();
            foodPositioning = new Point(positionX, positionY);

            int delay = 100;
            myGameTimer = new Timer(delay, e -> {
                System.out.println("this is a timer instance from the game arena class");
                moveSnake();
                repaint();
            });

            setUpKeyBindings();
        }
       @Override
        public void startGame(){
            if (!myGameTimer.isRunning()) SwingUtilities.invokeLater(()->myGameTimer.start());

        }

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            drawSnake(g);
            drawFood(g);
        }

        private void drawSnake(Graphics g){
            //code for snake
            g.setColor(Color.white);
            for (Point segment : snakeBody) {
                g.fillRect(segment.x, segment.y, 5,5);

            }
        }
        private void drawFood(Graphics g){
            //code for food
            Color  radcolor = new Color(((int) (Math.random()*0x10000000)));
            g.setColor(radcolor);
            g.fillOval(foodPositioning.x, foodPositioning.y, 10,10);
        }

        private  void initializeSnake(){
            snakeBody = new ArrayList<>();

            int initialLength = 0;
            for (int i = 10; i > initialLength; i--) {
                // Add new segments to the left of the starting position
                int segmentSize = 10;
                snakeBody.add(new Point(startPosition.x + (i * segmentSize), startPosition.y));

            }
        }
        private void moveSnake(){
            // System.out.println("moveSnake has been called");
            Point newHead = new Point(snakeBody.get(0));

            switch (direction) {
                case "RIGHT" -> {
                    newHead.x += 10;
                    {
                    }
                }
                case "LEFT" -> {
                    newHead.x -= 10;
                    {
                    }
                }
                case "UP" -> {
                    newHead.y -= 10;
                    {
                    }
                }
                case "DOWN" -> {
                    newHead.y += 10;
                    {
                    }
                }
            }
            //to move the snake the one step made so far
            snakeBody.add(0, newHead); repaint();

            if (checkHeadAtFood()){
                if (score_%10 == 0 && score_>=30){
                    score_= score_+50;
                } score_= score_ +5;
                ScoreLabel.setText("Score "+score_);
                upDateFoodPosition();
                repaint();

            } else {
                snakeBody.remove(snakeBody.size() - 1);
                repaint();
            }
            repaint();

            if (CheckBoundaryCollision()){
                super.gameOver1();

            }

        }
        public int getScore_() {
            return score_;
        }
        public int setScore_(int score){
            this.score_ = score;
            return score_;
        }

        private boolean CheckBoundaryCollision(){
            return snakeBody.get(0).x < 183 || snakeBody.get(0).x > 633 || snakeBody.get(0).y < 149 || snakeBody.get(0).y > 600;
        }
        private boolean checkHeadAtFood(){
            final int tolerance = 10;
            return Math.abs(snakeBody.get(0).x - foodPositioning.x) < tolerance && Math.abs(snakeBody.get(0).y - foodPositioning.y) < tolerance;
        }

        private void setUpKeyBindings() {
            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "UP");
            getActionMap().put("UP", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!"DOWN".equals(direction)) direction = "UP";
                }
            });

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "DOWN");
            getActionMap().put("DOWN", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!"UP".equals(direction)) direction = "DOWN";
                }
            });

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "LEFT");
            getActionMap().put("LEFT", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!"RIGHT".equals(direction)) direction = "LEFT";
                }
            });

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "RIGHT");
            getActionMap().put("RIGHT", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!"LEFT".equals(direction)) direction = "RIGHT";
                }
            });

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "SPACE");
            getActionMap().put("SPACE", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    startGame(); // Implement your start game logic here
                    gamePaused(); // Implement your game pause/resume toggle here

                }
            });
        }


        private void gamePaused(){
            isPaused = !isPaused;
            if (isPaused) myGameTimer.stop();
            else myGameTimer.start();
        }
//        private void gameOver1(){
//            myGameTimer.stop();
//            SwingUtilities.invokeLater(()-> {
//                myGameTimer.stop();
//                if (userNamejogger != null) {
//                    SwingUtilities.invokeLater(() -> userNamejogger.stop());
//                }if (timer1 != null){
//                    SwingUtilities.invokeLater(()-> timer1.stop());
//                }if (timer2 != null){
//                    SwingUtilities.invokeLater(()-> timer2.stop());
//                }if (timer3 != null){
//                    SwingUtilities.invokeLater(()-> timer3.stop());
//                }if (timer4 != null){
//                    SwingUtilities.invokeLater(()-> timer4.stop());
//                }if (timer5 != null){
//                    SwingUtilities.invokeLater(()-> timer5.stop());
//                }if (timer6 != null){
//                    SwingUtilities.invokeLater(()-> timer6.stop());
//                }
//
//                setScore_(0);
//
//            });
//            gameIsOver = true;
//
//            this.setVisible(false);
//            GameOver gameOver = new GameOver(this);
//            SnakeMain topFrame = (SnakeMain) SwingUtilities.getWindowAncestor(this);
//            topFrame.getContentPane().removeAll();
//            topFrame.getContentPane().setLayout(new FlowLayout());
//            gameOver.setVisible(true);
//            topFrame.getContentPane().add(gameOver);
//            topFrame.repaint();
//            topFrame.revalidate();
//
//        }
        private static void upDateFoodPosition(){
            Random random2 = new Random();
            int positionX = (random2.nextInt(450)+183);
            int positionY = (random2.nextInt(450)+147);
            foodPositioning = new Point(positionX, positionY);
        }

        @Override
        public void addNotify() {
            super.addNotify();
            requestFocusInWindow();
        }

    }

    public static class GameOver extends JPanel{
        Timer mytimer;
        PythonARENA pythonARENA;

        JButton restartButton;
        public GameOver(PythonARENA pythonARENA) {
                super();
                this.pythonARENA = pythonARENA;
                setBackground(Color.black);
                setPreferredSize(new Dimension(590,640));
                setLayout(new FlowLayout());
               // setBackground(Color.blue);


            String s = "<html> Game Over!</html>";
                JPanel scorePanel = new JPanel(), panel4rest3 = new JPanel();


                JLabel scoreLabel = new JLabel( "Score "+ pythonARENA.getScore_(), SwingConstants.CENTER);
                scoreLabel.setFont(new Font("wide latin", Font.BOLD, 30));
                scoreLabel.setBackground(new Color(52, 82, 239));
                scoreLabel.setOpaque(true);
                scoreLabel.setForeground(new Color(136, 210, 7));
                scoreLabel.setPreferredSize(new Dimension(500, 200));
                scoreLabel.setLocation(10,20);


                scorePanel.setPreferredSize(new Dimension(500, 200));
                scorePanel.setLayout(null);
                scorePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
                scorePanel.add(scoreLabel);
                add(scorePanel);

                restartButton = new JButton("Play Again");
                restartButton.setFont(new Font("elephant", Font.BOLD, 20));
                restartButton.addActionListener(e -> restartGame());
                panel4rest3.add(restartButton);

            JButton quitButton = new JButton("Quit");
            quitButton.setFont(new Font("elephant", Font.BOLD, 20));
            quitButton.setBackground(Color.red);
                quitButton.setForeground(Color.magenta);
                quitButton.addActionListener(e -> System.exit(0));
                panel4rest3.add(quitButton);

                JButton highScoresButton = new JButton("High Scores");
                highScoresButton.setFont(new Font("elephant", Font.BOLD, 20));
                highScoresButton.setBackground(Color.green);
                highScoresButton.setForeground(Color.WHITE);
                // Add action listener to display high scores


                JPanel fun = new JPanel();
                fun.setPreferredSize(new Dimension(600,200));
                DynamicArtDisplay display = new DynamicArtDisplay();

                panel4rest3.add(highScoresButton);
                panel4rest3.add(display);

                fun.add(display);
                add(panel4rest3);


                JLabel label = new JLabel(s);
                label.setFont(new Font("elephant", Font.BOLD,65));

               mytimer = new Timer(300, e->{
                    //debugger
                        System.out.println("this is a game over timer");
                        label.setForeground(new Color((int)(Math.random()*0x10000000)));
                });
mytimer.start();

                fun.add(label);
                add(fun);
            }

            private void restartGame() {
            mytimer.stop();
            this.setFocusable(false);
            this.restartButton.setFocusable(false);
            this.setVisible(false);
            SnakeMain snakeMain = (SnakeMain) SwingUtilities.getWindowAncestor(this);


                if (pythonARENA.userNamejogger != null){
                    SwingUtilities.invokeLater(()-> pythonARENA.userNamejogger.restart());
                }
                Random random = new Random();
                int positionX = (random.nextInt(450) + 177);
                int positionY = (random.nextInt(450) + 130);




                pythonARENA.score_ = 0;
               // gameARENA.setScore_(0);
                pythonARENA.setVisible(true);
                pythonARENA.initializeSnake();
                pythonARENA.foodPositioning = new Point(positionX, positionY);
                pythonARENA.requestFocusInWindow();
                pythonARENA.setUpKeyBindings();

             //snakeMain.getContentPane().removeAll()
                snakeMain.getContentPane().revalidate();
                snakeMain.getContentPane().repaint();
                snakeMain.getContentPane().setLayout(null);

              snakeMain.getContentPane().add(pythonARENA);
              snakeMain.getContentPane().repaint();
              snakeMain.getContentPane().revalidate();


        }
}

    public static void main(String[] args) {
  new SnakeMain();


    }
}
