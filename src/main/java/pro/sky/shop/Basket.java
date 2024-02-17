package pro.sky.shop;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<Integer> id;

    public Basket(List<Integer> id) {
        this.id = id;
    }

    public List<Integer> getId() {
        return id;
    }

    public List<Integer> add(List<Integer> items) {
        if (items != null) {
            id.addAll(items);
        }
        return id;
    }
}