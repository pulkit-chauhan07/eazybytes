package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(
        name = "Loans",
        description = "Schema to hold Loans Information."
)
public class LoansDto {

    @NotEmpty(message = "Mobile Number cannot be null or empty.")
    @Pattern(regexp = "(^$|[(0-9]{10})", message = "Mobile Number must be 10 digits.")
    @Schema(
            description = "Mobile number of customer.",
            example = "9876543210"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan Number cannot be null or empty.")
    @Pattern(regexp = "(^$|[(0-9]{12})", message = "Loan Number must be 12 digits.")
    @Schema(
            description = "Loan number of customer.",
            example = "123456543210"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan Type cannot be null or empty.")
    @Schema(
            description = "Type of loan.",
            example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total loan amount should be greater than zero.")
    @Schema(
            description = "Total loan amount",
            example = "10000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be greater than or equal to zero.")
    @Schema(
            description = "Total loan amount paid.",
            example = "1000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Outstanding amount should be greater than or equal to zero.")
    @Schema(
            description = "Outstanding amount against the loan.",
            example = "9000"
    )
    private int outstandingAmount;
}