package yi_java3st_1team.viewsmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.viewsmanagement.dto.SWSale;

@SuppressWarnings("serial")
public class SWSaleTblPanel extends AbstractTblPanel<SWSale> {
	public SWSaleTblPanel() {
	}
	
	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(320, 140, 200, 155, 155, 155, 157);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2);
		tableCellAlign(SwingConstants.RIGHT, 3, 4, 5, 6);
	}

	@Override
	protected String[] getColNames() {
		return new String[] {"품목명", "분류", "공급회사명", "공급금액", "판매금액", "할인금액", "판매이윤"};
	}

	@Override
	protected Object[] toArray(SWSale item) {
		return new Object[] {
				item.getP_name(),
				item.getCate_name(),
				item.getS_name(),
				String.format("%,d    ", item.getSupplyAmount()),
				String.format("%,d    ", item.getSalesAmount()),
				String.format("%,d    ", item.getDiscount()),
				String.format("%,d    ", item.getSalesProfit())
			};
	}

	@Override
	public void updateRow(SWSale item, int updateIdx) {
		model.setValueAt(item.getP_name(), updateIdx, 0);
		model.setValueAt(item.getCate_name(), updateIdx, 1);
		model.setValueAt(item.getS_name(), updateIdx, 2);
		model.setValueAt(item.getSupplyAmount(), updateIdx, 3);
		model.setValueAt(item.getSalesAmount(), updateIdx, 4);
		model.setValueAt(item.getDiscount(), updateIdx, 5);
		model.setValueAt(item.getSalesProfit(), updateIdx, 6);
	}

}
