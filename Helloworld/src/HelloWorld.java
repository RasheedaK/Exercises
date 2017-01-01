class HelloWorld {
  static String hello(String name) {
    if (""==name||name!=null) {
      return "Hello, " + name + "!";
    }
    return "Hello, World!";
  }
}
