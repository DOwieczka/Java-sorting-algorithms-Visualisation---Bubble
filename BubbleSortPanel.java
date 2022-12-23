import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BubbleSortPanel extends JPanel implements ActionListener {
    static final int HEIGHT = 600;
    static final int WIDTH = 800;
    static final int LATENCY = 150;
    static final int UNIT_SIZE =6;
    static final int ARR_UNITS = (HEIGHT*WIDTH)/UNIT_SIZE;

    private int[] arrayOfLength;
    private Random random;
    private boolean running = false;
    private Timer timer;
    private int currentIndex;
    private int compareIndex;
        public BubbleSortPanel(){
            this(100);
        }

        public BubbleSortPanel(int lenOfArray){
            random = new Random();
            this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
            this.setBackground(Color.BLACK);
            this.setFocusable(true);
            this.arrayOfLength = new int[lenOfArray];

            for (int i = 0 ; i < lenOfArray;  i++){
                arrayOfLength[i] = random.nextInt(lenOfArray);
            }

            startBubbleSort();
            }


        public void startBubbleSort(){
            running = true;
            timer = new Timer(LATENCY, this);
            timer.start();

        }

        public void paintComponent(Graphics graphics){
            super.paintComponent(graphics);
            this.draw(graphics);
        }

        public void draw(Graphics graphics){
            if (running){
                //draw helping lines on the screen vertical and horizontal
                for (int i = 0; i < WIDTH / UNIT_SIZE; i++) {
                    graphics.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, HEIGHT);
                    graphics.drawLine(0, i * UNIT_SIZE, WIDTH, i * UNIT_SIZE);
                }

                for (int i = 0; i < arrayOfLength.length; i+= 1) {
                    graphics.setColor(Color.WHITE);
                    for (int j = 0; j < arrayOfLength[i]; j+=1) {
                        graphics.fillRect(WIDTH - i*UNIT_SIZE, j*UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);

                    }

                }
            } else {
                sortingFinished(graphics);
            }


            }

        public void sortingFinished(Graphics graphics){

        }

        public void move(){

        }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
