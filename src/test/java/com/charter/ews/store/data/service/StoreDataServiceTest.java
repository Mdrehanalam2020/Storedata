package com.charter.ews.store.data.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.charter.ews.store.data.entities.StoreData;
import com.charter.ews.store.data.exception.NoDataFoundException;
import com.charter.ews.store.data.model.StoreDataResponseMapper;
import com.charter.ews.store.data.repository.StoreDataRepository;

@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
public class StoreDataServiceTest {

	@InjectMocks
	private StoreDataService service;
	
	@Mock
	StoreDataRepository storeDataRepository;
	
	@Mock
	StoreDataResponseMapper storeDataResponseMapper;

@Test
public void testGetDataByStoreNumber() throws Exception {
	
	MockHttpServletRequest request = new MockHttpServletRequest();
    RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    Optional<StoreData> storeData = Optional.of(new StoreData());
    when(storeDataRepository.getByStoreNumberAndAuditRecordStatusAndEndDateGreaterThan(any(String.class), any(String.class), any(LocalDate.class))).thenReturn(storeData);
    service.getDataByStoreNumber("1234");
	
}

@Test
public void testGetDataByStoreNumberNoDataFoundException() throws Exception {
	
    Executable exec = ()-> service.getDataByStoreNumber("1234");
    Throwable thrown = assertThrows(NoDataFoundException.class, exec, "storeNumber : 1234 doesn't exists.");        
    assertEquals("storeNumber :  1234 doesn't exists.", thrown.getMessage());
}

}
