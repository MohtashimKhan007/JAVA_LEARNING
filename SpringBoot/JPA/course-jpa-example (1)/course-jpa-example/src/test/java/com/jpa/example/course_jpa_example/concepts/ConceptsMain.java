package com.jpa.example.course_jpa_example.concepts;

import com.jpa.example.course_jpa_example.entity.Laptop;
import com.jpa.example.course_jpa_example.entity.User;
import com.jpa.example.course_jpa_example.repository.LaptopRepo;
import com.jpa.example.course_jpa_example.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ConceptsMain {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LaptopRepo laptoprepo;
    @Autowired
    private LaptopRepo laptopRepo;

    @Test
    @Transactional
    public void testSaveOneToOne(){

       User user =  userRepository.findById(101).orElseThrow(()-> new RuntimeException("User not found"));

       //new Laptop
        Laptop laptop = new Laptop();
        laptop.setModel("Dell 2 1232");
        laptop.setAbout("This is  Monish new laptop");

        //making al list for laptop becuase user setlaptop method is expecting a list not a single object
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop);



        user.setLaptops(laptopList);
        laptop.setUser(user);

        laptopRepo.save(laptop);
        System.out.println("Laptop Added");



    }

//    @Test
//    public void testGetOneToOne(){
//        User user =  userRepository.findById(101).orElseThrow(()-> new RuntimeException("User not found"));
//        System.out.println(user.getName());
//
//        Laptop laptop = user.getLaptops();
//        System.out.println(laptop.getId());
//    }
    @Test
    @Transactional
    public void saveOneToMany(){
        User user =  userRepository.findById(101).orElseThrow(()-> new RuntimeException("User not found"));
       Laptop laptop1 = new Laptop();

       laptop1.setModel("Macbook air");
       laptop1.setAbout("Personal Laptop");

        Laptop laptop2 = new Laptop();
        laptop2.setModel("del air");
        laptop2.setAbout("monish Laptop");


        user.getLaptops().add(laptop1);
        user.getLaptops().add(laptop2);
        laptop1.setUser(user);
        laptop2.setUser(user);

        userRepository.save(user);
        System.out.println("User Updated");
    }

}
