package com.commandosdeouro.desvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.commandosdeouro.desvendas.dto.SaleSuccessDTO;
import com.commandosdeouro.desvendas.dto.SaleSumDTO;
import com.commandosdeouro.desvendas.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale , Long> {
	
	
	@Query("SELECT new com.commandosdeouro.desvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " + " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountgroupedBySeller();
	
	
	@Query("SELECT new com.commandosdeouro.desvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " + " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSuccessDTO> successGroupedBySeller();
	

}
