package com.bw.entity;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2019��12��31�� ����8:59:29 �๦��˵��
 */
public class Kind {
	private Integer tid;
	private String tname;

	public Kind(Integer tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}

	public Kind() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Kind [tid=" + tid + ", tname=" + tname + "]";
	}

}
