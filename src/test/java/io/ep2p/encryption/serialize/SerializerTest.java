package io.ep2p.encryption.serialize;

import io.ep2p.encryption.helper.Serializer;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SerializerTest {
    @Test
    public void serializeTest() throws IOException, ClassNotFoundException {
        Serializer<String> stringSerializer = new Serializer<>();
        byte[] bytes = stringSerializer.serialize("Hello");
        String deserialize = stringSerializer.deserialize(bytes);
        assertEquals("Hello", deserialize);
    }
}
