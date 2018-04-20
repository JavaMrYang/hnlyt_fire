package com.hdkj.lyt.hnlyt_fire.service;

import com.hdkj.lyt.hnlyt_fire.model.City;

import java.util.List;

public interface CityService {
    List<City> findByPid(String pid);
}
