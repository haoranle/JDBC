import dao.GoddessDAO;
import model.Goddess;
import org.junit.Test;

import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangbaoning on 2017/3/14.
 */
public class TestGoddess {
    @Test
    public void testAddGoddess(){
        final String CREATE_USER = "zhangbaoning";
        final java.util.Date CRATE_DATE  = new java.util.Date(2017-3-15);
        Goddess goddess = new Goddess();
        goddess.setName("赵飞燕");
        goddess.setSex(2);
        goddess.setAge(18);
        goddess.setBirthday(new Date(1900-1-1));
        goddess.setEmail("yangyuhuan@qq.com");
        goddess.setMobile("19000261111");
        goddess.setCreate_user(CREATE_USER);
        goddess.setCreate_date(CRATE_DATE);
        new GoddessDAO().addGoddess(goddess);
    }
    @Test
    public  void testQuery() {
        GoddessDAO dao = new GoddessDAO();
        List search  = new LinkedList();
        Map map = new HashMap();
        map.put("name","name");
        map.put("rela","like");
        map.put("value","西施");
        search.add(map);
        List<Goddess> list = dao.query(search);
        for (Goddess goddess:list){
            System.out.println(goddess.toString());
        }
    }
}
