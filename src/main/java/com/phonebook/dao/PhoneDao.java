package com.phonebook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebook.model.PhoneDetails;

import jakarta.transaction.Transactional;
@Transactional
public interface PhoneDao extends JpaRepository<PhoneDetails, Integer> {

}
