package org.jsp.controller;

import org.jsp.dto.Merchant;
import org.jsp.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {
	@Autowired
	private MerchantService service;
	@PostMapping("/merchants")
	public Merchant saveMerchant(@RequestBody Merchant merchant)
	{
		return service.saveMerchant(merchant);
	}

}
