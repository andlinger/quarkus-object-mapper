package io.i15s.quarkus.objectmapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.jackson.ObjectMapperCustomizer;
import org.zalando.jackson.datatype.money.MoneyModule;

import javax.inject.Singleton;

@Singleton
public class ObjectMapperConfiguration  implements ObjectMapperCustomizer {

    @Override
    public void customize(ObjectMapper objectMapper) {
        objectMapper.registerModule(new MoneyModule());
    }
}

