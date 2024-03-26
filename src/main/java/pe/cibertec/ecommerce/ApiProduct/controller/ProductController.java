
package pe.cibertec.ecommerce.ApiProduct.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;
import pe.cibertec.ecommerce.ApiProduct.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @GetMapping("/findAll/page/{page}/size/{size}")
    public ResponseEntity<Page<Product>> findAll(@PathVariable int page, @PathVariable int size){
        return new ResponseEntity<>(productService.findAll(page, size),HttpStatus.OK);
    } 
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Product>>  findAll(){
        return new ResponseEntity<>(productService.findAll(),
                HttpStatus.OK); 
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return new ResponseEntity<>(productService.findById(id),
                HttpStatus.OK);
    }
    @GetMapping("/findByProductName/{productName}")
    public ResponseEntity<Product> findByProductName(@PathVariable String productName){
        return new ResponseEntity<>(productService.findByProductName(productName),
                HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Product> add(@RequestBody Product product){
        return new ResponseEntity<>(productService.add(product),
                HttpStatus.OK) ;
    }
    
    @PutMapping("/update")
    public ResponseEntity<Product> update(@RequestBody Product product){
        return new ResponseEntity<>(productService.update(product),
                HttpStatus.OK) ;
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }
}
