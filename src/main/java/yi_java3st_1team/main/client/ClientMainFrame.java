package yi_java3st_1team.main.client;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.main.client.ui.ClientMainUIPanel;

@SuppressWarnings("serial")
public class ClientMainFrame extends JFrame implements ActionListener{

	private JPanel contentPane; // 내용물,목차+판유리 - 컴포넌트(구성요소,부품)를 부착
	private JPanel pHeader;
	private JPanel pSection;
	private JPanel pFooter;
	private JLabel lblLogo;
	private JLabel lblCopy;
	private ClientMainUIPanel pContents;
	public static JButton btnlogout;
	public static JLabel lblLoginInfo;
	public static JLabel lblLoginTitle;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientMainFrame frame = new ClientMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ClientMainFrame() {
		initialize(); // 초기내용 설정
	}

	private void initialize() {
		// 전체 frame
		setTitle("[고객용] S/W주문관리 프로그램"); // 타이틀
		setSize(1550, 900); // 프레임크기(가로:1150 / 세로:760)
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 - 응용프로그램 종료

		contentPane = new JPanel();
		contentPane.setBackground(new Color(191, 205, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 5));

		// -- Header
		pHeader = new JPanel();
		pHeader.setBackground(SystemColor.inactiveCaption);
		pHeader.setPreferredSize(new Dimension(1150, 120));
		contentPane.add(pHeader, BorderLayout.NORTH);
		pHeader.setLayout(null);

		lblLogo = new JLabel("");
		lblLogo.setBounds(0, 0, 300, 120);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 0));
		lblLogo.setIcon(
				new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\topLogo.png"));
		lblLogo.setPreferredSize(new Dimension(300, 120));
		pHeader.add(lblLogo);
		
		
		/************************************************ 로그아웃버튼 ************************************************/
		// 로그아웃버튼
		btnlogout = new JButton("");
		btnlogout.addActionListener(this);
		btnlogout.setOpaque(false);
		btnlogout.setFocusPainted(false);
		btnlogout.setFocusable(false);
		btnlogout.setBackground(SystemColor.inactiveCaption);
		btnlogout.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\Logoutbtn.png"));
		btnlogout.setBounds(1415, 30, 95, 85);
		pHeader.add(btnlogout);
		
		//로그인정보-1
		lblLoginTitle = new JLabel();
		lblLoginTitle.setForeground(Color.BLACK);
		lblLoginTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginTitle.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblLoginTitle.setBounds(1270, 40, 140, 28);
		pHeader.add(lblLoginTitle);
		
		//로그인정보-2
		lblLoginInfo = new JLabel();
		lblLoginInfo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		lblLoginInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginInfo.setBounds(1270, 63, 133, 47);
		pHeader.add(lblLoginInfo);
		
		//출력X
		lblLoginTitle.setVisible(false);
		lblLoginInfo.setVisible(false);
		btnlogout.setVisible(false);
		
		/**********************************************************************************************************************/		
		

		// -- Section			
		pSection = new JPanel();
		pSection.setBackground(SystemColor.inactiveCaption);
		contentPane.add(pSection, BorderLayout.CENTER);
		pSection.setLayout(new GridLayout(0, 1, 10, 10));

		pContents = new ClientMainUIPanel();
		pContents.setBackground(SystemColor.inactiveCaption);
		pSection.add(pContents);

		// -- Footer
		pFooter = new JPanel();
		pFooter.setBackground(SystemColor.inactiveCaption);
		pFooter.setPreferredSize(new Dimension(1150, 30));
		contentPane.add(pFooter, BorderLayout.SOUTH);
		pFooter.setLayout(new BorderLayout(0, 0));

		lblCopy = new JLabel("");
		lblCopy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCopy.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\botLogo.png"));
		lblCopy.setPreferredSize(new Dimension(400, 30));
		lblCopy.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));
		pFooter.add(lblCopy, BorderLayout.EAST);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnlogout) {
			actionPerformedBtnlogout(e);
		}		
	}
	
	protected void actionPerformedBtnlogout(ActionEvent e) {
		pSection.removeAll();
		pSection.revalidate();
		pSection.repaint();
		pSection.setLayout(new CardLayout(0,0));
		pContents = new ClientMainUIPanel();
		pSection.add(pContents, BorderLayout.CENTER);
		pContents.loginCl = null;
		
		/** 로그아웃 버튼 **/
		btnlogout.setVisible(false);
		
		/** 로그인 정보 **/	
		lblLoginTitle.setVisible(false);
		lblLoginInfo.setVisible(false);
		
	}	
}
