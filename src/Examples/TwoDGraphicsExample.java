package Examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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
public class TwoDGraphicsExample extends JComponent implements ActionListener {

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
    Color purple = new Color(127, 27, 170);
    int mouseX = 0;
    int mouseY = 0;
    
    boolean left = false;
    boolean right = false;
    
    int playerX = 100;
    int playerY = 75;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public TwoDGraphicsExample() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

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

        g.setColor(purple);
        g.fillRect(0, 0, 800, 600);

        //set the colour
        g.setColor(Color.magenta);

        //draw a filled in ractangle
        //(x, y, width, height)
        g.fillRect(100, 75, 150, 50);

        g.setColor(Color.cyan);

        //draw anything that is circular
        //(x, y, width, height) 
        g.fillOval(playerX, playerY, 150, 50);


        g.setColor(Color.yellow);
        g.fillOval(150, 75, 50, 50);

        g.drawOval(mouseX, mouseY, 150, 50);

        //rounds the corners
        //(x, y, width, height, radius width, radius height
        g.fillRoundRect(ERROR, ERROR, ERROR, ERROR, ERROR, ERROR);

        //draw a polygon
        int[] triangleX = {500, 600, 450};
        int[] triangleY = {400, 500, 500};

        //(array of x point, array of y points, number of points)
        g.fillPolygon(triangleX, triangleY, 3);

        //(x, y, width, height, start angle, end angle
        g.fillArc(100, 400, 100, 100, 45, 270);

        //(x,y,x,y)
        g.drawLine(250, 125, 500, 400);

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        if(right){
            playerX = playerX + 3;
            right = false;
        }else if(left){
            playerX = playerX - 3;
        }
        
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
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
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_D){
                right = true;
            }else if(keyCode == KeyEvent.VK_A){
                left = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
//            int keyCode = e.getKeyCode();
//            if(keyCode == KeyEvent.VK_D){
//                right = false;
//            }else if(keyCode == KeyEvent.VK_A){
//                left = false;
//            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        TwoDGraphicsExample game = new TwoDGraphicsExample();
    }
}
