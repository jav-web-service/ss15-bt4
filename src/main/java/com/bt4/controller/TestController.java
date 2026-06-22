package com.bt4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Xin chào! Đây là public endpoint không cần đăng nhập.";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "Chào mừng Admin đến với Dashboard!";
    }

    @GetMapping("/librarian/manage")
    public String librarianManage() {
        return "Chào mừng Librarian! Khu vực quản lý sách.";
    }
}
