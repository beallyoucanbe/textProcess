import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaosy-c on 2017/8/21.
 */
public class readTextByLine {

    public void readByLine(String path) throws IOException {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            List<String> res = new ArrayList<String>();
            String str = null;
            //按行读取字符然后可以进行各种处理操作
            while((str = reader.readLine()) != null){
                   res.add(str);
            }
    }

    public void readBychar() throws IOException {
        File file1 = new File("C:/Users/zhaosy-c/Desktop/beforeProcess.txt");
        File file2 = new File("C:/Users/zhaosy-c/Desktop/afterprocedss.txt");
        //按照单个字符来读取文件
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        int ch = 0;
        //取出单个字符然后进行处理
        while((ch = fileReader.read()) != -1){
//			if ((char)ch == ':')
//				fileWriter.write("=>");
//			else if ((char)ch == ' ' || (char)ch == '\r'  || (char)ch == '\n')
            if ((char)ch == '{' || (char)ch == '}')
                continue;
            else if ((char)ch == ','){
                fileReader.read();
                fileReader.read();
            }
            else if ((char)ch == '/'){
                fileReader.read();
                fileReader.read();
                fileReader.read();
                fileReader.read();
                fileReader.read();
            }
            else
                fileWriter.write((char)ch);
        }
        fileWriter.flush();
        fileReader.close();
        fileWriter.close();

    }
}
