package com.commandosdeouro.desvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commandosdeouro.desvendas.dto.SellerDTO;
import com.commandosdeouro.desvendas.entities.Seller;
import com.commandosdeouro.desvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List <SellerDTO> findALL(){
		
		List<Seller> result=repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		
	}
	
}
	