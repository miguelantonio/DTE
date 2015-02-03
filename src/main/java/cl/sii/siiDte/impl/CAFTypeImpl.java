/*
 * XML Type:  CAFType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.CAFType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * An XML CAFType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public class CAFTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.CAFType
{
    private static final long serialVersionUID = 1L;
    
    public CAFTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.CAFTypeExtensionHandler
      
     */
    public java.security.PublicKey getPublicKey() throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException
    {
        return 
      cl.nic.dte.extension.CAFTypeExtensionHandler
      .getPublicKey(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.CAFTypeExtensionHandler
      
     */
    public cl.sii.siiDte.DTEDefType.Documento.TED.DD.CAF getCAFforDocument()
    {
        return 
      cl.nic.dte.extension.CAFTypeExtensionHandler
      .getCAFforDocument(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.CAFTypeExtensionHandler
      
     */
    public cl.sii.siiDte.DTEDefType.Exportaciones.TED.DD.CAF getCAFforExportacion()
    {
        return 
      cl.nic.dte.extension.CAFTypeExtensionHandler
      .getCAFforExportacion(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.CAFTypeExtensionHandler
      
     */
    public cl.sii.siiDte.DTEDefType.Liquidacion.TED.DD.CAF getCAFforLiquidacion()
    {
        return 
      cl.nic.dte.extension.CAFTypeExtensionHandler
      .getCAFforLiquidacion(this);
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
    public cl.sii.siiDte.CAFType.DA getDA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType.DA target = null;
            target = (cl.sii.siiDte.CAFType.DA)get_store().find_element_user(DA$0, 0);
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
    public void setDA(cl.sii.siiDte.CAFType.DA da)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType.DA target = null;
            target = (cl.sii.siiDte.CAFType.DA)get_store().find_element_user(DA$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.CAFType.DA)get_store().add_element_user(DA$0);
            }
            target.set(da);
        }
    }
    
    /**
     * Appends and returns a new empty "DA" element
     */
    public cl.sii.siiDte.CAFType.DA addNewDA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType.DA target = null;
            target = (cl.sii.siiDte.CAFType.DA)get_store().add_element_user(DA$0);
            return target;
        }
    }
    
    /**
     * Gets the "FRMA" element
     */
    public cl.sii.siiDte.CAFType.FRMA getFRMA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType.FRMA target = null;
            target = (cl.sii.siiDte.CAFType.FRMA)get_store().find_element_user(FRMA$2, 0);
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
    public void setFRMA(cl.sii.siiDte.CAFType.FRMA frma)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType.FRMA target = null;
            target = (cl.sii.siiDte.CAFType.FRMA)get_store().find_element_user(FRMA$2, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.CAFType.FRMA)get_store().add_element_user(FRMA$2);
            }
            target.set(frma);
        }
    }
    
    /**
     * Appends and returns a new empty "FRMA" element
     */
    public cl.sii.siiDte.CAFType.FRMA addNewFRMA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType.FRMA target = null;
            target = (cl.sii.siiDte.CAFType.FRMA)get_store().add_element_user(FRMA$2);
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
    public static class DAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.CAFType.DA
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
        public cl.sii.siiDte.RUTType xgetRE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RE$0, 0);
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
        public void xsetRE(cl.sii.siiDte.RUTType re)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RE$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RE$0);
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
        public cl.sii.siiDte.CAFType.DA.RS xgetRS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.RS target = null;
                target = (cl.sii.siiDte.CAFType.DA.RS)get_store().find_element_user(RS$2, 0);
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
        public void xsetRS(cl.sii.siiDte.CAFType.DA.RS rs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.RS target = null;
                target = (cl.sii.siiDte.CAFType.DA.RS)get_store().find_element_user(RS$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.CAFType.DA.RS)get_store().add_element_user(RS$2);
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
        public cl.sii.siiDte.DTEType xgetTD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.DTEType target = null;
                target = (cl.sii.siiDte.DTEType)get_store().find_element_user(TD$4, 0);
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
        public void xsetTD(cl.sii.siiDte.DTEType td)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.DTEType target = null;
                target = (cl.sii.siiDte.DTEType)get_store().find_element_user(TD$4, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.DTEType)get_store().add_element_user(TD$4);
                }
                target.set(td);
            }
        }
        
        /**
         * Gets the "RNG" element
         */
        public cl.sii.siiDte.CAFType.DA.RNG getRNG()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.RNG target = null;
                target = (cl.sii.siiDte.CAFType.DA.RNG)get_store().find_element_user(RNG$6, 0);
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
        public void setRNG(cl.sii.siiDte.CAFType.DA.RNG rng)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.RNG target = null;
                target = (cl.sii.siiDte.CAFType.DA.RNG)get_store().find_element_user(RNG$6, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.CAFType.DA.RNG)get_store().add_element_user(RNG$6);
                }
                target.set(rng);
            }
        }
        
        /**
         * Appends and returns a new empty "RNG" element
         */
        public cl.sii.siiDte.CAFType.DA.RNG addNewRNG()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.RNG target = null;
                target = (cl.sii.siiDte.CAFType.DA.RNG)get_store().add_element_user(RNG$6);
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
        public cl.sii.siiDte.CAFType.DA.RSAPK getRSAPK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.RSAPK target = null;
                target = (cl.sii.siiDte.CAFType.DA.RSAPK)get_store().find_element_user(RSAPK$10, 0);
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
        public void setRSAPK(cl.sii.siiDte.CAFType.DA.RSAPK rsapk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.RSAPK target = null;
                target = (cl.sii.siiDte.CAFType.DA.RSAPK)get_store().find_element_user(RSAPK$10, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.CAFType.DA.RSAPK)get_store().add_element_user(RSAPK$10);
                }
                target.set(rsapk);
            }
        }
        
        /**
         * Appends and returns a new empty "RSAPK" element
         */
        public cl.sii.siiDte.CAFType.DA.RSAPK addNewRSAPK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.RSAPK target = null;
                target = (cl.sii.siiDte.CAFType.DA.RSAPK)get_store().add_element_user(RSAPK$10);
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
        public cl.sii.siiDte.CAFType.DA.DSAPK getDSAPK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.DSAPK target = null;
                target = (cl.sii.siiDte.CAFType.DA.DSAPK)get_store().find_element_user(DSAPK$12, 0);
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
        public void setDSAPK(cl.sii.siiDte.CAFType.DA.DSAPK dsapk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.DSAPK target = null;
                target = (cl.sii.siiDte.CAFType.DA.DSAPK)get_store().find_element_user(DSAPK$12, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.CAFType.DA.DSAPK)get_store().add_element_user(DSAPK$12);
                }
                target.set(dsapk);
            }
        }
        
        /**
         * Appends and returns a new empty "DSAPK" element
         */
        public cl.sii.siiDte.CAFType.DA.DSAPK addNewDSAPK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType.DA.DSAPK target = null;
                target = (cl.sii.siiDte.CAFType.DA.DSAPK)get_store().add_element_user(DSAPK$12);
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
         * This is an atomic type that is a restriction of cl.sii.siiDte.CAFType$DA$RS.
         */
        public static class RSImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.CAFType.DA.RS
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
        public static class RNGImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.CAFType.DA.RNG
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
            public cl.sii.siiDte.FolioType xgetD()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.FolioType target = null;
                    target = (cl.sii.siiDte.FolioType)get_store().find_element_user(D$0, 0);
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
            public void xsetD(cl.sii.siiDte.FolioType d)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.FolioType target = null;
                    target = (cl.sii.siiDte.FolioType)get_store().find_element_user(D$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.FolioType)get_store().add_element_user(D$0);
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
            public cl.sii.siiDte.FolioType xgetH()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.FolioType target = null;
                    target = (cl.sii.siiDte.FolioType)get_store().find_element_user(H$2, 0);
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
            public void xsetH(cl.sii.siiDte.FolioType h)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.FolioType target = null;
                    target = (cl.sii.siiDte.FolioType)get_store().find_element_user(H$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.FolioType)get_store().add_element_user(H$2);
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
        public static class RSAPKImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.CAFType.DA.RSAPK
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
        public static class DSAPKImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.CAFType.DA.DSAPK
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
     * This is an atomic type that is a restriction of cl.sii.siiDte.CAFType$FRMA.
     */
    public static class FRMAImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements cl.sii.siiDte.CAFType.FRMA
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
