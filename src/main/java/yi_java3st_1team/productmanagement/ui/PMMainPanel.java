package yi_java3st_1team.productmanagement.ui;

import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;

import yi_java3st_1team.productmanagement.ui.content.PMContent;
import yi_java3st_1team.productmanagement.ui.content.PMMainMenu;

@SuppressWarnings("serial")
public class PMMainPanel extends JPanel {

	public PMMainPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setBounds(new Rectangle(0, 0, 1544, 700));
		setLayout(null);
		
		PMMainMenu pMainMenu = new PMMainMenu();
		pMainMenu.setBackground(SystemColor.inactiveCaptionBorder);
		pMainMenu.setBounds(20, 0, 214, 700);
		add(pMainMenu);
		
		PMContent pContent = new PMContent();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
	}

}
