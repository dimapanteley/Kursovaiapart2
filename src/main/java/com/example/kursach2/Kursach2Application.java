package com.example.kursach2;


import com.example.kursach2.interfaces.ExaminerService;
import com.example.kursach2.interfaces.QuestionService;
import com.example.kursach2.services.ExaminerServiceImpl;
import com.example.kursach2.services.JavaQuestionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.kursach2.services.ExaminerServiceImpl;

@SpringBootApplication
public class Kursach2Application {

    public static void main(String[] args) {
        SpringApplication.run(Kursach2Application.class, args);
    }

}