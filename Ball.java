import java.awt.Color;
import java.awt.Graphics;


public class Ball {
	
	public int x = 300, y = 300;
	public int xSpeed = 4;
	public int ySpeed = 3;
	public int width = 20, height = 20;

	public void render(Graphics g) {
		System.out.println("Ball render");
		g.setColor(Color.RED);
		g.fillOval(x, y, width, height);
	}

	public void update() {
		this.x += this.xSpeed;
		this.y += this.ySpeed;
		if(x == 1000){
		}
	}

	public void collision(int mapWidth, int mapHeight) {
		
		
	}


}
