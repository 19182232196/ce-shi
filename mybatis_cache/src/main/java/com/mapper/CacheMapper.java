package com.mapper;

import com.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    Emp getEmpById(@Param("empId") Integer empId);
    void insertEmp(Emp emp);
}
