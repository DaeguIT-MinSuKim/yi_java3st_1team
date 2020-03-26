package yi_java3st_1team.main.employee.ui;

import javax.swing.JPanel;

import yi_java3st_1team.main.employee.chart.InitScene;

@SuppressWarnings("serial")
public abstract class AbsMainUIPanel extends JPanel{
	public abstract void initFX(InitScene fxPanel); //차트
	
	public abstract void LoginFirst(); //로그인선행
	
	public abstract void removePanel(); // 각 버튼 누를 시 패널 삭제 & 전환
	
	public abstract void btnLogoutandLoginInfo(); // 프레임 HEADER부분 - 로그아웃 버튼 & 로그인 정보
}
