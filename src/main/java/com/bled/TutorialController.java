package com.bled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorialController {

    @Autowired
    private TutorialRepository tutorialRepository;

    @GetMapping("/tutorials")
    public List<Tutorial> getAllTutorials(){
        return (List<Tutorial>) tutorialRepository.findAll();
    }
}
