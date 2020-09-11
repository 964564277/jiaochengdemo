package cn.yykjc.jiaochengdemo.user.controller;

import cn.yykjc.jiaochengdemo.user.entity.UserEntity;
import cn.yykjc.jiaochengdemo.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;
@Controller

@RequestMapping("user")
public class userController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return  userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id){
          userService.delById(id);
          return "redirect:/index.html";
    }
//保存用户

    @RequestMapping("/save")
   @ResponseBody
    public String save(@RequestBody UserEntity userEntity){
        userService.save(userEntity);
        return "添加成功";
    }

}
