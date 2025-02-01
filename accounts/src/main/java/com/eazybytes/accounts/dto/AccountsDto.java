package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold account information"
)
@Data
public class AccountsDto {
    @NotEmpty(message = "Account number cannot be null or empty!")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits!")
    @Schema(description = "Account number of the customer", example = "3456789012")
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be null or empty!")
    @Schema(description = "Type of the account", example = "Savings")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty!")
    @Schema(description = "EazyBank branch address", example = "123, West Street, New York")
    private String branchAddress;
}
