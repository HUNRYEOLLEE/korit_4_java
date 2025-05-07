package ch19_generic.products;
/*
     1. ProductController.java를 생성하고, 다양한 타입의
     상품 정보를 저장하고, 출력하는 코드를 작성하시오.

     실행 예
        Product(productName = Laptop, productInfo = Intel 17, 16GB RAM, 512GB SSD)     String
        Product(productName = Smartphone, productInfo = 799.99)     Double
        Product(productName = Available, productInfo = true)    Boolean

 */

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString   // @Data를 달아서 해결하는 방법,
            // alt + Ins를 통해 toString() 메서드를 재정의하는 방법도 있음.
public class Product<T> {
    private String productName;
    private T productInfo;


}
