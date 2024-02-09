package com.charter.ews.store.data.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.charter.ews.store.data.entities.StoreData;
import com.charter.ews.store.data.model.StoreDataResponse;
import com.charter.ews.store.data.model.StoreDataResponseMapper;
import com.charter.ews.store.data.service.StoreDataService;

@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
public class StoreDataControllerTest {

	@InjectMocks
	private StoreDataController controller;
	
	@Mock
	StoreDataService storeDataService;
	
	@Mock
	StoreDataResponseMapper responseMapper;
	

@Test
public void testHello() throws Exception {
	
	MockHttpServletRequest request = new MockHttpServletRequest();
    RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    ResponseEntity<String> responseEntity = controller.hello();
    assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

    //when(employeeDAO.addEmployee(any(Employee.class))).thenReturn(true);

   // Employee employee = new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
	/*
	 * ResponseEntity<Object> responseEntity = controller.
	 * 
	 * assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
	 * assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo(
	 * "/1");  ResultActions response =
	 mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
	  .andExpect(MockMvcResultMatchers.status().isOk())
	 .andExpect(MockMvcResultMatchers.content().string("Hello from Store API"));*/
	
}

@Test
public void testStoreData() throws Exception {
	
	MockHttpServletRequest request = new MockHttpServletRequest();
	request.addHeader("client-id", "1234");
	request.addHeader("session-id", "1234");
	request.addHeader("transaction-id", "1234");
	request.addHeader("user-id", "");
	request.addParameter("storeNumber", "1234");
    RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    StoreDataResponse storeData = new StoreDataResponse();
    storeData.setStoreNumber("1234");
    when(storeDataService.getDataByStoreNumber(any(String.class))).thenReturn(storeData);
	/*
	 * when(responseMapper.mapResponse(any(StoreData.class))).thenReturn(dataInfo);
	 * StoreDataResponse storeResponse = new StoreDataResponse();
	 * storeResponse.setStoreData(new StoreDataInfo());
	 */
    ResponseEntity<StoreDataResponse> responseEntity = controller.storeData("1234", "1234", "1234", "1234", "1234");
    assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
  //  assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

    //when(employeeDAO.addEmployee(any(Employee.class))).thenReturn(true);

   // Employee employee = new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
	/*
	 * ResponseEntity<Object> responseEntity = controller.
	 * 
	 * assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
	 * assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo(
	 * "/1");  ResultActions response =
	 mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
	  .andExpect(MockMvcResultMatchers.status().isOk())
	 .andExpect(MockMvcResultMatchers.content().string("Hello from Store API"));*/
	
}

}
