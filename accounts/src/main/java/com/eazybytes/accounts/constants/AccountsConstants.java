package com.eazybytes.accounts.constants;

public class AccountsConstants {
    private AccountsConstants() {
        // to restrict instantiation
    }

    public static final String SAVINGS = "Savings";
    public static final String ADDRESS = "123, Main St, New Delhi";
    public static final String STATUS_201 = "201";
    public static final String MESSAGE_201 = "Account created successfully";
    public static final String STATUS_200 = "200";
    public static final String MESSAGE_200 = "Request processed successfully";
    public static final String STATUS_409 = "409";
    public static final String MESSAGE_409_UPDATE = "Update request failed due to some error/conflict";
    public static final String MESSAGE_409_DELETE = "Delete operation failed due to some error/conflict";
    public static final String STATUS_500 = "500";
    public static final String MESSAGE_500 = "An error occurred. Please try again OR Contact Dev Team";
}
