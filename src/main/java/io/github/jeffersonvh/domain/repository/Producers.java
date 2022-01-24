package io.github.jeffersonvh.domain.repository;

import io.github.jeffersonvh.domain.entity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Producers extends JpaRepository<Producer, Integer>{

    boolean existsByName(String name);

}
