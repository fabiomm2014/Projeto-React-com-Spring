package com.commandosdeouro.desvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.commandosdeouro.desvendas.dto.SaleDTO;
import com.commandosdeouro.desvendas.dto.SaleSuccessDTO;
import com.commandosdeouro.desvendas.dto.SaleSumDTO;
import com.commandosdeouro.desvendas.entities.Sale;
import com.commandosdeouro.desvendas.repositories.SaleRepository;
import com.commandosdeouro.desvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly=true)
	public Page <SaleDTO> findALL(Pageable pageable){		
		sellerRepository.findAll();		
		Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
		
	}
	
	@Transactional(readOnly=true)
	public List<SaleSumDTO> amountGroupedBySeller(){		
		return repository.amountgroupedBySeller();
		
	}
		
	@Transactional(readOnly=true)
	public List<SaleSuccessDTO> successGroupedBySeller(){		
		return repository.successGroupedBySeller();
		
	}
	
}
	