package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {
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
    private AccountsDto accountsDto;
}
