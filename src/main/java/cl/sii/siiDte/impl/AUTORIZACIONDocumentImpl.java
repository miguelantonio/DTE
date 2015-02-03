/*
 * An XML document type.
 * Localname: AUTORIZACION
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.AUTORIZACIONDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * A document containing one AUTORIZACION(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class AUTORIZACIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.AUTORIZACIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public AUTORIZACIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTORIZACION$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "AUTORIZACION");
    
    
    /**
     * Gets the "AUTORIZACION" element
     */
    public cl.sii.siiDte.AutorizacionType getAUTORIZACION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.AutorizacionType target = null;
            target = (cl.sii.siiDte.AutorizacionType)get_store().find_element_user(AUTORIZACION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AUTORIZACION" element
     */
    public void setAUTORIZACION(cl.sii.siiDte.AutorizacionType autorizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.AutorizacionType target = null;
            target = (cl.sii.siiDte.AutorizacionType)get_store().find_element_user(AUTORIZACION$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.AutorizacionType)get_store().add_element_user(AUTORIZACION$0);
            }
            target.set(autorizacion);
        }
    }
    
    /**
     * Appends and returns a new empty "AUTORIZACION" element
     */
    public cl.sii.siiDte.AutorizacionType addNewAUTORIZACION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.AutorizacionType target = null;
            target = (cl.sii.siiDte.AutorizacionType)get_store().add_element_user(AUTORIZACION$0);
            return target;
        }
    }
}
