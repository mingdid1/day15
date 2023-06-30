package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass04 {
	public static void main(String[] args) throws Exception {
		
		File path = new File("C:\\0.핀테크 최민지\\test\\test.txt");
		
		FileOutputStream fos = new FileOutputStream(path);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 보조 스트림에 넣어뒀다가 flush 만나면 한번에 보내는 방식
		
		for (char ch ='0'; ch <='9'; ch++) {
			Thread.sleep(1000);
			//fos.write(ch);	// 하나씩 접근
			bos.write(ch);
		}
		bos.flush();
		bos.write('A');
		bos.flush();	// 내용 전송
		bos.write('B');
		bos.close();	// 내용 전송, 연결 통로 닫음
		
		
	}
}
