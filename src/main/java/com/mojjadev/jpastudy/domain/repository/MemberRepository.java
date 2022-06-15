package com.mojjadev.jpastudy.domain.repository;

import com.mojjadev.jpastudy.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
