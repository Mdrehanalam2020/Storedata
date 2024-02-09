package com.charter.ews.store.data.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
public class AuditTest {

	@Autowired
	private TestEntityManager entityManager;
	
	
	@Test
	void testEqualsAndHashcode()
	{
		EqualsVerifier.simple().forClass(Audit.class)
        .withIgnoredAnnotations(Entity.class, Id.class, Embeddable.class, MappedSuperclass.class, Transient.class)
        .verify();
	}
	
	  @Test
	  void testGetModifiedBy()
	  {
		 Audit audit = new Audit();
		  audit.setModifiedBy("solo");
		  assertEquals("solo", audit.getModifiedBy());
		  
	  }
	  
	  @Test
	  void testGetCreatedBy()
	  {
		 Audit audit = new Audit();
		  audit.setCreatedBy("solo");
		  assertEquals("solo", audit.getCreatedBy());
		  
	  }
	  
	  @Test
	  void testGetRecordStatus()
	  {
		 Audit audit = new Audit();
		  audit.setRecordStatus("S");
		  assertEquals("S", audit.getRecordStatus());
		  
	  }

}
