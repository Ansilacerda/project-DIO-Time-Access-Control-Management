package com.dio.ansi.repository;

import com.dio.ansi.model.CompTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompTimeRepository extends JpaRepository<CompTime, Long> {

}
