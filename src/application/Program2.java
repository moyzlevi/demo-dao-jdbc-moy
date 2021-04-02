package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teste 1 ~~~~~~~ Insert FindById");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		System.out.println();
		
		
		System.out.println("Teste 2 ~~~~~~~ Department FindAll");
		List<Department> list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		System.out.println();
		
		System.out.println("Teste 3 ~~~~~~~ Department Delete");
		System.out.println("Insert Id:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Id deleted!");
		System.out.println();
		
		System.out.println("Teste 4 ~~~~~~~ Department Insert");
		dep = new Department(null, "Moka");
		departmentDao.insert(dep);
		System.out.println("Inserted! New Id: "+ dep.getId());
		System.out.println();
		
		System.out.println("Teste 5 ~~~~~~~ Department Update");
		System.out.println("Insert Id:");
		id = sc.nextInt();
		departmentDao.update(new Department(1, "Moka"));;
		System.out.println("Id deleted!");
		System.out.println("Update completed");
		System.out.println();
	}
}
