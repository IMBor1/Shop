package pro.sky.shop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceShop {
    private Basket basket;
    ObjectMapper objectMapper = new ObjectMapper();

    public ServiceShop(Basket basket) {
        this.basket = basket;
    }

    public List<Integer> addProduct(List<Integer> item) {
        return basket.add(item);
    }

    public String get() throws JsonProcessingException {
        return objectMapper.writeValueAsString(basket.getId());
    }
}
