package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass03 {
	public static void main(String[] args) throws Exception {
		
		File path = new File("C:\\0.핀테크 최민지\\test\\test.txt");
		
		// true : 파일이 없으면 새롭게 만들고, 기존에 파일이 있으면
		// 		  기존파일의 내용 뒤에 이어써준다 append기능
		FileOutputStream fos = new FileOutputStream(path, true);
		fos.write("test".getBytes());
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		//System.out.println(fis.read());			// read : 한글자씩 가져옴
		//System.out.println((char)fis.read());

		while(true) {
			int res = fis.read();
			if(res < 0) {
				System.out.println("내용이 없습니다 : " + res);
				// file의 마지막 자리에는 -1이 항상 있다
				break;
			}
			System.out.println((char)res);
		}
		fis.close();
	}
}
