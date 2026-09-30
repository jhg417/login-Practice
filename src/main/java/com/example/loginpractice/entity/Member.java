package com.example.loginpractice.entity;

import jakarta.persistence.*;

@Entity // JPA에게 DB 테이블과 연결되는 클래스임을 알려줌
@Table(name = "users")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id는 기본키이고, DB가 자동으로 번호를 만듦
    private Long id;

    private String username;
    private String password;

    public Member(){
    }

    public Member(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
