package com.sena.apiparking.dto;

public record CobroDetalle(Long idTarifa, long minutosTotales,
		long horascompletas, long fraccionCobradas, long tarifaHora, long tarifaFraccion, int tarifaMinutos, long valorTotal) {

	
	
}
