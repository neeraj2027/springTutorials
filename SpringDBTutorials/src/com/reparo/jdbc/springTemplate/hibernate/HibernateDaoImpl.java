package com.reparo.jdbc.springTemplate.hibernate;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public int getAllUers() {
		String sql = "Select count(*) from users";
		Query query = getSessionFactory().openSession().createQuery(sql);
		return (int) query.uniqueResult();
	}

}
