package com.marondal.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.mybatis.bo.ReviewBO;
import com.marondal.spring.ex.mybatis.model.Review;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// 특정 id의 Review 데이터 가져오기
	@RequestMapping("/mybatis/ex01/1")
	@ResponseBody
	public Review review(
//			@RequestParam("id") int id
//			@RequestParam(value="id", required=true) int id
//			@RequestParam(value="id", required=false) Integer id  // 필수 항목이 아닌 파라미터 설정
			@RequestParam(value="id", defaultValue="3") int id
//			, @RequestParam("test") String test
			
			) {
		
		Review review = reviewBO.getReview(id);
		
		return review;
	}

}
