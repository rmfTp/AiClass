package exam05;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.lang.System.out;


public class EventHandler1 implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e){
        out.println("클릭");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
