package com.itau.desafio.springboot.model;

import java.time.OffsetDateTime;

public class Transaction {
	private double valor;
	private OffsetDateTime dataHora;

	public Transaction(final double valor, final OffsetDateTime dataHora) {
		this.valor = valor;
		this.dataHora = dataHora;
	}

	// Getters

	public double getValor() {
		return this.valor;
	}

	public OffsetDateTime getDataHora() {
		return this.dataHora;
	}
}
