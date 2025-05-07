package com.TRMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TRMS.Model.Feedback;
import com.TRMS.Service.FeedService;

@Controller
public class FeedController {
    
    @Autowired
    private FeedService serv;

    @RequestMapping("/feedback")
    public String showFeedForm() {
        return "feedform"; // This should be your Thymeleaf or JSP view name
    }

    @RequestMapping("/sendfeedback")
    public String getFeedBack(@ModelAttribute Feedback feed,Model model) {
        serv.addFeed(feed);
        model.addAttribute("f1",feed);
        return "showFeedBack"; // View to display feedback confirmation or details
    }
}
