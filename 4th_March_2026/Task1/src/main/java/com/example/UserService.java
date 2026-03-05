package com.example;

public class UserService {


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    public void output1() {
        System.out.println(userRepository.userRepo1());
    }

    public void output2() {
        System.out.println(userRepository.userRepo2());
    }
}
