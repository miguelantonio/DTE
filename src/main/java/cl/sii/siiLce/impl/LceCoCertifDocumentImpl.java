/*
 * An XML document type.
 * Localname: LceCoCertif
 * Namespace: http://www.sii.cl/SiiLce
 * Java type: cl.sii.siiLce.LceCoCertifDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiLce.impl;
/**
 * A document containing one LceCoCertif(@http://www.sii.cl/SiiLce) element.
 *
 * This is a complex type.
 */
public class LceCoCertifDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiLce.LceCoCertifDocument
{
    private static final long serialVersionUID = 1L;
    
    public LceCoCertifDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LCECOCERTIF$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "LceCoCertif");
    
    
    /**
     * Gets the "LceCoCertif" element
     */
    public cl.sii.siiLce.LceCoCertifDocument.LceCoCertif getLceCoCertif()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiLce.LceCoCertifDocument.LceCoCertif target = null;
            target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif)get_store().find_element_user(LCECOCERTIF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif)get_store().find_element_user(LCECOCERTIF$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif)get_store().add_element_user(LCECOCERTIF$0);
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
            target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif)get_store().add_element_user(LCECOCERTIF$0);
            return target;
        }
    }
    /**
     * An XML LceCoCertif(@http://www.sii.cl/SiiLce).
     *
     * This is a complex type.
     */
    public static class LceCoCertifImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiLce.LceCoCertifDocument.LceCoCertif
    {
        private static final long serialVersionUID = 1L;
        
        public LceCoCertifImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCUMENTOCOCERTIF$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "DocumentoCoCertif");
        private static final javax.xml.namespace.QName SIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "DocumentoCoCertif" element
         */
        public cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif getDocumentoCoCertif()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif target = null;
                target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif)get_store().find_element_user(DOCUMENTOCOCERTIF$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "DocumentoCoCertif" element
         */
        public void setDocumentoCoCertif(cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif documentoCoCertif)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif target = null;
                target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif)get_store().find_element_user(DOCUMENTOCOCERTIF$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif)get_store().add_element_user(DOCUMENTOCOCERTIF$0);
                }
                target.set(documentoCoCertif);
            }
        }
        
        /**
         * Appends and returns a new empty "DocumentoCoCertif" element
         */
        public cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif addNewDocumentoCoCertif()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif target = null;
                target = (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif)get_store().add_element_user(DOCUMENTOCOCERTIF$0);
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
         * An XML DocumentoCoCertif(@http://www.sii.cl/SiiLce).
         *
         * This is a complex type.
         */
        public static class DocumentoCoCertifImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif
        {
            private static final long serialVersionUID = 1L;
            
            public DocumentoCoCertifImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RUTCONTRIBUYENTE$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "RutContribuyente");
            private static final javax.xml.namespace.QName FCHEMISION$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "FchEmision");
            private static final javax.xml.namespace.QName LCECAL$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "LceCal");
            private static final javax.xml.namespace.QName RUTFIRMANTEDISTRIBUIDOR$6 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "RutFirmanteDistribuidor");
            private static final javax.xml.namespace.QName TMSTFIRMA$8 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "TmstFirma");
            private static final javax.xml.namespace.QName ID$10 = 
                new javax.xml.namespace.QName("", "ID");
            
            
            /**
             * Gets the "RutContribuyente" element
             */
            public java.lang.String getRutContribuyente()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTCONTRIBUYENTE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RutContribuyente" element
             */
            public cl.sii.siiLce.RUTType xgetRutContribuyente()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.RUTType target = null;
                    target = (cl.sii.siiLce.RUTType)get_store().find_element_user(RUTCONTRIBUYENTE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RutContribuyente" element
             */
            public void setRutContribuyente(java.lang.String rutContribuyente)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTCONTRIBUYENTE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTCONTRIBUYENTE$0);
                    }
                    target.setStringValue(rutContribuyente);
                }
            }
            
            /**
             * Sets (as xml) the "RutContribuyente" element
             */
            public void xsetRutContribuyente(cl.sii.siiLce.RUTType rutContribuyente)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.RUTType target = null;
                    target = (cl.sii.siiLce.RUTType)get_store().find_element_user(RUTCONTRIBUYENTE$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.RUTType)get_store().add_element_user(RUTCONTRIBUYENTE$0);
                    }
                    target.set(rutContribuyente);
                }
            }
            
            /**
             * Gets the "FchEmision" element
             */
            public java.util.Calendar getFchEmision()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMISION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "FchEmision" element
             */
            public org.apache.xmlbeans.XmlDate xgetFchEmision()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMISION$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "FchEmision" element
             */
            public void setFchEmision(java.util.Calendar fchEmision)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMISION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHEMISION$2);
                    }
                    target.setCalendarValue(fchEmision);
                }
            }
            
            /**
             * Sets (as xml) the "FchEmision" element
             */
            public void xsetFchEmision(org.apache.xmlbeans.XmlDate fchEmision)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMISION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHEMISION$2);
                    }
                    target.set(fchEmision);
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
                    target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().find_element_user(LCECAL$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
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
                    target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().find_element_user(LCECAL$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().add_element_user(LCECAL$4);
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
                    target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().add_element_user(LCECAL$4);
                    return target;
                }
            }
            
            /**
             * Gets the "RutFirmanteDistribuidor" element
             */
            public java.lang.String getRutFirmanteDistribuidor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTFIRMANTEDISTRIBUIDOR$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RutFirmanteDistribuidor" element
             */
            public cl.sii.siiLce.RUTType xgetRutFirmanteDistribuidor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.RUTType target = null;
                    target = (cl.sii.siiLce.RUTType)get_store().find_element_user(RUTFIRMANTEDISTRIBUIDOR$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RutFirmanteDistribuidor" element
             */
            public void setRutFirmanteDistribuidor(java.lang.String rutFirmanteDistribuidor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTFIRMANTEDISTRIBUIDOR$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTFIRMANTEDISTRIBUIDOR$6);
                    }
                    target.setStringValue(rutFirmanteDistribuidor);
                }
            }
            
            /**
             * Sets (as xml) the "RutFirmanteDistribuidor" element
             */
            public void xsetRutFirmanteDistribuidor(cl.sii.siiLce.RUTType rutFirmanteDistribuidor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.RUTType target = null;
                    target = (cl.sii.siiLce.RUTType)get_store().find_element_user(RUTFIRMANTEDISTRIBUIDOR$6, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.RUTType)get_store().add_element_user(RUTFIRMANTEDISTRIBUIDOR$6);
                    }
                    target.set(rutFirmanteDistribuidor);
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
        }
    }
}
