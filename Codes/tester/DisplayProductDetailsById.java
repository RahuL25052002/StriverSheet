package com.cdac.tester;

import org.hibernate.SessionFactory;

import com.cdac.dao.ProductDao;
import com.cdac.dao.ProductDaoImpl;

import static com.cdac.utils.HibernateUtils.*;

import java.util.Scanner;
public class DisplayProductDetailsById {

	public static void main(String[] args) {
		
		try(SessionFactory sf=getFactory();
				Scanner sc=new Scanner(System.in)){
			ProductDao dao=new ProductDaoImpl();
			System.out.println("Enter Product id: ");
			System.out.println(dao.getProductDetailsById(sc.nextLong()));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
