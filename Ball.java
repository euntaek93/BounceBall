import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;

public class Ball {
	
	public int x = 220, y = 100;
	public int xspeed = 4;
	public int yspeed = 3;
	public int width = 20, height = 20;
	public int mapwidth = 600, mapheight = 600;
	public void render(Graphics g) {
//		System.out.println("Ball render");
		g.setColor(Color.RED);
		g.fillOval(x, y, width, height);
	}

	public void update() {
			this.x += this.xspeed;
			this.y += this.yspeed;
//			System.out.println("[" + x + "," + y + "]");
	}
	
	public void edges(){
		if(y > mapheight){
			yspeed *= -1; 
			}
		if(y < 0){
			yspeed *= -1;
		}
		if(x > mapwidth + 10){
			xspeed *= -1;
		}
		if(x < 0){
			xspeed *= -1;
		}
		
	}

}
