/*
 * An XML document type.
 * Localname: LibroCompraVenta
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.libroCV.LibroCompraVentaDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.libroCV.impl;
/**
 * A document containing one LibroCompraVenta(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class LibroCompraVentaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument
{
    private static final long serialVersionUID = 1L;
    
    public LibroCompraVentaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.LibroCompraVentaDocumentExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName LIBROCOMPRAVENTA$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "LibroCompraVenta");
    
    
    /**
     * Gets the "LibroCompraVenta" element
     */
    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta getLibroCompraVenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta target = null;
            target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta)get_store().find_element_user(LIBROCOMPRAVENTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LibroCompraVenta" element
     */
    public void setLibroCompraVenta(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta libroCompraVenta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta target = null;
            target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta)get_store().find_element_user(LIBROCOMPRAVENTA$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta)get_store().add_element_user(LIBROCOMPRAVENTA$0);
            }
            target.set(libroCompraVenta);
        }
    }
    
    /**
     * Appends and returns a new empty "LibroCompraVenta" element
     */
    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta addNewLibroCompraVenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta target = null;
            target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta)get_store().add_element_user(LIBROCOMPRAVENTA$0);
            return target;
        }
    }
    /**
     * An XML LibroCompraVenta(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class LibroCompraVentaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta
    {
        private static final long serialVersionUID = 1L;
        
        public LibroCompraVentaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIOLIBRO$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EnvioLibro");
        private static final javax.xml.namespace.QName SIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "EnvioLibro" element
         */
        public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro getEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro)get_store().find_element_user(ENVIOLIBRO$0, 0);
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
        public void setEnvioLibro(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro envioLibro)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro)get_store().find_element_user(ENVIOLIBRO$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro)get_store().add_element_user(ENVIOLIBRO$0);
                }
                target.set(envioLibro);
            }
        }
        
        /**
         * Appends and returns a new empty "EnvioLibro" element
         */
        public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro addNewEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro)get_store().add_element_user(ENVIOLIBRO$0);
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
         * An XML EnvioLibro(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class EnvioLibroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro
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
            private static final javax.xml.namespace.QName LCECAL$8 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "LceCal");
            private static final javax.xml.namespace.QName LCECOCERTIF$10 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "LceCoCertif");
            private static final javax.xml.namespace.QName TMSTFIRMA$12 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TmstFirma");
            private static final javax.xml.namespace.QName ID$14 = 
                new javax.xml.namespace.QName("", "ID");
            
            
            /**
             * Gets the "Caratula" element
             */
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula getCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula)get_store().find_element_user(CARATULA$0, 0);
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
            public void setCaratula(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula caratula)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula)get_store().add_element_user(CARATULA$0);
                    }
                    target.set(caratula);
                }
            }
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula addNewCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula)get_store().add_element_user(CARATULA$0);
                    return target;
                }
            }
            
            /**
             * Gets the "ResumenSegmento" element
             */
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento getResumenSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento)get_store().find_element_user(RESUMENSEGMENTO$2, 0);
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
            public void setResumenSegmento(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento resumenSegmento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento)get_store().find_element_user(RESUMENSEGMENTO$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento)get_store().add_element_user(RESUMENSEGMENTO$2);
                    }
                    target.set(resumenSegmento);
                }
            }
            
            /**
             * Appends and returns a new empty "ResumenSegmento" element
             */
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento addNewResumenSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento)get_store().add_element_user(RESUMENSEGMENTO$2);
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
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo getResumenPeriodo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo)get_store().find_element_user(RESUMENPERIODO$4, 0);
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
            public void setResumenPeriodo(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo resumenPeriodo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo)get_store().find_element_user(RESUMENPERIODO$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo)get_store().add_element_user(RESUMENPERIODO$4);
                    }
                    target.set(resumenPeriodo);
                }
            }
            
            /**
             * Appends and returns a new empty "ResumenPeriodo" element
             */
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo addNewResumenPeriodo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo)get_store().add_element_user(RESUMENPERIODO$4);
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
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle[] getDetalleArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DETALLE$6, targetList);
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Detalle" element
             */
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle getDetalleArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle)get_store().find_element_user(DETALLE$6, i);
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
            public void setDetalleArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle[] detalleArray)
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
            public void setDetalleArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle detalle)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle)get_store().find_element_user(DETALLE$6, i);
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
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle insertNewDetalle(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle)get_store().insert_element_user(DETALLE$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Detalle" element
             */
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle addNewDetalle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle)get_store().add_element_user(DETALLE$6);
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
             * Gets the "LceCal" element
             */
            public cl.sii.siiLce.LceCalDocument.LceCal getLceCal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().find_element_user(LCECAL$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "LceCal" element
             */
            public boolean isSetLceCal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LCECAL$8) != 0;
                }
            }
            
            /**
             * Sets the "LceCal" element
             */
            public void setLceCal(cl.sii.siiLce.LceCalDocument.LceCal lceCal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().find_element_user(LCECAL$8, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().add_element_user(LCECAL$8);
                    }
                    target.set(lceCal);
                }
            }
            
            /**
             * Appends and returns a new empty "LceCal" element
             */
            public cl.sii.siiLce.LceCalDocument.LceCal addNewLceCal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().add_element_user(LCECAL$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "LceCal" element
             */
            public void unsetLceCal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LCECAL$8, 0);
                }
            }
            
            /**
             * Gets the "LceCoCertif" element
             */
            public cl.sii.siiLce.LceCoCertifDocument.LceCoCertif getLceCoCertif()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCoCertifDocument.LceCoCertif target = null;
                    target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif)get_store().find_element_user(LCECOCERTIF$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "LceCoCertif" element
             */
            public boolean isSetLceCoCertif()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LCECOCERTIF$10) != 0;
                }
            }
            
            /**
             * Sets the "LceCoCertif" element
             */
            public void setLceCoCertif(cl.sii.siiLce.LceCoCertifDocument.LceCoCertif lceCoCertif)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCoCertifDocument.LceCoCertif target = null;
                    target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif)get_store().find_element_user(LCECOCERTIF$10, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif)get_store().add_element_user(LCECOCERTIF$10);
                    }
                    target.set(lceCoCertif);
                }
            }
            
            /**
             * Appends and returns a new empty "LceCoCertif" element
             */
            public cl.sii.siiLce.LceCoCertifDocument.LceCoCertif addNewLceCoCertif()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCoCertifDocument.LceCoCertif target = null;
                    target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif)get_store().add_element_user(LCECOCERTIF$10);
                    return target;
                }
            }
            
            /**
             * Unsets the "LceCoCertif" element
             */
            public void unsetLceCoCertif()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LCECOCERTIF$10, 0);
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
            public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma xgetTmstFirma()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma)get_store().find_element_user(TMSTFIRMA$12, 0);
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
            public void xsetTmstFirma(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma tmstFirma)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma target = null;
                    target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma)get_store().find_element_user(TMSTFIRMA$12, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma)get_store().add_element_user(TMSTFIRMA$12);
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
             * An XML Caratula(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class CaratulaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula
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
                private static final javax.xml.namespace.QName TIPOOPERACION$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoOperacion");
                private static final javax.xml.namespace.QName TIPOLIBRO$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoLibro");
                private static final javax.xml.namespace.QName TIPOENVIO$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoEnvio");
                private static final javax.xml.namespace.QName NROSEGMENTO$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroSegmento");
                private static final javax.xml.namespace.QName FOLIONOTIFICACION$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FolioNotificacion");
                private static final javax.xml.namespace.QName CODAUTREC$20 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodAutRec");
                
                
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
                public cl.sii.siiDte.libroCV.RUTType xgetRutEmisorLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.RUTType target = null;
                      target = (cl.sii.siiDte.libroCV.RUTType)get_store().find_element_user(RUTEMISORLIBRO$0, 0);
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
                public void xsetRutEmisorLibro(cl.sii.siiDte.libroCV.RUTType rutEmisorLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.RUTType target = null;
                      target = (cl.sii.siiDte.libroCV.RUTType)get_store().find_element_user(RUTEMISORLIBRO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.RUTType)get_store().add_element_user(RUTEMISORLIBRO$0);
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
                public cl.sii.siiDte.libroCV.RUTType xgetRutEnvia()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.RUTType target = null;
                      target = (cl.sii.siiDte.libroCV.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
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
                public void xsetRutEnvia(cl.sii.siiDte.libroCV.RUTType rutEnvia)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.RUTType target = null;
                      target = (cl.sii.siiDte.libroCV.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.RUTType)get_store().add_element_user(RUTENVIA$2);
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
                public int getNroResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NroResol" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol xgetNroResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol)get_store().find_element_user(NRORESOL$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "NroResol" element
                 */
                public void setNroResol(int nroResol)
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
                      target.setIntValue(nroResol);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                public void xsetNroResol(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol nroResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol)get_store().add_element_user(NRORESOL$8);
                      }
                      target.set(nroResol);
                    }
                }
                
                /**
                 * Gets the "TipoOperacion" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion.Enum getTipoOperacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOOPERACION$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoOperacion" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion xgetTipoOperacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion)get_store().find_element_user(TIPOOPERACION$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TipoOperacion" element
                 */
                public void setTipoOperacion(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion.Enum tipoOperacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOOPERACION$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOOPERACION$10);
                      }
                      target.setEnumValue(tipoOperacion);
                    }
                }
                
                /**
                 * Sets (as xml) the "TipoOperacion" element
                 */
                public void xsetTipoOperacion(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion tipoOperacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion)get_store().find_element_user(TIPOOPERACION$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion)get_store().add_element_user(TIPOOPERACION$10);
                      }
                      target.set(tipoOperacion);
                    }
                }
                
                /**
                 * Gets the "TipoLibro" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro.Enum getTipoLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOLIBRO$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoLibro" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro xgetTipoLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro)get_store().find_element_user(TIPOLIBRO$12, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TipoLibro" element
                 */
                public void setTipoLibro(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro.Enum tipoLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOLIBRO$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOLIBRO$12);
                      }
                      target.setEnumValue(tipoLibro);
                    }
                }
                
                /**
                 * Sets (as xml) the "TipoLibro" element
                 */
                public void xsetTipoLibro(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro tipoLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro)get_store().find_element_user(TIPOLIBRO$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro)get_store().add_element_user(TIPOLIBRO$12);
                      }
                      target.set(tipoLibro);
                    }
                }
                
                /**
                 * Gets the "TipoEnvio" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio.Enum getTipoEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOENVIO$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoEnvio" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio xgetTipoEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio)get_store().find_element_user(TIPOENVIO$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TipoEnvio" element
                 */
                public void setTipoEnvio(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio.Enum tipoEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOENVIO$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOENVIO$14);
                      }
                      target.setEnumValue(tipoEnvio);
                    }
                }
                
                /**
                 * Sets (as xml) the "TipoEnvio" element
                 */
                public void xsetTipoEnvio(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio tipoEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio)get_store().find_element_user(TIPOENVIO$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio)get_store().add_element_user(TIPOENVIO$14);
                      }
                      target.set(tipoEnvio);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROSEGMENTO$16, 0);
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
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento xgetNroSegmento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento)get_store().find_element_user(NROSEGMENTO$16, 0);
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
                      return get_store().count_elements(NROSEGMENTO$16) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROSEGMENTO$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROSEGMENTO$16);
                      }
                      target.setIntValue(nroSegmento);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroSegmento" element
                 */
                public void xsetNroSegmento(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento nroSegmento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento)get_store().find_element_user(NROSEGMENTO$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento)get_store().add_element_user(NROSEGMENTO$16);
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
                      get_store().remove_element(NROSEGMENTO$16, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIONOTIFICACION$18, 0);
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
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion xgetFolioNotificacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion)get_store().find_element_user(FOLIONOTIFICACION$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "FolioNotificacion" element
                 */
                public boolean isSetFolioNotificacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FOLIONOTIFICACION$18) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIONOTIFICACION$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIONOTIFICACION$18);
                      }
                      target.setLongValue(folioNotificacion);
                    }
                }
                
                /**
                 * Sets (as xml) the "FolioNotificacion" element
                 */
                public void xsetFolioNotificacion(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion folioNotificacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion)get_store().find_element_user(FOLIONOTIFICACION$18, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion)get_store().add_element_user(FOLIONOTIFICACION$18);
                      }
                      target.set(folioNotificacion);
                    }
                }
                
                /**
                 * Unsets the "FolioNotificacion" element
                 */
                public void unsetFolioNotificacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FOLIONOTIFICACION$18, 0);
                    }
                }
                
                /**
                 * Gets the "CodAutRec" element
                 */
                public java.lang.String getCodAutRec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODAUTREC$20, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CodAutRec" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec xgetCodAutRec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec)get_store().find_element_user(CODAUTREC$20, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CodAutRec" element
                 */
                public boolean isSetCodAutRec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CODAUTREC$20) != 0;
                    }
                }
                
                /**
                 * Sets the "CodAutRec" element
                 */
                public void setCodAutRec(java.lang.String codAutRec)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODAUTREC$20, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODAUTREC$20);
                      }
                      target.setStringValue(codAutRec);
                    }
                }
                
                /**
                 * Sets (as xml) the "CodAutRec" element
                 */
                public void xsetCodAutRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec codAutRec)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec)get_store().find_element_user(CODAUTREC$20, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec)get_store().add_element_user(CODAUTREC$20);
                      }
                      target.set(codAutRec);
                    }
                }
                
                /**
                 * Unsets the "CodAutRec" element
                 */
                public void unsetCodAutRec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CODAUTREC$20, 0);
                    }
                }
                /**
                 * An XML NroResol(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$NroResol.
                 */
                public static class NroResolImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NroResolImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NroResolImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TipoOperacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoOperacion.
                 */
                public static class TipoOperacionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TipoOperacionImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TipoOperacionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML TipoLibro(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoLibro.
                 */
                public static class TipoLibroImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoEnvio.
                 */
                public static class TipoEnvioImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$NroSegmento.
                 */
                public static class NroSegmentoImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$FolioNotificacion.
                 */
                public static class FolioNotificacionImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion
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
                /**
                 * An XML CodAutRec(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$CodAutRec.
                 */
                public static class CodAutRecImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CodAutRecImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CodAutRecImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
            public static class ResumenSegmentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento
            {
                private static final long serialVersionUID = 1L;
                
                public ResumenSegmentoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TOTALESSEGMENTO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotalesSegmento");
                
                
                /**
                 * Gets array of all "TotalesSegmento" elements
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento[] getTotalesSegmentoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TOTALESSEGMENTO$0, targetList);
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "TotalesSegmento" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento getTotalesSegmentoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento)get_store().find_element_user(TOTALESSEGMENTO$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "TotalesSegmento" element
                 */
                public int sizeOfTotalesSegmentoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTALESSEGMENTO$0);
                    }
                }
                
                /**
                 * Sets array of all "TotalesSegmento" element
                 */
                public void setTotalesSegmentoArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento[] totalesSegmentoArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(totalesSegmentoArray, TOTALESSEGMENTO$0);
                    }
                }
                
                /**
                 * Sets ith "TotalesSegmento" element
                 */
                public void setTotalesSegmentoArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento totalesSegmento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento)get_store().find_element_user(TOTALESSEGMENTO$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(totalesSegmento);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotalesSegmento" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento insertNewTotalesSegmento(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento)get_store().insert_element_user(TOTALESSEGMENTO$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotalesSegmento" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento addNewTotalesSegmento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento)get_store().add_element_user(TOTALESSEGMENTO$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "TotalesSegmento" element
                 */
                public void removeTotalesSegmento(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTALESSEGMENTO$0, i);
                    }
                }
                /**
                 * An XML TotalesSegmento(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class TotalesSegmentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotalesSegmentoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TPODOC$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDoc");
                    private static final javax.xml.namespace.QName TPOIMP$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoImp");
                    private static final javax.xml.namespace.QName TOTDOC$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotDoc");
                    private static final javax.xml.namespace.QName TOTANULADO$6 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotAnulado");
                    private static final javax.xml.namespace.QName TOTOPEXE$8 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpExe");
                    private static final javax.xml.namespace.QName TOTMNTEXE$10 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntExe");
                    private static final javax.xml.namespace.QName TOTMNTNETO$12 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntNeto");
                    private static final javax.xml.namespace.QName TOTOPIVAREC$14 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVARec");
                    private static final javax.xml.namespace.QName TOTMNTIVA$16 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntIVA");
                    private static final javax.xml.namespace.QName TOTOPACTIVOFIJO$18 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpActivoFijo");
                    private static final javax.xml.namespace.QName TOTMNTACTIVOFIJO$20 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntActivoFijo");
                    private static final javax.xml.namespace.QName TOTMNTIVAACTIVOFIJO$22 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntIVAActivoFijo");
                    private static final javax.xml.namespace.QName TOTIVANOREC$24 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVANoRec");
                    private static final javax.xml.namespace.QName TOTOPIVAUSOCOMUN$26 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVAUsoComun");
                    private static final javax.xml.namespace.QName TOTIVAUSOCOMUN$28 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVAUsoComun");
                    private static final javax.xml.namespace.QName TOTIVAFUERAPLAZO$30 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVAFueraPlazo");
                    private static final javax.xml.namespace.QName TOTIVAPROPIO$32 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVAPropio");
                    private static final javax.xml.namespace.QName TOTIVATERCEROS$34 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVATerceros");
                    private static final javax.xml.namespace.QName TOTLEY18211$36 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotLey18211");
                    private static final javax.xml.namespace.QName TOTOTROSIMP$38 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOtrosImp");
                    private static final javax.xml.namespace.QName TOTIMPSINCREDITO$40 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotImpSinCredito");
                    private static final javax.xml.namespace.QName TOTOPIVARETTOTAL$42 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVARetTotal");
                    private static final javax.xml.namespace.QName TOTIVARETTOTAL$44 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVARetTotal");
                    private static final javax.xml.namespace.QName TOTOPIVARETPARCIAL$46 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVARetParcial");
                    private static final javax.xml.namespace.QName TOTIVARETPARCIAL$48 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVARetParcial");
                    private static final javax.xml.namespace.QName TOTCREDEC$50 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotCredEC");
                    private static final javax.xml.namespace.QName TOTDEPENVASE$52 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotDepEnvase");
                    private static final javax.xml.namespace.QName TOTLIQUIDACIONES$54 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotLiquidaciones");
                    private static final javax.xml.namespace.QName TOTMNTTOTAL$56 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntTotal");
                    private static final javax.xml.namespace.QName TOTOPIVANORETENIDO$58 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVANoRetenido");
                    private static final javax.xml.namespace.QName TOTIVANORETENIDO$60 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVANoRetenido");
                    private static final javax.xml.namespace.QName TOTMNTNOFACT$62 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntNoFact");
                    private static final javax.xml.namespace.QName TOTMNTPERIODO$64 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntPeriodo");
                    private static final javax.xml.namespace.QName TOTPSJNAC$66 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotPsjNac");
                    private static final javax.xml.namespace.QName TOTPSJINT$68 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotPsjInt");
                    private static final javax.xml.namespace.QName TOTTABPUROS$70 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotTabPuros");
                    private static final javax.xml.namespace.QName TOTTABCIGARRILLOS$72 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotTabCigarrillos");
                    private static final javax.xml.namespace.QName TOTTABELABORADO$74 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotTabElaborado");
                    
                    
                    /**
                     * Gets the "TpoDoc" element
                     */
                    public java.math.BigInteger getTpoDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOC$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TpoDoc" element
                     */
                    public cl.sii.siiDte.libroCV.DoctoType xgetTpoDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.DoctoType target = null;
                        target = (cl.sii.siiDte.libroCV.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TpoDoc" element
                     */
                    public void setTpoDoc(java.math.BigInteger tpoDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOC$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPODOC$0);
                        }
                        target.setBigIntegerValue(tpoDoc);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TpoDoc" element
                     */
                    public void xsetTpoDoc(cl.sii.siiDte.libroCV.DoctoType tpoDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.DoctoType target = null;
                        target = (cl.sii.siiDte.libroCV.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.DoctoType)get_store().add_element_user(TPODOC$0);
                        }
                        target.set(tpoDoc);
                      }
                    }
                    
                    /**
                     * Gets the "TpoImp" element
                     */
                    public int getTpoImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOIMP$2, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TpoImp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp xgetTpoImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp)get_store().find_element_user(TPOIMP$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TpoImp" element
                     */
                    public boolean isSetTpoImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TPOIMP$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TpoImp" element
                     */
                    public void setTpoImp(int tpoImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOIMP$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOIMP$2);
                        }
                        target.setIntValue(tpoImp);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TpoImp" element
                     */
                    public void xsetTpoImp(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp tpoImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp)get_store().find_element_user(TPOIMP$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp)get_store().add_element_user(TPOIMP$2);
                        }
                        target.set(tpoImp);
                      }
                    }
                    
                    /**
                     * Unsets the "TpoImp" element
                     */
                    public void unsetTpoImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TPOIMP$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotDoc" element
                     */
                    public long getTotDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDOC$4, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotDoc" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc xgetTotDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc)get_store().find_element_user(TOTDOC$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotDoc" element
                     */
                    public void setTotDoc(long totDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDOC$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTDOC$4);
                        }
                        target.setLongValue(totDoc);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotDoc" element
                     */
                    public void xsetTotDoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc totDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc)get_store().find_element_user(TOTDOC$4, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc)get_store().add_element_user(TOTDOC$4);
                        }
                        target.set(totDoc);
                      }
                    }
                    
                    /**
                     * Gets the "TotAnulado" element
                     */
                    public long getTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTANULADO$6, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotAnulado" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado xgetTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado)get_store().find_element_user(TOTANULADO$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotAnulado" element
                     */
                    public boolean isSetTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTANULADO$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotAnulado" element
                     */
                    public void setTotAnulado(long totAnulado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTANULADO$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTANULADO$6);
                        }
                        target.setLongValue(totAnulado);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotAnulado" element
                     */
                    public void xsetTotAnulado(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado totAnulado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado)get_store().find_element_user(TOTANULADO$6, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado)get_store().add_element_user(TOTANULADO$6);
                        }
                        target.set(totAnulado);
                      }
                    }
                    
                    /**
                     * Unsets the "TotAnulado" element
                     */
                    public void unsetTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTANULADO$6, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpExe" element
                     */
                    public long getTotOpExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPEXE$8, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpExe" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe xgetTotOpExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe)get_store().find_element_user(TOTOPEXE$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpExe" element
                     */
                    public boolean isSetTotOpExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPEXE$8) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpExe" element
                     */
                    public void setTotOpExe(long totOpExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPEXE$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPEXE$8);
                        }
                        target.setLongValue(totOpExe);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpExe" element
                     */
                    public void xsetTotOpExe(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe totOpExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe)get_store().find_element_user(TOTOPEXE$8, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe)get_store().add_element_user(TOTOPEXE$8);
                        }
                        target.set(totOpExe);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpExe" element
                     */
                    public void unsetTotOpExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPEXE$8, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntExe" element
                     */
                    public long getTotMntExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTEXE$10, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntExe" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTEXE$10, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntExe" element
                     */
                    public void setTotMntExe(long totMntExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTEXE$10, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTEXE$10);
                        }
                        target.setLongValue(totMntExe);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntExe" element
                     */
                    public void xsetTotMntExe(cl.sii.siiDte.libroCV.ValorType totMntExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTEXE$10, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTEXE$10);
                        }
                        target.set(totMntExe);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntNeto" element
                     */
                    public long getTotMntNeto()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNETO$12, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntNeto" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntNeto()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTNETO$12, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntNeto" element
                     */
                    public void setTotMntNeto(long totMntNeto)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNETO$12, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTNETO$12);
                        }
                        target.setLongValue(totMntNeto);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntNeto" element
                     */
                    public void xsetTotMntNeto(cl.sii.siiDte.libroCV.ValorType totMntNeto)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTNETO$12, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTNETO$12);
                        }
                        target.set(totMntNeto);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVARec" element
                     */
                    public long getTotOpIVARec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVAREC$14, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVARec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec xgetTotOpIVARec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec)get_store().find_element_user(TOTOPIVAREC$14, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVARec" element
                     */
                    public boolean isSetTotOpIVARec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVAREC$14) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVARec" element
                     */
                    public void setTotOpIVARec(long totOpIVARec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVAREC$14, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVAREC$14);
                        }
                        target.setLongValue(totOpIVARec);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVARec" element
                     */
                    public void xsetTotOpIVARec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec totOpIVARec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec)get_store().find_element_user(TOTOPIVAREC$14, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec)get_store().add_element_user(TOTOPIVAREC$14);
                        }
                        target.set(totOpIVARec);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVARec" element
                     */
                    public void unsetTotOpIVARec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVAREC$14, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntIVA" element
                     */
                    public long getTotMntIVA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVA$16, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntIVA" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntIVA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIVA$16, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntIVA" element
                     */
                    public void setTotMntIVA(long totMntIVA)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVA$16, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIVA$16);
                        }
                        target.setLongValue(totMntIVA);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntIVA" element
                     */
                    public void xsetTotMntIVA(cl.sii.siiDte.libroCV.ValorType totMntIVA)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIVA$16, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTIVA$16);
                        }
                        target.set(totMntIVA);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpActivoFijo" element
                     */
                    public long getTotOpActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPACTIVOFIJO$18, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpActivoFijo" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo xgetTotOpActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo)get_store().find_element_user(TOTOPACTIVOFIJO$18, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpActivoFijo" element
                     */
                    public boolean isSetTotOpActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPACTIVOFIJO$18) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpActivoFijo" element
                     */
                    public void setTotOpActivoFijo(long totOpActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPACTIVOFIJO$18, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPACTIVOFIJO$18);
                        }
                        target.setLongValue(totOpActivoFijo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpActivoFijo" element
                     */
                    public void xsetTotOpActivoFijo(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo totOpActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo)get_store().find_element_user(TOTOPACTIVOFIJO$18, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo)get_store().add_element_user(TOTOPACTIVOFIJO$18);
                        }
                        target.set(totOpActivoFijo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpActivoFijo" element
                     */
                    public void unsetTotOpActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPACTIVOFIJO$18, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntActivoFijo" element
                     */
                    public long getTotMntActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTACTIVOFIJO$20, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntActivoFijo" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTACTIVOFIJO$20, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotMntActivoFijo" element
                     */
                    public boolean isSetTotMntActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTMNTACTIVOFIJO$20) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntActivoFijo" element
                     */
                    public void setTotMntActivoFijo(long totMntActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTACTIVOFIJO$20, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTACTIVOFIJO$20);
                        }
                        target.setLongValue(totMntActivoFijo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntActivoFijo" element
                     */
                    public void xsetTotMntActivoFijo(cl.sii.siiDte.libroCV.ValorType totMntActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTACTIVOFIJO$20, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTACTIVOFIJO$20);
                        }
                        target.set(totMntActivoFijo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotMntActivoFijo" element
                     */
                    public void unsetTotMntActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTMNTACTIVOFIJO$20, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntIVAActivoFijo" element
                     */
                    public long getTotMntIVAActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVAACTIVOFIJO$22, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntIVAActivoFijo" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntIVAActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIVAACTIVOFIJO$22, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotMntIVAActivoFijo" element
                     */
                    public boolean isSetTotMntIVAActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTMNTIVAACTIVOFIJO$22) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntIVAActivoFijo" element
                     */
                    public void setTotMntIVAActivoFijo(long totMntIVAActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVAACTIVOFIJO$22, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIVAACTIVOFIJO$22);
                        }
                        target.setLongValue(totMntIVAActivoFijo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntIVAActivoFijo" element
                     */
                    public void xsetTotMntIVAActivoFijo(cl.sii.siiDte.libroCV.ValorType totMntIVAActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIVAACTIVOFIJO$22, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTIVAACTIVOFIJO$22);
                        }
                        target.set(totMntIVAActivoFijo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotMntIVAActivoFijo" element
                     */
                    public void unsetTotMntIVAActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTMNTIVAACTIVOFIJO$22, 0);
                      }
                    }
                    
                    /**
                     * Gets array of all "TotIVANoRec" elements
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec[] getTotIVANoRecArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(TOTIVANOREC$24, targetList);
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "TotIVANoRec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec getTotIVANoRecArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec)get_store().find_element_user(TOTIVANOREC$24, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "TotIVANoRec" element
                     */
                    public int sizeOfTotIVANoRecArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVANOREC$24);
                      }
                    }
                    
                    /**
                     * Sets array of all "TotIVANoRec" element
                     */
                    public void setTotIVANoRecArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec[] totIVANoRecArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(totIVANoRecArray, TOTIVANOREC$24);
                      }
                    }
                    
                    /**
                     * Sets ith "TotIVANoRec" element
                     */
                    public void setTotIVANoRecArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec totIVANoRec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec)get_store().find_element_user(TOTIVANOREC$24, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(totIVANoRec);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotIVANoRec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec insertNewTotIVANoRec(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec)get_store().insert_element_user(TOTIVANOREC$24, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotIVANoRec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec addNewTotIVANoRec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec)get_store().add_element_user(TOTIVANOREC$24);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "TotIVANoRec" element
                     */
                    public void removeTotIVANoRec(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVANOREC$24, i);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVAUsoComun" element
                     */
                    public long getTotOpIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVAUSOCOMUN$26, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVAUsoComun" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun xgetTotOpIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun)get_store().find_element_user(TOTOPIVAUSOCOMUN$26, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVAUsoComun" element
                     */
                    public boolean isSetTotOpIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVAUSOCOMUN$26) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVAUsoComun" element
                     */
                    public void setTotOpIVAUsoComun(long totOpIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVAUSOCOMUN$26, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVAUSOCOMUN$26);
                        }
                        target.setLongValue(totOpIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVAUsoComun" element
                     */
                    public void xsetTotOpIVAUsoComun(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun totOpIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun)get_store().find_element_user(TOTOPIVAUSOCOMUN$26, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun)get_store().add_element_user(TOTOPIVAUSOCOMUN$26);
                        }
                        target.set(totOpIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVAUsoComun" element
                     */
                    public void unsetTotOpIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVAUSOCOMUN$26, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVAUsoComun" element
                     */
                    public long getTotIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAUSOCOMUN$28, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVAUsoComun" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVAUSOCOMUN$28, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVAUsoComun" element
                     */
                    public boolean isSetTotIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVAUSOCOMUN$28) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVAUsoComun" element
                     */
                    public void setTotIVAUsoComun(long totIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAUSOCOMUN$28, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVAUSOCOMUN$28);
                        }
                        target.setLongValue(totIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVAUsoComun" element
                     */
                    public void xsetTotIVAUsoComun(cl.sii.siiDte.libroCV.ValorType totIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVAUSOCOMUN$28, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVAUSOCOMUN$28);
                        }
                        target.set(totIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVAUsoComun" element
                     */
                    public void unsetTotIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVAUSOCOMUN$28, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVAFueraPlazo" element
                     */
                    public long getTotIVAFueraPlazo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAFUERAPLAZO$30, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVAFueraPlazo" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVAFueraPlazo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVAFUERAPLAZO$30, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVAFueraPlazo" element
                     */
                    public boolean isSetTotIVAFueraPlazo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVAFUERAPLAZO$30) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVAFueraPlazo" element
                     */
                    public void setTotIVAFueraPlazo(long totIVAFueraPlazo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAFUERAPLAZO$30, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVAFUERAPLAZO$30);
                        }
                        target.setLongValue(totIVAFueraPlazo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVAFueraPlazo" element
                     */
                    public void xsetTotIVAFueraPlazo(cl.sii.siiDte.libroCV.ValorType totIVAFueraPlazo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVAFUERAPLAZO$30, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVAFUERAPLAZO$30);
                        }
                        target.set(totIVAFueraPlazo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVAFueraPlazo" element
                     */
                    public void unsetTotIVAFueraPlazo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVAFUERAPLAZO$30, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVAPropio" element
                     */
                    public long getTotIVAPropio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAPROPIO$32, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVAPropio" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVAPropio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVAPROPIO$32, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVAPropio" element
                     */
                    public boolean isSetTotIVAPropio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVAPROPIO$32) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVAPropio" element
                     */
                    public void setTotIVAPropio(long totIVAPropio)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAPROPIO$32, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVAPROPIO$32);
                        }
                        target.setLongValue(totIVAPropio);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVAPropio" element
                     */
                    public void xsetTotIVAPropio(cl.sii.siiDte.libroCV.ValorType totIVAPropio)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVAPROPIO$32, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVAPROPIO$32);
                        }
                        target.set(totIVAPropio);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVAPropio" element
                     */
                    public void unsetTotIVAPropio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVAPROPIO$32, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVATerceros" element
                     */
                    public long getTotIVATerceros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVATERCEROS$34, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVATerceros" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVATerceros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVATERCEROS$34, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVATerceros" element
                     */
                    public boolean isSetTotIVATerceros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVATERCEROS$34) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVATerceros" element
                     */
                    public void setTotIVATerceros(long totIVATerceros)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVATERCEROS$34, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVATERCEROS$34);
                        }
                        target.setLongValue(totIVATerceros);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVATerceros" element
                     */
                    public void xsetTotIVATerceros(cl.sii.siiDte.libroCV.ValorType totIVATerceros)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVATERCEROS$34, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVATERCEROS$34);
                        }
                        target.set(totIVATerceros);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVATerceros" element
                     */
                    public void unsetTotIVATerceros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVATERCEROS$34, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotLey18211" element
                     */
                    public long getTotLey18211()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTLEY18211$36, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotLey18211" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotLey18211()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTLEY18211$36, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotLey18211" element
                     */
                    public boolean isSetTotLey18211()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTLEY18211$36) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotLey18211" element
                     */
                    public void setTotLey18211(long totLey18211)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTLEY18211$36, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTLEY18211$36);
                        }
                        target.setLongValue(totLey18211);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotLey18211" element
                     */
                    public void xsetTotLey18211(cl.sii.siiDte.libroCV.ValorType totLey18211)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTLEY18211$36, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTLEY18211$36);
                        }
                        target.set(totLey18211);
                      }
                    }
                    
                    /**
                     * Unsets the "TotLey18211" element
                     */
                    public void unsetTotLey18211()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTLEY18211$36, 0);
                      }
                    }
                    
                    /**
                     * Gets array of all "TotOtrosImp" elements
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp[] getTotOtrosImpArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(TOTOTROSIMP$38, targetList);
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "TotOtrosImp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp getTotOtrosImpArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp)get_store().find_element_user(TOTOTROSIMP$38, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "TotOtrosImp" element
                     */
                    public int sizeOfTotOtrosImpArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOTROSIMP$38);
                      }
                    }
                    
                    /**
                     * Sets array of all "TotOtrosImp" element
                     */
                    public void setTotOtrosImpArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp[] totOtrosImpArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(totOtrosImpArray, TOTOTROSIMP$38);
                      }
                    }
                    
                    /**
                     * Sets ith "TotOtrosImp" element
                     */
                    public void setTotOtrosImpArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp totOtrosImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp)get_store().find_element_user(TOTOTROSIMP$38, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(totOtrosImp);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotOtrosImp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp insertNewTotOtrosImp(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp)get_store().insert_element_user(TOTOTROSIMP$38, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotOtrosImp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp addNewTotOtrosImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp)get_store().add_element_user(TOTOTROSIMP$38);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "TotOtrosImp" element
                     */
                    public void removeTotOtrosImp(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOTROSIMP$38, i);
                      }
                    }
                    
                    /**
                     * Gets the "TotImpSinCredito" element
                     */
                    public long getTotImpSinCredito()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIMPSINCREDITO$40, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotImpSinCredito" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotImpSinCredito()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIMPSINCREDITO$40, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotImpSinCredito" element
                     */
                    public boolean isSetTotImpSinCredito()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIMPSINCREDITO$40) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotImpSinCredito" element
                     */
                    public void setTotImpSinCredito(long totImpSinCredito)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIMPSINCREDITO$40, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIMPSINCREDITO$40);
                        }
                        target.setLongValue(totImpSinCredito);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotImpSinCredito" element
                     */
                    public void xsetTotImpSinCredito(cl.sii.siiDte.libroCV.ValorType totImpSinCredito)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIMPSINCREDITO$40, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIMPSINCREDITO$40);
                        }
                        target.set(totImpSinCredito);
                      }
                    }
                    
                    /**
                     * Unsets the "TotImpSinCredito" element
                     */
                    public void unsetTotImpSinCredito()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIMPSINCREDITO$40, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVARetTotal" element
                     */
                    public long getTotOpIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVARETTOTAL$42, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVARetTotal" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal xgetTotOpIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal)get_store().find_element_user(TOTOPIVARETTOTAL$42, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVARetTotal" element
                     */
                    public boolean isSetTotOpIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVARETTOTAL$42) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVARetTotal" element
                     */
                    public void setTotOpIVARetTotal(long totOpIVARetTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVARETTOTAL$42, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVARETTOTAL$42);
                        }
                        target.setLongValue(totOpIVARetTotal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVARetTotal" element
                     */
                    public void xsetTotOpIVARetTotal(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal totOpIVARetTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal)get_store().find_element_user(TOTOPIVARETTOTAL$42, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal)get_store().add_element_user(TOTOPIVARETTOTAL$42);
                        }
                        target.set(totOpIVARetTotal);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVARetTotal" element
                     */
                    public void unsetTotOpIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVARETTOTAL$42, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVARetTotal" element
                     */
                    public long getTotIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVARETTOTAL$44, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVARetTotal" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVARETTOTAL$44, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVARetTotal" element
                     */
                    public boolean isSetTotIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVARETTOTAL$44) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVARetTotal" element
                     */
                    public void setTotIVARetTotal(long totIVARetTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVARETTOTAL$44, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVARETTOTAL$44);
                        }
                        target.setLongValue(totIVARetTotal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVARetTotal" element
                     */
                    public void xsetTotIVARetTotal(cl.sii.siiDte.libroCV.ValorType totIVARetTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVARETTOTAL$44, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVARETTOTAL$44);
                        }
                        target.set(totIVARetTotal);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVARetTotal" element
                     */
                    public void unsetTotIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVARETTOTAL$44, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVARetParcial" element
                     */
                    public long getTotOpIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVARETPARCIAL$46, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVARetParcial" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial xgetTotOpIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial)get_store().find_element_user(TOTOPIVARETPARCIAL$46, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVARetParcial" element
                     */
                    public boolean isSetTotOpIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVARETPARCIAL$46) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVARetParcial" element
                     */
                    public void setTotOpIVARetParcial(long totOpIVARetParcial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVARETPARCIAL$46, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVARETPARCIAL$46);
                        }
                        target.setLongValue(totOpIVARetParcial);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVARetParcial" element
                     */
                    public void xsetTotOpIVARetParcial(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial totOpIVARetParcial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial)get_store().find_element_user(TOTOPIVARETPARCIAL$46, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial)get_store().add_element_user(TOTOPIVARETPARCIAL$46);
                        }
                        target.set(totOpIVARetParcial);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVARetParcial" element
                     */
                    public void unsetTotOpIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVARETPARCIAL$46, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVARetParcial" element
                     */
                    public long getTotIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVARETPARCIAL$48, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVARetParcial" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVARETPARCIAL$48, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVARetParcial" element
                     */
                    public boolean isSetTotIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVARETPARCIAL$48) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVARetParcial" element
                     */
                    public void setTotIVARetParcial(long totIVARetParcial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVARETPARCIAL$48, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVARETPARCIAL$48);
                        }
                        target.setLongValue(totIVARetParcial);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVARetParcial" element
                     */
                    public void xsetTotIVARetParcial(cl.sii.siiDte.libroCV.ValorType totIVARetParcial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVARETPARCIAL$48, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVARETPARCIAL$48);
                        }
                        target.set(totIVARetParcial);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVARetParcial" element
                     */
                    public void unsetTotIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVARETPARCIAL$48, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotCredEC" element
                     */
                    public long getTotCredEC()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTCREDEC$50, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotCredEC" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotCredEC()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTCREDEC$50, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotCredEC" element
                     */
                    public boolean isSetTotCredEC()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTCREDEC$50) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotCredEC" element
                     */
                    public void setTotCredEC(long totCredEC)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTCREDEC$50, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTCREDEC$50);
                        }
                        target.setLongValue(totCredEC);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotCredEC" element
                     */
                    public void xsetTotCredEC(cl.sii.siiDte.libroCV.ValorType totCredEC)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTCREDEC$50, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTCREDEC$50);
                        }
                        target.set(totCredEC);
                      }
                    }
                    
                    /**
                     * Unsets the "TotCredEC" element
                     */
                    public void unsetTotCredEC()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTCREDEC$50, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotDepEnvase" element
                     */
                    public long getTotDepEnvase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDEPENVASE$52, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotDepEnvase" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotDepEnvase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTDEPENVASE$52, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotDepEnvase" element
                     */
                    public boolean isSetTotDepEnvase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTDEPENVASE$52) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotDepEnvase" element
                     */
                    public void setTotDepEnvase(long totDepEnvase)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDEPENVASE$52, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTDEPENVASE$52);
                        }
                        target.setLongValue(totDepEnvase);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotDepEnvase" element
                     */
                    public void xsetTotDepEnvase(cl.sii.siiDte.libroCV.ValorType totDepEnvase)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTDEPENVASE$52, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTDEPENVASE$52);
                        }
                        target.set(totDepEnvase);
                      }
                    }
                    
                    /**
                     * Unsets the "TotDepEnvase" element
                     */
                    public void unsetTotDepEnvase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTDEPENVASE$52, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotLiquidaciones" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones getTotLiquidaciones()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones)get_store().find_element_user(TOTLIQUIDACIONES$54, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotLiquidaciones" element
                     */
                    public boolean isSetTotLiquidaciones()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTLIQUIDACIONES$54) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotLiquidaciones" element
                     */
                    public void setTotLiquidaciones(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones totLiquidaciones)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones)get_store().find_element_user(TOTLIQUIDACIONES$54, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones)get_store().add_element_user(TOTLIQUIDACIONES$54);
                        }
                        target.set(totLiquidaciones);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "TotLiquidaciones" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones addNewTotLiquidaciones()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones)get_store().add_element_user(TOTLIQUIDACIONES$54);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "TotLiquidaciones" element
                     */
                    public void unsetTotLiquidaciones()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTLIQUIDACIONES$54, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntTotal" element
                     */
                    public long getTotMntTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTTOTAL$56, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntTotal" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTTOTAL$56, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntTotal" element
                     */
                    public void setTotMntTotal(long totMntTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTTOTAL$56, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTTOTAL$56);
                        }
                        target.setLongValue(totMntTotal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntTotal" element
                     */
                    public void xsetTotMntTotal(cl.sii.siiDte.libroCV.ValorType totMntTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTTOTAL$56, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTTOTAL$56);
                        }
                        target.set(totMntTotal);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVANoRetenido" element
                     */
                    public long getTotOpIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVANORETENIDO$58, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVANoRetenido" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido xgetTotOpIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido)get_store().find_element_user(TOTOPIVANORETENIDO$58, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVANoRetenido" element
                     */
                    public boolean isSetTotOpIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVANORETENIDO$58) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVANoRetenido" element
                     */
                    public void setTotOpIVANoRetenido(long totOpIVANoRetenido)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVANORETENIDO$58, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVANORETENIDO$58);
                        }
                        target.setLongValue(totOpIVANoRetenido);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVANoRetenido" element
                     */
                    public void xsetTotOpIVANoRetenido(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido totOpIVANoRetenido)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido)get_store().find_element_user(TOTOPIVANORETENIDO$58, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido)get_store().add_element_user(TOTOPIVANORETENIDO$58);
                        }
                        target.set(totOpIVANoRetenido);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVANoRetenido" element
                     */
                    public void unsetTotOpIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVANORETENIDO$58, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVANoRetenido" element
                     */
                    public long getTotIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVANORETENIDO$60, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVANoRetenido" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVANORETENIDO$60, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVANoRetenido" element
                     */
                    public boolean isSetTotIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVANORETENIDO$60) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVANoRetenido" element
                     */
                    public void setTotIVANoRetenido(long totIVANoRetenido)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVANORETENIDO$60, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVANORETENIDO$60);
                        }
                        target.setLongValue(totIVANoRetenido);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVANoRetenido" element
                     */
                    public void xsetTotIVANoRetenido(cl.sii.siiDte.libroCV.ValorType totIVANoRetenido)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVANORETENIDO$60, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVANORETENIDO$60);
                        }
                        target.set(totIVANoRetenido);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVANoRetenido" element
                     */
                    public void unsetTotIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVANORETENIDO$60, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntNoFact" element
                     */
                    public long getTotMntNoFact()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNOFACT$62, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntNoFact" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntNoFact()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTNOFACT$62, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotMntNoFact" element
                     */
                    public boolean isSetTotMntNoFact()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTMNTNOFACT$62) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntNoFact" element
                     */
                    public void setTotMntNoFact(long totMntNoFact)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNOFACT$62, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTNOFACT$62);
                        }
                        target.setLongValue(totMntNoFact);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntNoFact" element
                     */
                    public void xsetTotMntNoFact(cl.sii.siiDte.libroCV.ValorType totMntNoFact)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTNOFACT$62, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTNOFACT$62);
                        }
                        target.set(totMntNoFact);
                      }
                    }
                    
                    /**
                     * Unsets the "TotMntNoFact" element
                     */
                    public void unsetTotMntNoFact()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTMNTNOFACT$62, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntPeriodo" element
                     */
                    public long getTotMntPeriodo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTPERIODO$64, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntPeriodo" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntPeriodo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTPERIODO$64, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotMntPeriodo" element
                     */
                    public boolean isSetTotMntPeriodo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTMNTPERIODO$64) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntPeriodo" element
                     */
                    public void setTotMntPeriodo(long totMntPeriodo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTPERIODO$64, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTPERIODO$64);
                        }
                        target.setLongValue(totMntPeriodo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntPeriodo" element
                     */
                    public void xsetTotMntPeriodo(cl.sii.siiDte.libroCV.ValorType totMntPeriodo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTPERIODO$64, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTPERIODO$64);
                        }
                        target.set(totMntPeriodo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotMntPeriodo" element
                     */
                    public void unsetTotMntPeriodo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTMNTPERIODO$64, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotPsjNac" element
                     */
                    public long getTotPsjNac()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTPSJNAC$66, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotPsjNac" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotPsjNac()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTPSJNAC$66, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotPsjNac" element
                     */
                    public boolean isSetTotPsjNac()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTPSJNAC$66) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotPsjNac" element
                     */
                    public void setTotPsjNac(long totPsjNac)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTPSJNAC$66, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTPSJNAC$66);
                        }
                        target.setLongValue(totPsjNac);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotPsjNac" element
                     */
                    public void xsetTotPsjNac(cl.sii.siiDte.libroCV.ValorType totPsjNac)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTPSJNAC$66, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTPSJNAC$66);
                        }
                        target.set(totPsjNac);
                      }
                    }
                    
                    /**
                     * Unsets the "TotPsjNac" element
                     */
                    public void unsetTotPsjNac()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTPSJNAC$66, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotPsjInt" element
                     */
                    public long getTotPsjInt()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTPSJINT$68, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotPsjInt" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotPsjInt()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTPSJINT$68, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotPsjInt" element
                     */
                    public boolean isSetTotPsjInt()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTPSJINT$68) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotPsjInt" element
                     */
                    public void setTotPsjInt(long totPsjInt)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTPSJINT$68, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTPSJINT$68);
                        }
                        target.setLongValue(totPsjInt);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotPsjInt" element
                     */
                    public void xsetTotPsjInt(cl.sii.siiDte.libroCV.ValorType totPsjInt)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTPSJINT$68, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTPSJINT$68);
                        }
                        target.set(totPsjInt);
                      }
                    }
                    
                    /**
                     * Unsets the "TotPsjInt" element
                     */
                    public void unsetTotPsjInt()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTPSJINT$68, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotTabPuros" element
                     */
                    public long getTotTabPuros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABPUROS$70, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotTabPuros" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotTabPuros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTTABPUROS$70, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotTabPuros" element
                     */
                    public boolean isSetTotTabPuros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTTABPUROS$70) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotTabPuros" element
                     */
                    public void setTotTabPuros(long totTabPuros)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABPUROS$70, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTTABPUROS$70);
                        }
                        target.setLongValue(totTabPuros);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotTabPuros" element
                     */
                    public void xsetTotTabPuros(cl.sii.siiDte.libroCV.ValorType totTabPuros)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTTABPUROS$70, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTTABPUROS$70);
                        }
                        target.set(totTabPuros);
                      }
                    }
                    
                    /**
                     * Unsets the "TotTabPuros" element
                     */
                    public void unsetTotTabPuros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTTABPUROS$70, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotTabCigarrillos" element
                     */
                    public long getTotTabCigarrillos()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABCIGARRILLOS$72, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotTabCigarrillos" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotTabCigarrillos()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTTABCIGARRILLOS$72, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotTabCigarrillos" element
                     */
                    public boolean isSetTotTabCigarrillos()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTTABCIGARRILLOS$72) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotTabCigarrillos" element
                     */
                    public void setTotTabCigarrillos(long totTabCigarrillos)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABCIGARRILLOS$72, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTTABCIGARRILLOS$72);
                        }
                        target.setLongValue(totTabCigarrillos);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotTabCigarrillos" element
                     */
                    public void xsetTotTabCigarrillos(cl.sii.siiDte.libroCV.ValorType totTabCigarrillos)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTTABCIGARRILLOS$72, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTTABCIGARRILLOS$72);
                        }
                        target.set(totTabCigarrillos);
                      }
                    }
                    
                    /**
                     * Unsets the "TotTabCigarrillos" element
                     */
                    public void unsetTotTabCigarrillos()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTTABCIGARRILLOS$72, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotTabElaborado" element
                     */
                    public long getTotTabElaborado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABELABORADO$74, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotTabElaborado" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotTabElaborado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTTABELABORADO$74, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotTabElaborado" element
                     */
                    public boolean isSetTotTabElaborado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTTABELABORADO$74) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotTabElaborado" element
                     */
                    public void setTotTabElaborado(long totTabElaborado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABELABORADO$74, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTTABELABORADO$74);
                        }
                        target.setLongValue(totTabElaborado);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotTabElaborado" element
                     */
                    public void xsetTotTabElaborado(cl.sii.siiDte.libroCV.ValorType totTabElaborado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTTABELABORADO$74, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTTABELABORADO$74);
                        }
                        target.set(totTabElaborado);
                      }
                    }
                    
                    /**
                     * Unsets the "TotTabElaborado" element
                     */
                    public void unsetTotTabElaborado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTTABELABORADO$74, 0);
                      }
                    }
                    /**
                     * An XML TpoImp(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TpoImp.
                     */
                    public static class TpoImpImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TpoImpImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TpoImpImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotDoc(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotDoc.
                     */
                    public static class TotDocImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotDocImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotDocImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotAnulado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotAnulado.
                     */
                    public static class TotAnuladoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotAnuladoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotAnuladoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOpExe(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpExe.
                     */
                    public static class TotOpExeImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpExeImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpExeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOpIVARec(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVARec.
                     */
                    public static class TotOpIVARecImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVARecImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVARecImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOpActivoFijo(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpActivoFijo.
                     */
                    public static class TotOpActivoFijoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpActivoFijoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpActivoFijoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotIVANoRec(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class TotIVANoRecImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotIVANoRecImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName CODIVANOREC$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodIVANoRec");
                      private static final javax.xml.namespace.QName TOTOPIVANOREC$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVANoRec");
                      private static final javax.xml.namespace.QName TOTMNTIVANOREC$4 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntIVANoRec");
                      
                      
                      /**
                       * Gets the "CodIVANoRec" element
                       */
                      public int getCodIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIVANOREC$0, 0);
                          if (target == null)
                          {
                            return 0;
                          }
                          return target.getIntValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "CodIVANoRec" element
                       */
                      public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec xgetCodIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec)get_store().find_element_user(CODIVANOREC$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "CodIVANoRec" element
                       */
                      public void setCodIVANoRec(int codIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIVANOREC$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIVANOREC$0);
                          }
                          target.setIntValue(codIVANoRec);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "CodIVANoRec" element
                       */
                      public void xsetCodIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec codIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec)get_store().find_element_user(CODIVANOREC$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec)get_store().add_element_user(CODIVANOREC$0);
                          }
                          target.set(codIVANoRec);
                        }
                      }
                      
                      /**
                       * Gets the "TotOpIVANoRec" element
                       */
                      public long getTotOpIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVANOREC$2, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotOpIVANoRec" element
                       */
                      public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec xgetTotOpIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec)get_store().find_element_user(TOTOPIVANOREC$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotOpIVANoRec" element
                       */
                      public boolean isSetTotOpIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTOPIVANOREC$2) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotOpIVANoRec" element
                       */
                      public void setTotOpIVANoRec(long totOpIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVANOREC$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVANOREC$2);
                          }
                          target.setLongValue(totOpIVANoRec);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotOpIVANoRec" element
                       */
                      public void xsetTotOpIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec totOpIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec)get_store().find_element_user(TOTOPIVANOREC$2, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec)get_store().add_element_user(TOTOPIVANOREC$2);
                          }
                          target.set(totOpIVANoRec);
                        }
                      }
                      
                      /**
                       * Unsets the "TotOpIVANoRec" element
                       */
                      public void unsetTotOpIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTOPIVANOREC$2, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotMntIVANoRec" element
                       */
                      public long getTotMntIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVANOREC$4, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotMntIVANoRec" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotMntIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIVANOREC$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "TotMntIVANoRec" element
                       */
                      public void setTotMntIVANoRec(long totMntIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVANOREC$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIVANOREC$4);
                          }
                          target.setLongValue(totMntIVANoRec);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntIVANoRec" element
                       */
                      public void xsetTotMntIVANoRec(cl.sii.siiDte.libroCV.ValorType totMntIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIVANOREC$4, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTIVANOREC$4);
                          }
                          target.set(totMntIVANoRec);
                        }
                      }
                      /**
                       * An XML CodIVANoRec(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotIVANoRec$CodIVANoRec.
                       */
                      public static class CodIVANoRecImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public CodIVANoRecImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected CodIVANoRecImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                      /**
                       * An XML TotOpIVANoRec(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotIVANoRec$TotOpIVANoRec.
                       */
                      public static class TotOpIVANoRecImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public TotOpIVANoRecImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected TotOpIVANoRecImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                    }
                    /**
                     * An XML TotOpIVAUsoComun(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVAUsoComun.
                     */
                    public static class TotOpIVAUsoComunImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVAUsoComunImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVAUsoComunImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOtrosImp(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class TotOtrosImpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOtrosImpImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName CODIMP$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodImp");
                      private static final javax.xml.namespace.QName TOTMNTIMP$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntImp");
                      
                      
                      /**
                       * Gets the "CodImp" element
                       */
                      public java.math.BigInteger getCodImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIMP$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getBigIntegerValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "CodImp" element
                       */
                      public cl.sii.siiDte.libroCV.ImptoType xgetCodImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ImptoType target = null;
                          target = (cl.sii.siiDte.libroCV.ImptoType)get_store().find_element_user(CODIMP$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "CodImp" element
                       */
                      public void setCodImp(java.math.BigInteger codImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIMP$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIMP$0);
                          }
                          target.setBigIntegerValue(codImp);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "CodImp" element
                       */
                      public void xsetCodImp(cl.sii.siiDte.libroCV.ImptoType codImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ImptoType target = null;
                          target = (cl.sii.siiDte.libroCV.ImptoType)get_store().find_element_user(CODIMP$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ImptoType)get_store().add_element_user(CODIMP$0);
                          }
                          target.set(codImp);
                        }
                      }
                      
                      /**
                       * Gets the "TotMntImp" element
                       */
                      public long getTotMntImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIMP$2, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotMntImp" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotMntImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIMP$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "TotMntImp" element
                       */
                      public void setTotMntImp(long totMntImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIMP$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIMP$2);
                          }
                          target.setLongValue(totMntImp);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntImp" element
                       */
                      public void xsetTotMntImp(cl.sii.siiDte.libroCV.ValorType totMntImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIMP$2, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTIMP$2);
                          }
                          target.set(totMntImp);
                        }
                      }
                    }
                    /**
                     * An XML TotOpIVARetTotal(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVARetTotal.
                     */
                    public static class TotOpIVARetTotalImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVARetTotalImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVARetTotalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOpIVARetParcial(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVARetParcial.
                     */
                    public static class TotOpIVARetParcialImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVARetParcialImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVARetParcialImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotLiquidaciones(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class TotLiquidacionesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotLiquidacionesImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName TOTVALCOMNETO$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotValComNeto");
                      private static final javax.xml.namespace.QName TOTVALCOMEXE$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotValComExe");
                      private static final javax.xml.namespace.QName TOTVALCOMIVA$4 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotValComIVA");
                      
                      
                      /**
                       * Gets the "TotValComNeto" element
                       */
                      public long getTotValComNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMNETO$0, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotValComNeto" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotValComNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMNETO$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotValComNeto" element
                       */
                      public boolean isSetTotValComNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTVALCOMNETO$0) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotValComNeto" element
                       */
                      public void setTotValComNeto(long totValComNeto)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMNETO$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTVALCOMNETO$0);
                          }
                          target.setLongValue(totValComNeto);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotValComNeto" element
                       */
                      public void xsetTotValComNeto(cl.sii.siiDte.libroCV.ValorType totValComNeto)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMNETO$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTVALCOMNETO$0);
                          }
                          target.set(totValComNeto);
                        }
                      }
                      
                      /**
                       * Unsets the "TotValComNeto" element
                       */
                      public void unsetTotValComNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTVALCOMNETO$0, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotValComExe" element
                       */
                      public long getTotValComExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMEXE$2, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotValComExe" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotValComExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMEXE$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotValComExe" element
                       */
                      public boolean isSetTotValComExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTVALCOMEXE$2) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotValComExe" element
                       */
                      public void setTotValComExe(long totValComExe)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMEXE$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTVALCOMEXE$2);
                          }
                          target.setLongValue(totValComExe);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotValComExe" element
                       */
                      public void xsetTotValComExe(cl.sii.siiDte.libroCV.ValorType totValComExe)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMEXE$2, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTVALCOMEXE$2);
                          }
                          target.set(totValComExe);
                        }
                      }
                      
                      /**
                       * Unsets the "TotValComExe" element
                       */
                      public void unsetTotValComExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTVALCOMEXE$2, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotValComIVA" element
                       */
                      public long getTotValComIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMIVA$4, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotValComIVA" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotValComIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMIVA$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotValComIVA" element
                       */
                      public boolean isSetTotValComIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTVALCOMIVA$4) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotValComIVA" element
                       */
                      public void setTotValComIVA(long totValComIVA)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMIVA$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTVALCOMIVA$4);
                          }
                          target.setLongValue(totValComIVA);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotValComIVA" element
                       */
                      public void xsetTotValComIVA(cl.sii.siiDte.libroCV.ValorType totValComIVA)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMIVA$4, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTVALCOMIVA$4);
                          }
                          target.set(totValComIVA);
                        }
                      }
                      
                      /**
                       * Unsets the "TotValComIVA" element
                       */
                      public void unsetTotValComIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTVALCOMIVA$4, 0);
                        }
                      }
                    }
                    /**
                     * An XML TotOpIVANoRetenido(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVANoRetenido.
                     */
                    public static class TotOpIVANoRetenidoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVANoRetenidoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVANoRetenidoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
            public static class ResumenPeriodoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo
            {
                private static final long serialVersionUID = 1L;
                
                public ResumenPeriodoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TOTALESPERIODO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotalesPeriodo");
                
                
                /**
                 * Gets array of all "TotalesPeriodo" elements
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] getTotalesPeriodoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TOTALESPERIODO$0, targetList);
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "TotalesPeriodo" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo getTotalesPeriodoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo)get_store().find_element_user(TOTALESPERIODO$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "TotalesPeriodo" element
                 */
                public int sizeOfTotalesPeriodoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TOTALESPERIODO$0);
                    }
                }
                
                /**
                 * Sets array of all "TotalesPeriodo" element
                 */
                public void setTotalesPeriodoArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] totalesPeriodoArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(totalesPeriodoArray, TOTALESPERIODO$0);
                    }
                }
                
                /**
                 * Sets ith "TotalesPeriodo" element
                 */
                public void setTotalesPeriodoArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo totalesPeriodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo)get_store().find_element_user(TOTALESPERIODO$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(totalesPeriodo);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotalesPeriodo" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo insertNewTotalesPeriodo(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo)get_store().insert_element_user(TOTALESPERIODO$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotalesPeriodo" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo addNewTotalesPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo)get_store().add_element_user(TOTALESPERIODO$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "TotalesPeriodo" element
                 */
                public void removeTotalesPeriodo(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TOTALESPERIODO$0, i);
                    }
                }
                /**
                 * An XML TotalesPeriodo(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class TotalesPeriodoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotalesPeriodoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TPODOC$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDoc");
                    private static final javax.xml.namespace.QName TPOIMP$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoImp");
                    private static final javax.xml.namespace.QName TOTDOC$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotDoc");
                    private static final javax.xml.namespace.QName TOTANULADO$6 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotAnulado");
                    private static final javax.xml.namespace.QName TOTOPEXE$8 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpExe");
                    private static final javax.xml.namespace.QName TOTMNTEXE$10 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntExe");
                    private static final javax.xml.namespace.QName TOTMNTNETO$12 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntNeto");
                    private static final javax.xml.namespace.QName TOTOPIVAREC$14 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVARec");
                    private static final javax.xml.namespace.QName TOTMNTIVA$16 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntIVA");
                    private static final javax.xml.namespace.QName TOTOPACTIVOFIJO$18 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpActivoFijo");
                    private static final javax.xml.namespace.QName TOTMNTACTIVOFIJO$20 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntActivoFijo");
                    private static final javax.xml.namespace.QName TOTMNTIVAACTIVOFIJO$22 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntIVAActivoFijo");
                    private static final javax.xml.namespace.QName TOTIVANOREC$24 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVANoRec");
                    private static final javax.xml.namespace.QName TOTOPIVAUSOCOMUN$26 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVAUsoComun");
                    private static final javax.xml.namespace.QName TOTIVAUSOCOMUN$28 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVAUsoComun");
                    private static final javax.xml.namespace.QName FCTPROP$30 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FctProp");
                    private static final javax.xml.namespace.QName TOTCREDIVAUSOCOMUN$32 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotCredIVAUsoComun");
                    private static final javax.xml.namespace.QName TOTIVAFUERAPLAZO$34 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVAFueraPlazo");
                    private static final javax.xml.namespace.QName TOTIVAPROPIO$36 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVAPropio");
                    private static final javax.xml.namespace.QName TOTIVATERCEROS$38 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVATerceros");
                    private static final javax.xml.namespace.QName TOTLEY18211$40 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotLey18211");
                    private static final javax.xml.namespace.QName TOTOTROSIMP$42 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOtrosImp");
                    private static final javax.xml.namespace.QName TOTIMPSINCREDITO$44 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotImpSinCredito");
                    private static final javax.xml.namespace.QName TOTOPIVARETTOTAL$46 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVARetTotal");
                    private static final javax.xml.namespace.QName TOTIVARETTOTAL$48 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVARetTotal");
                    private static final javax.xml.namespace.QName TOTOPIVARETPARCIAL$50 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVARetParcial");
                    private static final javax.xml.namespace.QName TOTIVARETPARCIAL$52 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVARetParcial");
                    private static final javax.xml.namespace.QName TOTCREDEC$54 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotCredEC");
                    private static final javax.xml.namespace.QName TOTDEPENVASE$56 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotDepEnvase");
                    private static final javax.xml.namespace.QName TOTLIQUIDACIONES$58 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotLiquidaciones");
                    private static final javax.xml.namespace.QName TOTMNTTOTAL$60 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntTotal");
                    private static final javax.xml.namespace.QName TOTOPIVANORETENIDO$62 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVANoRetenido");
                    private static final javax.xml.namespace.QName TOTIVANORETENIDO$64 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotIVANoRetenido");
                    private static final javax.xml.namespace.QName TOTMNTNOFACT$66 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntNoFact");
                    private static final javax.xml.namespace.QName TOTMNTPERIODO$68 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntPeriodo");
                    private static final javax.xml.namespace.QName TOTPSJNAC$70 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotPsjNac");
                    private static final javax.xml.namespace.QName TOTPSJINT$72 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotPsjInt");
                    private static final javax.xml.namespace.QName TOTTABPUROS$74 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotTabPuros");
                    private static final javax.xml.namespace.QName TOTTABCIGARRILLOS$76 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotTabCigarrillos");
                    private static final javax.xml.namespace.QName TOTTABELABORADO$78 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotTabElaborado");
                    private static final javax.xml.namespace.QName TOTIMPVEHICULO$80 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotImpVehiculo");
                    
                    
                    /**
                     * Gets the "TpoDoc" element
                     */
                    public java.math.BigInteger getTpoDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOC$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TpoDoc" element
                     */
                    public cl.sii.siiDte.libroCV.DoctoType xgetTpoDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.DoctoType target = null;
                        target = (cl.sii.siiDte.libroCV.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TpoDoc" element
                     */
                    public void setTpoDoc(java.math.BigInteger tpoDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOC$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPODOC$0);
                        }
                        target.setBigIntegerValue(tpoDoc);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TpoDoc" element
                     */
                    public void xsetTpoDoc(cl.sii.siiDte.libroCV.DoctoType tpoDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.DoctoType target = null;
                        target = (cl.sii.siiDte.libroCV.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.DoctoType)get_store().add_element_user(TPODOC$0);
                        }
                        target.set(tpoDoc);
                      }
                    }
                    
                    /**
                     * Gets the "TpoImp" element
                     */
                    public int getTpoImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOIMP$2, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TpoImp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp xgetTpoImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp)get_store().find_element_user(TPOIMP$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TpoImp" element
                     */
                    public boolean isSetTpoImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TPOIMP$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TpoImp" element
                     */
                    public void setTpoImp(int tpoImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOIMP$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOIMP$2);
                        }
                        target.setIntValue(tpoImp);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TpoImp" element
                     */
                    public void xsetTpoImp(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp tpoImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp)get_store().find_element_user(TPOIMP$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp)get_store().add_element_user(TPOIMP$2);
                        }
                        target.set(tpoImp);
                      }
                    }
                    
                    /**
                     * Unsets the "TpoImp" element
                     */
                    public void unsetTpoImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TPOIMP$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotDoc" element
                     */
                    public long getTotDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDOC$4, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotDoc" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc xgetTotDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc)get_store().find_element_user(TOTDOC$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotDoc" element
                     */
                    public void setTotDoc(long totDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDOC$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTDOC$4);
                        }
                        target.setLongValue(totDoc);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotDoc" element
                     */
                    public void xsetTotDoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc totDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc)get_store().find_element_user(TOTDOC$4, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc)get_store().add_element_user(TOTDOC$4);
                        }
                        target.set(totDoc);
                      }
                    }
                    
                    /**
                     * Gets the "TotAnulado" element
                     */
                    public long getTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTANULADO$6, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotAnulado" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado xgetTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado)get_store().find_element_user(TOTANULADO$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotAnulado" element
                     */
                    public boolean isSetTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTANULADO$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotAnulado" element
                     */
                    public void setTotAnulado(long totAnulado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTANULADO$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTANULADO$6);
                        }
                        target.setLongValue(totAnulado);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotAnulado" element
                     */
                    public void xsetTotAnulado(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado totAnulado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado)get_store().find_element_user(TOTANULADO$6, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado)get_store().add_element_user(TOTANULADO$6);
                        }
                        target.set(totAnulado);
                      }
                    }
                    
                    /**
                     * Unsets the "TotAnulado" element
                     */
                    public void unsetTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTANULADO$6, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpExe" element
                     */
                    public long getTotOpExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPEXE$8, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpExe" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe xgetTotOpExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe)get_store().find_element_user(TOTOPEXE$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpExe" element
                     */
                    public boolean isSetTotOpExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPEXE$8) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpExe" element
                     */
                    public void setTotOpExe(long totOpExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPEXE$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPEXE$8);
                        }
                        target.setLongValue(totOpExe);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpExe" element
                     */
                    public void xsetTotOpExe(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe totOpExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe)get_store().find_element_user(TOTOPEXE$8, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe)get_store().add_element_user(TOTOPEXE$8);
                        }
                        target.set(totOpExe);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpExe" element
                     */
                    public void unsetTotOpExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPEXE$8, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntExe" element
                     */
                    public long getTotMntExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTEXE$10, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntExe" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTEXE$10, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntExe" element
                     */
                    public void setTotMntExe(long totMntExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTEXE$10, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTEXE$10);
                        }
                        target.setLongValue(totMntExe);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntExe" element
                     */
                    public void xsetTotMntExe(cl.sii.siiDte.libroCV.ValorType totMntExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTEXE$10, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTEXE$10);
                        }
                        target.set(totMntExe);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntNeto" element
                     */
                    public long getTotMntNeto()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNETO$12, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntNeto" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntNeto()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTNETO$12, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntNeto" element
                     */
                    public void setTotMntNeto(long totMntNeto)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNETO$12, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTNETO$12);
                        }
                        target.setLongValue(totMntNeto);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntNeto" element
                     */
                    public void xsetTotMntNeto(cl.sii.siiDte.libroCV.ValorType totMntNeto)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTNETO$12, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTNETO$12);
                        }
                        target.set(totMntNeto);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVARec" element
                     */
                    public long getTotOpIVARec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVAREC$14, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVARec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec xgetTotOpIVARec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec)get_store().find_element_user(TOTOPIVAREC$14, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVARec" element
                     */
                    public boolean isSetTotOpIVARec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVAREC$14) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVARec" element
                     */
                    public void setTotOpIVARec(long totOpIVARec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVAREC$14, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVAREC$14);
                        }
                        target.setLongValue(totOpIVARec);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVARec" element
                     */
                    public void xsetTotOpIVARec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec totOpIVARec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec)get_store().find_element_user(TOTOPIVAREC$14, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec)get_store().add_element_user(TOTOPIVAREC$14);
                        }
                        target.set(totOpIVARec);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVARec" element
                     */
                    public void unsetTotOpIVARec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVAREC$14, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntIVA" element
                     */
                    public long getTotMntIVA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVA$16, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntIVA" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntIVA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIVA$16, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntIVA" element
                     */
                    public void setTotMntIVA(long totMntIVA)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVA$16, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIVA$16);
                        }
                        target.setLongValue(totMntIVA);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntIVA" element
                     */
                    public void xsetTotMntIVA(cl.sii.siiDte.libroCV.ValorType totMntIVA)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIVA$16, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTIVA$16);
                        }
                        target.set(totMntIVA);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpActivoFijo" element
                     */
                    public long getTotOpActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPACTIVOFIJO$18, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpActivoFijo" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo xgetTotOpActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo)get_store().find_element_user(TOTOPACTIVOFIJO$18, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpActivoFijo" element
                     */
                    public boolean isSetTotOpActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPACTIVOFIJO$18) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpActivoFijo" element
                     */
                    public void setTotOpActivoFijo(long totOpActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPACTIVOFIJO$18, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPACTIVOFIJO$18);
                        }
                        target.setLongValue(totOpActivoFijo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpActivoFijo" element
                     */
                    public void xsetTotOpActivoFijo(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo totOpActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo)get_store().find_element_user(TOTOPACTIVOFIJO$18, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo)get_store().add_element_user(TOTOPACTIVOFIJO$18);
                        }
                        target.set(totOpActivoFijo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpActivoFijo" element
                     */
                    public void unsetTotOpActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPACTIVOFIJO$18, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntActivoFijo" element
                     */
                    public long getTotMntActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTACTIVOFIJO$20, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntActivoFijo" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotMntActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTMNTACTIVOFIJO$20, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotMntActivoFijo" element
                     */
                    public boolean isSetTotMntActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTMNTACTIVOFIJO$20) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntActivoFijo" element
                     */
                    public void setTotMntActivoFijo(long totMntActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTACTIVOFIJO$20, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTACTIVOFIJO$20);
                        }
                        target.setLongValue(totMntActivoFijo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntActivoFijo" element
                     */
                    public void xsetTotMntActivoFijo(cl.sii.siiDte.libroCV.MontoType totMntActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTMNTACTIVOFIJO$20, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTMNTACTIVOFIJO$20);
                        }
                        target.set(totMntActivoFijo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotMntActivoFijo" element
                     */
                    public void unsetTotMntActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTMNTACTIVOFIJO$20, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntIVAActivoFijo" element
                     */
                    public long getTotMntIVAActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVAACTIVOFIJO$22, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntIVAActivoFijo" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotMntIVAActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTMNTIVAACTIVOFIJO$22, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotMntIVAActivoFijo" element
                     */
                    public boolean isSetTotMntIVAActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTMNTIVAACTIVOFIJO$22) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntIVAActivoFijo" element
                     */
                    public void setTotMntIVAActivoFijo(long totMntIVAActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVAACTIVOFIJO$22, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIVAACTIVOFIJO$22);
                        }
                        target.setLongValue(totMntIVAActivoFijo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntIVAActivoFijo" element
                     */
                    public void xsetTotMntIVAActivoFijo(cl.sii.siiDte.libroCV.MontoType totMntIVAActivoFijo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTMNTIVAACTIVOFIJO$22, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTMNTIVAACTIVOFIJO$22);
                        }
                        target.set(totMntIVAActivoFijo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotMntIVAActivoFijo" element
                     */
                    public void unsetTotMntIVAActivoFijo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTMNTIVAACTIVOFIJO$22, 0);
                      }
                    }
                    
                    /**
                     * Gets array of all "TotIVANoRec" elements
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec[] getTotIVANoRecArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(TOTIVANOREC$24, targetList);
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "TotIVANoRec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec getTotIVANoRecArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec)get_store().find_element_user(TOTIVANOREC$24, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "TotIVANoRec" element
                     */
                    public int sizeOfTotIVANoRecArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVANOREC$24);
                      }
                    }
                    
                    /**
                     * Sets array of all "TotIVANoRec" element
                     */
                    public void setTotIVANoRecArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec[] totIVANoRecArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(totIVANoRecArray, TOTIVANOREC$24);
                      }
                    }
                    
                    /**
                     * Sets ith "TotIVANoRec" element
                     */
                    public void setTotIVANoRecArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec totIVANoRec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec)get_store().find_element_user(TOTIVANOREC$24, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(totIVANoRec);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotIVANoRec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec insertNewTotIVANoRec(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec)get_store().insert_element_user(TOTIVANOREC$24, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotIVANoRec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec addNewTotIVANoRec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec)get_store().add_element_user(TOTIVANOREC$24);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "TotIVANoRec" element
                     */
                    public void removeTotIVANoRec(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVANOREC$24, i);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVAUsoComun" element
                     */
                    public long getTotOpIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVAUSOCOMUN$26, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVAUsoComun" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun xgetTotOpIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun)get_store().find_element_user(TOTOPIVAUSOCOMUN$26, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVAUsoComun" element
                     */
                    public boolean isSetTotOpIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVAUSOCOMUN$26) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVAUsoComun" element
                     */
                    public void setTotOpIVAUsoComun(long totOpIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVAUSOCOMUN$26, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVAUSOCOMUN$26);
                        }
                        target.setLongValue(totOpIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVAUsoComun" element
                     */
                    public void xsetTotOpIVAUsoComun(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun totOpIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun)get_store().find_element_user(TOTOPIVAUSOCOMUN$26, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun)get_store().add_element_user(TOTOPIVAUSOCOMUN$26);
                        }
                        target.set(totOpIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVAUsoComun" element
                     */
                    public void unsetTotOpIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVAUSOCOMUN$26, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVAUsoComun" element
                     */
                    public long getTotIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAUSOCOMUN$28, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVAUsoComun" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVAUSOCOMUN$28, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVAUsoComun" element
                     */
                    public boolean isSetTotIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVAUSOCOMUN$28) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVAUsoComun" element
                     */
                    public void setTotIVAUsoComun(long totIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAUSOCOMUN$28, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVAUSOCOMUN$28);
                        }
                        target.setLongValue(totIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVAUsoComun" element
                     */
                    public void xsetTotIVAUsoComun(cl.sii.siiDte.libroCV.MontoType totIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVAUSOCOMUN$28, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTIVAUSOCOMUN$28);
                        }
                        target.set(totIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVAUsoComun" element
                     */
                    public void unsetTotIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVAUSOCOMUN$28, 0);
                      }
                    }
                    
                    /**
                     * Gets the "FctProp" element
                     */
                    public java.math.BigDecimal getFctProp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCTPROP$30, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "FctProp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp xgetFctProp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp)get_store().find_element_user(FCTPROP$30, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "FctProp" element
                     */
                    public boolean isSetFctProp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(FCTPROP$30) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "FctProp" element
                     */
                    public void setFctProp(java.math.BigDecimal fctProp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCTPROP$30, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCTPROP$30);
                        }
                        target.setBigDecimalValue(fctProp);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "FctProp" element
                     */
                    public void xsetFctProp(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp fctProp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp)get_store().find_element_user(FCTPROP$30, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp)get_store().add_element_user(FCTPROP$30);
                        }
                        target.set(fctProp);
                      }
                    }
                    
                    /**
                     * Unsets the "FctProp" element
                     */
                    public void unsetFctProp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(FCTPROP$30, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotCredIVAUsoComun" element
                     */
                    public long getTotCredIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTCREDIVAUSOCOMUN$32, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotCredIVAUsoComun" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotCredIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTCREDIVAUSOCOMUN$32, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotCredIVAUsoComun" element
                     */
                    public boolean isSetTotCredIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTCREDIVAUSOCOMUN$32) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotCredIVAUsoComun" element
                     */
                    public void setTotCredIVAUsoComun(long totCredIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTCREDIVAUSOCOMUN$32, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTCREDIVAUSOCOMUN$32);
                        }
                        target.setLongValue(totCredIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotCredIVAUsoComun" element
                     */
                    public void xsetTotCredIVAUsoComun(cl.sii.siiDte.libroCV.MontoType totCredIVAUsoComun)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTCREDIVAUSOCOMUN$32, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTCREDIVAUSOCOMUN$32);
                        }
                        target.set(totCredIVAUsoComun);
                      }
                    }
                    
                    /**
                     * Unsets the "TotCredIVAUsoComun" element
                     */
                    public void unsetTotCredIVAUsoComun()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTCREDIVAUSOCOMUN$32, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVAFueraPlazo" element
                     */
                    public long getTotIVAFueraPlazo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAFUERAPLAZO$34, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVAFueraPlazo" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotIVAFueraPlazo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVAFUERAPLAZO$34, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVAFueraPlazo" element
                     */
                    public boolean isSetTotIVAFueraPlazo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVAFUERAPLAZO$34) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVAFueraPlazo" element
                     */
                    public void setTotIVAFueraPlazo(long totIVAFueraPlazo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAFUERAPLAZO$34, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVAFUERAPLAZO$34);
                        }
                        target.setLongValue(totIVAFueraPlazo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVAFueraPlazo" element
                     */
                    public void xsetTotIVAFueraPlazo(cl.sii.siiDte.libroCV.MontoType totIVAFueraPlazo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVAFUERAPLAZO$34, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTIVAFUERAPLAZO$34);
                        }
                        target.set(totIVAFueraPlazo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVAFueraPlazo" element
                     */
                    public void unsetTotIVAFueraPlazo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVAFUERAPLAZO$34, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVAPropio" element
                     */
                    public long getTotIVAPropio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAPROPIO$36, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVAPropio" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVAPropio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVAPROPIO$36, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVAPropio" element
                     */
                    public boolean isSetTotIVAPropio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVAPROPIO$36) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVAPropio" element
                     */
                    public void setTotIVAPropio(long totIVAPropio)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVAPROPIO$36, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVAPROPIO$36);
                        }
                        target.setLongValue(totIVAPropio);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVAPropio" element
                     */
                    public void xsetTotIVAPropio(cl.sii.siiDte.libroCV.ValorType totIVAPropio)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVAPROPIO$36, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVAPROPIO$36);
                        }
                        target.set(totIVAPropio);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVAPropio" element
                     */
                    public void unsetTotIVAPropio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVAPROPIO$36, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVATerceros" element
                     */
                    public long getTotIVATerceros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVATERCEROS$38, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVATerceros" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotIVATerceros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVATERCEROS$38, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVATerceros" element
                     */
                    public boolean isSetTotIVATerceros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVATERCEROS$38) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVATerceros" element
                     */
                    public void setTotIVATerceros(long totIVATerceros)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVATERCEROS$38, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVATERCEROS$38);
                        }
                        target.setLongValue(totIVATerceros);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVATerceros" element
                     */
                    public void xsetTotIVATerceros(cl.sii.siiDte.libroCV.ValorType totIVATerceros)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTIVATERCEROS$38, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTIVATERCEROS$38);
                        }
                        target.set(totIVATerceros);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVATerceros" element
                     */
                    public void unsetTotIVATerceros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVATERCEROS$38, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotLey18211" element
                     */
                    public long getTotLey18211()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTLEY18211$40, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotLey18211" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotLey18211()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTLEY18211$40, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotLey18211" element
                     */
                    public boolean isSetTotLey18211()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTLEY18211$40) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotLey18211" element
                     */
                    public void setTotLey18211(long totLey18211)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTLEY18211$40, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTLEY18211$40);
                        }
                        target.setLongValue(totLey18211);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotLey18211" element
                     */
                    public void xsetTotLey18211(cl.sii.siiDte.libroCV.MontoType totLey18211)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTLEY18211$40, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTLEY18211$40);
                        }
                        target.set(totLey18211);
                      }
                    }
                    
                    /**
                     * Unsets the "TotLey18211" element
                     */
                    public void unsetTotLey18211()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTLEY18211$40, 0);
                      }
                    }
                    
                    /**
                     * Gets array of all "TotOtrosImp" elements
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp[] getTotOtrosImpArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(TOTOTROSIMP$42, targetList);
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "TotOtrosImp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp getTotOtrosImpArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp)get_store().find_element_user(TOTOTROSIMP$42, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "TotOtrosImp" element
                     */
                    public int sizeOfTotOtrosImpArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOTROSIMP$42);
                      }
                    }
                    
                    /**
                     * Sets array of all "TotOtrosImp" element
                     */
                    public void setTotOtrosImpArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp[] totOtrosImpArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(totOtrosImpArray, TOTOTROSIMP$42);
                      }
                    }
                    
                    /**
                     * Sets ith "TotOtrosImp" element
                     */
                    public void setTotOtrosImpArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp totOtrosImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp)get_store().find_element_user(TOTOTROSIMP$42, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(totOtrosImp);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotOtrosImp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp insertNewTotOtrosImp(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp)get_store().insert_element_user(TOTOTROSIMP$42, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotOtrosImp" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp addNewTotOtrosImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp)get_store().add_element_user(TOTOTROSIMP$42);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "TotOtrosImp" element
                     */
                    public void removeTotOtrosImp(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOTROSIMP$42, i);
                      }
                    }
                    
                    /**
                     * Gets the "TotImpSinCredito" element
                     */
                    public long getTotImpSinCredito()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIMPSINCREDITO$44, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotImpSinCredito" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotImpSinCredito()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIMPSINCREDITO$44, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotImpSinCredito" element
                     */
                    public boolean isSetTotImpSinCredito()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIMPSINCREDITO$44) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotImpSinCredito" element
                     */
                    public void setTotImpSinCredito(long totImpSinCredito)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIMPSINCREDITO$44, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIMPSINCREDITO$44);
                        }
                        target.setLongValue(totImpSinCredito);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotImpSinCredito" element
                     */
                    public void xsetTotImpSinCredito(cl.sii.siiDte.libroCV.MontoType totImpSinCredito)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIMPSINCREDITO$44, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTIMPSINCREDITO$44);
                        }
                        target.set(totImpSinCredito);
                      }
                    }
                    
                    /**
                     * Unsets the "TotImpSinCredito" element
                     */
                    public void unsetTotImpSinCredito()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIMPSINCREDITO$44, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVARetTotal" element
                     */
                    public long getTotOpIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVARETTOTAL$46, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVARetTotal" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal xgetTotOpIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal)get_store().find_element_user(TOTOPIVARETTOTAL$46, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVARetTotal" element
                     */
                    public boolean isSetTotOpIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVARETTOTAL$46) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVARetTotal" element
                     */
                    public void setTotOpIVARetTotal(long totOpIVARetTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVARETTOTAL$46, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVARETTOTAL$46);
                        }
                        target.setLongValue(totOpIVARetTotal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVARetTotal" element
                     */
                    public void xsetTotOpIVARetTotal(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal totOpIVARetTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal)get_store().find_element_user(TOTOPIVARETTOTAL$46, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal)get_store().add_element_user(TOTOPIVARETTOTAL$46);
                        }
                        target.set(totOpIVARetTotal);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVARetTotal" element
                     */
                    public void unsetTotOpIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVARETTOTAL$46, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVARetTotal" element
                     */
                    public long getTotIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVARETTOTAL$48, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVARetTotal" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVARETTOTAL$48, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVARetTotal" element
                     */
                    public boolean isSetTotIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVARETTOTAL$48) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVARetTotal" element
                     */
                    public void setTotIVARetTotal(long totIVARetTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVARETTOTAL$48, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVARETTOTAL$48);
                        }
                        target.setLongValue(totIVARetTotal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVARetTotal" element
                     */
                    public void xsetTotIVARetTotal(cl.sii.siiDte.libroCV.MontoType totIVARetTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVARETTOTAL$48, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTIVARETTOTAL$48);
                        }
                        target.set(totIVARetTotal);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVARetTotal" element
                     */
                    public void unsetTotIVARetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVARETTOTAL$48, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVARetParcial" element
                     */
                    public long getTotOpIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVARETPARCIAL$50, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVARetParcial" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial xgetTotOpIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial)get_store().find_element_user(TOTOPIVARETPARCIAL$50, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVARetParcial" element
                     */
                    public boolean isSetTotOpIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVARETPARCIAL$50) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVARetParcial" element
                     */
                    public void setTotOpIVARetParcial(long totOpIVARetParcial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVARETPARCIAL$50, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVARETPARCIAL$50);
                        }
                        target.setLongValue(totOpIVARetParcial);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVARetParcial" element
                     */
                    public void xsetTotOpIVARetParcial(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial totOpIVARetParcial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial)get_store().find_element_user(TOTOPIVARETPARCIAL$50, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial)get_store().add_element_user(TOTOPIVARETPARCIAL$50);
                        }
                        target.set(totOpIVARetParcial);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVARetParcial" element
                     */
                    public void unsetTotOpIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVARETPARCIAL$50, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVARetParcial" element
                     */
                    public long getTotIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVARETPARCIAL$52, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVARetParcial" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVARETPARCIAL$52, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVARetParcial" element
                     */
                    public boolean isSetTotIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVARETPARCIAL$52) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVARetParcial" element
                     */
                    public void setTotIVARetParcial(long totIVARetParcial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVARETPARCIAL$52, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVARETPARCIAL$52);
                        }
                        target.setLongValue(totIVARetParcial);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVARetParcial" element
                     */
                    public void xsetTotIVARetParcial(cl.sii.siiDte.libroCV.MontoType totIVARetParcial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVARETPARCIAL$52, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTIVARETPARCIAL$52);
                        }
                        target.set(totIVARetParcial);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVARetParcial" element
                     */
                    public void unsetTotIVARetParcial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVARETPARCIAL$52, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotCredEC" element
                     */
                    public long getTotCredEC()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTCREDEC$54, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotCredEC" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotCredEC()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTCREDEC$54, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotCredEC" element
                     */
                    public boolean isSetTotCredEC()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTCREDEC$54) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotCredEC" element
                     */
                    public void setTotCredEC(long totCredEC)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTCREDEC$54, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTCREDEC$54);
                        }
                        target.setLongValue(totCredEC);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotCredEC" element
                     */
                    public void xsetTotCredEC(cl.sii.siiDte.libroCV.MontoType totCredEC)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTCREDEC$54, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTCREDEC$54);
                        }
                        target.set(totCredEC);
                      }
                    }
                    
                    /**
                     * Unsets the "TotCredEC" element
                     */
                    public void unsetTotCredEC()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTCREDEC$54, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotDepEnvase" element
                     */
                    public long getTotDepEnvase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDEPENVASE$56, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotDepEnvase" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotDepEnvase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTDEPENVASE$56, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotDepEnvase" element
                     */
                    public boolean isSetTotDepEnvase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTDEPENVASE$56) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotDepEnvase" element
                     */
                    public void setTotDepEnvase(long totDepEnvase)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDEPENVASE$56, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTDEPENVASE$56);
                        }
                        target.setLongValue(totDepEnvase);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotDepEnvase" element
                     */
                    public void xsetTotDepEnvase(cl.sii.siiDte.libroCV.MontoType totDepEnvase)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTDEPENVASE$56, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTDEPENVASE$56);
                        }
                        target.set(totDepEnvase);
                      }
                    }
                    
                    /**
                     * Unsets the "TotDepEnvase" element
                     */
                    public void unsetTotDepEnvase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTDEPENVASE$56, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotLiquidaciones" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones getTotLiquidaciones()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones)get_store().find_element_user(TOTLIQUIDACIONES$58, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotLiquidaciones" element
                     */
                    public boolean isSetTotLiquidaciones()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTLIQUIDACIONES$58) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotLiquidaciones" element
                     */
                    public void setTotLiquidaciones(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones totLiquidaciones)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones)get_store().find_element_user(TOTLIQUIDACIONES$58, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones)get_store().add_element_user(TOTLIQUIDACIONES$58);
                        }
                        target.set(totLiquidaciones);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "TotLiquidaciones" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones addNewTotLiquidaciones()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones)get_store().add_element_user(TOTLIQUIDACIONES$58);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "TotLiquidaciones" element
                     */
                    public void unsetTotLiquidaciones()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTLIQUIDACIONES$58, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntTotal" element
                     */
                    public long getTotMntTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTTOTAL$60, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntTotal" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTTOTAL$60, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntTotal" element
                     */
                    public void setTotMntTotal(long totMntTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTTOTAL$60, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTTOTAL$60);
                        }
                        target.setLongValue(totMntTotal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntTotal" element
                     */
                    public void xsetTotMntTotal(cl.sii.siiDte.libroCV.ValorType totMntTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTTOTAL$60, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTTOTAL$60);
                        }
                        target.set(totMntTotal);
                      }
                    }
                    
                    /**
                     * Gets the "TotOpIVANoRetenido" element
                     */
                    public long getTotOpIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVANORETENIDO$62, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotOpIVANoRetenido" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido xgetTotOpIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido)get_store().find_element_user(TOTOPIVANORETENIDO$62, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotOpIVANoRetenido" element
                     */
                    public boolean isSetTotOpIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTOPIVANORETENIDO$62) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotOpIVANoRetenido" element
                     */
                    public void setTotOpIVANoRetenido(long totOpIVANoRetenido)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVANORETENIDO$62, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVANORETENIDO$62);
                        }
                        target.setLongValue(totOpIVANoRetenido);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotOpIVANoRetenido" element
                     */
                    public void xsetTotOpIVANoRetenido(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido totOpIVANoRetenido)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido)get_store().find_element_user(TOTOPIVANORETENIDO$62, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido)get_store().add_element_user(TOTOPIVANORETENIDO$62);
                        }
                        target.set(totOpIVANoRetenido);
                      }
                    }
                    
                    /**
                     * Unsets the "TotOpIVANoRetenido" element
                     */
                    public void unsetTotOpIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTOPIVANORETENIDO$62, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotIVANoRetenido" element
                     */
                    public long getTotIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVANORETENIDO$64, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotIVANoRetenido" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVANORETENIDO$64, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotIVANoRetenido" element
                     */
                    public boolean isSetTotIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIVANORETENIDO$64) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotIVANoRetenido" element
                     */
                    public void setTotIVANoRetenido(long totIVANoRetenido)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIVANORETENIDO$64, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIVANORETENIDO$64);
                        }
                        target.setLongValue(totIVANoRetenido);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotIVANoRetenido" element
                     */
                    public void xsetTotIVANoRetenido(cl.sii.siiDte.libroCV.MontoType totIVANoRetenido)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIVANORETENIDO$64, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTIVANORETENIDO$64);
                        }
                        target.set(totIVANoRetenido);
                      }
                    }
                    
                    /**
                     * Unsets the "TotIVANoRetenido" element
                     */
                    public void unsetTotIVANoRetenido()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIVANORETENIDO$64, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntNoFact" element
                     */
                    public long getTotMntNoFact()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNOFACT$66, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntNoFact" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntNoFact()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTNOFACT$66, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotMntNoFact" element
                     */
                    public boolean isSetTotMntNoFact()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTMNTNOFACT$66) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntNoFact" element
                     */
                    public void setTotMntNoFact(long totMntNoFact)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNOFACT$66, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTNOFACT$66);
                        }
                        target.setLongValue(totMntNoFact);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntNoFact" element
                     */
                    public void xsetTotMntNoFact(cl.sii.siiDte.libroCV.ValorType totMntNoFact)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTNOFACT$66, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTNOFACT$66);
                        }
                        target.set(totMntNoFact);
                      }
                    }
                    
                    /**
                     * Unsets the "TotMntNoFact" element
                     */
                    public void unsetTotMntNoFact()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTMNTNOFACT$66, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotMntPeriodo" element
                     */
                    public long getTotMntPeriodo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTPERIODO$68, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotMntPeriodo" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetTotMntPeriodo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTPERIODO$68, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotMntPeriodo" element
                     */
                    public boolean isSetTotMntPeriodo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTMNTPERIODO$68) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotMntPeriodo" element
                     */
                    public void setTotMntPeriodo(long totMntPeriodo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTPERIODO$68, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTPERIODO$68);
                        }
                        target.setLongValue(totMntPeriodo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotMntPeriodo" element
                     */
                    public void xsetTotMntPeriodo(cl.sii.siiDte.libroCV.ValorType totMntPeriodo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTPERIODO$68, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTPERIODO$68);
                        }
                        target.set(totMntPeriodo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotMntPeriodo" element
                     */
                    public void unsetTotMntPeriodo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTMNTPERIODO$68, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotPsjNac" element
                     */
                    public long getTotPsjNac()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTPSJNAC$70, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotPsjNac" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotPsjNac()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTPSJNAC$70, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotPsjNac" element
                     */
                    public boolean isSetTotPsjNac()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTPSJNAC$70) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotPsjNac" element
                     */
                    public void setTotPsjNac(long totPsjNac)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTPSJNAC$70, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTPSJNAC$70);
                        }
                        target.setLongValue(totPsjNac);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotPsjNac" element
                     */
                    public void xsetTotPsjNac(cl.sii.siiDte.libroCV.MontoType totPsjNac)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTPSJNAC$70, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTPSJNAC$70);
                        }
                        target.set(totPsjNac);
                      }
                    }
                    
                    /**
                     * Unsets the "TotPsjNac" element
                     */
                    public void unsetTotPsjNac()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTPSJNAC$70, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotPsjInt" element
                     */
                    public long getTotPsjInt()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTPSJINT$72, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotPsjInt" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotPsjInt()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTPSJINT$72, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotPsjInt" element
                     */
                    public boolean isSetTotPsjInt()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTPSJINT$72) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotPsjInt" element
                     */
                    public void setTotPsjInt(long totPsjInt)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTPSJINT$72, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTPSJINT$72);
                        }
                        target.setLongValue(totPsjInt);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotPsjInt" element
                     */
                    public void xsetTotPsjInt(cl.sii.siiDte.libroCV.MontoType totPsjInt)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTPSJINT$72, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTPSJINT$72);
                        }
                        target.set(totPsjInt);
                      }
                    }
                    
                    /**
                     * Unsets the "TotPsjInt" element
                     */
                    public void unsetTotPsjInt()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTPSJINT$72, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotTabPuros" element
                     */
                    public long getTotTabPuros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABPUROS$74, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotTabPuros" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotTabPuros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTTABPUROS$74, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotTabPuros" element
                     */
                    public boolean isSetTotTabPuros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTTABPUROS$74) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotTabPuros" element
                     */
                    public void setTotTabPuros(long totTabPuros)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABPUROS$74, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTTABPUROS$74);
                        }
                        target.setLongValue(totTabPuros);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotTabPuros" element
                     */
                    public void xsetTotTabPuros(cl.sii.siiDte.libroCV.MontoType totTabPuros)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTTABPUROS$74, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTTABPUROS$74);
                        }
                        target.set(totTabPuros);
                      }
                    }
                    
                    /**
                     * Unsets the "TotTabPuros" element
                     */
                    public void unsetTotTabPuros()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTTABPUROS$74, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotTabCigarrillos" element
                     */
                    public long getTotTabCigarrillos()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABCIGARRILLOS$76, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotTabCigarrillos" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotTabCigarrillos()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTTABCIGARRILLOS$76, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotTabCigarrillos" element
                     */
                    public boolean isSetTotTabCigarrillos()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTTABCIGARRILLOS$76) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotTabCigarrillos" element
                     */
                    public void setTotTabCigarrillos(long totTabCigarrillos)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABCIGARRILLOS$76, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTTABCIGARRILLOS$76);
                        }
                        target.setLongValue(totTabCigarrillos);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotTabCigarrillos" element
                     */
                    public void xsetTotTabCigarrillos(cl.sii.siiDte.libroCV.MontoType totTabCigarrillos)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTTABCIGARRILLOS$76, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTTABCIGARRILLOS$76);
                        }
                        target.set(totTabCigarrillos);
                      }
                    }
                    
                    /**
                     * Unsets the "TotTabCigarrillos" element
                     */
                    public void unsetTotTabCigarrillos()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTTABCIGARRILLOS$76, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotTabElaborado" element
                     */
                    public long getTotTabElaborado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABELABORADO$78, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotTabElaborado" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotTabElaborado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTTABELABORADO$78, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotTabElaborado" element
                     */
                    public boolean isSetTotTabElaborado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTTABELABORADO$78) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotTabElaborado" element
                     */
                    public void setTotTabElaborado(long totTabElaborado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTTABELABORADO$78, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTTABELABORADO$78);
                        }
                        target.setLongValue(totTabElaborado);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotTabElaborado" element
                     */
                    public void xsetTotTabElaborado(cl.sii.siiDte.libroCV.MontoType totTabElaborado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTTABELABORADO$78, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTTABELABORADO$78);
                        }
                        target.set(totTabElaborado);
                      }
                    }
                    
                    /**
                     * Unsets the "TotTabElaborado" element
                     */
                    public void unsetTotTabElaborado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTTABELABORADO$78, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TotImpVehiculo" element
                     */
                    public long getTotImpVehiculo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIMPVEHICULO$80, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TotImpVehiculo" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetTotImpVehiculo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIMPVEHICULO$80, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TotImpVehiculo" element
                     */
                    public boolean isSetTotImpVehiculo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTIMPVEHICULO$80) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TotImpVehiculo" element
                     */
                    public void setTotImpVehiculo(long totImpVehiculo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIMPVEHICULO$80, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIMPVEHICULO$80);
                        }
                        target.setLongValue(totImpVehiculo);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotImpVehiculo" element
                     */
                    public void xsetTotImpVehiculo(cl.sii.siiDte.libroCV.MontoType totImpVehiculo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTIMPVEHICULO$80, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTIMPVEHICULO$80);
                        }
                        target.set(totImpVehiculo);
                      }
                    }
                    
                    /**
                     * Unsets the "TotImpVehiculo" element
                     */
                    public void unsetTotImpVehiculo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTIMPVEHICULO$80, 0);
                      }
                    }
                    /**
                     * An XML TpoImp(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TpoImp.
                     */
                    public static class TpoImpImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TpoImpImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TpoImpImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotDoc(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotDoc.
                     */
                    public static class TotDocImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotDocImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotDocImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotAnulado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotAnulado.
                     */
                    public static class TotAnuladoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotAnuladoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotAnuladoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOpExe(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpExe.
                     */
                    public static class TotOpExeImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpExeImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpExeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOpIVARec(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVARec.
                     */
                    public static class TotOpIVARecImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVARecImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVARecImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOpActivoFijo(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpActivoFijo.
                     */
                    public static class TotOpActivoFijoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpActivoFijoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpActivoFijoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotIVANoRec(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class TotIVANoRecImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotIVANoRecImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName CODIVANOREC$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodIVANoRec");
                      private static final javax.xml.namespace.QName TOTOPIVANOREC$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotOpIVANoRec");
                      private static final javax.xml.namespace.QName TOTMNTIVANOREC$4 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntIVANoRec");
                      
                      
                      /**
                       * Gets the "CodIVANoRec" element
                       */
                      public java.math.BigInteger getCodIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIVANOREC$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getBigIntegerValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "CodIVANoRec" element
                       */
                      public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec xgetCodIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec)get_store().find_element_user(CODIVANOREC$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "CodIVANoRec" element
                       */
                      public void setCodIVANoRec(java.math.BigInteger codIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIVANOREC$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIVANOREC$0);
                          }
                          target.setBigIntegerValue(codIVANoRec);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "CodIVANoRec" element
                       */
                      public void xsetCodIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec codIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec)get_store().find_element_user(CODIVANOREC$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec)get_store().add_element_user(CODIVANOREC$0);
                          }
                          target.set(codIVANoRec);
                        }
                      }
                      
                      /**
                       * Gets the "TotOpIVANoRec" element
                       */
                      public long getTotOpIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVANOREC$2, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotOpIVANoRec" element
                       */
                      public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec xgetTotOpIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec)get_store().find_element_user(TOTOPIVANOREC$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotOpIVANoRec" element
                       */
                      public boolean isSetTotOpIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTOPIVANOREC$2) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotOpIVANoRec" element
                       */
                      public void setTotOpIVANoRec(long totOpIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTOPIVANOREC$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTOPIVANOREC$2);
                          }
                          target.setLongValue(totOpIVANoRec);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotOpIVANoRec" element
                       */
                      public void xsetTotOpIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec totOpIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec)get_store().find_element_user(TOTOPIVANOREC$2, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec)get_store().add_element_user(TOTOPIVANOREC$2);
                          }
                          target.set(totOpIVANoRec);
                        }
                      }
                      
                      /**
                       * Unsets the "TotOpIVANoRec" element
                       */
                      public void unsetTotOpIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTOPIVANOREC$2, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotMntIVANoRec" element
                       */
                      public long getTotMntIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVANOREC$4, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotMntIVANoRec" element
                       */
                      public cl.sii.siiDte.libroCV.MontoType xgetTotMntIVANoRec()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.MontoType target = null;
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTMNTIVANOREC$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "TotMntIVANoRec" element
                       */
                      public void setTotMntIVANoRec(long totMntIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVANOREC$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIVANOREC$4);
                          }
                          target.setLongValue(totMntIVANoRec);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntIVANoRec" element
                       */
                      public void xsetTotMntIVANoRec(cl.sii.siiDte.libroCV.MontoType totMntIVANoRec)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.MontoType target = null;
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTMNTIVANOREC$4, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTMNTIVANOREC$4);
                          }
                          target.set(totMntIVANoRec);
                        }
                      }
                      /**
                       * An XML CodIVANoRec(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotIVANoRec$CodIVANoRec.
                       */
                      public static class CodIVANoRecImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public CodIVANoRecImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected CodIVANoRecImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                      /**
                       * An XML TotOpIVANoRec(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotIVANoRec$TotOpIVANoRec.
                       */
                      public static class TotOpIVANoRecImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public TotOpIVANoRecImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected TotOpIVANoRecImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                    }
                    /**
                     * An XML TotOpIVAUsoComun(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVAUsoComun.
                     */
                    public static class TotOpIVAUsoComunImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVAUsoComunImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVAUsoComunImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML FctProp(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$FctProp.
                     */
                    public static class FctPropImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public FctPropImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected FctPropImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOtrosImp(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class TotOtrosImpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOtrosImpImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName CODIMP$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodImp");
                      private static final javax.xml.namespace.QName TOTMNTIMP$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntImp");
                      private static final javax.xml.namespace.QName FCTIMPADIC$4 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FctImpAdic");
                      private static final javax.xml.namespace.QName TOTCREDIMP$6 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotCredImp");
                      
                      
                      /**
                       * Gets the "CodImp" element
                       */
                      public java.math.BigInteger getCodImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIMP$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getBigIntegerValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "CodImp" element
                       */
                      public cl.sii.siiDte.libroCV.ImptoType xgetCodImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ImptoType target = null;
                          target = (cl.sii.siiDte.libroCV.ImptoType)get_store().find_element_user(CODIMP$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "CodImp" element
                       */
                      public void setCodImp(java.math.BigInteger codImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIMP$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIMP$0);
                          }
                          target.setBigIntegerValue(codImp);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "CodImp" element
                       */
                      public void xsetCodImp(cl.sii.siiDte.libroCV.ImptoType codImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ImptoType target = null;
                          target = (cl.sii.siiDte.libroCV.ImptoType)get_store().find_element_user(CODIMP$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ImptoType)get_store().add_element_user(CODIMP$0);
                          }
                          target.set(codImp);
                        }
                      }
                      
                      /**
                       * Gets the "TotMntImp" element
                       */
                      public long getTotMntImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIMP$2, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotMntImp" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotMntImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIMP$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "TotMntImp" element
                       */
                      public void setTotMntImp(long totMntImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIMP$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIMP$2);
                          }
                          target.setLongValue(totMntImp);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntImp" element
                       */
                      public void xsetTotMntImp(cl.sii.siiDte.libroCV.ValorType totMntImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTMNTIMP$2, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTMNTIMP$2);
                          }
                          target.set(totMntImp);
                        }
                      }
                      
                      /**
                       * Gets the "FctImpAdic" element
                       */
                      public java.math.BigDecimal getFctImpAdic()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCTIMPADIC$4, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getBigDecimalValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "FctImpAdic" element
                       */
                      public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic xgetFctImpAdic()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic)get_store().find_element_user(FCTIMPADIC$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "FctImpAdic" element
                       */
                      public boolean isSetFctImpAdic()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(FCTIMPADIC$4) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "FctImpAdic" element
                       */
                      public void setFctImpAdic(java.math.BigDecimal fctImpAdic)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCTIMPADIC$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCTIMPADIC$4);
                          }
                          target.setBigDecimalValue(fctImpAdic);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "FctImpAdic" element
                       */
                      public void xsetFctImpAdic(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic fctImpAdic)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic target = null;
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic)get_store().find_element_user(FCTIMPADIC$4, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic)get_store().add_element_user(FCTIMPADIC$4);
                          }
                          target.set(fctImpAdic);
                        }
                      }
                      
                      /**
                       * Unsets the "FctImpAdic" element
                       */
                      public void unsetFctImpAdic()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(FCTIMPADIC$4, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotCredImp" element
                       */
                      public long getTotCredImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTCREDIMP$6, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotCredImp" element
                       */
                      public cl.sii.siiDte.libroCV.MontoType xgetTotCredImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.MontoType target = null;
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTCREDIMP$6, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotCredImp" element
                       */
                      public boolean isSetTotCredImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTCREDIMP$6) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotCredImp" element
                       */
                      public void setTotCredImp(long totCredImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTCREDIMP$6, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTCREDIMP$6);
                          }
                          target.setLongValue(totCredImp);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotCredImp" element
                       */
                      public void xsetTotCredImp(cl.sii.siiDte.libroCV.MontoType totCredImp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.MontoType target = null;
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TOTCREDIMP$6, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TOTCREDIMP$6);
                          }
                          target.set(totCredImp);
                        }
                      }
                      
                      /**
                       * Unsets the "TotCredImp" element
                       */
                      public void unsetTotCredImp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTCREDIMP$6, 0);
                        }
                      }
                      /**
                       * An XML FctImpAdic(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOtrosImp$FctImpAdic.
                       */
                      public static class FctImpAdicImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public FctImpAdicImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected FctImpAdicImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                    }
                    /**
                     * An XML TotOpIVARetTotal(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVARetTotal.
                     */
                    public static class TotOpIVARetTotalImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVARetTotalImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVARetTotalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotOpIVARetParcial(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVARetParcial.
                     */
                    public static class TotOpIVARetParcialImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVARetParcialImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVARetParcialImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML TotLiquidaciones(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class TotLiquidacionesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotLiquidacionesImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName TOTVALCOMNETO$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotValComNeto");
                      private static final javax.xml.namespace.QName TOTVALCOMEXE$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotValComExe");
                      private static final javax.xml.namespace.QName TOTVALCOMIVA$4 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotValComIVA");
                      
                      
                      /**
                       * Gets the "TotValComNeto" element
                       */
                      public long getTotValComNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMNETO$0, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotValComNeto" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotValComNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMNETO$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotValComNeto" element
                       */
                      public boolean isSetTotValComNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTVALCOMNETO$0) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotValComNeto" element
                       */
                      public void setTotValComNeto(long totValComNeto)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMNETO$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTVALCOMNETO$0);
                          }
                          target.setLongValue(totValComNeto);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotValComNeto" element
                       */
                      public void xsetTotValComNeto(cl.sii.siiDte.libroCV.ValorType totValComNeto)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMNETO$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTVALCOMNETO$0);
                          }
                          target.set(totValComNeto);
                        }
                      }
                      
                      /**
                       * Unsets the "TotValComNeto" element
                       */
                      public void unsetTotValComNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTVALCOMNETO$0, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotValComExe" element
                       */
                      public long getTotValComExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMEXE$2, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotValComExe" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotValComExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMEXE$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotValComExe" element
                       */
                      public boolean isSetTotValComExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTVALCOMEXE$2) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotValComExe" element
                       */
                      public void setTotValComExe(long totValComExe)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMEXE$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTVALCOMEXE$2);
                          }
                          target.setLongValue(totValComExe);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotValComExe" element
                       */
                      public void xsetTotValComExe(cl.sii.siiDte.libroCV.ValorType totValComExe)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMEXE$2, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTVALCOMEXE$2);
                          }
                          target.set(totValComExe);
                        }
                      }
                      
                      /**
                       * Unsets the "TotValComExe" element
                       */
                      public void unsetTotValComExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTVALCOMEXE$2, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotValComIVA" element
                       */
                      public long getTotValComIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMIVA$4, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotValComIVA" element
                       */
                      public cl.sii.siiDte.libroCV.ValorType xgetTotValComIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMIVA$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotValComIVA" element
                       */
                      public boolean isSetTotValComIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTVALCOMIVA$4) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotValComIVA" element
                       */
                      public void setTotValComIVA(long totValComIVA)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVALCOMIVA$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTVALCOMIVA$4);
                          }
                          target.setLongValue(totValComIVA);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotValComIVA" element
                       */
                      public void xsetTotValComIVA(cl.sii.siiDte.libroCV.ValorType totValComIVA)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroCV.ValorType target = null;
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(TOTVALCOMIVA$4, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(TOTVALCOMIVA$4);
                          }
                          target.set(totValComIVA);
                        }
                      }
                      
                      /**
                       * Unsets the "TotValComIVA" element
                       */
                      public void unsetTotValComIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTVALCOMIVA$4, 0);
                        }
                      }
                    }
                    /**
                     * An XML TotOpIVANoRetenido(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVANoRetenido.
                     */
                    public static class TotOpIVANoRetenidoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotOpIVANoRetenidoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected TotOpIVANoRetenidoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
            public static class DetalleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle
            {
                private static final long serialVersionUID = 1L;
                
                public DetalleImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TPODOC$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDoc");
                private static final javax.xml.namespace.QName EMISOR$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Emisor");
                private static final javax.xml.namespace.QName INDFACTCOMPRA$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IndFactCompra");
                private static final javax.xml.namespace.QName NRODOC$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroDoc");
                private static final javax.xml.namespace.QName ANULADO$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Anulado");
                private static final javax.xml.namespace.QName OPERACION$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Operacion");
                private static final javax.xml.namespace.QName TPOIMP$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoImp");
                private static final javax.xml.namespace.QName TASAIMP$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TasaImp");
                private static final javax.xml.namespace.QName NUMINT$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NumInt");
                private static final javax.xml.namespace.QName INDSERVICIO$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IndServicio");
                private static final javax.xml.namespace.QName INDSINCOSTO$20 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IndSinCosto");
                private static final javax.xml.namespace.QName FCHDOC$22 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchDoc");
                private static final javax.xml.namespace.QName CDGSIISUCUR$24 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CdgSIISucur");
                private static final javax.xml.namespace.QName RUTDOC$26 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTDoc");
                private static final javax.xml.namespace.QName RZNSOC$28 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RznSoc");
                private static final javax.xml.namespace.QName EXTRANJERO$30 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Extranjero");
                private static final javax.xml.namespace.QName TPODOCREF$32 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDocRef");
                private static final javax.xml.namespace.QName FOLIODOCREF$34 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FolioDocRef");
                private static final javax.xml.namespace.QName MNTEXE$36 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntExe");
                private static final javax.xml.namespace.QName MNTNETO$38 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntNeto");
                private static final javax.xml.namespace.QName MNTIVA$40 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntIVA");
                private static final javax.xml.namespace.QName MNTACTIVOFIJO$42 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntActivoFijo");
                private static final javax.xml.namespace.QName MNTIVAACTIVOFIJO$44 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntIVAActivoFijo");
                private static final javax.xml.namespace.QName IVANOREC$46 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVANoRec");
                private static final javax.xml.namespace.QName IVAUSOCOMUN$48 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVAUsoComun");
                private static final javax.xml.namespace.QName IVAFUERAPLAZO$50 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVAFueraPlazo");
                private static final javax.xml.namespace.QName IVAPROPIO$52 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVAPropio");
                private static final javax.xml.namespace.QName IVATERCEROS$54 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVATerceros");
                private static final javax.xml.namespace.QName LEY18211$56 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Ley18211");
                private static final javax.xml.namespace.QName OTROSIMP$58 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "OtrosImp");
                private static final javax.xml.namespace.QName MNTSINCRED$60 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntSinCred");
                private static final javax.xml.namespace.QName IVARETTOTAL$62 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVARetTotal");
                private static final javax.xml.namespace.QName IVARETPARCIAL$64 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVARetParcial");
                private static final javax.xml.namespace.QName CREDEC$66 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CredEC");
                private static final javax.xml.namespace.QName DEPENVASE$68 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DepEnvase");
                private static final javax.xml.namespace.QName LIQUIDACIONES$70 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Liquidaciones");
                private static final javax.xml.namespace.QName MNTTOTAL$72 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntTotal");
                private static final javax.xml.namespace.QName IVANORETENIDO$74 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IVANoRetenido");
                private static final javax.xml.namespace.QName MNTNOFACT$76 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntNoFact");
                private static final javax.xml.namespace.QName MNTPERIODO$78 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntPeriodo");
                private static final javax.xml.namespace.QName PSJNAC$80 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PsjNac");
                private static final javax.xml.namespace.QName PSJINT$82 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PsjInt");
                private static final javax.xml.namespace.QName TABPUROS$84 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TabPuros");
                private static final javax.xml.namespace.QName TABCIGARRILLOS$86 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TabCigarrillos");
                private static final javax.xml.namespace.QName TABELABORADO$88 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TabElaborado");
                private static final javax.xml.namespace.QName IMPVEHICULO$90 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ImpVehiculo");
                
                
                /**
                 * Gets the "TpoDoc" element
                 */
                public java.math.BigInteger getTpoDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOC$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TpoDoc" element
                 */
                public cl.sii.siiDte.libroCV.DoctoType xgetTpoDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.DoctoType target = null;
                      target = (cl.sii.siiDte.libroCV.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TpoDoc" element
                 */
                public void setTpoDoc(java.math.BigInteger tpoDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOC$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPODOC$0);
                      }
                      target.setBigIntegerValue(tpoDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "TpoDoc" element
                 */
                public void xsetTpoDoc(cl.sii.siiDte.libroCV.DoctoType tpoDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.DoctoType target = null;
                      target = (cl.sii.siiDte.libroCV.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.DoctoType)get_store().add_element_user(TPODOC$0);
                      }
                      target.set(tpoDoc);
                    }
                }
                
                /**
                 * Gets the "Emisor" element
                 */
                public int getEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMISOR$2, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Emisor" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor xgetEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor)get_store().find_element_user(EMISOR$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Emisor" element
                 */
                public boolean isSetEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EMISOR$2) != 0;
                    }
                }
                
                /**
                 * Sets the "Emisor" element
                 */
                public void setEmisor(int emisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMISOR$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMISOR$2);
                      }
                      target.setIntValue(emisor);
                    }
                }
                
                /**
                 * Sets (as xml) the "Emisor" element
                 */
                public void xsetEmisor(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor emisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor)get_store().find_element_user(EMISOR$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor)get_store().add_element_user(EMISOR$2);
                      }
                      target.set(emisor);
                    }
                }
                
                /**
                 * Unsets the "Emisor" element
                 */
                public void unsetEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EMISOR$2, 0);
                    }
                }
                
                /**
                 * Gets the "IndFactCompra" element
                 */
                public int getIndFactCompra()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDFACTCOMPRA$4, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IndFactCompra" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra xgetIndFactCompra()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra)get_store().find_element_user(INDFACTCOMPRA$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IndFactCompra" element
                 */
                public boolean isSetIndFactCompra()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDFACTCOMPRA$4) != 0;
                    }
                }
                
                /**
                 * Sets the "IndFactCompra" element
                 */
                public void setIndFactCompra(int indFactCompra)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDFACTCOMPRA$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDFACTCOMPRA$4);
                      }
                      target.setIntValue(indFactCompra);
                    }
                }
                
                /**
                 * Sets (as xml) the "IndFactCompra" element
                 */
                public void xsetIndFactCompra(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra indFactCompra)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra)get_store().find_element_user(INDFACTCOMPRA$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra)get_store().add_element_user(INDFACTCOMPRA$4);
                      }
                      target.set(indFactCompra);
                    }
                }
                
                /**
                 * Unsets the "IndFactCompra" element
                 */
                public void unsetIndFactCompra()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDFACTCOMPRA$4, 0);
                    }
                }
                
                /**
                 * Gets the "NroDoc" element
                 */
                public long getNroDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRODOC$6, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NroDoc" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc xgetNroDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc)get_store().find_element_user(NRODOC$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "NroDoc" element
                 */
                public void setNroDoc(long nroDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRODOC$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRODOC$6);
                      }
                      target.setLongValue(nroDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroDoc" element
                 */
                public void xsetNroDoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc nroDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc)get_store().find_element_user(NRODOC$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc)get_store().add_element_user(NRODOC$6);
                      }
                      target.set(nroDoc);
                    }
                }
                
                /**
                 * Gets the "Anulado" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado.Enum getAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANULADO$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Anulado" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado xgetAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado)get_store().find_element_user(ANULADO$8, 0);
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
                      return get_store().count_elements(ANULADO$8) != 0;
                    }
                }
                
                /**
                 * Sets the "Anulado" element
                 */
                public void setAnulado(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado.Enum anulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANULADO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANULADO$8);
                      }
                      target.setEnumValue(anulado);
                    }
                }
                
                /**
                 * Sets (as xml) the "Anulado" element
                 */
                public void xsetAnulado(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado anulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado)get_store().find_element_user(ANULADO$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado)get_store().add_element_user(ANULADO$8);
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
                      get_store().remove_element(ANULADO$8, 0);
                    }
                }
                
                /**
                 * Gets the "Operacion" element
                 */
                public java.math.BigInteger getOperacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERACION$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Operacion" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion xgetOperacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion)get_store().find_element_user(OPERACION$10, 0);
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
                      return get_store().count_elements(OPERACION$10) != 0;
                    }
                }
                
                /**
                 * Sets the "Operacion" element
                 */
                public void setOperacion(java.math.BigInteger operacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERACION$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERACION$10);
                      }
                      target.setBigIntegerValue(operacion);
                    }
                }
                
                /**
                 * Sets (as xml) the "Operacion" element
                 */
                public void xsetOperacion(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion operacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion)get_store().find_element_user(OPERACION$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion)get_store().add_element_user(OPERACION$10);
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
                      get_store().remove_element(OPERACION$10, 0);
                    }
                }
                
                /**
                 * Gets the "TpoImp" element
                 */
                public int getTpoImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOIMP$12, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TpoImp" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp xgetTpoImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp)get_store().find_element_user(TPOIMP$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TpoImp" element
                 */
                public boolean isSetTpoImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TPOIMP$12) != 0;
                    }
                }
                
                /**
                 * Sets the "TpoImp" element
                 */
                public void setTpoImp(int tpoImp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOIMP$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOIMP$12);
                      }
                      target.setIntValue(tpoImp);
                    }
                }
                
                /**
                 * Sets (as xml) the "TpoImp" element
                 */
                public void xsetTpoImp(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp tpoImp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp)get_store().find_element_user(TPOIMP$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp)get_store().add_element_user(TPOIMP$12);
                      }
                      target.set(tpoImp);
                    }
                }
                
                /**
                 * Unsets the "TpoImp" element
                 */
                public void unsetTpoImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TPOIMP$12, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIMP$14, 0);
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
                public cl.sii.siiDte.libroCV.PctType xgetTasaImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.PctType target = null;
                      target = (cl.sii.siiDte.libroCV.PctType)get_store().find_element_user(TASAIMP$14, 0);
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
                      return get_store().count_elements(TASAIMP$14) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIMP$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASAIMP$14);
                      }
                      target.setBigDecimalValue(tasaImp);
                    }
                }
                
                /**
                 * Sets (as xml) the "TasaImp" element
                 */
                public void xsetTasaImp(cl.sii.siiDte.libroCV.PctType tasaImp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.PctType target = null;
                      target = (cl.sii.siiDte.libroCV.PctType)get_store().find_element_user(TASAIMP$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.PctType)get_store().add_element_user(TASAIMP$14);
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
                      get_store().remove_element(TASAIMP$14, 0);
                    }
                }
                
                /**
                 * Gets the "NumInt" element
                 */
                public java.lang.String getNumInt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMINT$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NumInt" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt xgetNumInt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt)get_store().find_element_user(NUMINT$16, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "NumInt" element
                 */
                public boolean isSetNumInt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NUMINT$16) != 0;
                    }
                }
                
                /**
                 * Sets the "NumInt" element
                 */
                public void setNumInt(java.lang.String numInt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMINT$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMINT$16);
                      }
                      target.setStringValue(numInt);
                    }
                }
                
                /**
                 * Sets (as xml) the "NumInt" element
                 */
                public void xsetNumInt(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt numInt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt)get_store().find_element_user(NUMINT$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt)get_store().add_element_user(NUMINT$16);
                      }
                      target.set(numInt);
                    }
                }
                
                /**
                 * Unsets the "NumInt" element
                 */
                public void unsetNumInt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NUMINT$16, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDSERVICIO$18, 0);
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
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio xgetIndServicio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio)get_store().find_element_user(INDSERVICIO$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IndServicio" element
                 */
                public boolean isSetIndServicio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDSERVICIO$18) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDSERVICIO$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDSERVICIO$18);
                      }
                      target.setBigIntegerValue(indServicio);
                    }
                }
                
                /**
                 * Sets (as xml) the "IndServicio" element
                 */
                public void xsetIndServicio(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio indServicio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio)get_store().find_element_user(INDSERVICIO$18, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio)get_store().add_element_user(INDSERVICIO$18);
                      }
                      target.set(indServicio);
                    }
                }
                
                /**
                 * Unsets the "IndServicio" element
                 */
                public void unsetIndServicio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDSERVICIO$18, 0);
                    }
                }
                
                /**
                 * Gets the "IndSinCosto" element
                 */
                public java.math.BigInteger getIndSinCosto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDSINCOSTO$20, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IndSinCosto" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto xgetIndSinCosto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto)get_store().find_element_user(INDSINCOSTO$20, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IndSinCosto" element
                 */
                public boolean isSetIndSinCosto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDSINCOSTO$20) != 0;
                    }
                }
                
                /**
                 * Sets the "IndSinCosto" element
                 */
                public void setIndSinCosto(java.math.BigInteger indSinCosto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDSINCOSTO$20, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDSINCOSTO$20);
                      }
                      target.setBigIntegerValue(indSinCosto);
                    }
                }
                
                /**
                 * Sets (as xml) the "IndSinCosto" element
                 */
                public void xsetIndSinCosto(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto indSinCosto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto)get_store().find_element_user(INDSINCOSTO$20, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto)get_store().add_element_user(INDSINCOSTO$20);
                      }
                      target.set(indSinCosto);
                    }
                }
                
                /**
                 * Unsets the "IndSinCosto" element
                 */
                public void unsetIndSinCosto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDSINCOSTO$20, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHDOC$22, 0);
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
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc xgetFchDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc)get_store().find_element_user(FCHDOC$22, 0);
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
                      return get_store().count_elements(FCHDOC$22) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHDOC$22, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHDOC$22);
                      }
                      target.setCalendarValue(fchDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchDoc" element
                 */
                public void xsetFchDoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc fchDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc)get_store().find_element_user(FCHDOC$22, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc)get_store().add_element_user(FCHDOC$22);
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
                      get_store().remove_element(FCHDOC$22, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDGSIISUCUR$24, 0);
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
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur xgetCdgSIISucur()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur)get_store().find_element_user(CDGSIISUCUR$24, 0);
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
                      return get_store().count_elements(CDGSIISUCUR$24) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDGSIISUCUR$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDGSIISUCUR$24);
                      }
                      target.setIntValue(cdgSIISucur);
                    }
                }
                
                /**
                 * Sets (as xml) the "CdgSIISucur" element
                 */
                public void xsetCdgSIISucur(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur cdgSIISucur)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur)get_store().find_element_user(CDGSIISUCUR$24, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur)get_store().add_element_user(CDGSIISUCUR$24);
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
                      get_store().remove_element(CDGSIISUCUR$24, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTDOC$26, 0);
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
                public cl.sii.siiDte.libroCV.RUTType xgetRUTDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.RUTType target = null;
                      target = (cl.sii.siiDte.libroCV.RUTType)get_store().find_element_user(RUTDOC$26, 0);
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
                      return get_store().count_elements(RUTDOC$26) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTDOC$26, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTDOC$26);
                      }
                      target.setStringValue(rutDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "RUTDoc" element
                 */
                public void xsetRUTDoc(cl.sii.siiDte.libroCV.RUTType rutDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.RUTType target = null;
                      target = (cl.sii.siiDte.libroCV.RUTType)get_store().find_element_user(RUTDOC$26, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.RUTType)get_store().add_element_user(RUTDOC$26);
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
                      get_store().remove_element(RUTDOC$26, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RZNSOC$28, 0);
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
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc xgetRznSoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc)get_store().find_element_user(RZNSOC$28, 0);
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
                      return get_store().count_elements(RZNSOC$28) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RZNSOC$28, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RZNSOC$28);
                      }
                      target.setStringValue(rznSoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "RznSoc" element
                 */
                public void xsetRznSoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc rznSoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc)get_store().find_element_user(RZNSOC$28, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc)get_store().add_element_user(RZNSOC$28);
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
                      get_store().remove_element(RZNSOC$28, 0);
                    }
                }
                
                /**
                 * Gets the "Extranjero" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero getExtranjero()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero)get_store().find_element_user(EXTRANJERO$30, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "Extranjero" element
                 */
                public boolean isSetExtranjero()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EXTRANJERO$30) != 0;
                    }
                }
                
                /**
                 * Sets the "Extranjero" element
                 */
                public void setExtranjero(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero extranjero)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero)get_store().find_element_user(EXTRANJERO$30, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero)get_store().add_element_user(EXTRANJERO$30);
                      }
                      target.set(extranjero);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Extranjero" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero addNewExtranjero()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero)get_store().add_element_user(EXTRANJERO$30);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "Extranjero" element
                 */
                public void unsetExtranjero()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EXTRANJERO$30, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOCREF$32, 0);
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
                public cl.sii.siiDte.libroCV.DoctoType xgetTpoDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.DoctoType target = null;
                      target = (cl.sii.siiDte.libroCV.DoctoType)get_store().find_element_user(TPODOCREF$32, 0);
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
                      return get_store().count_elements(TPODOCREF$32) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODOCREF$32, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPODOCREF$32);
                      }
                      target.setBigIntegerValue(tpoDocRef);
                    }
                }
                
                /**
                 * Sets (as xml) the "TpoDocRef" element
                 */
                public void xsetTpoDocRef(cl.sii.siiDte.libroCV.DoctoType tpoDocRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.DoctoType target = null;
                      target = (cl.sii.siiDte.libroCV.DoctoType)get_store().find_element_user(TPODOCREF$32, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.DoctoType)get_store().add_element_user(TPODOCREF$32);
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
                      get_store().remove_element(TPODOCREF$32, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIODOCREF$34, 0);
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
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef xgetFolioDocRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef)get_store().find_element_user(FOLIODOCREF$34, 0);
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
                      return get_store().count_elements(FOLIODOCREF$34) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIODOCREF$34, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIODOCREF$34);
                      }
                      target.setLongValue(folioDocRef);
                    }
                }
                
                /**
                 * Sets (as xml) the "FolioDocRef" element
                 */
                public void xsetFolioDocRef(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef folioDocRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef)get_store().find_element_user(FOLIODOCREF$34, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef)get_store().add_element_user(FOLIODOCREF$34);
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
                      get_store().remove_element(FOLIODOCREF$34, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTEXE$36, 0);
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
                public cl.sii.siiDte.libroCV.ValorType xgetMntExe()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTEXE$36, 0);
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
                      return get_store().count_elements(MNTEXE$36) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTEXE$36, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTEXE$36);
                      }
                      target.setLongValue(mntExe);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntExe" element
                 */
                public void xsetMntExe(cl.sii.siiDte.libroCV.ValorType mntExe)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTEXE$36, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(MNTEXE$36);
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
                      get_store().remove_element(MNTEXE$36, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNETO$38, 0);
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
                public cl.sii.siiDte.libroCV.ValorType xgetMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTNETO$38, 0);
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
                      return get_store().count_elements(MNTNETO$38) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNETO$38, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTNETO$38);
                      }
                      target.setLongValue(mntNeto);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntNeto" element
                 */
                public void xsetMntNeto(cl.sii.siiDte.libroCV.ValorType mntNeto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTNETO$38, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(MNTNETO$38);
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
                      get_store().remove_element(MNTNETO$38, 0);
                    }
                }
                
                /**
                 * Gets the "MntIVA" element
                 */
                public long getMntIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIVA$40, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntIVA" element
                 */
                public cl.sii.siiDte.libroCV.ValorType xgetMntIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTIVA$40, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntIVA" element
                 */
                public boolean isSetMntIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTIVA$40) != 0;
                    }
                }
                
                /**
                 * Sets the "MntIVA" element
                 */
                public void setMntIVA(long mntIVA)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIVA$40, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTIVA$40);
                      }
                      target.setLongValue(mntIVA);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntIVA" element
                 */
                public void xsetMntIVA(cl.sii.siiDte.libroCV.ValorType mntIVA)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTIVA$40, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(MNTIVA$40);
                      }
                      target.set(mntIVA);
                    }
                }
                
                /**
                 * Unsets the "MntIVA" element
                 */
                public void unsetMntIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTIVA$40, 0);
                    }
                }
                
                /**
                 * Gets the "MntActivoFijo" element
                 */
                public long getMntActivoFijo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTACTIVOFIJO$42, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntActivoFijo" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetMntActivoFijo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(MNTACTIVOFIJO$42, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntActivoFijo" element
                 */
                public boolean isSetMntActivoFijo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTACTIVOFIJO$42) != 0;
                    }
                }
                
                /**
                 * Sets the "MntActivoFijo" element
                 */
                public void setMntActivoFijo(long mntActivoFijo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTACTIVOFIJO$42, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTACTIVOFIJO$42);
                      }
                      target.setLongValue(mntActivoFijo);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntActivoFijo" element
                 */
                public void xsetMntActivoFijo(cl.sii.siiDte.libroCV.MontoType mntActivoFijo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(MNTACTIVOFIJO$42, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(MNTACTIVOFIJO$42);
                      }
                      target.set(mntActivoFijo);
                    }
                }
                
                /**
                 * Unsets the "MntActivoFijo" element
                 */
                public void unsetMntActivoFijo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTACTIVOFIJO$42, 0);
                    }
                }
                
                /**
                 * Gets the "MntIVAActivoFijo" element
                 */
                public long getMntIVAActivoFijo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIVAACTIVOFIJO$44, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntIVAActivoFijo" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetMntIVAActivoFijo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(MNTIVAACTIVOFIJO$44, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntIVAActivoFijo" element
                 */
                public boolean isSetMntIVAActivoFijo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTIVAACTIVOFIJO$44) != 0;
                    }
                }
                
                /**
                 * Sets the "MntIVAActivoFijo" element
                 */
                public void setMntIVAActivoFijo(long mntIVAActivoFijo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIVAACTIVOFIJO$44, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTIVAACTIVOFIJO$44);
                      }
                      target.setLongValue(mntIVAActivoFijo);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntIVAActivoFijo" element
                 */
                public void xsetMntIVAActivoFijo(cl.sii.siiDte.libroCV.MontoType mntIVAActivoFijo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(MNTIVAACTIVOFIJO$44, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(MNTIVAACTIVOFIJO$44);
                      }
                      target.set(mntIVAActivoFijo);
                    }
                }
                
                /**
                 * Unsets the "MntIVAActivoFijo" element
                 */
                public void unsetMntIVAActivoFijo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTIVAACTIVOFIJO$44, 0);
                    }
                }
                
                /**
                 * Gets array of all "IVANoRec" elements
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec[] getIVANoRecArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(IVANOREC$46, targetList);
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "IVANoRec" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec getIVANoRecArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec)get_store().find_element_user(IVANOREC$46, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "IVANoRec" element
                 */
                public int sizeOfIVANoRecArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVANOREC$46);
                    }
                }
                
                /**
                 * Sets array of all "IVANoRec" element
                 */
                public void setIVANoRecArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec[] ivaNoRecArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(ivaNoRecArray, IVANOREC$46);
                    }
                }
                
                /**
                 * Sets ith "IVANoRec" element
                 */
                public void setIVANoRecArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec ivaNoRec)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec)get_store().find_element_user(IVANOREC$46, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(ivaNoRec);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IVANoRec" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec insertNewIVANoRec(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec)get_store().insert_element_user(IVANOREC$46, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IVANoRec" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec addNewIVANoRec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec)get_store().add_element_user(IVANOREC$46);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "IVANoRec" element
                 */
                public void removeIVANoRec(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVANOREC$46, i);
                    }
                }
                
                /**
                 * Gets the "IVAUsoComun" element
                 */
                public long getIVAUsoComun()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVAUSOCOMUN$48, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IVAUsoComun" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetIVAUsoComun()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVAUSOCOMUN$48, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IVAUsoComun" element
                 */
                public boolean isSetIVAUsoComun()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVAUSOCOMUN$48) != 0;
                    }
                }
                
                /**
                 * Sets the "IVAUsoComun" element
                 */
                public void setIVAUsoComun(long ivaUsoComun)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVAUSOCOMUN$48, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVAUSOCOMUN$48);
                      }
                      target.setLongValue(ivaUsoComun);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVAUsoComun" element
                 */
                public void xsetIVAUsoComun(cl.sii.siiDte.libroCV.MontoType ivaUsoComun)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVAUSOCOMUN$48, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(IVAUSOCOMUN$48);
                      }
                      target.set(ivaUsoComun);
                    }
                }
                
                /**
                 * Unsets the "IVAUsoComun" element
                 */
                public void unsetIVAUsoComun()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVAUSOCOMUN$48, 0);
                    }
                }
                
                /**
                 * Gets the "IVAFueraPlazo" element
                 */
                public long getIVAFueraPlazo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVAFUERAPLAZO$50, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IVAFueraPlazo" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetIVAFueraPlazo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVAFUERAPLAZO$50, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IVAFueraPlazo" element
                 */
                public boolean isSetIVAFueraPlazo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVAFUERAPLAZO$50) != 0;
                    }
                }
                
                /**
                 * Sets the "IVAFueraPlazo" element
                 */
                public void setIVAFueraPlazo(long ivaFueraPlazo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVAFUERAPLAZO$50, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVAFUERAPLAZO$50);
                      }
                      target.setLongValue(ivaFueraPlazo);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVAFueraPlazo" element
                 */
                public void xsetIVAFueraPlazo(cl.sii.siiDte.libroCV.MontoType ivaFueraPlazo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVAFUERAPLAZO$50, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(IVAFUERAPLAZO$50);
                      }
                      target.set(ivaFueraPlazo);
                    }
                }
                
                /**
                 * Unsets the "IVAFueraPlazo" element
                 */
                public void unsetIVAFueraPlazo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVAFUERAPLAZO$50, 0);
                    }
                }
                
                /**
                 * Gets the "IVAPropio" element
                 */
                public long getIVAPropio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVAPROPIO$52, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IVAPropio" element
                 */
                public cl.sii.siiDte.libroCV.ValorType xgetIVAPropio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(IVAPROPIO$52, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IVAPropio" element
                 */
                public boolean isSetIVAPropio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVAPROPIO$52) != 0;
                    }
                }
                
                /**
                 * Sets the "IVAPropio" element
                 */
                public void setIVAPropio(long ivaPropio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVAPROPIO$52, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVAPROPIO$52);
                      }
                      target.setLongValue(ivaPropio);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVAPropio" element
                 */
                public void xsetIVAPropio(cl.sii.siiDte.libroCV.ValorType ivaPropio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(IVAPROPIO$52, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(IVAPROPIO$52);
                      }
                      target.set(ivaPropio);
                    }
                }
                
                /**
                 * Unsets the "IVAPropio" element
                 */
                public void unsetIVAPropio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVAPROPIO$52, 0);
                    }
                }
                
                /**
                 * Gets the "IVATerceros" element
                 */
                public long getIVATerceros()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVATERCEROS$54, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IVATerceros" element
                 */
                public cl.sii.siiDte.libroCV.ValorType xgetIVATerceros()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(IVATERCEROS$54, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IVATerceros" element
                 */
                public boolean isSetIVATerceros()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVATERCEROS$54) != 0;
                    }
                }
                
                /**
                 * Sets the "IVATerceros" element
                 */
                public void setIVATerceros(long ivaTerceros)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVATERCEROS$54, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVATERCEROS$54);
                      }
                      target.setLongValue(ivaTerceros);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVATerceros" element
                 */
                public void xsetIVATerceros(cl.sii.siiDte.libroCV.ValorType ivaTerceros)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(IVATERCEROS$54, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(IVATERCEROS$54);
                      }
                      target.set(ivaTerceros);
                    }
                }
                
                /**
                 * Unsets the "IVATerceros" element
                 */
                public void unsetIVATerceros()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVATERCEROS$54, 0);
                    }
                }
                
                /**
                 * Gets the "Ley18211" element
                 */
                public long getLey18211()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEY18211$56, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Ley18211" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetLey18211()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(LEY18211$56, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Ley18211" element
                 */
                public boolean isSetLey18211()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(LEY18211$56) != 0;
                    }
                }
                
                /**
                 * Sets the "Ley18211" element
                 */
                public void setLey18211(long ley18211)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEY18211$56, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEY18211$56);
                      }
                      target.setLongValue(ley18211);
                    }
                }
                
                /**
                 * Sets (as xml) the "Ley18211" element
                 */
                public void xsetLey18211(cl.sii.siiDte.libroCV.MontoType ley18211)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(LEY18211$56, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(LEY18211$56);
                      }
                      target.set(ley18211);
                    }
                }
                
                /**
                 * Unsets the "Ley18211" element
                 */
                public void unsetLey18211()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(LEY18211$56, 0);
                    }
                }
                
                /**
                 * Gets array of all "OtrosImp" elements
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp[] getOtrosImpArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(OTROSIMP$58, targetList);
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp[] result = new cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "OtrosImp" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp getOtrosImpArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp)get_store().find_element_user(OTROSIMP$58, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "OtrosImp" element
                 */
                public int sizeOfOtrosImpArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(OTROSIMP$58);
                    }
                }
                
                /**
                 * Sets array of all "OtrosImp" element
                 */
                public void setOtrosImpArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp[] otrosImpArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(otrosImpArray, OTROSIMP$58);
                    }
                }
                
                /**
                 * Sets ith "OtrosImp" element
                 */
                public void setOtrosImpArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp otrosImp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp)get_store().find_element_user(OTROSIMP$58, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(otrosImp);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "OtrosImp" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp insertNewOtrosImp(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp)get_store().insert_element_user(OTROSIMP$58, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "OtrosImp" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp addNewOtrosImp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp)get_store().add_element_user(OTROSIMP$58);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "OtrosImp" element
                 */
                public void removeOtrosImp(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(OTROSIMP$58, i);
                    }
                }
                
                /**
                 * Gets the "MntSinCred" element
                 */
                public long getMntSinCred()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTSINCRED$60, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntSinCred" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetMntSinCred()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(MNTSINCRED$60, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntSinCred" element
                 */
                public boolean isSetMntSinCred()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTSINCRED$60) != 0;
                    }
                }
                
                /**
                 * Sets the "MntSinCred" element
                 */
                public void setMntSinCred(long mntSinCred)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTSINCRED$60, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTSINCRED$60);
                      }
                      target.setLongValue(mntSinCred);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntSinCred" element
                 */
                public void xsetMntSinCred(cl.sii.siiDte.libroCV.MontoType mntSinCred)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(MNTSINCRED$60, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(MNTSINCRED$60);
                      }
                      target.set(mntSinCred);
                    }
                }
                
                /**
                 * Unsets the "MntSinCred" element
                 */
                public void unsetMntSinCred()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTSINCRED$60, 0);
                    }
                }
                
                /**
                 * Gets the "IVARetTotal" element
                 */
                public long getIVARetTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVARETTOTAL$62, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IVARetTotal" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetIVARetTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVARETTOTAL$62, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IVARetTotal" element
                 */
                public boolean isSetIVARetTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVARETTOTAL$62) != 0;
                    }
                }
                
                /**
                 * Sets the "IVARetTotal" element
                 */
                public void setIVARetTotal(long ivaRetTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVARETTOTAL$62, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVARETTOTAL$62);
                      }
                      target.setLongValue(ivaRetTotal);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVARetTotal" element
                 */
                public void xsetIVARetTotal(cl.sii.siiDte.libroCV.MontoType ivaRetTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVARETTOTAL$62, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(IVARETTOTAL$62);
                      }
                      target.set(ivaRetTotal);
                    }
                }
                
                /**
                 * Unsets the "IVARetTotal" element
                 */
                public void unsetIVARetTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVARETTOTAL$62, 0);
                    }
                }
                
                /**
                 * Gets the "IVARetParcial" element
                 */
                public long getIVARetParcial()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVARETPARCIAL$64, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IVARetParcial" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetIVARetParcial()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVARETPARCIAL$64, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IVARetParcial" element
                 */
                public boolean isSetIVARetParcial()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVARETPARCIAL$64) != 0;
                    }
                }
                
                /**
                 * Sets the "IVARetParcial" element
                 */
                public void setIVARetParcial(long ivaRetParcial)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVARETPARCIAL$64, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVARETPARCIAL$64);
                      }
                      target.setLongValue(ivaRetParcial);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVARetParcial" element
                 */
                public void xsetIVARetParcial(cl.sii.siiDte.libroCV.MontoType ivaRetParcial)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVARETPARCIAL$64, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(IVARETPARCIAL$64);
                      }
                      target.set(ivaRetParcial);
                    }
                }
                
                /**
                 * Unsets the "IVARetParcial" element
                 */
                public void unsetIVARetParcial()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVARETPARCIAL$64, 0);
                    }
                }
                
                /**
                 * Gets the "CredEC" element
                 */
                public long getCredEC()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDEC$66, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CredEC" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetCredEC()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(CREDEC$66, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CredEC" element
                 */
                public boolean isSetCredEC()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CREDEC$66) != 0;
                    }
                }
                
                /**
                 * Sets the "CredEC" element
                 */
                public void setCredEC(long credEC)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDEC$66, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDEC$66);
                      }
                      target.setLongValue(credEC);
                    }
                }
                
                /**
                 * Sets (as xml) the "CredEC" element
                 */
                public void xsetCredEC(cl.sii.siiDte.libroCV.MontoType credEC)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(CREDEC$66, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(CREDEC$66);
                      }
                      target.set(credEC);
                    }
                }
                
                /**
                 * Unsets the "CredEC" element
                 */
                public void unsetCredEC()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CREDEC$66, 0);
                    }
                }
                
                /**
                 * Gets the "DepEnvase" element
                 */
                public long getDepEnvase()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENVASE$68, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DepEnvase" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetDepEnvase()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(DEPENVASE$68, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "DepEnvase" element
                 */
                public boolean isSetDepEnvase()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DEPENVASE$68) != 0;
                    }
                }
                
                /**
                 * Sets the "DepEnvase" element
                 */
                public void setDepEnvase(long depEnvase)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENVASE$68, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPENVASE$68);
                      }
                      target.setLongValue(depEnvase);
                    }
                }
                
                /**
                 * Sets (as xml) the "DepEnvase" element
                 */
                public void xsetDepEnvase(cl.sii.siiDte.libroCV.MontoType depEnvase)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(DEPENVASE$68, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(DEPENVASE$68);
                      }
                      target.set(depEnvase);
                    }
                }
                
                /**
                 * Unsets the "DepEnvase" element
                 */
                public void unsetDepEnvase()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DEPENVASE$68, 0);
                    }
                }
                
                /**
                 * Gets the "Liquidaciones" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones getLiquidaciones()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones)get_store().find_element_user(LIQUIDACIONES$70, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "Liquidaciones" element
                 */
                public boolean isSetLiquidaciones()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(LIQUIDACIONES$70) != 0;
                    }
                }
                
                /**
                 * Sets the "Liquidaciones" element
                 */
                public void setLiquidaciones(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones liquidaciones)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones)get_store().find_element_user(LIQUIDACIONES$70, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones)get_store().add_element_user(LIQUIDACIONES$70);
                      }
                      target.set(liquidaciones);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Liquidaciones" element
                 */
                public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones addNewLiquidaciones()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones target = null;
                      target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones)get_store().add_element_user(LIQUIDACIONES$70);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "Liquidaciones" element
                 */
                public void unsetLiquidaciones()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(LIQUIDACIONES$70, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$72, 0);
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
                public cl.sii.siiDte.libroCV.ValorType xgetMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTTOTAL$72, 0);
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
                      return get_store().count_elements(MNTTOTAL$72) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$72, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTTOTAL$72);
                      }
                      target.setLongValue(mntTotal);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntTotal" element
                 */
                public void xsetMntTotal(cl.sii.siiDte.libroCV.ValorType mntTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTTOTAL$72, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(MNTTOTAL$72);
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
                      get_store().remove_element(MNTTOTAL$72, 0);
                    }
                }
                
                /**
                 * Gets the "IVANoRetenido" element
                 */
                public long getIVANoRetenido()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVANORETENIDO$74, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IVANoRetenido" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetIVANoRetenido()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVANORETENIDO$74, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "IVANoRetenido" element
                 */
                public boolean isSetIVANoRetenido()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IVANORETENIDO$74) != 0;
                    }
                }
                
                /**
                 * Sets the "IVANoRetenido" element
                 */
                public void setIVANoRetenido(long ivaNoRetenido)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVANORETENIDO$74, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVANORETENIDO$74);
                      }
                      target.setLongValue(ivaNoRetenido);
                    }
                }
                
                /**
                 * Sets (as xml) the "IVANoRetenido" element
                 */
                public void xsetIVANoRetenido(cl.sii.siiDte.libroCV.MontoType ivaNoRetenido)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IVANORETENIDO$74, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(IVANORETENIDO$74);
                      }
                      target.set(ivaNoRetenido);
                    }
                }
                
                /**
                 * Unsets the "IVANoRetenido" element
                 */
                public void unsetIVANoRetenido()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IVANORETENIDO$74, 0);
                    }
                }
                
                /**
                 * Gets the "MntNoFact" element
                 */
                public long getMntNoFact()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNOFACT$76, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntNoFact" element
                 */
                public cl.sii.siiDte.libroCV.ValorType xgetMntNoFact()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTNOFACT$76, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntNoFact" element
                 */
                public boolean isSetMntNoFact()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTNOFACT$76) != 0;
                    }
                }
                
                /**
                 * Sets the "MntNoFact" element
                 */
                public void setMntNoFact(long mntNoFact)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNOFACT$76, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTNOFACT$76);
                      }
                      target.setLongValue(mntNoFact);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntNoFact" element
                 */
                public void xsetMntNoFact(cl.sii.siiDte.libroCV.ValorType mntNoFact)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTNOFACT$76, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(MNTNOFACT$76);
                      }
                      target.set(mntNoFact);
                    }
                }
                
                /**
                 * Unsets the "MntNoFact" element
                 */
                public void unsetMntNoFact()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTNOFACT$76, 0);
                    }
                }
                
                /**
                 * Gets the "MntPeriodo" element
                 */
                public long getMntPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTPERIODO$78, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntPeriodo" element
                 */
                public cl.sii.siiDte.libroCV.ValorType xgetMntPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTPERIODO$78, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntPeriodo" element
                 */
                public boolean isSetMntPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTPERIODO$78) != 0;
                    }
                }
                
                /**
                 * Sets the "MntPeriodo" element
                 */
                public void setMntPeriodo(long mntPeriodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTPERIODO$78, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTPERIODO$78);
                      }
                      target.setLongValue(mntPeriodo);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntPeriodo" element
                 */
                public void xsetMntPeriodo(cl.sii.siiDte.libroCV.ValorType mntPeriodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.ValorType target = null;
                      target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTPERIODO$78, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(MNTPERIODO$78);
                      }
                      target.set(mntPeriodo);
                    }
                }
                
                /**
                 * Unsets the "MntPeriodo" element
                 */
                public void unsetMntPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTPERIODO$78, 0);
                    }
                }
                
                /**
                 * Gets the "PsjNac" element
                 */
                public long getPsjNac()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSJNAC$80, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PsjNac" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetPsjNac()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(PSJNAC$80, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "PsjNac" element
                 */
                public boolean isSetPsjNac()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PSJNAC$80) != 0;
                    }
                }
                
                /**
                 * Sets the "PsjNac" element
                 */
                public void setPsjNac(long psjNac)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSJNAC$80, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PSJNAC$80);
                      }
                      target.setLongValue(psjNac);
                    }
                }
                
                /**
                 * Sets (as xml) the "PsjNac" element
                 */
                public void xsetPsjNac(cl.sii.siiDte.libroCV.MontoType psjNac)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(PSJNAC$80, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(PSJNAC$80);
                      }
                      target.set(psjNac);
                    }
                }
                
                /**
                 * Unsets the "PsjNac" element
                 */
                public void unsetPsjNac()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PSJNAC$80, 0);
                    }
                }
                
                /**
                 * Gets the "PsjInt" element
                 */
                public long getPsjInt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSJINT$82, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PsjInt" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetPsjInt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(PSJINT$82, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "PsjInt" element
                 */
                public boolean isSetPsjInt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PSJINT$82) != 0;
                    }
                }
                
                /**
                 * Sets the "PsjInt" element
                 */
                public void setPsjInt(long psjInt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSJINT$82, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PSJINT$82);
                      }
                      target.setLongValue(psjInt);
                    }
                }
                
                /**
                 * Sets (as xml) the "PsjInt" element
                 */
                public void xsetPsjInt(cl.sii.siiDte.libroCV.MontoType psjInt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(PSJINT$82, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(PSJINT$82);
                      }
                      target.set(psjInt);
                    }
                }
                
                /**
                 * Unsets the "PsjInt" element
                 */
                public void unsetPsjInt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PSJINT$82, 0);
                    }
                }
                
                /**
                 * Gets the "TabPuros" element
                 */
                public long getTabPuros()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABPUROS$84, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TabPuros" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetTabPuros()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TABPUROS$84, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TabPuros" element
                 */
                public boolean isSetTabPuros()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TABPUROS$84) != 0;
                    }
                }
                
                /**
                 * Sets the "TabPuros" element
                 */
                public void setTabPuros(long tabPuros)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABPUROS$84, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TABPUROS$84);
                      }
                      target.setLongValue(tabPuros);
                    }
                }
                
                /**
                 * Sets (as xml) the "TabPuros" element
                 */
                public void xsetTabPuros(cl.sii.siiDte.libroCV.MontoType tabPuros)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TABPUROS$84, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TABPUROS$84);
                      }
                      target.set(tabPuros);
                    }
                }
                
                /**
                 * Unsets the "TabPuros" element
                 */
                public void unsetTabPuros()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TABPUROS$84, 0);
                    }
                }
                
                /**
                 * Gets the "TabCigarrillos" element
                 */
                public long getTabCigarrillos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABCIGARRILLOS$86, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TabCigarrillos" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetTabCigarrillos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TABCIGARRILLOS$86, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TabCigarrillos" element
                 */
                public boolean isSetTabCigarrillos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TABCIGARRILLOS$86) != 0;
                    }
                }
                
                /**
                 * Sets the "TabCigarrillos" element
                 */
                public void setTabCigarrillos(long tabCigarrillos)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABCIGARRILLOS$86, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TABCIGARRILLOS$86);
                      }
                      target.setLongValue(tabCigarrillos);
                    }
                }
                
                /**
                 * Sets (as xml) the "TabCigarrillos" element
                 */
                public void xsetTabCigarrillos(cl.sii.siiDte.libroCV.MontoType tabCigarrillos)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TABCIGARRILLOS$86, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TABCIGARRILLOS$86);
                      }
                      target.set(tabCigarrillos);
                    }
                }
                
                /**
                 * Unsets the "TabCigarrillos" element
                 */
                public void unsetTabCigarrillos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TABCIGARRILLOS$86, 0);
                    }
                }
                
                /**
                 * Gets the "TabElaborado" element
                 */
                public long getTabElaborado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABELABORADO$88, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TabElaborado" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetTabElaborado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TABELABORADO$88, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TabElaborado" element
                 */
                public boolean isSetTabElaborado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TABELABORADO$88) != 0;
                    }
                }
                
                /**
                 * Sets the "TabElaborado" element
                 */
                public void setTabElaborado(long tabElaborado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABELABORADO$88, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TABELABORADO$88);
                      }
                      target.setLongValue(tabElaborado);
                    }
                }
                
                /**
                 * Sets (as xml) the "TabElaborado" element
                 */
                public void xsetTabElaborado(cl.sii.siiDte.libroCV.MontoType tabElaborado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(TABELABORADO$88, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(TABELABORADO$88);
                      }
                      target.set(tabElaborado);
                    }
                }
                
                /**
                 * Unsets the "TabElaborado" element
                 */
                public void unsetTabElaborado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TABELABORADO$88, 0);
                    }
                }
                
                /**
                 * Gets the "ImpVehiculo" element
                 */
                public long getImpVehiculo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPVEHICULO$90, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ImpVehiculo" element
                 */
                public cl.sii.siiDte.libroCV.MontoType xgetImpVehiculo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IMPVEHICULO$90, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "ImpVehiculo" element
                 */
                public boolean isSetImpVehiculo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IMPVEHICULO$90) != 0;
                    }
                }
                
                /**
                 * Sets the "ImpVehiculo" element
                 */
                public void setImpVehiculo(long impVehiculo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPVEHICULO$90, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPVEHICULO$90);
                      }
                      target.setLongValue(impVehiculo);
                    }
                }
                
                /**
                 * Sets (as xml) the "ImpVehiculo" element
                 */
                public void xsetImpVehiculo(cl.sii.siiDte.libroCV.MontoType impVehiculo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroCV.MontoType target = null;
                      target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(IMPVEHICULO$90, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(IMPVEHICULO$90);
                      }
                      target.set(impVehiculo);
                    }
                }
                
                /**
                 * Unsets the "ImpVehiculo" element
                 */
                public void unsetImpVehiculo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IMPVEHICULO$90, 0);
                    }
                }
                /**
                 * An XML Emisor(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Emisor.
                 */
                public static class EmisorImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor
                {
                    private static final long serialVersionUID = 1L;
                    
                    public EmisorImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected EmisorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML IndFactCompra(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$IndFactCompra.
                 */
                public static class IndFactCompraImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IndFactCompraImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected IndFactCompraImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML NroDoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$NroDoc.
                 */
                public static class NroDocImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NroDocImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NroDocImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML Anulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Anulado.
                 */
                public static class AnuladoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Operacion.
                 */
                public static class OperacionImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion
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
                 * An XML TpoImp(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$TpoImp.
                 */
                public static class TpoImpImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TpoImpImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TpoImpImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML NumInt(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$NumInt.
                 */
                public static class NumIntImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NumIntImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NumIntImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML IndServicio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$IndServicio.
                 */
                public static class IndServicioImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio
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
                 * An XML IndSinCosto(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$IndSinCosto.
                 */
                public static class IndSinCostoImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IndSinCostoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected IndSinCostoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML FchDoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$FchDoc.
                 */
                public static class FchDocImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FchDocImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FchDocImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CdgSIISucur(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$CdgSIISucur.
                 */
                public static class CdgSIISucurImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur
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
                 * An XML RznSoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$RznSoc.
                 */
                public static class RznSocImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc
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
                 * An XML Extranjero(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class ExtranjeroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ExtranjeroImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName NUMID$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NumId");
                    private static final javax.xml.namespace.QName NACIONALIDAD$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Nacionalidad");
                    
                    
                    /**
                     * Gets the "NumId" element
                     */
                    public java.lang.String getNumId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMID$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "NumId" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId xgetNumId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId)get_store().find_element_user(NUMID$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "NumId" element
                     */
                    public boolean isSetNumId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(NUMID$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "NumId" element
                     */
                    public void setNumId(java.lang.String numId)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMID$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMID$0);
                        }
                        target.setStringValue(numId);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "NumId" element
                     */
                    public void xsetNumId(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId numId)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId)get_store().find_element_user(NUMID$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId)get_store().add_element_user(NUMID$0);
                        }
                        target.set(numId);
                      }
                    }
                    
                    /**
                     * Unsets the "NumId" element
                     */
                    public void unsetNumId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(NUMID$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Nacionalidad" element
                     */
                    public java.lang.String getNacionalidad()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NACIONALIDAD$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Nacionalidad" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad xgetNacionalidad()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad)get_store().find_element_user(NACIONALIDAD$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Nacionalidad" element
                     */
                    public boolean isSetNacionalidad()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(NACIONALIDAD$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Nacionalidad" element
                     */
                    public void setNacionalidad(java.lang.String nacionalidad)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NACIONALIDAD$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NACIONALIDAD$2);
                        }
                        target.setStringValue(nacionalidad);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Nacionalidad" element
                     */
                    public void xsetNacionalidad(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad nacionalidad)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad)get_store().find_element_user(NACIONALIDAD$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad)get_store().add_element_user(NACIONALIDAD$2);
                        }
                        target.set(nacionalidad);
                      }
                    }
                    
                    /**
                     * Unsets the "Nacionalidad" element
                     */
                    public void unsetNacionalidad()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(NACIONALIDAD$2, 0);
                      }
                    }
                    /**
                     * An XML NumId(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Extranjero$NumId.
                     */
                    public static class NumIdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NumIdImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected NumIdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML Nacionalidad(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Extranjero$Nacionalidad.
                     */
                    public static class NacionalidadImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NacionalidadImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected NacionalidadImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
                /**
                 * An XML FolioDocRef(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$FolioDocRef.
                 */
                public static class FolioDocRefImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef
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
                /**
                 * An XML IVANoRec(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class IVANoRecImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IVANoRecImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName CODIVANOREC$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodIVANoRec");
                    private static final javax.xml.namespace.QName MNTIVANOREC$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntIVANoRec");
                    
                    
                    /**
                     * Gets the "CodIVANoRec" element
                     */
                    public java.math.BigInteger getCodIVANoRec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIVANOREC$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CodIVANoRec" element
                     */
                    public cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec xgetCodIVANoRec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec)get_store().find_element_user(CODIVANOREC$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "CodIVANoRec" element
                     */
                    public void setCodIVANoRec(java.math.BigInteger codIVANoRec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIVANOREC$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIVANOREC$0);
                        }
                        target.setBigIntegerValue(codIVANoRec);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CodIVANoRec" element
                     */
                    public void xsetCodIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec codIVANoRec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec target = null;
                        target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec)get_store().find_element_user(CODIVANOREC$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec)get_store().add_element_user(CODIVANOREC$0);
                        }
                        target.set(codIVANoRec);
                      }
                    }
                    
                    /**
                     * Gets the "MntIVANoRec" element
                     */
                    public long getMntIVANoRec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIVANOREC$2, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "MntIVANoRec" element
                     */
                    public cl.sii.siiDte.libroCV.MontoType xgetMntIVANoRec()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(MNTIVANOREC$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "MntIVANoRec" element
                     */
                    public void setMntIVANoRec(long mntIVANoRec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIVANOREC$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTIVANOREC$2);
                        }
                        target.setLongValue(mntIVANoRec);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "MntIVANoRec" element
                     */
                    public void xsetMntIVANoRec(cl.sii.siiDte.libroCV.MontoType mntIVANoRec)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.MontoType target = null;
                        target = (cl.sii.siiDte.libroCV.MontoType)get_store().find_element_user(MNTIVANOREC$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.MontoType)get_store().add_element_user(MNTIVANOREC$2);
                        }
                        target.set(mntIVANoRec);
                      }
                    }
                    /**
                     * An XML CodIVANoRec(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$IVANoRec$CodIVANoRec.
                     */
                    public static class CodIVANoRecImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public CodIVANoRecImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected CodIVANoRecImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
                /**
                 * An XML OtrosImp(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class OtrosImpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp
                {
                    private static final long serialVersionUID = 1L;
                    
                    public OtrosImpImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName CODIMP$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodImp");
                    private static final javax.xml.namespace.QName TASAIMP$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TasaImp");
                    private static final javax.xml.namespace.QName MNTIMP$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntImp");
                    
                    
                    /**
                     * Gets the "CodImp" element
                     */
                    public java.math.BigInteger getCodImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIMP$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CodImp" element
                     */
                    public cl.sii.siiDte.libroCV.ImptoType xgetCodImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ImptoType target = null;
                        target = (cl.sii.siiDte.libroCV.ImptoType)get_store().find_element_user(CODIMP$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "CodImp" element
                     */
                    public void setCodImp(java.math.BigInteger codImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIMP$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIMP$0);
                        }
                        target.setBigIntegerValue(codImp);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CodImp" element
                     */
                    public void xsetCodImp(cl.sii.siiDte.libroCV.ImptoType codImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ImptoType target = null;
                        target = (cl.sii.siiDte.libroCV.ImptoType)get_store().find_element_user(CODIMP$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ImptoType)get_store().add_element_user(CODIMP$0);
                        }
                        target.set(codImp);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIMP$2, 0);
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
                    public cl.sii.siiDte.libroCV.PctType xgetTasaImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.PctType target = null;
                        target = (cl.sii.siiDte.libroCV.PctType)get_store().find_element_user(TASAIMP$2, 0);
                        return target;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIMP$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASAIMP$2);
                        }
                        target.setBigDecimalValue(tasaImp);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TasaImp" element
                     */
                    public void xsetTasaImp(cl.sii.siiDte.libroCV.PctType tasaImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.PctType target = null;
                        target = (cl.sii.siiDte.libroCV.PctType)get_store().find_element_user(TASAIMP$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.PctType)get_store().add_element_user(TASAIMP$2);
                        }
                        target.set(tasaImp);
                      }
                    }
                    
                    /**
                     * Gets the "MntImp" element
                     */
                    public long getMntImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIMP$4, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "MntImp" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetMntImp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTIMP$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "MntImp" element
                     */
                    public void setMntImp(long mntImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIMP$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTIMP$4);
                        }
                        target.setLongValue(mntImp);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "MntImp" element
                     */
                    public void xsetMntImp(cl.sii.siiDte.libroCV.ValorType mntImp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(MNTIMP$4, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(MNTIMP$4);
                        }
                        target.set(mntImp);
                      }
                    }
                }
                /**
                 * An XML Liquidaciones(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class LiquidacionesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LiquidacionesImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName RUTEMISOR$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutEmisor");
                    private static final javax.xml.namespace.QName VALCOMNETO$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ValComNeto");
                    private static final javax.xml.namespace.QName VALCOMEXE$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ValComExe");
                    private static final javax.xml.namespace.QName VALCOMIVA$6 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ValComIVA");
                    
                    
                    /**
                     * Gets the "RutEmisor" element
                     */
                    public java.lang.String getRutEmisor()
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
                     * Gets (as xml) the "RutEmisor" element
                     */
                    public cl.sii.siiDte.libroCV.RUTType xgetRutEmisor()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.RUTType target = null;
                        target = (cl.sii.siiDte.libroCV.RUTType)get_store().find_element_user(RUTEMISOR$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "RutEmisor" element
                     */
                    public void setRutEmisor(java.lang.String rutEmisor)
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
                     * Sets (as xml) the "RutEmisor" element
                     */
                    public void xsetRutEmisor(cl.sii.siiDte.libroCV.RUTType rutEmisor)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.RUTType target = null;
                        target = (cl.sii.siiDte.libroCV.RUTType)get_store().find_element_user(RUTEMISOR$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.RUTType)get_store().add_element_user(RUTEMISOR$0);
                        }
                        target.set(rutEmisor);
                      }
                    }
                    
                    /**
                     * Gets the "ValComNeto" element
                     */
                    public long getValComNeto()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALCOMNETO$2, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "ValComNeto" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetValComNeto()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(VALCOMNETO$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "ValComNeto" element
                     */
                    public boolean isSetValComNeto()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(VALCOMNETO$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "ValComNeto" element
                     */
                    public void setValComNeto(long valComNeto)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALCOMNETO$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALCOMNETO$2);
                        }
                        target.setLongValue(valComNeto);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "ValComNeto" element
                     */
                    public void xsetValComNeto(cl.sii.siiDte.libroCV.ValorType valComNeto)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(VALCOMNETO$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(VALCOMNETO$2);
                        }
                        target.set(valComNeto);
                      }
                    }
                    
                    /**
                     * Unsets the "ValComNeto" element
                     */
                    public void unsetValComNeto()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(VALCOMNETO$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "ValComExe" element
                     */
                    public long getValComExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALCOMEXE$4, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "ValComExe" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetValComExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(VALCOMEXE$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "ValComExe" element
                     */
                    public boolean isSetValComExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(VALCOMEXE$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "ValComExe" element
                     */
                    public void setValComExe(long valComExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALCOMEXE$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALCOMEXE$4);
                        }
                        target.setLongValue(valComExe);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "ValComExe" element
                     */
                    public void xsetValComExe(cl.sii.siiDte.libroCV.ValorType valComExe)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(VALCOMEXE$4, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(VALCOMEXE$4);
                        }
                        target.set(valComExe);
                      }
                    }
                    
                    /**
                     * Unsets the "ValComExe" element
                     */
                    public void unsetValComExe()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(VALCOMEXE$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "ValComIVA" element
                     */
                    public long getValComIVA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALCOMIVA$6, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "ValComIVA" element
                     */
                    public cl.sii.siiDte.libroCV.ValorType xgetValComIVA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(VALCOMIVA$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "ValComIVA" element
                     */
                    public boolean isSetValComIVA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(VALCOMIVA$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "ValComIVA" element
                     */
                    public void setValComIVA(long valComIVA)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALCOMIVA$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALCOMIVA$6);
                        }
                        target.setLongValue(valComIVA);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "ValComIVA" element
                     */
                    public void xsetValComIVA(cl.sii.siiDte.libroCV.ValorType valComIVA)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroCV.ValorType target = null;
                        target = (cl.sii.siiDte.libroCV.ValorType)get_store().find_element_user(VALCOMIVA$6, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroCV.ValorType)get_store().add_element_user(VALCOMIVA$6);
                        }
                        target.set(valComIVA);
                      }
                    }
                    
                    /**
                     * Unsets the "ValComIVA" element
                     */
                    public void unsetValComIVA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(VALCOMIVA$6, 0);
                      }
                    }
                }
            }
            /**
             * An XML TmstFirma(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$TmstFirma.
             */
            public static class TmstFirmaImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma
            {
                private static final long serialVersionUID = 1L;
                
                public TmstFirmaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected TmstFirmaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
