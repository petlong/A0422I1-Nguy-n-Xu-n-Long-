package codegym.service;

import codegym.bean.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> findAll();

    void save (Mail mail);
}
