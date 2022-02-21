import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class MainWindow {
	
	private JFrame frame;
	private JTextField txtHello;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton shopBtn = new JButton("Shop");
		shopBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("I pressed that button");
				System.out.println(txtHello.getText());
				Flight mock = new Flight(); 
				ShopDialog shopD = new ShopDialog(mock);
				shopD.setModal(true);
				shopD.setVisible(true);
			}
		});
		shopBtn.setBounds(189, 225, 117, 29);
		frame.getContentPane().add(shopBtn);
		
		txtHello = new JTextField();
		txtHello.setBackground(Color.RED);
		String textField = "Bla"; 
		txtHello.setText(textField);
		txtHello.setBounds(198, 180, 130, 26);
		frame.getContentPane().add(txtHello);
		txtHello.setColumns(10);
	}
}
