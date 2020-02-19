package yi_java3st_1team.ordermanagement.ui.list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class ClientOListPanel extends JPanel {
	private JPanel pImgBoard;
	private JPanel pImg;
	private JPanel pIntro;
	private JTextField textField;
	public ClientOListPanel() {

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
		pImgBoard.setBounds(20, 100, 595, 446);
		pSCListPanel.add(pImgBoard);
		pImgBoard.setLayout(null);
		
		pImg = new JPanel();
		pImg.setBackground(SystemColor.inactiveCaptionBorder);
		pImg.setBounds(20, 20, 555, 350);
		pImgBoard.add(pImg);
		pImg.setLayout(null);
		
		JLabel lblImg = new JLabel("");
		lblImg.setOpaque(true);
		lblImg.setBackground(Color.WHITE);
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainLogo3.png"));
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setBounds(12, 10, 531, 330);
		pImg.add(lblImg);
		
		pIntro = new JPanel();
		pIntro.setBackground(SystemColor.inactiveCaptionBorder);
		pIntro.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		pIntro.setBounds(20, 385, 555, 49);
		pImgBoard.add(pIntro);
		pIntro.setLayout(null);
		
		JLabel lblSummary = new JLabel("                  /                         /  판매가 :                   원");
		lblSummary.setForeground(Color.BLACK);
		lblSummary.setFont(new Font("굴림", Font.BOLD, 13));
		lblSummary.setBounds(81, 10, 413, 29);
		pIntro.add(lblSummary);
		
		JLabel lblPNo = new JLabel("P0001");
		lblPNo.setBackground(Color.BLACK);
		lblPNo.setOpaque(true);
		lblPNo.setForeground(Color.WHITE);
		lblPNo.setFont(new Font("굴림", Font.BOLD, 14));
		lblPNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPNo.setBounds(93, 10, 70, 29);
		pIntro.add(lblPNo);
		
		JLabel lblSCName = new JLabel("소프트마켓");
		lblSCName.setForeground(new Color(0, 128, 0));
		lblSCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCName.setFont(new Font("굴림", Font.BOLD, 14));
		lblSCName.setBounds(190, 10, 100, 29);
		pIntro.add(lblSCName);
		
		JLabel lblPPrice = new JLabel("80,000");
		lblPPrice.setForeground(Color.BLUE);
		lblPPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPPrice.setFont(new Font("굴림", Font.BOLD, 14));
		lblPPrice.setBounds(392, 9, 70, 29);
		pIntro.add(lblPPrice);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(20, 543, 595, 65);
		pSCListPanel.add(panel);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("판매가 X 수량");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 20, 131, 25);
		panel.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner.setBounds(213, 20, 69, 25);
		panel.add(spinner);
		
		JLabel lblX = new JLabel("<html>  X      <span style='color:red;'>할인율</span></html>");
		lblX.setForeground(Color.BLACK);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("굴림", Font.BOLD, 14));
		lblX.setBounds(290, 20, 90, 25);
		panel.add(lblX);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("굴림", Font.PLAIN, 12));
		comboBox.setForeground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"30개 이상", "50개 이상", "100개 이상"}));
		comboBox.setBounds(380, 20, 131, 25);
		panel.add(comboBox);
		
		JLabel label = new JLabel("예상 지불 금액");
		label.setForeground(Color.BLACK);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 14));
		label.setBounds(320, 618, 131, 25);
		pSCListPanel.add(label);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("굴림", Font.BOLD, 13));
		textField.setEditable(false);
		textField.setBounds(453, 618, 130, 25);
		pSCListPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("원");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_1.setBounds(590, 618, 22, 25);
		pSCListPanel.add(lblNewLabel_1);
	}
}
