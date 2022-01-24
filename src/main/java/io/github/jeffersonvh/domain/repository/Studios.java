package io.github.jeffersonvh.domain.repository;


import io.github.jeffersonvh.domain.entity.Studio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studios extends JpaRepository<Studio, Integer> {

    boolean existsByName(String name);

}
