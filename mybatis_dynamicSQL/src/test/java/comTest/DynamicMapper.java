package comTest;

import com.mapper.DynamicSQLMapper;
import com.pojo.Emp;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicMapper {
    @Test
    public void testGetEmpByCondition(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = session.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "", null, "",null);
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }
    @Test
    public void testGetEmpEmpByCoose(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = session.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "qwer", null, "",null);
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }
    @Test
    public void testInsertMoreEmp(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = session.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "tyui1", 30, "男",null);
        Emp emp2 = new Emp(null, "tyui2", 30, "男",null);
        Emp emp3 = new Emp(null, "tyui3", 30, "男",null);
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list);
    }
    @Test
    public void testDeleteMoreEmp(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = session.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = new Integer[]{1, 2, 3};
        mapper.deleteMoreEmp(empIds);
    }
}