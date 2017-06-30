package com.bounter.cache.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bounter.cache.entity.Bounter;
import com.bounter.cache.service.BounterService;

@Service
public class BounterServiceImpl implements BounterService {

	private List<Bounter> bounterList;
	
	public BounterServiceImpl() {
		bounterList = new ArrayList<>();
		Bounter bounter = new Bounter();
    	bounter.setId(1001L);
    	bounter.setName("test1");
    	bounter.setValue("cache1");
    	bounterList.add(bounter);
	}
	
	@Override
	@Cacheable(value = "bounter-cache", key="methodName + args")
	public Bounter findById(Long id) {
		for(Bounter bounter : bounterList) {
			if(bounter.getId().longValue() == id.longValue()) {
				System.out.println("Find from list!");
				return bounter;
			}
		}
		return null;
	}
	
	@Override
	@Cacheable(value = "bounter-cache", key="methodName + args")
	public Bounter findById1(Long id) {
		for(Bounter bounter : bounterList) {
			if(bounter.getId().longValue() == id.longValue()) {
				System.out.println("Find from list!");
				return bounter;
			}
		}
		return null;
	}
	
	@Override
	public void add(Bounter bounter) {
		bounterList.add(bounter);
	}

	@Override
	@CacheEvict(value = "bounter-cache", allEntries=true)
	public void update(Bounter bounter) {
		for(int i=0; i<bounterList.size(); i++) {
			if(bounterList.get(i).getId() == bounter.getId()) {
				bounterList.remove(i);
			}
		}
		bounterList.add(bounter);
	}

	@Override
	@CacheEvict(value = "bounter-cache", allEntries=true)
	public void delete(Bounter bounter) {
		for(int i=0; i<bounterList.size(); i++) {
			if(bounterList.get(i).getId().longValue() == bounter.getId().longValue()) {
				bounterList.remove(i);
			}
		}
	}

}
