import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Road extends JPanel implements ActionListener{
	
	public Road()
	{
		mainTimer.start();
		addKeyListener(new myKeyAdapter());
		setFocusable(true);
	}
	
	private class myKeyAdapter extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			p.keyPressed(e);
		}
		public void keyReleased(KeyEvent e)
		{
			p.keyReleased(e);
		}
	}
	
	Image img = new ImageIcon(getClass().getResource("res/landscapeRoadBG.png")).getImage();
	
	Player p = new Player();
	
	Timer mainTimer = new Timer(20, this);
	
	public void paint(Graphics g)
	{
		g = (Graphics2D) g;
		g.drawImage(img, p.layer2, 0, null);
		g.drawImage(img, p.layer1, 0, null);
		g.drawImage(p.img, p.x, p.y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		p.move();
		repaint();
		
	}

}
