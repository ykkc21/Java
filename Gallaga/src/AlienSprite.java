import java.awt.Image;

import javax.swing.JFrame;

public class AlienSprite extends Sprite {
	private GalagaGame game;
	
	public AlienSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dx = -1;
		dy = -1;
	}

	@Override
	public void move() { 
		if (((dx < 0) && (x < 10)) || ((dx > 0) && (x > 760))) {
			dx = -dx;
			y += 10;
			/*if (y > 400) {
				game.start();
				game.endGame();
			}*/
		}
		super.move();
		if (((dy < 0) && (y < 10)) || ((dy > 0) && (y > 550))) {
			dy = -dy;
			x += 10;
			
		}
		super.move();
	}
	
	

}