package com.ddellsperger;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersApiTest {

    @Test
    public void testNumberIsEqual() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        NumbersApiData data =
                mapper.readValue(new URL("http://numbersapi.com/1/date?json"),
                        NumbersApiData.class);
        System.out.println("=========================");
        System.out.println(data);
        System.out.println("=========================");
        assertEquals(data.getNumber(), 1);
    }
}
