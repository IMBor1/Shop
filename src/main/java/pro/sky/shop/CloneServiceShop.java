package pro.sky.shop;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@SessionScope
@Service
public class CloneServiceShop {


    private final List<Integer> id;

    public CloneServiceShop(List<Integer> id) {
        this.id = id;
    }

    public void add(List<Integer> id) {

        this.id.addAll(id);

    }

    public List<Integer> get() {
        return id;
    }
}


