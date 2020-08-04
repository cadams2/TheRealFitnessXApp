package com.example.TheRealFitnessXApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FitnessProgressRepository extends JpaRepository<FitnessUserProgress, UUID> {

    public List<FitnessUserProgress> findTop7ByUserOrderByCreated(FitnessUserData user) ;
}
