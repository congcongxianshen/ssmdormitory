package com.kj.base.utils;

import java.util.List;

public class Page<T> {
	
	/**总记录数*/
	private Integer total;
	/**总页数*/
	private Integer pages;
	/**每页显示数据条数*/
	private Integer size;
	/**一页显示的数据*/
	private List<T> rows;
	
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Page(Integer total, Integer pages, Integer size, List<T> rows) {
		super();
		this.total = total;
		this.pages = pages;
		this.size = size;
		this.rows = rows;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	
}
