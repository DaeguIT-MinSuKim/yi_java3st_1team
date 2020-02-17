package yi_java3st_1team.productmanagement.ui.list;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class CDListPanel extends JPanel {

	private JLabel lblImg;
	private JLabel lblCDList;
	private JPanel pList;
	public CDListPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pCDListPanel = new JPanel();
		pCDListPanel.setBounds(new Rectangle(0, 0, 635, 700));
		add(pCDListPanel, BorderLayout.CENTER);
		pCDListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pCDListPanel.setLayout(null);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pCDListPanel.add(lblImg);
		
		lblCDList = new JLabel("출고 LIST");
		lblCDList.setFont(new Font("굴림", Font.BOLD, 20));
		lblCDList.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDList.setBounds(72, 60, 120, 40);
		pCDListPanel.add(lblCDList);
		
		pList = new JPanel();
		pList.setBounds(22, 123, 590, 488);
		pCDListPanel.add(pList);
	}
}
