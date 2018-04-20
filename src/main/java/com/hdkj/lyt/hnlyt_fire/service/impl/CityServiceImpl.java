package com.hdkj.lyt.hnlyt_fire.service.impl;

import com.hdkj.lyt.hnlyt_fire.model.City;
import com.hdkj.lyt.hnlyt_fire.repository.CityRepository;
import com.hdkj.lyt.hnlyt_fire.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;
    @Override
    public List<City> findByPid(String pid) {
        return cityRepository.findByPid(pid);
    }
}
