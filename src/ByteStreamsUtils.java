import com.google.common.io.ByteStreams;

public class ByteStreamsUtils {

    public static byte[] readFully(File file) throws Exception {
        return ByteStreams.readFully(file);
    }

    public static void write(byte[] bytes, File file) throws Exception {
        ByteStreams.write(bytes, file);
    }
}