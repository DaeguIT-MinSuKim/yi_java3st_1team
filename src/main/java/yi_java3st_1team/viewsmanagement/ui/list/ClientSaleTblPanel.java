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
		return new String[] {"<html><span style='color:#000042'><b>고객상호명</b></span></html>",
							 "<html><span style='color:#000042'><b>품목명</b></span></html>",
							 "<html><span style='color:#000042'><b>수량</b></span></html>",
							 "<html><span style='color:#000042'><b>입금여부</b></span></html>",
							 "<html><span style='color:#000042'><b>판매가격</b></span></html>",
							 "<html><span style='color:#000042'><b>매출금</b></span></html>",
							 "<html><span style='color:#000042'><b>미수금</b></span></html>"};
	}

	@Override
	protected Object[] toArray(ClientSale item) {
		String cName = String.format("%s", item.getC_name());
		String pName = String.format("%s", item.getP_name());
		String oQty = String.format("%d", item.getO_qty());
		String pPrice = String.format("%,d    ", item.getP_price());
		String saleMoney = String.format("%,d    ", item.getSalesMoney());
		String unCollected = String.format("%,d    ", item.getUncollected());
		
		//입금여부
		String odps = item.getO_dps();
		String YN;
		if(odps.equals("미입금")) {
			YN = "<html><b><span style='color:red'>N</span></b></html>";
			
			cName = String.format("<html><span style='color:red'>%s</span></html>", item.getC_name());
			pName = String.format("<html><span style='color:red'>%s</span></html>", item.getP_name());
			oQty = String.format("<html><span style='color:red'>%d</span></html>", item.getO_qty());
			pPrice = String.format("<html><span style='color:red'>%,d    </span></html>", item.getP_price());
			saleMoney = String.format("<html><span style='color:red'>%,d    </span></html>", item.getSalesMoney());
			unCollected = String.format("<html><span style='color:red'>%,d    </span></html>", item.getUncollected());
			
		}else {
			YN = "<html><b><span style='color:blue'>Y</span></b></html>";
		}
		
		return new Object[] {cName, pName, oQty, YN, pPrice, saleMoney, unCollected};
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
