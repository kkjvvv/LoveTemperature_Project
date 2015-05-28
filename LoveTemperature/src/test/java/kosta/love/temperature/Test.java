package kosta.love.temperature;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;

import model.vo.person.MemberVO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) throws IOException {
		  Reader r=Resources.getResourceAsReader("config/SqlMapConfig.xml");
	      
	      SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(r);
	      
	      SqlSession session = factory.openSession();
	
	      
	      //회원가입시 사진업로드를 해서 그 사진의url을 db에 insert 해줘야한다..!!
	      
	      
	      /*MemberVO mvo = new MemberVO("bbb","bbb","테스트1","test@kosta.com","남자","O형","학생","실내",new Date(),
	    		  "질문1","답1","이미지파일주소","시크",0,0,3,0);
	      int result = session.insert("Member.registerMember",mvo);
	      System.out.println(result);
	      session.commit();*/
	      
	      
	      
	      
	}

}
