package in.strikes.springTestingDemo;

import in.strikes.springTestingDemo.entity.Product;
import in.strikes.springTestingDemo.repository.ProductRepository;
import in.strikes.springTestingDemo.repository.ProductRepositoryTest;
import in.strikes.springTestingDemo.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;


    @Test
    void shouldReturnProductWhenProductExist(){

        Product product = new Product(1L,"laptop",50000,10);

        when(productRepository.findById(1L))
                .thenReturn(Optional.of(product));

        Product actualResult = productService.getProductById(1L);
        assertEquals(1L,actualResult.getId());
        assertEquals("laptop",actualResult.getName());
        assertEquals(10,actualResult.getStock());
        assertEquals(50000,actualResult.getPrice());


        verify(productRepository.findById(1L));


    }




}
