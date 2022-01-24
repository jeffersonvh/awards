package io.github.jeffersonvh.domain.repository;

import io.github.jeffersonvh.domain.entity.Award;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Awards extends JpaRepository<Award, Integer> {

    boolean existsByYear(String year);

    @Query("insert into awards (year, movie_id) values (?, ?)")
    Award saveAll( @Param("title") Integer id){

    }
}
