package com.improv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.improv.models.Activity;

@Repository
public interface ActivityDao extends JpaRepository<Activity, Integer> {

}
