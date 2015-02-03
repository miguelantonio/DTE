/*
 * An XML document type.
 * Localname: Recibo
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.ReciboDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * A document containing one Recibo(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class ReciboDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.ReciboDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReciboDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIBO$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Recibo");
    
    
    /**
     * Gets the "Recibo" element
     */
    public cl.sii.siiDte.ReciboDefType getRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.ReciboDefType target = null;
            target = (cl.sii.siiDte.ReciboDefType)get_store().find_element_user(RECIBO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Recibo" element
     */
    public void setRecibo(cl.sii.siiDte.ReciboDefType recibo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.ReciboDefType target = null;
            target = (cl.sii.siiDte.ReciboDefType)get_store().find_element_user(RECIBO$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.ReciboDefType)get_store().add_element_user(RECIBO$0);
            }
            target.set(recibo);
        }
    }
    
    /**
     * Appends and returns a new empty "Recibo" element
     */
    public cl.sii.siiDte.ReciboDefType addNewRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.ReciboDefType target = null;
            target = (cl.sii.siiDte.ReciboDefType)get_store().add_element_user(RECIBO$0);
            return target;
        }
    }
}
