package Pieces;
import java.awt.*;

public class Guard extends Leader{
    public Guard(){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.green);
        g.fillOval(25,55, 50,50);
        g.fillOval(125,55, 50,50);
        g.fillOval(225,55, 50,50);
        g.fillOval(325,55, 50,50);

        g.setColor(Color.yellow);
        g.fillOval(30,60, 40,40);
        g.fillOval(130,60, 40,40);
        g.fillOval(230,60, 40,40);
        g.fillOval(330,60, 40,40);

        g.setColor(Color.yellow);
        g.fillOval(425,455, 50,50);
        g.fillOval(125,455, 50,50);
        g.fillOval(225,455, 50,50);
        g.fillOval(325,455, 50,50);

        g.setColor(Color.green);
        g.fillOval(430,460, 40,40);
        g.fillOval(130,460, 40,40);
        g.fillOval(230,460, 40,40);
        g.fillOval(330,460, 40,40);
    }
}
