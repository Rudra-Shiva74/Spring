package spring.orm;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.orm.dao.StudentDao;
import spring.orm.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao st = context.getBean(StudentDao.class);
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String choice = "";
		String name = "";
		String city = "";
		int id = 0;
		while (flag) {
			System.out.println("1) For Ensert User");
			System.out.println("2) For Update User");
			System.out.println("3) For Delete User");
			System.out.println("4) For Show One User");
			System.out.println("5) For Show All  User");
			System.out.println("0) For Stop The Program");
			System.out.println("Enter Your Choice");
			choice = sc.nextLine();
			switch (choice) {
			case "1":
				System.out.println("Enter Your Name : ");
				name = sc.nextLine();
				System.out.println("Enter Your City : ");
				city = sc.nextLine();
				st.insert(new Student(name, city));
				break;
			case "2":

				System.out.println("Enter Your Name : ");
				name = sc.nextLine();
				System.out.println("Enter Your City : ");
				city = sc.nextLine();
				st.update(new Student(name, city));
				break;
			case "0":
				flag = false;
			default:
				System.out.println("Envalid Option!");
				break;
			}

		}
	}
}
