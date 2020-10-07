package com.nt.manoj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.manoj.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{	
	
}

//public interface AlienRepo extends CrudRepository<Alien, Integer>{	
//	 List<Alien> findByTech(String tech);
//	 public Alien findByAname(String name);
//	 public List<Alien> findByAidGreaterThan(int aid);
//	 public List<Alien> findByAidLessThan(int aid);
//	 
//	 @Query("from Alien where tech=?1 order by aname")
//	 public List<Alien> findByTechSorted(String tech);
//}
