package com.itau.desafio.springboot.dtos;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponseDTO {
	private double sum;
	private double avg;
	private double max;
	private double min;
	private long count;

	public StatisticsResponseDTO(DoubleSummaryStatistics stats) {
		this.sum = stats.getSum();
		this.avg = stats.getAverage();
		this.max = stats.getMax();
		this.min = stats.getMin();
		this.count = stats.getCount();
	}

	// Getters

	public double getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}

	public long getCount() {
		return count;
	}
}
