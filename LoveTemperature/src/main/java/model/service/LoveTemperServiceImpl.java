package model.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.dao.LoveTemperDao;
import model.vo.couplelook.CoupleLookLogVO;
import model.vo.couplelook.CoupleLookVO;
import model.vo.datePlace.DatePlaceVO;
import model.vo.person.MemberVO;

public class LoveTemperServiceImpl implements LoveTemperService{

	private LoveTemperDao loveTemperDao;
	
	public void setLoveTemperDao(LoveTemperDao loveTemperDao) {
		this.loveTemperDao = loveTemperDao;
	}

	@Override
	public void registerMember(MemberVO pvo) throws SQLException{
		loveTemperDao.registerMember(pvo);
	}

	@Override
	public MemberVO login(MemberVO pvo) throws SQLException{
		return loveTemperDao.login(pvo);
	}

	@Override
	public int updateMember(MemberVO pvo) throws SQLException{

		return 0;
	}

	@Override
	public int deleteMember(String mem_id) throws SQLException{

		return 0;
	}

	@Override
	public MemberVO getMemberById(String mem_id) throws SQLException{

		return null;
	}

	@Override
	public List<DatePlaceVO> recommendDateCourse(String mem_id,
			String dp_location) throws SQLException{

		return null;
	}

	@Override
	public CoupleLookVO recommendCoupleLook(String mem_id) throws SQLException{

		return null;
	}

	@Override
	public List<CoupleLookLogVO> showRecommendCoupleLook(String mem_id) throws SQLException{

		return null;
	}

	@Override
	public String showMyLoverDateType(String mem_id) throws SQLException{

		return null;
	}

	@Override
	public int showLoveTemperature(String mem_id) throws SQLException{
	
		return 0;
	}

	@Override
	public Date showLovePeriod(String mem_id) throws SQLException{

		return null;
	}

	@Override
	public String getCoupleLookSite(int dp_no) throws SQLException{

		return null;
	}

	@Override
	public int showRecommendCount(String mem_id) throws SQLException{

		return 0;
	}

	@Override
	public boolean checkDuplicateId(String mem_id) throws SQLException{

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
