package com.cdac.tester;

import static com.cdac.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.ProductDao;
import com.cdac.dao.ProductDaoImpl;
import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.entities.Product;
import com.cdac.entities.User;
import com.cdac.entities.UserRole;

public class ProductAdd {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); 
				Scanner sc = new Scanner(System.in)) {
			// create dao instance
			ProductDao dao=new ProductDaoImpl();
			System.out.println("Enter product details - productName,  productDescription,  " + "manufacuteDate,  price,  quantity");
			// create user instance
			Product product = new Product(sc.next(), sc.next(), LocalDate.parse(sc.next()),sc.nextDouble(),sc.nextInt());
			//user - does it exist in heap ? YES - TRANSIENT
			//invoke dao's method
			System.out.println(dao.addProduct(product));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
