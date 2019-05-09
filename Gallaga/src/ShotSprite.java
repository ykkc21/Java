
import java.awt.Color;
import java.awt.Image;

public class ShotSprite extends Sprite {
	private GalagaGame game;

	public ShotSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dy = -7;
	}

	@Override
	public void move() {
		super.move();
		if (y < -100) {
			game.removeSprite(this);
		}
	}
 
	@Override
	public void handleCollision(Sprite other) {

		if (other instanceof AlienSprite) {
			game.removeSprite(this); // 지우면 맞아도 총알 안사라짐 
			game.removeSprite(other); // 지우면 맞아도 괴물 안사라짐
		}
		
	}
}