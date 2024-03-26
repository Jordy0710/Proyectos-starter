
package pe.cibertec.ecommerce.ApiProduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
    //Aca añadimos 1 funcion mas a nuestros metodos aparte del Findall
    //FindByID
    //POST
    Product findByProductName(String productName);
}
