package com.charter.ews.store.data.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.charter.ews.store.data.model.StoreDataResponse;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import nl.jqno.equalsverifier.EqualsVerifier;

@DataJpaTest
public class StoreDataTest {

	
	@Test
	void testEqualsAndHashcode()
	{
		EqualsVerifier.simple().forClass(StoreData.class)
        .withIgnoredAnnotations(Entity.class, Id.class, Embeddable.class, MappedSuperclass.class, Transient.class)
        .verify();
	}
	
	@Test
	  void testSunday()
	  {
		StoreData storeData = new StoreData();
		  storeData.setSunday("Sunday");
		  assertEquals("Sunday", storeData.getSunday());
		  
	  }
	  
	  @Test
	  void testMonday()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setMonday("Monday");
		  assertEquals("Monday", storeData.getMonday());
		  
	  }
	  @Test
	  void testTuesday()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setTuesday("Tuesday");
		  assertEquals("Tuesday", storeData.getTuesday());
		  
	  }
	  @Test
	  void testWednesday()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setWednesday("Wednesday");
		  assertEquals("Wednesday", storeData.getWednesday());
		  
	  }
	  @Test
	  void testThursday()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setThursday("Thursday");
		  assertEquals("Thursday", storeData.getThursday());
		  
	  }
	  
	  @Test
	  void testFriday()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setFriday("Friday");
		  assertEquals("Friday", storeData.getFriday());
		  
	  }
	  
	  @Test
	  void testSaturday()
	  {
		 StoreData storeData = new StoreData();
		  storeData.setSaturday("Saturday");
		  assertEquals("Saturday", storeData.getSaturday());
		  
	  }
	  
	  @Test
	  void testState()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setState("IN");
		  assertEquals("IN", storeData.getState());
		  
	  }
	  @Test
	  void testCity()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setCity("Test city");
		  assertEquals("Test city", storeData.getCity());
		  
	  }
	  @Test
	  void testSiteAddress()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setSiteAddress("Test Address");
		  assertEquals("Test Address", storeData.getSiteAddress());
		  
	  }
	  @Test
	  void testSafeRoom()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setSafeRoom("Test");
		  assertEquals("Test", storeData.getSafeRoom());
		  
	  }
	  
	  @Test
	  void testQueuingSystem()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setQueuingSystem("NA");
		  assertEquals("NA", storeData.getQueuingSystem());
		  
	  }
	  @Test
	  void testRelocationToStore()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setRelocationToStore("N");
		  assertEquals("N", storeData.getRelocationToStore());
		  
	  }
	  @Test
	  void testGatewayUse()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setGatewayUse("Test Address");
		  assertEquals("Test Address", storeData.getGatewayUse());
		  
	  }
	  @Test
	  void testNotes()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setNotes("Test");
		  assertEquals("Test", storeData.getNotes());
		  
	  }
	  @Test
	  void testPosQuantity()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setPosQuantity(1L);
		  assertNotNull(storeData.getPosQuantity());
		  
	  }
	  @Test
	  void testPosEnabledStatus()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setPosEnabledStatus("N");
		  assertEquals("N", storeData.getPosEnabledStatus());
		  
	  }
	  @Test
	  void testTotalWorkStations()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setTotalWorkStations(1L);
		  assertNotNull(storeData.getTotalWorkStations());
		  
	  }
	  @Test
	  void testGreeterStations()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setGreeterStations(1L);
		  assertNotNull(storeData.getGreeterStations());
		  
	  }
	  
	  @Test
	  void testFullServWorkstations()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setFullServWorkstations(1L);
		  assertNotNull(storeData.getFullServWorkstations());
		  
	  }
	  @Test
	  void testMerchantId()
	  {
		 StoreData storeData = new StoreData();
		  storeData.setMerchantId("1234");
		  assertEquals("1234", storeData.getMerchantId());
		  
	  }
	  
	  @Test
	  void testAdaWorkstations()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setAdaWorkstations(1L);
		  assertNotNull(storeData.getAdaWorkstations());
		  
	  }
	  @Test
	  void testICOMSTechBufferId()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setICOMSTechBufferId("1234");
		  assertEquals("1234", storeData.getICOMSTechBufferId());
		  
	  }
	  @Test
	  void testGlid()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setGlid("TestGlid");
		  assertEquals("TestGlid", storeData.getGlid());
		  
	  }
	  @Test
	  void testMobileStore()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setMobileStore("TestMStore");
		  assertEquals("TestMStore", storeData.getMobileStore());
		  
	  }
	  @Test
	  void testSearchEntityId()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setSearchEntityId("MyEntity12");
		  assertEquals("MyEntity12",storeData.getSearchEntityId());
		  
	  }
	  @Test
	  void testCSGTechBufferId()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setCSGTechBufferId("1234");
		  assertEquals("1234", storeData.getCSGTechBufferId());
		  
	  }
	  @Test
	  void testErpSystemId()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setErpSystemId("TestErp");
		  assertEquals("TestErp", storeData.getErpSystemId());
		  
	  }
	  @Test
	  void testMarket()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setMarket("IN");
		  assertEquals("IN", storeData.getMarket());
		  
	  }
	  @Test
	  void testDivision()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setDivision("MyDivision");
		  assertEquals("MyDivision",storeData.getDivision());
		  
	  }
	  @Test
	  void testRegion()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setRegion("MyRegion");
		  assertEquals("MyRegion", storeData.getRegion());
		  
	  }
	  @Test
	  void testEStoreCategory()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setStoreCategory("A");
		  assertEquals("A", storeData.getStoreCategory());
		  
	  }
	  @Test
	  void testStoreStatus()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setStoreStatus("A");
		  assertEquals("A", storeData.getStoreStatus());
		  
	  }
	  @Test
	  void testStoreType()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setStoreType("Retail");
		  assertEquals("Retail",storeData.getStoreType());
		  
	  }
	  @Test
	  void testLegacyBrand()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setLegacyBrand("Test");
		  assertEquals("Test", storeData.getLegacyBrand());
		  
	  }
	  @Test
	  void testQmaticMountType()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setQmaticMountType("NA");
		  assertEquals("NA", storeData.getQmaticMountType());
		  
	  }
	  @Test
	  void testStoreSId()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setStoreSId(1234L);
		  assertEquals(1234L, storeData.getStoreSId());
		  
	  }
	  @Test
	  void testStoreName()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setStoreName("MyStore");
		  assertEquals("MyStore",storeData.getStoreName());
		  
	  }
	  @Test
	  void testZip()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setZip("123456");
		  assertEquals("123456", storeData.getZip());
		  
	  }
	  @Test
	  void testVersionNumber()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setVersionNumber(1L);
		  assertNotNull(storeData.getVersionNumber());
		  
	  }
	  @Test
	  void testLatitude()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setLatitude("N");
		  assertEquals("N", storeData.getLatitude());
		  
	  }
	  @Test
	  void testLongitude()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setLongitude("N");
		  assertEquals("N", storeData.getLongitude());
		  
	  }
	  @Test
	  void testPrimaryBiller()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setPrimaryBiller("PBill");
		  assertEquals("PBill", storeData.getPrimaryBiller());
		  
	  }
	  @Test
	  void testSharedFacility()
	  {
		  StoreData storeData = new StoreData();
		  storeData.setSharedFacility("Facilityshared");
		  assertEquals("Facilityshared",storeData.getSharedFacility());
		  
	  }
	  @Test
	  void testSecondaryBiller()
	  {
		 StoreData storeData = new StoreData();
		  storeData.setSecondaryBiller("123456");
		  assertEquals("123456", storeData.getSecondaryBiller());
		  
	  }

}
