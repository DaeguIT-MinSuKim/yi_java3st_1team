package yi_java3st_1team.productmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.productmanagement.dto.ClientDelivery;

@SuppressWarnings("serial")
public class CDListTblPanel extends AbstractTblPanel<ClientDelivery>{

	public CDListTblPanel() {

	}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(80,140,270,70,100);
		tableCellAlign(SwingConstants.CENTER,0,1,2,3,4);		
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {"<html><span style='color:#000042'><b>출고번호</b></span></html>",
				 "<html><span style='color:#000042'><b>고객 상호명</b></span></html>",
				 "<html><span style='color:#000042'><b>품목명</b></span></html>",
				 "<html><span style='color:#000042'><b>출고수량</b></span></html>",
				 "<html><span style='color:#000042'><b>출고일자</b></span></html>"};
	}

	@Override
	protected Object[] toArray(ClientDelivery item) {
		return new Object[] {
			String.format("CD%04d", item.getCdNo()),
			item.getcName().getcName(),
			item.getpName().getpName(),
			item.getCdSno().getoQty(),
			String.format("%tF", item.getCdDate())
		};
	}

	@Override
	public void updateRow(ClientDelivery item, int updateIdx) {
		model.setValueAt(String.format("CD%04d", item.getCdNo()), updateIdx, 0);
		model.setValueAt(item.getcName().getcName(), updateIdx, 1);
		model.setValueAt(item.getpName().getpName(), updateIdx, 2);
		model.setValueAt(item.getCdSno().getoQty(), updateIdx, 3);
		model.setValueAt(item.getCdDate(), updateIdx, 4);
		
	}

}
