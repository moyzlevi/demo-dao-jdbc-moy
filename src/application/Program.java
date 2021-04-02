package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import util.Util;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("~~~~Test1: seller findById ~~~~");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("~~~~Test2: seller findByDepartment ~~~~");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj :list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("~~~~Test2: seller findAll ~~~~");
		list = sellerDao.findAll();
		for(Seller obj :list) {
			System.out.println(obj);
		}
		System.out.println();
		

		System.out.println("~~~~Test4: seller insert ~~~~");
		Seller newSeller = new Seller(null, "Greg","greg@gmail.com",new Date(),4000.0, department);
		sellerDao.insert(newSeller);
		
		System.out.println("Inserted! New Id: "+ newSeller.getId());
		
		
	}

}
