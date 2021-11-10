package com.commandosdeouro.desvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commandosdeouro.desvendas.dto.SellerDTO;
import com.commandosdeouro.desvendas.services.SellerService;

@RestController
@RequestMapping (value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping	
	public ResponseEntity<List<SellerDTO>> findALL()
		{
		
		List<SellerDTO> list = service.findALL();
		return ResponseEntity.ok(list);
		
		
		
	}

}