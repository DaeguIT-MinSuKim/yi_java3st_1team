package yi_java3st_1team.viewsmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.viewsmanagement.dto.SWTotalSale;

@SuppressWarnings("serial")
public class SWTotalSaleTblPanel extends AbstractTblPanel<SWTotalSale> {
	public SWTotalSaleTblPanel() {
	}
	
	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(100, 120, 290, 80, 65, 120);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4);
		tableCellAlign(SwingConstants.RIGHT, 5);
	}

	@Override
	protected String[] getColNames() {
		return new String[] {"날짜", "분류", "품목명", "주문번호", "주문수량", "판매금액"};
	}

	@Override
	protected Object[] toArray(SWTotalSale item) {
		return new Object[] {
				item.getO_date(),
				item.getCate_name(),
				item.getP_name(),
				String.format("O%04d", item.getO_no()),
				item.getO_qty(),
				String.format("%,d    ", item.getSalesAmount())
			};
	}

	@Override
	public void updateRow(SWTotalSale item, int updateIdx) {
		model.setValueAt(item.getO_date(), updateIdx, 0);
		model.setValueAt(item.getCate_name(), updateIdx, 1);
		model.setValueAt(item.getP_name(), updateIdx, 2);
		model.setValueAt(String.format("O%04d", item.getO_no()), updateIdx, 3);
		model.setValueAt(item.getO_qty(), updateIdx, 4);
		model.setValueAt(item.getSalesAmount(), updateIdx, 5);
	}


}
