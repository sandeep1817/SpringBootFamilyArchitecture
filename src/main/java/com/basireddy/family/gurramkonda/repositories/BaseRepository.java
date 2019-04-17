package com.basireddy.family.gurramkonda.repositories;

import com.basireddy.family.gurramkonda.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> {
    List<T> findAll();
//    List<T> findAllByGender(String gender);
//    List<T> findAllByRelationship(String relation);
    Optional<T> findById(Long id);
//    List<T> findAllByFamily(String family);
}
