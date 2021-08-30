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
	            // ���Ͽ��� �о� ���� �� �о�� �����͸� ���� ���۸� �غ��ؾ� �Ѵ�
	            // �� ���� FileInputStream Ŭ���������� "read()"��� �޼ҵ带 �����ϴµ�
	            // �� �޼ҵ带 ����ϸ� �Ű������� �Ѱ��ִ� ���ۿ��ٰ� �����͸� ��Ƽ� �Ѱ��ش�
	            // ps. sw_input ��ü ��������� FileReader�� �����ϴ�
	            
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
