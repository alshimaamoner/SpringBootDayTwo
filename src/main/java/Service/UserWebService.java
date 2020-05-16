/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
public class UserWebService {

    @Autowired
    private UserDao userDao;

     @GetMapping
    public List<User> getAllUser() {
         System.out.println("get");
        return (List<User>) userDao.findAll();
    }
    @RequestMapping("/")
    public String welcomepage() {
        return "Welcome ";
    }
    @GetMapping("/{id}")
    public Optional<User> getAllUser(@PathVariable(value = "id")  int id ) {
        System.out.println("get ................");
        return userDao.findById(id);
    }


    @PostMapping
    public void addUser(@RequestBody User userRecord) {
        System.out.println("add user");
        userDao.save(userRecord);
    }
}
