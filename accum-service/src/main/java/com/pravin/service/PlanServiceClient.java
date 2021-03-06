package com.pravin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pravin.model.BenefitPlanAssociation;

@FeignClient("plan-service")
public interface PlanServiceClient {

	@GetMapping("/user/{username}/plan")
	BenefitPlanAssociation getPlansByUsername(@PathVariable("username") String username);
}
