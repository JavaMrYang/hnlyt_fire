package com.hdkj.lyt.hnlyt_fire.repository;

import com.hdkj.lyt.hnlyt_fire.common.BaseRepository;
import com.hdkj.lyt.hnlyt_fire.model.FireUploadTable;
import org.apache.ibatis.annotations.Select;
import org.hibernate.annotations.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


public interface FireUpLoadTableRepository extends JpaRepository<FireUploadTable,Integer>,JpaSpecificationExecutor{
    @Query(value = "update tb_FireUploadTable set fireStatus=?1 where id=?2",nativeQuery = true)
    @Modifying
    @Transactional
    void updateStatusById(String status,Integer id);

    /**
     * 获取湖南省火情上报曲线图1
     * @param startTime
     * @param endTime
     * @return
     */
    @Query(value = "SELECT COUNT(*) as num,fireArea,createDate from tb_FireUploadTable WHERE createDate>=?1 AND createDate<=?2 and fireStatus=0 GROUP BY fireArea,createDate",nativeQuery = true)
    List<Map> getFireUploagLine(String startTime,String endTime);

    FireUploadTable findByHotId(String hotId);

    @Query(value = "DELETE tb_FireUploadTable WHERE id=?1",nativeQuery = true)
    @Modifying
    @Transactional
    void deleteById(Integer id);


}
