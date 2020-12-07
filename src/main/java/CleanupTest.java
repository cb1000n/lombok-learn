import lombok.Cleanup;

import java.io.*;

/**
 * ClassName CleanupTest
 * Description TODO 类描述
 *
 * @author ZhangRenjie
 * Date  2020/12/7 16:45
 */
public class CleanupTest {


    public void test() throws IOException {
        @Cleanup InputStream in = new FileInputStream("filepath");
        @Cleanup OutputStream out = new FileOutputStream("path2");
        byte[] bytes = new byte[1000];
        while (true) {
            int r = in.read(bytes);
            if (r == -1) {
                break;
            }
            out.write(bytes, 0, r);
        }
    }

}