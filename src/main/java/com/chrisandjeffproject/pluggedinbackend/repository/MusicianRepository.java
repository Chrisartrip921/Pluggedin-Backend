package com.chrisandjeffproject.pluggedinbackend.repository;

import com.chrisandjeffproject.pluggedinbackend.models.Musician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicianRepository extends JpaRepository<Musician, Long> {
}
