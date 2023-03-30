package org.webler.zsolt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPrinter {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void print(Object o) throws JsonProcessingException {
        System.out.println(MAPPER.writeValueAsString(o));
    }

}
