package answers.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IOProblemsAnswer {

    public static List<String> readLines(Path path) throws Exception {
        return Files.readAllLines(path);
    }

    public static Object deepCopySerializable(Serializable obj) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(obj);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            return ois.readObject();
        }
    }

    public static void copyFile(Path src, Path dest) throws Exception {
        try (InputStream in = Files.newInputStream(src);
             OutputStream out = Files.newOutputStream(dest)) {
            byte[] buf = new byte[8192];
            int r;
            while ((r = in.read(buf)) != -1) out.write(buf,0,r);
        }
    }
}
