public interface Serializer {

    public void serialize(Object obj, byte[] bytes);

    public void serialize(Object obj, byte[] bytes, int offset, int count);

    public <T> T deserialize(byte[] bytes);

    public <T> T deserialize(byte[] bytes, int offset, int count);
}
