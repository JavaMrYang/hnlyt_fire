package com.hdkj.lyt.hnlyt_fire.service;

import com.hdkj.lyt.hnlyt_fire.model.FireTrack;

public interface FireTrackService {
    boolean save(FireTrack tbFireTrack);
    void updateStatusById(String status,Integer id);
    void deleteById(Integer id);
}
