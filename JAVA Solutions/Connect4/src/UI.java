import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.IOException;

public class UI {

    private static final int FRAME_WIDTH = 700, FRAME_HEIGHT = 700;
    private JFrame frame;
    private final BoardPanel boardPanel;

    UI(Game.State[][] grid, MouseListener ml){
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.BLACK);
        boardPanel = new BoardPanel(grid, ml);
        frame.setLayout(new BorderLayout());
        frame.setTitle("Connect4");

        try {
            Image icon = ImageIO.read(getClass().getResource("icon.png"));
            frame.setIconImage(icon);
        }
        catch(IOException e){
            System.out.println("Could not find the images: " + e.toString());
        }

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(boardPanel, BorderLayout.PAGE_END);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    void display(){
        boardPanel.refresh();
    }

    void finGame(String winner){
        JOptionPane.showMessageDialog(frame,winner + " wins!!!");
        System.exit(0);
    }
}
