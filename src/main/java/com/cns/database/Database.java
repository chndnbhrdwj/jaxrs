package com.cns.database;

import java.util.HashMap;
import java.util.Map;

import com.cns.model.Message;
import com.cns.model.Profile;

public class Database {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
}
