package com.itau.desafio.springboot.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionRequestDTO {
	@NotNull
	@Min(0)
	private double valor;

	@NotNull
	private OffsetDateTime dataHora;

	// Getters

	public double getValor() {
			return this.valor;
	}

	public OffsetDateTime getDataHora() {
		return this.dataHora;
	}
}
