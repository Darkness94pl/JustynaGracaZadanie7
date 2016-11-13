package com.howtodoinjava.service;

import java.util.List;

import com.howtodoinjava.dao.UslugiDAO;
import com.howtodoinjava.entity.UslugiEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.dao.UslugiDAO;
import com.howtodoinjava.entity.UslugiEntity;

@Service
public class UslugiManagerImpl implements UslugiManager {
	
	@Autowired
    private UslugiDAO uslugiDAO;

	@Override
	@Transactional
	public void addUslugi(UslugiEntity uslugi) {
		uslugiDAO.addUslugi(uslugi);
	}

	@Override
	@Transactional
	public List<UslugiEntity> getAllUslugi() {
		return uslugiDAO.getAllUslugi();
	}

	@Override
	@Transactional
	public void deleteUslugi(Integer uslugiId) {
		uslugiDAO.deleteUslugi(uslugiId);
	}

	public void setUslugiDAO(UslugiDAO uslugiDAO) {
		this.uslugiDAO = uslugiDAO;
	}
}
