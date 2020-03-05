package yi_java3st_1team.ordermanagement.ui;

import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.CMMainPanel;
import yi_java3st_1team.main.LeftMainMenu;
import yi_java3st_1team.main.ui.EmployeeMainUIPanel;
import yi_java3st_1team.ordermanagement.ui.content.OMContent;
import yi_java3st_1team.productmanagement.ui.PMMainPanel;
import yi_java3st_1team.viewsmanagement.ui.panel.ReportMainPanel;

@SuppressWarnings("serial")
public class OMMainPanel extends JPanel  implements ActionListener{

	private OMContent pContent;
	private LeftMainMenu mainMenu;
	public OMMainPanel() {

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
		
		pContent = new OMContent();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
		pContent.pOCheckPanel.mainBtn.addActionListener(this);

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
				
			      if (e.getSource() == pContent.pOCheckPanel.mainBtn) {
				         actionPerformedMainBtn(e);
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
	      System.out.println("주문관리-거래처");
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
		      System.out.println("주문관리-제품");    
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
		      System.out.println("주문관리-주문");
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
		      System.out.println("주문관리-현황");
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
