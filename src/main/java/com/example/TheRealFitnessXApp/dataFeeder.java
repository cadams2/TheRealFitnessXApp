package com.example.TheRealFitnessXApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class dataFeeder implements ApplicationRunner {

    Random rand = new Random();

    @Autowired
    FitnessProgressRepository progressRepository;
    @Autowired
    FitnessRepository userRepository;

    public void run(ApplicationArguments aa){
        FitnessUserData user = userRepository.save(new FitnessUserData());

        for (int i = 0; i < 10; i++){
            progressRepository.save(new FitnessUserProgress(rand.nextFloat() * 5, rand.nextInt(100000), rand.nextInt(4000), user));
        }


    }


}
