/*
 * An XML document type.
 * Localname: LibroGuia
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.libroguia.LibroGuiaDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.libroguia.impl;
/**
 * A document containing one LibroGuia(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class LibroGuiaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument
{
    private static final long serialVersionUID = 1L;
    
    public LibroGuiaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.LibroGuiaDocumentExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName LIBROGUIA$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "LibroGuia");
    
    
    /**
     * Gets the "LibroGuia" element
     */
    public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia getLibroGuia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia target = null;
            target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia)get_store().find_element_user(LIBROGUIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LibroGuia" element
     */
    public void setLibroGuia(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia libroGuia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia target = null;
            target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia)get_store().find_element_user(LIBROGUIA$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia)get_store().add_element_user(LIBROGUIA$0);
            }
            target.set(libroGuia);
        }
    }
    
    /**
     * Appends and returns a new empty "LibroGuia" element
     */
    public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia addNewLibroGuia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia target = null;
            target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia)get_store().add_element_user(LIBROGUIA$0);
            return target;
        }
    }
    /**
     * An XML LibroGuia(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class LibroGuiaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia
    {
        private static final long serialVersionUID = 1L;
        
        public LibroGuiaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIOLIBRO$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EnvioLibro");
        private static final javax.xml.namespace.QName SIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Signature");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "EnvioLibro" element
         */
        public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro getEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro)get_store().find_element_user(ENVIOLIBRO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "EnvioLibro" element
         */
        public void setEnvioLibro(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro envioLibro)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro)get_store().find_element_user(ENVIOLIBRO$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro)get_store().add_element_user(ENVIOLIBRO$0);
                }
                target.set(envioLibro);
            }
        }
        
        /**
         * Appends and returns a new empty "EnvioLibro" element
         */
        public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro addNewEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro)get_store().add_element_user(ENVIOLIBRO$0);
                return target;
            }
        }
        
        /**
         * Gets the "Signature" element
         */
        public cl.sii.siiDte.libroguia.SignatureType getSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
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
        public void setSignature(cl.sii.siiDte.libroguia.SignatureType signature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroguia.SignatureType)get_store().add_element_user(SIGNATURE$2);
                }
                target.set(signature);
            }
        }
        
        /**
         * Appends and returns a new empty "Signature" element
         */
        public cl.sii.siiDte.libroguia.SignatureType addNewSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType)get_store().add_element_user(SIGNATURE$2);
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
         * An XML EnvioLibro(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class EnvioLibroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro
        {
            private static final long serialVersionUID = 1L;
            
            public EnvioLibroImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CARATULA$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Caratula");
            private static final javax.xml.namespace.QName RESUMENSEGMENTO$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ResumenSegmento");
            private static final javax.xml.namespace.QName RESUMENPERIODO$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ResumenPeriodo");
            private static final javax.xml.namespace.QName DETALLE$6 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Detalle");
            private static final javax.xml.namespace.QName TMSTFIRMA$8 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TmstFirma");
            private static final javax.xml.namespace.QName ID$10 = 
                new javax.xml.namespace.QName("", "ID");
            
            
            /**
             * Gets the "Caratula" element
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula getCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Caratula" element
             */
            public void setCaratula(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula caratula)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula)get_store().add_element_user(CARATULA$0);
                    }
                    target.set(caratula);
                }
            }
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula addNewCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula)get_store().add_element_user(CARATULA$0);
                    return target;
                }
            }
            
            /**
             * Gets the "ResumenSegmento" element
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento getResumenSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento)get_store().find_element_user(RESUMENSEGMENTO$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "ResumenSegmento" element
             */
            public boolean isSetResumenSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESUMENSEGMENTO$2) != 0;
                }
            }
            
            /**
             * Sets the "ResumenSegmento" element
             */
            public void setResumenSegmento(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento resumenSegmento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento)get_store().find_element_user(RESUMENSEGMENTO$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento)get_store().add_element_user(RESUMENSEGMENTO$2);
                    }
                    target.set(resumenSegmento);
                }
            }
            
            /**
             * Appends and returns a new empty "ResumenSegmento" element
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento addNewResumenSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento)get_store().add_element_user(RESUMENSEGMENTO$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "ResumenSegmento" element
             */
            public void unsetResumenSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESUMENSEGMENTO$2, 0);
                }
            }
            
            /**
             * Gets the "ResumenPeriodo" element
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo getResumenPeriodo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo)get_store().find_element_user(RESUMENPERIODO$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "ResumenPeriodo" element
             */
            public boolean isSetResumenPeriodo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESUMENPERIODO$4) != 0;
                }
            }
            
            /**
             * Sets the "ResumenPeriodo" element
             */
            public void setResumenPeriodo(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo resumenPeriodo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo)get_store().find_element_user(RESUMENPERIODO$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo)get_store().add_element_user(RESUMENPERIODO$4);
                    }
                    target.set(resumenPeriodo);
                }
            }
            
            /**
             * Appends and returns a new empty "ResumenPeriodo" element
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo addNewResumenPeriodo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo)get_store().add_element_user(RESUMENPERIODO$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "ResumenPeriodo" element
             */
            public void unsetResumenPeriodo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESUMENPERIODO$4, 0);
                }
            }
            
            /**
             * Gets array of all "Detalle" elements
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle[] getDetalleArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DETALLE$6, targetList);
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle[] result = new cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Detalle" element
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle getDetalleArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle)get_store().find_element_user(DETALLE$6, i);
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
                    return get_store().count_elements(DETALLE$6);
                }
            }
            
            /**
             * Sets array of all "Detalle" element
             */
            public void setDetalleArray(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle[] detalleArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(detalleArray, DETALLE$6);
                }
            }
            
            /**
             * Sets ith "Detalle" element
             */
            public void setDetalleArray(int i, cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle detalle)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle)get_store().find_element_user(DETALLE$6, i);
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
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle insertNewDetalle(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle)get_store().insert_element_user(DETALLE$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Detalle" element
             */
            public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle addNewDetalle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle)get_store().add_element_user(DETALLE$6);
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
                    get_store().remove_element(DETALLE$6, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMA$8, 0);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMA$8, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMA$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTFIRMA$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMA$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TMSTFIRMA$8);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
                    }
                    target.set(id);
                }
            }
            /**
             * An XML Caratula(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class CaratulaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula
            {
                private static final long serialVersionUID = 1L;
                
                public CaratulaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RUTEMISORLIBRO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutEmisorLibro");
                private static final javax.xml.namespace.QName RUTENVIA$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutEnvia");
                private static final javax.xml.namespace.QName PERIODOTRIBUTARIO$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PeriodoTributario");
                private static final javax.xml.namespace.QName FCHRESOL$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchResol");
                private static final javax.xml.namespace.QName NRORESOL$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroResol");
                private static final javax.xml.namespace.QName TIPOLIBRO$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoLibro");
                private static final javax.xml.namespace.QName TIPOENVIO$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoEnvio");
                private static final javax.xml.namespace.QName NROSEGMENTO$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroSegmento");
                private static final javax.xml.namespace.QName FOLIONOTIFICACION$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FolioNotificacion");
                
                
                /**
                 * Gets the "RutEmisorLibro" element
                 */
                public java.lang.String getRutEmisorLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISORLIBRO$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RutEmisorLibro" element
                 */
                public cl.sii.siiDte.libroguia.RUTType xgetRutEmisorLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.RUTType target = null;
                      target = (cl.sii.siiDte.libroguia.RUTType)get_store().find_element_user(RUTEMISORLIBRO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RutEmisorLibro" element
                 */
                public void setRutEmisorLibro(java.lang.String rutEmisorLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISORLIBRO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTEMISORLIBRO$0);
                      }
                      target.setStringValue(rutEmisorLibro);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutEmisorLibro" element
                 */
                public void xsetRutEmisorLibro(cl.sii.siiDte.libroguia.RUTType rutEmisorLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.RUTType target = null;
                      target = (cl.sii.siiDte.libroguia.RUTType)get_store().find_element_user(RUTEMISORLIBRO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.RUTType)get_store().add_element_user(RUTEMISORLIBRO$0);
                      }
                      target.set(rutEmisorLibro);
                    }
                }
                
                /**
                 * Gets the "RutEnvia" element
                 */
                public java.lang.String getRutEnvia()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RutEnvia" element
                 */
                public cl.sii.siiDte.libroguia.RUTType xgetRutEnvia()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.RUTType target = null;
                      target = (cl.sii.siiDte.libroguia.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RutEnvia" element
                 */
                public void setRutEnvia(java.lang.String rutEnvia)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTENVIA$2);
                      }
                      target.setStringValue(rutEnvia);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutEnvia" element
                 */
                public void xsetRutEnvia(cl.sii.siiDte.libroguia.RUTType rutEnvia)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.RUTType target = null;
                      target = (cl.sii.siiDte.libroguia.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.RUTType)get_store().add_element_user(RUTENVIA$2);
                      }
                      target.set(rutEnvia);
                    }
                }
                
                /**
                 * Gets the "PeriodoTributario" element
                 */
                public java.util.Calendar getPeriodoTributario()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOTRIBUTARIO$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PeriodoTributario" element
                 */
                public org.apache.xmlbeans.XmlGYearMonth xgetPeriodoTributario()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlGYearMonth target = null;
                      target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(PERIODOTRIBUTARIO$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "PeriodoTributario" element
                 */
                public void setPeriodoTributario(java.util.Calendar periodoTributario)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOTRIBUTARIO$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODOTRIBUTARIO$4);
                      }
                      target.setCalendarValue(periodoTributario);
                    }
                }
                
                /**
                 * Sets (as xml) the "PeriodoTributario" element
                 */
                public void xsetPeriodoTributario(org.apache.xmlbeans.XmlGYearMonth periodoTributario)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlGYearMonth target = null;
                      target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(PERIODOTRIBUTARIO$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlGYearMonth)get_store().add_element_user(PERIODOTRIBUTARIO$4);
                      }
                      target.set(periodoTributario);
                    }
                }
                
                /**
                 * Gets the "FchResol" element
                 */
                public java.util.Calendar getFchResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHRESOL$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchResol" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHRESOL$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FchResol" element
                 */
                public void setFchResol(java.util.Calendar fchResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHRESOL$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHRESOL$6);
                      }
                      target.setCalendarValue(fchResol);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchResol" element
                 */
                public void xsetFchResol(org.apache.xmlbeans.XmlDate fchResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHRESOL$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHRESOL$6);
                      }
                      target.set(fchResol);
                    }
                }
                
                /**
                 * Gets the "NroResol" element
                 */
                public java.math.BigInteger getNroResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NroResol" element
                 */
                public org.apache.xmlbeans.XmlNonNegativeInteger xgetNroResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                      target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NRORESOL$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "NroResol" element
                 */
                public void setNroResol(java.math.BigInteger nroResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRORESOL$8);
                      }
                      target.setBigIntegerValue(nroResol);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                public void xsetNroResol(org.apache.xmlbeans.XmlNonNegativeInteger nroResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                      target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NRORESOL$8);
                      }
                      target.set(nroResol);
                    }
                }
                
                /**
                 * Gets the "TipoLibro" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro.Enum getTipoLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOLIBRO$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoLibro" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro xgetTipoLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro)get_store().find_element_user(TIPOLIBRO$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TipoLibro" element
                 */
                public void setTipoLibro(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro.Enum tipoLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOLIBRO$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOLIBRO$10);
                      }
                      target.setEnumValue(tipoLibro);
                    }
                }
                
                /**
                 * Sets (as xml) the "TipoLibro" element
                 */
                public void xsetTipoLibro(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro tipoLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro)get_store().find_element_user(TIPOLIBRO$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro)get_store().add_element_user(TIPOLIBRO$10);
                      }
                      target.set(tipoLibro);
                    }
                }
                
                /**
                 * Gets the "TipoEnvio" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio.Enum getTipoEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOENVIO$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoEnvio" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio xgetTipoEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio)get_store().find_element_user(TIPOENVIO$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TipoEnvio" element
                 */
                public boolean isSetTipoEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TIPOENVIO$12) != 0;
                    }
                }
                
                /**
                 * Sets the "TipoEnvio" element
                 */
                public void setTipoEnvio(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio.Enum tipoEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOENVIO$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOENVIO$12);
                      }
                      target.setEnumValue(tipoEnvio);
                    }
                }
                
                /**
                 * Sets (as xml) the "TipoEnvio" element
                 */
                public void xsetTipoEnvio(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio tipoEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio)get_store().find_element_user(TIPOENVIO$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio)get_store().add_element_user(TIPOENVIO$12);
                      }
                      target.set(tipoEnvio);
                    }
                }
                
                /**
                 * Unsets the "TipoEnvio" element
                 */
                public void unsetTipoEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TIPOENVIO$12, 0);
                    }
                }
                
                /**
                 * Gets the "NroSegmento" element
                 */
                public int getNroSegmento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROSEGMENTO$14, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NroSegmento" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento xgetNroSegmento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento)get_store().find_element_user(NROSEGMENTO$14, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "NroSegmento" element
                 */
                public boolean isSetNroSegmento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NROSEGMENTO$14) != 0;
                    }
                }
                
                /**
                 * Sets the "NroSegmento" element
                 */
                public void setNroSegmento(int nroSegmento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROSEGMENTO$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROSEGMENTO$14);
                      }
                      target.setIntValue(nroSegmento);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroSegmento" element
                 */
                public void xsetNroSegmento(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento nroSegmento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento)get_store().find_element_user(NROSEGMENTO$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento)get_store().add_element_user(NROSEGMENTO$14);
                      }
                      target.set(nroSegmento);
                    }
                }
                
                /**
                 * Unsets the "NroSegmento" element
                 */
                public void unsetNroSegmento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NROSEGMENTO$14, 0);
                    }
                }
                
                /**
                 * Gets the "FolioNotificacion" element
                 */
                public long getFolioNotificacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIONOTIFICACION$16, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FolioNotificacion" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion xgetFolioNotificacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion)get_store().find_element_user(FOLIONOTIFICACION$16, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FolioNotificacion" element
                 */
                public void setFolioNotificacion(long folioNotificacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIONOTIFICACION$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIONOTIFICACION$16);
                      }
                      target.setLongValue(folioNotificacion);
                    }
                }
                
                /**
                 * Sets (as xml) the "FolioNotificacion" element
                 */
                public void xsetFolioNotificacion(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion folioNotificacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion)get_store().find_element_user(FOLIONOTIFICACION$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion)get_store().add_element_user(FOLIONOTIFICACION$16);
                      }
                      target.set(folioNotificacion);
                    }
                }
                /**
                 * An XML TipoLibro(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$TipoLibro.
                 */
                public static class TipoLibroImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TipoLibroImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TipoLibroImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TipoEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$TipoEnvio.
                 */
                public static class TipoEnvioImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TipoEnvioImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TipoEnvioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML NroSegmento(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$NroSegmento.
                 */
                public static class NroSegmentoImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NroSegmentoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NroSegmentoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML FolioNotificacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$FolioNotificacion.
                 */
                public static class FolioNotificacionImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FolioNotificacionImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FolioNotificacionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML ResumenSegmento(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class ResumenSegmentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento
            {
                private static final long serialVersionUID = 1L;
                
                public ResumenSegmentoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TOTFOLANULADO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotFolAnulado");
                private static final javax.xml.namespace.QName TOTGUIAANULADA$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotGuiaAnulada");
                private static final javax.xml.namespace.QName TOTGUIAVENTA$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotGuiaVenta");
                private static final javax.xml.namespace.QName TOTMNTGUIAVTA$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntGuiaVta");
                private static final javax.xml.namespace.QName TOTMNTMODIFICADO$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntModificado");
                private static final javax.xml.namespace.QName TOTTRASLADO$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotTraslado");
                
                
                /**
                 * Gets the "TotFolAnulado" element
                 */
                public long getTotFolAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTFOLANULADO$0, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotFolAnulado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado xgetTotFolAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado)get_store().find_element_user(TOTFOLANULADO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TotFolAnulado" element
                 */
                public boolean isSetTotFolAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTFOLANULADO$0) != 0;
                    }
                }
                
                /**
                 * Sets the "TotFolAnulado" element
                 */
                public void setTotFolAnulado(long totFolAnulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTFOLANULADO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTFOLANULADO$0);
                      }
                      target.setLongValue(totFolAnulado);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotFolAnulado" element
                 */
                public void xsetTotFolAnulado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado totFolAnulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado)get_store().find_element_user(TOTFOLANULADO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado)get_store().add_element_user(TOTFOLANULADO$0);
                      }
                      target.set(totFolAnulado);
                    }
                }
                
                /**
                 * Unsets the "TotFolAnulado" element
                 */
                public void unsetTotFolAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTFOLANULADO$0, 0);
                    }
                }
                
                /**
                 * Gets the "TotGuiaAnulada" element
                 */
                public long getTotGuiaAnulada()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTGUIAANULADA$2, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotGuiaAnulada" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada xgetTotGuiaAnulada()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada)get_store().find_element_user(TOTGUIAANULADA$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TotGuiaAnulada" element
                 */
                public boolean isSetTotGuiaAnulada()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTGUIAANULADA$2) != 0;
                    }
                }
                
                /**
                 * Sets the "TotGuiaAnulada" element
                 */
                public void setTotGuiaAnulada(long totGuiaAnulada)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTGUIAANULADA$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTGUIAANULADA$2);
                      }
                      target.setLongValue(totGuiaAnulada);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotGuiaAnulada" element
                 */
                public void xsetTotGuiaAnulada(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada totGuiaAnulada)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada)get_store().find_element_user(TOTGUIAANULADA$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada)get_store().add_element_user(TOTGUIAANULADA$2);
                      }
                      target.set(totGuiaAnulada);
                    }
                }
                
                /**
                 * Unsets the "TotGuiaAnulada" element
                 */
                public void unsetTotGuiaAnulada()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTGUIAANULADA$2, 0);
                    }
                }
                
                /**
                 * Gets the "TotGuiaVenta" element
                 */
                public long getTotGuiaVenta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTGUIAVENTA$4, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotGuiaVenta" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta xgetTotGuiaVenta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta)get_store().find_element_user(TOTGUIAVENTA$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TotGuiaVenta" element
                 */
                public void setTotGuiaVenta(long totGuiaVenta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTGUIAVENTA$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTGUIAVENTA$4);
                      }
                      target.setLongValue(totGuiaVenta);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotGuiaVenta" element
                 */
                public void xsetTotGuiaVenta(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta totGuiaVenta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta)get_store().find_element_user(TOTGUIAVENTA$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta)get_store().add_element_user(TOTGUIAVENTA$4);
                      }
                      target.set(totGuiaVenta);
                    }
                }
                
                /**
                 * Gets the "TotMntGuiaVta" element
                 */
                public long getTotMntGuiaVta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTGUIAVTA$6, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotMntGuiaVta" element
                 */
                public cl.sii.siiDte.libroguia.ValorType xgetTotMntGuiaVta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.ValorType target = null;
                      target = (cl.sii.siiDte.libroguia.ValorType)get_store().find_element_user(TOTMNTGUIAVTA$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TotMntGuiaVta" element
                 */
                public void setTotMntGuiaVta(long totMntGuiaVta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTGUIAVTA$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTGUIAVTA$6);
                      }
                      target.setLongValue(totMntGuiaVta);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotMntGuiaVta" element
                 */
                public void xsetTotMntGuiaVta(cl.sii.siiDte.libroguia.ValorType totMntGuiaVta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.ValorType target = null;
                      target = (cl.sii.siiDte.libroguia.ValorType)get_store().find_element_user(TOTMNTGUIAVTA$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.ValorType)get_store().add_element_user(TOTMNTGUIAVTA$6);
                      }
                      target.set(totMntGuiaVta);
                    }
                }
                
                /**
                 * Gets the "TotMntModificado" element
                 */
                public long getTotMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTMODIFICADO$8, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotMntModificado" element
                 */
                public cl.sii.siiDte.libroguia.ValorType xgetTotMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.ValorType target = null;
                      target = (cl.sii.siiDte.libroguia.ValorType)get_store().find_element_user(TOTMNTMODIFICADO$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TotMntModificado" element
                 */
                public boolean isSetTotMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTMNTMODIFICADO$8) != 0;
                    }
                }
                
                /**
                 * Sets the "TotMntModificado" element
                 */
                public void setTotMntModificado(long totMntModificado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTMODIFICADO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTMODIFICADO$8);
                      }
                      target.setLongValue(totMntModificado);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotMntModificado" element
                 */
                public void xsetTotMntModificado(cl.sii.siiDte.libroguia.ValorType totMntModificado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.ValorType target = null;
                      target = (cl.sii.siiDte.libroguia.ValorType)get_store().find_element_user(TOTMNTMODIFICADO$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.ValorType)get_store().add_element_user(TOTMNTMODIFICADO$8);
                      }
                      target.set(totMntModificado);
                    }
                }
                
                /**
                 * Unsets the "TotMntModificado" element
                 */
                public void unsetTotMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTMNTMODIFICADO$8, 0);
                    }
                }
                
                /**
                 * Gets array of all "TotTraslado" elements
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado[] getTotTrasladoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TOTTRASLADO$10, targetList);
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado[] result = new cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "TotTraslado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado getTotTrasladoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado)get_store().find_element_user(TOTTRASLADO$10, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "TotTraslado" element
                 */
                public int sizeOfTotTrasladoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTTRASLADO$10);
                    }
                }
                
                /**
                 * Sets array of all "TotTraslado" element
                 */
                public void setTotTrasladoArray(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado[] totTrasladoArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(totTrasladoArray, TOTTRASLADO$10);
                    }
                }
                
                /**
                 * Sets ith "TotTraslado" element
                 */
                public void setTotTrasladoArray(int i, cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado totTraslado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado)get_store().find_element_user(TOTTRASLADO$10, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(totTraslado);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotTraslado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado insertNewTotTraslado(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado)get_store().insert_element_user(TOTTRASLADO$10, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotTraslado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado addNewTotTraslado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado)get_store().add_element_user(TOTTRASLADO$10);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "TotTraslado" element
                 */
                public void removeTotTraslado(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTTRASLADO$10, i);
                    }
                }
                /**
                 * An XML TotFolAnulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotFolAnulado.
                 */
                public static class TotFolAnuladoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotFolAnuladoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TotFolAnuladoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TotGuiaAnulada(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotGuiaAnulada.
                 */
                public static class TotGuiaAnuladaImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotGuiaAnuladaImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TotGuiaAnuladaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TotGuiaVenta(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotGuiaVenta.
                 */
                public static class TotGuiaVentaImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotGuiaVentaImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TotGuiaVentaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TotTraslado(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class TotTrasladoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotTrasladoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TPOTRASLADO$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoTraslado");
                    private static final javax.xml.namespace.QName CANTGUIA$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CantGuia");
                    private static final javax.xml.namespace.QName MNTGUIA$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntGuia");
                    
                    
                    /**
                     * Gets the "TpoTraslado" element
                     */
                    public int getTpoTraslado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOTRASLADO$0, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TpoTraslado" element
                     */
                    public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado xgetTpoTraslado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado target = null;
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado)get_store().find_element_user(TPOTRASLADO$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TpoTraslado" element
                     */
                    public void setTpoTraslado(int tpoTraslado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOTRASLADO$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOTRASLADO$0);
                        }
                        target.setIntValue(tpoTraslado);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TpoTraslado" element
                     */
                    public void xsetTpoTraslado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado tpoTraslado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado target = null;
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado)get_store().find_element_user(TPOTRASLADO$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado)get_store().add_element_user(TPOTRASLADO$0);
                        }
                        target.set(tpoTraslado);
                      }
                    }
                    
                    /**
                     * Gets the "CantGuia" element
                     */
                    public long getCantGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANTGUIA$2, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CantGuia" element
                     */
                    public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia xgetCantGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia target = null;
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia)get_store().find_element_user(CANTGUIA$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "CantGuia" element
                     */
                    public void setCantGuia(long cantGuia)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANTGUIA$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANTGUIA$2);
                        }
                        target.setLongValue(cantGuia);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CantGuia" element
                     */
                    public void xsetCantGuia(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia cantGuia)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia target = null;
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia)get_store().find_element_user(CANTGUIA$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia)get_store().add_element_user(CANTGUIA$2);
                        }
                        target.set(cantGuia);
                      }
                    }
                    
                    /**
                     * Gets the "MntGuia" element
                     */
                    public long getMntGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTGUIA$4, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "MntGuia" element
                     */
                    public cl.sii.siiDte.libroguia.ValorType xgetMntGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.ValorType target = null;
                        target = (cl.sii.siiDte.libroguia.ValorType)get_store().find_element_user(MNTGUIA$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "MntGuia" element
                     */
                    public boolean isSetMntGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(MNTGUIA$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "MntGuia" element
                     */
                    public void setMntGuia(long mntGuia)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTGUIA$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTGUIA$4);
                        }
                        target.setLongValue(mntGuia);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "MntGuia" element
                     */
                    public void xsetMntGuia(cl.sii.siiDte.libroguia.ValorType mntGuia)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.ValorType target = null;
                        target = (cl.sii.siiDte.libroguia.ValorType)get_store().find_element_user(MNTGUIA$4, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroguia.ValorType)get_store().add_element_user(MNTGUIA$4);
                        }
                        target.set(mntGuia);
                      }
                    }
                    
                    /**
                     * Unsets the "MntGuia" element
                     */
                    public void unsetMntGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(MNTGUIA$4, 0);
                      }
                    }
                    /**
                     * An XML TpoTraslado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotTraslado$TpoTraslado.
                     */
                    public static class TpoTrasladoImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TpoTrasladoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TpoTrasladoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML CantGuia(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotTraslado$CantGuia.
                     */
                    public static class CantGuiaImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public CantGuiaImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected CantGuiaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
            }
            /**
             * An XML ResumenPeriodo(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class ResumenPeriodoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo
            {
                private static final long serialVersionUID = 1L;
                
                public ResumenPeriodoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TOTFOLANULADO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotFolAnulado");
                private static final javax.xml.namespace.QName TOTGUIAANULADA$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotGuiaAnulada");
                private static final javax.xml.namespace.QName TOTGUIAVENTA$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotGuiaVenta");
                private static final javax.xml.namespace.QName TOTMNTGUIAVTA$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntGuiaVta");
                private static final javax.xml.namespace.QName TOTMNTMODIFICADO$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntModificado");
                private static final javax.xml.namespace.QName TOTTRASLADO$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotTraslado");
                
                
                /**
                 * Gets the "TotFolAnulado" element
                 */
                public long getTotFolAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTFOLANULADO$0, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotFolAnulado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado xgetTotFolAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado)get_store().find_element_user(TOTFOLANULADO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TotFolAnulado" element
                 */
                public boolean isSetTotFolAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTFOLANULADO$0) != 0;
                    }
                }
                
                /**
                 * Sets the "TotFolAnulado" element
                 */
                public void setTotFolAnulado(long totFolAnulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTFOLANULADO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTFOLANULADO$0);
                      }
                      target.setLongValue(totFolAnulado);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotFolAnulado" element
                 */
                public void xsetTotFolAnulado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado totFolAnulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado)get_store().find_element_user(TOTFOLANULADO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado)get_store().add_element_user(TOTFOLANULADO$0);
                      }
                      target.set(totFolAnulado);
                    }
                }
                
                /**
                 * Unsets the "TotFolAnulado" element
                 */
                public void unsetTotFolAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTFOLANULADO$0, 0);
                    }
                }
                
                /**
                 * Gets the "TotGuiaAnulada" element
                 */
                public long getTotGuiaAnulada()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTGUIAANULADA$2, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotGuiaAnulada" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada xgetTotGuiaAnulada()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada)get_store().find_element_user(TOTGUIAANULADA$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TotGuiaAnulada" element
                 */
                public boolean isSetTotGuiaAnulada()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTGUIAANULADA$2) != 0;
                    }
                }
                
                /**
                 * Sets the "TotGuiaAnulada" element
                 */
                public void setTotGuiaAnulada(long totGuiaAnulada)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTGUIAANULADA$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTGUIAANULADA$2);
                      }
                      target.setLongValue(totGuiaAnulada);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotGuiaAnulada" element
                 */
                public void xsetTotGuiaAnulada(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada totGuiaAnulada)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada)get_store().find_element_user(TOTGUIAANULADA$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada)get_store().add_element_user(TOTGUIAANULADA$2);
                      }
                      target.set(totGuiaAnulada);
                    }
                }
                
                /**
                 * Unsets the "TotGuiaAnulada" element
                 */
                public void unsetTotGuiaAnulada()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTGUIAANULADA$2, 0);
                    }
                }
                
                /**
                 * Gets the "TotGuiaVenta" element
                 */
                public long getTotGuiaVenta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTGUIAVENTA$4, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotGuiaVenta" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta xgetTotGuiaVenta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta)get_store().find_element_user(TOTGUIAVENTA$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TotGuiaVenta" element
                 */
                public void setTotGuiaVenta(long totGuiaVenta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTGUIAVENTA$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTGUIAVENTA$4);
                      }
                      target.setLongValue(totGuiaVenta);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotGuiaVenta" element
                 */
                public void xsetTotGuiaVenta(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta totGuiaVenta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta)get_store().find_element_user(TOTGUIAVENTA$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta)get_store().add_element_user(TOTGUIAVENTA$4);
                      }
                      target.set(totGuiaVenta);
                    }
                }
                
                /**
                 * Gets the "TotMntGuiaVta" element
                 */
                public long getTotMntGuiaVta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTGUIAVTA$6, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotMntGuiaVta" element
                 */
                public cl.sii.siiDte.libroguia.MontoType xgetTotMntGuiaVta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(TOTMNTGUIAVTA$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TotMntGuiaVta" element
                 */
                public void setTotMntGuiaVta(long totMntGuiaVta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTGUIAVTA$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTGUIAVTA$6);
                      }
                      target.setLongValue(totMntGuiaVta);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotMntGuiaVta" element
                 */
                public void xsetTotMntGuiaVta(cl.sii.siiDte.libroguia.MontoType totMntGuiaVta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(TOTMNTGUIAVTA$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.MontoType)get_store().add_element_user(TOTMNTGUIAVTA$6);
                      }
                      target.set(totMntGuiaVta);
                    }
                }
                
                /**
                 * Gets the "TotMntModificado" element
                 */
                public long getTotMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTMODIFICADO$8, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TotMntModificado" element
                 */
                public cl.sii.siiDte.libroguia.MontoType xgetTotMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(TOTMNTMODIFICADO$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TotMntModificado" element
                 */
                public boolean isSetTotMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTMNTMODIFICADO$8) != 0;
                    }
                }
                
                /**
                 * Sets the "TotMntModificado" element
                 */
                public void setTotMntModificado(long totMntModificado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTMODIFICADO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTMODIFICADO$8);
                      }
                      target.setLongValue(totMntModificado);
                    }
                }
                
                /**
                 * Sets (as xml) the "TotMntModificado" element
                 */
                public void xsetTotMntModificado(cl.sii.siiDte.libroguia.MontoType totMntModificado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(TOTMNTMODIFICADO$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.MontoType)get_store().add_element_user(TOTMNTMODIFICADO$8);
                      }
                      target.set(totMntModificado);
                    }
                }
                
                /**
                 * Unsets the "TotMntModificado" element
                 */
                public void unsetTotMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTMNTMODIFICADO$8, 0);
                    }
                }
                
                /**
                 * Gets array of all "TotTraslado" elements
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado[] getTotTrasladoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TOTTRASLADO$10, targetList);
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado[] result = new cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "TotTraslado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado getTotTrasladoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado)get_store().find_element_user(TOTTRASLADO$10, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "TotTraslado" element
                 */
                public int sizeOfTotTrasladoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTTRASLADO$10);
                    }
                }
                
                /**
                 * Sets array of all "TotTraslado" element
                 */
                public void setTotTrasladoArray(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado[] totTrasladoArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(totTrasladoArray, TOTTRASLADO$10);
                    }
                }
                
                /**
                 * Sets ith "TotTraslado" element
                 */
                public void setTotTrasladoArray(int i, cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado totTraslado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado)get_store().find_element_user(TOTTRASLADO$10, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(totTraslado);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotTraslado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado insertNewTotTraslado(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado)get_store().insert_element_user(TOTTRASLADO$10, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotTraslado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado addNewTotTraslado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado)get_store().add_element_user(TOTTRASLADO$10);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "TotTraslado" element
                 */
                public void removeTotTraslado(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTTRASLADO$10, i);
                    }
                }
                /**
                 * An XML TotFolAnulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotFolAnulado.
                 */
                public static class TotFolAnuladoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotFolAnuladoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TotFolAnuladoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TotGuiaAnulada(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotGuiaAnulada.
                 */
                public static class TotGuiaAnuladaImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotGuiaAnuladaImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TotGuiaAnuladaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TotGuiaVenta(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotGuiaVenta.
                 */
                public static class TotGuiaVentaImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotGuiaVentaImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TotGuiaVentaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TotTraslado(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class TotTrasladoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotTrasladoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TPOTRASLADO$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoTraslado");
                    private static final javax.xml.namespace.QName CANTGUIA$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CantGuia");
                    private static final javax.xml.namespace.QName MNTGUIA$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntGuia");
                    
                    
                    /**
                     * Gets the "TpoTraslado" element
                     */
                    public int getTpoTraslado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOTRASLADO$0, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TpoTraslado" element
                     */
                    public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado xgetTpoTraslado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado target = null;
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado)get_store().find_element_user(TPOTRASLADO$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TpoTraslado" element
                     */
                    public void setTpoTraslado(int tpoTraslado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOTRASLADO$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOTRASLADO$0);
                        }
                        target.setIntValue(tpoTraslado);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TpoTraslado" element
                     */
                    public void xsetTpoTraslado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado tpoTraslado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado target = null;
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado)get_store().find_element_user(TPOTRASLADO$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado)get_store().add_element_user(TPOTRASLADO$0);
                        }
                        target.set(tpoTraslado);
                      }
                    }
                    
                    /**
                     * Gets the "CantGuia" element
                     */
                    public long getCantGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANTGUIA$2, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CantGuia" element
                     */
                    public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia xgetCantGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia target = null;
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia)get_store().find_element_user(CANTGUIA$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "CantGuia" element
                     */
                    public void setCantGuia(long cantGuia)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANTGUIA$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANTGUIA$2);
                        }
                        target.setLongValue(cantGuia);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CantGuia" element
                     */
                    public void xsetCantGuia(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia cantGuia)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia target = null;
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia)get_store().find_element_user(CANTGUIA$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia)get_store().add_element_user(CANTGUIA$2);
                        }
                        target.set(cantGuia);
                      }
                    }
                    
                    /**
                     * Gets the "MntGuia" element
                     */
                    public long getMntGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTGUIA$4, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "MntGuia" element
                     */
                    public cl.sii.siiDte.libroguia.MontoType xgetMntGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.MontoType target = null;
                        target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(MNTGUIA$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "MntGuia" element
                     */
                    public boolean isSetMntGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(MNTGUIA$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "MntGuia" element
                     */
                    public void setMntGuia(long mntGuia)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTGUIA$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTGUIA$4);
                        }
                        target.setLongValue(mntGuia);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "MntGuia" element
                     */
                    public void xsetMntGuia(cl.sii.siiDte.libroguia.MontoType mntGuia)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroguia.MontoType target = null;
                        target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(MNTGUIA$4, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroguia.MontoType)get_store().add_element_user(MNTGUIA$4);
                        }
                        target.set(mntGuia);
                      }
                    }
                    
                    /**
                     * Unsets the "MntGuia" element
                     */
                    public void unsetMntGuia()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(MNTGUIA$4, 0);
                      }
                    }
                    /**
                     * An XML TpoTraslado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotTraslado$TpoTraslado.
                     */
                    public static class TpoTrasladoImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TpoTrasladoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TpoTrasladoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML CantGuia(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotTraslado$CantGuia.
                     */
                    public static class CantGuiaImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public CantGuiaImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected CantGuiaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
            }
            /**
             * An XML Detalle(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class DetalleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle
            {
                private static final long serialVersionUID = 1L;
                
                public DetalleImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName FOLIO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Folio");
                private static final javax.xml.namespace.QName ANULADO$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Anulado");
                private static final javax.xml.namespace.QName OPERACION$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Operacion");
                private static final javax.xml.namespace.QName TPOOPER$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoOper");
                private static final javax.xml.namespace.QName FCHDOC$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchDoc");
                private static final javax.xml.namespace.QName RUTDOC$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTDoc");
                private static final javax.xml.namespace.QName RZNSOC$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RznSoc");
                private static final javax.xml.namespace.QName MNTNETO$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntNeto");
                private static final javax.xml.namespace.QName TASAIMP$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TasaImp");
                private static final javax.xml.namespace.QName IVA$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVA");
                private static final javax.xml.namespace.QName MNTTOTAL$20 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntTotal");
                private static final javax.xml.namespace.QName MNTMODIFICADO$22 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntModificado");
                private static final javax.xml.namespace.QName TPODOCREF$24 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDocRef");
                private static final javax.xml.namespace.QName FOLIODOCREF$26 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FolioDocRef");
                private static final javax.xml.namespace.QName FCHDOCREF$28 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchDocRef");
                
                
                /**
                 * Gets the "Folio" element
                 */
                public long getFolio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$0, 0);
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
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio xgetFolio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio)get_store().find_element_user(FOLIO$0, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIO$0);
                      }
                      target.setLongValue(folio);
                    }
                }
                
                /**
                 * Sets (as xml) the "Folio" element
                 */
                public void xsetFolio(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio folio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio)get_store().find_element_user(FOLIO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio)get_store().add_element_user(FOLIO$0);
                      }
                      target.set(folio);
                    }
                }
                
                /**
                 * Gets the "Anulado" element
                 */
                public int getAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANULADO$2, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Anulado" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado xgetAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado)get_store().find_element_user(ANULADO$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Anulado" element
                 */
                public boolean isSetAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(ANULADO$2) != 0;
                    }
                }
                
                /**
                 * Sets the "Anulado" element
                 */
                public void setAnulado(int anulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANULADO$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANULADO$2);
                      }
                      target.setIntValue(anulado);
                    }
                }
                
                /**
                 * Sets (as xml) the "Anulado" element
                 */
                public void xsetAnulado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado anulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado)get_store().find_element_user(ANULADO$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado)get_store().add_element_user(ANULADO$2);
                      }
                      target.set(anulado);
                    }
                }
                
                /**
                 * Unsets the "Anulado" element
                 */
                public void unsetAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(ANULADO$2, 0);
                    }
                }
                
                /**
                 * Gets the "Operacion" element
                 */
                public int getOperacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERACION$4, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Operacion" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion xgetOperacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion)get_store().find_element_user(OPERACION$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Operacion" element
                 */
                public boolean isSetOperacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(OPERACION$4) != 0;
                    }
                }
                
                /**
                 * Sets the "Operacion" element
                 */
                public void setOperacion(int operacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERACION$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERACION$4);
                      }
                      target.setIntValue(operacion);
                    }
                }
                
                /**
                 * Sets (as xml) the "Operacion" element
                 */
                public void xsetOperacion(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion operacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion)get_store().find_element_user(OPERACION$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion)get_store().add_element_user(OPERACION$4);
                      }
                      target.set(operacion);
                    }
                }
                
                /**
                 * Unsets the "Operacion" element
                 */
                public void unsetOperacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(OPERACION$4, 0);
                    }
                }
                
                /**
                 * Gets the "TpoOper" element
                 */
                public int getTpoOper()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOOPER$6, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TpoOper" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper xgetTpoOper()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper)get_store().find_element_user(TPOOPER$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TpoOper" element
                 */
                public boolean isSetTpoOper()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TPOOPER$6) != 0;
                    }
                }
                
                /**
                 * Sets the "TpoOper" element
                 */
                public void setTpoOper(int tpoOper)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOOPER$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOOPER$6);
                      }
                      target.setIntValue(tpoOper);
                    }
                }
                
                /**
                 * Sets (as xml) the "TpoOper" element
                 */
                public void xsetTpoOper(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper tpoOper)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper)get_store().find_element_user(TPOOPER$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper)get_store().add_element_user(TPOOPER$6);
                      }
                      target.set(tpoOper);
                    }
                }
                
                /**
                 * Unsets the "TpoOper" element
                 */
                public void unsetTpoOper()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TPOOPER$6, 0);
                    }
                }
                
                /**
                 * Gets the "FchDoc" element
                 */
                public java.util.Calendar getFchDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHDOC$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchDoc" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHDOC$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "FchDoc" element
                 */
                public boolean isSetFchDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FCHDOC$8) != 0;
                    }
                }
                
                /**
                 * Sets the "FchDoc" element
                 */
                public void setFchDoc(java.util.Calendar fchDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHDOC$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHDOC$8);
                      }
                      target.setCalendarValue(fchDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchDoc" element
                 */
                public void xsetFchDoc(org.apache.xmlbeans.XmlDate fchDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHDOC$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHDOC$8);
                      }
                      target.set(fchDoc);
                    }
                }
                
                /**
                 * Unsets the "FchDoc" element
                 */
                public void unsetFchDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FCHDOC$8, 0);
                    }
                }
                
                /**
                 * Gets the "RUTDoc" element
                 */
                public java.lang.String getRUTDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTDOC$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RUTDoc" element
                 */
                public cl.sii.siiDte.libroguia.RUTType xgetRUTDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.RUTType target = null;
                      target = (cl.sii.siiDte.libroguia.RUTType)get_store().find_element_user(RUTDOC$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RUTDoc" element
                 */
                public boolean isSetRUTDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RUTDOC$10) != 0;
                    }
                }
                
                /**
                 * Sets the "RUTDoc" element
                 */
                public void setRUTDoc(java.lang.String rutDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTDOC$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTDOC$10);
                      }
                      target.setStringValue(rutDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "RUTDoc" element
                 */
                public void xsetRUTDoc(cl.sii.siiDte.libroguia.RUTType rutDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.RUTType target = null;
                      target = (cl.sii.siiDte.libroguia.RUTType)get_store().find_element_user(RUTDOC$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.RUTType)get_store().add_element_user(RUTDOC$10);
                      }
                      target.set(rutDoc);
                    }
                }
                
                /**
                 * Unsets the "RUTDoc" element
                 */
                public void unsetRUTDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RUTDOC$10, 0);
                    }
                }
                
                /**
                 * Gets the "RznSoc" element
                 */
                public java.lang.String getRznSoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RZNSOC$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RznSoc" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc xgetRznSoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc)get_store().find_element_user(RZNSOC$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RznSoc" element
                 */
                public boolean isSetRznSoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RZNSOC$12) != 0;
                    }
                }
                
                /**
                 * Sets the "RznSoc" element
                 */
                public void setRznSoc(java.lang.String rznSoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RZNSOC$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RZNSOC$12);
                      }
                      target.setStringValue(rznSoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "RznSoc" element
                 */
                public void xsetRznSoc(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc rznSoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc)get_store().find_element_user(RZNSOC$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc)get_store().add_element_user(RZNSOC$12);
                      }
                      target.set(rznSoc);
                    }
                }
                
                /**
                 * Unsets the "RznSoc" element
                 */
                public void unsetRznSoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RZNSOC$12, 0);
                    }
                }
                
                /**
                 * Gets the "MntNeto" element
                 */
                public long getMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNETO$14, 0);
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
                public cl.sii.siiDte.libroguia.MontoType xgetMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(MNTNETO$14, 0);
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
                      return get_store().count_elements(MNTNETO$14) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNETO$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTNETO$14);
                      }
                      target.setLongValue(mntNeto);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntNeto" element
                 */
                public void xsetMntNeto(cl.sii.siiDte.libroguia.MontoType mntNeto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(MNTNETO$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.MontoType)get_store().add_element_user(MNTNETO$14);
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
                      get_store().remove_element(MNTNETO$14, 0);
                    }
                }
                
                /**
                 * Gets the "TasaImp" element
                 */
                public java.math.BigDecimal getTasaImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIMP$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigDecimalValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TasaImp" element
                 */
                public cl.sii.siiDte.libroguia.PctType xgetTasaImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.PctType target = null;
                      target = (cl.sii.siiDte.libroguia.PctType)get_store().find_element_user(TASAIMP$16, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TasaImp" element
                 */
                public boolean isSetTasaImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TASAIMP$16) != 0;
                    }
                }
                
                /**
                 * Sets the "TasaImp" element
                 */
                public void setTasaImp(java.math.BigDecimal tasaImp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIMP$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASAIMP$16);
                      }
                      target.setBigDecimalValue(tasaImp);
                    }
                }
                
                /**
                 * Sets (as xml) the "TasaImp" element
                 */
                public void xsetTasaImp(cl.sii.siiDte.libroguia.PctType tasaImp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.PctType target = null;
                      target = (cl.sii.siiDte.libroguia.PctType)get_store().find_element_user(TASAIMP$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.PctType)get_store().add_element_user(TASAIMP$16);
                      }
                      target.set(tasaImp);
                    }
                }
                
                /**
                 * Unsets the "TasaImp" element
                 */
                public void unsetTasaImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TASAIMP$16, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVA$18, 0);
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
                public cl.sii.siiDte.libroguia.MontoType xgetIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(IVA$18, 0);
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
                      return get_store().count_elements(IVA$18) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVA$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVA$18);
                      }
                      target.setLongValue(iva);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVA" element
                 */
                public void xsetIVA(cl.sii.siiDte.libroguia.MontoType iva)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(IVA$18, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.MontoType)get_store().add_element_user(IVA$18);
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
                      get_store().remove_element(IVA$18, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$20, 0);
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
                public cl.sii.siiDte.libroguia.MontoType xgetMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(MNTTOTAL$20, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntTotal" element
                 */
                public boolean isSetMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTTOTAL$20) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$20, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTTOTAL$20);
                      }
                      target.setLongValue(mntTotal);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntTotal" element
                 */
                public void xsetMntTotal(cl.sii.siiDte.libroguia.MontoType mntTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(MNTTOTAL$20, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.MontoType)get_store().add_element_user(MNTTOTAL$20);
                      }
                      target.set(mntTotal);
                    }
                }
                
                /**
                 * Unsets the "MntTotal" element
                 */
                public void unsetMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTTOTAL$20, 0);
                    }
                }
                
                /**
                 * Gets the "MntModificado" element
                 */
                public long getMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTMODIFICADO$22, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntModificado" element
                 */
                public cl.sii.siiDte.libroguia.MontoType xgetMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(MNTMODIFICADO$22, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntModificado" element
                 */
                public boolean isSetMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTMODIFICADO$22) != 0;
                    }
                }
                
                /**
                 * Sets the "MntModificado" element
                 */
                public void setMntModificado(long mntModificado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTMODIFICADO$22, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTMODIFICADO$22);
                      }
                      target.setLongValue(mntModificado);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntModificado" element
                 */
                public void xsetMntModificado(cl.sii.siiDte.libroguia.MontoType mntModificado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.MontoType target = null;
                      target = (cl.sii.siiDte.libroguia.MontoType)get_store().find_element_user(MNTMODIFICADO$22, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.MontoType)get_store().add_element_user(MNTMODIFICADO$22);
                      }
                      target.set(mntModificado);
                    }
                }
                
                /**
                 * Unsets the "MntModificado" element
                 */
                public void unsetMntModificado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTMODIFICADO$22, 0);
                    }
                }
                
                /**
                 * Gets the "TpoDocRef" element
                 */
                public java.math.BigInteger getTpoDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOCREF$24, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TpoDocRef" element
                 */
                public cl.sii.siiDte.libroguia.DoctoType xgetTpoDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.DoctoType target = null;
                      target = (cl.sii.siiDte.libroguia.DoctoType)get_store().find_element_user(TPODOCREF$24, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TpoDocRef" element
                 */
                public boolean isSetTpoDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TPODOCREF$24) != 0;
                    }
                }
                
                /**
                 * Sets the "TpoDocRef" element
                 */
                public void setTpoDocRef(java.math.BigInteger tpoDocRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOCREF$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPODOCREF$24);
                      }
                      target.setBigIntegerValue(tpoDocRef);
                    }
                }
                
                /**
                 * Sets (as xml) the "TpoDocRef" element
                 */
                public void xsetTpoDocRef(cl.sii.siiDte.libroguia.DoctoType tpoDocRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.DoctoType target = null;
                      target = (cl.sii.siiDte.libroguia.DoctoType)get_store().find_element_user(TPODOCREF$24, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.DoctoType)get_store().add_element_user(TPODOCREF$24);
                      }
                      target.set(tpoDocRef);
                    }
                }
                
                /**
                 * Unsets the "TpoDocRef" element
                 */
                public void unsetTpoDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TPODOCREF$24, 0);
                    }
                }
                
                /**
                 * Gets the "FolioDocRef" element
                 */
                public long getFolioDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIODOCREF$26, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FolioDocRef" element
                 */
                public cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef xgetFolioDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef)get_store().find_element_user(FOLIODOCREF$26, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "FolioDocRef" element
                 */
                public boolean isSetFolioDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FOLIODOCREF$26) != 0;
                    }
                }
                
                /**
                 * Sets the "FolioDocRef" element
                 */
                public void setFolioDocRef(long folioDocRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIODOCREF$26, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIODOCREF$26);
                      }
                      target.setLongValue(folioDocRef);
                    }
                }
                
                /**
                 * Sets (as xml) the "FolioDocRef" element
                 */
                public void xsetFolioDocRef(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef folioDocRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef target = null;
                      target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef)get_store().find_element_user(FOLIODOCREF$26, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef)get_store().add_element_user(FOLIODOCREF$26);
                      }
                      target.set(folioDocRef);
                    }
                }
                
                /**
                 * Unsets the "FolioDocRef" element
                 */
                public void unsetFolioDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FOLIODOCREF$26, 0);
                    }
                }
                
                /**
                 * Gets the "FchDocRef" element
                 */
                public java.util.Calendar getFchDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHDOCREF$28, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchDocRef" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHDOCREF$28, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "FchDocRef" element
                 */
                public boolean isSetFchDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FCHDOCREF$28) != 0;
                    }
                }
                
                /**
                 * Sets the "FchDocRef" element
                 */
                public void setFchDocRef(java.util.Calendar fchDocRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHDOCREF$28, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHDOCREF$28);
                      }
                      target.setCalendarValue(fchDocRef);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchDocRef" element
                 */
                public void xsetFchDocRef(org.apache.xmlbeans.XmlDate fchDocRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHDOCREF$28, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHDOCREF$28);
                      }
                      target.set(fchDocRef);
                    }
                }
                
                /**
                 * Unsets the "FchDocRef" element
                 */
                public void unsetFchDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FCHDOCREF$28, 0);
                    }
                }
                /**
                 * An XML Folio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$Folio.
                 */
                public static class FolioImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FolioImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FolioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML Anulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$Anulado.
                 */
                public static class AnuladoImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado
                {
                    private static final long serialVersionUID = 1L;
                    
                    public AnuladoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected AnuladoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML Operacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$Operacion.
                 */
                public static class OperacionImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion
                {
                    private static final long serialVersionUID = 1L;
                    
                    public OperacionImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected OperacionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TpoOper(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$TpoOper.
                 */
                public static class TpoOperImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TpoOperImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TpoOperImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML RznSoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$RznSoc.
                 */
                public static class RznSocImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RznSocImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected RznSocImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML FolioDocRef(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$FolioDocRef.
                 */
                public static class FolioDocRefImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FolioDocRefImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FolioDocRefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
    }
}
