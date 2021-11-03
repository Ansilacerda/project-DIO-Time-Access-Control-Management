package com.dio.ansi.controller;

import com.dio.ansi.model.Movement;
import com.dio.ansi.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movement")
public class MovementController {

    @Autowired
    MovementService movementService;

    @PostMapping
    public Movement create(@RequestBody Movement movement) {
        return movementService.createMovement(movement);
    }

    @DeleteMapping("/{idMovement}")
    public void deleteMovementById(@PathVariable("idMovement") Long idMovement) {
        movementService.deleteMovement(idMovement);
    }

    @GetMapping
    public List<Movement> findAll() {
        return movementService.findAll();
    }

    @GetMapping("/idMovement}")
    public Movement findById(@PathVariable("idMovement") Long idMovement) {
        return movementService.findById(idMovement);
    }

    @PutMapping
    public Movement updateMovement(@RequestBody Movement movement) {
        return movementService.updateMovement(movement);
    }
}
