package io.github.jeffersonvh.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Movies extends JpaRepository<io.github.jeffersonvh.domain.entity.Movie, Integer> {

    boolean existsByTitle(String title);

}
