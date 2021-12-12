package com.sos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> HTML파일을 응답한다 @Controller

//사용자가 요청 -> Data를 응답한다 = @RestController

@RestController
public class HttpControllerTest {
	//http://localhost:8080/http/get 
	@GetMapping("/http/get")
	public String getTest(Member m) {
		
		return "get 요청" +m.getId()+m.getUsername();  //select
	}
	
	@PostMapping("/http/post") 
	public String postTest(@RequestBody Member m) {
		return "post 요청;"+m.getId()+m.getUsername();
	}
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청"; // update
	}
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청"; //delete
	}
	
	private void pubil() {
		// TODO Auto-generated method stub

	}
	
}
