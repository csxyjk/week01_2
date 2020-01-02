package com.bw.entity;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月31日 上午8:56:27 类功能说明
 */
public class Goods {
	private Integer gid;
	private String gname;
	private String ename;
	private Integer tid;
	private Integer bid;
	private Double size;
	private Integer price;
	private Integer num;
	private String saying;
	private String imgurl;
	private String bname;
	private String tname;

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Goods(Integer gid, String gname, String ename, Integer tid, Integer bid, Double size, Integer price,
			Integer num, String saying, String imgurl, String bname, String tname) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.ename = ename;
		this.tid = tid;
		this.bid = bid;
		this.size = size;
		this.price = price;
		this.num = num;
		this.saying = saying;
		this.imgurl = imgurl;
		this.bname = bname;
		this.tname = tname;
	}

	public Goods(Integer gid, String gname, String ename, Integer tid, Integer bid, Double size, Integer price,
			Integer num, String saying, String imgurl) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.ename = ename;
		this.tid = tid;
		this.bid = bid;
		this.size = size;
		this.price = price;
		this.num = num;
		this.saying = saying;
		this.imgurl = imgurl;
	}

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getSaying() {
		return saying;
	}

	public void setSaying(String saying) {
		this.saying = saying;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", ename=" + ename + ", tid=" + tid + ", bid=" + bid
				+ ", size=" + size + ", price=" + price + ", num=" + num + ", saying=" + saying + ", imgurl=" + imgurl
				+ ", bname=" + bname + ", tname=" + tname + "]";
	}

}
