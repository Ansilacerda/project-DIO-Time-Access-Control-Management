package com.dio.ansi.service;

import com.dio.ansi.exception.AccessLevelNotFoundException;
import com.dio.ansi.model.AccessLevel;
import com.dio.ansi.repository.AccessLevelRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccessLevelService {

    AccessLevelRepository accessLevelRepository;

    public AccessLevelService(AccessLevelRepository accessLevelRepository) {
        this.accessLevelRepository = accessLevelRepository;
    }

    public AccessLevel createAccessLevel(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }

    public void deleteAccessLevel(Long idAccessLevel) {
        accessLevelRepository.deleteById(idAccessLevel);
    }

    public AccessLevel findById(Long idAccessLevel) {
        return accessLevelRepository.findById(idAccessLevel).orElseThrow(() -> new AccessLevelNotFoundException(idAccessLevel));
    }

    public List<AccessLevel> findAll() {
        return accessLevelRepository.findAll();
    }

    public AccessLevel updateAccessLevel(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }
}
