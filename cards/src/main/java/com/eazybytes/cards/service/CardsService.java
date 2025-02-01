package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;

public interface CardsService {

    /**
     *
     * @param mobileNumber - Mobile number of customer
     */
    void createCard (String mobileNumber);

    /**
     *
     * @param mobileNumber - Mobile number as input
     * @return Card details based on input mobile number
     */
    CardsDto fetchCard (String mobileNumber);

    /**
     *
     * @param cardsDto Updated details of card as CardsDto object
     * @return boolean indicating if update was successful
     */
    boolean updateCard (CardsDto cardsDto);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return boolean indicating if delete operation was a success
     */
    boolean deleteCard (String mobileNumber);
}