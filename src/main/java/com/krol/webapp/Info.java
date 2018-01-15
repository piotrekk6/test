package com.krol.webapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import pl.external.MyClass;



@Controller
public class Info {

    @Value("${os.name}")
    private String osName;

    @Value("${JAVA_HOME}")
    private String javaHome;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Value("${spring.version}")
    private String springVersion;

    @Value("${version}")
    private String projectVersion;

    @Value("${basedir}")
    private String basedir;

    @Value("${name}")
    private String name;

    @Value("${myFilteredProperty}")
    private String myFilteredProperty;





    @RequestMapping("/test")
    public String test(Model model) {

        model.addAttribute("profile",activeProfile);
        model.addAttribute("osname", osName);
        model.addAttribute("JAVA_HOME", javaHome);
        model.addAttribute("springVersion", springVersion);
        model.addAttribute("projectVersion", projectVersion);
        model.addAttribute("basdir", basedir);
        model.addAttribute("name", name);
        model.addAttribute("myFilteredProperty", myFilteredProperty);
        //model.addAttribute("methodOutput", MyClass.myStaticMethodOutput());



        return "index";
    }
}