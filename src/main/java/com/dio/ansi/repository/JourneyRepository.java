package com.dio.ansi.repository;



import com.dio.ansi.model.WorkingJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<WorkingJourney, Long> {
}