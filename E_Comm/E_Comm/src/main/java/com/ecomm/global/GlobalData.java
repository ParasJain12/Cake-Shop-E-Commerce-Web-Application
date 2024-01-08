package com.ecomm.global;

import com.ecomm.model.Product;
import java.util.List;
import java.util.ArrayList;

public class GlobalData {
   public static List<Product> cart;
   static {
	   cart = new ArrayList<Product>();
   }
}
