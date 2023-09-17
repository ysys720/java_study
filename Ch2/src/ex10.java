public class ex10 {

    public static void main(String[] args) {
        String str1 =
            "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";

        String str2 =
            "{\n" +
                "   \"id\":\"winter\",\n" +
                "   \"name\":\"눈송이\"\n" +
                "}";

        System.out.println(str1);
        System.out.println("------------------------------");
        System.out.println(str2);
        System.out.println("------------------------------");

        String str =
            "나는 자바를 \n" +
                "학습합니다.\n" +
                "나는 자바 고수가 될 겁니다.";

        System.out.println(str);
    }
}

/*
  public class ex10 {
  <p>
  public static void main(String[] args) { String str1 = "" + "{\n" + "\t\"id\":\"winter\",\n" +
  "\t\"name\":\"눈송이\"\n" + "}";
  <p>
  String str2 = """ { "id":"winter", "name":"눈송이" } """;
  <p>
  System.out.println(str1); System.out.println("------------------------------");
  System.out.println(str2); System.out.println("------------------------------");
  <p>
  String str = """ 나는 자바를 \ 학습합니다. 나는 자바 고수가 될 겁니다. """; System.out.println(str); } }
  <p>
  //오류가 뜨는 이유는 jdk 버전이 8이라서 """ 텍스트 블록이 지원하지 않는다.
 */