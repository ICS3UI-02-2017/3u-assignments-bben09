
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
    //booleans for the controls
    boolean up = false;
    boolean down = false;
    boolean right = false;
    boolean left = false;
    //boolean to start arcade mode
    boolean arcade = false;
    //boolean to start the game
    boolean start = false;
    //boolean to start level one
    boolean lvl1 = false;
    //level 2
    boolean lvl2 = false;
    //boolean to display text to tell player to start level 2
    boolean lvl2start = false;
    //to start level 3
    boolean lvl3 = false;
    //boolean to display text to tell player to start level 3
    boolean lvl3start = false;
    //boolean to end the game
    boolean gameover = false;
    boolean gamewon = false;
    //boolean for the main menu
    boolean mainmenu = true;
    //integers to keep track of the players position
    int playerX = 375;
    int playerY = 550;
    //integer array to store the width of the left side walls for the three levels
    int[] randomwidthlvl1 = new int[10];
    int[] randomwidthlvl2 = new int[10];
    int[] randomwidthlvl3 = new int[10];
    int[] randomwidtharcade = new int[1000];
    //integer array to store the x value of the right side walls for the three levels
    int[] rightrectxlvl1 = new int[10];
    int[] rightrectxlvl2 = new int[10];
    int[] rightrectxlvl3 = new int[10];
    int[] rightrectxarcade = new int[1000];
    //integer array to store the y values for the walls for the three levels
    int[] yvalueslvl1 = new int[10];
    int[] yvalueslvl2 = new int[10];
    int[] yvalueslvl3 = new int[10];
    int[] yvaluesarcade = new int[1000];
    //font for outputing to user
    Font gametext = new Font("arial", Font.BOLD, 40);

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

        //make a black background
        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);

        //draw a yellow square, this is the player
        g.setColor(Color.yellow);
        g.fillRect(playerX, playerY, 40, 40);

        g.setColor(Color.white);

        //draw all the walls for level one above the screen before they move down towards the player
        if (lvl1) {
            for (int i = 0; i < 10; i++) {
                g.fillRect(0, yvalueslvl1[i], randomwidthlvl1[i], 50);
                g.fillRect(rightrectxlvl1[i], yvalueslvl1[i], 800, 50);
            }
        }

        //draw all the walls for level two above the screen before they move down towards the player
        if (lvl2) {
            for (int i = 0; i < 10; i++) {
                g.fillRect(0, yvalueslvl2[i], randomwidthlvl2[i], 50);
                g.fillRect(rightrectxlvl2[i], yvalueslvl2[i], 800, 50);
            }
        }
        if (lvl3) {
            for (int i = 0; i < 10; i++) {
                g.fillRect(0, yvalueslvl3[i], randomwidthlvl3[i], 50);
                g.fillRect(rightrectxlvl3[i], yvalueslvl3[i], 800, 50);
            }
        }
        if (arcade) {
            for (int i = 0; i < 1000; i++) {
                g.fillRect(0, yvaluesarcade[i], randomwidtharcade[i], 50);
                g.fillRect(rightrectxarcade[i], yvaluesarcade[i], 800, 50);
            }
        }
        //tell player to press space to start level one
        if (!lvl1 && !gameover && !lvl2start && !lvl3start && !arcade && !start) {
            g.setFont(gametext);
            g.setColor(Color.orange);
            g.drawString("Press Space to Start Level The Level Mode", 0, 200);
            g.drawString("Press Enter to Start Arcade Mode", 60, 400);
        }
        //tell the player to press space to start level two
        if (lvl2start && !gameover && !lvl3start) {
            g.setFont(gametext);
            g.setColor(Color.orange);
            g.drawString("Press Space to Start Level Two", 50, 100);
        }
        //tell the player to press space to start level three
        if (lvl3start && !gameover && !lvl3) {
            g.setFont(gametext);
            g.setColor(Color.orange);
            g.drawString("Press Space to Start Level Three", 25, 100);
        }

        //if the game is over, output "Game Over"
        if (gameover) {
            g.setFont(gametext);
            g.setColor(Color.orange);
            g.drawString("Game Over", 300, 200);
        }
        if (gamewon) {
            g.drawString("Congradulations! You Won", 50, 100);
        }

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

        //for level one: randomly generate the width of the wall on the left side, then make the x on the left equal to the width plus 80 to make and opening for the player
        for (int i = 0; i < 10; i++) {
            randomwidthlvl1[i] = (int) Math.floor(Math.random() * 725);
            rightrectxlvl1[i] = randomwidthlvl1[i] + 80;
        }
        //for level one: fill y value array for the walls that will seperate them by 200
        for (int i = 0; i < 10; i++) {
            yvalueslvl1[i] = ((i * 200) * -1) - 50;
        }
        // for level 2: randomly generate the width of the wall on the left side, then make the x on the left equal to the width plus 80 to make and opening for the player
        for (int i = 0; i < 10; i++) {
            randomwidthlvl2[i] = (int) Math.floor(Math.random() * 725);
            rightrectxlvl2[i] = randomwidthlvl2[i] + 80;
        }
        //for level 2: fill y value array for the walls that will seperate them by 200
        for (int i = 0; i < 10; i++) {
            yvalueslvl2[i] = ((i * 200) * -1) - 50;
        }
        //for level 3: randomly generate the width of the wall on the left side, then make the x on the left equal to the width plus 80 to make and opening for the player
        for (int i = 0; i < 10; i++) {
            randomwidthlvl3[i] = (int) Math.floor(Math.random() * 725);
            rightrectxlvl3[i] = randomwidthlvl3[i] + 80;
        }
        //for level 3: fill y value array for the walls that will seperate them by 200
        for (int i = 0; i < 10; i++) {
            yvalueslvl3[i] = ((i * 200) * -1) - 50;
        }
        //for level 3: randomly generate the width of the wall on the left side, then make the x on the left equal to the width plus 80 to make and opening for the player
        for (int i = 0; i < 1000; i++) {
            randomwidtharcade[i] = (int) Math.floor(Math.random() * 725);
            rightrectxarcade[i] = randomwidtharcade[i] + 80;
        }
        //for level 3: fill y value array for the walls that will seperate them by 200
        for (int i = 0; i < 1000; i++) {
            yvaluesarcade[i] = ((i * 200) * -1) - 50;
        }

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {

        //make player move up but dont let them pass the top of the screen
        if (up && playerY > -1 && start) {
            playerY = playerY - 8;
        }
        //make player move down but dont let them pass the bottom of the screen
        if (down && playerY < 551 && start) {
            playerY = playerY + 8;
        }
        //make player move right but dont let them go off the right of the screen
        if (right && playerX < 751 && start) {
            playerX = playerX + 8;
        }
        //make player move left but dont let them go off the left side of the screen
        if (left && playerX > -1 && start) {
            playerX = playerX - 8;
        }

        //once the player starts the game, make the walls move down towards the player
        if (lvl1) {
            for (int i = 0; i < 10; i++) {
                yvalueslvl1[i] = yvalueslvl1[i] + 2;
            }

            //if the player touches one of the walls on the left side, stop the game and display gameover
            for (int i = 0; i < 10; i++) {
                if (!(playerX > randomwidthlvl1[i] || playerY + 40 < yvalueslvl1[i] || playerY > yvalueslvl1[i] + 50)) {
                    gameover = true;
                }
            }
            //if the player touches one of the walls on the right side, stop the game and display gameover
            for (int i = 0; i < 10; i++) {
                if (!(playerX + 40 < rightrectxlvl1[i] || playerY + 40 < yvalueslvl1[i] || playerY > yvalueslvl1[i] + 50)) {
                    gameover = true;
                }
            }

            //if the game is over, make stop the game from running
            if (gameover) {
                lvl1 = false;
                start = false;
            }
        }
        //if the player passes all the blocks, bring up the menu to start level 2
        if (yvalueslvl1[9] == 600) {
            lvl1 = false;
            lvl2start = true;
        }
        if (lvl2) {
            //move the walls towards the player faster than level one
            for (int i = 0; i < 10; i++) {
                yvalueslvl2[i] = yvalueslvl2[i] + 4;
            }

            //if the player touches one of the walls on the left side, stop the game and display gameover
            for (int i = 0; i < 10; i++) {
                if (!(playerX > randomwidthlvl2[i] || playerY + 40 < yvalueslvl2[i] || playerY > yvalueslvl2[i] + 50)) {
                    gameover = true;
                }
            }
            //if the player touches one of the walls on the right side, stop the game and display gameover
            for (int i = 0; i < 10; i++) {
                if (!(playerX + 40 < rightrectxlvl2[i] || playerY + 40 < yvalueslvl2[i] || playerY > yvalueslvl2[i] + 50)) {
                    gameover = true;
                }
            }

            //if the game is over, make stop the game from running
            if (gameover) {
                start = false;
                lvl2 = false;
            }
        }
        //if the player passes all the blocks, bring up the menu to start level 2
        if (yvalueslvl2[9] >= 600) {
            lvl2 = false;
            lvl3start = true;
        }
        //move the walls towards the player, but faster than level 2
        if (lvl3) {
            for (int i = 0; i < 10; i++) {
                yvalueslvl3[i] = yvalueslvl3[i] + 5;
            }

            //if the player touches one of the walls on the left side, stop the game and display gameover
            for (int i = 0; i < 10; i++) {
                if (!(playerX > randomwidthlvl3[i] || playerY + 40 < yvalueslvl3[i] || playerY > yvalueslvl3[i] + 50)) {
                    gameover = true;
                }
            }
            //if the player touches one of the walls on the right side, stop the game and display gameover
            for (int i = 0; i < 10; i++) {
                if (!(playerX + 40 < rightrectxlvl3[i] || playerY + 40 < yvalueslvl3[i] || playerY > yvalueslvl3[i] + 50)) {
                    gameover = true;
                }
            }
            //if the player passes all the walls in level 3 tell them they won 
            if (yvalueslvl3[9] == 600) {
                gamewon = true;

            }
            //if the game is over, make stop the game from running
            if (gameover) {
                start = false;
                lvl3 = false;
            }
        }
        if (arcade) {
            start = true;
            //move the walls towards the player   
            for (int i = 0; i < 1000; i++) {
                yvaluesarcade[i] = yvaluesarcade[i] + 4;
            }

            //if the player touches one of the walls on the left side, stop the game and display gameover
            for (int i = 0; i < 1000; i++) {
                if (!(playerX > randomwidtharcade[i] || playerY + 40 < yvaluesarcade[i] || playerY > yvaluesarcade[i] + 50)) {
                    gameover = true;
                }
            }
            //if the player touches one of the walls on the right side, stop the game and display gameover
            for (int i = 0; i < 1000; i++) {
                if (!(playerX + 40 < rightrectxarcade[i] || playerY + 40 < yvaluesarcade[i] || playerY > yvaluesarcade[i] + 50)) {
                    gameover = true;
                }
            }

            //if the game is over, make stop the game from running
            if (gameover) {
                arcade = false;
                start = false;
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
                lvl1 = true;
                start = true;
            }
            if (lvl2start && keycode == KeyEvent.VK_SPACE) {
                lvl2 = true;
                lvl2start = false;
            }
            if (lvl3start && keycode == KeyEvent.VK_SPACE) {
                lvl3 = true;
                lvl3start = false;
            }
            if (!start && keycode == KeyEvent.VK_ENTER) {
                arcade = true;
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
