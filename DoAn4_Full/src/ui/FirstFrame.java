package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
					frame.setTitle("Transfer file");
					frame.setLocationRelativeTo(null);
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
	public FirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFtp = new JButton("FTP");
		btnFtp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evbtnFtp(arg0);
			}
		});
		btnFtp.setBounds(236, 51, 170, 42);
		contentPane.add(btnFtp);
		
		JButton btnTftp = new JButton("TFTP");
		btnTftp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evbtnTtfp(arg0);
			}
		});
		btnTftp.setBounds(236, 143, 170, 42);
		contentPane.add(btnTftp);
		
		JLabel lblTransferFile = new JLabel("TRANSFER FILE");
		lblTransferFile.setForeground(Color.DARK_GRAY);
		lblTransferFile.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTransferFile.setBounds(26, 97, 144, 37);
		contentPane.add(lblTransferFile);
	}
	private void evbtnFtp(ActionEvent ev) {
		ClientUI Ftp_Client = new ClientUI();
		Ftp_Client.setLocationRelativeTo(null);
		Ftp_Client.setVisible(true);
		
	}
	private void evbtnTtfp(ActionEvent ev) {
		Tftp_Client_UI Tftp_Client = new Tftp_Client_UI();
		Tftp_Client.setLocationRelativeTo(null);
		Tftp_Client.setVisible(true);
		
	}
}
