package com.joeunseo.hotel.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-16
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
// 기능: 회원검색
public class PersonStream {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Person {
        private String name, ssn;

        private boolean genderChek(String ssnGenderPos){
            return ssn.substring(7,8).equals(ssnGenderPos);
        }
        /**   @Override
        public String toString() {
            String gender =(getGenderChecker("1")||getGenderChecker("3"))? "남자" :"여자";
            int year = Integer.parseInt(ssn.substring(0,2));
            if(getGenderChecker("1")){year+= 1900;}
            else if(getGenderChecker("2")){year+= 1900;}
            else {year+= 2000;}
            String age = String.valueOf(2022-year+1);  // 1의 의미는 한국나이로 태어나면 1살부터 시작

            return String.format("이름 : %s 성별 : %s 나이 : %s", name, gender, age);
        }*/
        @Override
        public String toString() {
          String s = ssn.substring(7);
            int age = Integer.parseInt(ssn.substring(0,2));
            int ages = Integer.parseInt(ssn.substring(7));
            String gender = (s.equals("1") || s.equals("3") ? "남자" : "여자");
            if (ages == 1 || ages ==2){
                ages = (122 -age)%100;
            }else {
                ages = (22 -age);
            }
            return String.format("이름 : %s 성별 : %s 나이 : %s", name, gender, ages);
//            if(gender.equals("1") || gender.equals("3")) {
//                gender = "남자";
//            } else {
//                gender = "여자";
//            }
//            return String.format("이름 : %s 성별 : %s", name, gender);

        }

    }

    @FunctionalInterface interface PersonService{
        Person search(List<Person> person);
    }


/** 위의 코드를 실행하는 예제 소스
    @Test
    void personStreamTest(){
        // 홍길동, 900120-1  김유신, 970602-1 유관순, 040920-4 남성, 여성 판단 로직
        List<Person> person = Arrays.asList(
                Person.builder().name("김윤섭").ssn("980211-1").build(),
                Person.builder().name("홍길동").ssn("000120-3").build(),
                Person.builder().name("김유신").ssn("970602-1").build(),
                Person.builder().name("유관순").ssn("040920-4").build()
        );
        PersonService ps = persons -> persons
                .stream()
                .filter(e->e.getName().equals("홍길동"))
                .collect(Collectors.toList()).get(0);
        System.out.println(ps.search(person));
    }
         */

    
}