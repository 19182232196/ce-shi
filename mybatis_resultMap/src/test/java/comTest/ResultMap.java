package comTest;

import com.mapper.EmpMapper;
import com.pojo.Emp;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMap {
    @Test
    public void testgetEmpByEmpId(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println(emp);
    }
}