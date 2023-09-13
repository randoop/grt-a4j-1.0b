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
package net.kencochrane.a4j.beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * http://www.KenCochrane.net
 * Ken Cochrane
 * Date: Jul 6, 2003
 * Time: 5:00:56 PM
 *
 *
 */
public class RecentlyViewed implements Serializable {

    private ArrayList products = new ArrayList();

    public void addProduct(MiniProduct miniProd) {
        if (miniProd != null && !(isInList(miniProd.getAsin()))) {
            products.add(miniProd);
        }
    }

    public ArrayList getProducts() {
        return products;
    }

    public int getNumProducts() {
        return products.size();
    }

    public boolean isInList(String asin) {
        boolean isIn = false;

        if (products != null && products.size() > 0) {
            MiniProduct mp = null;
            for (int x = 0; x < products.size(); x++) {
                mp = (MiniProduct) products.get(x);
                if (mp != null) {
                    if (mp.getAsin() != null && mp.getAsin().trim().equalsIgnoreCase(asin.trim())) {
                        isIn = true;
                        break;
                    }
                }
            }
        }

        return isIn;
    }
}
