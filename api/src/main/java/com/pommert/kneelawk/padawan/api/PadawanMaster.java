package com.pommert.kneelawk.padawan.api;

import java.util.Set;

import com.pommert.kneelawk.padawan.api.capabilities.DeviceCapabilityDescriptor;

public interface PadawanMaster extends PadawanInterface {
	// TODO add capabilities system
	public PadawanDevice createPadawanDeviceHandle(Set<DeviceCapabilityDescriptor<?>> descs);

	public static interface Builder {
		// TODO add settings (timeout, connection types, device query, etc.)
		public PadawanMaster build();
	}
}
