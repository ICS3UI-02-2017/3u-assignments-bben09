
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author daupb7975
 */
public class Game extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    boolean up = false;
    boolean down = false;
    boolean right = false;
    boolean left = false;
    boolean start = false;
    boolean gameover = false;
    int playerX = 375;
    int playerY = 550;
    int Y1 = 10;
    int Y2 = 215;
    int Y3 = 415;
    int Y4 = 615;
    int[] randomwidth = new int[100];
    int[] rightrectx = new int[100];
    int[] yvalues = new int[100];
    Font gametext = new Font("arial", Font.BOLD, 50);

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Game() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);
        preSetup();
        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);

        g.setColor(Color.yellow);
        g.fillRect(playerX, playerY, 40, 40);

        g.setColor(Color.white);
        //g.fillRect(0, Y1, 300, 50);
        //g.fillRect(375, Y1, 425, 50);

        //Rectangle firstwallR = new Rectangle(375, Y1, 425, 50);

        for (int i = 0; i < 100; i++) {
            g.fillRect(0, yvalues[i], randomwidth[i], 50);
            g.fillRect(rightrectx[i], yvalues[i], 800, 50);
        }

        if (!start && !gameover) {
            g.setFont(gametext);
            g.setColor(Color.orange);
            g.drawString("Press Space to Start Game", 100, 100);
        }
        if (gameover) {
            g.setFont(gametext);
            g.setColor(Color.orange);
            g.drawString("Game Over", 300, 300);
        }

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        for (int i = 0; i < 100; i++) {
            randomwidth[i] = (int) Math.floor(Math.random() * 725);
            rightrectx[i] = randomwidth[i] + 75;
        }

        for (int i = 0; i < 100; i++) {
            yvalues[i] = (i * 200) * -1;

        }
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        if (up && playerY > -1 && start) {
            playerY = playerY - 8;
        }
        if (down && playerY < 551 && start) {
            playerY = playerY + 8;
        }
        if (right && playerX < 751 && start) {
            playerX = playerX + 8;
        }
        if (left && playerX > -1 && start) {
            playerX = playerX - 8;
        }

        if (start) {
            for (int i = 0; i < 100; i++) {
                yvalues[i] = yvalues[i] + 4;
            }
            for (int i = 0; i < 100; i++) {
                if (!(playerX > randomwidth[i] || playerY + 40 < yvalues[i] || playerY > yvalues[i] + 50)) {
                    gameover = true;
                }
            }
            for (int i = 0; i < 100; i++) {
                if (!(playerX + 40 < rightrectx[i] || playerY + 40 < yvalues[i] || playerY > yvalues[i] + 50)) {
                    gameover = true;
                }
            }

            if (gameover) {
                start = false;
                up = false;
                down = false;
                right = false;
                left = false;
            }
        }
        

    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            if (keycode == KeyEvent.VK_W) {
                up = true;
            } else if (keycode == KeyEvent.VK_S) {
                down = true;
            }
            if (keycode == KeyEvent.VK_A) {
                left = true;
            } else if (keycode == KeyEvent.VK_D) {
                right = true;
            }
            if (keycode == KeyEvent.VK_SPACE) {
                start = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keycode = e.getKeyCode();
            if (keycode == KeyEvent.VK_W) {
                up = false;
            } else if (keycode == KeyEvent.VK_S) {
                down = false;
            }
            if (keycode == KeyEvent.VK_A) {
                left = false;
            } else if (keycode == KeyEvent.VK_D) {
                right = false;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Game game = new Game();
    }
}
