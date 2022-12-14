package felix.jacobsen.shoppingstore.controller;

import felix.jacobsen.shoppingstore.model.Product;
import felix.jacobsen.shoppingstore.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService mProductService;

    @PostMapping
    public void addProduct(@RequestBody Product inProduct){
        mProductService.addProduct(inProduct);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return mProductService.findAllProducts();
    }

    @GetMapping("{id}")
    public ResponseEntity<Iterable<Product>> findProductById(@PathVariable Long id) throws Exception {
        Iterable<Product> theProducts = mProductService.findAllProducts();
        if(theProducts.iterator().hasNext()){
            throw new Exception("Product with id: " + id + " cannot be found");
        }
        return new ResponseEntity<>(theProducts,HttpStatus.OK);
    }
}
