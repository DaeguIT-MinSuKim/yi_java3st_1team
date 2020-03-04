package yi_java3st_1team.productmanagement.dto;

import yi_java3st_1team.clientmanagement.dto.Supplier;

public class Product {
	private int pNo;
	private Category pCate;
	private String pName;
	private int pCost;
	private int pPrice;
	private Supplier pSno;
	private int pQty;
	private String pDate;
	private byte[] pPic;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pNo) {
		this.pNo = pNo;
	}

	public Product(int pNo, Category pCate, String pName, int pCost, int pPrice, Supplier pSno, int pQty, String pDate) {
		this.pNo = pNo;
		this.pCate = pCate;
		this.pName = pName;
		this.pCost = pCost;
		this.pPrice = pPrice;
		this.pSno = pSno;
		this.pQty = pQty;
		this.pDate = pDate;
	}

	public Product(int pNo, Category pCate, String pName, int pCost, int pPrice, Supplier pSno, int pQty, String pDate,
			byte[] pPic) {
		this.pNo = pNo;
		this.pCate = pCate;
		this.pName = pName;
		this.pCost = pCost;
		this.pPrice = pPrice;
		this.pSno = pSno;
		this.pQty = pQty;
		this.pDate = pDate;
		this.pPic = pPic;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public Category getpCate() {
		return pCate;
	}

	public void setpCate(Category pCate) {
		this.pCate = pCate;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpCost() {
		return pCost;
	}

	public void setpCost(int pCost) {
		this.pCost = pCost;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public Supplier getpSno() {
		return pSno;
	}

	public void setpSno(Supplier pSno) {
		this.pSno = pSno;
	}

	public int getpQty() {
		return pQty;
	}

	public void setpQty(int pQty) {
		this.pQty = pQty;
	}

	public String getpDate() {
		return pDate;
	}

	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

	public byte[] getpPic() {
		return pPic;
	}

	public void setpPic(byte[] pPic) {
		this.pPic = pPic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pNo != other.pNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"%s %s %s %s %s %s %s %s", pNo,
				pCate, pName, pCost, pPrice, pSno, pQty, pDate);
	}

}
