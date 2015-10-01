package fictionbook.android.com.fictionbook;

import java.io.File;
import java.net.URL;

/**
 * Created by Moon on 9/30/2015.
 */
public class TestHelper {
    public static File getFileFromPath(Object obj, String fileName) {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        return new File(resource.getPath());
    }
}
