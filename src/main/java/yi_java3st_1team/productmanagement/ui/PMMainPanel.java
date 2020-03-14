package yi_java3st_1team.productmanagement.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.CMMainPanel;
import yi_java3st_1team.main.EmployeeMainFrame;
import yi_java3st_1team.main.LeftMainMenu;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.main.ui.EmployeeMainUIPanel;
import yi_java3st_1team.main.ui.content.LogoImg02Panel;
import yi_java3st_1team.main.ui.content.login.EmployeeLoginPanel;
import yi_java3st_1team.main.ui.service.EmployeeUIService;
import yi_java3st_1team.ordermanagement.ui.OMMainPanel;
import yi_java3st_1team.productmanagement.ui.content.PMContent;
import yi_java3st_1team.viewsmanagement.ui.panel.ReportMainPanel;

@SuppressWarnings("serial")
public class PMMainPanel extends JPanel implements ActionListener{

	private LeftMainMenu mainMenu;
	private PMContent pContent;
	
	public static Employee loginEmp;
	private EmployeeLoginPanel pEmpLogin;
	private EmployeeMainUIPanel emp;

	private int manager = emp.loginEmp.getEmpManager();
	private EmployeeUIService empService;
	
	public PMMainPanel() {
		empService = new EmployeeUIService();
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
		
		pContent = new PMContent();
		pContent.setBackground(SystemColor.inactiveCaption);
		pContent.setBounds(246, 0, 1268, 700);
		add(pContent);
		
		pContent.pSWUIPanel.btnGoMain.addActionListener(this);
		pContent.pSCSOUIPanel.btnGoMain.addActionListener(this);
		pContent.pCDRegisterPanel.btnGoMain.addActionListener(this);
	}
	   public void actionPerformed(ActionEvent e) {
		      
		      /************* 사이트 버튼 *************/
		   
		   		//거래처관리
				if (e.getSource() == mainMenu.btnCM) {
					btnCMActionPerformed(e);
				}
				
				//제품관리
				if (e.getSource() == mainMenu.btnPM) {
					btnPMActionPerformed(e);
				}
				
				//주문관리
				if (e.getSource() == mainMenu.btnOM) {
					btnOMActionPerformed(e);
				}
				
				//현황조회&보고
				if (e.getSource() == mainMenu.btnViews) {
					actionPerformedBtnViews(e);
				}
				
				/************* 메인 버튼 *************/ 
				
				//제품등록(메인버튼)
				if (e.getSource() == pContent.pSWUIPanel.btnGoMain) {
					actionPerformedMainBtn(e);
				}

			    //매입&발주(메인버튼)
				if (e.getSource() == pContent.pSCSOUIPanel.btnGoMain) {
					actionPerformedMainBtn(e);
				}
				
			    //출고
				if (e.getSource() == pContent.pCDRegisterPanel.btnGoMain) {
					actionPerformedMainBtn(e);
				}
				
			      //로그아웃
		      	try {
					if(e.getSource() == pEmpLogin.btnLogout) {
						actionPerformedBtnLogout(e);
					}
		      	}catch(NullPointerException a) {
		      		
		      	}
			    

		   }
	   
	   
	   //메인버튼
	   private void actionPerformedMainBtn(ActionEvent e) {
		   removeAll();
		   revalidate();
		   repaint();
		   
		   emp = new EmployeeMainUIPanel();
		   add(emp);
		   
		   emp.pStop.removeAll();
		   
		   pEmpLogin = new EmployeeLoginPanel();
		   emp.pStop.add(pEmpLogin, BorderLayout.WEST);

		   switch (manager) {
			case 1:
				pEmpLogin.manager.setText("[책임관리자 로그인]");
				pEmpLogin.loginImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\topManager.png"));

				// 책임관리자(대표이사~과장) 로그인시 차트 패널 불러오기
				// 1. 라인차트
				emp.pStop.remove(emp.pImg01); // 제거
				JPanel line = new JPanel();
				line.setBackground(SystemColor.yellow);
				emp.pStop.add(line, BorderLayout.CENTER);

				// 2. 바차트
				emp.pImg02.remove(emp.pLogo); // 제거
				JPanel bar = new JPanel();
				bar.setBackground(Color.red);
				bar.setPreferredSize(new Dimension(350, 250));
				emp.pImg02.add(bar, BorderLayout.NORTH);
				break;
			case 2:
				pEmpLogin.manager.setText("[관리자 로그인]");
				pEmpLogin.loginImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\manager2.png"));
			    LogoImg02Panel logo01 = new LogoImg02Panel();
			    emp.pStop.add(logo01,BorderLayout.CENTER);
				break;
			
			}
			pEmpLogin.loginSuc.setText("<html>반갑습니다!<br><span style='color:blue'>"+emp.loginEmp.getEmpName()+" "+emp.loginEmp.getEmpTitle()+"</span>님이<br>로그인 하셨습니다.</html>");
			String empNum = String.format("EE%04d", emp.loginEmp.getEmpNo());
			pEmpLogin.empInfo.setText("<html>- 사원번호 : <span style='color:red'>"+empNum+"</span><br>- 부서명 : <span style='color:green'>"+emp.loginEmp.getdNo().getDeptName()+"</span></html>");


			   emp.pStop.revalidate();
			   emp.pStop.repaint();
			   
			   pEmpLogin.btnLogout.addActionListener(this);
			   EmployeeMainFrame.btnlogout.setVisible(false);

			
		}
		   
			private void actionPerformedBtnLogout(ActionEvent e) {
				removeAll();
				revalidate();
				repaint();
				emp = new EmployeeMainUIPanel();
				emp.loginEmp = null;
				add(emp);
				revalidate();
				repaint();
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

}
