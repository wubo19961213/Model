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
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66

            if(!f.getParentFile().exists())
            {
            	f.getParentFile().mkdirs();
            	f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(f);
            byte []a = {'2','4','1'};
            fos.write(a);
            //创建基于文件的输入流
            FileInputStream fis =new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all =new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b : all) {
                //打印出来是65 66
                System.out.println(b);
            }
             
            //每次使用完流，都应该进行关闭
            fis.close();
              
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
