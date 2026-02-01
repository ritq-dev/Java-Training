package problems.thema6;

import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.Serializable;
import static org.junit.jupiter.api.Assertions.*;

public class Thema6ProblemsTest {

    @Test
    void testReadLines() throws Exception {
        Path p = Files.createTempFile("io-test", ".txt");
        Files.write(p, java.util.Arrays.asList("a","b","c"));
        java.util.List<String> lines = Thema6Problems.readLines(p);
        assertEquals(3, lines.size());
        System.out.println("✓ testReadLines");
    }

    static class S implements Serializable {
        private static final long serialVersionUID = 1L;
        int v;
        S(int v){this.v=v;}
    }

    @Test
    void testDeepCopySerializable() throws Exception {
        S s = new S(5);
        S copy = (S) Thema6Problems.deepCopySerializable(s);
        assertNotSame(s, copy);
        assertEquals(s.v, copy.v);
        System.out.println("✓ testDeepCopySerializable");
    }

    @Test
    void testCopyFile() throws Exception {
        Path src = Files.createTempFile("src","txt");
        Path dest = Files.createTempFile("dest","txt");
        Files.write(src, java.util.Arrays.asList("x","y"));
        Thema6Problems.copyFile(src, dest);
        java.util.List<String> lines = Files.readAllLines(dest);
        assertTrue(lines.contains("x"));
        System.out.println("✓ testCopyFile");
    }
}
