package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "CustomerDetails",
        description = "Schema to hold Customer, Account, Cards, and Loans information"
)
public class CustomerDetailsDto {
    @NotEmpty(message = "Name cannot be null or empty!")
    @Size(min = 5, max = 30, message = "Invalid Name. Name should be between 4 and 30 characters.")
    @Schema(
            description = "Name of the customer", example = "John Doe"
    )
    private String name;

    @NotEmpty(message = "Email address cannot be null or empty!")
    @Email(message = "Please enter a valid Email address!")
    @Schema(
            description = "Email address of customer", example = "john.doe@abc.com"
    )
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits!")
    @Schema(
            description = "Mobile number of the customer", example = "9876543210"
    )
    private String mobileNumber;

    @Schema(
            description = "Account details of customer"
    )
    private AccountsDto accountsDto;

    @Schema(
            description = "Cards details of customer"
    )
    private CardsDto cardsDto;

    @Schema(
            description = "Loans details of customer"
    )
    private LoansDto loansDto;
}
