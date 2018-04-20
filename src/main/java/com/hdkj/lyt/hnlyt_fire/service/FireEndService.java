package com.hdkj.lyt.hnlyt_fire.service;

import com.hdkj.lyt.hnlyt_fire.model.FireEnd;

public interface FireEndService {
    boolean save(FireEnd fireEnd);
    void deleteById(String id);
}
