package itheima.view;

import itheima.Service.ContactService;
import itheima.entity.Contact;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    private static ContactService contactService = new ContactService();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        showMyContact();
    }

    private static void showMyContact() {
        System.out.println("=请输入用户姓名=");
        System.out.println("用户名：");
        String name = s.nextLine();
        if (contactService.isExits(name)) {
            System.out.println("该用户联系人有如下几位：");
            List<Contact> list = contactService.getContactlist(name);
            if (list == null) {
                System.out.println("该用户无联系人");
            } else {
                System.out.println(list);
            }
        } else {
            System.out.println("该用户不存在，请重新输入");
        }

    }
}
