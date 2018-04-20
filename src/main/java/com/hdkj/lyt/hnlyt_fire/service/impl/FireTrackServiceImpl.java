package com.hdkj.lyt.hnlyt_fire.service.impl;


import com.hdkj.lyt.hnlyt_fire.model.FireTrack;
import com.hdkj.lyt.hnlyt_fire.repository.FireTrackRepository;
import com.hdkj.lyt.hnlyt_fire.service.FireTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FireTrackServiceImpl implements FireTrackService{
    @Autowired
    private FireTrackRepository tbFireTrackRepository;
    @Override
    public boolean save(FireTrack tbFireTrack) {
        FireTrack ft= tbFireTrackRepository.save(tbFireTrack);
        return ft != null;
    }

    @Override
    public void updateStatusById(String status, Integer id) {
        tbFireTrackRepository.updateStatusById(status,id);
    }

    @Override
    public void deleteById(Integer id) {
        tbFireTrackRepository.deleteById(id);
    }
}
