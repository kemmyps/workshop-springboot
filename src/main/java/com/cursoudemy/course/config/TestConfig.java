package com.cursoudemy.course.config;

import com.cursoudemy.course.entities.User;
import com.cursoudemy.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        //id null porque vai ser gerado automaticamente pelo BD
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9999999999", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "629999999", "123456");

        //Agora basta salvar os objetos, chamando a operação saveAll e depois criar uma lista e passar os objetos
        userRepository.saveAll(Arrays.asList(u1,u2));

    }
}
