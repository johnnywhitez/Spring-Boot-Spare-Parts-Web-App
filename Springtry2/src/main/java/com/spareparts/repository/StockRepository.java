package com.spareparts.repository;


import org.springframework.data.jpa.repository.*;
import com.spareparts.entity.*;


public interface StockRepository extends JpaRepository<Stock, Long>{

}
