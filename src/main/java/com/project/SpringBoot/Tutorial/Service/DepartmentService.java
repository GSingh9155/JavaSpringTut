package com.project.SpringBoot.Tutorial.Service;

import com.project.SpringBoot.Tutorial.Entity.Department;
import com.project.SpringBoot.Tutorial.Error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List getDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
