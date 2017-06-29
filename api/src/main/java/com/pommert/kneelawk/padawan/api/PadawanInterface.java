package com.pommert.kneelawk.padawan.api;

import java.io.Closeable;
import java.io.IOException;

import com.pommert.kneelawk.padawan.api.status.InterfaceStatus;

public interface PadawanInterface extends Closeable {
	public void init() throws IOException;

	public InterfaceStatus getStatus();

	public void close() throws IOException;
}
