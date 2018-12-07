import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalConfig{

    private static final GlobalConfig INSTANCE = new GlobalConfig();

    private Properties properties = new Properties();

    private GlobalConfig(){
        InputStream in = getClass().getResourceAsStream("");
        try {
            properties.load(in);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException("加载配置信息失败");
        }
    }

    public static GlobalConfig getInstance(){
        return INSTANCE;
    }

    public Properties getProperties(){
        return properties;
    }
}
