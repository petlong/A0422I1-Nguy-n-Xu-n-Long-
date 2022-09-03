package ss19_string.practice.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    /*
    ^               : Bắt đầu chuỗi String hoặc một dòng
    [A-Za-z0-9]+    : Email address phải bắt đầu với “[A-Za-z0-9]+” và có ít nhất một ký tự
    [A-Za-z0-9]*@   : tùy chọn theo "[A-Za-z0-9]", và kết thúc bằng một ký hiệu "@"
    [A-Za-z0-9]     : Domain phải sau @ và ký tự phải nằm trong [A-Za-z0-9]
    \\.[A-Za-z0-9]  : Sau domain là phần mở rộng của domain sau dấu chấm, ví dụ: (.com, .net, .org)
    $               : Kết thúc chuỗi String hoặc kết thúc dòng
    */

    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
