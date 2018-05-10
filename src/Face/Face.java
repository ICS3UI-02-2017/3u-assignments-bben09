package Face;

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
import static java.awt.image.ImageObserver.ERROR;
import javax.swing.Timer;

/**
 *
 * @author daupb7975
 */
public class Face extends JComponent implements ActionListener {

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
    Color skin = new Color(247, 204, 123);
    Color nose = new Color(247, 193, 69);

    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Face(){
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
        
        gameTimer = new Timer(desiredTime,this);
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
        g.setColor(Color.white);
        g.fillRect(0,0,800,600);
        
        //ears
        g.setColor(skin);
        g.fillOval(225, 225, 50, 50);
        g.fillOval(525, 225, 50, 50);
        
        //ear outlines
        g.setColor(Color.BLACK);
        g.drawOval(225, 225, 50, 50);
        g.drawOval(525, 225, 50, 50);
        
        //head
        g.setColor(skin);
        g.fillOval(250, 100, 300, 400);
        
        //nose
        g.setColor(nose);
        g.fillArc(385, 250, 30, 75, 0, 180);
        
        //eyes
        g.setColor(Color.white);
        g.fillOval(325, 200, 50, 40);
        g.fillOval(425, 200, 50, 40);
        
        //eye colour
        g.setColor(Color.blue);
        g.fillOval(337, 215, 25, 20);
        g.fillOval(437, 215, 25, 20);
        
        //pupils
        g.setColor(Color.BLACK);
        g.fillOval(343, 220, 12, 10);
        g.fillOval(443, 220, 12, 10);
		
        //eye lids
        g.setColor(skin);
        g.fillArc(325, 200, 50, 40, 0, 180);
        g.fillArc(425, 200, 50, 40, 0, 180);
        
        //mouth
        g.setColor(Color.BLACK);
        g.fillArc(350, 275, 100, 100, 180, 180);
        
        //tungue
        g.setColor(Color.red);
        g.fillArc(373, 357, 54, 18, 180, 180);
        g.fillArc(373, 361, 54, 9, 0, 180);
        
        //eyebrows
        g.setColor(Color.BLACK);
        g.drawLine(325, 185, 375, 195);
        g.drawLine(425, 195, 475, 185);
        
        //hair
        g.drawLine(400, 75, 400, 100);
        g.drawArc(350, 75, 50, 50, 0, 45);
        g.drawArc(400, 75, 50, 50, 135, 45);
        
        //head outline
        g.setColor(Color.BLACK);
        g.drawOval(250, 100, 300, 400);
        
        //chin
        g.setColor(skin);
        g.fillArc(360, 460, 50, 50, 155, 180);
        g.fillArc(390, 460, 50, 50, 205, 180);
        
        //teeth
        g.setColor(Color.white);
        g.fillRect(389, 326, 10, 15);
        g.fillRect(401, 326, 10, 15);
        g.fillRect(377, 326, 10, 15);
        g.fillRect(413, 326, 10, 15);
        g.fillRect(425, 326, 10, 15);
        g.fillRect(365, 326, 10, 15);
        
        //outlines
        g.setColor(Color.BLACK);
        //eyes
        g.drawOval(325, 200, 50, 40);
        g.drawOval(425, 200, 50, 40);
        //nose
        g.drawArc(385, 250, 30, 75, 0, 180);
        //chin
        g.drawArc(360, 460, 50, 50, 155, 180);
        g.drawArc(390, 460, 50, 50, 205, 180);
        //mouth
        g.drawArc(350, 275, 100, 100, 180, 180);
        //eye lids
        g.drawLine(325, 219, 375, 219);
        g.drawLine(425, 219, 475, 219);
        
        //cover up chin outline
        g.setColor(skin);
        g.fillOval(385, 476, 30, 30);
        
        //chin line
        g.setColor(Color.black);
        g.drawLine(400, 490, 400, 506);
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

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

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
        Face game = new Face();
    }
}

