package com.furamam04.validate;


import com.furamam04.entity.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CustomerValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof Customer)) {
            return;
        }
        Customer student = (Customer) target;
        if (student.getPhone().length() != 10) {
            errors.rejectValue("phoneNumber", "phonenumber", new String[]{"10"}, "Số điện thoại không đúng định dạng");
        } else if (!student.getPhone().startsWith("090")) {
            errors.rejectValue("phoneNumber", "phonenumberstart", "Số điện thoại không đúng định dạng");
        }
    }
}
