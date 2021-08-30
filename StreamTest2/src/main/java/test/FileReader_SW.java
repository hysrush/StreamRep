package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_SW {
	  public static void main(String[] args)
	    {    
	     
	        //  File ��ü�� sw_file ���� 
	        File sw_file = new File("SWTest");
	        try
	        {    
	            // File ��ü�� �����Ͽ� �Ű������� �Ѱ���
	            FileReader sw_reader = new FileReader(sw_file);
	            
	            // char_array �迭(Buffer)�� 64ũ��� ����
	            char[] char_array = new char[64];
	            
	            // sw_reader.read(char[] buf , offset , len);
	            sw_reader.read(char_array, 0, char_array.length);
	            // 0(offset) : ������ ������ ���� ��ġ
	            // char_array.length(len) : �������� ���� �� ���ڿ��� �о�ö� ���ڸ� char_array�� ũ�⸸ŭ �о�´ٴ� �ǹ�
	                
	            System.out.println(String.valueOf(char_array).trim());
	            // String.valueOf() : ���ڿ��� ����ȯ �ϴ� �޼ҵ�
	            // trim() : ���� ���ڿ����� ��� ��ĭ(����)�� �������ִ� �޼ҵ�
	            
	            sw_reader.close(); // FileReader ��ü�� �� Ȱ���ϸ� �ݵ�� �ݾ���� �Ѵ�
	                               // ���� ���� �ʰ� ���α׷��� �����ϰ� �Ǹ� ���Ͽ� �����Ͱ� �� �������⵵ ���� �ս��� �Ͼ�� �ִ�.
	        }
	        catch(FileNotFoundException e) // FileReader Ŭ���� ��ü�� �����Ҷ� ���־�� �ϴ� ����ó���ν� �ش��ο� ������ ������ �߻��ϴ� ����
	        {
	            e.printStackTrace();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	    } 
}
