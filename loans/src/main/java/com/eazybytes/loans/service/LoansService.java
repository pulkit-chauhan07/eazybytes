package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoansDto;

public interface LoansService {

    /**
     *
     * @param mobileNumber - Mobile number of the customer
     */
    void createLoan (String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Loan details based on given mobile number
     */
    LoansDto fetchLoan (String mobileNumber);

    /**
     *
     * @param loansDto - Loan details to be updated via LoansDto object
     * @return true or false to indicate if update loan function was successful
     */
    boolean updateLoan (LoansDto loansDto);

    /**
     *
     * @param mobileNumber - Mobile number of the customer whose loan details need to be removed
     * @return true or false indicating if delete operation was successful
     */
    boolean deleteLoan (String mobileNumber);
}