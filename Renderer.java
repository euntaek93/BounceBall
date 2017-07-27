import java.awt.Graphics;
import javax.swing.JPanel;


public class Renderer extends JPanel{
	private static final long serialVersionUID = 1L;
	Renderer(){
//		System.out.println("Creat Renderer");
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
//		System.out.println("Renderer paint");
		super.paintComponent(g);
		BounceBall.b.render(g);
	}
}
