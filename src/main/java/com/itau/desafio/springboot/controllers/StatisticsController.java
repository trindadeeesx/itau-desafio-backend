package com.itau.desafio.springboot.controllers;

import com.itau.desafio.springboot.dtos.StatisticsResponseDTO;
import com.itau.desafio.springboot.services.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
public class StatisticsController {
	private TransactionService service;

	public StatisticsController(TransactionService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<StatisticsResponseDTO> getStatistics() {
		DoubleSummaryStatistics stats = service.getStatistics();
		return ResponseEntity.ok(new StatisticsResponseDTO(stats));
	}
}
