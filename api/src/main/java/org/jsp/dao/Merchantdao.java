package org.jsp.dao;

import org.jsp.dto.Merchant;
import org.jsp.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Merchantdao {
@Autowired
private MerchantRepository repository;
public Merchant saveMerchant(Merchant merchant)
{
	return repository.save(merchant);
}
}
