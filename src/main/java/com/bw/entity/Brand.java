package com.bw.entity;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月31日 上午8:58:46 类功能说明
 */
public class Brand {
	private Integer bid;
	private String bname;

	public Brand(Integer bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bname=" + bname + "]";
	}

}
