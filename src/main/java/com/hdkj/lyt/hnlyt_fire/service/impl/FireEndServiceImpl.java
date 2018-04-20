package com.hdkj.lyt.hnlyt_fire.service.impl;

import com.hdkj.lyt.hnlyt_fire.model.FireEnd;
import com.hdkj.lyt.hnlyt_fire.repository.FireEndRepository;
import com.hdkj.lyt.hnlyt_fire.service.FireEndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FireEndServiceImpl implements FireEndService {
    @Autowired
    private FireEndRepository fireEndRepository;
    @Override
    public boolean save(FireEnd fireEnd) {
        FireEnd entity=fireEndRepository.save(fireEnd);
        return entity != null;
    }

    @Override
    public void deleteById(String id) {
        fireEndRepository.deleteById(id);
    }

}
