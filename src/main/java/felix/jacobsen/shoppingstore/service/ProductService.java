package felix.jacobsen.shoppingstore.service;

import felix.jacobsen.shoppingstore.model.Product;
import felix.jacobsen.shoppingstore.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository mRepository;

    public Product addProduct(Product product){
        return mRepository.save(product);
    }

    public Optional<Product> findById(Long id){
        return mRepository.findById(id);
    }

    public void deleteById(Long id, Product inProduct){
        mRepository.deleteById(inProduct.getId());
    }

    public List<Product> findAllProducts(){
       return mRepository.findAll();
    }
}
