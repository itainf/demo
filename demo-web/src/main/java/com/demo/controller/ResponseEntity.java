package com.demo.controller;


import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;

/**
 * web接口返回实体
 *
 * @author layne
 *
 */
public class ResponseEntity {

	/**
	 * 结果编码
	 */
	private Integer code;

	/**
	 * 信息
	 */
	private String msg;

	/**
	 * 数据
	 */
	private Object data;

	public static ResponseEntity ok() {
		ResponseEntity r = new ResponseEntity();
		r.code = 0;
		r.msg = "OK";
		return r;
	}

	public static ResponseEntity ok(String msg) {
		ResponseEntity r = new ResponseEntity();
		r.code = 0;
		r.msg = msg;
		return r;
	}

	public static ResponseEntity error(String msg) {
		ResponseEntity r = new ResponseEntity();
		r.code = -1;
		r.msg = msg;
		return r;
	}

	public static ResponseEntity error(Integer code, String msg) {
		ResponseEntity r = new ResponseEntity();
		r.code = code;
		r.msg = msg;
		return r;
	}

	public ResponseEntity data(Object data) {
		if (data == null){
			data = new Object();
		}
		this.data = data;
		return this;
	}
	public ResponseEntity dataList(Object[] data) {
		if (data == null){
			data = new Object[]{};
		}
		this.data = data;
		return this;
	}
	public ResponseEntity dataList(Collection data) {
		if (CollectionUtils.isEmpty(data)){
			data = Collections.EMPTY_LIST;
		}
		this.data = data;
		return this;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
