
package pe.cibertec.ecommerce.ApiProduct.service;

import java.util.List;
import org.springframework.data.domain.Page;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;


public interface ProductService {
    public List<Product> findAll();
    
    public Page<Product>findAll(int page, int size);
    public Product findById(Long id);
    public Product findByProductName(String productName);
    public Product add(Product product);
    public Product update(Product product);
    public void delete(Long id);
}
