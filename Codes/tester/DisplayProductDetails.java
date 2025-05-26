package com.cdac.tester;

import org.hibernate.SessionFactory;

import com.cdac.dao.ProductDao;
import com.cdac.dao.ProductDaoImpl;
import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;

import static com.cdac.utils.HibernateUtils.*;

import java.util.Scanner;

public class DisplayProductDetails {

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory();
				Scanner sc=new Scanner(System.in)){
			ProductDao dao=new ProductDaoImpl();
			// invoke dao's method
			System.out.println("All Products - ");
			dao.displayProduct().forEach(u -> System.out.println(u));//Sy
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
