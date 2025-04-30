package com.API.repository;

import com.API.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewEntityRepository extends JpaRepository<NewEntity, Long> {


}