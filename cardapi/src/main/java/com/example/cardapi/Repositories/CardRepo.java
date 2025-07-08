package com.example.cardapi.Repositories;

import com.example.cardapi.Entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepo extends JpaRepository<Card,Integer> {

}
