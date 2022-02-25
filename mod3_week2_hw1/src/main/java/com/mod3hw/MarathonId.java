package com.mod3hw;

import org.springframework.stereotype.Component;

@Component
public class MarathonId {
	
	
	private long marathonIdNum;
	

	public long createMarathonId() {
		this.marathonIdNum = Math.round(Math.random() * 1000);
		return marathonIdNum;
	}

}
