package com.eazybytes.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Schema(
        name = "ResponseDto",
        description = "Schema to hold response data."
)
@AllArgsConstructor
public class ResponseDto {
    @Schema(description = "Status code in the response.")
    private String statusCode;

    @Schema(description = "Status message in the response.")
    private String statusMsg;
}