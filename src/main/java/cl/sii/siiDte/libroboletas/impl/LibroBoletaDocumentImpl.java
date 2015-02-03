/*
 * An XML document type.
 * Localname: LibroBoleta
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.libroboletas.LibroBoletaDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.libroboletas.impl;
/**
 * A document containing one LibroBoleta(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class LibroBoletaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument
{
    private static final long serialVersionUID = 1L;
    
    public LibroBoletaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.LibroBoletaDocumentExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName LIBROBOLETA$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "LibroBoleta");
    
    
    /**
     * Gets the "LibroBoleta" element
     */
    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta getLibroBoleta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta target = null;
            target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta)get_store().find_element_user(LIBROBOLETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LibroBoleta" element
     */
    public void setLibroBoleta(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta libroBoleta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta target = null;
            target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta)get_store().find_element_user(LIBROBOLETA$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta)get_store().add_element_user(LIBROBOLETA$0);
            }
            target.set(libroBoleta);
        }
    }
    
    /**
     * Appends and returns a new empty "LibroBoleta" element
     */
    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta addNewLibroBoleta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta target = null;
            target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta)get_store().add_element_user(LIBROBOLETA$0);
            return target;
        }
    }
    /**
     * An XML LibroBoleta(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class LibroBoletaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta
    {
        private static final long serialVersionUID = 1L;
        
        public LibroBoletaImpl(org.apache.xmlbeans.SchemaType sType)
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
        public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro getEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro)get_store().find_element_user(ENVIOLIBRO$0, 0);
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
        public void setEnvioLibro(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro envioLibro)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro)get_store().find_element_user(ENVIOLIBRO$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro)get_store().add_element_user(ENVIOLIBRO$0);
                }
                target.set(envioLibro);
            }
        }
        
        /**
         * Appends and returns a new empty "EnvioLibro" element
         */
        public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro addNewEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro target = null;
                target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro)get_store().add_element_user(ENVIOLIBRO$0);
                return target;
            }
        }
        
        /**
         * Gets the "Signature" element
         */
        public cl.sii.siiDte.libroboletas.SignatureType getSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroboletas.SignatureType target = null;
                target = (cl.sii.siiDte.libroboletas.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
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
        public void setSignature(cl.sii.siiDte.libroboletas.SignatureType signature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroboletas.SignatureType target = null;
                target = (cl.sii.siiDte.libroboletas.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroboletas.SignatureType)get_store().add_element_user(SIGNATURE$2);
                }
                target.set(signature);
            }
        }
        
        /**
         * Appends and returns a new empty "Signature" element
         */
        public cl.sii.siiDte.libroboletas.SignatureType addNewSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroboletas.SignatureType target = null;
                target = (cl.sii.siiDte.libroboletas.SignatureType)get_store().add_element_user(SIGNATURE$2);
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
        public static class EnvioLibroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro
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
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula getCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula)get_store().find_element_user(CARATULA$0, 0);
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
            public void setCaratula(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula caratula)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula)get_store().add_element_user(CARATULA$0);
                    }
                    target.set(caratula);
                }
            }
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula addNewCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula)get_store().add_element_user(CARATULA$0);
                    return target;
                }
            }
            
            /**
             * Gets the "ResumenSegmento" element
             */
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento getResumenSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento)get_store().find_element_user(RESUMENSEGMENTO$2, 0);
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
            public void setResumenSegmento(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento resumenSegmento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento)get_store().find_element_user(RESUMENSEGMENTO$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento)get_store().add_element_user(RESUMENSEGMENTO$2);
                    }
                    target.set(resumenSegmento);
                }
            }
            
            /**
             * Appends and returns a new empty "ResumenSegmento" element
             */
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento addNewResumenSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento)get_store().add_element_user(RESUMENSEGMENTO$2);
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
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo getResumenPeriodo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo)get_store().find_element_user(RESUMENPERIODO$4, 0);
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
            public void setResumenPeriodo(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo resumenPeriodo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo)get_store().find_element_user(RESUMENPERIODO$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo)get_store().add_element_user(RESUMENPERIODO$4);
                    }
                    target.set(resumenPeriodo);
                }
            }
            
            /**
             * Appends and returns a new empty "ResumenPeriodo" element
             */
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo addNewResumenPeriodo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo)get_store().add_element_user(RESUMENPERIODO$4);
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
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle[] getDetalleArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DETALLE$6, targetList);
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle[] result = new cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Detalle" element
             */
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle getDetalleArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle)get_store().find_element_user(DETALLE$6, i);
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
            public void setDetalleArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle[] detalleArray)
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
            public void setDetalleArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle detalle)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle)get_store().find_element_user(DETALLE$6, i);
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
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle insertNewDetalle(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle)get_store().insert_element_user(DETALLE$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Detalle" element
             */
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle addNewDetalle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle)get_store().add_element_user(DETALLE$6);
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
            public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma xgetTmstFirma()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma)get_store().find_element_user(TMSTFIRMA$8, 0);
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
            public void xsetTmstFirma(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma tmstFirma)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma target = null;
                    target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma)get_store().find_element_user(TMSTFIRMA$8, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma)get_store().add_element_user(TMSTFIRMA$8);
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
            public static class CaratulaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula
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
                public cl.sii.siiDte.libroboletas.RUTType xgetRutEmisorLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.RUTType target = null;
                      target = (cl.sii.siiDte.libroboletas.RUTType)get_store().find_element_user(RUTEMISORLIBRO$0, 0);
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
                public void xsetRutEmisorLibro(cl.sii.siiDte.libroboletas.RUTType rutEmisorLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.RUTType target = null;
                      target = (cl.sii.siiDte.libroboletas.RUTType)get_store().find_element_user(RUTEMISORLIBRO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.RUTType)get_store().add_element_user(RUTEMISORLIBRO$0);
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
                public cl.sii.siiDte.libroboletas.RUTType xgetRutEnvia()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.RUTType target = null;
                      target = (cl.sii.siiDte.libroboletas.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
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
                public void xsetRutEnvia(cl.sii.siiDte.libroboletas.RUTType rutEnvia)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.RUTType target = null;
                      target = (cl.sii.siiDte.libroboletas.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.RUTType)get_store().add_element_user(RUTENVIA$2);
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
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol xgetNroResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol)get_store().find_element_user(NRORESOL$8, 0);
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
                public void xsetNroResol(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol nroResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol)get_store().add_element_user(NRORESOL$8);
                      }
                      target.set(nroResol);
                    }
                }
                
                /**
                 * Gets the "TipoLibro" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro.Enum getTipoLibro()
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
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoLibro" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro xgetTipoLibro()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro)get_store().find_element_user(TIPOLIBRO$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TipoLibro" element
                 */
                public void setTipoLibro(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro.Enum tipoLibro)
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
                public void xsetTipoLibro(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro tipoLibro)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro)get_store().find_element_user(TIPOLIBRO$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro)get_store().add_element_user(TIPOLIBRO$10);
                      }
                      target.set(tipoLibro);
                    }
                }
                
                /**
                 * Gets the "TipoEnvio" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio.Enum getTipoEnvio()
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
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoEnvio" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio xgetTipoEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio)get_store().find_element_user(TIPOENVIO$12, 0);
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
                public void setTipoEnvio(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio.Enum tipoEnvio)
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
                public void xsetTipoEnvio(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio tipoEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio)get_store().find_element_user(TIPOENVIO$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio)get_store().add_element_user(TIPOENVIO$12);
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
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento xgetNroSegmento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento)get_store().find_element_user(NROSEGMENTO$14, 0);
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
                public void xsetNroSegmento(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento nroSegmento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento)get_store().find_element_user(NROSEGMENTO$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento)get_store().add_element_user(NROSEGMENTO$14);
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
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion xgetFolioNotificacion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion)get_store().find_element_user(FOLIONOTIFICACION$16, 0);
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
                public void xsetFolioNotificacion(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion folioNotificacion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion)get_store().find_element_user(FOLIONOTIFICACION$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion)get_store().add_element_user(FOLIONOTIFICACION$16);
                      }
                      target.set(folioNotificacion);
                    }
                }
                /**
                 * An XML NroResol(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$NroResol.
                 */
                public static class NroResolImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol
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
                 * An XML TipoLibro(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$TipoLibro.
                 */
                public static class TipoLibroImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$TipoEnvio.
                 */
                public static class TipoEnvioImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$NroSegmento.
                 */
                public static class NroSegmentoImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$FolioNotificacion.
                 */
                public static class FolioNotificacionImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion
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
            public static class ResumenSegmentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento
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
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento[] getTotalesSegmentoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TOTALESSEGMENTO$0, targetList);
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento[] result = new cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "TotalesSegmento" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento getTotalesSegmentoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento)get_store().find_element_user(TOTALESSEGMENTO$0, i);
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
                public void setTotalesSegmentoArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento[] totalesSegmentoArray)
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
                public void setTotalesSegmentoArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento totalesSegmento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento)get_store().find_element_user(TOTALESSEGMENTO$0, i);
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
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento insertNewTotalesSegmento(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento)get_store().insert_element_user(TOTALESSEGMENTO$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotalesSegmento" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento addNewTotalesSegmento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento)get_store().add_element_user(TOTALESSEGMENTO$0);
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
                public static class TotalesSegmentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotalesSegmentoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TPODOC$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDoc");
                    private static final javax.xml.namespace.QName TOTANULADO$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotAnulado");
                    private static final javax.xml.namespace.QName TOTALESSERVICIO$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotalesServicio");
                    
                    
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
                    public cl.sii.siiDte.libroboletas.DoctoType xgetTpoDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.DoctoType target = null;
                        target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().find_element_user(TPODOC$0, 0);
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
                    public void xsetTpoDoc(cl.sii.siiDte.libroboletas.DoctoType tpoDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.DoctoType target = null;
                        target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().add_element_user(TPODOC$0);
                        }
                        target.set(tpoDoc);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTANULADO$2, 0);
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
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado xgetTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado)get_store().find_element_user(TOTANULADO$2, 0);
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
                        return get_store().count_elements(TOTANULADO$2) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTANULADO$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTANULADO$2);
                        }
                        target.setLongValue(totAnulado);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotAnulado" element
                     */
                    public void xsetTotAnulado(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado totAnulado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado)get_store().find_element_user(TOTANULADO$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado)get_store().add_element_user(TOTANULADO$2);
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
                        get_store().remove_element(TOTANULADO$2, 0);
                      }
                    }
                    
                    /**
                     * Gets array of all "TotalesServicio" elements
                     */
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio[] getTotalesServicioArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(TOTALESSERVICIO$4, targetList);
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio[] result = new cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "TotalesServicio" element
                     */
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio getTotalesServicioArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio)get_store().find_element_user(TOTALESSERVICIO$4, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "TotalesServicio" element
                     */
                    public int sizeOfTotalesServicioArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTALESSERVICIO$4);
                      }
                    }
                    
                    /**
                     * Sets array of all "TotalesServicio" element
                     */
                    public void setTotalesServicioArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio[] totalesServicioArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(totalesServicioArray, TOTALESSERVICIO$4);
                      }
                    }
                    
                    /**
                     * Sets ith "TotalesServicio" element
                     */
                    public void setTotalesServicioArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio totalesServicio)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio)get_store().find_element_user(TOTALESSERVICIO$4, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(totalesServicio);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotalesServicio" element
                     */
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio insertNewTotalesServicio(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio)get_store().insert_element_user(TOTALESSERVICIO$4, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotalesServicio" element
                     */
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio addNewTotalesServicio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio)get_store().add_element_user(TOTALESSERVICIO$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "TotalesServicio" element
                     */
                    public void removeTotalesServicio(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTALESSERVICIO$4, i);
                      }
                    }
                    /**
                     * An XML TotAnulado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotAnulado.
                     */
                    public static class TotAnuladoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado
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
                     * An XML TotalesServicio(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class TotalesServicioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotalesServicioImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName TPOSERV$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoServ");
                      private static final javax.xml.namespace.QName PERIODODEVENGO$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PeriodoDevengo");
                      private static final javax.xml.namespace.QName TOTDOC$4 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotDoc");
                      private static final javax.xml.namespace.QName TOTMNTEXE$6 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntExe");
                      private static final javax.xml.namespace.QName TOTMNTTOTAL$8 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntTotal");
                      private static final javax.xml.namespace.QName TOTMNTNOFACT$10 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntNoFact");
                      private static final javax.xml.namespace.QName TOTMNTPERIODO$12 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntPeriodo");
                      private static final javax.xml.namespace.QName TOTSALDOANT$14 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotSaldoAnt");
                      private static final javax.xml.namespace.QName TOTVLRPAGAR$16 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotVlrPagar");
                      
                      
                      /**
                       * Gets the "TpoServ" element
                       */
                      public int getTpoServ()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOSERV$0, 0);
                          if (target == null)
                          {
                            return 0;
                          }
                          return target.getIntValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TpoServ" element
                       */
                      public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ xgetTpoServ()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ target = null;
                          target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ)get_store().find_element_user(TPOSERV$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "TpoServ" element
                       */
                      public void setTpoServ(int tpoServ)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOSERV$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOSERV$0);
                          }
                          target.setIntValue(tpoServ);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TpoServ" element
                       */
                      public void xsetTpoServ(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ tpoServ)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ target = null;
                          target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ)get_store().find_element_user(TPOSERV$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ)get_store().add_element_user(TPOSERV$0);
                          }
                          target.set(tpoServ);
                        }
                      }
                      
                      /**
                       * Gets the "PeriodoDevengo" element
                       */
                      public java.util.Calendar getPeriodoDevengo()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODODEVENGO$2, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getCalendarValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "PeriodoDevengo" element
                       */
                      public org.apache.xmlbeans.XmlGYearMonth xgetPeriodoDevengo()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlGYearMonth target = null;
                          target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(PERIODODEVENGO$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "PeriodoDevengo" element
                       */
                      public boolean isSetPeriodoDevengo()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(PERIODODEVENGO$2) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "PeriodoDevengo" element
                       */
                      public void setPeriodoDevengo(java.util.Calendar periodoDevengo)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODODEVENGO$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODODEVENGO$2);
                          }
                          target.setCalendarValue(periodoDevengo);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "PeriodoDevengo" element
                       */
                      public void xsetPeriodoDevengo(org.apache.xmlbeans.XmlGYearMonth periodoDevengo)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlGYearMonth target = null;
                          target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(PERIODODEVENGO$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlGYearMonth)get_store().add_element_user(PERIODODEVENGO$2);
                          }
                          target.set(periodoDevengo);
                        }
                      }
                      
                      /**
                       * Unsets the "PeriodoDevengo" element
                       */
                      public void unsetPeriodoDevengo()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(PERIODODEVENGO$2, 0);
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
                      public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc xgetTotDoc()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc target = null;
                          target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc)get_store().find_element_user(TOTDOC$4, 0);
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
                      public void xsetTotDoc(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc totDoc)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc target = null;
                          target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc)get_store().find_element_user(TOTDOC$4, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc)get_store().add_element_user(TOTDOC$4);
                          }
                          target.set(totDoc);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTEXE$6, 0);
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
                      public cl.sii.siiDte.libroboletas.MontoType xgetTotMntExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTEXE$6, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotMntExe" element
                       */
                      public boolean isSetTotMntExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTMNTEXE$6) != 0;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTEXE$6, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTEXE$6);
                          }
                          target.setLongValue(totMntExe);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntExe" element
                       */
                      public void xsetTotMntExe(cl.sii.siiDte.libroboletas.MontoType totMntExe)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTEXE$6, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(TOTMNTEXE$6);
                          }
                          target.set(totMntExe);
                        }
                      }
                      
                      /**
                       * Unsets the "TotMntExe" element
                       */
                      public void unsetTotMntExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTMNTEXE$6, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTTOTAL$8, 0);
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
                      public cl.sii.siiDte.libroboletas.MontoType xgetTotMntTotal()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTTOTAL$8, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTTOTAL$8, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTTOTAL$8);
                          }
                          target.setLongValue(totMntTotal);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntTotal" element
                       */
                      public void xsetTotMntTotal(cl.sii.siiDte.libroboletas.MontoType totMntTotal)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTTOTAL$8, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(TOTMNTTOTAL$8);
                          }
                          target.set(totMntTotal);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNOFACT$10, 0);
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
                      public cl.sii.siiDte.libroboletas.ValorType xgetTotMntNoFact()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTMNTNOFACT$10, 0);
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
                          return get_store().count_elements(TOTMNTNOFACT$10) != 0;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNOFACT$10, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTNOFACT$10);
                          }
                          target.setLongValue(totMntNoFact);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntNoFact" element
                       */
                      public void xsetTotMntNoFact(cl.sii.siiDte.libroboletas.ValorType totMntNoFact)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTMNTNOFACT$10, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(TOTMNTNOFACT$10);
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
                          get_store().remove_element(TOTMNTNOFACT$10, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTPERIODO$12, 0);
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
                      public cl.sii.siiDte.libroboletas.ValorType xgetTotMntPeriodo()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTMNTPERIODO$12, 0);
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
                          return get_store().count_elements(TOTMNTPERIODO$12) != 0;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTPERIODO$12, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTPERIODO$12);
                          }
                          target.setLongValue(totMntPeriodo);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntPeriodo" element
                       */
                      public void xsetTotMntPeriodo(cl.sii.siiDte.libroboletas.ValorType totMntPeriodo)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTMNTPERIODO$12, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(TOTMNTPERIODO$12);
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
                          get_store().remove_element(TOTMNTPERIODO$12, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotSaldoAnt" element
                       */
                      public long getTotSaldoAnt()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTSALDOANT$14, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotSaldoAnt" element
                       */
                      public cl.sii.siiDte.libroboletas.ValorType xgetTotSaldoAnt()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTSALDOANT$14, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotSaldoAnt" element
                       */
                      public boolean isSetTotSaldoAnt()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTSALDOANT$14) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotSaldoAnt" element
                       */
                      public void setTotSaldoAnt(long totSaldoAnt)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTSALDOANT$14, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTSALDOANT$14);
                          }
                          target.setLongValue(totSaldoAnt);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotSaldoAnt" element
                       */
                      public void xsetTotSaldoAnt(cl.sii.siiDte.libroboletas.ValorType totSaldoAnt)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTSALDOANT$14, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(TOTSALDOANT$14);
                          }
                          target.set(totSaldoAnt);
                        }
                      }
                      
                      /**
                       * Unsets the "TotSaldoAnt" element
                       */
                      public void unsetTotSaldoAnt()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTSALDOANT$14, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotVlrPagar" element
                       */
                      public long getTotVlrPagar()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVLRPAGAR$16, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotVlrPagar" element
                       */
                      public cl.sii.siiDte.libroboletas.ValorType xgetTotVlrPagar()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTVLRPAGAR$16, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotVlrPagar" element
                       */
                      public boolean isSetTotVlrPagar()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTVLRPAGAR$16) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotVlrPagar" element
                       */
                      public void setTotVlrPagar(long totVlrPagar)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVLRPAGAR$16, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTVLRPAGAR$16);
                          }
                          target.setLongValue(totVlrPagar);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotVlrPagar" element
                       */
                      public void xsetTotVlrPagar(cl.sii.siiDte.libroboletas.ValorType totVlrPagar)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTVLRPAGAR$16, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(TOTVLRPAGAR$16);
                          }
                          target.set(totVlrPagar);
                        }
                      }
                      
                      /**
                       * Unsets the "TotVlrPagar" element
                       */
                      public void unsetTotVlrPagar()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTVLRPAGAR$16, 0);
                        }
                      }
                      /**
                       * An XML TpoServ(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotalesServicio$TpoServ.
                       */
                      public static class TpoServImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public TpoServImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected TpoServImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                      /**
                       * An XML TotDoc(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotalesServicio$TotDoc.
                       */
                      public static class TotDocImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc
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
                    }
                }
            }
            /**
             * An XML ResumenPeriodo(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class ResumenPeriodoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo
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
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] getTotalesPeriodoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TOTALESPERIODO$0, targetList);
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] result = new cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "TotalesPeriodo" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo getTotalesPeriodoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo)get_store().find_element_user(TOTALESPERIODO$0, i);
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
                public void setTotalesPeriodoArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] totalesPeriodoArray)
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
                public void setTotalesPeriodoArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo totalesPeriodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo)get_store().find_element_user(TOTALESPERIODO$0, i);
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
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo insertNewTotalesPeriodo(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo)get_store().insert_element_user(TOTALESPERIODO$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotalesPeriodo" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo addNewTotalesPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo)get_store().add_element_user(TOTALESPERIODO$0);
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
                public static class TotalesPeriodoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TotalesPeriodoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TPODOC$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDoc");
                    private static final javax.xml.namespace.QName TOTANULADO$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotAnulado");
                    private static final javax.xml.namespace.QName TOTALESSERVICIO$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotalesServicio");
                    
                    
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
                    public cl.sii.siiDte.libroboletas.DoctoType xgetTpoDoc()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.DoctoType target = null;
                        target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().find_element_user(TPODOC$0, 0);
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
                    public void xsetTpoDoc(cl.sii.siiDte.libroboletas.DoctoType tpoDoc)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.DoctoType target = null;
                        target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().add_element_user(TPODOC$0);
                        }
                        target.set(tpoDoc);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTANULADO$2, 0);
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
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado xgetTotAnulado()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado)get_store().find_element_user(TOTANULADO$2, 0);
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
                        return get_store().count_elements(TOTANULADO$2) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTANULADO$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTANULADO$2);
                        }
                        target.setLongValue(totAnulado);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TotAnulado" element
                     */
                    public void xsetTotAnulado(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado totAnulado)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado)get_store().find_element_user(TOTANULADO$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado)get_store().add_element_user(TOTANULADO$2);
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
                        get_store().remove_element(TOTANULADO$2, 0);
                      }
                    }
                    
                    /**
                     * Gets array of all "TotalesServicio" elements
                     */
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio[] getTotalesServicioArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(TOTALESSERVICIO$4, targetList);
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio[] result = new cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "TotalesServicio" element
                     */
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio getTotalesServicioArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio)get_store().find_element_user(TOTALESSERVICIO$4, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "TotalesServicio" element
                     */
                    public int sizeOfTotalesServicioArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TOTALESSERVICIO$4);
                      }
                    }
                    
                    /**
                     * Sets array of all "TotalesServicio" element
                     */
                    public void setTotalesServicioArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio[] totalesServicioArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(totalesServicioArray, TOTALESSERVICIO$4);
                      }
                    }
                    
                    /**
                     * Sets ith "TotalesServicio" element
                     */
                    public void setTotalesServicioArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio totalesServicio)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio)get_store().find_element_user(TOTALESSERVICIO$4, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(totalesServicio);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotalesServicio" element
                     */
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio insertNewTotalesServicio(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio)get_store().insert_element_user(TOTALESSERVICIO$4, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotalesServicio" element
                     */
                    public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio addNewTotalesServicio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio target = null;
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio)get_store().add_element_user(TOTALESSERVICIO$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "TotalesServicio" element
                     */
                    public void removeTotalesServicio(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TOTALESSERVICIO$4, i);
                      }
                    }
                    /**
                     * An XML TotAnulado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotAnulado.
                     */
                    public static class TotAnuladoImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado
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
                     * An XML TotalesServicio(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class TotalesServicioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TotalesServicioImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName TPOSERV$0 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoServ");
                      private static final javax.xml.namespace.QName PERIODODEVENGADO$2 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PeriodoDevengado");
                      private static final javax.xml.namespace.QName TOTDOC$4 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotDoc");
                      private static final javax.xml.namespace.QName TOTMNTEXE$6 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntExe");
                      private static final javax.xml.namespace.QName TOTMNTNETO$8 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntNeto");
                      private static final javax.xml.namespace.QName TASAIVA$10 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TasaIVA");
                      private static final javax.xml.namespace.QName TOTMNTIVA$12 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntIVA");
                      private static final javax.xml.namespace.QName TOTMNTTOTAL$14 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntTotal");
                      private static final javax.xml.namespace.QName TOTMNTNOFACT$16 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntNoFact");
                      private static final javax.xml.namespace.QName TOTMNTPERIODO$18 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotMntPeriodo");
                      private static final javax.xml.namespace.QName TOTSALDOANT$20 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotSaldoAnt");
                      private static final javax.xml.namespace.QName TOTVLRPAGAR$22 = 
                        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TotVlrPagar");
                      
                      
                      /**
                       * Gets the "TpoServ" element
                       */
                      public int getTpoServ()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOSERV$0, 0);
                          if (target == null)
                          {
                            return 0;
                          }
                          return target.getIntValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TpoServ" element
                       */
                      public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ xgetTpoServ()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ target = null;
                          target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ)get_store().find_element_user(TPOSERV$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "TpoServ" element
                       */
                      public void setTpoServ(int tpoServ)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOSERV$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOSERV$0);
                          }
                          target.setIntValue(tpoServ);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TpoServ" element
                       */
                      public void xsetTpoServ(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ tpoServ)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ target = null;
                          target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ)get_store().find_element_user(TPOSERV$0, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ)get_store().add_element_user(TPOSERV$0);
                          }
                          target.set(tpoServ);
                        }
                      }
                      
                      /**
                       * Gets the "PeriodoDevengado" element
                       */
                      public java.util.Calendar getPeriodoDevengado()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODODEVENGADO$2, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getCalendarValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "PeriodoDevengado" element
                       */
                      public org.apache.xmlbeans.XmlGYearMonth xgetPeriodoDevengado()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlGYearMonth target = null;
                          target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(PERIODODEVENGADO$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "PeriodoDevengado" element
                       */
                      public boolean isSetPeriodoDevengado()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(PERIODODEVENGADO$2) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "PeriodoDevengado" element
                       */
                      public void setPeriodoDevengado(java.util.Calendar periodoDevengado)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODODEVENGADO$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODODEVENGADO$2);
                          }
                          target.setCalendarValue(periodoDevengado);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "PeriodoDevengado" element
                       */
                      public void xsetPeriodoDevengado(org.apache.xmlbeans.XmlGYearMonth periodoDevengado)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlGYearMonth target = null;
                          target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(PERIODODEVENGADO$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlGYearMonth)get_store().add_element_user(PERIODODEVENGADO$2);
                          }
                          target.set(periodoDevengado);
                        }
                      }
                      
                      /**
                       * Unsets the "PeriodoDevengado" element
                       */
                      public void unsetPeriodoDevengado()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(PERIODODEVENGADO$2, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotDoc" element
                       */
                      public java.math.BigInteger getTotDoc()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTDOC$4, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getBigIntegerValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotDoc" element
                       */
                      public org.apache.xmlbeans.XmlPositiveInteger xgetTotDoc()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlPositiveInteger target = null;
                          target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(TOTDOC$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "TotDoc" element
                       */
                      public void setTotDoc(java.math.BigInteger totDoc)
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
                          target.setBigIntegerValue(totDoc);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotDoc" element
                       */
                      public void xsetTotDoc(org.apache.xmlbeans.XmlPositiveInteger totDoc)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlPositiveInteger target = null;
                          target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(TOTDOC$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(TOTDOC$4);
                          }
                          target.set(totDoc);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTEXE$6, 0);
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
                      public cl.sii.siiDte.libroboletas.MontoType xgetTotMntExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTEXE$6, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotMntExe" element
                       */
                      public boolean isSetTotMntExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTMNTEXE$6) != 0;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTEXE$6, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTEXE$6);
                          }
                          target.setLongValue(totMntExe);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntExe" element
                       */
                      public void xsetTotMntExe(cl.sii.siiDte.libroboletas.MontoType totMntExe)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTEXE$6, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(TOTMNTEXE$6);
                          }
                          target.set(totMntExe);
                        }
                      }
                      
                      /**
                       * Unsets the "TotMntExe" element
                       */
                      public void unsetTotMntExe()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTMNTEXE$6, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNETO$8, 0);
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
                      public cl.sii.siiDte.libroboletas.MontoType xgetTotMntNeto()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTNETO$8, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNETO$8, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTNETO$8);
                          }
                          target.setLongValue(totMntNeto);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntNeto" element
                       */
                      public void xsetTotMntNeto(cl.sii.siiDte.libroboletas.MontoType totMntNeto)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTNETO$8, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(TOTMNTNETO$8);
                          }
                          target.set(totMntNeto);
                        }
                      }
                      
                      /**
                       * Gets the "TasaIVA" element
                       */
                      public java.math.BigDecimal getTasaIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIVA$10, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getBigDecimalValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TasaIVA" element
                       */
                      public cl.sii.siiDte.libroboletas.PctType xgetTasaIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.PctType target = null;
                          target = (cl.sii.siiDte.libroboletas.PctType)get_store().find_element_user(TASAIVA$10, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TasaIVA" element
                       */
                      public boolean isSetTasaIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TASAIVA$10) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TasaIVA" element
                       */
                      public void setTasaIVA(java.math.BigDecimal tasaIVA)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIVA$10, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASAIVA$10);
                          }
                          target.setBigDecimalValue(tasaIVA);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TasaIVA" element
                       */
                      public void xsetTasaIVA(cl.sii.siiDte.libroboletas.PctType tasaIVA)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.PctType target = null;
                          target = (cl.sii.siiDte.libroboletas.PctType)get_store().find_element_user(TASAIVA$10, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.PctType)get_store().add_element_user(TASAIVA$10);
                          }
                          target.set(tasaIVA);
                        }
                      }
                      
                      /**
                       * Unsets the "TasaIVA" element
                       */
                      public void unsetTasaIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TASAIVA$10, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVA$12, 0);
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
                      public cl.sii.siiDte.libroboletas.MontoType xgetTotMntIVA()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTIVA$12, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTIVA$12, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTIVA$12);
                          }
                          target.setLongValue(totMntIVA);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntIVA" element
                       */
                      public void xsetTotMntIVA(cl.sii.siiDte.libroboletas.MontoType totMntIVA)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTIVA$12, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(TOTMNTIVA$12);
                          }
                          target.set(totMntIVA);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTTOTAL$14, 0);
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
                      public cl.sii.siiDte.libroboletas.MontoType xgetTotMntTotal()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTTOTAL$14, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTTOTAL$14, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTTOTAL$14);
                          }
                          target.setLongValue(totMntTotal);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntTotal" element
                       */
                      public void xsetTotMntTotal(cl.sii.siiDte.libroboletas.MontoType totMntTotal)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTMNTTOTAL$14, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(TOTMNTTOTAL$14);
                          }
                          target.set(totMntTotal);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNOFACT$16, 0);
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
                      public cl.sii.siiDte.libroboletas.ValorType xgetTotMntNoFact()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTMNTNOFACT$16, 0);
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
                          return get_store().count_elements(TOTMNTNOFACT$16) != 0;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTNOFACT$16, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTNOFACT$16);
                          }
                          target.setLongValue(totMntNoFact);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntNoFact" element
                       */
                      public void xsetTotMntNoFact(cl.sii.siiDte.libroboletas.ValorType totMntNoFact)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTMNTNOFACT$16, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(TOTMNTNOFACT$16);
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
                          get_store().remove_element(TOTMNTNOFACT$16, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTPERIODO$18, 0);
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
                      public cl.sii.siiDte.libroboletas.ValorType xgetTotMntPeriodo()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTMNTPERIODO$18, 0);
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
                          return get_store().count_elements(TOTMNTPERIODO$18) != 0;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTMNTPERIODO$18, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTMNTPERIODO$18);
                          }
                          target.setLongValue(totMntPeriodo);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotMntPeriodo" element
                       */
                      public void xsetTotMntPeriodo(cl.sii.siiDte.libroboletas.ValorType totMntPeriodo)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.ValorType target = null;
                          target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(TOTMNTPERIODO$18, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(TOTMNTPERIODO$18);
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
                          get_store().remove_element(TOTMNTPERIODO$18, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotSaldoAnt" element
                       */
                      public long getTotSaldoAnt()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTSALDOANT$20, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotSaldoAnt" element
                       */
                      public cl.sii.siiDte.libroboletas.MontoType xgetTotSaldoAnt()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTSALDOANT$20, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotSaldoAnt" element
                       */
                      public boolean isSetTotSaldoAnt()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTSALDOANT$20) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotSaldoAnt" element
                       */
                      public void setTotSaldoAnt(long totSaldoAnt)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTSALDOANT$20, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTSALDOANT$20);
                          }
                          target.setLongValue(totSaldoAnt);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotSaldoAnt" element
                       */
                      public void xsetTotSaldoAnt(cl.sii.siiDte.libroboletas.MontoType totSaldoAnt)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTSALDOANT$20, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(TOTSALDOANT$20);
                          }
                          target.set(totSaldoAnt);
                        }
                      }
                      
                      /**
                       * Unsets the "TotSaldoAnt" element
                       */
                      public void unsetTotSaldoAnt()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTSALDOANT$20, 0);
                        }
                      }
                      
                      /**
                       * Gets the "TotVlrPagar" element
                       */
                      public long getTotVlrPagar()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVLRPAGAR$22, 0);
                          if (target == null)
                          {
                            return 0L;
                          }
                          return target.getLongValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "TotVlrPagar" element
                       */
                      public cl.sii.siiDte.libroboletas.MontoType xgetTotVlrPagar()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTVLRPAGAR$22, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "TotVlrPagar" element
                       */
                      public boolean isSetTotVlrPagar()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TOTVLRPAGAR$22) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "TotVlrPagar" element
                       */
                      public void setTotVlrPagar(long totVlrPagar)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTVLRPAGAR$22, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTVLRPAGAR$22);
                          }
                          target.setLongValue(totVlrPagar);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "TotVlrPagar" element
                       */
                      public void xsetTotVlrPagar(cl.sii.siiDte.libroboletas.MontoType totVlrPagar)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.sii.siiDte.libroboletas.MontoType target = null;
                          target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(TOTVLRPAGAR$22, 0);
                          if (target == null)
                          {
                            target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(TOTVLRPAGAR$22);
                          }
                          target.set(totVlrPagar);
                        }
                      }
                      
                      /**
                       * Unsets the "TotVlrPagar" element
                       */
                      public void unsetTotVlrPagar()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TOTVLRPAGAR$22, 0);
                        }
                      }
                      /**
                       * An XML TpoServ(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotalesServicio$TpoServ.
                       */
                      public static class TpoServImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public TpoServImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected TpoServImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                    }
                }
            }
            /**
             * An XML Detalle(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class DetalleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle
            {
                private static final long serialVersionUID = 1L;
                
                public DetalleImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TPODOC$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDoc");
                private static final javax.xml.namespace.QName FOLIODOC$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FolioDoc");
                private static final javax.xml.namespace.QName ANULADO$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Anulado");
                private static final javax.xml.namespace.QName TPOSERV$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoServ");
                private static final javax.xml.namespace.QName FCHEMIDOC$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchEmiDoc");
                private static final javax.xml.namespace.QName FCHVENCDOC$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchVencDoc");
                private static final javax.xml.namespace.QName PERIODODESDE$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PeriodoDesde");
                private static final javax.xml.namespace.QName PERIODOHASTA$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "PeriodoHasta");
                private static final javax.xml.namespace.QName CDGSIISUCUR$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CdgSIISucur");
                private static final javax.xml.namespace.QName RUTCLIENTE$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTCliente");
                private static final javax.xml.namespace.QName CODINTCLI$20 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodIntCli");
                private static final javax.xml.namespace.QName MNTEXE$22 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntExe");
                private static final javax.xml.namespace.QName MNTTOTAL$24 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntTotal");
                private static final javax.xml.namespace.QName MNTNOFACT$26 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntNoFact");
                private static final javax.xml.namespace.QName MNTPERIODO$28 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntPeriodo");
                private static final javax.xml.namespace.QName SALDOANT$30 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SaldoAnt");
                private static final javax.xml.namespace.QName VLRPAGAR$32 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "VlrPagar");
                
                
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
                public cl.sii.siiDte.libroboletas.DoctoType xgetTpoDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.DoctoType target = null;
                      target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().find_element_user(TPODOC$0, 0);
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
                public void xsetTpoDoc(cl.sii.siiDte.libroboletas.DoctoType tpoDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.DoctoType target = null;
                      target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().find_element_user(TPODOC$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.DoctoType)get_store().add_element_user(TPODOC$0);
                      }
                      target.set(tpoDoc);
                    }
                }
                
                /**
                 * Gets the "FolioDoc" element
                 */
                public long getFolioDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIODOC$2, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FolioDoc" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc xgetFolioDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc)get_store().find_element_user(FOLIODOC$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FolioDoc" element
                 */
                public void setFolioDoc(long folioDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIODOC$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIODOC$2);
                      }
                      target.setLongValue(folioDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "FolioDoc" element
                 */
                public void xsetFolioDoc(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc folioDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc)get_store().find_element_user(FOLIODOC$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc)get_store().add_element_user(FOLIODOC$2);
                      }
                      target.set(folioDoc);
                    }
                }
                
                /**
                 * Gets the "Anulado" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado.Enum getAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANULADO$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Anulado" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado xgetAnulado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado)get_store().find_element_user(ANULADO$4, 0);
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
                      return get_store().count_elements(ANULADO$4) != 0;
                    }
                }
                
                /**
                 * Sets the "Anulado" element
                 */
                public void setAnulado(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado.Enum anulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANULADO$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANULADO$4);
                      }
                      target.setEnumValue(anulado);
                    }
                }
                
                /**
                 * Sets (as xml) the "Anulado" element
                 */
                public void xsetAnulado(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado anulado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado)get_store().find_element_user(ANULADO$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado)get_store().add_element_user(ANULADO$4);
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
                      get_store().remove_element(ANULADO$4, 0);
                    }
                }
                
                /**
                 * Gets the "TpoServ" element
                 */
                public int getTpoServ()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOSERV$6, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TpoServ" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ xgetTpoServ()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ)get_store().find_element_user(TPOSERV$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TpoServ" element
                 */
                public boolean isSetTpoServ()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TPOSERV$6) != 0;
                    }
                }
                
                /**
                 * Sets the "TpoServ" element
                 */
                public void setTpoServ(int tpoServ)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPOSERV$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPOSERV$6);
                      }
                      target.setIntValue(tpoServ);
                    }
                }
                
                /**
                 * Sets (as xml) the "TpoServ" element
                 */
                public void xsetTpoServ(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ tpoServ)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ)get_store().find_element_user(TPOSERV$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ)get_store().add_element_user(TPOSERV$6);
                      }
                      target.set(tpoServ);
                    }
                }
                
                /**
                 * Unsets the "TpoServ" element
                 */
                public void unsetTpoServ()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TPOSERV$6, 0);
                    }
                }
                
                /**
                 * Gets the "FchEmiDoc" element
                 */
                public java.util.Calendar getFchEmiDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMIDOC$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchEmiDoc" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchEmiDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMIDOC$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "FchEmiDoc" element
                 */
                public boolean isSetFchEmiDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FCHEMIDOC$8) != 0;
                    }
                }
                
                /**
                 * Sets the "FchEmiDoc" element
                 */
                public void setFchEmiDoc(java.util.Calendar fchEmiDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMIDOC$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHEMIDOC$8);
                      }
                      target.setCalendarValue(fchEmiDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchEmiDoc" element
                 */
                public void xsetFchEmiDoc(org.apache.xmlbeans.XmlDate fchEmiDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMIDOC$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHEMIDOC$8);
                      }
                      target.set(fchEmiDoc);
                    }
                }
                
                /**
                 * Unsets the "FchEmiDoc" element
                 */
                public void unsetFchEmiDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FCHEMIDOC$8, 0);
                    }
                }
                
                /**
                 * Gets the "FchVencDoc" element
                 */
                public java.util.Calendar getFchVencDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHVENCDOC$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchVencDoc" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchVencDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHVENCDOC$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "FchVencDoc" element
                 */
                public boolean isSetFchVencDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FCHVENCDOC$10) != 0;
                    }
                }
                
                /**
                 * Sets the "FchVencDoc" element
                 */
                public void setFchVencDoc(java.util.Calendar fchVencDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHVENCDOC$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHVENCDOC$10);
                      }
                      target.setCalendarValue(fchVencDoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchVencDoc" element
                 */
                public void xsetFchVencDoc(org.apache.xmlbeans.XmlDate fchVencDoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHVENCDOC$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHVENCDOC$10);
                      }
                      target.set(fchVencDoc);
                    }
                }
                
                /**
                 * Unsets the "FchVencDoc" element
                 */
                public void unsetFchVencDoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FCHVENCDOC$10, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODODESDE$12, 0);
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
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PERIODODESDE$12, 0);
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
                      return get_store().count_elements(PERIODODESDE$12) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODODESDE$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODODESDE$12);
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
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PERIODODESDE$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PERIODODESDE$12);
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
                      get_store().remove_element(PERIODODESDE$12, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOHASTA$14, 0);
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
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PERIODOHASTA$14, 0);
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
                      return get_store().count_elements(PERIODOHASTA$14) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOHASTA$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODOHASTA$14);
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
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PERIODOHASTA$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PERIODOHASTA$14);
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
                      get_store().remove_element(PERIODOHASTA$14, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDGSIISUCUR$16, 0);
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
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur xgetCdgSIISucur()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur)get_store().find_element_user(CDGSIISUCUR$16, 0);
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
                      return get_store().count_elements(CDGSIISUCUR$16) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDGSIISUCUR$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDGSIISUCUR$16);
                      }
                      target.setIntValue(cdgSIISucur);
                    }
                }
                
                /**
                 * Sets (as xml) the "CdgSIISucur" element
                 */
                public void xsetCdgSIISucur(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur cdgSIISucur)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur)get_store().find_element_user(CDGSIISUCUR$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur)get_store().add_element_user(CDGSIISUCUR$16);
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
                      get_store().remove_element(CDGSIISUCUR$16, 0);
                    }
                }
                
                /**
                 * Gets the "RUTCliente" element
                 */
                public java.lang.String getRUTCliente()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTCLIENTE$18, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RUTCliente" element
                 */
                public cl.sii.siiDte.libroboletas.RUTType xgetRUTCliente()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.RUTType target = null;
                      target = (cl.sii.siiDte.libroboletas.RUTType)get_store().find_element_user(RUTCLIENTE$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RUTCliente" element
                 */
                public boolean isSetRUTCliente()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RUTCLIENTE$18) != 0;
                    }
                }
                
                /**
                 * Sets the "RUTCliente" element
                 */
                public void setRUTCliente(java.lang.String rutCliente)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTCLIENTE$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTCLIENTE$18);
                      }
                      target.setStringValue(rutCliente);
                    }
                }
                
                /**
                 * Sets (as xml) the "RUTCliente" element
                 */
                public void xsetRUTCliente(cl.sii.siiDte.libroboletas.RUTType rutCliente)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.RUTType target = null;
                      target = (cl.sii.siiDte.libroboletas.RUTType)get_store().find_element_user(RUTCLIENTE$18, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.RUTType)get_store().add_element_user(RUTCLIENTE$18);
                      }
                      target.set(rutCliente);
                    }
                }
                
                /**
                 * Unsets the "RUTCliente" element
                 */
                public void unsetRUTCliente()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RUTCLIENTE$18, 0);
                    }
                }
                
                /**
                 * Gets the "CodIntCli" element
                 */
                public java.lang.String getCodIntCli()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODINTCLI$20, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CodIntCli" element
                 */
                public cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli xgetCodIntCli()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli)get_store().find_element_user(CODINTCLI$20, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CodIntCli" element
                 */
                public boolean isSetCodIntCli()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CODINTCLI$20) != 0;
                    }
                }
                
                /**
                 * Sets the "CodIntCli" element
                 */
                public void setCodIntCli(java.lang.String codIntCli)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODINTCLI$20, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODINTCLI$20);
                      }
                      target.setStringValue(codIntCli);
                    }
                }
                
                /**
                 * Sets (as xml) the "CodIntCli" element
                 */
                public void xsetCodIntCli(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli codIntCli)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli target = null;
                      target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli)get_store().find_element_user(CODINTCLI$20, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli)get_store().add_element_user(CODINTCLI$20);
                      }
                      target.set(codIntCli);
                    }
                }
                
                /**
                 * Unsets the "CodIntCli" element
                 */
                public void unsetCodIntCli()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CODINTCLI$20, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTEXE$22, 0);
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
                public cl.sii.siiDte.libroboletas.MontoType xgetMntExe()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.MontoType target = null;
                      target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(MNTEXE$22, 0);
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
                      return get_store().count_elements(MNTEXE$22) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTEXE$22, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTEXE$22);
                      }
                      target.setLongValue(mntExe);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntExe" element
                 */
                public void xsetMntExe(cl.sii.siiDte.libroboletas.MontoType mntExe)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.MontoType target = null;
                      target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(MNTEXE$22, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(MNTEXE$22);
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
                      get_store().remove_element(MNTEXE$22, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$24, 0);
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
                public cl.sii.siiDte.libroboletas.MontoType xgetMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.MontoType target = null;
                      target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(MNTTOTAL$24, 0);
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
                      return get_store().count_elements(MNTTOTAL$24) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTTOTAL$24);
                      }
                      target.setLongValue(mntTotal);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntTotal" element
                 */
                public void xsetMntTotal(cl.sii.siiDte.libroboletas.MontoType mntTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.MontoType target = null;
                      target = (cl.sii.siiDte.libroboletas.MontoType)get_store().find_element_user(MNTTOTAL$24, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.MontoType)get_store().add_element_user(MNTTOTAL$24);
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
                      get_store().remove_element(MNTTOTAL$24, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNOFACT$26, 0);
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
                public cl.sii.siiDte.libroboletas.ValorType xgetMntNoFact()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.ValorType target = null;
                      target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(MNTNOFACT$26, 0);
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
                      return get_store().count_elements(MNTNOFACT$26) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNOFACT$26, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTNOFACT$26);
                      }
                      target.setLongValue(mntNoFact);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntNoFact" element
                 */
                public void xsetMntNoFact(cl.sii.siiDte.libroboletas.ValorType mntNoFact)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.ValorType target = null;
                      target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(MNTNOFACT$26, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(MNTNOFACT$26);
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
                      get_store().remove_element(MNTNOFACT$26, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTPERIODO$28, 0);
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
                public cl.sii.siiDte.libroboletas.ValorType xgetMntPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.ValorType target = null;
                      target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(MNTPERIODO$28, 0);
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
                      return get_store().count_elements(MNTPERIODO$28) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTPERIODO$28, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTPERIODO$28);
                      }
                      target.setLongValue(mntPeriodo);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntPeriodo" element
                 */
                public void xsetMntPeriodo(cl.sii.siiDte.libroboletas.ValorType mntPeriodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.ValorType target = null;
                      target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(MNTPERIODO$28, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(MNTPERIODO$28);
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
                      get_store().remove_element(MNTPERIODO$28, 0);
                    }
                }
                
                /**
                 * Gets the "SaldoAnt" element
                 */
                public long getSaldoAnt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOANT$30, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SaldoAnt" element
                 */
                public cl.sii.siiDte.libroboletas.ValorType xgetSaldoAnt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.ValorType target = null;
                      target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(SALDOANT$30, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "SaldoAnt" element
                 */
                public boolean isSetSaldoAnt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SALDOANT$30) != 0;
                    }
                }
                
                /**
                 * Sets the "SaldoAnt" element
                 */
                public void setSaldoAnt(long saldoAnt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOANT$30, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDOANT$30);
                      }
                      target.setLongValue(saldoAnt);
                    }
                }
                
                /**
                 * Sets (as xml) the "SaldoAnt" element
                 */
                public void xsetSaldoAnt(cl.sii.siiDte.libroboletas.ValorType saldoAnt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.ValorType target = null;
                      target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(SALDOANT$30, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(SALDOANT$30);
                      }
                      target.set(saldoAnt);
                    }
                }
                
                /**
                 * Unsets the "SaldoAnt" element
                 */
                public void unsetSaldoAnt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SALDOANT$30, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VLRPAGAR$32, 0);
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
                public cl.sii.siiDte.libroboletas.ValorType xgetVlrPagar()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.ValorType target = null;
                      target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(VLRPAGAR$32, 0);
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
                      return get_store().count_elements(VLRPAGAR$32) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VLRPAGAR$32, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VLRPAGAR$32);
                      }
                      target.setLongValue(vlrPagar);
                    }
                }
                
                /**
                 * Sets (as xml) the "VlrPagar" element
                 */
                public void xsetVlrPagar(cl.sii.siiDte.libroboletas.ValorType vlrPagar)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroboletas.ValorType target = null;
                      target = (cl.sii.siiDte.libroboletas.ValorType)get_store().find_element_user(VLRPAGAR$32, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroboletas.ValorType)get_store().add_element_user(VLRPAGAR$32);
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
                      get_store().remove_element(VLRPAGAR$32, 0);
                    }
                }
                /**
                 * An XML FolioDoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$FolioDoc.
                 */
                public static class FolioDocImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FolioDocImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FolioDocImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML Anulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$Anulado.
                 */
                public static class AnuladoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado
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
                 * An XML TpoServ(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$TpoServ.
                 */
                public static class TpoServImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TpoServImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TpoServImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CdgSIISucur(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$CdgSIISucur.
                 */
                public static class CdgSIISucurImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur
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
                 * An XML CodIntCli(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$CodIntCli.
                 */
                public static class CodIntCliImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CodIntCliImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CodIntCliImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML TmstFirma(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$TmstFirma.
             */
            public static class TmstFirmaImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma
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
