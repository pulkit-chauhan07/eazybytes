package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface AccountsService {

    /**
     *
     * @param customerDto - accepts a customerDto object containing customer
     *                      details as specified in CustomerDto class
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber, accepts mobile number as param
     * @return customerDto, returns customer details if mobile number found in accounts table
     */
    CustomerDto fetchAccount (String mobileNumber);

    /**
     * @param customerDto
     * @return boolean value depending upon update account was success or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber accepts mobileNumber to get and delete the associated account
     * @return returns a boolean value depending upon delete operation was a success or not
     */
    boolean deleteAccount(String mobileNumber);
}
