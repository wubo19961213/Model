package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestStream_2 {
	public static void encodeFile(File encodingFile, File encodedFile_2)
	{
		
		
		try (FileReader	fR = new FileReader(encodingFile)){
			char []all = new char[(int)encodingFile.length()];
			fR.read(all);
			for(int i=0;i<all.length;i++)
			{
				if(all[i]=='9')
				{
					all[i] = '0';
				}
				else if (all[i]=='z') {
					all[i] = 'a';
				}
				else if (all[i]=='Z') {
					all[i] = 'A';
				}
				else {
					all[i] += 1;
				}
			}
			try (FileWriter 	fW = new FileWriter(encodedFile_2)){
				fW.write(all);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
