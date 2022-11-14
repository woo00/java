package day24.stream;
import java.io.*;
public class Test06 {
/*
	현재 폴더에서 확장자가 txt인 파일들의 리스트를 추출해보자
 */
	public Test06() {
//		목록을 보고싶은 파일 객체 생성
		File file = new File("src/day24/stream");
		
		/*
//		리스트출력
		String[] list = file.list();
		for(String s : list) {
			System.out.println(s);
		}
		*/
		
		/*
		File[] list = file.listFiles();
		
		for(File f : list) {
			String fileName = f.getName();
			long len = f.length();
			
			System.out.println(fileName + " - " + len + "byte");
		}
		*/
//		확장자가 txt인 파일들 추출
		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				/*
			 	매개변수
			 		File dir	: 현재 파일의 정보를 알려줌
			 		String name : 현재 파일의 이름을 알려줌
			 		
		 		이 함수는 자동호출됨 
		 		목록을 구하는 파일을 하나씩 발견 할 때 마다 이 함수가 호출됨
		 		이 함수에서 true를 반환하면 목록에 포함시키고 false를 반환하면 포함시키지않는다.
				 */
				//직접 꺼내는 방법
				/*
				String ext = name.substring(name.lastIndexOf(".") + 1);
				return ext.equals("txt");
				*/
				return name.endsWith("txt");
			}
		});
//		출력
		for(String s : list) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test06();
		
		String name = "asdklnwelkwmlfkmdlsdfskdlf";
		System.out.println(name.endsWith("dlfsd"));
	}

}
