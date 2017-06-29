package com.pommert.kneelawk.padawan.api.status;

import java.util.Optional;

public class InterfaceStatus {
	private InterfaceState state;
	private Optional<Throwable> error;

	public InterfaceStatus(InterfaceState state, Optional<Throwable> error) {
		this.state = state;
		this.error = error;
	}

	public InterfaceState getState() {
		return state;
	}

	public Optional<Throwable> getError() {
		return error;
	}
}
