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

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("p1");
        Product product2 = new Product("p2");
        Item item1 = new Item(new BigDecimal(1), 2);
        Item item2 = new Item(new BigDecimal(3), 4);
        Invoice invoice = new Invoice("InvoiceNo1");

        item1.setProduct(product1);
        item1.setInvoice(invoice);
        item2.setProduct(product2);
        item2.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        productDao.save(product1);
        int prod1Id = product1.getId();
        productDao.save(product2);
        int prod2Id = product2.getId();
        invoiceDao.save(invoice);
        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();
        int invoiceId = invoice.getId();
        //Then
        Assert.assertNotEquals(0,invoiceId);

        //CleanUp
        try {
            invoiceDao.delete(invoiceId);
            productDao.delete(prod1Id);
            System.out.println(prod1Id);
            productDao.delete(prod2Id);
            itemDao.delete(item1Id);
            itemDao.delete(item2Id);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
