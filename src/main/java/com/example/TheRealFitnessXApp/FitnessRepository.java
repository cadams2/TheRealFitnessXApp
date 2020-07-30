package com.example.TheRealFitnessXApp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FitnessRepository extends JpaRepository<FitnessUserData, UUID> {

}
