package patika.patikaStore.business.concretes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.aspectj.weaver.reflect.ArgNameFinder;
import org.springframework.stereotype.Service;
import patika.patikaStore.business.abstracts.BrandService;
import patika.patikaStore.dataAccess.abstracts.BrandDao;
import patika.patikaStore.entities.Brand;

@Service
public class BrandManager implements BrandService {
  
    @Override
    public ArrayList<Brand> getAllBrands() {
        ArrayList<Brand> brands= new  ArrayList<Brand>();
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));
        Collections.sort(brands, Comparator.comparing(Brand::getName));        
        System.out.println("Markalarımız :");
        System.out.println("----------------");
        for(Brand brand:brands)  {
        System.out.println(brand.getName());  
        }   
        return brands;
     }  
    }
    


