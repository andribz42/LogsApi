package br.com.cotiinformatica.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogsController {

	private static final Logger logger = LoggerFactory.getLogger(LogsController.class);
	
	@GetMapping("{message}")
	public ResponseEntity<String> get(@PathVariable String message) {
		
		logger.debug("Debug - " + message);
		logger.info("Info - " + message);
		logger.error("Error - " + message);
		
		return ResponseEntity.ok(message);
	}
}