import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	
	Image img = new ImageIcon(getClass().getResource("res/(pressed)car3.png")).getImage();
	
	int v = 10;
	int dv = 0;
	int s = 0;
	
	int x = 20;
	int y = 150;
	
	int layer1 = 0;
	int layer2 = 1200;
	
	public void move()
	{
		s += v;
		
		if(layer2-v <= 0)
		{
			layer1 = 0;
			layer2 = 720;
		}
		else
		{
			layer1 -= v;
			layer2 -= v;
		}
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_UP)
			if(y>=150)
				y -= 5;
		if(key == KeyEvent.VK_DOWN)
			if(y<=475)
				y += 5;
	}
	public void keyReleased(KeyEvent e)
	{
//		int key = e.getKeyCode();
//		if(key == KeyEvent.VK_UP || key == KeyEvent.VK_LEFT)
//			dv = 0;
	}

}
