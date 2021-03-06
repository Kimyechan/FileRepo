package com.rubypaper.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DispatcherServlet() {
        System.out.println("===> DispatcherServlet 생성");
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 사용자 요청 path 정보를 추출한다.
		String uri = request.getRequestURI();
		System.out.println(uri);
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		// 2. 추출된 path에 따라 요청을 분기처리한다. 
		if(path.equals("/login.do")) {
			System.out.println("로그인 기능 처리");
		} else if(path.equals("/logout.do")) {
			System.out.println("로그아웃 기능 처리");
		} else if(path.equals("/insertBoard.do")) {
			System.out.println("게시 글 등록 기능 처리");
		} else if(path.equals("/updateBoard.do")) {
			System.out.println("게시 글 수정 기능 처리");
		} else if(path.equals("/deleteBoard.do")) {
			System.out.println("게시 글 삭제 기능 처리");
		} else if(path.equals("/getBoard.do")) {
			System.out.println("게시 글 상세 조횔 기능 처리");
		} else if(path.equals("/getBoardList.do")) {
			System.out.println("게시 글 목록 검색 기능 처리");
		} else {
			System.out.println("URL을 다시 확인해주시기 바랍니다.");
		}
	}

}
