package test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_SW {

	public static void main(String[] args) {
		 
        try
        {
            FileWriter sw_writer = new FileWriter("SWTEST");
            
            // ����
            char[] char_array = {'S','E','O','N','G','W','O','N'};
            
            sw_writer.write(char_array);
            // ��  ��> ����� SWTest ���Ͽ��� SEONGWON�� �Էµ��ִ�
            
            sw_writer.close(); // FileReader�� ���������� close() �޼ҵ�� �ݴ´�
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
