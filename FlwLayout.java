import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlwLayout {
private JFrame frame;
private JPanel panel;
private JTextField [] text = new JTextField [4];

public FlwLayout() {
	frame = new JFrame();
	
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	text [0] = new JTextField(20);
	text [1] = new JTextField(20);
	text [2] = new JTextField(20);
	text [3] = new JTextField(20);
	
	panel = new JPanel();
	panel.setBackground(Color.blue);
	panel.setLayout(new FlowLayout());
	panel.add(text [0]);
	panel.add(text [1]);
	panel.add(text [2]);
	panel.add(text [3]);
	panel.setVisible(true);
	
	frame.add(panel);
	
}
}