package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 默认扩展区创建接口
 *
 * @author auto create
 * @since 1.0, 2020-04-07 16:58:51
 */
public class AlipayOpenPublicDefaultExtensionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3766999885943936668L;

	/**
	 * 默认扩展区列表，最多包含3个扩展区
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	public List<ExtensionArea> getAreas() {
		return this.areas;
	}
	public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

}
