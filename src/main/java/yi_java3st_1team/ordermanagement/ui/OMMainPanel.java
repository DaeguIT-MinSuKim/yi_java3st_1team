package yi_java3st_1team.ordermanagement.ui;

import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.content.CMContent;
import yi_java3st_1team.main.LeftMainMenu;

@SuppressWarnings("serial")
public class OMMainPanel extends JPanel {

	public OMMainPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setBounds(new Rectangle(0, 0, 1544, 700));
		setLayout(null);
		
		LeftMainMenu MainMenu = new LeftMainMenu();
		MainMenu.setBackground(SystemColor.inactiveCaptionBorder);
		MainMenu.setBounds(20, 0, 214, 700);
		add(MainMenu);
		
		CMContent pContent = new CMContent();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
	}

}
