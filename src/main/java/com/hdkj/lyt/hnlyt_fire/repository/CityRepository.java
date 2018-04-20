package com.hdkj.lyt.hnlyt_fire.repository;

import com.hdkj.lyt.hnlyt_fire.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City,String> {
    @Query(value = "select name,id,pid from tb_City where pid=?1 ORDER BY id ASC",nativeQuery = true)
     List<City>  findByPid(String pid);
}
