package yi_java3st_1team.main.ui.content.chart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

@SuppressWarnings("serial")
public class EmpMiniBarChart extends JFXPanel implements InitScene {

	/**
	 * Create the panel.
	 */
	public EmpMiniBarChart() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(350, 250));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setOpaque(true);
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\teamLog.png"));
		add(lblLogo, BorderLayout.CENTER);
	}
	@Override
	public Scene createScene() {
		// TODO Auto-generated method stub
		return null;
	}

}
