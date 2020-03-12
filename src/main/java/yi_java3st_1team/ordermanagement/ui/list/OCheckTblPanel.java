package yi_java3st_1team.ordermanagement.ui.list;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.ordermanagement.dto.Order;

@SuppressWarnings("serial")
public class OCheckTblPanel extends AbstractTblPanel<Order>{
	public OCheckTblPanel() {
	}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(80, 90, 150, 150, 80, 273, 80, 80,100);
		tableCellAlign(SwingConstants.CENTER,0,1,2,3,4,5,6,7,8);
		
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {"<html><span style='color:#000042'><b>주문번호</b></span></html>",
							 "<html><span style='color:#000042'><b>주문일자</b></span></html>",
							 "<html><span style='color:#000042'><b>고객상호명</b></span></html>",
							 "<html><span style='color:#000042'><b>품목명</b></span></html>",
							 "<html><span style='color:#000042'><b>주문수량</b></span></html>",
							 "<html><span style='color:#000042'><b>주문요구사항</b></span></html>",
							 "<html><span style='color:#000042'><b>입금여부</b></span></html>",
							 "<html><span style='color:#000042'><b>주문완료</b></span></html>",
							 "<html><span style='color:#000042'><b>주문담당자</b></span></html>"};
	}

	//"주문번호","주문일자","고객상호명","품목명","주문수량","주문요구사항","입금여부","주문완료","주문담당자"
	// O0001, 2020-01-01, 아름시스템, 오토캐드, 10, 빠른배송부탁, 체크박스, Y/N, 김주문(EE0002)
	@Override
	protected Object[] toArray(Order item) {
		/** 그외 **/
		String oNo = String.format("O%04d", item.getoNo());
		String oDate = String.format("%tF", item.getoDate());
		String cName = String.format("%s", item.getoCname().getcName());
		String pName = String.format("%s", item.getoPname().getpName());
		String oQty = String.format("%d", item.getoQty());
		String oMemo = String.format("%s",item.getoMemo());
		String emp = String.format("%s(EE%04d)", item.getoEname().getEmpName(), item.getoEno().getEmpNo());
		
		
		
		/** 입금여부 **/
		int oDps = item.getoDps(); //0 or 1
		JCheckBox box = new JCheckBox();
		if(oDps == 1) { //입금 O
			box.setSelected(true);
		}else {
			box.setSelected(false);
		}
		/** 주문완료 **/
		int oOk = item.getoOk(); //0 or 1
		String YN;
		if(oOk == 1) { //입금 O
			YN = "<html><b><span style='color:blue'>Y</span></b></html>";
		}else {
			YN = "<html><b><span style='color:red'>N</span></b></html>";
			oNo = String.format("<html><span style='color:red'>O%04d</span></html>", item.getoNo());
			oDate = String.format("<html><span style='color:red'>%tF</span></html>", item.getoDate());
			cName = String.format("<html><span style='color:red'>%s</span></html>", item.getoCname().getcName());
			pName = String.format("<html><span style='color:red'>%s</span></html>", item.getoPname().getpName());
			oQty = String.format("<html><span style='color:red'>%d</span></html>", item.getoQty());
			oMemo = String.format("<html><span style='color:red'>%s</span></html>",item.getoMemo());
			emp = String.format("<html><span style='color:red'>%s(EE%04d)</span></html>", item.getoEname().getEmpName(), item.getoEno().getEmpNo());
		}
		return new Object[] {
				oNo,
				oDate,
				cName,
				pName,
				oQty,
				oMemo,
				//item.getoDps(),//입금여부
				box,
				String.format("%s", YN),
				emp
				
		};
	}

	@Override
	public void updateRow(Order item, int updateIdx) {
		// TODO Auto-generated method stub
		
	}

}
