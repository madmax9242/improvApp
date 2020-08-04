package com.improv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.improv.models.Setting;

@Repository
public interface SettingDao extends JpaRepository<Setting, Integer> {

}
