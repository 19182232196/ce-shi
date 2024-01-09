package com.mapper;

import com.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId") Integer empId);
}
