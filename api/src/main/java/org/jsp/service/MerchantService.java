package org.jsp.service;

import org.jsp.dao.Merchantdao;
import org.jsp.dto.Merchant;
import org.springframework.beans.factory.annotation.Autowired;

public class MerchantService {
@Autowired
private Merchantdao dao;
public Merchant saveMerchant(Merchant merchant)
{
	return dao.saveMerchant(merchant);
}
}
