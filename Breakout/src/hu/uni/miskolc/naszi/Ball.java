package hu.uni.miskolc.naszi;

import javax.swing.ImageIcon;

public class Ball extends Sprite implements Commons {
	
	private int xdir;
	private int ydir;
	
	public Ball() {
		xdir = 1;
		ydir =-1;
		
		ImageIcon ii = new ImageIcon(getClass().getResource("ball.png"));
		image = ii.getImage();
		
		i_width = image.getWidth(null);
		i_height = image.getHeight(null);
		
		resetState();
	}

	public void move() {
		x += xdir;
		y += ydir;
		
		if (x == 0)
			setXDir(1);
		
		if (x == WIDTH - i_width)
			setXDir(-1);
		
		if (y == 0)
			setYDir(1);
	}
	
	public void setYDir(int y) {
		ydir = y;
	}
	
	public int getYDir() {
		return ydir;
	}

	public void setXDir(int x) {
		xdir = x;
	}

	private void resetState() {
		x = INIT_BALL_X;
		y = INIT_BALL_Y;
	}
}
