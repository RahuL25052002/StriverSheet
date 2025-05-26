package com.cdac.dao;

import com.cdac.entities.Product;
import com.cdac.entities.User;

import org.hibernate.*;
import static com.cdac.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.List;
public class ProductDaoImpl implements ProductDao {
	
	@Override
	public List<Product> getProductIdNamePriceByDate(LocalDate date) {
		List<Product> products=null;
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		String jpql="select new com.cdac.entities.Product(p.productId, p.productName, p.price) from Product p where manufactureDate<:date";
		
		try {
			products=session.createQuery(jpql,Product.class).setParameter("date", date).getResultList();
			tx.commit();
		}catch(RuntimeException e) {
			if(tx!=null) {
				tx.rollback();	
			}
			throw e;
		}
		return products;
	}

	@Override
	public String addProduct(Product p) {
		//1 get a session
		String msg="Product failed to add";
		Session session=getFactory().getCurrentSession();
		//2 begin Transaction
		Transaction tx=session.beginTransaction();
		
		try {
			session.persist(p);
			tx.commit();
			msg="Product added";
		}catch(RuntimeException e) {
			if(tx!=null) {
				tx.rollback();
				throw e;
			}
		}
		return msg;
	}

	@Override
	public Product getProductDetailsById(long productId) {
		// TODO Auto-generated method stub
		Product p=null;
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		try {
			String jpql="select p from Product p where productId=:id";
			p=session.createQuery(jpql,Product.class)
					.setParameter("id", productId)
					.getSingleResult();
			tx.commit();
		}catch(RuntimeException e) {
			if(tx!=null) {
				tx.rollback();
				
			}
			throw e;
		}
		return p;
	}

	@Override
	public List<Product> displayProduct() {
		List<Product> products=null;
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		String jpql="select p from Product p";
		
		try {
			
			products=session.createQuery(jpql,Product.class).getResultList();
			tx.commit();
		}catch(RuntimeException e) {
			if(tx!=null) {
				tx.commit();
			}
			throw e;
		}
		return products;
	}


}
