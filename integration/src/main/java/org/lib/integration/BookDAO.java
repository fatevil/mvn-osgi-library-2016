/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lib.integration;

import java.util.Collection;
import org.lib.model.MyBook;

public interface BookDAO {

    public void create(MyBook book);

    Collection<MyBook> all();
}
