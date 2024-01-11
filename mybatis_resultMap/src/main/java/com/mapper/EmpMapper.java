package com.mapper;

import com.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId") Integer empId);
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);
    Emp getEmpAndDeptByStepQ(@Param("empId") Integer empId);
    List<Emp> getDeptAndEmpByStepW(@Param("deptId") Integer deptId);
}
