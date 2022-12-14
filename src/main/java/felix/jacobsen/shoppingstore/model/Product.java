package felix.jacobsen.shoppingstore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private Long id;
    private String name;
    private BigDecimal price;
    private Integer available;
    private String description;
    private String manufacturer;


    private static class ProductBuilder{
        private String name;
        private BigDecimal price;
        private String description;
        private String manufacturer;

        public ProductBuilder name(String name){
            this.name = name;
            return this;
        }

        private ProductBuilder price(BigDecimal price){
            this.price = price;
            return this;
        }

        public ProductBuilder description(String description){
            this.description = description;
            return this;
        }

        public ProductBuilder manufacturer(String manufacturer){
            this.manufacturer = manufacturer;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }

    private Product(ProductBuilder productBuilder){
        name = productBuilder.name;
        price = productBuilder.price;
        description = productBuilder.description;
        manufacturer = productBuilder.manufacturer;
    }
    public Product(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
