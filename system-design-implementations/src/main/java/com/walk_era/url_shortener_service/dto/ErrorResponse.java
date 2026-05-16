package com.walk_era.url_shortener_service.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Builder
public class ErrorResponse {
    private int status;
    private String error;
    private String Message;
    private String path;
    private LocalDateTime timestamp;

}
