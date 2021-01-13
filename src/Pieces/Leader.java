package Pieces;

import Board.Tiles;
import java.awt.*;

public class Leader extends Tiles {
    public Leader(){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.green);
        g.fillRect(20, 450, 60,60);

        g.setColor(Color.yellow);
        g.fillRect(420, 50, 60,60);
    }
}
