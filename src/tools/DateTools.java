package tools;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * 这是处理日期的工具类
 * @author 冯秋翼
 */
public class DateTools {

    static private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    private DateTools(){};
    /**
     * 输入String，输出Date对象
     * @param s 满足"yyyy-MM-dd"格式，例如"2018-03-18"。若不满足，则会返回null。
     * @return 相应的Date对象
     */
    public static Date getDate(String s){
        Date date = null;
        try{
            date = new Date(format.parse(s).getTime());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return date;
        }
    }
}
