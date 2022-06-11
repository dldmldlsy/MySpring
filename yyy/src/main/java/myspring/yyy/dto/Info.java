package myspring.yyy.dto;

import lombok.Data;

@Data //lombok에서 제공하는 어노테이션: 게터 세터를 생성해줌.
//이 어노테이션 안쓰면 우리가 게터세터코드써야하는 차이가 있는 건가??
public class Info {
    String name;
    Integer age;
}
