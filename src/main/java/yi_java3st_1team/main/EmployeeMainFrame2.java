package yi_java3st_1team.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.main.ui.EmployeeMainUIPanel;

@SuppressWarnings("serial")
public class EmployeeMainFrame2 extends JFrame {

	public JPanel contentPane; //내용물,목차+판유리 - 컴포넌트(구성요소,부품)를 부착
	private JPanel pHeader;
	public JPanel pSection;
	private JPanel pFooter;
	private JLabel lblLogo;
	private JLabel lblCopy;
	public EmployeeMainUIPanel pContents;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeMainFrame2 frame = new EmployeeMainFrame2();
					frame.setVisible(true); //프레임이 출력되도록 지시
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EmployeeMainFrame2() {
		initialize(); //초기내용 설정
	}
	private void initialize() {
		setTitle("[관리자용] S/W판매관리 프로그램"); //타이틀
		setSize(1550, 900); // 프레임크기(가로:1150 / 세로:760)
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 - 응용프로그램 종료
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(191, 205, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 5));
		
		pHeader = new JPanel();
		pHeader.setBackground(SystemColor.inactiveCaption);
		pHeader.setPreferredSize(new Dimension(1150, 120));
		contentPane.add(pHeader, BorderLayout.NORTH);
		pHeader.setLayout(null);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(0, 0, 300, 120);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBorder(BorderFactory.createEmptyBorder(0,100,0,0));
		lblLogo.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\topLogo.png"));
		lblLogo.setPreferredSize(new Dimension(300, 120));
		pHeader.add(lblLogo);
		pSection = new JPanel();
		pSection.setBackground(SystemColor.inactiveCaption);
		contentPane.add(pSection, BorderLayout.CENTER);
		pSection.setLayout(new GridLayout(0, 1, 10, 10));
		
		pContents = new EmployeeMainUIPanel();
		pContents.setBackground(SystemColor.inactiveCaption);
		pSection.add(pContents);
		
		
		pFooter = new JPanel();
		pFooter.setBackground(SystemColor.inactiveCaption);
		pFooter.setPreferredSize(new Dimension(1150, 30));
		contentPane.add(pFooter, BorderLayout.SOUTH);
		pFooter.setLayout(new BorderLayout(0, 0));
		
		lblCopy = new JLabel("");
		lblCopy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCopy.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\botLogo.png"));
		lblCopy.setPreferredSize(new Dimension(400, 30));
		lblCopy.setBorder(BorderFactory.createEmptyBorder(0,0,0,20));
		pFooter.add(lblCopy, BorderLayout.EAST);
	}
}