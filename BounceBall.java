import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;


public class BounceBall implements ActionListener{
	
	public static BounceBall b;
	public Ball ball;
	public Renderer render;
	public int width = 1000, height = 1000;
	
	public BounceBall() {
		Timer t = new Timer(20,this);
		JFrame frame = new JFrame("Bounce Ball");
		System.out.println("Creat Main");
		render = new Renderer();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(render);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		t.start();
		ball = new Ball();
	}
	public void render(Graphics g) {
		System.out.println("Main render");
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);
		ball.render(g);
	}
	public void ballUpate() {
		ball.update();
		ball.collision(width, height);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ballUpate();
		render.repaint();
	}
	
	public static void main(String[] args) {
		b = new BounceBall();
	}

}
