package headfirstpatterns.decorator.javaiosimpedecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    protected LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] bytes, int offset, int len) throws IOException {
        int result = super.read(bytes, offset, len);

        for (byte thisByte : bytes) {
            thisByte = (byte) Character.toLowerCase((char) thisByte);
        }

        return result;
    }
}
