package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos订单查询接口
 *
 * @author auto create
 * @since 1.0, 2020-06-18 15:06:11
 */
public class KoubeiCateringOrderInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1219535679466822462L;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
