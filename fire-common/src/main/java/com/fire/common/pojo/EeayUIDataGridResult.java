package com.fire.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * EasyUIDataGrid返回结果
 * <p>Title: EeayUIDataGridResult</p>
 * <p>Description: </p> 因为涉及到网络传输,所以此处要实现序列化接口
 * <p>Company: www.fire.com</p> 
 * @author	fire
 * @date	2017年5月20日上午10:00:11
 * @version 1.0
 */
public class EeayUIDataGridResult implements Serializable {

	/** serialVersionUID*/
	private static final long serialVersionUID = -7741200950080229740L;
	
	private Long total;
	private List<?> rows;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}