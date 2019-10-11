package scripts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCreator {
	public void createFile() throws IOException {
		String fileSeparator = System.getProperty("file.separator");
        
        //absolute file name with path
        String absoluteFilePath = "D:\\SMS8.1-2019\\test\\resources\\data\\test.java";
        
        		
        //fileSeparator+"SMS8.1-2019"+fileSeparator+"test"+fileSeparator+"resources"+fileSeparator+"data"+fileSeparator+"file.txt";
        //"D:\\SMS automation\\SMS8.1-2019\\test\\resources\\data"
       
        File file = new File(absoluteFilePath);
        if(file.createNewFile()){
            System.out.println(absoluteFilePath+" File Created");
        }
	}
	
	public void writeInFile(String data) throws IOException {
		String absoluteFilePath = "D:\\SMS8.1-2019\\test\\resources\\data\\test.java";
        FileOutputStream fos = new FileOutputStream(absoluteFilePath);
        fos.write(data.getBytes());
        fos.flush();
        fos.close();
	}
}

