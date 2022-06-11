package myspring.yyy.service;

import myspring.yyy.dto.Info;
import org.springframework.stereotype.Service;

@Service
//서비스어노테이션을 통해 컨트롤러에 반환되는 비지니스로직임을 명시.
//requestBody 실질적으로 들어가게 되는 결과를 만드는 곳.
public class TestService {

    public String myName(String name){
        if(name != null){
            return "my name is "+name;
        }else{
            return "no name param";
        }
    }
    public String myAge(Integer age){
        if(age!=null)
            return "my age is"+age;
        else
            return "no age param";
    }

    public String myInfo(Info info){
        return myName(info.getName())+" / "+myAge(info.getAge());
    }
}
