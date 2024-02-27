package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data();

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        // 참조값 자체를 final 로 부여했기 때문에
        // 참조값 내의 필드값은 final 이 아니라서 값 변경 가능
    }
}
