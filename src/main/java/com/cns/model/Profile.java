package com.cns.model;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement
public class Profile {

    private Long id;
    private String profileName;
    private String firstName;
    private String lastName;
    private Date created;

    public Profile(Long id, String profileName, String firstName, String lastName) {
        this.id = id;
        this.profileName = profileName;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
