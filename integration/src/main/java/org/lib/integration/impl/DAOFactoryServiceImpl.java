/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lib.integration.impl;

import org.lib.integration.BookDAO;
import org.lib.integration.DAOFactoryService;

public class DAOFactoryServiceImpl extends DAOFactoryService {

    public DAOFactoryServiceImpl() {
    }

    @Override
    public BookDAO getBookDAO() {
        return new BookDAODefault();
    }

}
