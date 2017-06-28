package com.pommert.kneelawk.padawan.api;

public interface PadawanMaster extends PadawanInterface {
	// TODO add capabilities system
	public PadawanDevice createPadawanDeviceHandle();
	
	public static interface Builder {
		// TODO add settings (timeout, connection types, device query, etc.)
		public PadawanMaster build();
	}
}
