/*
 * XML Type:  BOLETADefType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.boletas.BOLETADefType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.boletas.impl;
/**
 * An XML BOLETADefType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public class BOLETADefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType
{
    private static final long serialVersionUID = 1L;
    
    public BOLETADefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      
     */
    public void timbrar(cl.sii.siiDte.CAFType p0, java.security.PrivateKey p1) throws cl.nic.dte.TimbreException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException
    {
        
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      .timbrar(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyTimbre() throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, java.security.InvalidKeyException, java.security.SignatureException
    {
        return 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      .verifyTimbre(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.BOLETADefTypeExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTO$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Documento");
    private static final javax.xml.namespace.QName SIGNATURE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("", "version");
    
    
    /**
     * Gets the "Documento" element
     */
    public cl.sii.siiDte.boletas.BOLETADefType.Documento getDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.boletas.BOLETADefType.Documento target = null;
            target = (cl.sii.siiDte.boletas.BOLETADefType.Documento)get_store().find_element_user(DOCUMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Documento" element
     */
    public void setDocumento(cl.sii.siiDte.boletas.BOLETADefType.Documento documento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.boletas.BOLETADefType.Documento target = null;
            target = (cl.sii.siiDte.boletas.BOLETADefType.Documento)get_store().find_element_user(DOCUMENTO$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento)get_store().add_element_user(DOCUMENTO$0);
            }
            target.set(documento);
        }
    }
    
    /**
     * Appends and returns a new empty "Documento" element
     */
    public cl.sii.siiDte.boletas.BOLETADefType.Documento addNewDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.boletas.BOLETADefType.Documento target = null;
            target = (cl.sii.siiDte.boletas.BOLETADefType.Documento)get_store().add_element_user(DOCUMENTO$0);
            return target;
        }
    }
    
    /**
     * Gets the "Signature" element
     */
    public cl.sii.siiDte.dsig.SignatureType getSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.dsig.SignatureType target = null;
            target = (cl.sii.siiDte.dsig.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Signature" element
     */
    public void setSignature(cl.sii.siiDte.dsig.SignatureType signature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.dsig.SignatureType target = null;
            target = (cl.sii.siiDte.dsig.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.dsig.SignatureType)get_store().add_element_user(SIGNATURE$2);
            }
            target.set(signature);
        }
    }
    
    /**
     * Appends and returns a new empty "Signature" element
     */
    public cl.sii.siiDte.dsig.SignatureType addNewSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.dsig.SignatureType target = null;
            target = (cl.sii.siiDte.dsig.SignatureType)get_store().add_element_user(SIGNATURE$2);
            return target;
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.math.BigDecimal getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_default_attribute_value(VERSION$4);
            }
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.math.BigDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
            }
            target.setBigDecimalValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$4);
            }
            target.set(version);
        }
    }
    /**
     * An XML Documento(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class DocumentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento
    {
        private static final long serialVersionUID = 1L;
        
        public DocumentoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENCABEZADO$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Encabezado");
        private static final javax.xml.namespace.QName DETALLE$2 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Detalle");
        private static final javax.xml.namespace.QName SUBTOTINFO$4 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SubTotInfo");
        private static final javax.xml.namespace.QName DSCRCGGLOBAL$6 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DscRcgGlobal");
        private static final javax.xml.namespace.QName REFERENCIA$8 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Referencia");
        private static final javax.xml.namespace.QName TED$10 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TED");
        private static final javax.xml.namespace.QName TMSTFIRMA$12 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TmstFirma");
        private static final javax.xml.namespace.QName ID$14 = 
            new javax.xml.namespace.QName("", "ID");
        
        
        /**
         * Gets the "Encabezado" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado getEncabezado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado)get_store().find_element_user(ENCABEZADO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Encabezado" element
         */
        public void setEncabezado(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado encabezado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado)get_store().find_element_user(ENCABEZADO$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado)get_store().add_element_user(ENCABEZADO$0);
                }
                target.set(encabezado);
            }
        }
        
        /**
         * Appends and returns a new empty "Encabezado" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado addNewEncabezado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado)get_store().add_element_user(ENCABEZADO$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "Detalle" elements
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle[] getDetalleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DETALLE$2, targetList);
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle[] result = new cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Detalle" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle getDetalleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle)get_store().find_element_user(DETALLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Detalle" element
         */
        public int sizeOfDetalleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DETALLE$2);
            }
        }
        
        /**
         * Sets array of all "Detalle" element
         */
        public void setDetalleArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle[] detalleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(detalleArray, DETALLE$2);
            }
        }
        
        /**
         * Sets ith "Detalle" element
         */
        public void setDetalleArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle detalle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle)get_store().find_element_user(DETALLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(detalle);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Detalle" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle insertNewDetalle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle)get_store().insert_element_user(DETALLE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Detalle" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle addNewDetalle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle)get_store().add_element_user(DETALLE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Detalle" element
         */
        public void removeDetalle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DETALLE$2, i);
            }
        }
        
        /**
         * Gets array of all "SubTotInfo" elements
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo[] getSubTotInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBTOTINFO$4, targetList);
                cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo[] result = new cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SubTotInfo" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo getSubTotInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo)get_store().find_element_user(SUBTOTINFO$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SubTotInfo" element
         */
        public int sizeOfSubTotInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBTOTINFO$4);
            }
        }
        
        /**
         * Sets array of all "SubTotInfo" element
         */
        public void setSubTotInfoArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo[] subTotInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subTotInfoArray, SUBTOTINFO$4);
            }
        }
        
        /**
         * Sets ith "SubTotInfo" element
         */
        public void setSubTotInfoArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo subTotInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo)get_store().find_element_user(SUBTOTINFO$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subTotInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SubTotInfo" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo insertNewSubTotInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo)get_store().insert_element_user(SUBTOTINFO$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SubTotInfo" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo addNewSubTotInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo)get_store().add_element_user(SUBTOTINFO$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "SubTotInfo" element
         */
        public void removeSubTotInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBTOTINFO$4, i);
            }
        }
        
        /**
         * Gets array of all "DscRcgGlobal" elements
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal[] getDscRcgGlobalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DSCRCGGLOBAL$6, targetList);
                cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal[] result = new cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DscRcgGlobal" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal getDscRcgGlobalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal)get_store().find_element_user(DSCRCGGLOBAL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DscRcgGlobal" element
         */
        public int sizeOfDscRcgGlobalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DSCRCGGLOBAL$6);
            }
        }
        
        /**
         * Sets array of all "DscRcgGlobal" element
         */
        public void setDscRcgGlobalArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal[] dscRcgGlobalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dscRcgGlobalArray, DSCRCGGLOBAL$6);
            }
        }
        
        /**
         * Sets ith "DscRcgGlobal" element
         */
        public void setDscRcgGlobalArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal dscRcgGlobal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal)get_store().find_element_user(DSCRCGGLOBAL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dscRcgGlobal);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DscRcgGlobal" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal insertNewDscRcgGlobal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal)get_store().insert_element_user(DSCRCGGLOBAL$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DscRcgGlobal" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal addNewDscRcgGlobal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal)get_store().add_element_user(DSCRCGGLOBAL$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "DscRcgGlobal" element
         */
        public void removeDscRcgGlobal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DSCRCGGLOBAL$6, i);
            }
        }
        
        /**
         * Gets array of all "Referencia" elements
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia[] getReferenciaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REFERENCIA$8, targetList);
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia[] result = new cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Referencia" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia getReferenciaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia)get_store().find_element_user(REFERENCIA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Referencia" element
         */
        public int sizeOfReferenciaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERENCIA$8);
            }
        }
        
        /**
         * Sets array of all "Referencia" element
         */
        public void setReferenciaArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia[] referenciaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(referenciaArray, REFERENCIA$8);
            }
        }
        
        /**
         * Sets ith "Referencia" element
         */
        public void setReferenciaArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia referencia)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia)get_store().find_element_user(REFERENCIA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(referencia);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Referencia" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia insertNewReferencia(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia)get_store().insert_element_user(REFERENCIA$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Referencia" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia addNewReferencia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia)get_store().add_element_user(REFERENCIA$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Referencia" element
         */
        public void removeReferencia(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERENCIA$8, i);
            }
        }
        
        /**
         * Gets the "TED" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED getTED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED)get_store().find_element_user(TED$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "TED" element
         */
        public void setTED(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED ted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED)get_store().find_element_user(TED$10, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED)get_store().add_element_user(TED$10);
                }
                target.set(ted);
            }
        }
        
        /**
         * Appends and returns a new empty "TED" element
         */
        public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED addNewTED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED target = null;
                target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED)get_store().add_element_user(TED$10);
                return target;
            }
        }
        
        /**
         * Gets the "TmstFirma" element
         */
        public java.util.Calendar getTmstFirma()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMA$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "TmstFirma" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetTmstFirma()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMA$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TmstFirma" element
         */
        public void setTmstFirma(java.util.Calendar tmstFirma)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMA$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTFIRMA$12);
                }
                target.setCalendarValue(tmstFirma);
            }
        }
        
        /**
         * Sets (as xml) the "TmstFirma" element
         */
        public void xsetTmstFirma(org.apache.xmlbeans.XmlDateTime tmstFirma)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMA$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TMSTFIRMA$12);
                }
                target.set(tmstFirma);
            }
        }
        
        /**
         * Gets the "ID" attribute
         */
        public java.lang.String getID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ID" attribute
         */
        public org.apache.xmlbeans.XmlID xgetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
                return target;
            }
        }
        
        /**
         * Sets the "ID" attribute
         */
        public void setID(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "ID" attribute
         */
        public void xsetID(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$14);
                }
                target.set(id);
            }
        }
        /**
         * An XML Encabezado(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class EncabezadoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado
        {
            private static final long serialVersionUID = 1L;
            
            public EncabezadoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IDDOC$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IdDoc");
            private static final javax.xml.namespace.QName EMISOR$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Emisor");
            private static final javax.xml.namespace.QName RECEPTOR$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Receptor");
            private static final javax.xml.namespace.QName TOTALES$6 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Totales");
            
            
            /**
             * Gets the "IdDoc" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc getIdDoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc)get_store().find_element_user(IDDOC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "IdDoc" element
             */
            public void setIdDoc(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc idDoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc)get_store().find_element_user(IDDOC$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc)get_store().add_element_user(IDDOC$0);
                    }
                    target.set(idDoc);
                }
            }
            
            /**
             * Appends and returns a new empty "IdDoc" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc addNewIdDoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc)get_store().add_element_user(IDDOC$0);
                    return target;
                }
            }
            
            /**
             * Gets the "Emisor" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor getEmisor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor)get_store().find_element_user(EMISOR$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Emisor" element
             */
            public void setEmisor(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor emisor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor)get_store().find_element_user(EMISOR$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor)get_store().add_element_user(EMISOR$2);
                    }
                    target.set(emisor);
                }
            }
            
            /**
             * Appends and returns a new empty "Emisor" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor addNewEmisor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor)get_store().add_element_user(EMISOR$2);
                    return target;
                }
            }
            
            /**
             * Gets the "Receptor" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor getReceptor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor)get_store().find_element_user(RECEPTOR$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Receptor" element
             */
            public void setReceptor(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor receptor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor)get_store().find_element_user(RECEPTOR$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor)get_store().add_element_user(RECEPTOR$4);
                    }
                    target.set(receptor);
                }
            }
            
            /**
             * Appends and returns a new empty "Receptor" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor addNewReceptor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor)get_store().add_element_user(RECEPTOR$4);
                    return target;
                }
            }
            
            /**
             * Gets the "Totales" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales getTotales()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales)get_store().find_element_user(TOTALES$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Totales" element
             */
            public void setTotales(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales totales)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales)get_store().find_element_user(TOTALES$6, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales)get_store().add_element_user(TOTALES$6);
                    }
                    target.set(totales);
                }
            }
            
            /**
             * Appends and returns a new empty "Totales" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales addNewTotales()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales)get_store().add_element_user(TOTALES$6);
                    return target;
                }
            }
            /**
             * An XML IdDoc(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class IdDocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc
            {
                private static final long serialVersionUID = 1L;
                
                public IdDocImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TIPODTE$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoDTE");
                private static final javax.xml.namespace.QName FOLIO$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Folio");
                private static final javax.xml.namespace.QName FCHEMIS$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchEmis");
                private static final javax.xml.namespace.QName INDSERVICIO$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IndServicio");
                private static final javax.xml.namespace.QName INDMNTNETO$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IndMntNeto");
                private static final javax.xml.namespace.QName PERIODODESDE$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PeriodoDesde");
                private static final javax.xml.namespace.QName PERIODOHASTA$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PeriodoHasta");
                private static final javax.xml.namespace.QName FCHVENC$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchVenc");
                
                
                /**
                 * Gets the "TipoDTE" element
                 */
                public java.math.BigInteger getTipoDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODTE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoDTE" element
                 */
                public cl.sii.siiDte.boletas.DTEType xgetTipoDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.DTEType target = null;
                      target = (cl.sii.siiDte.boletas.DTEType)get_store().find_element_user(TIPODTE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TipoDTE" element
                 */
                public void setTipoDTE(java.math.BigInteger tipoDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODTE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODTE$0);
                      }
                      target.setBigIntegerValue(tipoDTE);
                    }
                }
                
                /**
                 * Sets (as xml) the "TipoDTE" element
                 */
                public void xsetTipoDTE(cl.sii.siiDte.boletas.DTEType tipoDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.DTEType target = null;
                      target = (cl.sii.siiDte.boletas.DTEType)get_store().find_element_user(TIPODTE$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.DTEType)get_store().add_element_user(TIPODTE$0);
                      }
                      target.set(tipoDTE);
                    }
                }
                
                /**
                 * Gets the "Folio" element
                 */
                public long getFolio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$2, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Folio" element
                 */
                public cl.sii.siiDte.boletas.FolioType xgetFolio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.FolioType target = null;
                      target = (cl.sii.siiDte.boletas.FolioType)get_store().find_element_user(FOLIO$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Folio" element
                 */
                public void setFolio(long folio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIO$2);
                      }
                      target.setLongValue(folio);
                    }
                }
                
                /**
                 * Sets (as xml) the "Folio" element
                 */
                public void xsetFolio(cl.sii.siiDte.boletas.FolioType folio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.FolioType target = null;
                      target = (cl.sii.siiDte.boletas.FolioType)get_store().find_element_user(FOLIO$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.FolioType)get_store().add_element_user(FOLIO$2);
                      }
                      target.set(folio);
                    }
                }
                
                /**
                 * Gets the "FchEmis" element
                 */
                public java.util.Calendar getFchEmis()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMIS$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchEmis" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchEmis()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMIS$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FchEmis" element
                 */
                public void setFchEmis(java.util.Calendar fchEmis)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMIS$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHEMIS$4);
                      }
                      target.setCalendarValue(fchEmis);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchEmis" element
                 */
                public void xsetFchEmis(org.apache.xmlbeans.XmlDate fchEmis)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMIS$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHEMIS$4);
                      }
                      target.set(fchEmis);
                    }
                }
                
                /**
                 * Gets the "IndServicio" element
                 */
                public java.math.BigInteger getIndServicio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDSERVICIO$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IndServicio" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio xgetIndServicio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio)get_store().find_element_user(INDSERVICIO$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "IndServicio" element
                 */
                public void setIndServicio(java.math.BigInteger indServicio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDSERVICIO$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDSERVICIO$6);
                      }
                      target.setBigIntegerValue(indServicio);
                    }
                }
                
                /**
                 * Sets (as xml) the "IndServicio" element
                 */
                public void xsetIndServicio(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio indServicio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio)get_store().find_element_user(INDSERVICIO$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio)get_store().add_element_user(INDSERVICIO$6);
                      }
                      target.set(indServicio);
                    }
                }
                
                /**
                 * Gets the "IndMntNeto" element
                 */
                public java.math.BigInteger getIndMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDMNTNETO$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IndMntNeto" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto xgetIndMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto)get_store().find_element_user(INDMNTNETO$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IndMntNeto" element
                 */
                public boolean isSetIndMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDMNTNETO$8) != 0;
                    }
                }
                
                /**
                 * Sets the "IndMntNeto" element
                 */
                public void setIndMntNeto(java.math.BigInteger indMntNeto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDMNTNETO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDMNTNETO$8);
                      }
                      target.setBigIntegerValue(indMntNeto);
                    }
                }
                
                /**
                 * Sets (as xml) the "IndMntNeto" element
                 */
                public void xsetIndMntNeto(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto indMntNeto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto)get_store().find_element_user(INDMNTNETO$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto)get_store().add_element_user(INDMNTNETO$8);
                      }
                      target.set(indMntNeto);
                    }
                }
                
                /**
                 * Unsets the "IndMntNeto" element
                 */
                public void unsetIndMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDMNTNETO$8, 0);
                    }
                }
                
                /**
                 * Gets the "PeriodoDesde" element
                 */
                public java.util.Calendar getPeriodoDesde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODODESDE$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PeriodoDesde" element
                 */
                public org.apache.xmlbeans.XmlDate xgetPeriodoDesde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PERIODODESDE$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "PeriodoDesde" element
                 */
                public boolean isSetPeriodoDesde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PERIODODESDE$10) != 0;
                    }
                }
                
                /**
                 * Sets the "PeriodoDesde" element
                 */
                public void setPeriodoDesde(java.util.Calendar periodoDesde)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODODESDE$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODODESDE$10);
                      }
                      target.setCalendarValue(periodoDesde);
                    }
                }
                
                /**
                 * Sets (as xml) the "PeriodoDesde" element
                 */
                public void xsetPeriodoDesde(org.apache.xmlbeans.XmlDate periodoDesde)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PERIODODESDE$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PERIODODESDE$10);
                      }
                      target.set(periodoDesde);
                    }
                }
                
                /**
                 * Unsets the "PeriodoDesde" element
                 */
                public void unsetPeriodoDesde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PERIODODESDE$10, 0);
                    }
                }
                
                /**
                 * Gets the "PeriodoHasta" element
                 */
                public java.util.Calendar getPeriodoHasta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOHASTA$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PeriodoHasta" element
                 */
                public org.apache.xmlbeans.XmlDate xgetPeriodoHasta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PERIODOHASTA$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "PeriodoHasta" element
                 */
                public boolean isSetPeriodoHasta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PERIODOHASTA$12) != 0;
                    }
                }
                
                /**
                 * Sets the "PeriodoHasta" element
                 */
                public void setPeriodoHasta(java.util.Calendar periodoHasta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOHASTA$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODOHASTA$12);
                      }
                      target.setCalendarValue(periodoHasta);
                    }
                }
                
                /**
                 * Sets (as xml) the "PeriodoHasta" element
                 */
                public void xsetPeriodoHasta(org.apache.xmlbeans.XmlDate periodoHasta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PERIODOHASTA$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PERIODOHASTA$12);
                      }
                      target.set(periodoHasta);
                    }
                }
                
                /**
                 * Unsets the "PeriodoHasta" element
                 */
                public void unsetPeriodoHasta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PERIODOHASTA$12, 0);
                    }
                }
                
                /**
                 * Gets the "FchVenc" element
                 */
                public java.util.Calendar getFchVenc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHVENC$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchVenc" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchVenc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHVENC$14, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "FchVenc" element
                 */
                public boolean isSetFchVenc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FCHVENC$14) != 0;
                    }
                }
                
                /**
                 * Sets the "FchVenc" element
                 */
                public void setFchVenc(java.util.Calendar fchVenc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHVENC$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHVENC$14);
                      }
                      target.setCalendarValue(fchVenc);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchVenc" element
                 */
                public void xsetFchVenc(org.apache.xmlbeans.XmlDate fchVenc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHVENC$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHVENC$14);
                      }
                      target.set(fchVenc);
                    }
                }
                
                /**
                 * Unsets the "FchVenc" element
                 */
                public void unsetFchVenc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FCHVENC$14, 0);
                    }
                }
                /**
                 * An XML IndServicio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$IdDoc$IndServicio.
                 */
                public static class IndServicioImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IndServicioImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected IndServicioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML IndMntNeto(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$IdDoc$IndMntNeto.
                 */
                public static class IndMntNetoImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IndMntNetoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected IndMntNetoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML Emisor(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class EmisorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor
            {
                private static final long serialVersionUID = 1L;
                
                public EmisorImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RUTEMISOR$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTEmisor");
                private static final javax.xml.namespace.QName RZNSOCEMISOR$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RznSocEmisor");
                private static final javax.xml.namespace.QName GIROEMISOR$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "GiroEmisor");
                private static final javax.xml.namespace.QName CDGSIISUCUR$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CdgSIISucur");
                private static final javax.xml.namespace.QName DIRORIGEN$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DirOrigen");
                private static final javax.xml.namespace.QName CMNAORIGEN$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CmnaOrigen");
                private static final javax.xml.namespace.QName CIUDADORIGEN$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CiudadOrigen");
                
                
                /**
                 * Gets the "RUTEmisor" element
                 */
                public java.lang.String getRUTEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RUTEmisor" element
                 */
                public cl.sii.siiDte.boletas.RUTType xgetRUTEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RUTEMISOR$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RUTEmisor" element
                 */
                public void setRUTEmisor(java.lang.String rutEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTEMISOR$0);
                      }
                      target.setStringValue(rutEmisor);
                    }
                }
                
                /**
                 * Sets (as xml) the "RUTEmisor" element
                 */
                public void xsetRUTEmisor(cl.sii.siiDte.boletas.RUTType rutEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RUTEMISOR$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.RUTType)get_store().add_element_user(RUTEMISOR$0);
                      }
                      target.set(rutEmisor);
                    }
                }
                
                /**
                 * Gets the "RznSocEmisor" element
                 */
                public java.lang.String getRznSocEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RZNSOCEMISOR$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RznSocEmisor" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor xgetRznSocEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor)get_store().find_element_user(RZNSOCEMISOR$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RznSocEmisor" element
                 */
                public boolean isSetRznSocEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RZNSOCEMISOR$2) != 0;
                    }
                }
                
                /**
                 * Sets the "RznSocEmisor" element
                 */
                public void setRznSocEmisor(java.lang.String rznSocEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RZNSOCEMISOR$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RZNSOCEMISOR$2);
                      }
                      target.setStringValue(rznSocEmisor);
                    }
                }
                
                /**
                 * Sets (as xml) the "RznSocEmisor" element
                 */
                public void xsetRznSocEmisor(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor rznSocEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor)get_store().find_element_user(RZNSOCEMISOR$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor)get_store().add_element_user(RZNSOCEMISOR$2);
                      }
                      target.set(rznSocEmisor);
                    }
                }
                
                /**
                 * Unsets the "RznSocEmisor" element
                 */
                public void unsetRznSocEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RZNSOCEMISOR$2, 0);
                    }
                }
                
                /**
                 * Gets the "GiroEmisor" element
                 */
                public java.lang.String getGiroEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIROEMISOR$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "GiroEmisor" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor xgetGiroEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor)get_store().find_element_user(GIROEMISOR$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "GiroEmisor" element
                 */
                public boolean isSetGiroEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(GIROEMISOR$4) != 0;
                    }
                }
                
                /**
                 * Sets the "GiroEmisor" element
                 */
                public void setGiroEmisor(java.lang.String giroEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIROEMISOR$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIROEMISOR$4);
                      }
                      target.setStringValue(giroEmisor);
                    }
                }
                
                /**
                 * Sets (as xml) the "GiroEmisor" element
                 */
                public void xsetGiroEmisor(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor giroEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor)get_store().find_element_user(GIROEMISOR$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor)get_store().add_element_user(GIROEMISOR$4);
                      }
                      target.set(giroEmisor);
                    }
                }
                
                /**
                 * Unsets the "GiroEmisor" element
                 */
                public void unsetGiroEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(GIROEMISOR$4, 0);
                    }
                }
                
                /**
                 * Gets the "CdgSIISucur" element
                 */
                public int getCdgSIISucur()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDGSIISUCUR$6, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CdgSIISucur" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur xgetCdgSIISucur()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur)get_store().find_element_user(CDGSIISUCUR$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CdgSIISucur" element
                 */
                public boolean isSetCdgSIISucur()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CDGSIISUCUR$6) != 0;
                    }
                }
                
                /**
                 * Sets the "CdgSIISucur" element
                 */
                public void setCdgSIISucur(int cdgSIISucur)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDGSIISUCUR$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDGSIISUCUR$6);
                      }
                      target.setIntValue(cdgSIISucur);
                    }
                }
                
                /**
                 * Sets (as xml) the "CdgSIISucur" element
                 */
                public void xsetCdgSIISucur(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur cdgSIISucur)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur)get_store().find_element_user(CDGSIISUCUR$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur)get_store().add_element_user(CDGSIISUCUR$6);
                      }
                      target.set(cdgSIISucur);
                    }
                }
                
                /**
                 * Unsets the "CdgSIISucur" element
                 */
                public void unsetCdgSIISucur()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CDGSIISUCUR$6, 0);
                    }
                }
                
                /**
                 * Gets the "DirOrigen" element
                 */
                public java.lang.String getDirOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRORIGEN$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DirOrigen" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen xgetDirOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen)get_store().find_element_user(DIRORIGEN$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "DirOrigen" element
                 */
                public boolean isSetDirOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DIRORIGEN$8) != 0;
                    }
                }
                
                /**
                 * Sets the "DirOrigen" element
                 */
                public void setDirOrigen(java.lang.String dirOrigen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRORIGEN$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRORIGEN$8);
                      }
                      target.setStringValue(dirOrigen);
                    }
                }
                
                /**
                 * Sets (as xml) the "DirOrigen" element
                 */
                public void xsetDirOrigen(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen dirOrigen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen)get_store().find_element_user(DIRORIGEN$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen)get_store().add_element_user(DIRORIGEN$8);
                      }
                      target.set(dirOrigen);
                    }
                }
                
                /**
                 * Unsets the "DirOrigen" element
                 */
                public void unsetDirOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DIRORIGEN$8, 0);
                    }
                }
                
                /**
                 * Gets the "CmnaOrigen" element
                 */
                public java.lang.String getCmnaOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CMNAORIGEN$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CmnaOrigen" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen xgetCmnaOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen)get_store().find_element_user(CMNAORIGEN$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CmnaOrigen" element
                 */
                public boolean isSetCmnaOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CMNAORIGEN$10) != 0;
                    }
                }
                
                /**
                 * Sets the "CmnaOrigen" element
                 */
                public void setCmnaOrigen(java.lang.String cmnaOrigen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CMNAORIGEN$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CMNAORIGEN$10);
                      }
                      target.setStringValue(cmnaOrigen);
                    }
                }
                
                /**
                 * Sets (as xml) the "CmnaOrigen" element
                 */
                public void xsetCmnaOrigen(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen cmnaOrigen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen)get_store().find_element_user(CMNAORIGEN$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen)get_store().add_element_user(CMNAORIGEN$10);
                      }
                      target.set(cmnaOrigen);
                    }
                }
                
                /**
                 * Unsets the "CmnaOrigen" element
                 */
                public void unsetCmnaOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CMNAORIGEN$10, 0);
                    }
                }
                
                /**
                 * Gets the "CiudadOrigen" element
                 */
                public java.lang.String getCiudadOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIUDADORIGEN$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CiudadOrigen" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen xgetCiudadOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen)get_store().find_element_user(CIUDADORIGEN$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CiudadOrigen" element
                 */
                public boolean isSetCiudadOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CIUDADORIGEN$12) != 0;
                    }
                }
                
                /**
                 * Sets the "CiudadOrigen" element
                 */
                public void setCiudadOrigen(java.lang.String ciudadOrigen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIUDADORIGEN$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIUDADORIGEN$12);
                      }
                      target.setStringValue(ciudadOrigen);
                    }
                }
                
                /**
                 * Sets (as xml) the "CiudadOrigen" element
                 */
                public void xsetCiudadOrigen(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen ciudadOrigen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen)get_store().find_element_user(CIUDADORIGEN$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen)get_store().add_element_user(CIUDADORIGEN$12);
                      }
                      target.set(ciudadOrigen);
                    }
                }
                
                /**
                 * Unsets the "CiudadOrigen" element
                 */
                public void unsetCiudadOrigen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CIUDADORIGEN$12, 0);
                    }
                }
                /**
                 * An XML RznSocEmisor(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$RznSocEmisor.
                 */
                public static class RznSocEmisorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RznSocEmisorImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected RznSocEmisorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML GiroEmisor(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$GiroEmisor.
                 */
                public static class GiroEmisorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor
                {
                    private static final long serialVersionUID = 1L;
                    
                    public GiroEmisorImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected GiroEmisorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CdgSIISucur(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$CdgSIISucur.
                 */
                public static class CdgSIISucurImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CdgSIISucurImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CdgSIISucurImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML DirOrigen(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$DirOrigen.
                 */
                public static class DirOrigenImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DirOrigenImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DirOrigenImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CmnaOrigen(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$CmnaOrigen.
                 */
                public static class CmnaOrigenImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CmnaOrigenImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CmnaOrigenImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CiudadOrigen(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$CiudadOrigen.
                 */
                public static class CiudadOrigenImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CiudadOrigenImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CiudadOrigenImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML Receptor(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class ReceptorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor
            {
                private static final long serialVersionUID = 1L;
                
                public ReceptorImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RUTRECEP$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTRecep");
                private static final javax.xml.namespace.QName CDGINTRECEP$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CdgIntRecep");
                private static final javax.xml.namespace.QName RZNSOCRECEP$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RznSocRecep");
                private static final javax.xml.namespace.QName CONTACTO$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Contacto");
                private static final javax.xml.namespace.QName DIRRECEP$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DirRecep");
                private static final javax.xml.namespace.QName CMNARECEP$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CmnaRecep");
                private static final javax.xml.namespace.QName CIUDADRECEP$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CiudadRecep");
                private static final javax.xml.namespace.QName DIRPOSTAL$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DirPostal");
                private static final javax.xml.namespace.QName CMNAPOSTAL$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CmnaPostal");
                private static final javax.xml.namespace.QName CIUDADPOSTAL$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CiudadPostal");
                
                
                /**
                 * Gets the "RUTRecep" element
                 */
                public java.lang.String getRUTRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEP$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RUTRecep" element
                 */
                public cl.sii.siiDte.boletas.RUTType xgetRUTRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RUTRECEP$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RUTRecep" element
                 */
                public void setRUTRecep(java.lang.String rutRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEP$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTRECEP$0);
                      }
                      target.setStringValue(rutRecep);
                    }
                }
                
                /**
                 * Sets (as xml) the "RUTRecep" element
                 */
                public void xsetRUTRecep(cl.sii.siiDte.boletas.RUTType rutRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RUTRECEP$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.RUTType)get_store().add_element_user(RUTRECEP$0);
                      }
                      target.set(rutRecep);
                    }
                }
                
                /**
                 * Gets the "CdgIntRecep" element
                 */
                public java.lang.String getCdgIntRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDGINTRECEP$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CdgIntRecep" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep xgetCdgIntRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep)get_store().find_element_user(CDGINTRECEP$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CdgIntRecep" element
                 */
                public boolean isSetCdgIntRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CDGINTRECEP$2) != 0;
                    }
                }
                
                /**
                 * Sets the "CdgIntRecep" element
                 */
                public void setCdgIntRecep(java.lang.String cdgIntRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDGINTRECEP$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDGINTRECEP$2);
                      }
                      target.setStringValue(cdgIntRecep);
                    }
                }
                
                /**
                 * Sets (as xml) the "CdgIntRecep" element
                 */
                public void xsetCdgIntRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep cdgIntRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep)get_store().find_element_user(CDGINTRECEP$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep)get_store().add_element_user(CDGINTRECEP$2);
                      }
                      target.set(cdgIntRecep);
                    }
                }
                
                /**
                 * Unsets the "CdgIntRecep" element
                 */
                public void unsetCdgIntRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CDGINTRECEP$2, 0);
                    }
                }
                
                /**
                 * Gets the "RznSocRecep" element
                 */
                public java.lang.String getRznSocRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RZNSOCRECEP$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RznSocRecep" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep xgetRznSocRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep)get_store().find_element_user(RZNSOCRECEP$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RznSocRecep" element
                 */
                public boolean isSetRznSocRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RZNSOCRECEP$4) != 0;
                    }
                }
                
                /**
                 * Sets the "RznSocRecep" element
                 */
                public void setRznSocRecep(java.lang.String rznSocRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RZNSOCRECEP$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RZNSOCRECEP$4);
                      }
                      target.setStringValue(rznSocRecep);
                    }
                }
                
                /**
                 * Sets (as xml) the "RznSocRecep" element
                 */
                public void xsetRznSocRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep rznSocRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep)get_store().find_element_user(RZNSOCRECEP$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep)get_store().add_element_user(RZNSOCRECEP$4);
                      }
                      target.set(rznSocRecep);
                    }
                }
                
                /**
                 * Unsets the "RznSocRecep" element
                 */
                public void unsetRznSocRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RZNSOCRECEP$4, 0);
                    }
                }
                
                /**
                 * Gets the "Contacto" element
                 */
                public java.lang.String getContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTO$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Contacto" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto xgetContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto)get_store().find_element_user(CONTACTO$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Contacto" element
                 */
                public boolean isSetContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CONTACTO$6) != 0;
                    }
                }
                
                /**
                 * Sets the "Contacto" element
                 */
                public void setContacto(java.lang.String contacto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTO$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTO$6);
                      }
                      target.setStringValue(contacto);
                    }
                }
                
                /**
                 * Sets (as xml) the "Contacto" element
                 */
                public void xsetContacto(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto contacto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto)get_store().find_element_user(CONTACTO$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto)get_store().add_element_user(CONTACTO$6);
                      }
                      target.set(contacto);
                    }
                }
                
                /**
                 * Unsets the "Contacto" element
                 */
                public void unsetContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CONTACTO$6, 0);
                    }
                }
                
                /**
                 * Gets the "DirRecep" element
                 */
                public java.lang.String getDirRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRRECEP$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DirRecep" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep xgetDirRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep)get_store().find_element_user(DIRRECEP$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "DirRecep" element
                 */
                public boolean isSetDirRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DIRRECEP$8) != 0;
                    }
                }
                
                /**
                 * Sets the "DirRecep" element
                 */
                public void setDirRecep(java.lang.String dirRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRRECEP$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRRECEP$8);
                      }
                      target.setStringValue(dirRecep);
                    }
                }
                
                /**
                 * Sets (as xml) the "DirRecep" element
                 */
                public void xsetDirRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep dirRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep)get_store().find_element_user(DIRRECEP$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep)get_store().add_element_user(DIRRECEP$8);
                      }
                      target.set(dirRecep);
                    }
                }
                
                /**
                 * Unsets the "DirRecep" element
                 */
                public void unsetDirRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DIRRECEP$8, 0);
                    }
                }
                
                /**
                 * Gets the "CmnaRecep" element
                 */
                public java.lang.String getCmnaRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CMNARECEP$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CmnaRecep" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep xgetCmnaRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep)get_store().find_element_user(CMNARECEP$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CmnaRecep" element
                 */
                public boolean isSetCmnaRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CMNARECEP$10) != 0;
                    }
                }
                
                /**
                 * Sets the "CmnaRecep" element
                 */
                public void setCmnaRecep(java.lang.String cmnaRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CMNARECEP$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CMNARECEP$10);
                      }
                      target.setStringValue(cmnaRecep);
                    }
                }
                
                /**
                 * Sets (as xml) the "CmnaRecep" element
                 */
                public void xsetCmnaRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep cmnaRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep)get_store().find_element_user(CMNARECEP$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep)get_store().add_element_user(CMNARECEP$10);
                      }
                      target.set(cmnaRecep);
                    }
                }
                
                /**
                 * Unsets the "CmnaRecep" element
                 */
                public void unsetCmnaRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CMNARECEP$10, 0);
                    }
                }
                
                /**
                 * Gets the "CiudadRecep" element
                 */
                public java.lang.String getCiudadRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIUDADRECEP$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CiudadRecep" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep xgetCiudadRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep)get_store().find_element_user(CIUDADRECEP$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CiudadRecep" element
                 */
                public boolean isSetCiudadRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CIUDADRECEP$12) != 0;
                    }
                }
                
                /**
                 * Sets the "CiudadRecep" element
                 */
                public void setCiudadRecep(java.lang.String ciudadRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIUDADRECEP$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIUDADRECEP$12);
                      }
                      target.setStringValue(ciudadRecep);
                    }
                }
                
                /**
                 * Sets (as xml) the "CiudadRecep" element
                 */
                public void xsetCiudadRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep ciudadRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep)get_store().find_element_user(CIUDADRECEP$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep)get_store().add_element_user(CIUDADRECEP$12);
                      }
                      target.set(ciudadRecep);
                    }
                }
                
                /**
                 * Unsets the "CiudadRecep" element
                 */
                public void unsetCiudadRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CIUDADRECEP$12, 0);
                    }
                }
                
                /**
                 * Gets the "DirPostal" element
                 */
                public java.lang.String getDirPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRPOSTAL$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DirPostal" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal xgetDirPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal)get_store().find_element_user(DIRPOSTAL$14, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "DirPostal" element
                 */
                public boolean isSetDirPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DIRPOSTAL$14) != 0;
                    }
                }
                
                /**
                 * Sets the "DirPostal" element
                 */
                public void setDirPostal(java.lang.String dirPostal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRPOSTAL$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRPOSTAL$14);
                      }
                      target.setStringValue(dirPostal);
                    }
                }
                
                /**
                 * Sets (as xml) the "DirPostal" element
                 */
                public void xsetDirPostal(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal dirPostal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal)get_store().find_element_user(DIRPOSTAL$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal)get_store().add_element_user(DIRPOSTAL$14);
                      }
                      target.set(dirPostal);
                    }
                }
                
                /**
                 * Unsets the "DirPostal" element
                 */
                public void unsetDirPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DIRPOSTAL$14, 0);
                    }
                }
                
                /**
                 * Gets the "CmnaPostal" element
                 */
                public java.lang.String getCmnaPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CMNAPOSTAL$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CmnaPostal" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal xgetCmnaPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal)get_store().find_element_user(CMNAPOSTAL$16, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CmnaPostal" element
                 */
                public boolean isSetCmnaPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CMNAPOSTAL$16) != 0;
                    }
                }
                
                /**
                 * Sets the "CmnaPostal" element
                 */
                public void setCmnaPostal(java.lang.String cmnaPostal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CMNAPOSTAL$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CMNAPOSTAL$16);
                      }
                      target.setStringValue(cmnaPostal);
                    }
                }
                
                /**
                 * Sets (as xml) the "CmnaPostal" element
                 */
                public void xsetCmnaPostal(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal cmnaPostal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal)get_store().find_element_user(CMNAPOSTAL$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal)get_store().add_element_user(CMNAPOSTAL$16);
                      }
                      target.set(cmnaPostal);
                    }
                }
                
                /**
                 * Unsets the "CmnaPostal" element
                 */
                public void unsetCmnaPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CMNAPOSTAL$16, 0);
                    }
                }
                
                /**
                 * Gets the "CiudadPostal" element
                 */
                public java.lang.String getCiudadPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIUDADPOSTAL$18, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CiudadPostal" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal xgetCiudadPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal)get_store().find_element_user(CIUDADPOSTAL$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CiudadPostal" element
                 */
                public boolean isSetCiudadPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CIUDADPOSTAL$18) != 0;
                    }
                }
                
                /**
                 * Sets the "CiudadPostal" element
                 */
                public void setCiudadPostal(java.lang.String ciudadPostal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIUDADPOSTAL$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIUDADPOSTAL$18);
                      }
                      target.setStringValue(ciudadPostal);
                    }
                }
                
                /**
                 * Sets (as xml) the "CiudadPostal" element
                 */
                public void xsetCiudadPostal(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal ciudadPostal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal)get_store().find_element_user(CIUDADPOSTAL$18, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal)get_store().add_element_user(CIUDADPOSTAL$18);
                      }
                      target.set(ciudadPostal);
                    }
                }
                
                /**
                 * Unsets the "CiudadPostal" element
                 */
                public void unsetCiudadPostal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CIUDADPOSTAL$18, 0);
                    }
                }
                /**
                 * An XML CdgIntRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CdgIntRecep.
                 */
                public static class CdgIntRecepImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CdgIntRecepImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CdgIntRecepImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML RznSocRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$RznSocRecep.
                 */
                public static class RznSocRecepImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RznSocRecepImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected RznSocRecepImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML Contacto(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$Contacto.
                 */
                public static class ContactoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ContactoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected ContactoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML DirRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$DirRecep.
                 */
                public static class DirRecepImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DirRecepImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DirRecepImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CmnaRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CmnaRecep.
                 */
                public static class CmnaRecepImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CmnaRecepImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CmnaRecepImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CiudadRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CiudadRecep.
                 */
                public static class CiudadRecepImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CiudadRecepImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CiudadRecepImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML DirPostal(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$DirPostal.
                 */
                public static class DirPostalImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DirPostalImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DirPostalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CmnaPostal(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CmnaPostal.
                 */
                public static class CmnaPostalImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CmnaPostalImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CmnaPostalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CiudadPostal(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CiudadPostal.
                 */
                public static class CiudadPostalImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CiudadPostalImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CiudadPostalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML Totales(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class TotalesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales
            {
                private static final long serialVersionUID = 1L;
                
                public TotalesImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MNTNETO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntNeto");
                private static final javax.xml.namespace.QName MNTEXE$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntExe");
                private static final javax.xml.namespace.QName IVA$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVA");
                private static final javax.xml.namespace.QName MNTTOTAL$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntTotal");
                private static final javax.xml.namespace.QName MONTONF$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MontoNF");
                private static final javax.xml.namespace.QName TOTALPERIODO$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotalPeriodo");
                private static final javax.xml.namespace.QName SALDOANTERIOR$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SaldoAnterior");
                private static final javax.xml.namespace.QName VLRPAGAR$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "VlrPagar");
                
                
                /**
                 * Gets the "MntNeto" element
                 */
                public long getMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNETO$0, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntNeto" element
                 */
                public cl.sii.siiDte.boletas.MontoType xgetMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MontoType target = null;
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(MNTNETO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntNeto" element
                 */
                public boolean isSetMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTNETO$0) != 0;
                    }
                }
                
                /**
                 * Sets the "MntNeto" element
                 */
                public void setMntNeto(long mntNeto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNETO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTNETO$0);
                      }
                      target.setLongValue(mntNeto);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntNeto" element
                 */
                public void xsetMntNeto(cl.sii.siiDte.boletas.MontoType mntNeto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MontoType target = null;
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(MNTNETO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.MontoType)get_store().add_element_user(MNTNETO$0);
                      }
                      target.set(mntNeto);
                    }
                }
                
                /**
                 * Unsets the "MntNeto" element
                 */
                public void unsetMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTNETO$0, 0);
                    }
                }
                
                /**
                 * Gets the "MntExe" element
                 */
                public long getMntExe()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTEXE$2, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntExe" element
                 */
                public cl.sii.siiDte.boletas.MontoType xgetMntExe()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MontoType target = null;
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(MNTEXE$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntExe" element
                 */
                public boolean isSetMntExe()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTEXE$2) != 0;
                    }
                }
                
                /**
                 * Sets the "MntExe" element
                 */
                public void setMntExe(long mntExe)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTEXE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTEXE$2);
                      }
                      target.setLongValue(mntExe);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntExe" element
                 */
                public void xsetMntExe(cl.sii.siiDte.boletas.MontoType mntExe)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MontoType target = null;
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(MNTEXE$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.MontoType)get_store().add_element_user(MNTEXE$2);
                      }
                      target.set(mntExe);
                    }
                }
                
                /**
                 * Unsets the "MntExe" element
                 */
                public void unsetMntExe()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTEXE$2, 0);
                    }
                }
                
                /**
                 * Gets the "IVA" element
                 */
                public long getIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVA$4, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IVA" element
                 */
                public cl.sii.siiDte.boletas.MntImpType xgetIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MntImpType target = null;
                      target = (cl.sii.siiDte.boletas.MntImpType)get_store().find_element_user(IVA$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IVA" element
                 */
                public boolean isSetIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVA$4) != 0;
                    }
                }
                
                /**
                 * Sets the "IVA" element
                 */
                public void setIVA(long iva)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVA$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVA$4);
                      }
                      target.setLongValue(iva);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVA" element
                 */
                public void xsetIVA(cl.sii.siiDte.boletas.MntImpType iva)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MntImpType target = null;
                      target = (cl.sii.siiDte.boletas.MntImpType)get_store().find_element_user(IVA$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.MntImpType)get_store().add_element_user(IVA$4);
                      }
                      target.set(iva);
                    }
                }
                
                /**
                 * Unsets the "IVA" element
                 */
                public void unsetIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVA$4, 0);
                    }
                }
                
                /**
                 * Gets the "MntTotal" element
                 */
                public long getMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$6, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntTotal" element
                 */
                public cl.sii.siiDte.boletas.MontoType xgetMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MontoType target = null;
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(MNTTOTAL$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "MntTotal" element
                 */
                public void setMntTotal(long mntTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTTOTAL$6);
                      }
                      target.setLongValue(mntTotal);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntTotal" element
                 */
                public void xsetMntTotal(cl.sii.siiDte.boletas.MontoType mntTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MontoType target = null;
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(MNTTOTAL$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.MontoType)get_store().add_element_user(MNTTOTAL$6);
                      }
                      target.set(mntTotal);
                    }
                }
                
                /**
                 * Gets the "MontoNF" element
                 */
                public long getMontoNF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTONF$8, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MontoNF" element
                 */
                public cl.sii.siiDte.boletas.ValorType xgetMontoNF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.ValorType target = null;
                      target = (cl.sii.siiDte.boletas.ValorType)get_store().find_element_user(MONTONF$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MontoNF" element
                 */
                public boolean isSetMontoNF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MONTONF$8) != 0;
                    }
                }
                
                /**
                 * Sets the "MontoNF" element
                 */
                public void setMontoNF(long montoNF)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTONF$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTONF$8);
                      }
                      target.setLongValue(montoNF);
                    }
                }
                
                /**
                 * Sets (as xml) the "MontoNF" element
                 */
                public void xsetMontoNF(cl.sii.siiDte.boletas.ValorType montoNF)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.ValorType target = null;
                      target = (cl.sii.siiDte.boletas.ValorType)get_store().find_element_user(MONTONF$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.ValorType)get_store().add_element_user(MONTONF$8);
                      }
                      target.set(montoNF);
                    }
                }
                
                /**
                 * Unsets the "MontoNF" element
                 */
                public void unsetMontoNF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MONTONF$8, 0);
                    }
                }
                
                /**
                 * Gets the "TotalPeriodo" element
                 */
                public long getTotalPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALPERIODO$10, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotalPeriodo" element
                 */
                public cl.sii.siiDte.boletas.MontoType xgetTotalPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MontoType target = null;
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(TOTALPERIODO$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TotalPeriodo" element
                 */
                public boolean isSetTotalPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTALPERIODO$10) != 0;
                    }
                }
                
                /**
                 * Sets the "TotalPeriodo" element
                 */
                public void setTotalPeriodo(long totalPeriodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALPERIODO$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALPERIODO$10);
                      }
                      target.setLongValue(totalPeriodo);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotalPeriodo" element
                 */
                public void xsetTotalPeriodo(cl.sii.siiDte.boletas.MontoType totalPeriodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.MontoType target = null;
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(TOTALPERIODO$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.MontoType)get_store().add_element_user(TOTALPERIODO$10);
                      }
                      target.set(totalPeriodo);
                    }
                }
                
                /**
                 * Unsets the "TotalPeriodo" element
                 */
                public void unsetTotalPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTALPERIODO$10, 0);
                    }
                }
                
                /**
                 * Gets the "SaldoAnterior" element
                 */
                public long getSaldoAnterior()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOANTERIOR$12, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SaldoAnterior" element
                 */
                public cl.sii.siiDte.boletas.ValorType xgetSaldoAnterior()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.ValorType target = null;
                      target = (cl.sii.siiDte.boletas.ValorType)get_store().find_element_user(SALDOANTERIOR$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "SaldoAnterior" element
                 */
                public boolean isSetSaldoAnterior()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SALDOANTERIOR$12) != 0;
                    }
                }
                
                /**
                 * Sets the "SaldoAnterior" element
                 */
                public void setSaldoAnterior(long saldoAnterior)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOANTERIOR$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDOANTERIOR$12);
                      }
                      target.setLongValue(saldoAnterior);
                    }
                }
                
                /**
                 * Sets (as xml) the "SaldoAnterior" element
                 */
                public void xsetSaldoAnterior(cl.sii.siiDte.boletas.ValorType saldoAnterior)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.ValorType target = null;
                      target = (cl.sii.siiDte.boletas.ValorType)get_store().find_element_user(SALDOANTERIOR$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.ValorType)get_store().add_element_user(SALDOANTERIOR$12);
                      }
                      target.set(saldoAnterior);
                    }
                }
                
                /**
                 * Unsets the "SaldoAnterior" element
                 */
                public void unsetSaldoAnterior()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SALDOANTERIOR$12, 0);
                    }
                }
                
                /**
                 * Gets the "VlrPagar" element
                 */
                public long getVlrPagar()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VLRPAGAR$14, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "VlrPagar" element
                 */
                public cl.sii.siiDte.boletas.ValorType xgetVlrPagar()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.ValorType target = null;
                      target = (cl.sii.siiDte.boletas.ValorType)get_store().find_element_user(VLRPAGAR$14, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "VlrPagar" element
                 */
                public boolean isSetVlrPagar()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(VLRPAGAR$14) != 0;
                    }
                }
                
                /**
                 * Sets the "VlrPagar" element
                 */
                public void setVlrPagar(long vlrPagar)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VLRPAGAR$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VLRPAGAR$14);
                      }
                      target.setLongValue(vlrPagar);
                    }
                }
                
                /**
                 * Sets (as xml) the "VlrPagar" element
                 */
                public void xsetVlrPagar(cl.sii.siiDte.boletas.ValorType vlrPagar)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.ValorType target = null;
                      target = (cl.sii.siiDte.boletas.ValorType)get_store().find_element_user(VLRPAGAR$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.ValorType)get_store().add_element_user(VLRPAGAR$14);
                      }
                      target.set(vlrPagar);
                    }
                }
                
                /**
                 * Unsets the "VlrPagar" element
                 */
                public void unsetVlrPagar()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(VLRPAGAR$14, 0);
                    }
                }
            }
        }
        /**
         * An XML Detalle(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class DetalleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle
        {
            private static final long serialVersionUID = 1L;
            
            public DetalleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NROLINDET$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroLinDet");
            private static final javax.xml.namespace.QName CDGITEM$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CdgItem");
            private static final javax.xml.namespace.QName INDEXE$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IndExe");
            private static final javax.xml.namespace.QName NMBITEM$6 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NmbItem");
            private static final javax.xml.namespace.QName DSCITEM$8 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DscItem");
            private static final javax.xml.namespace.QName QTYITEM$10 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "QtyItem");
            private static final javax.xml.namespace.QName UNMDITEM$12 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "UnmdItem");
            private static final javax.xml.namespace.QName PRCITEM$14 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PrcItem");
            private static final javax.xml.namespace.QName MONTOITEM$16 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MontoItem");
            
            
            /**
             * Gets the "NroLinDet" element
             */
            public java.math.BigInteger getNroLinDet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROLINDET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "NroLinDet" element
             */
            public org.apache.xmlbeans.XmlPositiveInteger xgetNroLinDet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlPositiveInteger target = null;
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(NROLINDET$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NroLinDet" element
             */
            public void setNroLinDet(java.math.BigInteger nroLinDet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROLINDET$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROLINDET$0);
                    }
                    target.setBigIntegerValue(nroLinDet);
                }
            }
            
            /**
             * Sets (as xml) the "NroLinDet" element
             */
            public void xsetNroLinDet(org.apache.xmlbeans.XmlPositiveInteger nroLinDet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlPositiveInteger target = null;
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(NROLINDET$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(NROLINDET$0);
                    }
                    target.set(nroLinDet);
                }
            }
            
            /**
             * Gets array of all "CdgItem" elements
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem[] getCdgItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CDGITEM$2, targetList);
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem[] result = new cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "CdgItem" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem getCdgItemArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem)get_store().find_element_user(CDGITEM$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "CdgItem" element
             */
            public int sizeOfCdgItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CDGITEM$2);
                }
            }
            
            /**
             * Sets array of all "CdgItem" element
             */
            public void setCdgItemArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem[] cdgItemArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(cdgItemArray, CDGITEM$2);
                }
            }
            
            /**
             * Sets ith "CdgItem" element
             */
            public void setCdgItemArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem cdgItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem)get_store().find_element_user(CDGITEM$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(cdgItem);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "CdgItem" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem insertNewCdgItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem)get_store().insert_element_user(CDGITEM$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "CdgItem" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem addNewCdgItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem)get_store().add_element_user(CDGITEM$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "CdgItem" element
             */
            public void removeCdgItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CDGITEM$2, i);
                }
            }
            
            /**
             * Gets the "IndExe" element
             */
            public java.math.BigInteger getIndExe()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEXE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "IndExe" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe xgetIndExe()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe)get_store().find_element_user(INDEXE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "IndExe" element
             */
            public boolean isSetIndExe()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INDEXE$4) != 0;
                }
            }
            
            /**
             * Sets the "IndExe" element
             */
            public void setIndExe(java.math.BigInteger indExe)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEXE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDEXE$4);
                    }
                    target.setBigIntegerValue(indExe);
                }
            }
            
            /**
             * Sets (as xml) the "IndExe" element
             */
            public void xsetIndExe(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe indExe)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe)get_store().find_element_user(INDEXE$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe)get_store().add_element_user(INDEXE$4);
                    }
                    target.set(indExe);
                }
            }
            
            /**
             * Unsets the "IndExe" element
             */
            public void unsetIndExe()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INDEXE$4, 0);
                }
            }
            
            /**
             * Gets the "NmbItem" element
             */
            public java.lang.String getNmbItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBITEM$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NmbItem" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem xgetNmbItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem)get_store().find_element_user(NMBITEM$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NmbItem" element
             */
            public void setNmbItem(java.lang.String nmbItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBITEM$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMBITEM$6);
                    }
                    target.setStringValue(nmbItem);
                }
            }
            
            /**
             * Sets (as xml) the "NmbItem" element
             */
            public void xsetNmbItem(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem nmbItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem)get_store().find_element_user(NMBITEM$6, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem)get_store().add_element_user(NMBITEM$6);
                    }
                    target.set(nmbItem);
                }
            }
            
            /**
             * Gets the "DscItem" element
             */
            public java.lang.String getDscItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DSCITEM$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "DscItem" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem xgetDscItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem)get_store().find_element_user(DSCITEM$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "DscItem" element
             */
            public boolean isSetDscItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DSCITEM$8) != 0;
                }
            }
            
            /**
             * Sets the "DscItem" element
             */
            public void setDscItem(java.lang.String dscItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DSCITEM$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DSCITEM$8);
                    }
                    target.setStringValue(dscItem);
                }
            }
            
            /**
             * Sets (as xml) the "DscItem" element
             */
            public void xsetDscItem(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem dscItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem)get_store().find_element_user(DSCITEM$8, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem)get_store().add_element_user(DSCITEM$8);
                    }
                    target.set(dscItem);
                }
            }
            
            /**
             * Unsets the "DscItem" element
             */
            public void unsetDscItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DSCITEM$8, 0);
                }
            }
            
            /**
             * Gets the "QtyItem" element
             */
            public java.math.BigDecimal getQtyItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QTYITEM$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "QtyItem" element
             */
            public cl.sii.siiDte.boletas.Dec5Type xgetQtyItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec5Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec5Type)get_store().find_element_user(QTYITEM$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "QtyItem" element
             */
            public boolean isSetQtyItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(QTYITEM$10) != 0;
                }
            }
            
            /**
             * Sets the "QtyItem" element
             */
            public void setQtyItem(java.math.BigDecimal qtyItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QTYITEM$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QTYITEM$10);
                    }
                    target.setBigDecimalValue(qtyItem);
                }
            }
            
            /**
             * Sets (as xml) the "QtyItem" element
             */
            public void xsetQtyItem(cl.sii.siiDte.boletas.Dec5Type qtyItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec5Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec5Type)get_store().find_element_user(QTYITEM$10, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.Dec5Type)get_store().add_element_user(QTYITEM$10);
                    }
                    target.set(qtyItem);
                }
            }
            
            /**
             * Unsets the "QtyItem" element
             */
            public void unsetQtyItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(QTYITEM$10, 0);
                }
            }
            
            /**
             * Gets the "UnmdItem" element
             */
            public java.lang.String getUnmdItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNMDITEM$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "UnmdItem" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem xgetUnmdItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem)get_store().find_element_user(UNMDITEM$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "UnmdItem" element
             */
            public boolean isSetUnmdItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(UNMDITEM$12) != 0;
                }
            }
            
            /**
             * Sets the "UnmdItem" element
             */
            public void setUnmdItem(java.lang.String unmdItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNMDITEM$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNMDITEM$12);
                    }
                    target.setStringValue(unmdItem);
                }
            }
            
            /**
             * Sets (as xml) the "UnmdItem" element
             */
            public void xsetUnmdItem(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem unmdItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem)get_store().find_element_user(UNMDITEM$12, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem)get_store().add_element_user(UNMDITEM$12);
                    }
                    target.set(unmdItem);
                }
            }
            
            /**
             * Unsets the "UnmdItem" element
             */
            public void unsetUnmdItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(UNMDITEM$12, 0);
                }
            }
            
            /**
             * Gets the "PrcItem" element
             */
            public java.math.BigDecimal getPrcItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCITEM$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "PrcItem" element
             */
            public cl.sii.siiDte.boletas.Dec5Type xgetPrcItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec5Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec5Type)get_store().find_element_user(PRCITEM$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "PrcItem" element
             */
            public boolean isSetPrcItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PRCITEM$14) != 0;
                }
            }
            
            /**
             * Sets the "PrcItem" element
             */
            public void setPrcItem(java.math.BigDecimal prcItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCITEM$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRCITEM$14);
                    }
                    target.setBigDecimalValue(prcItem);
                }
            }
            
            /**
             * Sets (as xml) the "PrcItem" element
             */
            public void xsetPrcItem(cl.sii.siiDte.boletas.Dec5Type prcItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec5Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec5Type)get_store().find_element_user(PRCITEM$14, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.Dec5Type)get_store().add_element_user(PRCITEM$14);
                    }
                    target.set(prcItem);
                }
            }
            
            /**
             * Unsets the "PrcItem" element
             */
            public void unsetPrcItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PRCITEM$14, 0);
                }
            }
            
            /**
             * Gets the "MontoItem" element
             */
            public long getMontoItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTOITEM$16, 0);
                    if (target == null)
                    {
                      return 0L;
                    }
                    return target.getLongValue();
                }
            }
            
            /**
             * Gets (as xml) the "MontoItem" element
             */
            public cl.sii.siiDte.boletas.MontoType xgetMontoItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.MontoType target = null;
                    target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(MONTOITEM$16, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "MontoItem" element
             */
            public void setMontoItem(long montoItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTOITEM$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTOITEM$16);
                    }
                    target.setLongValue(montoItem);
                }
            }
            
            /**
             * Sets (as xml) the "MontoItem" element
             */
            public void xsetMontoItem(cl.sii.siiDte.boletas.MontoType montoItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.MontoType target = null;
                    target = (cl.sii.siiDte.boletas.MontoType)get_store().find_element_user(MONTOITEM$16, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.MontoType)get_store().add_element_user(MONTOITEM$16);
                    }
                    target.set(montoItem);
                }
            }
            /**
             * An XML CdgItem(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class CdgItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem
            {
                private static final long serialVersionUID = 1L;
                
                public CdgItemImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TPOCODIGO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoCodigo");
                private static final javax.xml.namespace.QName VLRCODIGO$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "VlrCodigo");
                
                
                /**
                 * Gets the "TpoCodigo" element
                 */
                public java.lang.String getTpoCodigo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOCODIGO$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TpoCodigo" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo xgetTpoCodigo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo)get_store().find_element_user(TPOCODIGO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TpoCodigo" element
                 */
                public void setTpoCodigo(java.lang.String tpoCodigo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOCODIGO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOCODIGO$0);
                      }
                      target.setStringValue(tpoCodigo);
                    }
                }
                
                /**
                 * Sets (as xml) the "TpoCodigo" element
                 */
                public void xsetTpoCodigo(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo tpoCodigo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo)get_store().find_element_user(TPOCODIGO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo)get_store().add_element_user(TPOCODIGO$0);
                      }
                      target.set(tpoCodigo);
                    }
                }
                
                /**
                 * Gets the "VlrCodigo" element
                 */
                public java.lang.String getVlrCodigo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VLRCODIGO$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "VlrCodigo" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo xgetVlrCodigo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo)get_store().find_element_user(VLRCODIGO$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "VlrCodigo" element
                 */
                public void setVlrCodigo(java.lang.String vlrCodigo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VLRCODIGO$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VLRCODIGO$2);
                      }
                      target.setStringValue(vlrCodigo);
                    }
                }
                
                /**
                 * Sets (as xml) the "VlrCodigo" element
                 */
                public void xsetVlrCodigo(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo vlrCodigo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo)get_store().find_element_user(VLRCODIGO$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo)get_store().add_element_user(VLRCODIGO$2);
                      }
                      target.set(vlrCodigo);
                    }
                }
                /**
                 * An XML TpoCodigo(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$CdgItem$TpoCodigo.
                 */
                public static class TpoCodigoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TpoCodigoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TpoCodigoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML VlrCodigo(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$CdgItem$VlrCodigo.
                 */
                public static class VlrCodigoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo
                {
                    private static final long serialVersionUID = 1L;
                    
                    public VlrCodigoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected VlrCodigoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML IndExe(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$IndExe.
             */
            public static class IndExeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe
            {
                private static final long serialVersionUID = 1L;
                
                public IndExeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected IndExeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML NmbItem(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$NmbItem.
             */
            public static class NmbItemImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem
            {
                private static final long serialVersionUID = 1L;
                
                public NmbItemImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NmbItemImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML DscItem(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$DscItem.
             */
            public static class DscItemImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem
            {
                private static final long serialVersionUID = 1L;
                
                public DscItemImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected DscItemImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML UnmdItem(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$UnmdItem.
             */
            public static class UnmdItemImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem
            {
                private static final long serialVersionUID = 1L;
                
                public UnmdItemImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected UnmdItemImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML SubTotInfo(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class SubTotInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo
        {
            private static final long serialVersionUID = 1L;
            
            public SubTotInfoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NROSTI$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroSTI");
            private static final javax.xml.namespace.QName GLOSASTI$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "GlosaSTI");
            private static final javax.xml.namespace.QName ORDENSTI$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "OrdenSTI");
            private static final javax.xml.namespace.QName SUBTOTNETOSTI$6 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SubTotNetoSTI");
            private static final javax.xml.namespace.QName SUBTOTIVASTI$8 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SubTotIVASTI");
            private static final javax.xml.namespace.QName SUBTOTADICSTI$10 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SubTotAdicSTI");
            private static final javax.xml.namespace.QName SUBTOTEXESTI$12 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SubTotExeSTI");
            private static final javax.xml.namespace.QName VALSUBTOTSTI$14 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ValSubtotSTI");
            private static final javax.xml.namespace.QName LINEASDETA$16 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "LineasDeta");
            
            
            /**
             * Gets the "NroSTI" element
             */
            public int getNroSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROSTI$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "NroSTI" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI xgetNroSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI)get_store().find_element_user(NROSTI$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NroSTI" element
             */
            public void setNroSTI(int nroSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROSTI$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROSTI$0);
                    }
                    target.setIntValue(nroSTI);
                }
            }
            
            /**
             * Sets (as xml) the "NroSTI" element
             */
            public void xsetNroSTI(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI nroSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI)get_store().find_element_user(NROSTI$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI)get_store().add_element_user(NROSTI$0);
                    }
                    target.set(nroSTI);
                }
            }
            
            /**
             * Gets the "GlosaSTI" element
             */
            public java.lang.String getGlosaSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOSASTI$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "GlosaSTI" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI xgetGlosaSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI)get_store().find_element_user(GLOSASTI$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "GlosaSTI" element
             */
            public boolean isSetGlosaSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GLOSASTI$2) != 0;
                }
            }
            
            /**
             * Sets the "GlosaSTI" element
             */
            public void setGlosaSTI(java.lang.String glosaSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOSASTI$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLOSASTI$2);
                    }
                    target.setStringValue(glosaSTI);
                }
            }
            
            /**
             * Sets (as xml) the "GlosaSTI" element
             */
            public void xsetGlosaSTI(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI glosaSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI)get_store().find_element_user(GLOSASTI$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI)get_store().add_element_user(GLOSASTI$2);
                    }
                    target.set(glosaSTI);
                }
            }
            
            /**
             * Unsets the "GlosaSTI" element
             */
            public void unsetGlosaSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GLOSASTI$2, 0);
                }
            }
            
            /**
             * Gets the "OrdenSTI" element
             */
            public int getOrdenSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDENSTI$4, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "OrdenSTI" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI xgetOrdenSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI)get_store().find_element_user(ORDENSTI$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "OrdenSTI" element
             */
            public void setOrdenSTI(int ordenSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDENSTI$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDENSTI$4);
                    }
                    target.setIntValue(ordenSTI);
                }
            }
            
            /**
             * Sets (as xml) the "OrdenSTI" element
             */
            public void xsetOrdenSTI(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI ordenSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI)get_store().find_element_user(ORDENSTI$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI)get_store().add_element_user(ORDENSTI$4);
                    }
                    target.set(ordenSTI);
                }
            }
            
            /**
             * Gets the "SubTotNetoSTI" element
             */
            public java.math.BigDecimal getSubTotNetoSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTNETOSTI$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "SubTotNetoSTI" element
             */
            public cl.sii.siiDte.boletas.Dec1Type xgetSubTotNetoSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(SUBTOTNETOSTI$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SubTotNetoSTI" element
             */
            public boolean isSetSubTotNetoSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUBTOTNETOSTI$6) != 0;
                }
            }
            
            /**
             * Sets the "SubTotNetoSTI" element
             */
            public void setSubTotNetoSTI(java.math.BigDecimal subTotNetoSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTNETOSTI$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTOTNETOSTI$6);
                    }
                    target.setBigDecimalValue(subTotNetoSTI);
                }
            }
            
            /**
             * Sets (as xml) the "SubTotNetoSTI" element
             */
            public void xsetSubTotNetoSTI(cl.sii.siiDte.boletas.Dec1Type subTotNetoSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(SUBTOTNETOSTI$6, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.Dec1Type)get_store().add_element_user(SUBTOTNETOSTI$6);
                    }
                    target.set(subTotNetoSTI);
                }
            }
            
            /**
             * Unsets the "SubTotNetoSTI" element
             */
            public void unsetSubTotNetoSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUBTOTNETOSTI$6, 0);
                }
            }
            
            /**
             * Gets the "SubTotIVASTI" element
             */
            public java.math.BigDecimal getSubTotIVASTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTIVASTI$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "SubTotIVASTI" element
             */
            public cl.sii.siiDte.boletas.Dec1Type xgetSubTotIVASTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(SUBTOTIVASTI$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SubTotIVASTI" element
             */
            public boolean isSetSubTotIVASTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUBTOTIVASTI$8) != 0;
                }
            }
            
            /**
             * Sets the "SubTotIVASTI" element
             */
            public void setSubTotIVASTI(java.math.BigDecimal subTotIVASTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTIVASTI$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTOTIVASTI$8);
                    }
                    target.setBigDecimalValue(subTotIVASTI);
                }
            }
            
            /**
             * Sets (as xml) the "SubTotIVASTI" element
             */
            public void xsetSubTotIVASTI(cl.sii.siiDte.boletas.Dec1Type subTotIVASTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(SUBTOTIVASTI$8, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.Dec1Type)get_store().add_element_user(SUBTOTIVASTI$8);
                    }
                    target.set(subTotIVASTI);
                }
            }
            
            /**
             * Unsets the "SubTotIVASTI" element
             */
            public void unsetSubTotIVASTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUBTOTIVASTI$8, 0);
                }
            }
            
            /**
             * Gets the "SubTotAdicSTI" element
             */
            public java.math.BigDecimal getSubTotAdicSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTADICSTI$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "SubTotAdicSTI" element
             */
            public cl.sii.siiDte.boletas.Dec1Type xgetSubTotAdicSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(SUBTOTADICSTI$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SubTotAdicSTI" element
             */
            public boolean isSetSubTotAdicSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUBTOTADICSTI$10) != 0;
                }
            }
            
            /**
             * Sets the "SubTotAdicSTI" element
             */
            public void setSubTotAdicSTI(java.math.BigDecimal subTotAdicSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTADICSTI$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTOTADICSTI$10);
                    }
                    target.setBigDecimalValue(subTotAdicSTI);
                }
            }
            
            /**
             * Sets (as xml) the "SubTotAdicSTI" element
             */
            public void xsetSubTotAdicSTI(cl.sii.siiDte.boletas.Dec1Type subTotAdicSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(SUBTOTADICSTI$10, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.Dec1Type)get_store().add_element_user(SUBTOTADICSTI$10);
                    }
                    target.set(subTotAdicSTI);
                }
            }
            
            /**
             * Unsets the "SubTotAdicSTI" element
             */
            public void unsetSubTotAdicSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUBTOTADICSTI$10, 0);
                }
            }
            
            /**
             * Gets the "SubTotExeSTI" element
             */
            public java.math.BigDecimal getSubTotExeSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTEXESTI$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "SubTotExeSTI" element
             */
            public cl.sii.siiDte.boletas.Dec1Type xgetSubTotExeSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(SUBTOTEXESTI$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SubTotExeSTI" element
             */
            public boolean isSetSubTotExeSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUBTOTEXESTI$12) != 0;
                }
            }
            
            /**
             * Sets the "SubTotExeSTI" element
             */
            public void setSubTotExeSTI(java.math.BigDecimal subTotExeSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTEXESTI$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTOTEXESTI$12);
                    }
                    target.setBigDecimalValue(subTotExeSTI);
                }
            }
            
            /**
             * Sets (as xml) the "SubTotExeSTI" element
             */
            public void xsetSubTotExeSTI(cl.sii.siiDte.boletas.Dec1Type subTotExeSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(SUBTOTEXESTI$12, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.Dec1Type)get_store().add_element_user(SUBTOTEXESTI$12);
                    }
                    target.set(subTotExeSTI);
                }
            }
            
            /**
             * Unsets the "SubTotExeSTI" element
             */
            public void unsetSubTotExeSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUBTOTEXESTI$12, 0);
                }
            }
            
            /**
             * Gets the "ValSubtotSTI" element
             */
            public java.math.BigDecimal getValSubtotSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALSUBTOTSTI$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValSubtotSTI" element
             */
            public cl.sii.siiDte.boletas.Dec1Type xgetValSubtotSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(VALSUBTOTSTI$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ValSubtotSTI" element
             */
            public boolean isSetValSubtotSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(VALSUBTOTSTI$14) != 0;
                }
            }
            
            /**
             * Sets the "ValSubtotSTI" element
             */
            public void setValSubtotSTI(java.math.BigDecimal valSubtotSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALSUBTOTSTI$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALSUBTOTSTI$14);
                    }
                    target.setBigDecimalValue(valSubtotSTI);
                }
            }
            
            /**
             * Sets (as xml) the "ValSubtotSTI" element
             */
            public void xsetValSubtotSTI(cl.sii.siiDte.boletas.Dec1Type valSubtotSTI)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(VALSUBTOTSTI$14, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.Dec1Type)get_store().add_element_user(VALSUBTOTSTI$14);
                    }
                    target.set(valSubtotSTI);
                }
            }
            
            /**
             * Unsets the "ValSubtotSTI" element
             */
            public void unsetValSubtotSTI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(VALSUBTOTSTI$14, 0);
                }
            }
            
            /**
             * Gets array of all "LineasDeta" elements
             */
            public int[] getLineasDetaArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(LINEASDETA$16, targetList);
                    int[] result = new int[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "LineasDeta" element
             */
            public int getLineasDetaArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEASDETA$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "LineasDeta" elements
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta[] xgetLineasDetaArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(LINEASDETA$16, targetList);
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta[] result = new cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "LineasDeta" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta xgetLineasDetaArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta)get_store().find_element_user(LINEASDETA$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta)target;
                }
            }
            
            /**
             * Returns number of "LineasDeta" element
             */
            public int sizeOfLineasDetaArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LINEASDETA$16);
                }
            }
            
            /**
             * Sets array of all "LineasDeta" element
             */
            public void setLineasDetaArray(int[] lineasDetaArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(lineasDetaArray, LINEASDETA$16);
                }
            }
            
            /**
             * Sets ith "LineasDeta" element
             */
            public void setLineasDetaArray(int i, int lineasDeta)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEASDETA$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setIntValue(lineasDeta);
                }
            }
            
            /**
             * Sets (as xml) array of all "LineasDeta" element
             */
            public void xsetLineasDetaArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta[]lineasDetaArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(lineasDetaArray, LINEASDETA$16);
                }
            }
            
            /**
             * Sets (as xml) ith "LineasDeta" element
             */
            public void xsetLineasDetaArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta lineasDeta)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta)get_store().find_element_user(LINEASDETA$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(lineasDeta);
                }
            }
            
            /**
             * Inserts the value as the ith "LineasDeta" element
             */
            public void insertLineasDeta(int i, int lineasDeta)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LINEASDETA$16, i);
                    target.setIntValue(lineasDeta);
                }
            }
            
            /**
             * Appends the value as the last "LineasDeta" element
             */
            public void addLineasDeta(int lineasDeta)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINEASDETA$16);
                    target.setIntValue(lineasDeta);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "LineasDeta" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta insertNewLineasDeta(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta)get_store().insert_element_user(LINEASDETA$16, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "LineasDeta" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta addNewLineasDeta()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta)get_store().add_element_user(LINEASDETA$16);
                    return target;
                }
            }
            
            /**
             * Removes the ith "LineasDeta" element
             */
            public void removeLineasDeta(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LINEASDETA$16, i);
                }
            }
            /**
             * An XML NroSTI(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$SubTotInfo$NroSTI.
             */
            public static class NroSTIImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI
            {
                private static final long serialVersionUID = 1L;
                
                public NroSTIImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NroSTIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML GlosaSTI(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$SubTotInfo$GlosaSTI.
             */
            public static class GlosaSTIImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI
            {
                private static final long serialVersionUID = 1L;
                
                public GlosaSTIImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected GlosaSTIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML OrdenSTI(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$SubTotInfo$OrdenSTI.
             */
            public static class OrdenSTIImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI
            {
                private static final long serialVersionUID = 1L;
                
                public OrdenSTIImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected OrdenSTIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML LineasDeta(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$SubTotInfo$LineasDeta.
             */
            public static class LineasDetaImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta
            {
                private static final long serialVersionUID = 1L;
                
                public LineasDetaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected LineasDetaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML DscRcgGlobal(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class DscRcgGlobalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal
        {
            private static final long serialVersionUID = 1L;
            
            public DscRcgGlobalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NROLINDR$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroLinDR");
            private static final javax.xml.namespace.QName TPOMOV$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoMov");
            private static final javax.xml.namespace.QName GLOSADR$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "GlosaDR");
            private static final javax.xml.namespace.QName TPOVALOR$6 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoValor");
            private static final javax.xml.namespace.QName VALORDR$8 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ValorDR");
            private static final javax.xml.namespace.QName INDEXEDR$10 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IndExeDR");
            
            
            /**
             * Gets the "NroLinDR" element
             */
            public int getNroLinDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROLINDR$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "NroLinDR" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR xgetNroLinDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR)get_store().find_element_user(NROLINDR$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NroLinDR" element
             */
            public void setNroLinDR(int nroLinDR)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROLINDR$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROLINDR$0);
                    }
                    target.setIntValue(nroLinDR);
                }
            }
            
            /**
             * Sets (as xml) the "NroLinDR" element
             */
            public void xsetNroLinDR(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR nroLinDR)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR)get_store().find_element_user(NROLINDR$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR)get_store().add_element_user(NROLINDR$0);
                    }
                    target.set(nroLinDR);
                }
            }
            
            /**
             * Gets the "TpoMov" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov.Enum getTpoMov()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOMOV$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "TpoMov" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov xgetTpoMov()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov)get_store().find_element_user(TPOMOV$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TpoMov" element
             */
            public void setTpoMov(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov.Enum tpoMov)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOMOV$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOMOV$2);
                    }
                    target.setEnumValue(tpoMov);
                }
            }
            
            /**
             * Sets (as xml) the "TpoMov" element
             */
            public void xsetTpoMov(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov tpoMov)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov)get_store().find_element_user(TPOMOV$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov)get_store().add_element_user(TPOMOV$2);
                    }
                    target.set(tpoMov);
                }
            }
            
            /**
             * Gets the "GlosaDR" element
             */
            public java.lang.String getGlosaDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOSADR$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "GlosaDR" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR xgetGlosaDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR)get_store().find_element_user(GLOSADR$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "GlosaDR" element
             */
            public boolean isSetGlosaDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GLOSADR$4) != 0;
                }
            }
            
            /**
             * Sets the "GlosaDR" element
             */
            public void setGlosaDR(java.lang.String glosaDR)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOSADR$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLOSADR$4);
                    }
                    target.setStringValue(glosaDR);
                }
            }
            
            /**
             * Sets (as xml) the "GlosaDR" element
             */
            public void xsetGlosaDR(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR glosaDR)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR)get_store().find_element_user(GLOSADR$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR)get_store().add_element_user(GLOSADR$4);
                    }
                    target.set(glosaDR);
                }
            }
            
            /**
             * Unsets the "GlosaDR" element
             */
            public void unsetGlosaDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GLOSADR$4, 0);
                }
            }
            
            /**
             * Gets the "TpoValor" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor.Enum getTpoValor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOVALOR$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "TpoValor" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor xgetTpoValor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor)get_store().find_element_user(TPOVALOR$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TpoValor" element
             */
            public void setTpoValor(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor.Enum tpoValor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOVALOR$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOVALOR$6);
                    }
                    target.setEnumValue(tpoValor);
                }
            }
            
            /**
             * Sets (as xml) the "TpoValor" element
             */
            public void xsetTpoValor(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor tpoValor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor)get_store().find_element_user(TPOVALOR$6, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor)get_store().add_element_user(TPOVALOR$6);
                    }
                    target.set(tpoValor);
                }
            }
            
            /**
             * Gets the "ValorDR" element
             */
            public java.math.BigDecimal getValorDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALORDR$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValorDR" element
             */
            public cl.sii.siiDte.boletas.Dec1Type xgetValorDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(VALORDR$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ValorDR" element
             */
            public void setValorDR(java.math.BigDecimal valorDR)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALORDR$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALORDR$8);
                    }
                    target.setBigDecimalValue(valorDR);
                }
            }
            
            /**
             * Sets (as xml) the "ValorDR" element
             */
            public void xsetValorDR(cl.sii.siiDte.boletas.Dec1Type valorDR)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.Dec1Type target = null;
                    target = (cl.sii.siiDte.boletas.Dec1Type)get_store().find_element_user(VALORDR$8, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.Dec1Type)get_store().add_element_user(VALORDR$8);
                    }
                    target.set(valorDR);
                }
            }
            
            /**
             * Gets the "IndExeDR" element
             */
            public java.math.BigInteger getIndExeDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEXEDR$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "IndExeDR" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR xgetIndExeDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR)get_store().find_element_user(INDEXEDR$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "IndExeDR" element
             */
            public boolean isSetIndExeDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INDEXEDR$10) != 0;
                }
            }
            
            /**
             * Sets the "IndExeDR" element
             */
            public void setIndExeDR(java.math.BigInteger indExeDR)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEXEDR$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDEXEDR$10);
                    }
                    target.setBigIntegerValue(indExeDR);
                }
            }
            
            /**
             * Sets (as xml) the "IndExeDR" element
             */
            public void xsetIndExeDR(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR indExeDR)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR)get_store().find_element_user(INDEXEDR$10, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR)get_store().add_element_user(INDEXEDR$10);
                    }
                    target.set(indExeDR);
                }
            }
            
            /**
             * Unsets the "IndExeDR" element
             */
            public void unsetIndExeDR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INDEXEDR$10, 0);
                }
            }
            /**
             * An XML NroLinDR(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$NroLinDR.
             */
            public static class NroLinDRImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR
            {
                private static final long serialVersionUID = 1L;
                
                public NroLinDRImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NroLinDRImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML TpoMov(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$TpoMov.
             */
            public static class TpoMovImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov
            {
                private static final long serialVersionUID = 1L;
                
                public TpoMovImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected TpoMovImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML GlosaDR(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$GlosaDR.
             */
            public static class GlosaDRImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR
            {
                private static final long serialVersionUID = 1L;
                
                public GlosaDRImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected GlosaDRImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML TpoValor(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$TpoValor.
             */
            public static class TpoValorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor
            {
                private static final long serialVersionUID = 1L;
                
                public TpoValorImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected TpoValorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML IndExeDR(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$IndExeDR.
             */
            public static class IndExeDRImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR
            {
                private static final long serialVersionUID = 1L;
                
                public IndExeDRImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected IndExeDRImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML Referencia(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class ReferenciaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia
        {
            private static final long serialVersionUID = 1L;
            
            public ReferenciaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NROLINREF$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroLinRef");
            private static final javax.xml.namespace.QName CODREF$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodRef");
            private static final javax.xml.namespace.QName RAZONREF$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RazonRef");
            
            
            /**
             * Gets the "NroLinRef" element
             */
            public int getNroLinRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROLINREF$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "NroLinRef" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef xgetNroLinRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef)get_store().find_element_user(NROLINREF$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NroLinRef" element
             */
            public void setNroLinRef(int nroLinRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROLINREF$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROLINREF$0);
                    }
                    target.setIntValue(nroLinRef);
                }
            }
            
            /**
             * Sets (as xml) the "NroLinRef" element
             */
            public void xsetNroLinRef(cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef nroLinRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef)get_store().find_element_user(NROLINREF$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef)get_store().add_element_user(NROLINREF$0);
                    }
                    target.set(nroLinRef);
                }
            }
            
            /**
             * Gets the "CodRef" element
             */
            public java.lang.String getCodRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODREF$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "CodRef" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef xgetCodRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef)get_store().find_element_user(CODREF$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "CodRef" element
             */
            public boolean isSetCodRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CODREF$2) != 0;
                }
            }
            
            /**
             * Sets the "CodRef" element
             */
            public void setCodRef(java.lang.String codRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODREF$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODREF$2);
                    }
                    target.setStringValue(codRef);
                }
            }
            
            /**
             * Sets (as xml) the "CodRef" element
             */
            public void xsetCodRef(cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef codRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef)get_store().find_element_user(CODREF$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef)get_store().add_element_user(CODREF$2);
                    }
                    target.set(codRef);
                }
            }
            
            /**
             * Unsets the "CodRef" element
             */
            public void unsetCodRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CODREF$2, 0);
                }
            }
            
            /**
             * Gets the "RazonRef" element
             */
            public java.lang.String getRazonRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAZONREF$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RazonRef" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef xgetRazonRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef)get_store().find_element_user(RAZONREF$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "RazonRef" element
             */
            public boolean isSetRazonRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RAZONREF$4) != 0;
                }
            }
            
            /**
             * Sets the "RazonRef" element
             */
            public void setRazonRef(java.lang.String razonRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAZONREF$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RAZONREF$4);
                    }
                    target.setStringValue(razonRef);
                }
            }
            
            /**
             * Sets (as xml) the "RazonRef" element
             */
            public void xsetRazonRef(cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef razonRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef)get_store().find_element_user(RAZONREF$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef)get_store().add_element_user(RAZONREF$4);
                    }
                    target.set(razonRef);
                }
            }
            
            /**
             * Unsets the "RazonRef" element
             */
            public void unsetRazonRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RAZONREF$4, 0);
                }
            }
            /**
             * An XML NroLinRef(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Referencia$NroLinRef.
             */
            public static class NroLinRefImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef
            {
                private static final long serialVersionUID = 1L;
                
                public NroLinRefImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NroLinRefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML CodRef(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Referencia$CodRef.
             */
            public static class CodRefImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef
            {
                private static final long serialVersionUID = 1L;
                
                public CodRefImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected CodRefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML RazonRef(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Referencia$RazonRef.
             */
            public static class RazonRefImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef
            {
                private static final long serialVersionUID = 1L;
                
                public RazonRefImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected RazonRefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML TED(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class TEDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED
        {
            private static final long serialVersionUID = 1L;
            
            public TEDImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DD$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DD");
            private static final javax.xml.namespace.QName FRMT$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FRMT");
            private static final javax.xml.namespace.QName VERSION$4 = 
                new javax.xml.namespace.QName("", "version");
            
            
            /**
             * Gets the "DD" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD getDD()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD)get_store().find_element_user(DD$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "DD" element
             */
            public void setDD(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD dd)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD)get_store().find_element_user(DD$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD)get_store().add_element_user(DD$0);
                    }
                    target.set(dd);
                }
            }
            
            /**
             * Appends and returns a new empty "DD" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD addNewDD()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD)get_store().add_element_user(DD$0);
                    return target;
                }
            }
            
            /**
             * Gets the "FRMT" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT getFRMT()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT)get_store().find_element_user(FRMT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "FRMT" element
             */
            public void setFRMT(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT frmt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT)get_store().find_element_user(FRMT$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT)get_store().add_element_user(FRMT$2);
                    }
                    target.set(frmt);
                }
            }
            
            /**
             * Appends and returns a new empty "FRMT" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT addNewFRMT()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT)get_store().add_element_user(FRMT$2);
                    return target;
                }
            }
            
            /**
             * Gets the "version" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType getVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VERSION$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnySimpleType)get_default_attribute_value(VERSION$4);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "version" attribute
             */
            public void setVersion(org.apache.xmlbeans.XmlAnySimpleType version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VERSION$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VERSION$4);
                    }
                    target.set(version);
                }
            }
            
            /**
             * Appends and returns a new empty "version" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType addNewVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VERSION$4);
                    return target;
                }
            }
            /**
             * An XML DD(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class DDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD
            {
                private static final long serialVersionUID = 1L;
                
                public DDImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RE$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RE");
                private static final javax.xml.namespace.QName TD$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TD");
                private static final javax.xml.namespace.QName F$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "F");
                private static final javax.xml.namespace.QName FE$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FE");
                private static final javax.xml.namespace.QName RR$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RR");
                private static final javax.xml.namespace.QName RSR$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RSR");
                private static final javax.xml.namespace.QName MNT$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MNT");
                private static final javax.xml.namespace.QName IT1$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IT1");
                private static final javax.xml.namespace.QName CAF$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CAF");
                private static final javax.xml.namespace.QName TSTED$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TSTED");
                
                
                /**
                 * Gets the "RE" element
                 */
                public java.lang.String getRE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RE" element
                 */
                public cl.sii.siiDte.boletas.RUTType xgetRE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RE" element
                 */
                public void setRE(java.lang.String re)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RE$0);
                      }
                      target.setStringValue(re);
                    }
                }
                
                /**
                 * Sets (as xml) the "RE" element
                 */
                public void xsetRE(cl.sii.siiDte.boletas.RUTType re)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RE$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.RUTType)get_store().add_element_user(RE$0);
                      }
                      target.set(re);
                    }
                }
                
                /**
                 * Gets the "TD" element
                 */
                public java.math.BigInteger getTD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TD$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TD" element
                 */
                public cl.sii.siiDte.boletas.DTEType xgetTD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.DTEType target = null;
                      target = (cl.sii.siiDte.boletas.DTEType)get_store().find_element_user(TD$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TD" element
                 */
                public void setTD(java.math.BigInteger td)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TD$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TD$2);
                      }
                      target.setBigIntegerValue(td);
                    }
                }
                
                /**
                 * Sets (as xml) the "TD" element
                 */
                public void xsetTD(cl.sii.siiDte.boletas.DTEType td)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.DTEType target = null;
                      target = (cl.sii.siiDte.boletas.DTEType)get_store().find_element_user(TD$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.DTEType)get_store().add_element_user(TD$2);
                      }
                      target.set(td);
                    }
                }
                
                /**
                 * Gets the "F" element
                 */
                public long getF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(F$4, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "F" element
                 */
                public cl.sii.siiDte.boletas.FolioType xgetF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.FolioType target = null;
                      target = (cl.sii.siiDte.boletas.FolioType)get_store().find_element_user(F$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "F" element
                 */
                public void setF(long f)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(F$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(F$4);
                      }
                      target.setLongValue(f);
                    }
                }
                
                /**
                 * Sets (as xml) the "F" element
                 */
                public void xsetF(cl.sii.siiDte.boletas.FolioType f)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.FolioType target = null;
                      target = (cl.sii.siiDte.boletas.FolioType)get_store().find_element_user(F$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.FolioType)get_store().add_element_user(F$4);
                      }
                      target.set(f);
                    }
                }
                
                /**
                 * Gets the "FE" element
                 */
                public java.util.Calendar getFE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FE$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FE" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FE$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FE" element
                 */
                public void setFE(java.util.Calendar fe)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FE$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FE$6);
                      }
                      target.setCalendarValue(fe);
                    }
                }
                
                /**
                 * Sets (as xml) the "FE" element
                 */
                public void xsetFE(org.apache.xmlbeans.XmlDate fe)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FE$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FE$6);
                      }
                      target.set(fe);
                    }
                }
                
                /**
                 * Gets the "RR" element
                 */
                public java.lang.String getRR()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RR$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RR" element
                 */
                public cl.sii.siiDte.boletas.RUTType xgetRR()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RR$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RR" element
                 */
                public void setRR(java.lang.String rr)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RR$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RR$8);
                      }
                      target.setStringValue(rr);
                    }
                }
                
                /**
                 * Sets (as xml) the "RR" element
                 */
                public void xsetRR(cl.sii.siiDte.boletas.RUTType rr)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RR$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.RUTType)get_store().add_element_user(RR$8);
                      }
                      target.set(rr);
                    }
                }
                
                /**
                 * Gets the "RSR" element
                 */
                public java.lang.String getRSR()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RSR$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RSR" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR xgetRSR()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR)get_store().find_element_user(RSR$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RSR" element
                 */
                public void setRSR(java.lang.String rsr)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RSR$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RSR$10);
                      }
                      target.setStringValue(rsr);
                    }
                }
                
                /**
                 * Sets (as xml) the "RSR" element
                 */
                public void xsetRSR(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR rsr)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR)get_store().find_element_user(RSR$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR)get_store().add_element_user(RSR$10);
                      }
                      target.set(rsr);
                    }
                }
                
                /**
                 * Gets the "MNT" element
                 */
                public java.math.BigInteger getMNT()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNT$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MNT" element
                 */
                public org.apache.xmlbeans.XmlUnsignedLong xgetMNT()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlUnsignedLong target = null;
                      target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(MNT$12, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "MNT" element
                 */
                public void setMNT(java.math.BigInteger mnt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNT$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNT$12);
                      }
                      target.setBigIntegerValue(mnt);
                    }
                }
                
                /**
                 * Sets (as xml) the "MNT" element
                 */
                public void xsetMNT(org.apache.xmlbeans.XmlUnsignedLong mnt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlUnsignedLong target = null;
                      target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(MNT$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_element_user(MNT$12);
                      }
                      target.set(mnt);
                    }
                }
                
                /**
                 * Gets the "IT1" element
                 */
                public java.lang.String getIT1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IT1$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IT1" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 xgetIT1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1)get_store().find_element_user(IT1$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "IT1" element
                 */
                public void setIT1(java.lang.String it1)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IT1$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IT1$14);
                      }
                      target.setStringValue(it1);
                    }
                }
                
                /**
                 * Sets (as xml) the "IT1" element
                 */
                public void xsetIT1(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 it1)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1)get_store().find_element_user(IT1$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1)get_store().add_element_user(IT1$14);
                      }
                      target.set(it1);
                    }
                }
                
                /**
                 * Gets the "CAF" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF getCAF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF)get_store().find_element_user(CAF$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "CAF" element
                 */
                public void setCAF(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF caf)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF)get_store().find_element_user(CAF$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF)get_store().add_element_user(CAF$16);
                      }
                      target.set(caf);
                    }
                }
                
                /**
                 * Appends and returns a new empty "CAF" element
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF addNewCAF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF)get_store().add_element_user(CAF$16);
                      return target;
                    }
                }
                
                /**
                 * Gets the "TSTED" element
                 */
                public java.util.Calendar getTSTED()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSTED$18, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TSTED" element
                 */
                public org.apache.xmlbeans.XmlDateTime xgetTSTED()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TSTED$18, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TSTED" element
                 */
                public void setTSTED(java.util.Calendar tsted)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSTED$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TSTED$18);
                      }
                      target.setCalendarValue(tsted);
                    }
                }
                
                /**
                 * Sets (as xml) the "TSTED" element
                 */
                public void xsetTSTED(org.apache.xmlbeans.XmlDateTime tsted)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TSTED$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TSTED$18);
                      }
                      target.set(tsted);
                    }
                }
                /**
                 * An XML RSR(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$DD$RSR.
                 */
                public static class RSRImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RSRImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected RSRImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML IT1(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$DD$IT1.
                 */
                public static class IT1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IT1Impl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected IT1Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CAF(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class CAFImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CAFImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName DA$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DA");
                    private static final javax.xml.namespace.QName FRMA$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FRMA");
                    private static final javax.xml.namespace.QName VERSION$4 = 
                      new javax.xml.namespace.QName("", "version");
                    
                    
                    /**
                     * Gets the "DA" element
                     */
                    public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA getDA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA target = null;
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA)get_store().find_element_user(DA$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "DA" element
                     */
                    public void setDA(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA da)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA target = null;
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA)get_store().find_element_user(DA$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA)get_store().add_element_user(DA$0);
                        }
                        target.set(da);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "DA" element
                     */
                    public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA addNewDA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA target = null;
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA)get_store().add_element_user(DA$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "FRMA" element
                     */
                    public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA getFRMA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA target = null;
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA)get_store().find_element_user(FRMA$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "FRMA" element
                     */
                    public void setFRMA(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA frma)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA target = null;
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA)get_store().find_element_user(FRMA$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA)get_store().add_element_user(FRMA$2);
                        }
                        target.set(frma);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "FRMA" element
                     */
                    public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA addNewFRMA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA target = null;
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA)get_store().add_element_user(FRMA$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "version" attribute
                     */
                    public org.apache.xmlbeans.XmlAnySimpleType getVersion()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlAnySimpleType target = null;
                        target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VERSION$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlAnySimpleType)get_default_attribute_value(VERSION$4);
                        }
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "version" attribute
                     */
                    public void setVersion(org.apache.xmlbeans.XmlAnySimpleType version)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlAnySimpleType target = null;
                        target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VERSION$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VERSION$4);
                        }
                        target.set(version);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "version" attribute
                     */
                    public org.apache.xmlbeans.XmlAnySimpleType addNewVersion()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlAnySimpleType target = null;
                        target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VERSION$4);
                        return target;
                      }
                    }
                    /**
                     * An XML DA(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class DAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public DAImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName RE$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RE");
                      private static final javax.xml.namespace.QName RS$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RS");
                      private static final javax.xml.namespace.QName TD$4 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TD");
                      private static final javax.xml.namespace.QName RNG$6 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RNG");
                      private static final javax.xml.namespace.QName FA$8 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FA");
                      private static final javax.xml.namespace.QName RSAPK$10 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RSAPK");
                      private static final javax.xml.namespace.QName DSAPK$12 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DSAPK");
                      private static final javax.xml.namespace.QName IDK$14 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IDK");
                      
                      
                      /**
                       * Gets the "RE" element
                       */
                      public java.lang.String getRE()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RE$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "RE" element
                       */
                      public cl.sii.siiDte.boletas.RUTType xgetRE()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.RUTType target = null;
                          target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RE$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "RE" element
                       */
                      public void setRE(java.lang.String re)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RE$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RE$0);
                          }
                          target.setStringValue(re);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "RE" element
                       */
                      public void xsetRE(cl.sii.siiDte.boletas.RUTType re)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.RUTType target = null;
                          target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RE$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.boletas.RUTType)get_store().add_element_user(RE$0);
                          }
                          target.set(re);
                        }
                      }
                      
                      /**
                       * Gets the "RS" element
                       */
                      public java.lang.String getRS()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RS$2, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "RS" element
                       */
                      public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS xgetRS()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS)get_store().find_element_user(RS$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "RS" element
                       */
                      public void setRS(java.lang.String rs)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RS$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RS$2);
                          }
                          target.setStringValue(rs);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "RS" element
                       */
                      public void xsetRS(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS rs)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS)get_store().find_element_user(RS$2, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS)get_store().add_element_user(RS$2);
                          }
                          target.set(rs);
                        }
                      }
                      
                      /**
                       * Gets the "TD" element
                       */
                      public java.math.BigInteger getTD()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TD$4, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getBigIntegerValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TD" element
                       */
                      public cl.sii.siiDte.boletas.DTEType xgetTD()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.DTEType target = null;
                          target = (cl.sii.siiDte.boletas.DTEType)get_store().find_element_user(TD$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "TD" element
                       */
                      public void setTD(java.math.BigInteger td)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TD$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TD$4);
                          }
                          target.setBigIntegerValue(td);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TD" element
                       */
                      public void xsetTD(cl.sii.siiDte.boletas.DTEType td)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.DTEType target = null;
                          target = (cl.sii.siiDte.boletas.DTEType)get_store().find_element_user(TD$4, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.boletas.DTEType)get_store().add_element_user(TD$4);
                          }
                          target.set(td);
                        }
                      }
                      
                      /**
                       * Gets the "RNG" element
                       */
                      public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG getRNG()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG)get_store().find_element_user(RNG$6, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "RNG" element
                       */
                      public void setRNG(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG rng)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG)get_store().find_element_user(RNG$6, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG)get_store().add_element_user(RNG$6);
                          }
                          target.set(rng);
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty "RNG" element
                       */
                      public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG addNewRNG()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG)get_store().add_element_user(RNG$6);
                          return target;
                        }
                      }
                      
                      /**
                       * Gets the "FA" element
                       */
                      public java.util.Calendar getFA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FA$8, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getCalendarValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "FA" element
                       */
                      public org.apache.xmlbeans.XmlDate xgetFA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlDate target = null;
                          target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FA$8, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "FA" element
                       */
                      public void setFA(java.util.Calendar fa)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FA$8, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FA$8);
                          }
                          target.setCalendarValue(fa);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "FA" element
                       */
                      public void xsetFA(org.apache.xmlbeans.XmlDate fa)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlDate target = null;
                          target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FA$8, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FA$8);
                          }
                          target.set(fa);
                        }
                      }
                      
                      /**
                       * Gets the "RSAPK" element
                       */
                      public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK getRSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK)get_store().find_element_user(RSAPK$10, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "RSAPK" element
                       */
                      public boolean isSetRSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(RSAPK$10) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "RSAPK" element
                       */
                      public void setRSAPK(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK rsapk)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK)get_store().find_element_user(RSAPK$10, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK)get_store().add_element_user(RSAPK$10);
                          }
                          target.set(rsapk);
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty "RSAPK" element
                       */
                      public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK addNewRSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK)get_store().add_element_user(RSAPK$10);
                          return target;
                        }
                      }
                      
                      /**
                       * Unsets the "RSAPK" element
                       */
                      public void unsetRSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(RSAPK$10, 0);
                        }
                      }
                      
                      /**
                       * Gets the "DSAPK" element
                       */
                      public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK getDSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK)get_store().find_element_user(DSAPK$12, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "DSAPK" element
                       */
                      public boolean isSetDSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(DSAPK$12) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "DSAPK" element
                       */
                      public void setDSAPK(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK dsapk)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK)get_store().find_element_user(DSAPK$12, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK)get_store().add_element_user(DSAPK$12);
                          }
                          target.set(dsapk);
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty "DSAPK" element
                       */
                      public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK addNewDSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK target = null;
                          target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK)get_store().add_element_user(DSAPK$12);
                          return target;
                        }
                      }
                      
                      /**
                       * Unsets the "DSAPK" element
                       */
                      public void unsetDSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(DSAPK$12, 0);
                        }
                      }
                      
                      /**
                       * Gets the "IDK" element
                       */
                      public long getIDK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDK$14, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "IDK" element
                       */
                      public org.apache.xmlbeans.XmlLong xgetIDK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlLong target = null;
                          target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IDK$14, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "IDK" element
                       */
                      public void setIDK(long idk)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDK$14, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDK$14);
                          }
                          target.setLongValue(idk);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "IDK" element
                       */
                      public void xsetIDK(org.apache.xmlbeans.XmlLong idk)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlLong target = null;
                          target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IDK$14, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IDK$14);
                          }
                          target.set(idk);
                        }
                      }
                      /**
                       * An XML RS(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$DD$CAF$DA$RS.
                       */
                      public static class RSImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public RSImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected RSImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                      /**
                       * An XML RNG(@http://www.sii.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public static class RNGImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public RNGImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName D$0 = 
                          new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "D");
                        private static final javax.xml.namespace.QName H$2 = 
                          new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "H");
                        
                        
                        /**
                         * Gets the "D" element
                         */
                        public long getD()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(D$0, 0);
                            if (target == null)
                            {
                              return 0L;
                            }
                            return target.getLongValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "D" element
                         */
                        public cl.sii.siiDte.boletas.FolioType xgetD()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            cl.sii.siiDte.boletas.FolioType target = null;
                            target = (cl.sii.siiDte.boletas.FolioType)get_store().find_element_user(D$0, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "D" element
                         */
                        public void setD(long d)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(D$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(D$0);
                            }
                            target.setLongValue(d);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "D" element
                         */
                        public void xsetD(cl.sii.siiDte.boletas.FolioType d)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            cl.sii.siiDte.boletas.FolioType target = null;
                            target = (cl.sii.siiDte.boletas.FolioType)get_store().find_element_user(D$0, 0);
                            if (target == null)
                            {
                              target = (cl.sii.siiDte.boletas.FolioType)get_store().add_element_user(D$0);
                            }
                            target.set(d);
                          }
                        }
                        
                        /**
                         * Gets the "H" element
                         */
                        public long getH()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(H$2, 0);
                            if (target == null)
                            {
                              return 0L;
                            }
                            return target.getLongValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "H" element
                         */
                        public cl.sii.siiDte.boletas.FolioType xgetH()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            cl.sii.siiDte.boletas.FolioType target = null;
                            target = (cl.sii.siiDte.boletas.FolioType)get_store().find_element_user(H$2, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "H" element
                         */
                        public void setH(long h)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(H$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(H$2);
                            }
                            target.setLongValue(h);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "H" element
                         */
                        public void xsetH(cl.sii.siiDte.boletas.FolioType h)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            cl.sii.siiDte.boletas.FolioType target = null;
                            target = (cl.sii.siiDte.boletas.FolioType)get_store().find_element_user(H$2, 0);
                            if (target == null)
                            {
                              target = (cl.sii.siiDte.boletas.FolioType)get_store().add_element_user(H$2);
                            }
                            target.set(h);
                          }
                        }
                      }
                      /**
                       * An XML RSAPK(@http://www.sii.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public static class RSAPKImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public RSAPKImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName M$0 = 
                          new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "M");
                        private static final javax.xml.namespace.QName E$2 = 
                          new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "E");
                        
                        
                        /**
                         * Gets the "M" element
                         */
                        public byte[] getM()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(M$0, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getByteArrayValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "M" element
                         */
                        public org.apache.xmlbeans.XmlBase64Binary xgetM()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(M$0, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "M" element
                         */
                        public void setM(byte[] m)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(M$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(M$0);
                            }
                            target.setByteArrayValue(m);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "M" element
                         */
                        public void xsetM(org.apache.xmlbeans.XmlBase64Binary m)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(M$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(M$0);
                            }
                            target.set(m);
                          }
                        }
                        
                        /**
                         * Gets the "E" element
                         */
                        public byte[] getE()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(E$2, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getByteArrayValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "E" element
                         */
                        public org.apache.xmlbeans.XmlBase64Binary xgetE()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(E$2, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "E" element
                         */
                        public void setE(byte[] e)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(E$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(E$2);
                            }
                            target.setByteArrayValue(e);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "E" element
                         */
                        public void xsetE(org.apache.xmlbeans.XmlBase64Binary e)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(E$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(E$2);
                            }
                            target.set(e);
                          }
                        }
                      }
                      /**
                       * An XML DSAPK(@http://www.sii.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public static class DSAPKImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public DSAPKImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName P$0 = 
                          new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "P");
                        private static final javax.xml.namespace.QName Q$2 = 
                          new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Q");
                        private static final javax.xml.namespace.QName G$4 = 
                          new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "G");
                        private static final javax.xml.namespace.QName Y$6 = 
                          new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Y");
                        
                        
                        /**
                         * Gets the "P" element
                         */
                        public byte[] getP()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(P$0, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getByteArrayValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "P" element
                         */
                        public org.apache.xmlbeans.XmlBase64Binary xgetP()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(P$0, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "P" element
                         */
                        public void setP(byte[] p)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(P$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(P$0);
                            }
                            target.setByteArrayValue(p);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "P" element
                         */
                        public void xsetP(org.apache.xmlbeans.XmlBase64Binary p)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(P$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(P$0);
                            }
                            target.set(p);
                          }
                        }
                        
                        /**
                         * Gets the "Q" element
                         */
                        public byte[] getQ()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Q$2, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getByteArrayValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "Q" element
                         */
                        public org.apache.xmlbeans.XmlBase64Binary xgetQ()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(Q$2, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "Q" element
                         */
                        public void setQ(byte[] q)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Q$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Q$2);
                            }
                            target.setByteArrayValue(q);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "Q" element
                         */
                        public void xsetQ(org.apache.xmlbeans.XmlBase64Binary q)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(Q$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(Q$2);
                            }
                            target.set(q);
                          }
                        }
                        
                        /**
                         * Gets the "G" element
                         */
                        public byte[] getG()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(G$4, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getByteArrayValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "G" element
                         */
                        public org.apache.xmlbeans.XmlBase64Binary xgetG()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(G$4, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "G" element
                         */
                        public void setG(byte[] g)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(G$4, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(G$4);
                            }
                            target.setByteArrayValue(g);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "G" element
                         */
                        public void xsetG(org.apache.xmlbeans.XmlBase64Binary g)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(G$4, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(G$4);
                            }
                            target.set(g);
                          }
                        }
                        
                        /**
                         * Gets the "Y" element
                         */
                        public byte[] getY()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$6, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getByteArrayValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "Y" element
                         */
                        public org.apache.xmlbeans.XmlBase64Binary xgetY()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(Y$6, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "Y" element
                         */
                        public void setY(byte[] y)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$6, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Y$6);
                            }
                            target.setByteArrayValue(y);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "Y" element
                         */
                        public void xsetY(org.apache.xmlbeans.XmlBase64Binary y)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBase64Binary target = null;
                            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(Y$6, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(Y$6);
                            }
                            target.set(y);
                          }
                        }
                      }
                    }
                    /**
                     * An XML FRMA(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$DD$CAF$FRMA.
                     */
                    public static class FRMAImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public FRMAImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, true);
                      }
                      
                      protected FRMAImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                      
                      private static final javax.xml.namespace.QName ALGORITMO$0 = 
                        new javax.xml.namespace.QName("", "algoritmo");
                      
                      
                      /**
                       * Gets the "algoritmo" attribute
                       */
                      public java.lang.String getAlgoritmo()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITMO$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALGORITMO$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "algoritmo" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAlgoritmo()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALGORITMO$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ALGORITMO$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "algoritmo" attribute
                       */
                      public void setAlgoritmo(java.lang.String algoritmo)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITMO$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITMO$0);
                          }
                          target.setStringValue(algoritmo);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "algoritmo" attribute
                       */
                      public void xsetAlgoritmo(org.apache.xmlbeans.XmlString algoritmo)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALGORITMO$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALGORITMO$0);
                          }
                          target.set(algoritmo);
                        }
                      }
                    }
                }
            }
            /**
             * An XML FRMT(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$FRMT.
             */
            public static class FRMTImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT
            {
                private static final long serialVersionUID = 1L;
                
                public FRMTImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected FRMTImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName ALGORITMO$0 = 
                    new javax.xml.namespace.QName("", "algoritmo");
                
                
                /**
                 * Gets the "algoritmo" attribute
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo.Enum getAlgoritmo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITMO$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "algoritmo" attribute
                 */
                public cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo xgetAlgoritmo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo)get_store().find_attribute_user(ALGORITMO$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "algoritmo" attribute
                 */
                public void setAlgoritmo(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo.Enum algoritmo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITMO$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITMO$0);
                      }
                      target.setEnumValue(algoritmo);
                    }
                }
                
                /**
                 * Sets (as xml) the "algoritmo" attribute
                 */
                public void xsetAlgoritmo(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo algoritmo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo target = null;
                      target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo)get_store().find_attribute_user(ALGORITMO$0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo)get_store().add_attribute_user(ALGORITMO$0);
                      }
                      target.set(algoritmo);
                    }
                }
                /**
                 * An XML algoritmo(@).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$FRMT$Algoritmo.
                 */
                public static class AlgoritmoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo
                {
                    private static final long serialVersionUID = 1L;
                    
                    public AlgoritmoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected AlgoritmoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
    }
}
