package com.project.SpringBoot.Tutorial.Service;

import com.project.SpringBoot.Tutorial.Entity.Department;
import com.project.SpringBoot.Tutorial.Repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.plugins.MockitoLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentAddress("Ahemdabad")
                        .departmentCode("IT-06")
                        .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);
    }

    @Test
    public void testDepartmentFound(){
        String departmentName = "IT";
        Department found =
                departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}