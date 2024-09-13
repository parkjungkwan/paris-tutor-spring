package com.joeunseo.hotel.stream;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NameStream {

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Builder
    static class Name{
        private String name;
    }
    interface NameService{
        Name search(List<Name> name);
    }

    static class NameServiceImpl implements NameService{

        @Override
        public Name search(List<Name> name) {
            return name.stream().filter(e->e.getName().equals("김윤섭")).collect(Collectors.toList()).get(0);
        }


    }

    /** 위의 코드를 실행하는 예제 소스

        @Test
        void nameSteamTest(){
            List<Name> name = Arrays.asList(
                    Name.builder().name("김윤섭").build(),
                    Name.builder().name("유재혁").build()
            );
            System.out.println(new NameServiceImpl().search(name));
        }
    } */

}
