package yi_java3st_1team.viewsmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.viewsmanagement.dto.ClientSale;

@SuppressWarnings("serial")
public class ClientSaleTblPanel extends AbstractTblPanel<ClientSale> {
	public ClientSaleTblPanel() {
	}
	
	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(232, 330, 120, 120, 160, 160, 160);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3);
		tableCellAlign(SwingConstants.RIGHT, 4, 5, 6);
	}

	@Override
	protected String[] getColNames() {
		return new String[] {"고객상호명", "품목명", "수량", "입금여부", "판매가격", "매출금", "미수금"};
	}

	@Override
	protected Object[] toArray(ClientSale item) {
		return new Object[] {
				item.getC_name(),
				item.getP_name(),
				item.getO_qty(),
				item.getO_dps(),
				String.format("%,d    ", item.getP_price()),
				String.format("%,d    ", item.getSalesMoney()),
				String.format("%,d    ", item.getUncollected())
			};
	}

	@Override
	public void updateRow(ClientSale item, int updateIdx) {
		model.setValueAt(item.getC_name(), updateIdx, 0);
		model.setValueAt(item.getP_name(), updateIdx, 1);
		model.setValueAt(item.getO_qty(), updateIdx, 2);
		model.setValueAt(item.getO_dps(), updateIdx, 3);
		model.setValueAt(item.getP_price(), updateIdx, 4);
		model.setValueAt(item.getSalesMoney(), updateIdx, 5);
		model.setValueAt(item.getUncollected(), updateIdx, 6);
	}


}
