import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddNewDeviceFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIPAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewDeviceFrame frame = new AddNewDeviceFrame();
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
	public AddNewDeviceFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 336, 121);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(textFieldIPAddress.getText());
				
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net?" +
			        "user=sql3105042&password=J26G73LDac");

					Statement st = con.createStatement();
					String sql = ("INSERT INTO sql3105042.NetworkDevices (IPAddress) " +
					"VALUES ('"+textFieldIPAddress.getText()

							+ "');");
					//System.out.println(sql);
					//System.out.println("Record added to NetworkDevices table");
					st.executeUpdate(sql);
					con.close();
										
				}
				catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				textFieldIPAddress.setText(null);
				
			}
		});
		btnAdd.setBounds(228, 13, 73, 25);
		contentPane.add(btnAdd);
		
		textFieldIPAddress = new JTextField();
		textFieldIPAddress.setBounds(25, 14, 180, 22);
		contentPane.add(textFieldIPAddress);
		textFieldIPAddress.setColumns(10);
		
		JLabel lblDeviceIpAddress = new JLabel("Device IP Address");
		lblDeviceIpAddress.setBounds(25, 40, 146, 16);
		contentPane.add(lblDeviceIpAddress);
	}
}
