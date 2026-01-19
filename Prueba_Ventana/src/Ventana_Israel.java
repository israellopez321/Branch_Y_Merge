import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Point;
import java.awt.Component;
import java.util.Locale;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Ventana_Israel {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Israel window = new Ventana_Israel();
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
	public Ventana_Israel() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		panel.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(208, 118, 86, 20);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "Inglés", "Aleman", "Ruso", "Francés"}));
		
		JLabel lblNewLabel_3 = new JLabel("Idioma:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(112, 121, 60, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setLabelFor(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Comunicación:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(112, 156, 90, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(112, 87, 86, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setLabelFor(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(208, 53, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(112, 56, 80, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setLabelFor(textField);
		
		JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
		lblNewLabel.setBounds(121, 11, 185, 26);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setLabelFor(frame);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teléfono");
		rdbtnNewRadioButton.setBackground(new Color(192, 192, 192));
		rdbtnNewRadioButton.setBounds(208, 145, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("E-mail");
		rdbtnNewRadioButton_1.setBackground(new Color(192, 192, 192));
		rdbtnNewRadioButton_1.setBounds(208, 171, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBounds(171, 213, 113, 23);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(208, 84, 86, 20);
		panel.add(passwordField);
	}
}
