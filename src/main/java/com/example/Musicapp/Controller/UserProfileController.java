//package com.example.Musicapp.Controller;
//
//import com.example.Musicapp.model.UserProfile;
//import com.example.Musicapp.service.UserProfileService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/profile")
//public class UserProfileController {
//
//    private UserProfileService userProfileService;
//
//    @Autowired
//    public void setUserProfileService(UserProfileService userProfileService){
//        this.userProfileService = userProfileService;
//    }
//
//    @GetMapping("/{username}")
//    public UserProfile getUserProfile(@PathVariable String username) {
//        return userProfileService.getUserProfile(username);
//    }
//
//    @PostMapping("/{username}")
//    public UserProfile createUserProfile(@PathVariable String username, @RequestBody UserProfile userProfile) {
//        return userProfileService.createUserProfile(username, userProfile);
//    }
//}