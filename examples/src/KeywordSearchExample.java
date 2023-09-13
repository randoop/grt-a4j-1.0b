/*
Copyright (c) 2003, Ken Cochrane
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted
provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

    * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

    * Neither the name of Ken Cochrane nor the names of its contributors may be used to endorse
    or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

*/
import net.kencochrane.a4j.A4j;
import net.kencochrane.a4j.beans.ProductInfo;
import net.kencochrane.a4j.beans.ProductDetails;

import java.util.ArrayList;

/**
 * http://www.KenCochrane.net/a4j/
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 9:23:25 PM
 * 
 * 
 */
public class KeywordSearchExample {
    public static void main(String[] args) {
        A4j arj = new A4j();
        String searchString = "ken";
        String productLine = "books";
        String type = "lite";
        String page = "1";
        ProductInfo product = arj.KeywordSearch(searchString,productLine,type,page);
        if(product != null){
            System.out.println("Print out # of results\n----");
            System.out.println(product.getTotalResults()+ " results in " + product.getTotalPages() + " pages");
            System.out.println("--------");
            System.out.println("Print out Products and prices for page = " + page+"\n---");
            ArrayList products = product.getProductsArrayList();
            if(products != null && products.size() > 0){
                String prodName = null;
                String prodPrice = null;
                for(int x=0;x < products.size();x++){
                    ProductDetails prodDetails = (ProductDetails)products.get(x);
                    prodName = prodDetails.getProductName();
                    prodPrice = prodDetails.getOurPrice();
                    System.out.println(prodName + " " + prodPrice);
                }
            }
            System.out.println("All finished!");
        }else{
            System.out.println("There was an error!");
        }
    }
}
