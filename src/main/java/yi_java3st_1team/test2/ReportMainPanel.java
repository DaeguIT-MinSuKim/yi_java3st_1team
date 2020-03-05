package yi_java3st_1team.test2;

import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.CMMainPanel;
import yi_java3st_1team.main.LeftMainMenu;
import yi_java3st_1team.ordermanagement.ui.OMMainPanel;
import yi_java3st_1team.productmanagement.ui.PMMainPanel;
import yi_java3st_1team.viewsmanagement.ui.panel.MainPanel;

@SuppressWarnings("serial")
public class ReportMainPanel extends JPanel implements ActionListener{

	private LeftMainMenu mainMenu;
	public ReportMainPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setBounds(new Rectangle(0, 0, 1544, 700));
		setLayout(null);
		
		mainMenu = new LeftMainMenu();
		mainMenu.setBackground(SystemColor.inactiveCaptionBorder);
		mainMenu.setBounds(20, 0, 214, 700);
		add(mainMenu);
		
		mainMenu.btnCM.addActionListener(this);
		mainMenu.btnOM.addActionListener(this);
		mainMenu.btnPM.addActionListener(this);
		mainMenu.btnViews.addActionListener(this);
		
		MainPanel pContent = new MainPanel();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
	}
	
	   public void actionPerformed(ActionEvent e) {
		      
		      //버튼들
				if (e.getSource() == mainMenu.btnCM) {
					btnCMActionPerformed(e);
				}
				if (e.getSource() == mainMenu.btnPM) {
					btnPMActionPerformed(e);
				}
				if (e.getSource() == mainMenu.btnOM) {
					btnOMActionPerformed(e);
				}
				if (e.getSource() == mainMenu.btnViews) {
					actionPerformedBtnViews(e);
				}


		   }
	   
	   private void btnCMActionPerformed(ActionEvent e) {
		      removeAll();
		      revalidate();
		      repaint();
		      setBackground(SystemColor.inactiveCaption);
		      setBounds(new Rectangle(0, 0, 1544, 700));
		      CMMainPanel cmp = new CMMainPanel();
		      add(cmp);
		      revalidate();
		      repaint();
		   }
		   private void btnPMActionPerformed(ActionEvent e) {
			      removeAll();
			      revalidate();
			      repaint();
			      setBackground(SystemColor.inactiveCaption);
			      setBounds(new Rectangle(0, 0, 1544, 700));
			      PMMainPanel pmp = new PMMainPanel();
			      add(pmp);
			      revalidate();
			      repaint();
		   }
		   private void btnOMActionPerformed(ActionEvent e) {
			      removeAll();
			      revalidate();
			      repaint();
			      setBackground(SystemColor.inactiveCaption);
			      setBounds(new Rectangle(0, 0, 1544, 700));
			      setLayout(null);
			      OMMainPanel omp = new OMMainPanel();
			      add(omp);
			      revalidate();
			      repaint();
		   }
		   private void actionPerformedBtnViews(ActionEvent e) {
				  removeAll();
			      revalidate();
			      repaint();
			      setBackground(SystemColor.inactiveCaption);
			      setBounds(new Rectangle(0, 0, 1544, 700));
			      ReportMainPanel rmp = new ReportMainPanel();
			      add(rmp);
			      revalidate();
			      repaint();
		   }	

}
