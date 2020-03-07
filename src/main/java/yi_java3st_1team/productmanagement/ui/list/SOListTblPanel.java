package yi_java3st_1team.productmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.productmanagement.dto.SupplierOrder;

@SuppressWarnings("serial")
public class SOListTblPanel extends AbstractTblPanel<SupplierOrder> {

	public SOListTblPanel() {}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(80, 260, 130, 80, 80, 100);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 4, 5);
		tableCellAlign(SwingConstants.RIGHT, 3);
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {"발주번호", "품목명", "공급회사명", "발주가격", "발주수량", "발주일자"};
	}

	@Override
	protected Object[] toArray(SupplierOrder item) {
		return new Object[] {
				String.format("SO%04d", item.getSoNo()),
				item.getSoPname().getpName(),
				item.getSoSname().getsName(),
				String.format("%,d원",item.getSoPcost().getpCost()),
				item.getSoQty(),
				String.format("%tF", item.getSoDate())
		};
	}

	@Override
	public void updateRow(SupplierOrder item, int updateIdx) {
		model.setValueAt(String.format("SO%04d", item.getSoNo()), updateIdx, 0);
		model.setValueAt(item.getSoPname().getpName(), updateIdx, 1);
		model.setValueAt(item.getSoSname().getsName(), updateIdx, 2);
		model.setValueAt(item.getSoPcost().getpCost(), updateIdx, 3);
		model.setValueAt(item.getSoQty(), updateIdx, 4);
		model.setValueAt(item.getSoDate(), updateIdx, 5);
		
	}

}
