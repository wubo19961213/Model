package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			File a = new File("d:/1.txt");
			FileInputStream fIS = new FileInputStream(a);
			fIS.read();
		} catch (Exception e) {
			// TODO: handle exception
		}*/
        File f =new File(" 	");
		try {
            //׼���ļ�lol.txt���е�������AB����Ӧ��ASCII�ֱ���65 66

            if(!f.getParentFile().exists())
            {
            	f.getParentFile().mkdirs();
            	f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(f);
            byte []a = {'2','4','1'};
            fos.write(a);
            //���������ļ���������
            FileInputStream fis =new FileInputStream(f);
            //�����ֽ����飬�䳤�Ⱦ����ļ��ĳ���
            byte[] all =new byte[(int) f.length()];
            //���ֽ�������ʽ��ȡ�ļ���������
            fis.read(all);
            for (byte b : all) {
                //��ӡ������65 66
                System.out.println(b);
            }
             
            //ÿ��ʹ����������Ӧ�ý��йر�
            fis.close();
              
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
