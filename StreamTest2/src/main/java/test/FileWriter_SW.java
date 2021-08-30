package test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_SW {

	public static void main(String[] args) {
		 
        try
        {
            FileWriter sw_writer = new FileWriter("SWTEST");
            
            // 시작
            char[] char_array = {'S','E','O','N','G','W','O','N'};
            
            sw_writer.write(char_array);
            // 끝  ㅡ> 실행시 SWTest 파일에는 SEONGWON이 입력되있다
            
            sw_writer.close(); // FileReader와 마찬가지로 close() 메소드로 닫는다
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
