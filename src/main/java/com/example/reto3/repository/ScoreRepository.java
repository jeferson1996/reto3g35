package com.example.reto3.repository;



import com.example.reto3.model.ScoreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreModel,Integer> {


}
