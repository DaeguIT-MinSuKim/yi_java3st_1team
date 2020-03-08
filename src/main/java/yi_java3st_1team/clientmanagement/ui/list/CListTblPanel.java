package yi_java3st_1team.clientmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;

@SuppressWarnings("serial")
public class CListTblPanel extends AbstractTblPanel<Client> {
	
	ClientUIService service = new ClientUIService();
	
	public CListTblPanel() {

	}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(80, 140, 80, 280, 110, 80);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4, 5);
		
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {"고객번호", "상호명", "대표명", "주소", "전화번호", "담당직원"};
	}

	@Override
	protected Object[] toArray(Client item) {
		return new Object[] {
				String.format("C%04d", item.getcNo()),
				item.getcName(),
				item.getcCeo(),
				item.getcAddress(),
				item.getcTel(),
				String.format("%s", service.showEmployeeName(item))
		};
	}

	@Override
	public void updateRow(Client item, int updateIdx) {
		model.setValueAt(String.format("C%04d", item.getcNo()), updateIdx, 0);
		model.setValueAt(item.getcName(), updateIdx, 1);
		model.setValueAt(item.getcCeo(), updateIdx, 2);
		model.setValueAt(item.getcAddress(), updateIdx, 3);
		model.setValueAt(item.getcTel(), updateIdx, 4);
		model.setValueAt(item.getcSalesman(), updateIdx, 5);
		
	}

}
