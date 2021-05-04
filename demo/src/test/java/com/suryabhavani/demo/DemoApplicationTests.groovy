package com.suryabhavani.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import spock.lang.Specification;

@SpringBootTest
class DemoApplicationTests extends Specification {
		
		@Autowired
		private WebController controller
		
		def "assert been creation"(){
			expect:"bean created successfully"
				controller !=null
		
		
	}

	
}
