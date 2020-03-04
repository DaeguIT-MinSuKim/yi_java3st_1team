package yi_java3st_1team.productmanagement.ui.content;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import yi_java3st_1team.productmanagement.ui.panel.SWRegisterPanel;

@SuppressWarnings("serial")
public class SoftwareUIPanel extends JPanel {

	public SoftwareUIPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		SWRegisterPanel panel = new SWRegisterPanel();
		panel.setBounds(55, 115, 400, 440);
		pRegisterPanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSW = new JLabel("소프트웨어 제품등록");
		lblSW.setForeground(Color.BLACK);
		lblSW.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSW.setHorizontalAlignment(SwingConstants.CENTER);
		lblSW.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSW);
		
		JButton btnAdd = new JButton("등 록");
		btnAdd.setFocusable(false);
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnAdd);
		
		JButton btnUpdate = new JButton("수 정");
		btnUpdate.setFocusable(false);
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);
		
		JButton btnDel = new JButton("삭 제");
		btnDel.setFocusable(false);
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setBounds(330, 580, 100, 30);
		pRegisterPanel.add(btnDel);
		
		JButton btnGoMain = new JButton("메인화면");
		btnGoMain.setFocusable(false);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		pRegisterPanel.add(btnGoMain);
		
		JButton btnDplCheck = new JButton("중복확인");
		btnDplCheck.setFocusable(false);
		btnDplCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDplCheck.setForeground(Color.WHITE);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setBounds(465, 220, 100, 30);
		pRegisterPanel.add(btnDplCheck);
		
		JButton btnPSCheck = new JButton("조 회");
		btnPSCheck.setFocusable(false);
		btnPSCheck.setBackground(SystemColor.activeCaptionBorder);
		btnPSCheck.setForeground(Color.WHITE);
		btnPSCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPSCheck.setBounds(465, 370, 100, 30);
		pRegisterPanel.add(btnPSCheck);
		
		JButton btnImgSearch = new JButton("검 색");
		btnImgSearch.setFocusable(false);
		btnImgSearch.setBackground(SystemColor.activeCaptionBorder);
		btnImgSearch.setForeground(Color.WHITE);
		btnImgSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnImgSearch.setBounds(465, 520, 100, 30);
		pRegisterPanel.add(btnImgSearch);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(455, 115, 124, 440);
		pRegisterPanel.add(lblNewLabel);
		
		JPanel pListPanel = new JPanel();
		add(pListPanel);
		pListPanel.setLayout(null);
	}
}
