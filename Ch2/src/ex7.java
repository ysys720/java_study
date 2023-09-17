public class ex7 {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;//유니코드를 직접 입력

        char c3 = '가';
        char c4 = 44032;//유니코드를 직접 입력

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }

}
/**char변수 뒤에는 ''를 붙일땐 공백을 만들어서 ' ' 공백유니코드(32)가 들어가게 한다.**/