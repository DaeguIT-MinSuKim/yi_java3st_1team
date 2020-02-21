package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;

import yi_java3st_1team.main.LeftMainMenu;
import yi_java3st_1team.viewsmanagement.ui.panel.MainPanel;

@SuppressWarnings("serial")
public class ReportMainPanel extends JPanel {

	public ReportMainPanel() {

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
		
		MainPanel pContent = new MainPanel();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
	}

}
