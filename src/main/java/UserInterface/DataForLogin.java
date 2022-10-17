package UserInterface;

import java.util.HashMap;

public class DataForLogin {

    private static final HashMap<String, String> logInfo = new HashMap<>();

    public DataForLogin() {

        logInfo.put("John", "prefer1");
    }

    public HashMap getLoginInfo() {
        return logInfo;
    }
}
