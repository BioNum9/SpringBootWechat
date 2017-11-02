package com.maroon5mlj.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * Created by lovea on 2017/10/30.
 */
public class Data2Long extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator
                        , SerializerProvider serializerProvider) throws IOException
                        , JsonProcessingException {
        jsonGenerator.writeNumber(date.getTime()/1000);
    }
}
