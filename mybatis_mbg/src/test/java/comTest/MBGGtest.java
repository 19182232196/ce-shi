package comTest;

import com.mapper.EmpMapper;
import com.pojo.Emp;
import com.pojo.EmpExample;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MBGGtest {
    @Test
    public void testMBG(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
//        Emp emp = mapper.selectByPrimaryKey(4);
//        System.out.println(emp);
//        List<Emp> emps = mapper.selectByExample(null);
//        emps.forEach(System.out::println);
        EmpExample example = new EmpExample();
        example.createCriteria().
//                andEmpNameEqualTo("qwer").
                andAgeGreaterThanOrEqualTo(29);
        example.or().andGenderEqualTo("女");
        List<Emp> emps = mapper.selectByExample(example);
        emps.forEach(System.out::println);
    }
    @Test
    public void testMBG2(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp(6,"bnm",null,"女",null);
//        mapper.updateByPrimaryKey(emp);
        mapper.updateByPrimaryKeySelective(emp);
    }
}

