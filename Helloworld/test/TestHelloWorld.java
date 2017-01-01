import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class TestHelloWorld {
  @Test
  public void helloNoName() {
    assertEquals("Hello, World!", HelloWorld.hello(null));
  }

  @Test
  public void helloSampleName() {
    assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
  }

  @Test
  public void helloAnotherSampleName() {
    assertEquals("Hello, Bob!", HelloWorld.hello("Bob"));
  }
}
