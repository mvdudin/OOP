package Logger;

import java.io.FileInputStream;
import java.util.logging.Logger;
import java.util.logging.LogManager;

public class Log {
    static {try(FileInputStream in = new FileInputStream("log.config")){
                LogManager.getLogManager().readConfiguration(in);
            }
            catch (Exception e){
                e.printStackTrace();
            }
    }
    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}

