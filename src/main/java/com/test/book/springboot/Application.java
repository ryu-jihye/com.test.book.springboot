package com.test.book.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //@SpringBootApplication 아래부터 코드를 읽음(스프링 부트의 자동설정, 스프링 Bean 읽기, 생성)
public class Application {//앞으로 만들 프로젝트의 메인 클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //SpringApplication.run = 내장 WAS(웹 애플리케이션 서버) 실행, 톰캣 설치 필요x, 스프링 부트로 만든 Jar 파일 실행
        //SpringApplication.run 장점 = 언제 어디서나 같은 환경에서 스프링 부트 배포 가능
    }
}