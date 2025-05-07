package com.TRMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TRMS.Model.Feedback;

@Repository
public interface FeedRepository extends JpaRepository<Feedback, Integer> {

}
