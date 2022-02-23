package com.ec.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.jackson.ObjectMapperCustomizer;
import javax.inject.Singleton;

@Singleton

public class mapper implements ObjectMapperCustomizer {

    @Override
    public void customize(ObjectMapper objectMapper){
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }
}
