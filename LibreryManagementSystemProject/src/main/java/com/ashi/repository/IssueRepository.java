package com.ashi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashi.model.Issue;

public interface IssueRepository extends JpaRepository <Issue, Long> {

}
