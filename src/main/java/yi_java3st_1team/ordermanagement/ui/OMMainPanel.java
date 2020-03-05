package yi_java3st_1team.ordermanagement.ui;

import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import yi_java3st_1team.main.LeftMainMenu;
import yi_java3st_1team.main.ui.EmployeeMainUIPanel;
import yi_java3st_1team.ordermanagement.ui.content.OMContent;

@SuppressWarnings("serial")
public class OMMainPanel extends JPanel  implements ActionListener{

	private OMContent pContent;
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
		
		pContent = new OMContent();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
		pContent.pOCheckPanel.getMainBtn().addActionListener(this);

	}
	
	   public void actionPerformed(ActionEvent e) {
		      if (e.getSource() == pContent.pOCheckPanel.getMainBtn()) {
		         actionPerformedMainBtn(e);
		      }
		   }
		   private void actionPerformedMainBtn(ActionEvent e) {
		      removeAll();
		      revalidate();
		      repaint();
		      setBounds(new Rectangle(0, 0, 1544, 700));
		      EmployeeMainUIPanel emp = new EmployeeMainUIPanel();
		      add(emp);
		      revalidate();
		      repaint();
		      
		   }	

}
