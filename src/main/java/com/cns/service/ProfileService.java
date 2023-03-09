package com.cns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cns.database.Database;
import com.cns.model.Profile;

public class ProfileService {

    private Map<String, Profile> profiles = Database.getProfiles();

    public ProfileService() {
        profiles.put("ck", new Profile(1L, "ck", "Chandan", "Kumar"));
        profiles.put("rm", new Profile(1L, "rm", "Robert", "Munroe"));
    }

    public List<Profile> getAllProfiles() {
        return new ArrayList<Profile>(profiles.values());
    }

    public Profile getProfile(String profileName) {
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile) {
        profile.setId(Long.valueOf(profiles.size() + 1));
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile updateProfile(Profile profile) {
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile deleteProfile(String profileName) {
        return profiles.remove(profileName);
    }

}
