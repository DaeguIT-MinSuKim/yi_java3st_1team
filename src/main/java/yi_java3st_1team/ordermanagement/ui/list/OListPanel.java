package yi_java3st_1team.ordermanagement.ui.list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class OListPanel extends JPanel {
	private JPanel pImgBoard;
	private JPanel pImg;
	private JPanel pIntro;
	public OListPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pSCListPanel = new JPanel();
		pSCListPanel.setBounds(new Rectangle(0, 0, 635, 700));
		add(pSCListPanel, BorderLayout.CENTER);
		pSCListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSCListPanel.setLayout(null);
		
		pImgBoard = new JPanel();
		pImgBoard.setForeground(Color.BLACK);
		pImgBoard.setBackground(SystemColor.inactiveCaptionBorder);
		pImgBoard.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		pImgBoard.setBounds(20, 100, 595, 500);
		pSCListPanel.add(pImgBoard);
		pImgBoard.setLayout(null);
		
		pImg = new JPanel();
		pImg.setBackground(SystemColor.inactiveCaptionBorder);
		pImg.setBounds(20, 20, 555, 400);
		pImgBoard.add(pImg);
		pImg.setLayout(null);
		
		JLabel lblImg = new JLabel("");
		lblImg.setOpaque(true);
		lblImg.setBackground(Color.WHITE);
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainLogo3.png"));
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setBounds(12, 10, 531, 380);
		pImg.add(lblImg);
		
		pIntro = new JPanel();
		pIntro.setBackground(SystemColor.inactiveCaptionBorder);
		pIntro.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		pIntro.setBounds(20, 435, 555, 49);
		pImgBoard.add(pIntro);
		pIntro.setLayout(null);
		
		JLabel lblSummary = new JLabel("               /                     /  공급가 :                  원 /  판매가 :               원");
		lblSummary.setForeground(Color.BLACK);
		lblSummary.setFont(new Font("굴림", Font.BOLD, 13));
		lblSummary.setBounds(12, 10, 531, 29);
		pIntro.add(lblSummary);
		
		JLabel lblPNo = new JLabel("P0001");
		lblPNo.setOpaque(true);
		lblPNo.setBackground(Color.BLACK);
		lblPNo.setForeground(Color.WHITE);
		lblPNo.setFont(new Font("굴림", Font.BOLD, 14));
		lblPNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPNo.setBounds(12, 10, 70, 29);
		pIntro.add(lblPNo);
		
		JLabel lblSCName = new JLabel("소프트마켓");
		lblSCName.setForeground(new Color(0, 100, 0));
		lblSCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCName.setFont(new Font("굴림", Font.BOLD, 14));
		lblSCName.setBounds(95, 10, 100, 29);
		pIntro.add(lblSCName);
		
		JLabel lblSCost = new JLabel("80,000");
		lblSCost.setForeground(Color.GRAY);
		lblSCost.setFont(new Font("굴림", Font.BOLD, 14));
		lblSCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSCost.setBounds(280, 10, 70, 29);
		pIntro.add(lblSCost);
		
		JLabel lblPPrice = new JLabel("80,000");
		lblPPrice.setForeground(Color.BLUE);
		lblPPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPPrice.setFont(new Font("굴림", Font.BOLD, 14));
		lblPPrice.setBounds(445, 10, 70, 29);
		pIntro.add(lblPPrice);
	}
}
