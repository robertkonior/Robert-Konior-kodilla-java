package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product cabel = new Product("Cabel");
        Product socket = new Product("Socket");
        Product router = new Product("Router");
        Item firstItem = new Item(cabel, BigDecimal.TEN,2);
        Item secondItem = new Item(socket,BigDecimal.valueOf(30.0),1);

        Invoice invoice= new Invoice("No.1");

        firstItem.setInvoice(invoice);
        secondItem.setInvoice(invoice);
        List<Item> testedItems = new ArrayList<>();
        testedItems.add(firstItem);
        testedItems.add(secondItem);

        invoice.setItems(testedItems);

        //When
        invoiceDao.save(invoice);

        int invId = invoice.getId();
        int itemsSize = invoice.getItems().size();

        Invoice invoiceFromDB = invoiceDao.findById(invId);
        //Then
        try {
            Assert.assertEquals(invId,invoiceFromDB.getId());
            Assert.assertEquals(2,itemsSize);
            Assert.assertEquals(itemsSize,invoiceFromDB.getItems().size());
        }finally {
            //CleanUp
            invoiceDao.delete(invId);
        }

    }
}
