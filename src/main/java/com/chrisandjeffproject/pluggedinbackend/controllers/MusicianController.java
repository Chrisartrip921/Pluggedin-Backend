package com.chrisandjeffproject.pluggedinbackend.controllers;

import com.chrisandjeffproject.pluggedinbackend.models.Musician;
import com.chrisandjeffproject.pluggedinbackend.repository.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicianController {

    @Autowired
    private MusicianRepository musicianRepository;

    //Post request to save the newly made musician in repo
    @PostMapping("/musician")
    Musician newMusician(@RequestBody Musician newMusician) { return musicianRepository.save(newMusician); }

}
