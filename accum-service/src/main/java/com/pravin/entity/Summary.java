package com.pravin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Summary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long benefitPlanId;

	@Column(unique = true)
	private String username;
	private Long specialServiceUsedCount;
	private double coinsuranceTotal;
	private double deductibleTotal;
	private double insuranceCompanyTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBenefitPlanId() {
		return benefitPlanId;
	}

	public void setBenefitPlanId(Long benefitPlanId) {
		this.benefitPlanId = benefitPlanId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getSpecialServiceUsedCount() {
		return specialServiceUsedCount;
	}

	public void setSpecialServiceUsedCount(Long specialServiceUsedCount) {
		this.specialServiceUsedCount = specialServiceUsedCount;
	}

	public double getCoinsuranceTotal() {
		return coinsuranceTotal;
	}

	public void setCoinsuranceTotal(double coinsuranceTotal) {
		this.coinsuranceTotal = coinsuranceTotal;
	}

	public double getDeductibleTotal() {
		return deductibleTotal;
	}

	public void setDeductibleTotal(double deductibleTotal) {
		this.deductibleTotal = deductibleTotal;
	}

	public double getInsuranceCompanyTotal() {
		return insuranceCompanyTotal;
	}

	public void setInsuranceCompanyTotal(double insuranceCompanyTotal) {
		this.insuranceCompanyTotal = insuranceCompanyTotal;
	}
}
