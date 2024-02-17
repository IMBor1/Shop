package pro.sky.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class CloneControllerShop {


    private CloneServiceShop cloneServiceShop;

    public CloneControllerShop(CloneServiceShop cloneServiceShop) {
        this.cloneServiceShop = cloneServiceShop;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") List<Integer> id) {
        cloneServiceShop.add(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {

        return cloneServiceShop.get();

    }
}


