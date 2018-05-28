package com.hdkj.lyt.hnlyt_fire.common;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public interface BaseRepository<T,ID extends Serializable> extends PagingAndSortingRepository<T, ID>,JpaRepository<T,ID> {

        /**
         * sql查询
         *
         * @param sql
         * @param args
         * @return
         */
        List<Map> findAllByParams(String sql, Object...args);

        /**
         * sql分页查询
         *
         * @param sql
         * @param args
         * @return
         */
        Page<Map> findPageByParams(String sql, Pageable pageable, Object...args);

        }


