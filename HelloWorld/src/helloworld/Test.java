package helloworld;

import java.awt.EventQueue;
import java.text.*;

/*
 Library imports
 comment out libraries not used
 Built in window builder 9/27/2019
 */


import javax.swing.JFrame;
/* import javax.swing.JPanel;
import java.awt.BorderLayout; */
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
/* import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Component;
import javax.swing.Box;*/
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;


// Establish fields and JFrame

			public class Test {
			
				private JFrame frame;
				private JTextField txtEmployeeName;
				private JTextField txtCarSaleAmount;
				private JTextField txtEmployeeCommission;
			
				/**
				 * Launch the application.
				 */
				public static void main(String[] args) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Test window = new Test();
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
				public Test() {
					initialize();
				}
			
				/**
				 * Initialize the contents of the frame.
				 */
	private void initialize() {
		
		// itialize frame window - x location, y location , width, length
		
		frame = new JFrame();
		frame.setBounds(500, 500, 368, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// maintitle * Icon
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/shawn/eclipse-workspace/HelloWorld/img/honda.png"));
		label.setBounds(122, 8, 123, 78);
		frame.getContentPane().add(label);
		
		JLabel lblCommissionCalculator = new JLabel("Commission Calculator");
		lblCommissionCalculator.setBounds(29, 96, 309, 23);
		lblCommissionCalculator.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCommissionCalculator.setFont(new Font("Montserrat", Font.PLAIN, 18));
		lblCommissionCalculator.setForeground(Color.BLACK);
		lblCommissionCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Label for name
		// x location, y location , width, length
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(85, 135, 45, 16);
		lblName.setVerticalAlignment(SwingConstants.TOP);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblCommissionCalculator);
		frame.getContentPane().add(lblName);
		
		// Label for sales amount
		// x location, y location , width, length
		
		JLabel lblSalesAmount = new JLabel("Sales Amount");
		lblSalesAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalesAmount.setBounds(44, 183, 86, 16);
		frame.getContentPane().add(lblSalesAmount);
		
		// Label for Commision Percentage
		// x location, y location , width, length
		
		JLabel lblCommissiionPayout = new JLabel("Commissiion %");
		lblCommissiionPayout.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCommissiionPayout.setBounds(34, 231, 96, 16);
		frame.getContentPane().add(lblCommissiionPayout);
		
		// Text Field for input of employee name
		
		txtEmployeeName = new JTextField();
		txtEmployeeName.setBounds(146, 131, 190, 26);
		frame.getContentPane().add(txtEmployeeName);
		txtEmployeeName.setColumns(10);
		
		// Text Field for input of sale amount
		
		txtCarSaleAmount = new JTextField();
		txtCarSaleAmount.setColumns(10);
		txtCarSaleAmount.setBounds(146, 179, 190, 26);
		frame.getContentPane().add(txtCarSaleAmount);
		
		// Text Field for input of commission percentage
		
		txtEmployeeCommission = new JTextField();
		txtEmployeeCommission.setColumns(10);
		txtEmployeeCommission.setBounds(146, 227, 190, 26);
		frame.getContentPane().add(txtEmployeeCommission);
		
		// BTN delivers result in a seperate window
		// converts texts to doubles and string
		// calculate commission amount
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtEmployeeName.getText();
				Double sale = Double.parseDouble(txtCarSaleAmount.getText());
				Double centdbl = Double.parseDouble(txtEmployeeCommission.getText());
				Double cent = centdbl / 100;
				Double comm = sale * cent;
				DecimalFormat df = new DecimalFormat("#.##");
				JOptionPane.showMessageDialog(null, name + " is owed $" + df.format(comm) + " dollars for their $" + df.format(sale) + " dollar sale. \nGreat Job, " + name + "!");
			}
		});
		btnCalculate.setBounds(122, 266, 117, 29);
		frame.getContentPane().add(btnCalculate);
	}
}
