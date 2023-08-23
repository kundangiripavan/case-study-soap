
package com.training.prodsvc;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductServiceImpl", targetNamespace = "http://prodsvc.training.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductServiceImpl {


    /**
     * 
     * @return
     *     returns java.util.List<com.training.prodsvc.Product>
     */
    @WebMethod
    @WebResult(name = "getProdInfoReturn", targetNamespace = "http://prodsvc.training.com")
    @RequestWrapper(localName = "getProdInfo", targetNamespace = "http://prodsvc.training.com", className = "com.training.prodsvc.GetProdInfo")
    @ResponseWrapper(localName = "getProdInfoResponse", targetNamespace = "http://prodsvc.training.com", className = "com.training.prodsvc.GetProdInfoResponse")
    public List<Product> getProdInfo();

    /**
     * 
     * @param p
     */
    @WebMethod
    @RequestWrapper(localName = "deleteProduct", targetNamespace = "http://prodsvc.training.com", className = "com.training.prodsvc.DeleteProduct")
    @ResponseWrapper(localName = "deleteProductResponse", targetNamespace = "http://prodsvc.training.com", className = "com.training.prodsvc.DeleteProductResponse")
    public void deleteProduct(
        @WebParam(name = "p", targetNamespace = "http://prodsvc.training.com")
        Product p);

    /**
     * 
     * @param p
     */
    @WebMethod
    @RequestWrapper(localName = "updateProduct", targetNamespace = "http://prodsvc.training.com", className = "com.training.prodsvc.UpdateProduct")
    @ResponseWrapper(localName = "updateProductResponse", targetNamespace = "http://prodsvc.training.com", className = "com.training.prodsvc.UpdateProductResponse")
    public void updateProduct(
        @WebParam(name = "p", targetNamespace = "http://prodsvc.training.com")
        Product p);

    /**
     * 
     * @param p
     */
    @WebMethod
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://prodsvc.training.com", className = "com.training.prodsvc.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://prodsvc.training.com", className = "com.training.prodsvc.AddProductResponse")
    public void addProduct(
        @WebParam(name = "p", targetNamespace = "http://prodsvc.training.com")
        Product p);

}
