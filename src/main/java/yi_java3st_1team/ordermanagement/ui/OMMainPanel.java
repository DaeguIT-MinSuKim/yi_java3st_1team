package yi_java3st_1team.ordermanagement.ui;

import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.CMMainPanel;
import yi_java3st_1team.main.LeftMainMenu;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.main.ui.EmployeeMainUIPanel;
import yi_java3st_1team.main.ui.content.login.EmployeeLoginPanel;
import yi_java3st_1team.ordermanagement.ui.content.OMContent;
import yi_java3st_1team.productmanagement.ui.PMMainPanel;
import yi_java3st_1team.viewsmanagement.ui.panel.ReportMainPanel;

@SuppressWarnings("serial")
public class OMMainPanel extends JPanel  implements ActionListener{

	private OMContent pContent;
	private LeftMainMenu mainMenu;
	
	public static Employee loginEmp;
	private EmployeeLoginPanel pEmpLogin;
	private EmployeeMainUIPanel emp;
	private int manager = emp.loginEmp.getEmpManager();
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
				
				//메인화면
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
		   switch(manager) {
			case 1:
			  removeAll();
		      revalidate();
		      repaint();
		      setBackground(SystemColor.inactiveCaption);
		      setBounds(new Rectangle(0, 0, 1544, 700));
		      ReportMainPanel rmp = new ReportMainPanel();
		      add(rmp);
		      revalidate();
		      repaint();
				break;
		case 2:
			ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\manager1.png");
			JOptionPane.showMessageDialog(null, "<html><h3 align='center'>권한이 없습니다.</h3></html>","Don't have Premission",JOptionPane.INFORMATION_MESSAGE,icon);
			break;
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
