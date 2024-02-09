package com.charter.ews.store.data.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class StoreDataResponseTest {
	
	
	@Test
	void testEqualsAndHashcode()
	{
		EqualsVerifier.simple().forClass(StoreDataResponse.class).suppress(Warning.INHERITED_DIRECTLY_FROM_OBJECT).verify();
	}
	
	
  @Test
  void testStoreNumber()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setStoreNumber("1234");
	  assertEquals("1234", storeDataResponse.getStoreNumber());
	  
  }
  
  @Test
  void testSunday()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setSunday("Sunday");
	  assertEquals("Sunday", storeDataResponse.getSunday());
	  
  }
  
  @Test
  void testMonday()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setMonday("Monday");
	  assertEquals("Monday", storeDataResponse.getMonday());
	  
  }
  @Test
  void testTuesday()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setTuesday("Tuesday");
	  assertEquals("Tuesday", storeDataResponse.getTuesday());
	  
  }
  @Test
  void testWednesday()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setWednesday("Wednesday");
	  assertEquals("Wednesday", storeDataResponse.getWednesday());
	  
  }
  @Test
  void testThursday()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setThursday("Thursday");
	  assertEquals("Thursday", storeDataResponse.getThursday());
	  
  }
  
  @Test
  void testFriday()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setFriday("Friday");
	  assertEquals("Friday", storeDataResponse.getFriday());
	  
  }
  
  @Test
  void testSaturday()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setSaturday("Saturday");
	  assertEquals("Saturday", storeDataResponse.getSaturday());
	  
  }
  
  @Test
  void testStateCode()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setStateCode("IN");
	  assertEquals("IN", storeDataResponse.getStateCode());
	  
  }
  @Test
  void testCity()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setCity("Test city");
	  assertEquals("Test city", storeDataResponse.getCity());
	  
  }
  @Test
  void testSiteAddress()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setSiteAddress("Test Address");
	  assertEquals("Test Address", storeDataResponse.getSiteAddress());
	  
  }
  @Test
  void testSafeRoom()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setSafeRoom("Test");
	  assertEquals("Test", storeDataResponse.getSafeRoom());
	  
  }
  
  @Test
  void testQueuingSystem()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setQueuingSystem("NA");
	  assertEquals("NA", storeDataResponse.getQueuingSystem());
	  
  }
  @Test
  void testRelocationToStore()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setRelocationToStore("N");
	  assertEquals("N", storeDataResponse.getRelocationToStore());
	  
  }
  @Test
  void testGatewayUse()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setGatewayUse("Test Address");
	  assertEquals("Test Address", storeDataResponse.getGatewayUse());
	  
  }
  @Test
  void testNotes()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setNotes("Test");
	  assertEquals("Test", storeDataResponse.getNotes());
	  
  }
  @Test
  void testPosQuantity()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setPosQuantity(1);
	  assertNotNull(storeDataResponse.getPosQuantity());
	  
  }
  @Test
  void testPosEnabledStatus()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setPosEnabledStatus("N");
	  assertEquals("N", storeDataResponse.getPosEnabledStatus());
	  
  }
  @Test
  void testTotalWorkStations()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setTotalWorkStations(1);
	  assertNotNull(storeDataResponse.getTotalWorkStations());
	  
  }
  @Test
  void testGreeterStations()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setGreeterStations(1);
	  assertNotNull(storeDataResponse.getGreeterStations());
	  
  }
  
  @Test
  void testFullServWorkstations()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setFullServWorkstations(1);
	  assertNotNull(storeDataResponse.getFullServWorkstations());
	  
  }
  @Test
  void testMerchantId()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setMerchantId("1234");
	  assertEquals("1234", storeDataResponse.getMerchantId());
	  
  }
  @Test
  void testAdaWorkstations()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setAdaWorkstations(1);
	  assertNotNull(storeDataResponse.getAdaWorkstations());
	  
  }
  @Test
  void testICOMSTechBufferId()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setICOMSTechBufferId("1234");
	  assertEquals("1234", storeDataResponse.getICOMSTechBufferId());
	  
  }
  @Test
  void testGlid()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setGlid("TestGlid");
	  assertEquals("TestGlid", storeDataResponse.getGlid());
	  
  }
  @Test
  void testMobileStore()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setMobileStore("TestMStore");
	  assertEquals("TestMStore", storeDataResponse.getMobileStore());
	  
  }
  @Test
  void testSearchEntityId()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setSearchEntityId("MyEntity12");
	  assertEquals("MyEntity12",storeDataResponse.getSearchEntityId());
	  
  }
  @Test
  void testCSGTechBufferId()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setCSGTechBufferId("1234");
	  assertEquals("1234", storeDataResponse.getCSGTechBufferId());
	  
  }
  @Test
  void testErpSystemId()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setErpSystemId("TestErp");
	  assertEquals("TestErp", storeDataResponse.getErpSystemId());
	  
  }
  @Test
  void testMarket()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setMarket("IN");
	  assertEquals("IN", storeDataResponse.getMarket());
	  
  }
  @Test
  void testDivision()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setDivision("MyDivision");
	  assertEquals("MyDivision",storeDataResponse.getDivision());
	  
  }
  @Test
  void testRegion()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setRegion("MyRegion");
	  assertEquals("MyRegion", storeDataResponse.getRegion());
	  
  }
  @Test
  void testEStoreCategory()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setStoreCategory("A");
	  assertEquals("A", storeDataResponse.getStoreCategory());
	  
  }
  @Test
  void testStoreStatus()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setStoreStatus("A");
	  assertEquals("A", storeDataResponse.getStoreStatus());
	  
  }
  @Test
  void testStoreType()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setStoreType("Retail");
	  assertEquals("Retail",storeDataResponse.getStoreType());
	  
  }
  @Test
  void testLegacyCorp()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setLegacyCorp("Test");
	  assertEquals("Test", storeDataResponse.getLegacyCorp());
	  
  }
  @Test
  void testQmaticMountType()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setQmaticMountType("NA");
	  assertEquals("NA", storeDataResponse.getQmaticMountType());
	  
  }
  @Test
  void testStoreSId()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setStoreSId("1234");
	  assertEquals("1234", storeDataResponse.getStoreSId());
	  
  }
  @Test
  void testStoreName()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setStoreName("MyStore");
	  assertEquals("MyStore",storeDataResponse.getStoreName());
	  
  }
  @Test
  void testZip()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setZip("123456");
	  assertEquals("123456", storeDataResponse.getZip());
	  
  }
  @Test
  void testVersionNumber()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setVersionNumber(1);
	  assertNotNull(storeDataResponse.getVersionNumber());
	  
  }
  @Test
  void testLatitude()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setLatitude("N");
	  assertEquals("N", storeDataResponse.getLatitude());
	  
  }
  @Test
  void testLongitude()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setLongitude("N");
	  assertEquals("N", storeDataResponse.getLongitude());
	  
  }
  @Test
  void testPrimaryBiller()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setPrimaryBiller("PBill");
	  assertEquals("PBill", storeDataResponse.getPrimaryBiller());
	  
  }
  @Test
  void testSharedFacility()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setSharedFacility("Facilityshared");
	  assertEquals("Facilityshared",storeDataResponse.getSharedFacility());
	  
  }
  @Test
  void testSecondaryBiller()
  {
	 StoreDataResponse storeDataResponse = new StoreDataResponse();
	  storeDataResponse.setSecondaryBiller("123456");
	  assertEquals("123456", storeDataResponse.getSecondaryBiller());
	  
  }
}
