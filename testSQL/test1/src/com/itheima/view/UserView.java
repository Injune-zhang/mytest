package com.itheima.view;

import com.itheima.Service.UserService;

import java.util.Scanner;

public class UserView {
    private static UserService userService  = new UserService();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while(!login()){
        }
    }

    private static boolean login() {
        System.out.println("--欢迎进入联系人管理系统--");
        System.out.println("请输入用户名：");
        String name = s.nextLine();
        System.out.println("请输入密码：");
        String password = s.nextLine();
        //向逻辑层发送请求，判断用户是否存在，根据返回值显示不同
        if (userService.exists(name,password)) {
            System.out.println("恭喜用户"+name+"登陆成功");
            return true;
        } else {
            System.out.println("用户名或密码不正确，登陆失败");
            return false;
        }
    }
}
