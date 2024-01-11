package comTest;

import com.mapper.DeptMapper;
import com.mapper.EmpMapper;
import com.pojo.Dept;
import com.pojo.Emp;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMap {
    @Test
    public void testGetEmpByEmpId(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println(emp);
    }
    @Test
    public void testGetEmpAndDeptByEmpId(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
    }
    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepQ(1);
        System.out.println(emp.getEmpName());
    }
    @Test
    public void testGetDeptAndEmpByDeptId(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(dept);
    }
    @Test
    public void testGetDeptAndEmpByStep(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepQ(1);
        System.out.println(dept.getDeptName());
    }
}