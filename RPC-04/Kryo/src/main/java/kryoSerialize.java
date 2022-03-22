import com.esotericsoftware.*;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.BeanSerializer;

public class kryoSerialize implements Serializer {
    private final ThreadLocal<Output> outputThreadLocal = new ThreadLocal<Output>();
    private final ThreadLocal<Input> inputThreadLocal = new ThreadLocal<Input>();
    private Class<?> clazz = null;

     final ThreadLocal<Kryo> kryoLocal = ThreadLocal.withInitial(()->{
        Kryo kryo = new Kryo();
         kryo.register(clazz, new BeanSerializer<>(kryo, clazz));
         return kryo;
    });

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public kryoSerialize(Class<?> clazz) {
        this.clazz = clazz;
    }

    private Kryo getKryo() {
        return kryoLocal.get();
    }

    private Output getOutput(byte[] bytes) {
        Output output = null;
        if((output = outputThreadLocal.get())==null){
            output = new Output();
            outputThreadLocal.set(output);
        }
        if (bytes != null) {
            output.setBuffer(bytes);
        }
        return output;

    }

    @Override
    public void serialize(Object obj, byte[] bytes) {
        Kryo kryo = getKryo();
        Output output =
    }

    @Override
    public void serialize(Object obj, byte[] bytes, int offset, int count) {

    }

    @Override
    public <T> T deserialize(byte[] bytes) {
        return null;
    }

    @Override
    public <T> T deserialize(byte[] bytes, int offset, int count) {
        return null;
    }
}
