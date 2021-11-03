package com.dio.ansi.service;

import com.dio.ansi.exception.MovementNotFoundException;
import com.dio.ansi.model.Movement;
import com.dio.ansi.repository.MovementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovementService {

    MovementRepository movementRepository;

    public MovementService(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public Movement createMovement(Movement movement) {
        return movementRepository.save(movement);
    }

    public void deleteMovement(Long idMovement) {
        movementRepository.deleteById(idMovement);
    }

    public List<Movement> findAll() {
        return movementRepository.findAll();
    }

    public Movement findById(Long idMovement) {
        return movementRepository.findById(idMovement).orElseThrow(() -> new MovementNotFoundException(idMovement));
    }

    public Movement updateMovement(Movement movement) {
        return movementRepository.save(movement);
    }
}
