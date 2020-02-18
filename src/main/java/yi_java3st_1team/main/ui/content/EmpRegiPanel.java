package yi_java3st_1team.main.ui.content;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class EmpRegiPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public EmpRegiPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("사용자 등록");
		lblNewLabel.setPreferredSize(new Dimension(60, 65));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
	}

}
