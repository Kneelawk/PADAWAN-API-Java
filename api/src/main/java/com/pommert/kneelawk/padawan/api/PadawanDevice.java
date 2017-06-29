package com.pommert.kneelawk.padawan.api;

import java.util.Optional;

import com.pommert.kneelawk.padawan.api.capabilities.DeviceCapability;
import com.pommert.kneelawk.padawan.api.capabilities.DeviceCapabilityDescriptor;

public interface PadawanDevice extends PadawanInterface {
	public boolean hasCapability(DeviceCapabilityDescriptor<?> desc);

	public <T extends DeviceCapability> Optional<T> getCapability(DeviceCapabilityDescriptor<T> desc);
}
