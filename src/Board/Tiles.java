package Board;

import java.awt.*;

public class Tiles extends TheWarZone {
    public Tiles(){

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(32,32,32));
        g.fillRect(0,0, 500,530);

        g.setColor(new Color(246, 113,72));
        g.fillRect(0, 30, 99, 99);
        g.fillRect(400, 30,99,99);
        g.fillRect(100,431,99,99);
        g.fillRect(300,431,99,99);

        g.setColor(Color.WHITE);
        g.fillRect(200, 30, 99, 99);
        g.fillRect(200, 130, 99, 99);
        g.fillRect(200, 230, 99, 99);
        g.fillRect(200, 330, 99, 99);
        g.fillRect(200, 430, 99, 100);

        g.fillRect(0, 230, 99, 99);
        g.fillRect(100, 230, 99, 99);
        g.fillRect(300, 230, 99, 99);
        g.fillRect(400, 230, 99, 99);

        g.setColor(Color.GRAY);
        g.fillRect(0, 130, 99, 99);
        g.fillRect(100, 130, 99, 99);
        g.fillRect(300, 130, 99, 99);
        g.fillRect(400, 130, 99, 99);

        g.fillRect(0, 330, 99, 99);
        g.fillRect(100, 330, 99, 99);
        g.fillRect(300, 330, 99, 99);
        g.fillRect(400, 330, 99, 99);

        g.fillOval(220,250, 60,60);
    }

    /**
     * Алтернативно решение, използващо бутони вместо метода print();
     * Отказах се от него защото не мога да измисля как да нарисувам кръг, върху сентралният бутон,
     * който да променя размерите си със промяната на размерите на екрана
     * и да не изчезва спонтанно.
     *
     * this.setLayout(new GridLayout(5,5));
     *         for(int i = 0; i < 25; i++) {
     *             JButton button = new JButton();
     *             if(i == 0 || i == 4 || i == 21 || i == 23) button.setBackground(Color.RED);
     *             else if(i == 1 || i == 3 || i == 20 || i == 24) button.setBackground(Color.BLACK);
     *             else if(i == 5 || i == 6 || i == 8 || i == 9 || i == 15 || i == 16 || i == 18 || i == 19)
     *                 button.setBackground(Color.GRAY);
     *             else button.setBackground(Color.WHITE);
     *
     *             this.add(button);
     *         }
     */
}
