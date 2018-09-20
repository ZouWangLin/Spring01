package cn.itheima.test;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itheima.entity.School;
import cn.itheima.entity.Student;

class TestSpring {

	/**
	 * spring的第一个案例
	 */
	@Test
	void test1() {
		//1.创建IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从ioc容器中获取对象
		Student student = (Student) applicationContext.getBean("student");
		//3.测试结果
		System.out.println(student);
	}
	
	
	/**
	 * spring的第二个案例
	 */
	@Test
	void test2() {
		//1.创建IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从ioc容器中获取对象
		Student student = (Student) applicationContext.getBean("student2");
		//3.测试结果
		System.out.println(student);
	}
	
	/**
	 * spring的第三个案例
	 */
	@Test
	void test3() {
		//1.创建IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从ioc容器中获取对象
		Student student = (Student) applicationContext.getBean("student3");
		//3.测试结果
		System.out.println(student);
	}
	
	/**
	 * spring的第四个案例
	 */
	@Test
	void test4() {
		//1.创建IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从ioc容器中获取对象
		School school = (School) applicationContext.getBean("school");
		//3.验证结果
		System.out.println(school);
	}
	
	/**
	 * spring的第五个案例
	 */
	@Test
	void test5() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从ioc容器中获取对象
		School school = (School) applicationContext.getBean("school2");
		//3.验证结果
		System.out.println(school);
	}
	
	/**
	 * spring的第六个案例
	 */
	@Test
	void test6() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从ioc容器中获取对象
		Student student = (Student) applicationContext.getBean("student4");
		//3.验证结果
		System.out.println(student);
	}
	
	
	/**
	 * spring的第七个案例
	 */
	@Test
	void test7() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从ioc容器中获取对象
		Student student = (Student) applicationContext.getBean("student5");
		//3.验证结果
		System.out.println(student);
	}

}
