package com.cns.resources.beans;

import jakarta.ws.rs.QueryParam;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageFilterBeans {

    private @QueryParam("year") int year;

}
