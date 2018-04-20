package com.hdkj.lyt.hnlyt_fire.repository;

import com.hdkj.lyt.hnlyt_fire.model.FireTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FireTrackRepository extends JpaRepository<FireTrack,Integer> {

    @Query(value = "update TbFireTrack set status=?1 where id=?2",nativeQuery = true)
    @Modifying
    void updateStatusById(String status, Integer id);

    void deleteById(Integer id);
}
