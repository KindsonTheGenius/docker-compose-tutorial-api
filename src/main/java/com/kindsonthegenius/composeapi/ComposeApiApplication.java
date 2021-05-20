package com.kindsonthegenius.composeapi;

import com.kindsonthegenius.composeapi.models.Friend;
import com.kindsonthegenius.composeapi.repositories.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ComposeApiApplication {

    @Autowired
    private FriendRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ComposeApiApplication.class, args);
    }

    @PostConstruct
    public void friendsInit(){
        repository.save(new Friend(1, "Kindson", "Munonye", "Computer Science"));
        repository.save(new Friend(2, "Komla", "Agudze", "Economics"));
        repository.save(new Friend(3, "Helena", "Grunden", "Gardening"));
        repository.save(new Friend(4, "Anita", "Wilfred", "Social Working"));
        repository.save(new Friend(5, "Ruth", "Untertep", "Medicine"));
        repository.save(new Friend(6, "Nicholas", "Horvath", "Biology Teaching"));
    }

}
