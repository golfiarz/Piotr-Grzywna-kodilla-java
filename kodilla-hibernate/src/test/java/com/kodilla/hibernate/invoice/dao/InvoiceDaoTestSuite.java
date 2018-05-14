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
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product burak = new Product("burak");
        Product cebula = new Product("cebula");
        Product por = new Product("por");

        productDao.save(burak);
        productDao.save(cebula);
        productDao.save(por);

        Item aaa = new Item(new BigDecimal("111"), 2, new BigDecimal("222"));
        aaa.setProduct(burak);
        Item bbb = new Item(new BigDecimal("10"), 3, new BigDecimal("30"));
        bbb.setProduct(cebula);
        Item ccc = new Item(new BigDecimal("1"), 5, new BigDecimal("5"));
        ccc.setProduct(por);
        Item ddd = new Item(new BigDecimal("5"), 5, new BigDecimal("5"));
        ddd.setProduct(cebula);

        Invoice invoice1 = new Invoice("1");
        Invoice invoice2 = new Invoice("2");
        Invoice invoice3 = new Invoice("3");

        invoice1.getItems().add(aaa);
        invoice1.getItems().add(bbb);

        invoice2.getItems().add(ccc);
        invoice2.getItems().add(ddd);

        aaa.setInvoice(invoice1);
        bbb.setInvoice(invoice1);
        ccc.setInvoice(invoice2);
        ddd.setInvoice(invoice2);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        invoiceDao.save(invoice2);
        int id2 = invoice2.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertNotEquals(0, id2);

        //Clean up
        invoiceDao.delete(id);
        invoiceDao.delete(id2);
    }
}