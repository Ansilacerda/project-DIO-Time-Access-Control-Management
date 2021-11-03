package com.dio.ansi.controller;

import com.dio.ansi.model.AccessLevel;
import com.dio.ansi.service.AccessLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/accesslevel")
public class AccessLevelController {

    @Autowired
    AccessLevelService accessLevelService;

    @PostMapping
    public AccessLevel createAccessLevel(AccessLevel accessLevel) {
        return accessLevelService.createAccessLevel(accessLevel);
    }

    @DeleteMapping("/{idAccessLevel}")
    public void deleteAccessLevel(Long idAccessLevel) {
        accessLevelService.deleteAccessLevel(idAccessLevel);
    }

    @GetMapping("/{idAccessLevel}")
    public AccessLevel findById(Long idAccessLevel) {
        return accessLevelService.findById(idAccessLevel);
    }

    @GetMapping
    public List<AccessLevel> findAll() {
        return accessLevelService.findAll();
    }

    @PutMapping
    public AccessLevel updateAccessLevel(AccessLevel accessLevel) {
        return accessLevelService.createAccessLevel(accessLevel);
    }
}
