package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



//바이트 형식의 데이터란?
// A)0 ~ 255까지의 데이터
// Why?) 1Byte의 크기가 8Bit이기 때문
public class FileOutputStream_SW {
	 public static void main(String[] args)
	    {
	        byte[] data = {-19,-108,-124,-20,-107,-116,-21,-86,-69,32,-20,-75,-100,-21,-118,-112,-21,-117,-104}; 
	        // 바이트 배열로 표시된 바이트 데이터를 표시하는데 이거에 대해서는 아래에 포스팅(Class EX2)을 참조할것
	        
	        try
	        {
	            // 시작 ㅡ> 바이트 데이터를 보기 좋게 하여 파일에 저장하기 위해 FileOutputStream 클래스 객체 생성
	            // FileOutputStream 클래스의 객체를 생성하는 방법은 FileWriter이랑 동일하다
	            FileOutputStream sw_output = new FileOutputStream("SWTest");
	            
	            sw_output.write(data);
	            // 끝 
	            
	            sw_output.close(); // 객체를 다 활용했다면 닫아주는건 필수
	        }
	        catch(FileNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	    }   


	
}
