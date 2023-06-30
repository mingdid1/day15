package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		
		String path = "C:/0.핀테크 최민지/test/";		// \\ -> / 변경해서 사용가능
		//File path = new File("C:\\0.핀테크 최민지\\test\\test.txt");

		// exists() : 파일 존재여부 t/f로 출력
		//System.out.println( path.exists() );

		
		//File path = new File("C:\\0.핀테크 최민지\\test\\test12");
		// 파일명 뒤에 확장자가 적혀있지 않으면 아래처럼 사용가능
		//path.mkdir();
		//path.delete();

		//File path = new File("C:\\0.핀테크 최민지\\test");	// test 경로에 있는 리스트 보여줌
		//String[] list = path.list();
		//System.out.println(list[0]);

		System.out.println("파일명 입력");
		String name = input.next();
		path += name + ".txt";
		
		File filePath = new File(path);
		if ( filePath.exists()) {
			System.out.println("파일이 존재합니다.. 다시..");
		}else {
			FileOutputStream fos = new FileOutputStream(path);
			System.out.println("파일에 출력할 내용 입력");
			String msg = input.next();
			
			fos.write(msg.getBytes());
			System.out.println("저장되었습니다");
		}
		
		
		
		
	}
}
