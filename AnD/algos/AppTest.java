package AnD.algos;

import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {
  @Test
  public void testMain() {
    // Umleiten der Standardausgabe
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    // Aufrufen der main-Methode
    App.main(new String[0]);

    // Überprüfen der Ausgabe
    Assert.assertEquals("Hello World!\n", outContent.toString());

    // Wiederherstellen der Standardausgabe
    System.setOut(System.out);
  }
}