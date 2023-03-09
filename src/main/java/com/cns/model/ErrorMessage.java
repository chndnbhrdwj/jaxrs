package com.cns.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@XmlRootElement
public class ErrorMessage {

    private String errorMessage;
    private int errorCode;
    private String documentation;
}
