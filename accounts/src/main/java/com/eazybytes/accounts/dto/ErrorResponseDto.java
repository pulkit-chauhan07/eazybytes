package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {
    @Schema(description = "API path invoked by client")
    private String apiPath;

    @Schema(description = "Error code representing occurred error")
    private String errorMessage;

    @Schema(description = "Error message representing error summary")
    private HttpStatus errorCode;

    @Schema(description = "Time stamp of the error occurred")
    private LocalDateTime errorTime;
}