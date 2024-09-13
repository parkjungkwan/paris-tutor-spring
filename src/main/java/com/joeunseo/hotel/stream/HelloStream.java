package com.joeunseo.hotel.stream;
import lombok.*;


import java.util.*;
import java.util.stream.Collectors;
public class HelloStream {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Hello {
        private String greeting, inLanguage;


        @Override
        public String toString(){
            return String.format( "인사 : %s, %s", inLanguage, greeting);
        }
    }

    interface HelloService {
        Set<Hello> great(List<Hello> arr);
        }
        static class HelloServiceImpl implements HelloService{
            @Override
            public  Set<Hello>  great(List<Hello> arr) {

                return arr
                        .stream()
                        .filter(e -> e.getInLanguage().equals("영어"))
                        .collect(Collectors.toSet());

            }
        }
 /** 위의 코드를 실행하는 예제 소스

        @Test
        void helloTest() {
            List<Hello> arr = Arrays.asList(
                    Hello.builder().inLanguage("영어").greeting("Hello").build(),
                Hello.builder().inLanguage("한국어").greeting("안녕").build()
            );
            new HelloServiceImpl()
                    .great(arr)
                    .forEach(System.out::println);
}
      */ 
    
}
