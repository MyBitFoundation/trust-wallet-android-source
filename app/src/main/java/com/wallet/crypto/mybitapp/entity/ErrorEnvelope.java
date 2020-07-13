package com.wallet.crypto.mybitapp.entity;

import androidx.annotation.Nullable;

import com.wallet.crypto.mybitapp.C;

public class ErrorEnvelope {
	public final int code;
	@Nullable
	public final String message;
	@Nullable
	public final Throwable throwable;

	public ErrorEnvelope(@Nullable String message) {
		this(C.ErrorCode.UNKNOWN, message);
	}

	public ErrorEnvelope(int code, @Nullable String message) {
		this(code, message, null);
	}

	public ErrorEnvelope(int code, @Nullable String message, @Nullable Throwable throwable) {
		this.code = code;
		this.message = message;
		this.throwable = throwable;
	}
}
