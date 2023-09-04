package cput.za.ac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping({"/","/home"}) // we can have more than one url, by separating then using comma and surround then with curly bracket
    String home(){
        return "Hello World!";
    }
    // @RequestMapping(value ="/create", method = RequestMethod.POST);
    /* Way to create a POST request is through @PostMapping
    Because we are working on the web service @Autowired allow us to intantiate an object
    @Autowired
    private NationalityService nationalityService.... and add the @Service notation on the nationalityServiceImpl to tell the browser that is the service we want to exposed
    @PostMapping("/create")    // this / create is a url pass in the post request


    here we are using the create method found in our nationalityServiceImpl which create nationality for us.
    public Nationality create(@RequestBody Nationality nationality){
    return nationalityService.create(nationality)
    }
    */

}
