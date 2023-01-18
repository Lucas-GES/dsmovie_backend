package com.spring_react.dsmovie.repositories;

import com.spring_react.dsmovie.entities.Score;
import com.spring_react.dsmovie.entities.ScorePK;
import com.spring_react.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
