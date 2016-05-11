import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.snmp4j.smi.OID;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;



public class MainFrame extends JFrame {

	private JTable tableIntStats;
	private JPanel contentPane;
	private JLabel lblUpDownIndicator1;
	private JLabel lblUpDownIndicator2;
	private JLabel lblUpDownIndicator3;
	private JLabel lblInt1;
	private JLabel lblInt2;
	private JLabel lblInt3;
	private JLabel lblSwitchInterface;
	private JLabel lblStatus;
	private JLabel lblDescription;
	private JTextField textFieldDes1;
	private JTextField textFieldDes2;
	private JTextField textFieldDes3;
	private JTextField textFieldDes4;
	private JLabel lblVlanId;
	private JTextField textFieldVLAN1;
	private JTextField textFieldVLAN2;
	private JTextField textFieldVLAN3;
	private JLabel lblMax;
	private JLabel lblMacs;
	private JTextField textFieldMax1;
	private JTextField textFieldMax2;
	private JTextField textFieldMax3;
	private JButton btnUpdate1;
	private JTextField textFieldDes5;
	private JTextField textFieldDes6;
	private JTextField textFieldDes7;
	private JTextField textFieldDes8;
	private JTextField textFieldDes9;
	private JTextField textFieldDes10;
	private JTextField textFieldDes11;
	private JTextField textFieldDes12;
	private JTextField textFieldVLAN4;
	private JTextField textFieldVLAN5;
	private JTextField textFieldVLAN6;
	private JTextField textFieldVLAN7;
	private JTextField textFieldVLAN8;
	private JTextField textFieldVLAN9;
	private JTextField textFieldVLAN10;
	private JTextField textFieldVLAN11;
	private JTextField textFieldVLAN12;
	private JTextField textFieldMax4;
	private JTextField textFieldMax5;
	private JTextField textFieldMax6;
	private JTextField textFieldMax7;
	private JTextField textFieldMax8;
	private JTextField textFieldMax9;
	private JTextField textFieldMax10;
	private JTextField textFieldMax11;
	private JTextField textFieldMax12;
	private JButton button;
	private JButton btnGraphStats;

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
		setTitle("Super Network Configurator 2.01.01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		tableIntStats = new JTable();
		
		JScrollPane scrollPane = new JScrollPane(tableIntStats);
		tableIntStats.setAutoCreateRowSorter(true);
		
		scrollPane.setBounds(28, 359, 683, 110);
		//scrollPane.setVisible(false);
		contentPane.add(scrollPane);
		
	    DefaultTableModel dtm = new DefaultTableModel(0,0) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return int.class;
                    case 2:
                        return int.class;
                    case 3:
                        return int.class;
                    case 4:
                        return int.class;
                    default:
                        return int.class;
                }
            }			    
	    
	    
	    };
	    String header[] = {"Interface", "RX pkt/s", "TX pkt/s", "RX bit/s", "TX bit/s"};
		
	    dtm.setColumnIdentifiers(header);
		
	    
	    tableIntStats.setModel(dtm);
	    tableIntStats.getColumnModel().getColumn(0).setPreferredWidth(200);
	    tableIntStats.getColumnModel().getColumn(1).setPreferredWidth(50);
	    tableIntStats.getColumnModel().getColumn(2).setPreferredWidth(50);
	    tableIntStats.getColumnModel().getColumn(3).setPreferredWidth(50);
	    tableIntStats.getColumnModel().getColumn(4).setPreferredWidth(50);
	    
	    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm); 
	    tableIntStats.setRowSorter(sorter);
		
	
		lblInt1 = new JLabel("Interface");
		lblInt1.setBounds(28, 106, 140, 16);
		contentPane.add(lblInt1);
		
		lblInt2 = new JLabel("Interface");
		lblInt2.setBounds(28, 126, 140, 16);
		contentPane.add(lblInt2);
		
		lblInt3 = new JLabel("Interface");
		lblInt3.setBounds(28, 146, 140, 16);
		contentPane.add(lblInt3);
		
		JLabel lblInt4 = new JLabel("Interface");
		lblInt4.setBounds(28, 166, 140, 16);
		contentPane.add(lblInt4);
		
		JLabel lblInt5 = new JLabel("Interface");
		lblInt5.setBounds(28, 186, 140, 16);
		contentPane.add(lblInt5);
		
		JLabel lblInt6 = new JLabel("Interface");
		lblInt6.setBounds(28, 206, 140, 16);
		contentPane.add(lblInt6);
		
		JLabel lblInt7 = new JLabel("Interface");
		lblInt7.setBounds(28, 226, 140, 16);
		contentPane.add(lblInt7);
		
		JLabel lblInt8 = new JLabel("Interface");
		lblInt8.setBounds(28, 246, 140, 16);
		contentPane.add(lblInt8);
		
		JLabel lblInt9 = new JLabel("Interface");
		lblInt9.setBounds(28, 266, 140, 16);
		contentPane.add(lblInt9);
		
		JLabel lblInt10 = new JLabel("Interface");
		lblInt10.setBounds(28, 286, 140, 16);
		contentPane.add(lblInt10);
		
		JLabel lblInt11 = new JLabel("Interface");
		lblInt11.setBounds(28, 306, 140, 16);
		contentPane.add(lblInt11);
		
		JLabel lblInt12 = new JLabel("Interface");
		lblInt12.setBounds(28, 326, 140, 16);
		contentPane.add(lblInt12);
		
		lblUpDownIndicator1 = new JLabel("\u2022");
		lblUpDownIndicator1.setForeground(Color.RED);
		lblUpDownIndicator1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator1.setBounds(170, 99, 30, 25);
		contentPane.add(lblUpDownIndicator1);
		
		lblUpDownIndicator2 = new JLabel("\u2022");
		lblUpDownIndicator2.setForeground(Color.RED);
		lblUpDownIndicator2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator2.setBounds(170, 119, 30, 25);
		contentPane.add(lblUpDownIndicator2);
		
		lblUpDownIndicator3 = new JLabel("\u2022");
		lblUpDownIndicator3.setForeground(Color.RED);
		lblUpDownIndicator3.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator3.setBounds(170, 139, 30, 25);
		contentPane.add(lblUpDownIndicator3);
		
		JLabel lblUpDownIndicator4 = new JLabel("\u2022");
		lblUpDownIndicator4.setForeground(Color.RED);
		lblUpDownIndicator4.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator4.setBounds(170, 159, 30, 25);
		contentPane.add(lblUpDownIndicator4);
		
		JLabel lblUpDownIndicator5 = new JLabel("\u2022");
		lblUpDownIndicator5.setForeground(Color.RED);
		lblUpDownIndicator5.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator5.setBounds(170, 179, 30, 25);
		contentPane.add(lblUpDownIndicator5);
		
		JLabel lblUpDownIndicator6 = new JLabel("\u2022");
		lblUpDownIndicator6.setForeground(Color.RED);
		lblUpDownIndicator6.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator6.setBounds(170, 199, 30, 25);
		contentPane.add(lblUpDownIndicator6);
		
		JLabel lblUpDownIndicator7 = new JLabel("\u2022");
		lblUpDownIndicator7.setForeground(Color.RED);
		lblUpDownIndicator7.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator7.setBounds(170, 219, 30, 25);
		contentPane.add(lblUpDownIndicator7);
		
		JLabel lblUpDownIndicator8 = new JLabel("\u2022");
		lblUpDownIndicator8.setForeground(Color.RED);
		lblUpDownIndicator8.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator8.setBounds(170, 239, 30, 25);
		contentPane.add(lblUpDownIndicator8);
		
		JLabel lblUpDownIndicator9 = new JLabel("\u2022");
		lblUpDownIndicator9.setForeground(Color.RED);
		lblUpDownIndicator9.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator9.setBounds(170, 259, 30, 25);
		contentPane.add(lblUpDownIndicator9);
		
		JLabel lblUpDownIndicator10 = new JLabel("\u2022");
		lblUpDownIndicator10.setForeground(Color.RED);
		lblUpDownIndicator10.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator10.setBounds(170, 279, 30, 25);
		contentPane.add(lblUpDownIndicator10);
		
		JLabel lblUpDownIndicator11 = new JLabel("\u2022");
		lblUpDownIndicator11.setForeground(Color.RED);
		lblUpDownIndicator11.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator11.setBounds(170, 299, 30, 25);
		contentPane.add(lblUpDownIndicator11);
		
		JLabel lblUpDownIndicator12 = new JLabel("\u2022");
		lblUpDownIndicator12.setForeground(Color.RED);
		lblUpDownIndicator12.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblUpDownIndicator12.setBounds(170, 319, 30, 25);
		contentPane.add(lblUpDownIndicator12);
		
		
		textFieldDes1 = new JTextField();
		textFieldDes1.setBounds(230, 103, 163, 20);
		contentPane.add(textFieldDes1);
		textFieldDes1.setColumns(10);
		
		textFieldDes2 = new JTextField();
		textFieldDes2.setColumns(10);
		textFieldDes2.setBounds(230, 123, 163, 20);
		contentPane.add(textFieldDes2);
		
		textFieldDes3 = new JTextField();
		textFieldDes3.setColumns(10);
		textFieldDes3.setBounds(230, 143, 163, 20);
		contentPane.add(textFieldDes3);
		
		
		
		textFieldVLAN1 = new JTextField();
		textFieldVLAN1.setColumns(10);
		textFieldVLAN1.setBounds(411, 103, 56, 20);
		contentPane.add(textFieldVLAN1);
		
		textFieldVLAN2 = new JTextField();
		textFieldVLAN2.setColumns(10);
		textFieldVLAN2.setBounds(411, 123, 56, 20);
		contentPane.add(textFieldVLAN2);
		
		textFieldVLAN3 = new JTextField();
		textFieldVLAN3.setColumns(10);
		textFieldVLAN3.setBounds(411, 143, 56, 20);
		contentPane.add(textFieldVLAN3);
		
		textFieldVLAN4 = new JTextField();
		textFieldVLAN4.setColumns(10);
		textFieldVLAN4.setBounds(411, 163, 56, 20);
		contentPane.add(textFieldVLAN4);
		
		textFieldVLAN5 = new JTextField();
		textFieldVLAN5.setColumns(10);
		textFieldVLAN5.setBounds(411, 183, 56, 20);
		contentPane.add(textFieldVLAN5);
		
		textFieldVLAN6 = new JTextField();
		textFieldVLAN6.setColumns(10);
		textFieldVLAN6.setBounds(411, 203, 56, 20);
		contentPane.add(textFieldVLAN6);
		
		textFieldVLAN7 = new JTextField();
		textFieldVLAN7.setColumns(10);
		textFieldVLAN7.setBounds(411, 223, 56, 20);
		contentPane.add(textFieldVLAN7);
		
		textFieldVLAN8 = new JTextField();
		textFieldVLAN8.setColumns(10);
		textFieldVLAN8.setBounds(411, 243, 56, 20);
		contentPane.add(textFieldVLAN8);
		
		textFieldVLAN9 = new JTextField();
		textFieldVLAN9.setColumns(10);
		textFieldVLAN9.setBounds(411, 263, 56, 20);
		contentPane.add(textFieldVLAN9);
		
		textFieldVLAN10 = new JTextField();
		textFieldVLAN10.setColumns(10);
		textFieldVLAN10.setBounds(411, 283, 56, 20);
		contentPane.add(textFieldVLAN10);
		
		textFieldVLAN11 = new JTextField();
		textFieldVLAN11.setColumns(10);
		textFieldVLAN11.setBounds(411, 303, 56, 20);
		contentPane.add(textFieldVLAN11);
		
		textFieldVLAN12 = new JTextField();
		textFieldVLAN12.setColumns(10);
		textFieldVLAN12.setBounds(411, 323, 56, 20);
		contentPane.add(textFieldVLAN12);
		

		
		textFieldDes4 = new JTextField();
		textFieldDes4.setColumns(10);
		textFieldDes4.setBounds(230, 163, 163, 20);
		contentPane.add(textFieldDes4);
		
		textFieldDes5 = new JTextField();
		textFieldDes5.setColumns(10);
		textFieldDes5.setBounds(230, 183, 163, 20);
		contentPane.add(textFieldDes5);
		
		textFieldDes6 = new JTextField();
		textFieldDes6.setColumns(10);
		textFieldDes6.setBounds(230, 203, 163, 20);
		contentPane.add(textFieldDes6);
		
		textFieldDes7 = new JTextField();
		textFieldDes7.setColumns(10);
		textFieldDes7.setBounds(230, 223, 163, 20);
		contentPane.add(textFieldDes7);
		
		textFieldDes8 = new JTextField();
		textFieldDes8.setColumns(10);
		textFieldDes8.setBounds(230, 243, 163, 20);
		contentPane.add(textFieldDes8);
		
		textFieldDes9 = new JTextField();
		textFieldDes9.setColumns(10);
		textFieldDes9.setBounds(230, 263, 163, 20);
		contentPane.add(textFieldDes9);
		
		textFieldDes10 = new JTextField();
		textFieldDes10.setColumns(10);
		textFieldDes10.setBounds(230, 283, 163, 20);
		contentPane.add(textFieldDes10);
		
		textFieldDes11 = new JTextField();
		textFieldDes11.setColumns(10);
		textFieldDes11.setBounds(230, 303, 163, 20);
		contentPane.add(textFieldDes11);
		
		textFieldDes12 = new JTextField();
		textFieldDes12.setColumns(10);
		textFieldDes12.setBounds(230, 323, 163, 20);
		contentPane.add(textFieldDes12);
		

		
		
		JCheckBox chckbxPS1 = new JCheckBox("");
		chckbxPS1.setBounds(496, 102, 30, 20);
		contentPane.add(chckbxPS1);
		
		JCheckBox chckbxPS2 = new JCheckBox("");
		chckbxPS2.setBounds(496, 122, 30, 20);
		contentPane.add(chckbxPS2);
		
		JCheckBox chckbxPS3 = new JCheckBox("");
		chckbxPS3.setBounds(496, 142, 30, 20);
		contentPane.add(chckbxPS3);
		
		JCheckBox chckbxPS4 = new JCheckBox("");
		chckbxPS4.setBounds(496, 162, 30, 20);
		contentPane.add(chckbxPS4);
		
		JCheckBox chckbxPS5 = new JCheckBox("");
		chckbxPS5.setBounds(496, 182, 30, 20);
		contentPane.add(chckbxPS5);
		
		JCheckBox chckbxPS6 = new JCheckBox("");
		chckbxPS6.setBounds(496, 202, 30, 20);
		contentPane.add(chckbxPS6);
		
		JCheckBox chckbxPS7 = new JCheckBox("");
		chckbxPS7.setBounds(496, 222, 30, 20);
		contentPane.add(chckbxPS7);
		
		JCheckBox chckbxPS8 = new JCheckBox("");
		chckbxPS8.setBounds(496, 242, 30, 20);
		contentPane.add(chckbxPS8);
		
		JCheckBox chckbxPS9 = new JCheckBox("");
		chckbxPS9.setBounds(496, 262, 30, 20);
		contentPane.add(chckbxPS9);
		
		JCheckBox chckbxPS10 = new JCheckBox("");
		chckbxPS10.setBounds(496, 282, 30, 20);
		contentPane.add(chckbxPS10);
		
		JCheckBox chckbxPS11 = new JCheckBox("");
		chckbxPS11.setBounds(496, 302, 30, 20);
		contentPane.add(chckbxPS11);
		
		JCheckBox chckbxPS12 = new JCheckBox("");
		chckbxPS12.setBounds(496, 322, 30, 20);
		contentPane.add(chckbxPS12);
	
		
		textFieldMax1 = new JTextField();
		textFieldMax1.setColumns(10);
		textFieldMax1.setBounds(548, 103, 44, 20);
		contentPane.add(textFieldMax1);
		
		textFieldMax2 = new JTextField();
		textFieldMax2.setColumns(10);
		textFieldMax2.setBounds(548, 123, 44, 20);
		contentPane.add(textFieldMax2);
		
		textFieldMax3 = new JTextField();
		textFieldMax3.setColumns(10);
		textFieldMax3.setBounds(548, 143, 44, 20);
		contentPane.add(textFieldMax3);
				
		textFieldMax4 = new JTextField();
		textFieldMax4.setColumns(10);
		textFieldMax4.setBounds(548, 163, 44, 20);
		contentPane.add(textFieldMax4);
		
		textFieldMax5 = new JTextField();
		textFieldMax5.setColumns(10);
		textFieldMax5.setBounds(548, 183, 44, 20);
		contentPane.add(textFieldMax5);
		
		textFieldMax6 = new JTextField();
		textFieldMax6.setColumns(10);
		textFieldMax6.setBounds(548, 203, 44, 20);
		contentPane.add(textFieldMax6);
		
		textFieldMax7 = new JTextField();
		textFieldMax7.setColumns(10);
		textFieldMax7.setBounds(548, 223, 44, 20);
		contentPane.add(textFieldMax7);
		
		textFieldMax8 = new JTextField();
		textFieldMax8.setColumns(10);
		textFieldMax8.setBounds(548, 243, 44, 20);
		contentPane.add(textFieldMax8);
		
		textFieldMax9 = new JTextField();
		textFieldMax9.setColumns(10);
		textFieldMax9.setBounds(548, 263, 44, 20);
		contentPane.add(textFieldMax9);
		
		textFieldMax10 = new JTextField();
		textFieldMax10.setColumns(10);
		textFieldMax10.setBounds(548, 283, 44, 20);
		contentPane.add(textFieldMax10);
		
		textFieldMax11 = new JTextField();
		textFieldMax11.setColumns(10);
		textFieldMax11.setBounds(548, 303, 44, 20);
		contentPane.add(textFieldMax11);
		
		textFieldMax12 = new JTextField();
		textFieldMax12.setColumns(10);
		textFieldMax12.setBounds(548, 323, 44, 20);
		contentPane.add(textFieldMax12);
		
		JLabel lblTemperature = new JLabel("Temperature");
		lblTemperature.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTemperature.setBounds(448, 486, 36, 16);
		lblTemperature.setVisible(false);
		contentPane.add(lblTemperature);
				
		
		JLabel[] lblInts = new JLabel[25];
		lblInts[1] = lblInt1;
		lblInts[2] = lblInt2;
		lblInts[3] = lblInt3;
		lblInts[4] = lblInt4;
		lblInts[5] = lblInt5;
		lblInts[6] = lblInt6;
		lblInts[7] = lblInt7;
		lblInts[8] = lblInt8;
		lblInts[9] = lblInt9;
		lblInts[10] = lblInt10;
		lblInts[11] = lblInt11;
		lblInts[12] = lblInt12;

		
		JLabel[] lblUpDownIndicators = new JLabel[25];
		lblUpDownIndicators[1] = lblUpDownIndicator1;
		lblUpDownIndicators[2] = lblUpDownIndicator2;
		lblUpDownIndicators[3] = lblUpDownIndicator3;
		lblUpDownIndicators[4] = lblUpDownIndicator4;
		lblUpDownIndicators[5] = lblUpDownIndicator5;
		lblUpDownIndicators[6] = lblUpDownIndicator6;
		lblUpDownIndicators[7] = lblUpDownIndicator7;
		lblUpDownIndicators[8] = lblUpDownIndicator8;
		lblUpDownIndicators[9] = lblUpDownIndicator9;
		lblUpDownIndicators[10] = lblUpDownIndicator10;
		lblUpDownIndicators[11] = lblUpDownIndicator11;
		lblUpDownIndicators[12] = lblUpDownIndicator12;
		
		JTextField[] textFieldDes = new JTextField[25];
		textFieldDes[1] = textFieldDes1;
		textFieldDes[2] = textFieldDes2;
		textFieldDes[3] = textFieldDes3;
		textFieldDes[4] = textFieldDes4;
		textFieldDes[5] = textFieldDes5;
		textFieldDes[6] = textFieldDes6;
		textFieldDes[7] = textFieldDes7;
		textFieldDes[8] = textFieldDes8;
		textFieldDes[9] = textFieldDes9;
		textFieldDes[10] = textFieldDes10;
		textFieldDes[11] = textFieldDes11;
		textFieldDes[12] = textFieldDes12;

		
		JTextField[] textFieldVLANs = new JTextField[25];
		textFieldVLANs[1] = textFieldVLAN1;
		textFieldVLANs[2] = textFieldVLAN2;
		textFieldVLANs[3] = textFieldVLAN3;
		textFieldVLANs[4] = textFieldVLAN4;
		textFieldVLANs[5] = textFieldVLAN5;
		textFieldVLANs[6] = textFieldVLAN6;
		textFieldVLANs[7] = textFieldVLAN7;
		textFieldVLANs[8] = textFieldVLAN8;
		textFieldVLANs[9] = textFieldVLAN9;
		textFieldVLANs[10] = textFieldVLAN10;
		textFieldVLANs[11] = textFieldVLAN11;
		textFieldVLANs[12] = textFieldVLAN12;

		
		JCheckBox[] chckbxPS = new JCheckBox[25];
		chckbxPS[1] = chckbxPS1;
		chckbxPS[2] = chckbxPS2;
		chckbxPS[3] = chckbxPS3;
		chckbxPS[4] = chckbxPS4;
		chckbxPS[5] = chckbxPS5;
		chckbxPS[6] = chckbxPS6;
		chckbxPS[7] = chckbxPS7;
		chckbxPS[8] = chckbxPS8;
		chckbxPS[9] = chckbxPS9;
		chckbxPS[10] = chckbxPS10;
		chckbxPS[11] = chckbxPS11;
		chckbxPS[12] = chckbxPS12;
		
		JTextField[] textFieldMax = new JTextField[25];
		textFieldMax[1] = textFieldMax1;
		textFieldMax[2] = textFieldMax2;
		textFieldMax[3] = textFieldMax3;
		textFieldMax[4] = textFieldMax4;
		textFieldMax[5] = textFieldMax5;
		textFieldMax[6] = textFieldMax6;
		textFieldMax[7] = textFieldMax7;
		textFieldMax[8] = textFieldMax8;
		textFieldMax[9] = textFieldMax9;
		textFieldMax[10] = textFieldMax10;
		textFieldMax[11] = textFieldMax11;
		textFieldMax[12] = textFieldMax12;
		
		
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(40, 14, 305, 22);
		contentPane.add(comboBox);
		
		JButton btnAddNewDevice = new JButton("Add New Device");
		btnAddNewDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
						//AddNewDeviceFrame addNewDeficeFrame = new AddNewDeviceFrame();
						//addNewDeficeFrame.setVisible(true);
						
						JFrame frame = new JFrame();
						Object result = JOptionPane.showInputDialog(frame, "Enter printer name:");
						comboBox.addItem(result);
						
						Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net?" +
						        "user=sql3105042&password=J26G73LDac");

								Statement st = con.createStatement();
								String sql = ("INSERT INTO sql3105042.NetworkDevices (IPAddress) " +
								"VALUES ('"+result

										+ "');");
								//System.out.println(sql);
								//System.out.println("Record added to NetworkDevices table");
								st.executeUpdate(sql);
								con.close();
						
						
						
						
						
					} catch (Exception e) {
						e.printStackTrace();
				}
				
	
			}
		});
		
		btnAddNewDevice.setBounds(553, 13, 140, 25);
		contentPane.add(btnAddNewDevice);
		
		JButton btnTempTimer = new JButton("Poll Device Temperature");
		btnTempTimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				btnTempTimer.setEnabled(false);
				Timer timer = new Timer();
				
				TimerTask timerTask = new TimerTask() {
					
						public void run(){ 
							
							SimpleSnmpClient client = new SimpleSnmpClient("udp:" + comboBox.getSelectedItem() + "/161");
							String ipAddress = comboBox.getSelectedItem().toString();
							
							try {
								String sysTemp = client.getAsString(new OID(".1.3.6.1.4.1.9.9.13.1.3.1.3.1006"));
								//System.out.println(sysTemp);
								
								Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net?" +
								        "user=sql3105042&password=J26G73LDac");

										Statement st = con.createStatement();
										String sql = ("INSERT INTO sql3105042.DeviceTemps (IPAddress, temp) " +
										"VALUES ('"+ipAddress+"','"
												+ sysTemp 
												+ "');");
										
									
																			
										//System.out.println(sql);
										//System.out.println("Record added to NetworkDevices table");
										st.executeUpdate(sql);
										con.close();
								
										lblTemperature.setText(sysTemp + "\u00b0"+"C");
										lblTemperature.setVisible(true);
								
								
								
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
							
							
							//here have your program do whatever you wnt 
						}; 
				}; 

				timer.schedule(timerTask, 0, 300000); //five minutes
							
			}
		});
		btnTempTimer.setBounds(496, 482, 215, 25);
		btnTempTimer.setVisible(false);
		contentPane.add(btnTempTimer);
				

		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net?" +
	        "user=sql3105042&password=J26G73LDac");

			Statement st = con.createStatement();
			String sql = ("SELECT IPAddress FROM sql3105042.NetworkDevices");
			//System.out.println(sql);
			ResultSet rs = st.executeQuery(sql); 
			
			while (rs.next()) { 
			    String IPAddress = rs.getString("IPAddress"); 
			    // add group names to the array list
			    model.addElement(IPAddress);
			} 
			
			
			
			//System.out.println("Record added to NetworkDevices table");
			
			con.close();
		}
		catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
				
		comboBox.removeAllItems();
		comboBox.setModel(model);
		
		JButton btnQueryDevice = new JButton("Query Device");
		btnQueryDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
								
				SimpleSnmpClient client = new SimpleSnmpClient("udp:" + comboBox.getSelectedItem() + "/161");
				dtm.setRowCount(0);
				
				btnGraphStats.setVisible(true);
				button.setVisible(true);
				btnTempTimer.setVisible(true);
				
				for (int i=1; i<13; i++) {
					
					try {
					String sysStatusUpDown = "Unknown";
					String twoDigitInterface = String.format("%02d", i);
					
					String sysInterface = client.getAsString(new OID(".1.3.6.1.2.1.2.2.1.2.101" + twoDigitInterface));
					lblInts[i].setText(sysInterface);
					
					String sysStatus = client.getAsString(new OID(".1.3.6.1.2.1.2.2.1.8.101" + twoDigitInterface));
					if (sysStatus.contains("1")) {
						sysStatusUpDown = "Up";
						lblUpDownIndicators[i].setForeground(Color.GREEN);
					} else if (sysStatus.contains("2")) {
						sysStatusUpDown = "Down";
					}
					
					String sysIntDesc = client.getAsString(new OID(".1.3.6.1.2.1.31.1.1.1.18.101" + twoDigitInterface));
					textFieldDes[i].setText(sysIntDesc);
					
					String sysIntVlan = client.getAsString(new OID(".1.3.6.1.4.1.9.9.68.1.2.2.1.2.101" + twoDigitInterface));
					textFieldVLANs[i].setText(sysIntVlan);
					
					String sysIntPortSecurityEnabled = client.getAsString(new OID(".1.3.6.1.4.1.9.9.315.1.2.1.1.1.101" + twoDigitInterface));
					// 1 = Enabled, 2 = Not configured
					if (sysIntPortSecurityEnabled.contains("1")) {
						chckbxPS[i].setSelected(true);
					}
					
					String sysIntPortSecurityMax = client.getAsString(new OID(".1.3.6.1.4.1.9.9.315.1.2.1.1.3.101" + twoDigitInterface));
					textFieldMax[i].setText(sysIntPortSecurityMax);
							
					//System.out.println(sysInterface + "    " + sysStatusUpDown + "   " + sysIntDesc + "   " + sysIntVlan + "    " + sysIntPortSecurityEnabled + "   " + sysIntPortSecurityMax);

					
					String sysIntRXpkts = client.getAsString(new OID(".1.3.6.1.4.1.9.2.2.1.1.7.101" + twoDigitInterface));
					String sysIntTXpkts = client.getAsString(new OID(".1.3.6.1.4.1.9.2.2.1.1.9.101" + twoDigitInterface));
					String sysIntRXbits = client.getAsString(new OID(".1.3.6.1.4.1.9.2.2.1.1.6.101" + twoDigitInterface));
					String sysIntTXbits = client.getAsString(new OID(".1.3.6.1.4.1.9.2.2.1.1.8.101" + twoDigitInterface));
					
					
					Object[] row = {sysInterface, Integer.parseInt(sysIntRXpkts), Integer.parseInt(sysIntTXpkts),
							Integer.parseInt(sysIntRXbits), Integer.parseInt(sysIntTXbits)};
					dtm.addRow(row);
					
					}
					catch (IOException e2) {
						// TODO Auto-generated catch block
						//e2.printStackTrace();
						JOptionPane.showMessageDialog(null,
							    "Device is not online.",
							    "Error",
							    JOptionPane.ERROR_MESSAGE);
						
					}
					
				}
				
			}
		});
		btnQueryDevice.setBounds(357, 13, 126, 25);
		contentPane.add(btnQueryDevice);
		
		lblSwitchInterface = new JLabel("Switch Interface");
		lblSwitchInterface.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSwitchInterface.setBounds(28, 75, 116, 16);
		contentPane.add(lblSwitchInterface);
		
		lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStatus.setBounds(160, 75, 44, 16);
		contentPane.add(lblStatus);
		
		lblDescription = new JLabel("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescription.setBounds(230, 75, 163, 16);
		contentPane.add(lblDescription);
		
		lblVlanId = new JLabel("VLAN ID");
		lblVlanId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVlanId.setBounds(411, 75, 56, 16);
		contentPane.add(lblVlanId);

		
		JLabel lblPort = new JLabel("Port");
		lblPort.setHorizontalAlignment(SwingConstants.CENTER);
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPort.setBounds(474, 59, 70, 16);
		contentPane.add(lblPort);
		
		JLabel lblSecurity = new JLabel("Security");
		lblSecurity.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecurity.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSecurity.setBounds(474, 75, 70, 16);
		contentPane.add(lblSecurity);
		
		lblMax = new JLabel("Max");
		lblMax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMax.setHorizontalAlignment(SwingConstants.CENTER);
		lblMax.setBounds(540, 59, 56, 16);
		contentPane.add(lblMax);
		
		lblMacs = new JLabel("MACs");
		lblMacs.setHorizontalAlignment(SwingConstants.CENTER);
		lblMacs.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMacs.setBounds(540, 75, 56, 16);
		contentPane.add(lblMacs);
		
		btnUpdate1 = new JButton("Update All");
		btnUpdate1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SnmpSet switch1 = new SnmpSet();
				
				for (int i=1; i<13; i++) {
					
					String twoDigitInterface = String.format("%02d", i);
				
					switch1.snmpSet(comboBox.getSelectedItem().toString(), "private", ".1.3.6.1.4.1.9.9.68.1.2.2.1.2.101" + twoDigitInterface, Integer.parseInt(textFieldVLANs[i].getText()));
					switch1.snmpSet(comboBox.getSelectedItem().toString(), "private", ".1.3.6.1.4.1.9.9.315.1.2.1.1.3.101" + twoDigitInterface, Integer.parseInt(textFieldMax[i].getText()));
				
					if (chckbxPS[i].isSelected()) {
						switch1.snmpSet(comboBox.getSelectedItem().toString(), "private", ".1.3.6.1.4.1.9.9.315.1.2.1.1.1.101" + twoDigitInterface, 1);				
					} else {
						switch1.snmpSet(comboBox.getSelectedItem().toString(), "private", ".1.3.6.1.4.1.9.9.315.1.2.1.1.1.101" + twoDigitInterface, 2);	
					}
					switch1.snmpSetString(comboBox.getSelectedItem().toString(), "private", ".1.3.6.1.2.1.31.1.1.1.18.101" + twoDigitInterface, textFieldDes[i].getText());
					//System.out.println(textFieldDes1.getText());
				}
			}
		});
		
		btnUpdate1.setBounds(614, 323, 97, 20);
		contentPane.add(btnUpdate1);
		
		btnGraphStats = new JButton("Graph Packet Stats");
		
		btnGraphStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				int rowcount = dtm.getRowCount();
								
				for (int i=0; i<rowcount; i++) {
					
					int rxpk = Integer.parseInt( dtm.getValueAt(i, 1).toString() );
					int txpk = Integer.parseInt( dtm.getValueAt(i, 2).toString() );
					
					String intname = dtm.getValueAt(i, 0).toString();
					String substring = "GigabitEthernet";
					String [] parts = intname.split(substring);
					String intID = parts[1];
					
					dataset.setValue(txpk, "TX pkt/s", intID);
					dataset.setValue(rxpk, "RX pkt/s", intID);
				}
				
				JFreeChart chart = ChartFactory.createBarChart("Interface Traffic", "Interface", "Packets per Second", dataset);
				CategoryPlot p = chart.getCategoryPlot();
				p.setRangeGridlinePaint(Color.black);
				ChartFrame cframe = new ChartFrame("Switch Interface Statistics", chart);
				cframe.setSize(1000,500);
				cframe.setVisible(true);
		
				
			}
		});
		
		
		btnGraphStats.setBounds(28, 482, 172, 25);
		btnGraphStats.setVisible(false);
		contentPane.add(btnGraphStats);
		
		button = new JButton("Graph Bandwidth Stats");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
				int rowcount = dtm.getRowCount();
								
				for (int i=0; i<rowcount; i++) {
					
					int rxbit = Integer.parseInt( dtm.getValueAt(i, 3).toString() );
					int txbit = Integer.parseInt( dtm.getValueAt(i, 4).toString() );
					
					String intname = dtm.getValueAt(i, 0).toString();
					String substring = "GigabitEthernet";
					String [] parts = intname.split(substring);
					String intID = parts[1];
					
					dataset2.setValue(txbit, "TX bitt/s", intID);
					dataset2.setValue(rxbit, "RX bit/s", intID);
				}
				
				JFreeChart chart = ChartFactory.createBarChart("Interface Traffic", "Interface", "Bitss per Second", dataset2);
				CategoryPlot p = chart.getCategoryPlot();
				p.setRangeGridlinePaint(Color.black);
				ChartFrame cframe = new ChartFrame("Switch Interface Statistics", chart);
				cframe.setSize(1000,500);
				cframe.setVisible(true);
				
				
			}
		});
		button.setBounds(212, 482, 172, 25);
		button.setVisible(false);
		contentPane.add(button);
		

		


		
		// Future security here (check username against preapproved list)
		String username = System.getProperty("user.name");
		if (username.contains("Larry")) {
		} else {
			btnUpdate1.setEnabled(false);
		}
		
		// System.out.println(username);
	}
}
