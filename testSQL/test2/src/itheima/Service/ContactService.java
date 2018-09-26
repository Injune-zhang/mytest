package itheima.Service;

import itheima.dao.ContactDao;
import itheima.entity.Contact;

import java.util.List;

public class ContactService {
    private static ContactDao contactDao = new ContactDao();

    public ContactService() {
    }

    //请求dao层拿到list
    public List<Contact> getContactlist(String name){
        return contactDao.findMyContact(name);
    }

    //请求dao层判断是否存在该用户
    public boolean isExits(String name) {
        return contactDao.isExits(name);
    }
}
