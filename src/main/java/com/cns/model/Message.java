package com.cns.model;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement
public class Message {

    private Long id;
    private String message;
    private String author;
    private Date created;

    public Message(Long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.author = author;
    }

}
