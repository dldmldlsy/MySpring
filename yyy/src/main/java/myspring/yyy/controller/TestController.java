package myspring.yyy.controller;


import myspring.yyy.dto.Info;
import myspring.yyy.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//restapi 공부
@RestController
//@RequestMapping("/home")
public class TestController {

   private final TestService testService;    //컨트롤러에서 서비스객체 생성.

    //@Service와 동시에 빈으로 등록되어 컨트롤러에서 파라미터로 바로 받아 사용할 수 있음.
    public TestController(TestService testService){
        this.testService=testService;
    }

    @GetMapping("/get")
    ResponseEntity<?> getHelloWorld(@RequestParam(required = false)String name){
        return new ResponseEntity<>(testService.myName(name), HttpStatus.OK);
    }

    @PostMapping("/post/{age}")
    ResponseEntity<?> postHelloWorld(@PathVariable("age") Integer age){
        return new ResponseEntity<>(testService.myAge(age), HttpStatus.OK);
    }

    @PutMapping("/put")
    ResponseEntity<?> putHelloWorld(@RequestBody Info info){
        return new ResponseEntity<>(testService.myInfo(info), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    ResponseEntity<?> deleteHelloWorld(){
        return new ResponseEntity<>("Hello World By Delete Method",HttpStatus.OK);
    }
}
