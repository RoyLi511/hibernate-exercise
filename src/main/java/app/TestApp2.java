package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.member.dao.MemberDao;
import web.member.entity.Member;

public class TestApp2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberDao memberDao =applicationContext.getBean(MemberDao.class);
			
		for(Member member : memberDao.selectAll()) {
			System.out.println(member.getNickname());
		}
	}
}
