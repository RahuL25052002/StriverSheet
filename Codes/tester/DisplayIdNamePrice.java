package com.cdac.tester;

import static com.cdac.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.ProductDao;
import com.cdac.dao.ProductDaoImpl;
import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.entities.User;
import com.cdac.entities.UserRole;

public class DisplayIdNamePrice {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); //DBCP 
				Scanner sc = new Scanner(System.in)) {
			// create dao instance
			ProductDao dao = new ProductDaoImpl();
			System.out.println("Enter products date");//auto boxing (prim -> wrapper)
			//invoke dao's method
			dao.getProductIdNamePriceByDate(LocalDate.parse(sc.next()))
			.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getPrice()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
