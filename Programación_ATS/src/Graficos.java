import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.*;

public class Graficos extends GraphicsProgram {

    public double TIMEOUT=1000.0;

    public void run(){
        GLabel label=new GLabel("JORDI LAZO FLORENSA",300,250);
        add(label);
        pause(TIMEOUT);
        label.move(-50.0, 50.0);
        pause(TIMEOUT);
        label.setColor(Color.PINK);
        pause(TIMEOUT);
        label.setVisible(false);
        pause(TIMEOUT);
        label.setVisible(true);
        pause(TIMEOUT);
        GRect rect = new GRect(100.0, 75.0, 100.0, 50.0);
        rect.setColor(Color.RED);
        add(rect);
        pause(TIMEOUT);
        rect.setFilled(true);
        rect.setFillColor(Color.GREEN);
    }

}
