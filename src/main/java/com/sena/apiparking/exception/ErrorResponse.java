package com.sena.apiparking.exception;

import java.time.LocalDateTime;
import java.util.List;

public record ErrorResponse(LocalDateTime timesTamp, int status, String error, String mensaje, List<String> detalles) {

}
