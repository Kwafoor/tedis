/**
 * (C) 2011-2012 Alibaba Group Holding Limited.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 */
package com.taobao.common.tedis.replicator.statemachine.event.test;

import com.taobao.common.tedis.replicator.statemachine.Event;

public class StringEvent extends Event {

	public StringEvent(Object data) {
		super(data);
	}

}
