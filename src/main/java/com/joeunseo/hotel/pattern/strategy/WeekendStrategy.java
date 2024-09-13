package com.joeunseo.hotel.pattern.strategy;


import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public enum WeekendStrategy {
    Monday("1",i->"Monday"),
    Tuesday("2",i->"Tuesday"),
    Wednesday("3",i->"Wednesday"),
    Thursday("4",i->"Thursday"),
    Friday("5",i->"Friday"),
    Saturday("6",i->"Saturday"),
    Sunday("7",i->"Sunday"),
    EXIT("x",i->"exit"),
    ;
    private final String name;
    private final Function<String,String>function;

    WeekendStrategy(String name, Function<String, String> function) {
        this.name = name;
        this.function = function;
    }

    public static String execute(Scanner sc) {
        System.out.println("1~7 입력: ");
        String msg = sc.next();
        return Stream.of(values())
                .filter(i->i.name.equals(msg))
                .findAny()
                .orElseGet(()->EXIT)
                .function.apply(msg);
    }
     /** 위의 코드를 실행하는 예제 소스
      * 
      @Test
      public static void main() {
            Scanner sc = new Scanner(System.in);
            //execute(sc);
            String day = WeekendStrategy.execute(sc);
            System.out.println("전략의 결과: "+day);
        }


      */
}
