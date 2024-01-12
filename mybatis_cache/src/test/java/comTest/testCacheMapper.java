package comTest;

import com.mapper.CacheMapper;
import com.pojo.Emp;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class testCacheMapper{
    @Test
    public void testGetEmpById(){
        SqlSession session1 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = session1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(4);
        System.out.println(emp1);
        session1.clearCache();
//        mapper1.insertEmp(new Emp(null, "qwer", 22, "男", null));
        Emp emp2 = mapper1.getEmpById(4);
        System.out.println(emp2);
//        SqlSession session2 = SqlSessionUtil.getSqlSession();
//        CacheMapper mapper2 = session2.getMapper(CacheMapper.class);
//        Emp emp3 = mapper2.getEmpById(4);
//        System.out.println(emp3);
    }
    @Test
    public void testCache() throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session1 = sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = session1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(4);
        System.out.println(emp1);
        session1.close();
        SqlSession session2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper2 = session2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpById(4);
        System.out.println(emp2);
        session2.close();
    }
}