/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  Run   localhost:8080/h2-console
 *  for URL   jdbc:h2:mem:testdb
 *
 *  SEE ALSO
 *  https://o7planning.org/ru/11893/integrating-spring-boot-jpa-and-h2-database
 *
 */


@SpringBootApplication
public class SampleDataJpaApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleDataJpaApplication.class, args);
	}

}
