import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="House.class" width=500 height=500></applet>*/
public class House extends Applet implements MouseListener,MouseMotionListener
{
	public void init()
	{
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{	
		g.drawLine(50,100,60,30);
		g.drawRect(50,200,100,200);
	}
	House()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent g1)
	{
		Graphics g=getGraphics(); 
		g.setColor(Color.red);
		g.fillRect(60,200,50,100);
	}
	public void mouseEntered(MouseEvent g) {}  
	public void mouseExited(MouseEvent g) {}  
	public void mousePressed(MouseEvent g) {}  
	public void mouseReleased(MouseEvent g) {} 
	public void mouseMoved(MouseEvent g){}
	public void mouseDragged(MouseEvent g){}

}
	
