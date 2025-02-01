package com.eazybytes.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information."
)
@AllArgsConstructor
public class ErrorResponseDto {
    @Schema(description = "API path invoked by client.")
    private String path;

    @Schema(description = "Error code representing the error.")
    private HttpStatus errorCode;

    @Schema(description = "Message description of the error.")
    private String errorMessage;

    @Schema(description = "Time of the occurred error.")
    private LocalDateTime errorTime;
}