import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BoardPanel extends JPanel implements MouseMotionListener {

    private static final int PANEL_WIDTH = 700, PANEL_HEIGHT = 650;
    private BufferedImage boardImg, yellow, red, arrow;
    private int arrow_x = -1, arrow_y = 600;

    private final Game.State[][] grid;

    BoardPanel(Game.State[][] grid, MouseListener ml){
        this.grid = grid;

        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.WHITE);

        try{
            boardImg = ImageIO.read(this.getClass().getResource("board.png"));
            yellow = ImageIO.read(this.getClass().getResource("yellow.png"));
            red = ImageIO.read(this.getClass().getResource("red.png"));
            arrow = ImageIO.read(this.getClass().getResource("up_arrow.png"));
        }
        catch(IOException e){
            System.out.println("Could not find the images: " + e.toString());
        }

        addMouseMotionListener(this);
        addMouseListener(ml);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(boardImg, 0, 0, PANEL_WIDTH, PANEL_HEIGHT, this);

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int x = j*100 + 5;
                int y = 500 - i*100 + 5;
                if(grid[i][j] == Game.State.YELLOW) {
                    g2.drawImage(yellow, x, y, this);
                }
                else if(grid[i][j] == Game.State.RED) {
                    g2.drawImage(red, x, y, this);
                }
            }
        }

        if (arrow_x >= 0){
            g2.drawImage(arrow, arrow_x, arrow_y, this);
        }
    }

    void refresh(){
        revalidate();
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = ((e.getX()+99)/100) * 100;
        arrow_x = x - 70;

        repaint();
    }

}
