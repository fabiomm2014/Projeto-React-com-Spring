package com.commandosdeouro.desvendas.dto;

import java.io.Serializable;

import com.commandosdeouro.desvendas.entities.Seller;

public class SaleSumDTO implements Serializable{	
 	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sum;

	/**
	 * 
	 */
	public SaleSumDTO() {
		super();
	}


	/**
	 * @param sellerName
	 * @param sum
	 */
	public SaleSumDTO(Seller seller, Double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}



	public String getSellerName() {
		return sellerName;
	}



	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}








	public Double getSum() {
		return sum;
	}








	public void setSum(Double sum) {
		this.sum = sum;
	}





	
	
	
	

}
