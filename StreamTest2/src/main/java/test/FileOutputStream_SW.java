package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



//����Ʈ ������ �����Ͷ�?
// A)0 ~ 255������ ������
// Why?) 1Byte�� ũ�Ⱑ 8Bit�̱� ����
public class FileOutputStream_SW {
	 public static void main(String[] args)
	    {
	        byte[] data = {-19,-108,-124,-20,-107,-116,-21,-86,-69,32,-20,-75,-100,-21,-118,-112,-21,-117,-104}; 
	        // ����Ʈ �迭�� ǥ�õ� ����Ʈ �����͸� ǥ���ϴµ� �̰ſ� ���ؼ��� �Ʒ��� ������(Class EX2)�� �����Ұ�
	        
	        try
	        {
	            // ���� ��> ����Ʈ �����͸� ���� ���� �Ͽ� ���Ͽ� �����ϱ� ���� FileOutputStream Ŭ���� ��ü ����
	            // FileOutputStream Ŭ������ ��ü�� �����ϴ� ����� FileWriter�̶� �����ϴ�
	            FileOutputStream sw_output = new FileOutputStream("SWTest");
	            
	            sw_output.write(data);
	            // �� 
	            
	            sw_output.close(); // ��ü�� �� Ȱ���ߴٸ� �ݾ��ִ°� �ʼ�
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
