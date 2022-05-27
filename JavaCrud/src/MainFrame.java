import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfFirstName;
	private JTextField tfLastName;
	private JLabel lbWelcome;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("MainFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPane.add(lblNewLabel);
		
		tfFirstName = new JTextField();
		tfFirstName.setBounds(10, 36, 414, 20);
		contentPane.add(tfFirstName);
		tfFirstName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(10, 67, 414, 14);
		contentPane.add(lblNewLabel_1);
		
		tfLastName = new JTextField();
		tfLastName.setBounds(10, 92, 414, 20);
		contentPane.add(tfLastName);
		tfLastName.setColumns(10);
		
		lbWelcome = new JLabel("");
		lbWelcome.setBounds(10, 190, 414, 14);
		contentPane.add(lbWelcome);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = tfFirstName.getText();
				String lastName = tfLastName.getText();
				lbWelcome.setText("Welcome " + firstName + " " + lastName);
			}
		});
		btnOk.setBounds(10, 227, 214, 23);
		contentPane.add(btnOk);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfFirstName.setText("");
				tfLastName.setText("");
				lbWelcome.setText("");
			}
		});
		btnClear.setBounds(245, 227, 179, 23);
		contentPane.add(btnClear);
	}
}
