package codegym.service;

import codegym.bean.Mail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MailServiceImpl implements IMailService{
    static List<Mail> mailList = new ArrayList<>();

    @Override
    public List<Mail> findAll() {
        return mailList;
    }

    @Override
    public void save(Mail mail) {
        mailList.add(mail);
    }
}
