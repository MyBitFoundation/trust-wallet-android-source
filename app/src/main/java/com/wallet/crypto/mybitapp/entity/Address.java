package com.wallet.crypto.mybitapp.entity;

import android.text.TextUtils;

import java.util.regex.Pattern;

public class Address {

    private static final Pattern ignoreCaseAddrPattern = Pattern.compile("(?i)^(0x)?[0-9a-f]{40}$");

    public final String value;

    public Address(String value) {
        this.value = value;
    }

    public static boolean isAddress(String address) {
        return !TextUtils.isEmpty(address) && ignoreCaseAddrPattern.matcher(address).find();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x");
        stringBuilder.append(this.value);
        return stringBuilder.toString();
    }

}
