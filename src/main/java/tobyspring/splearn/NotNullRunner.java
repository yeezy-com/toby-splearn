package tobyspring.splearn;

import org.springframework.lang.NonNull;

public class NotNullRunner {

    public static void main(String[] args) {
        // 1.
        print("Spring");

        // 2. null이 들어오는 상황을 근본적으로 해결할 수는 없다.
        //    Runtime에서만 해결 가능
        String name = null;
        print(name);

        // 3. null이 들어가는 경우 알려주지만, 빌드 자체는 문제가 없다.
        // 4. spotBugs plugin을 gradle 빌드에 추가하면 컴파일 타임에서 null 체크가 가능하다.
        String name2 = null;
        printNonNull(name2);
    }

    static void print(String name) {
        System.out.println(name);
    }

    static void printNonNull(@NonNull String name) {
        System.out.println(name);
    }
}
