package yi_java3st_1team.clientmanagement.ui;

import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.content.CMContent;
import yi_java3st_1team.clientmanagement.ui.content.CMMainMenu;

@SuppressWarnings("serial")
public class CMMainPanel extends JPanel {

	public CMMainPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setBounds(new Rectangle(0, 0, 1544, 700));
		setLayout(null);
		
		CMMainMenu pMainMenu = new CMMainMenu();
		pMainMenu.setBackground(SystemColor.inactiveCaptionBorder);
		pMainMenu.setBounds(20, 0, 214, 700);
		add(pMainMenu);
		
		CMContent pContent = new CMContent();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
	}

}
