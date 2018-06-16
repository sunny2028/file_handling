package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Handling {
	public static void main(String [] args)throws IOException
	{try {
		File f=new File("src/file_handling/abc.txt");
		if(!f.exists())
		f.createNewFile();
		FileReader fr=new FileReader(f);
		int current=fr.read();
		while(current!=-1)
		{
			System.out.print((char)current+"");
			current=fr.read();
		}
		
		fr.close();
	}
	catch(Exception e)
	{
		System.out.println(e.getStackTrace());
	}
	}

	}
