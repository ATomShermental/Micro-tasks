package org.example.singleton;

import java.util.Map;

public class DBConnection {
    private static Map<Long, DBConnection> instances;

    private DBConnection() {
        System.out.println("init connection");
    }

    public static DBConnection getInstance(Long threadID) {
        if (instances.containsKey(threadID) == false) {
            instances.put(threadID, new DBConnection());
        }
        return instances.get(threadID);
    }

    public static DBConnection getInstance() {
        var threadId = Thread.currentThread().getId();
        return getInstance(threadId);
    }
}
