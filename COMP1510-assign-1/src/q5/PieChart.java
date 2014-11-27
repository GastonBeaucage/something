package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This program creates a frame and a panel which displays a circle 
 * divided into eight even parts.</p>
 *
 * @author Gaston Beaucage
 * @version 1.0
 */
public class PieChart extends JFrame {
    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public PieChart() {
        super("Cut the pie!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PieChartPanel());
        final int width = 350;
        final int height = 220;
        setSize(width, height);
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class PieChartPanel extends JPanel {

        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        private Image img;

        /**
         * <p>The default contructor that retreives an image to draw.</p>
         */
        public PieChartPanel() {
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            final Color backgroundColor = new Color(60, 255, 140);
            setBackground(backgroundColor);
            final Color textColor = new Color(140, 50, 200);
            g.setColor(textColor);
            g.drawString("Something interesting ...", X_POSITION, Y_POSITION);
            final int ovalX = 50;
            final int ovalY = 50;
            final int ovalWidth = 80;
            final int ovalHeight = 80;
            final int angle = 45;
            final int slice1 = 0;
            final int slice2 = 45;
            final int slice3 = 90;
            final int slice4 = 135;
            final int slice5 = 180;
            final int slice6 = 225;
            final int slice7 = 270;
            final int slice8 = 315;
            g.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);
            g.setColor(Color.blue);
            g.fillArc(ovalX, ovalY, ovalWidth, ovalHeight, slice1, angle);
            g.setColor(Color.red);
            g.fillArc(ovalX, ovalY, ovalWidth, ovalHeight, slice2, angle);
            g.setColor(Color.yellow);
            g.fillArc(ovalX, ovalY, ovalWidth, ovalHeight, slice3, angle);
            g.setColor(Color.green);
            g.fillArc(ovalX, ovalY, ovalWidth, ovalHeight, slice4, angle);
            g.setColor(Color.orange);
            g.fillArc(ovalX, ovalY, ovalWidth, ovalHeight, slice5, angle);
            g.setColor(Color.cyan);
            g.fillArc(ovalX, ovalY, ovalWidth, ovalHeight, slice6, angle);
            g.setColor(Color.magenta);
            g.fillArc(ovalX, ovalY, ovalWidth, ovalHeight, slice7, angle);
            g.setColor(Color.pink);
            g.fillArc(ovalX, ovalY, ovalWidth, ovalHeight, slice8, angle);
            

        }
    }

    /**
     * <p>The main method.</p>
     *
     *@param args command line arguments 
     */
    public static void main(String[] args) {
        new PieChart();
    }

};
