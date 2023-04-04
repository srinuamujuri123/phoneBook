package com.phonebook.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.dao.PhoneDao;

@Service
public class TMSScheduler {
@Autowired
PhoneDao phoneDao;

}
