package com.ayhanunlu;

import com.ayhanunlu.data.entity.EmployeeEntity;
import com.ayhanunlu.data.repository.EmployeeRepository;
import com.ayhanunlu.test.TestCrud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodluyoruzSpringBootApplicationTests implements TestCrud {

    @Autowired
    EmployeeRepository employeeRepository;

    //    TEST CREATE
    @Test
    @Override
    public void testCreate() {
/*
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setFirstName("Ayhan");
        employeeEntity.setLastName("Unlu");
        employeeEntity.setEmailId("ayhan-unlu@hotmail.com");
*/
        EmployeeEntity employeeEntity = EmployeeEntity
                .builder()
                .firstName("Test Ayhan")
                .lastName("Test Unlu")
                .emailId("Test ayhan-unlu@hotmail.com")
                .build();
        employeeRepository.save(employeeEntity);
        // is the returned object null or not ? if null Send an assertion Error
        // entity id should be 1
        assertNotNull(employeeRepository.findById(1L).get());
    }

    //    TEST LIST
    @Test
    @Override
    public void testList() {
        List<EmployeeEntity> employeeEntityList = employeeRepository.findAll();
        // if the size of the returned entity list is greater than zero LIST function is working
        assertThat(employeeEntityList).size().isGreaterThan(0);
    }

    //    TEST FINDBYID
    @Test
    @Override
    public void testFindById() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        // entity with id no:1 should exist then returned entity wont be null
        assertEquals("Test Ayhan", employeeEntity.getFirstName());
    }

    //    TEST UPDATE
    @Test
    @Override
    public void testUpdate() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        employeeEntity.setFirstName("Updated Ayhan");
        employeeRepository.save(employeeEntity);
//        assertEquals("Updated Ayhan", employeeRepository.findById(1L).get().getFirstName());
//        if it is not equal then the update is done properly otherwise there will be an assertion error
        assertNotEquals("Test Ayhan", employeeRepository.findById(1L).get().getFirstName());
    }

    //    TEST DELETE
    @Test
    @Override
    public void testDelete() {
        employeeRepository.deleteById(1L);
        //isFalse
        assertThat(employeeRepository.existsById(1L)).isFalse();
    }

/*    @Test
    void contextLoads() {
    }*/
}
