package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.app.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-26 17:42:20
 */
public class AlipayOpenAuthAppCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2669125813946559843L;

	/** 
	 * 取消授权结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
