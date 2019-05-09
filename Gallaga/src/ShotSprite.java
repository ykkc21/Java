
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
			game.removeSprite(this); // ����� �¾Ƶ� �Ѿ� �Ȼ���� 
			game.removeSprite(other); // ����� �¾Ƶ� ���� �Ȼ����
		}
		
	}
}