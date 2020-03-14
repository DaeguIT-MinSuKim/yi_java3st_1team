package yi_java3st_1team.viewsmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.viewsmanagement.dto.DateSale;

@SuppressWarnings("serial")
public class DateSaleTblPanel extends AbstractTblPanel<DateSale> {
	public DateSaleTblPanel() {
	}
	
	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(200, 300, 360, 175, 247);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4);
	}

	@Override
	protected String[] getColNames() {
		return new String[] {"<html><span style='color:#000042'><b>주문번호</b></span></html>",
							 "<html><span style='color:#000042'><b>고객상호명</b></span></html>",
							 "<html><span style='color:#000042'><b>품목명</b></span></html>",
							 "<html><span style='color:#000042'><b>주문수량</b></span></html>",
							 "<html><span style='color:#000042'><b>주문일자</b></span></html>"};
	}

	@Override
	protected Object[] toArray(DateSale item) {
		return new Object[] {
				String.format("O%04d", item.getO_no()),
				item.getC_name(),
				item.getP_name(),
				item.getO_qty(),
				item.getO_date()
			};
	}

	@Override
	public void updateRow(DateSale item, int updateIdx) {
		model.setValueAt(String.format("O%04d", item.getO_no()), updateIdx, 0);
		model.setValueAt(item.getC_name(), updateIdx, 1);
		model.setValueAt(item.getP_name(), updateIdx, 2);
		model.setValueAt(item.getO_qty(), updateIdx, 3);
		model.setValueAt(item.getO_date(), updateIdx, 4);
	}


}
