import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class GalagaGame extends JPanel implements KeyListener {

	private boolean running = true;

	private ArrayList sprites = new ArrayList();
	private Sprite starship;
	
	private BufferedImage BossImage;
	private BufferedImage alienImage;
	private BufferedImage shotImage;
	private BufferedImage shipImage;
	private BufferedImage NaImage;
	private BufferedImage Boss1Image;
	private BufferedImage boomImage;
	
	
	int Score = 0;

	public GalagaGame() {
		JFrame frame = new JFrame("Galaga Game");
		
		frame.setContentPane(frame);
		JPanel z = new JPanel();
		z.setPreferredSize(new Dimension(300, 80));
		z.setBackground(Color.PINK);
		z.setVisible(true);
		
		
		
		frame.setSize(800, 600);
		frame.add(this);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		
		
		try {
			shotImage = ImageIO.read(new File("fire.png"));
			shipImage = ImageIO.read(new File("starship.png"));
			alienImage = ImageIO.read(new File("alien.png"));
			BossImage = ImageIO.read(new File("anan.jpg"));
			Boss1Image = ImageIO.read(new File("images.jpg"));
			boomImage = ImageIO.read(new File("mmm.jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		this.requestFocus();
		this.initSprites();
		addKeyListener(this);

	}

	private void initSprites() {
		starship = new StarShipSprite(this, shipImage, 370, 550);          
		sprites.add(starship);  
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 12; x++) {
				Sprite alien = new AlienSprite(this, alienImage, 100 + (x * 50), (50) + y * 30);
				sprites.add(alien);
				
				Sprite Boss = new AlienSprite(this, BossImage, 450 + (x * 0), (0) + y * 0);
				sprites.add(Boss);
				
				Sprite Boss1 = new AlienSprite(this, Boss1Image, 0 + (x * 0), (0) + y * 0);
				sprites.add(Boss1);
				
			}
		}
	}
	
	private void board(){
		JPanel z = new JPanel();
		z.setPreferredSize(new Dimension(300, 80));
		z.setBackground(Color.PINK);
		z.setVisible(true);
	}

	private void startGame() {
		sprites.clear();
		initSprites();
		Score = 0;
	}
	
	public void start() {
		sprites.clear();
		initSprites();
		Score = 0;
	}

	
	public void endGame() {
		board();
		System.exit(0);
	}

	public void removeSprite(Sprite sprite) {
		sprites.remove(sprite);
		Score+=10;
	}

	public void fire() {
		ShotSprite shot = new ShotSprite(this, shotImage, starship.getX() + 1, starship.getY() - 30);
		ShotSprite shot1 = new ShotSprite(this, shotImage, starship.getX() + 10, starship.getY() - 30); // ÃÑ¾Ë º¹ºÙ
		/*ShotSprite shot2 = new ShotSprite(this, shotImage, starship.getX() + 7, starship.getY() - 50); // ÃÑ¾Ë º¹ºÙ
*/		
		sprites.add(shot);
		sprites.add(shot1);
		/*sprites.add(shot2);*/
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 800, 600);
		for (int i = 0; i < sprites.size(); i++) {
			Sprite sprite = (Sprite) sprites.get(i);
			sprite.draw(g);
		}
	}

	public void gameLoop() {

		while (running) {
			for (int i = 0; i < sprites.size(); i++) {
				Sprite sprite = (Sprite) sprites.get(i);
				sprite.move();
			}

			for (int p = 0; p < sprites.size(); p++) {
				for (int s = p + 1; s < sprites.size(); s++) {
					Sprite me = (Sprite) sprites.get(p);
					Sprite other = (Sprite) sprites.get(s);

					if (me.checkCollision(other)) {
						me.handleCollision(other);
						other.handleCollision(me);
					}
				}
			}

			repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A)
			starship.setDx(-5);
		if (e.getKeyCode() == KeyEvent.VK_D)
			starship.setDx(+5);
		if (e.getKeyCode() == KeyEvent.VK_W)
			starship.setDy(-5);
		if (e.getKeyCode() == KeyEvent.VK_S)
			starship.setDy(+5);
		if (e.getKeyCode() == KeyEvent.VK_R)
			start();
		if (e.getKeyCode() == KeyEvent.VK_1){
			ShotSprite shot = new ShotSprite(this, boomImage, starship.getX() + -120, starship.getY() - 30);
			ShotSprite shot1 = new ShotSprite(this, boomImage, starship.getX() + 0, starship.getY() - 30);
			ShotSprite shot2 = new ShotSprite(this, boomImage, starship.getX() + 120, starship.getY() - 30); // ÃÑ¾Ë º¹ºÙ
	
			sprites.add(shot);
			sprites.add(shot1);
			sprites.add(shot2);
		}
			
			 
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
			fire();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A)
			starship.setDx(0);
		if (e.getKeyCode() == KeyEvent.VK_D)
			starship.setDx(0);
		if (e.getKeyCode() == KeyEvent.VK_W)
			starship.setDy(0);
		if (e.getKeyCode() == KeyEvent.VK_S)
			starship.setDy(0);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	public static void main(String argv[]) {
		GalagaGame g = new GalagaGame();
		g.gameLoop();
	}
}