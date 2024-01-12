package comTest;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.EmpMapper;
import com.pojo.Emp;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Pagetest {
    @Test
    public void testPage(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Page<Object> page = PageHelper.startPage(2,10);
        List<Emp> emps = mapper.selectByExample(null);
        PageInfo<Emp> pageInfo = new PageInfo<>(emps,5);
        emps.forEach(System.out::println);
        System.out.println(page);
    }
}
