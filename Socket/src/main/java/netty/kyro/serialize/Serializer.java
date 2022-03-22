package netty.kyro.serialize;

public interface Serializer {
    byte[] serialize(Object obj);

    <T> T deserialize(byte[] bytes,Class<T> clazz);
}
