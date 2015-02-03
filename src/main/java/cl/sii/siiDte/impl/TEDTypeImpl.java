/*
 * XML Type:  TEDType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.TEDType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * An XML TEDType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public class TEDTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.TEDType
{
    private static final long serialVersionUID = 1L;
    
    public TEDTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    public cl.sii.siiDte.TEDType.DD getDD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.TEDType.DD target = null;
            target = (cl.sii.siiDte.TEDType.DD)get_store().find_element_user(DD$0, 0);
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
    public void setDD(cl.sii.siiDte.TEDType.DD dd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.TEDType.DD target = null;
            target = (cl.sii.siiDte.TEDType.DD)get_store().find_element_user(DD$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.TEDType.DD)get_store().add_element_user(DD$0);
            }
            target.set(dd);
        }
    }
    
    /**
     * Appends and returns a new empty "DD" element
     */
    public cl.sii.siiDte.TEDType.DD addNewDD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.TEDType.DD target = null;
            target = (cl.sii.siiDte.TEDType.DD)get_store().add_element_user(DD$0);
            return target;
        }
    }
    
    /**
     * Gets the "FRMT" element
     */
    public cl.sii.siiDte.TEDType.FRMT getFRMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.TEDType.FRMT target = null;
            target = (cl.sii.siiDte.TEDType.FRMT)get_store().find_element_user(FRMT$2, 0);
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
    public void setFRMT(cl.sii.siiDte.TEDType.FRMT frmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.TEDType.FRMT target = null;
            target = (cl.sii.siiDte.TEDType.FRMT)get_store().find_element_user(FRMT$2, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.TEDType.FRMT)get_store().add_element_user(FRMT$2);
            }
            target.set(frmt);
        }
    }
    
    /**
     * Appends and returns a new empty "FRMT" element
     */
    public cl.sii.siiDte.TEDType.FRMT addNewFRMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.TEDType.FRMT target = null;
            target = (cl.sii.siiDte.TEDType.FRMT)get_store().add_element_user(FRMT$2);
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
    public static class DDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.TEDType.DD
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
        public cl.sii.siiDte.DTEType xgetTD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.DTEType target = null;
                target = (cl.sii.siiDte.DTEType)get_store().find_element_user(TD$2, 0);
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
        public void xsetTD(cl.sii.siiDte.DTEType td)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.DTEType target = null;
                target = (cl.sii.siiDte.DTEType)get_store().find_element_user(TD$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.DTEType)get_store().add_element_user(TD$2);
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
        public cl.sii.siiDte.FolioType xgetF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.FolioType target = null;
                target = (cl.sii.siiDte.FolioType)get_store().find_element_user(F$4, 0);
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
        public void xsetF(cl.sii.siiDte.FolioType f)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.FolioType target = null;
                target = (cl.sii.siiDte.FolioType)get_store().find_element_user(F$4, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.FolioType)get_store().add_element_user(F$4);
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
        public cl.sii.siiDte.RUTType xgetRR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RR$8, 0);
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
        public void xsetRR(cl.sii.siiDte.RUTType rr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RUTType target = null;
                target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RR$8, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RR$8);
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
        public cl.sii.siiDte.TEDType.DD.RSR xgetRSR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.TEDType.DD.RSR target = null;
                target = (cl.sii.siiDte.TEDType.DD.RSR)get_store().find_element_user(RSR$10, 0);
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
        public void xsetRSR(cl.sii.siiDte.TEDType.DD.RSR rsr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.TEDType.DD.RSR target = null;
                target = (cl.sii.siiDte.TEDType.DD.RSR)get_store().find_element_user(RSR$10, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.TEDType.DD.RSR)get_store().add_element_user(RSR$10);
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
        public cl.sii.siiDte.TEDType.DD.IT1 xgetIT1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.TEDType.DD.IT1 target = null;
                target = (cl.sii.siiDte.TEDType.DD.IT1)get_store().find_element_user(IT1$14, 0);
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
        public void xsetIT1(cl.sii.siiDte.TEDType.DD.IT1 it1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.TEDType.DD.IT1 target = null;
                target = (cl.sii.siiDte.TEDType.DD.IT1)get_store().find_element_user(IT1$14, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.TEDType.DD.IT1)get_store().add_element_user(IT1$14);
                }
                target.set(it1);
            }
        }
        
        /**
         * Gets the "CAF" element
         */
        public cl.sii.siiDte.CAFType getCAF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType target = null;
                target = (cl.sii.siiDte.CAFType)get_store().find_element_user(CAF$16, 0);
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
        public void setCAF(cl.sii.siiDte.CAFType caf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType target = null;
                target = (cl.sii.siiDte.CAFType)get_store().find_element_user(CAF$16, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.CAFType)get_store().add_element_user(CAF$16);
                }
                target.set(caf);
            }
        }
        
        /**
         * Appends and returns a new empty "CAF" element
         */
        public cl.sii.siiDte.CAFType addNewCAF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.CAFType target = null;
                target = (cl.sii.siiDte.CAFType)get_store().add_element_user(CAF$16);
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
         * This is an atomic type that is a restriction of cl.sii.siiDte.TEDType$DD$RSR.
         */
        public static class RSRImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.TEDType.DD.RSR
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
         * This is an atomic type that is a restriction of cl.sii.siiDte.TEDType$DD$IT1.
         */
        public static class IT1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.TEDType.DD.IT1
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
    }
    /**
     * An XML FRMT(@http://www.sii.cl/SiiDte).
     *
     * This is an atomic type that is a restriction of cl.sii.siiDte.TEDType$FRMT.
     */
    public static class FRMTImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements cl.sii.siiDte.TEDType.FRMT
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
        public cl.sii.siiDte.TEDType.FRMT.Algoritmo.Enum getAlgoritmo()
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
                return (cl.sii.siiDte.TEDType.FRMT.Algoritmo.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "algoritmo" attribute
         */
        public cl.sii.siiDte.TEDType.FRMT.Algoritmo xgetAlgoritmo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.TEDType.FRMT.Algoritmo target = null;
                target = (cl.sii.siiDte.TEDType.FRMT.Algoritmo)get_store().find_attribute_user(ALGORITMO$0);
                return target;
            }
        }
        
        /**
         * Sets the "algoritmo" attribute
         */
        public void setAlgoritmo(cl.sii.siiDte.TEDType.FRMT.Algoritmo.Enum algoritmo)
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
        public void xsetAlgoritmo(cl.sii.siiDte.TEDType.FRMT.Algoritmo algoritmo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.TEDType.FRMT.Algoritmo target = null;
                target = (cl.sii.siiDte.TEDType.FRMT.Algoritmo)get_store().find_attribute_user(ALGORITMO$0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.TEDType.FRMT.Algoritmo)get_store().add_attribute_user(ALGORITMO$0);
                }
                target.set(algoritmo);
            }
        }
        /**
         * An XML algoritmo(@).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.TEDType$FRMT$Algoritmo.
         */
        public static class AlgoritmoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiDte.TEDType.FRMT.Algoritmo
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
