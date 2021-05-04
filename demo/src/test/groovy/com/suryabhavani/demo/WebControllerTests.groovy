package com.suryabhavani.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@AutoConfigureMockMvc
@WebMvcTest
class WebControllerTests extends Specification {
	
	@Autowired
	private MockMvc mvc
	
	def"WebController"() {
		expect:"Status is 200 and the response is 'WELCOME!!' "
		mvc.perform(get("/hai"))
		.andExpect(status().isOk())
		.andReturn()
		.response
		.contentAsString =="WELCOME!!"
	} 
	
}