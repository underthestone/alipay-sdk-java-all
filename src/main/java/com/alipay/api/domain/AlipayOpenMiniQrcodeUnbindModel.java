package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除已联普遍二维码
 *
 * @author auto create
 * @since 1.0, 2020-05-15 14:20:04
 */
public class AlipayOpenMiniQrcodeUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 2769714333344523918L;

	/**
	 * 路由规则组，用于唯一标记一条路由规则
	 */
	@ApiField("route_group")
	private String routeGroup;

	public String getRouteGroup() {
		return this.routeGroup;
	}
	public void setRouteGroup(String routeGroup) {
		this.routeGroup = routeGroup;
	}

}
