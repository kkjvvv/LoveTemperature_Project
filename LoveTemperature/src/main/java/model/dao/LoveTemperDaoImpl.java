package model.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import model.vo.couplelook.CoupleLookLogVO;
import model.vo.couplelook.CoupleLookVO;
import model.vo.datePlace.DatePlaceVO;
import model.vo.person.MemberVO;

public class LoveTemperDaoImpl implements LoveTemperDao {

	private SqlSessionTemplate sqlSession;
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int registerMember(MemberVO pvo) throws SQLException{
		int result = sqlSession.insert("Member.registerMember",pvo);
		System.out.println(result+" Row INSERT SUCCESS! Member Register~");
		return result;
	}

	@Override
	public MemberVO login(MemberVO pvo) throws SQLException{
		return (MemberVO)sqlSession.selectOne("Member.login",pvo);
	}

	@Override
	public int updateMember(MemberVO pvo) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO getMemberById(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DatePlaceVO> recommendDateCourse(String mem_id,
			String dp_location) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CoupleLookVO recommendCoupleLook(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoupleLookLogVO> showRecommendCoupleLook(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showMyLoverDateType(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int showLoveTemperature(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date showLovePeriod(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCoupleLookSite(int dp_no) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int showRecommendCount(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkDuplicateId(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int registerMyloverDataType(String mem_id) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DatePlaceVO getDatePlace(String dp_category, String dp_location) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

}
