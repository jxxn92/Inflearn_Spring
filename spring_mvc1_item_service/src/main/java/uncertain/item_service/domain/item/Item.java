package uncertain.item_service.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Getter
@Setter
public class Item {

    private Long id;

    private String itemName;

    // Integer 사용 이유 => 0이 들어가는 상황도 존재한다.
    private Integer price;

    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
