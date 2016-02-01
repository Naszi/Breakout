package hu.uni.miskolc.naszi;

import java.awt.Image;
import java.awt.Rectangle;

public class Sprite {
	protected int x;
	protected int y;
	protected int i_width;
	protected int i_height;
	protected Image image;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return i_width;
	}
	public int getHeight() {
		return i_height;
	}
	public Image getImage() {
		return image;
	}
	
	Rectangle getRect() {
		return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
	}
}
