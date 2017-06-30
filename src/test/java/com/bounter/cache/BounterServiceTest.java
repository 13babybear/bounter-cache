package com.bounter.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bounter.cache.entity.Bounter;
import com.bounter.cache.service.BounterService;

/**
 * Created by simon on 2016/12/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class BounterServiceTest {
	
    @Autowired
    private BounterService bounterService;

    @Test
    public void testFindById() throws Exception {
    	Long id = 1001L;
    	Bounter bounter = bounterService.findById(id);
    	System.out.println(bounter.getName());
    }
    
//    @Test
//    public void testFindById2() throws Exception {
//    	Long id = 1002L;
//    	Bounter bounter = bounterService.findById2(id);
//    	System.out.println(bounter.getName());
//    }

//    @Test
//    public void testAdd() throws Exception {
//    	Bounter bounter = new Bounter();
//    	bounter.setId(1001L);
//    	bounter.setName("test1");
//    	bounter.setValue("cache1");
//    	bounterService.add(bounter);
//    	bounter = new Bounter();
//    	bounter.setId(1002L);
//    	bounter.setName("test2");
//    	bounter.setValue("cache2");
//    	bounterService.add(bounter);
//    }


//    @Test
//    public void testUpdate() throws Exception {
//    	Bounter bounter = new Bounter();
//    	bounter.setId(1001L);
//    	bounter.setName("test11");
//    	bounter.setValue("cache11");
//    	bounterService.update(bounter);
//    }
//    
//    @Test
//    public void testDelete() throws Exception {
//    	Bounter bounter = new Bounter();
//    	bounter.setId(1003L);
//    	bounter.setName("test2");
//    	bounter.setValue("cache2");
//    	bounterService.delete(bounter);
//    }
}