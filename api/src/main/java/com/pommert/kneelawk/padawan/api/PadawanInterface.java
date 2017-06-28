package com.pommert.kneelawk.padawan.api;

import java.io.Closeable;
import java.io.IOException;

public interface PadawanInterface extends Closeable {
	public void init() throws IOException;

	public PadawanInterfaceStatus getStatus();

	public void close() throws IOException;
}
