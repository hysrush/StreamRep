package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_SW {

	public static void main(String[] args) {
		 byte[] data = new byte[64];
	        
	        try
	        {
	            FileInputStream sw_input = new FileInputStream("SWTest");
	            sw_input.read(data);
	            // 파일에서 읽어 오면 그 읽어온 데이터를 받을 버퍼를 준비해야 한다
	            // 그 이후 FileInputStream 클래스에서는 "read()"라는 메소드를 제공하는데
	            // 이 메소드를 사용하면 매개변수로 넘겨주는 버퍼에다가 데이터를 담아서 넘겨준다
	            // ps. sw_input 객체 생성방법은 FileReader랑 동일하다
	            
	            sw_input.close();
	        }
	        catch(FileNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	        
	        for(int i = 0; i < data.length; ++i)
	        {
	            if(data[i] == 0)
	            {
	                break;
	            }
	            
	            System.out.println(data[i] + ".");
	        }
	}

}
