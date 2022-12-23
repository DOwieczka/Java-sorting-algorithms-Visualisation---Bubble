import javax.swing.*;
import java.awt.*;

public class UserInterface {
    JFrame jframe = new JFrame();
    private BubbleSortPanel bubbleSortPanel;
    public UserInterface() {
        jframe = new JFrame ("BubbleSort Visualization");
        bubbleSortPanel = new BubbleSortPanel();
        jframe.setResizable(false);
        jframe.add(bubbleSortPanel);
        this.bubbleSortPanel.add(new BubbleSortPanel());
        jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}
