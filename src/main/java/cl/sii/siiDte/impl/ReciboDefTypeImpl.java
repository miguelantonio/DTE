/*
 * XML Type:  ReciboDefType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.ReciboDefType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * An XML ReciboDefType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public class ReciboDefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.ReciboDefType
{
    private static final long serialVersionUID = 1L;
    
    public ReciboDefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.ReciboDefTypeExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTORECIBO$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DocumentoRecibo");
    private static final javax.xml.namespace.QName SIGNATURE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("", "version");
    
    
    /**
     * Gets the "DocumentoRecibo" element
     */
    public cl.sii.siiDte.ReciboDefType.DocumentoRecibo getDocumentoRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.ReciboDefType.DocumentoRecibo target = null;
            target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo)get_store().find_element_user(DOCUMENTORECIBO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DocumentoRecibo" element
     */
    public void setDocumentoRecibo(cl.sii.siiDte.ReciboDefType.DocumentoRecibo documentoRecibo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.ReciboDefType.DocumentoRecibo target = null;
            target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo)get_store().find_element_user(DOCUMENTORECIBO$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo)get_store().add_element_user(DOCUMENTORECIBO$0);
            }
            target.set(documentoRecibo);
        }
    }
    
    /**
     * Appends and returns a new empty "DocumentoRecibo" element
     */
    public cl.sii.siiDte.ReciboDefType.DocumentoRecibo addNewDocumentoRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.ReciboDefType.DocumentoRecibo target = null;
            target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo)get_store().add_element_user(DOCUMENTORECIBO$0);
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
     * An XML DocumentoRecibo(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class DocumentoReciboImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.ReciboDefType.DocumentoRecibo
    {
        private static final long serialVersionUID = 1L;
        
        public DocumentoReciboImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TIPODOC$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoDoc");
        private static final javax.xml.namespace.QName FOLIO$2 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Folio");
        private static final javax.xml.namespace.QName FCHEMIS$4 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchEmis");
        private static final javax.xml.namespace.QName RUTEMISOR$6 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTEmisor");
        private static final javax.xml.namespace.QName RUTRECEP$8 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTRecep");
        private static final javax.xml.namespace.QName MNTTOTAL$10 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntTotal");
        private static final javax.xml.namespace.QName RECINTO$12 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Recinto");
        private static final javax.xml.namespace.QName RUTFIRMA$14 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutFirma");
        private static final javax.xml.namespace.QName DECLARACION$16 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Declaracion");
        private static final javax.xml.namespace.QName TMSTFIRMARECIBO$18 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TmstFirmaRecibo");
        private static final javax.xml.namespace.QName ID$20 = 
            new javax.xml.namespace.QName("", "ID");
        
        
        /**
         * Gets the "TipoDoc" element
         */
        public java.math.BigInteger getTipoDoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "TipoDoc" element
         */
        public cl.sii.siiDte.DocType2 xgetTipoDoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.DocType2 target = null;
                target = (cl.sii.siiDte.DocType2)get_store().find_element_user(TIPODOC$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TipoDoc" element
         */
        public void setTipoDoc(java.math.BigInteger tipoDoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOC$0);
                }
                target.setBigIntegerValue(tipoDoc);
            }
        }
        
        /**
         * Sets (as xml) the "TipoDoc" element
         */
        public void xsetTipoDoc(cl.sii.siiDte.DocType2 tipoDoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.DocType2 target = null;
                target = (cl.sii.siiDte.DocType2)get_store().find_element_user(TIPODOC$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.DocType2)get_store().add_element_user(TIPODOC$0);
                }
                target.set(tipoDoc);
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
        public cl.sii.siiDte.FolioType xgetFolio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.FolioType target = null;
                target = (cl.sii.siiDte.FolioType)get_store().find_element_user(FOLIO$2, 0);
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
        public void xsetFolio(cl.sii.siiDte.FolioType folio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.FolioType target = null;
                target = (cl.sii.siiDte.FolioType)get_store().find_element_user(FOLIO$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.FolioType)get_store().add_element_user(FOLIO$2);
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
         * Gets the "RUTEmisor" element
         */
        public java.lang.String getRUTEmisor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$6, 0);
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
        public cl.sii.siiDte.RUTType xgetRUTEmisor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTEMISOR$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTEMISOR$6);
                }
                target.setStringValue(rutEmisor);
            }
        }
        
        /**
         * Sets (as xml) the "RUTEmisor" element
         */
        public void xsetRUTEmisor(cl.sii.siiDte.RUTType rutEmisor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTEMISOR$6, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTEMISOR$6);
                }
                target.set(rutEmisor);
            }
        }
        
        /**
         * Gets the "RUTRecep" element
         */
        public java.lang.String getRUTRecep()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEP$8, 0);
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
        public cl.sii.siiDte.RUTType xgetRUTRecep()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECEP$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEP$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTRECEP$8);
                }
                target.setStringValue(rutRecep);
            }
        }
        
        /**
         * Sets (as xml) the "RUTRecep" element
         */
        public void xsetRUTRecep(cl.sii.siiDte.RUTType rutRecep)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECEP$8, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTRECEP$8);
                }
                target.set(rutRecep);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$10, 0);
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
        public cl.sii.siiDte.MontoType xgetMntTotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.MontoType target = null;
                target = (cl.sii.siiDte.MontoType)get_store().find_element_user(MNTTOTAL$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTTOTAL$10);
                }
                target.setLongValue(mntTotal);
            }
        }
        
        /**
         * Sets (as xml) the "MntTotal" element
         */
        public void xsetMntTotal(cl.sii.siiDte.MontoType mntTotal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.MontoType target = null;
                target = (cl.sii.siiDte.MontoType)get_store().find_element_user(MNTTOTAL$10, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.MontoType)get_store().add_element_user(MNTTOTAL$10);
                }
                target.set(mntTotal);
            }
        }
        
        /**
         * Gets the "Recinto" element
         */
        public java.lang.String getRecinto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECINTO$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Recinto" element
         */
        public cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto xgetRecinto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto target = null;
                target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto)get_store().find_element_user(RECINTO$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Recinto" element
         */
        public void setRecinto(java.lang.String recinto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECINTO$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECINTO$12);
                }
                target.setStringValue(recinto);
            }
        }
        
        /**
         * Sets (as xml) the "Recinto" element
         */
        public void xsetRecinto(cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto recinto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto target = null;
                target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto)get_store().find_element_user(RECINTO$12, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto)get_store().add_element_user(RECINTO$12);
                }
                target.set(recinto);
            }
        }
        
        /**
         * Gets the "RutFirma" element
         */
        public java.lang.String getRutFirma()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTFIRMA$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RutFirma" element
         */
        public cl.sii.siiDte.RUTType xgetRutFirma()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTFIRMA$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RutFirma" element
         */
        public void setRutFirma(java.lang.String rutFirma)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTFIRMA$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTFIRMA$14);
                }
                target.setStringValue(rutFirma);
            }
        }
        
        /**
         * Sets (as xml) the "RutFirma" element
         */
        public void xsetRutFirma(cl.sii.siiDte.RUTType rutFirma)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTFIRMA$14, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTFIRMA$14);
                }
                target.set(rutFirma);
            }
        }
        
        /**
         * Gets the "Declaracion" element
         */
        public java.lang.String getDeclaracion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECLARACION$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Declaracion" element
         */
        public cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion xgetDeclaracion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion target = null;
                target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion)get_store().find_element_user(DECLARACION$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Declaracion" element
         */
        public void setDeclaracion(java.lang.String declaracion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECLARACION$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECLARACION$16);
                }
                target.setStringValue(declaracion);
            }
        }
        
        /**
         * Sets (as xml) the "Declaracion" element
         */
        public void xsetDeclaracion(cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion declaracion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion target = null;
                target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion)get_store().find_element_user(DECLARACION$16, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion)get_store().add_element_user(DECLARACION$16);
                }
                target.set(declaracion);
            }
        }
        
        /**
         * Gets the "TmstFirmaRecibo" element
         */
        public java.util.Calendar getTmstFirmaRecibo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMARECIBO$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "TmstFirmaRecibo" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetTmstFirmaRecibo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMARECIBO$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TmstFirmaRecibo" element
         */
        public void setTmstFirmaRecibo(java.util.Calendar tmstFirmaRecibo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMARECIBO$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTFIRMARECIBO$18);
                }
                target.setCalendarValue(tmstFirmaRecibo);
            }
        }
        
        /**
         * Sets (as xml) the "TmstFirmaRecibo" element
         */
        public void xsetTmstFirmaRecibo(org.apache.xmlbeans.XmlDateTime tmstFirmaRecibo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMARECIBO$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TMSTFIRMARECIBO$18);
                }
                target.set(tmstFirmaRecibo);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$20);
                }
                target.set(id);
            }
        }
        /**
         * An XML Recinto(@http://www.sii.cl/SiiDte).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.ReciboDefType$DocumentoRecibo$Recinto.
         */
        public static class RecintoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto
        {
            private static final long serialVersionUID = 1L;
            
            public RecintoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RecintoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Declaracion(@http://www.sii.cl/SiiDte).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.ReciboDefType$DocumentoRecibo$Declaracion.
         */
        public static class DeclaracionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion
        {
            private static final long serialVersionUID = 1L;
            
            public DeclaracionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DeclaracionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
