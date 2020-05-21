package kr.or.fenrird.controller;



import kr.or.fenrird.jpa.entity.Test;
import kr.or.fenrird.jpa.repo.TTrepo;
import kr.or.fenrird.jpa.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @Autowired
    TTrepo tTrepo;

    @Autowired
    TestRepo testRepo;

    @GetMapping("/")
    @ResponseBody
    public Object home(){

        System.out.println("hh d");
        System.out.println(testRepo.findAll());
        testRepo.findAll().forEach((Test to) -> {
            System.out.println(to.getTest());
        });

        return testRepo.findAll();
    }
}
