//I try to design my own version of Unique Nepalese flag in Java Frame

import java.awt.*;
import java.awt.event.*;
public class NepaleseFlag extends Frame
{
	NepaleseFlag()
	{
		setSize(1920,1080);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		//Blue Border
		g.setColor(new Color(0,56,147));
		int[] xValues1 = {130,510,290,490,130};
		int[] yValues1 = {60,320,320,570,570};
		g.fillPolygon(xValues1, yValues1,5);

		//Red Fill
		g.setColor(new Color(220,20,60));
		int[] xValues = {150,450,250,450,150};
		int[] yValues = {100,300,300,550,550};
		g.fillPolygon(xValues, yValues,5);

		//Moon
		g.setColor(new Color(255,255,255));
		g.fillOval(165,165,120,120);
		g.setColor(new Color(220,20,60));
		g.fillOval(165,165,120,100);
		g.setColor(new Color(255,255,255));
		g.fillArc(190,235,70,70,0,180);

		//Sun
		g.fillOval(185,385,90,90);
		int[] xValues3 = {215,230,240,260,260,285,275,300,275,285,262,265,245,230,217,195,198,175,185,160,185,171,198,195};
		int[] yValues3 = {385,360,385,367,395,390,415,430,440,470,462,490,475,500,472,490,462,470,440,430,420,395,398,370};
		g.fillPolygon(xValues3,yValues3,24);
	}

	public static void main(String[] args) 
	{
		NepaleseFlag flag = new NepaleseFlag();
		//Closable Frame
		flag.addWindowListener (new WindowAdapter(){
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	});
	}
}
