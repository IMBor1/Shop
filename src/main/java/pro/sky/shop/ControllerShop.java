package pro.sky.shop;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "/order")
public class ControllerShop {
    private ServiceShop serviceShop;

    public ControllerShop(ServiceShop serviceShop) {
        this.serviceShop = serviceShop;
    }

    @GetMapping(path = "/add")
    public List<Integer> addProduct(@RequestParam("id") List<Integer> id) {
        return serviceShop.addProduct(id);
    }

    @GetMapping(path = "/get")
    public String get() {
        try {
            return serviceShop.get();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
