package com.commandosdeouro.desvendas.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commandosdeouro.desvendas.dto.SaleDTO;
import com.commandosdeouro.desvendas.services.SaleService;

@RestController
@RequestMapping (value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping	
	public ResponseEntity<Page<SaleDTO>> findALL(Pageable pageable)
		{
			Page<SaleDTO> list = service.findALL(pageable);
		return ResponseEntity.ok(list);
		
		
		
	}

}
