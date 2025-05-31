package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
        name = "Cards",
        description = "Schema to hold Cards information."
)
@Data
public class CardsDto {
    @NotEmpty(message = "Mobile number cannot be empty or null.")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be of 10 digits.")
    @Schema(
            description = "Mobile number of customer.",
            example = "9876543210"
    )
    private String mobileNumber;

    @NotEmpty(message = "Card number cannot be empty or null.")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Card number must be of 12 digits.")
    @Schema(
            description = "Card number of customer.",
            example = "432156780001"
    )
    private String cardNumber;

    @NotEmpty(message = "Card Type cannot be empty or null.")
    @Schema(
            description = "Type of card of the customer.",
            example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Card Limit must be greater than zero.")
    @Schema(
            description = "Total card limit of the card.",
            example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total credit used must be equal to or greater than zero.")
    @Schema(
            description = "Total credit used by the card holder.",
            example = "1000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total remaining credit must be equal to or greater than zero.")
    @Schema(
            description = "Total remaining credit against the card available to the customer.",
            example = "90000"
    )
    private int availableAmount;
}