package com.howtodoinjava.dao;

import java.util.List;

import com.howtodoinjava.entity.UslugiEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.entity.UslugiEntity;

@Repository
public class UslugiDaoImpl implements UslugiDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void addUslugi(UslugiEntity uslugi) {
		this.sessionFactory.getCurrentSession().save(uslugi);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UslugiEntity> getAllUslugi() {
		return this.sessionFactory.getCurrentSession().createQuery("from UslugiEntity").list();
	}

	@Override
	public void deleteUslugi(Integer uslugiId) {
		//UslugiEntity uslugi = (UslugiEntity) sessionFactory.getCurrentSession().load(
		//		UslugiEntity.class, uslugiId);
        //if (null != uslugi) {
        //	this.sessionFactory.getCurrentSession().delete(uslugiId);
        //}
		UslugiEntity us = new UslugiEntity();
		us.setId(uslugiId);
		this.sessionFactory.getCurrentSession().delete(us);
	}
	
	

}
