package oday02;

public class Ex11 {
	public static void main(String[] args) {
		/*
		 * 문제 9] 게시판에 게시글을 게시할 예정이다. 한페이지에 15개의 게시글을 게시할 수 있다. 게시글의 갯수를 랜덤하게 발생시켜서 필요한
		 * 게시판 페이지가 몇 페이지 인지를 출력해주는 프로그램을 작성하세요.
		 */
		// 1=15
		// 2=30

//	100/15= 6+1
//			1415

		
		 int boar =(int)(Math.random()*100+1);
		
		 int page=boar/15;
		 
		 System.out.println("게시글 수 : " + boar);
		 
		 if(boar % 15 >= 1){ 
			 System.out.println(page+1); 
		 }else if(boar % 15 <= 0){
			 System.out.println(page);
		 }
		 
	}
}
