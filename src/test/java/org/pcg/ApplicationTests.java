/*
 * Copyright 2016 the original author or authors.
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

package org.pcg;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pcg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private UserRepository userRepository;

	@Before
	public void deleteAllBeforeTests() throws Exception {
		/*userRepository.deleteAll();*/
	}

	/*@Test
	public void shouldReturnRepositoryIndex() throws Exception {

		mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(
				jsonPath("$._links.users").exists());
	}*/

	@Test
	public void shouldCreateEntity() throws Exception {

		/*mockMvc.perform(post("/users").content(
				"{\"id\": \"ad439@njit.edu\",\"firstName\": \"Ama\", \"lastName\":\"Dankwah\", \"gender\":\"Female\", \"isMentor\":\"true\"}")).andExpect(
						status().isCreated()).andExpect(
								header().string("Location", containsString("users/")));*/
	}

	@Test
	public void shouldRetrieveEntity() throws Exception {

		/*MvcResult mvcResult = mockMvc.perform(post("/users").content(
				"{\"firstName\": \"Ama\", \"lastName\":\"Dankwah\"}")).andExpect(
						status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");
		mockMvc.perform(get(location)).andExpect(status().isOk()).andExpect(
				jsonPath("$.firstName").value("Ama")).andExpect(
						jsonPath("$.lastName").value("Dankwah"));*/
	}

	@Test
	public void shouldQueryEntity() throws Exception {

		/*mockMvc.perform(post("/users").content(
				"{ \"firstName\": \"Ama\", \"lastName\":\"Dankwah\"}")).andExpect(
						status().isCreated());

		mockMvc.perform(
				get("/users/search/findByLastName?name={name}", "Dankwah")).andExpect(
						status().isOk()).andExpect(
								jsonPath("$._embedded.users[0].firstName").value(
										"Ama"));*/
	}

	@Test
	public void shouldUpdateEntity() throws Exception {

		/*MvcResult mvcResult = mockMvc.perform(post("/users").content(
				"{\"firstName\": \"Ama\", \"lastName\":\"Dankwah\"}")).andExpect(
						status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");

		mockMvc.perform(put(location).content(
				"{\"firstName\": \"Ama\", \"lastName\":\"Dankwah1\"}")).andExpect(
						status().isNoContent());

		mockMvc.perform(get(location)).andExpect(status().isOk()).andExpect(
				jsonPath("$.firstName").value("Ama")).andExpect(
						jsonPath("$.lastName").value("Dankwah1"));*/
	}

	@Test
	public void shouldPartiallyUpdateEntity() throws Exception {

		/*MvcResult mvcResult = mockMvc.perform(post("/users").content(
				"{\"firstName\": \"Ama\", \"lastName\":\"Dankwah1\"}")).andExpect(
						status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");

		mockMvc.perform(
				patch(location).content("{\"firstName\": \"Ama1\"}")).andExpect(
						status().isNoContent());

		mockMvc.perform(get(location)).andExpect(status().isOk()).andExpect(
				jsonPath("$.firstName").value("Ama1")).andExpect(
						jsonPath("$.lastName").value("Dankwah1"));*/
	}

	@Test
	public void shouldDeleteEntity() throws Exception {

		/*MvcResult mvcResult = mockMvc.perform(post("/users").content(
				"{ \"firstName\": \"Ama\", \"lastName\":\"Dankwah\"}")).andExpect(
						status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");
		mockMvc.perform(delete(location)).andExpect(status().isNoContent());

		mockMvc.perform(get(location)).andExpect(status().isNotFound());*/
	}
}