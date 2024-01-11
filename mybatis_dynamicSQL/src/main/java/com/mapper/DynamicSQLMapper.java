package com.mapper;

import com.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    List<Emp> getEmpByCondition(Emp emp);
    List<Emp> getEmpByCoose(Emp emp);
    void insertMoreEmp(@Param("emps") List<Emp> emps);
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
