package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    /**
     * 只要登录就可以访问
     * @return
     */
    @RequestMapping(value = {"/index" }, method = RequestMethod.GET)
    public ResponseEntity index(){
        return ResponseEntity.ok().data("Hello,index");
    }

    /**
     * ADMIN 角色就可以访问
     * @return
     */
    @RequestMapping(value = {"/admin" }, method = RequestMethod.GET)
    public ResponseEntity admin(){
        return ResponseEntity.ok().data("Hello,admin");
    }

    /**
     * USER 角色就可以访问
     * @return
     */
    @RequestMapping(value = {"/user" }, method = RequestMethod.GET)
    public ResponseEntity user(){
        return ResponseEntity.ok().data("Hello,user");
    }

    /**
     * 无需权限就可以访问
     * @return
     */
    @RequestMapping(value = {"other" }, method = RequestMethod.GET)
    public ResponseEntity other(){
        return ResponseEntity.ok().data("Hello,other");
    }
}
