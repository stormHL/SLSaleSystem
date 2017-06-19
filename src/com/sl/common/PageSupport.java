package com.sl.common;

import java.util.ArrayList;
import java.util.List;

public class PageSupport {
	private Integer totalCount = 0; //总记录数
	private Integer pageCount; //总页数
	private Integer pageSize = 10; //页面大小
	private Integer currentPage = 1; //当前页
	private Integer pageNum = 3; //当前页之前和之后显示的页数个数
	private List items = new ArrayList(); //当前页列表	
	
	/**
	 * 获取上一页
	 * @return
	 */
	public Integer getPrev(){
		return currentPage - 1;
	}
	
	/**
	 * 获取下一页
	 * @return
	 */
	public Integer getNext(){
		return currentPage + 1;
	}
	
	/**
	 * 获取最后一页
	 * @return
	 */
	public Integer getLast(){
		return pageCount;
	}
	
	/**
	 * 获取首页
	 * @return
	 */
	public Integer getFirst(){
		return 1;
	}
	
	/**
	 * 判断是否有前一页
	 * @return
	 */
	public boolean getIsPrev(){
		if (currentPage > 1){
			return true;
		}
		return false;
	}
	
	/**
	 * 判断是否有下一页
	 * @return
	 */
	public boolean getIsNext(){
		if (pageCount != null && currentPage < pageCount ){
			return true;
		}
		return false;
	}
	
	/**
	 * 获取当前页 之前应显示的页码 集合 ,pageNum
	 * @return
	 */
	public List<Integer> getPrevPages(){
		List<Integer> list = new ArrayList<Integer>();
		Integer  frontStart = 1;
		if (currentPage > pageNum){
			frontStart = currentPage - pageNum;
			for (Integer i = frontStart; i < currentPage; i++){
				list.add(i);
			}
		}
		return list;
	}
	
	/**
	 * 获取当前页 之后应显示的 页码 
	 * @return
	 */
	public List<Integer> gerNextPages(){
		List<Integer> list = new ArrayList<Integer>();
		Integer  behindEnd = pageNum;
		if (pageCount != null){
			if (pageNum < currentPage && (pageNum+currentPage) < pageCount){
				behindEnd = currentPage + pageNum;
			} else {
				behindEnd = pageCount;
			}
			for (Integer i = currentPage+1; i <= behindEnd; i++){
				list.add(i);
			}
		}
		return list;
	}
	
	/**
	 * 获取总记录数
	 * @return
	 */
	public Integer getTotalCount() {
		return totalCount;
	}
	/**
	 * 计算总页数
	 * @param totalCount
	 */
	public void setTotalCount(Integer totalCount) {
		if (totalCount > 0){
			this.totalCount = totalCount;
			if (this.totalCount % this.pageSize == 0){
				this.pageCount = this.totalCount / this.pageSize ;
			} else if (this.totalCount % this.pageSize > 0){
				this.pageCount = this.totalCount / this.pageSize + 1;
			} else {
				this.pageCount = 0;
			}
		}			
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * 获取当前页 之前和之后 显示的页数个数
	 * @return
	 */
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public List getItems() {
		return items;
	}
	public void setItems(List items) {
		this.items = items;
	}
	
	
	
}