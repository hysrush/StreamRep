package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_SW {
	  public static void main(String[] args)
	    {    
	     
	        //  File 객체인 sw_file 생성 
	        File sw_file = new File("SWTest");
	        try
	        {    
	            // File 객체를 생성하여 매개변수로 넘겨줌
	            FileReader sw_reader = new FileReader(sw_file);
	            
	            // char_array 배열(Buffer)을 64크기로 선언
	            char[] char_array = new char[64];
	            
	            // sw_reader.read(char[] buf , offset , len);
	            sw_reader.read(char_array, 0, char_array.length);
	            // 0(offset) : 씌여질 버퍼의 시작 위치
	            // char_array.length(len) : 데이터의 길이 즉 문자열을 읽어올때 문자를 char_array의 크기만큼 읽어온다는 의미
	                
	            System.out.println(String.valueOf(char_array).trim());
	            // String.valueOf() : 문자열로 형변환 하는 메소드
	            // trim() : 현재 문자열에서 모든 빈칸(띄어쓰기)를 삭제해주는 메소드
	            
	            sw_reader.close(); // FileReader 객체를 다 활용하면 반드시 닫아줘야 한다
	                               // 만약 닫지 않고 프로그램을 종료하게 되면 파일에 데이터가 다 씌여지기도 전에 손실이 일어날수 있다.
	        }
	        catch(FileNotFoundException e) // FileReader 클래스 객체를 생성할때 해주어야 하는 에외처리로써 해당경로에 파일이 없을때 발생하는 예외
	        {
	            e.printStackTrace();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
		catch(Exception e)
		{
			
		}
	    } 
}
