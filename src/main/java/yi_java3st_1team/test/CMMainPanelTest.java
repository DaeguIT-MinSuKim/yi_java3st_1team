package yi_java3st_1team.test;

import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.content.CMContent;
import yi_java3st_1team.main.LeftMainMenu;

@SuppressWarnings("serial")
public class CMMainPanelTest extends JPanel {

	public CMMainPanelTest() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setBounds(new Rectangle(0, 0, 1544, 700));
		setLayout(null);
		
		LeftMainMenuTest MainMenu = new LeftMainMenuTest();
		MainMenu.setBackground(SystemColor.inactiveCaptionBorder);
		MainMenu.setBounds(20, 0, 214, 700);
		add(MainMenu);
		
		CMContentTest pContent = new CMContentTest();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
	}

}
