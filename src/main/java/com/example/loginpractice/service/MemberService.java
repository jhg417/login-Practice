package com.example.loginpractice.service;

import com.example.loginpractice.entity.Member;
import com.example.loginpractice.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member register(String username, String password) {

        Member member = new Member(username, password);

        return memberRepository.save(member);
    }

    public boolean login(String username, String password) {

        Optional<Member> member = memberRepository.findByUsername(username);

        if (member.isPresent()) {
            return member.get().getPassword().equals(password);
        }

        return false;
    }
}