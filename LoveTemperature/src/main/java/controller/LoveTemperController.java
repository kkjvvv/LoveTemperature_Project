package controller;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.service.LoveTemperService;
import model.vo.person.MemberVO;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import util.MultiFileVO;

public class LoveTemperController extends MultiActionController{

	private LoveTemperService loveTemperService;
	private String path;

	public void setPath(String path) {
		this.path = path;
	}

	public void setLoveTemperService(LoveTemperService loveTemperService) {
		this.loveTemperService = loveTemperService;
	}
	
	public ModelAndView registerMember(HttpServletRequest request, HttpServletResponse response, 
			MultiFileVO vo) throws Exception{
		
		String mem_id = request.getParameter("mem_id");
		String mem_password = request.getParameter("mem_password");
		String mem_name = request.getParameter("mem_name");
		String mem_email = request.getParameter("mem_email");
		String mem_gender = request.getParameter("mem_gender");
		String mem_bloodType = request.getParameter("mem_bloodType");
		String mem_job = request.getParameter("mem_job");
		String mem_favorPlace = request.getParameter("mem_favorPlace");
		String mem_coupleDayStr = request.getParameter("mem_coupleDay"); //date로 바꿔야줘야함
		DateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date mem_coupleDay = sdFormat.parse(mem_coupleDayStr);
		String mem_passQuestion  = request.getParameter("mem_passQuestion");

		String mem_passAnswer = request.getParameter("mem_passAnswer");
		String mem_profileImg =  path+mem_id;

		String mem_style = request.getParameter("mem_style");

		
		int mem_recommendCount = 0;
		int mem_point = 0;
		int mem_heart = 3;
		int mem_temperature = 0;
		
		MemberVO pvo = new MemberVO(mem_id, mem_password, mem_name, mem_email, mem_gender, 
				mem_bloodType, mem_job, mem_favorPlace, mem_coupleDay, mem_passQuestion, 
				mem_passAnswer, mem_profileImg, mem_style, mem_recommendCount, mem_point, 
				mem_heart, mem_temperature);
		List<MultipartFile> files = vo.getMem_profileImg();	
	
		//2. 파일의 사이즈, 파일의 이름, ..그리고 특정한 upload 경로로 파일을 transfer 시킴.
		for(int i=0 ; i<files.size() ; i++){
			String filename = files.get(i).getOriginalFilename();
			System.out.println("파일의 이름 :: "+filename);
			files.get(i).transferTo(new File(path+mem_id+".jpg"));
			}
	
		loveTemperService.registerMember(pvo);
		return new ModelAndView("Member_register_result","mvo",pvo);
	}
	
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, 
			HttpSession session,MemberVO pvo) throws Exception{
		String path = "login_fail";
		
		MemberVO rvo=loveTemperService.login(pvo);
		System.out.println(rvo);
		if(rvo != null){
			//중요!!
			session.setAttribute("mvo", rvo);
			path = "main";
		}
		return new ModelAndView("/view/"+path); //이미 위에서 바인딩은 됬다.
	}
	
	
	
}
