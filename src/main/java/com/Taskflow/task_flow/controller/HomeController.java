package com.Taskflow.task_flow.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "index";
        }

        @GetMapping("/dashboard")
        public String dashboard() {
            return "dashboard";
        }

        @GetMapping("/employees")
        public String employees() {
            return "employees";
        }

        @GetMapping("/tasks")
        public String tasks() {
            return "tasks";
        }

        @GetMapping("/reports")
        public String reports() {
            return "reports";
        }

        @GetMapping("/settings")
        public String settings() {
            return "settings";
        }
    }



