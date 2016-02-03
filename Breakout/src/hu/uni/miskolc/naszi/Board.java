	package hu.uni.miskolc.naszi;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Timer;

import javax.swing.JPanel;

public class Board extends JPanel implements Commons {
	private Timer timer;
	private String message = "Game Over";
	private Ball ball;
	private Paddle paddle;
	private Brick[] bricks;
	private boolean ingame = true;
	
	public Board() {
		initBoard();
	}

	private void initBoard() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		
		bricks = new Brick[N_OF_BRICKS];
		setDoubleBuffered(true);
		timer = new Timer();
		timer.scheduleAtFixedRate(new ScheduleTask(), DELAY, PERIOD);
	}

	@Override
	public void addNotify() {
		super.addNotify();
		gameInit();
	}

	private void gameInit() {
		ball = new Ball();
		paddle = new Paddle();
		
		int k = 0;
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 6; j++) {
				bricks[k] = new Brick(j * 40 + 30, i * 10 + 50);
			}
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D graphics2d = (Graphics2D) g;
		graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		if (ingame) {
			drawObJect(graphics2d);
		} else {
			gameFinished(graphics2d);
		}
	}

	private void drawObJect(Graphics2D graphics2d) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
