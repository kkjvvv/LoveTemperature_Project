package util;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/*
 * Multi file의 정보를 담는 VO
 * :: 폼의 이름이 필드 선언시 변수명으로 와야한다.!!
 */
public class MultiFileVO {
	private List<MultipartFile> mem_profileImg; // 변수명 중요

	public List<MultipartFile> getMem_profileImg() {
		return mem_profileImg;
	}

	public void setMem_profileImg(List<MultipartFile> mem_profileImg) {
		this.mem_profileImg = mem_profileImg;
	}

	
	
	
}
