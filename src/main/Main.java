package main;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Student;

public class Main 
{

	public static void main(String[] args) 
	{
		testSqlSessionTemplate();
	}

	public static void testSqlSessionTemplate() 
	{
		//spring-config.xml����������д�Ƿ���src�ļ������棬���ǹ����ļ������棡�������Ǻ�src��ͬһ��Ŀ¼�£�
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		SqlSessionTemplate sqlSessionTemplate = ctx.getBean(SqlSessionTemplate.class);
		Student student = new Student();
		
		student = sqlSessionTemplate.selectOne("mapper.StudentMapper.selectStudentById", 1);
		
		System.out.print(student);
		
	}
}
