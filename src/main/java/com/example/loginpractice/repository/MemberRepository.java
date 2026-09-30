package com.example.loginpractice.repository;

import com.example.loginpractice.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> { // member데이터를 DB에서 저장, 조회하는 기능 사용

    Optional<Member> findByUsername(String username); // 로그인할 때 필요?

}