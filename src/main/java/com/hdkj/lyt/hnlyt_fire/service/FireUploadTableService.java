package com.hdkj.lyt.hnlyt_fire.service;

import com.hdkj.lyt.hnlyt_fire.model.FireUploadTable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;


import java.util.List;
import java.util.Map;


public interface FireUploadTableService {
    FireUploadTable save(FireUploadTable tbFireUploadTable);
    void updateStatusById(String status,Integer id);
    List<Map> getFireUploagLine1(Integer type);
    FireUploadTable findByHotId(String hotId);
    void deleteById(Integer id);
    Page<Map> findPageByCondition(String fireLevel, String fireKind, String fireArea,String fireAreaTown,String startTime,String endTime, Integer pageNo);
}
