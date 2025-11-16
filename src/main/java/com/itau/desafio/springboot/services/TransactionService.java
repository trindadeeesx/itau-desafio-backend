package com.itau.desafio.springboot.services;

import com.itau.desafio.springboot.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class TransactionService {
	private final Queue<Transaction> transactions = new ConcurrentLinkedQueue<>();

	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}

	public DoubleSummaryStatistics getStatistics() {
		OffsetDateTime now = OffsetDateTime.now();
		return this.transactions.stream()
				.filter(t -> t.getDataHora().isAfter(now.minusSeconds(60)))
				.mapToDouble(Transaction::getValor)
				.summaryStatistics();
	}

	public void clearTransactions() {
		this.transactions.clear();
	}
}
