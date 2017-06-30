package com.bounter.cache.service;

import com.bounter.cache.entity.Bounter;

public interface BounterService {
	
	Bounter findById(Long id);
	
	Bounter findById1(Long id);
	
	void add(Bounter bounter);
	
	void update(Bounter bounter);
	
	void delete(Bounter bounter);
}
