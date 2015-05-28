package model.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.vo.couplelook.CoupleLookLogVO;
import model.vo.couplelook.CoupleLookVO;
import model.vo.datePlace.DatePlaceVO;
import model.vo.person.MemberVO;

public interface LoveTemperDao {

	/*
	 * 나 : U03,04,08,09,13
	 * 김광중 : U01,07,24, S03, S10
	 * 주혁중 : U05,06,10,11,12, S09
	 */

	//U01 : 회원가입
	public int registerMember(MemberVO pvo) throws SQLException;

	
	//U03 : 로그인
	public MemberVO login(MemberVO pvo) throws SQLException;
	
	//U04 : 회원정보 수정
	public int updateMember(MemberVO pvo) throws SQLException;
	
	//U05 : 회원탈퇴
	public int deleteMember(String mem_id) throws SQLException;
	
	//U06 : 회원의 아이디로 회원의 정보 얻기
	public MemberVO getMemberById(String mem_id) throws SQLException;
	
	//U07 : 데이트코스 추천받기
	public List<DatePlaceVO> recommendDateCourse(String mem_id,String dp_location) throws SQLException;
	
	//U08 : 커플룩 추천받기
	public CoupleLookVO recommendCoupleLook(String mem_id) throws SQLException;
	
	//U09 : 추천받은 커플룩 목록 보기
	public List<CoupleLookLogVO> showRecommendCoupleLook(String mem_id) throws SQLException;
	
	//U10 : 나의 연인 성향분석 결과 보기
	public String showMyLoverDateType(String mem_id) throws SQLException;

	//U11 : 연애 온도 지수 확인
	public int showLoveTemperature(String mem_id) throws SQLException;
	
	//U12 : 교제 기간 확인 
	public Date showLovePeriod(String mem_id) throws SQLException;
	
	//U13 : 선택한 커플룩 사이트 얻기
	public String getCoupleLookSite(int dp_no) throws SQLException;
	
	//U24 : 데이트 코스 & 커플룩 추천일수를 표시
	public int showRecommendCount(String mem_id) throws SQLException;
	
	/*	
 		일단보류
		//S01 : 데이트 장소 중복 추천 방지
		public boolean checkDuplicateDatePlace();
	*/
	
	//S03 : 아이디 중복 체크
	public boolean checkDuplicateId(String mem_id) throws SQLException;
	
	//S09 : 나의 연인의 유형 도출후 등록
	public int registerMyloverDataType(String mem_id) throws SQLException;
	
	//S10 : 유형과 지역에 적합한 데이트 장소 얻어내기
	public DatePlaceVO getDatePlace(String dp_category, String dp_location) throws SQLException;
}
