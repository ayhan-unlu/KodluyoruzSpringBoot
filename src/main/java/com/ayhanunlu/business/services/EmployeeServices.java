package com.ayhanunlu.business.services;

import com.ayhanunlu.business.dto.EmployeeDto;
import com.ayhanunlu.data.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeServices {


//    CRUD
    public List<EmployeeDto> getAllEmployees();
    public EmployeeDto createEmployee(EmployeeDto employeeDto);
    public ResponseEntity<EmployeeDto> getEmployee(Long id);
    public ResponseEntity<EmployeeDto> updateEmployee(Long id, EmployeeDto employeeDto);
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id);

//    Model Mapper
    public EmployeeDto EntityToDto (EmployeeEntity employeeEntity);
    public EmployeeEntity DtoToEntity (EmployeeDto employeeDto);


}
