/*
 * An XML document type.
 * Localname: TedBarcode
 * Namespace: http://www.nic.cl/SiiDte
 * Java type: cl.nic.siiDte.TedBarcodeDocument
 *
 * Automatically generated - do not modify.
 */
package cl.nic.siiDte.impl;
/**
 * A document containing one TedBarcode(@http://www.nic.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class TedBarcodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TedBarcodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEDBARCODE$0 = 
        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "TedBarcode");
    
    
    /**
     * Gets the "TedBarcode" element
     */
    public cl.nic.siiDte.TedBarcodeDocument.TedBarcode getTedBarcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.nic.siiDte.TedBarcodeDocument.TedBarcode target = null;
            target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode)get_store().find_element_user(TEDBARCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TedBarcode" element
     */
    public void setTedBarcode(cl.nic.siiDte.TedBarcodeDocument.TedBarcode tedBarcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.nic.siiDte.TedBarcodeDocument.TedBarcode target = null;
            target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode)get_store().find_element_user(TEDBARCODE$0, 0);
            if (target == null)
            {
                target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode)get_store().add_element_user(TEDBARCODE$0);
            }
            target.set(tedBarcode);
        }
    }
    
    /**
     * Appends and returns a new empty "TedBarcode" element
     */
    public cl.nic.siiDte.TedBarcodeDocument.TedBarcode addNewTedBarcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.nic.siiDte.TedBarcodeDocument.TedBarcode target = null;
            target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode)get_store().add_element_user(TEDBARCODE$0);
            return target;
        }
    }
    /**
     * An XML TedBarcode(@http://www.nic.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class TedBarcodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode
    {
        private static final long serialVersionUID = 1L;
        
        public TedBarcodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TED$0 = 
            new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "TED");
        private static final javax.xml.namespace.QName BARCODE$2 = 
            new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "barcode");
        
        
        /**
         * Gets the "TED" element
         */
        public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED getTED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED target = null;
                target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED)get_store().find_element_user(TED$0, 0);
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
        public void setTED(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED ted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED target = null;
                target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED)get_store().find_element_user(TED$0, 0);
                if (target == null)
                {
                    target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED)get_store().add_element_user(TED$0);
                }
                target.set(ted);
            }
        }
        
        /**
         * Appends and returns a new empty "TED" element
         */
        public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED addNewTED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED target = null;
                target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED)get_store().add_element_user(TED$0);
                return target;
            }
        }
        
        /**
         * Gets the "barcode" element
         */
        public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode getBarcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode target = null;
                target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode)get_store().find_element_user(BARCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "barcode" element
         */
        public void setBarcode(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode barcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode target = null;
                target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode)get_store().find_element_user(BARCODE$2, 0);
                if (target == null)
                {
                    target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode)get_store().add_element_user(BARCODE$2);
                }
                target.set(barcode);
            }
        }
        
        /**
         * Appends and returns a new empty "barcode" element
         */
        public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode addNewBarcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode target = null;
                target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode)get_store().add_element_user(BARCODE$2);
                return target;
            }
        }
        /**
         * An XML TED(@http://www.nic.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class TEDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED
        {
            private static final long serialVersionUID = 1L;
            
            public TEDImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DD$0 = 
                new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "DD");
            private static final javax.xml.namespace.QName FRMT$2 = 
                new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "FRMT");
            private static final javax.xml.namespace.QName VERSION$4 = 
                new javax.xml.namespace.QName("", "version");
            
            
            /**
             * Gets the "DD" element
             */
            public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD getDD()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD target = null;
                    target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD)get_store().find_element_user(DD$0, 0);
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
            public void setDD(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD dd)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD target = null;
                    target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD)get_store().find_element_user(DD$0, 0);
                    if (target == null)
                    {
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD)get_store().add_element_user(DD$0);
                    }
                    target.set(dd);
                }
            }
            
            /**
             * Appends and returns a new empty "DD" element
             */
            public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD addNewDD()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD target = null;
                    target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD)get_store().add_element_user(DD$0);
                    return target;
                }
            }
            
            /**
             * Gets the "FRMT" element
             */
            public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT getFRMT()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT target = null;
                    target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT)get_store().find_element_user(FRMT$2, 0);
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
            public void setFRMT(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT frmt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT target = null;
                    target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT)get_store().find_element_user(FRMT$2, 0);
                    if (target == null)
                    {
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT)get_store().add_element_user(FRMT$2);
                    }
                    target.set(frmt);
                }
            }
            
            /**
             * Appends and returns a new empty "FRMT" element
             */
            public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT addNewFRMT()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT target = null;
                    target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT)get_store().add_element_user(FRMT$2);
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
             * An XML DD(@http://www.nic.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class DDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD
            {
                private static final long serialVersionUID = 1L;
                
                public DDImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RE$0 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "RE");
                private static final javax.xml.namespace.QName TD$2 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "TD");
                private static final javax.xml.namespace.QName F$4 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "F");
                private static final javax.xml.namespace.QName FE$6 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "FE");
                private static final javax.xml.namespace.QName RR$8 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "RR");
                private static final javax.xml.namespace.QName RSR$10 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "RSR");
                private static final javax.xml.namespace.QName MNT$12 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "MNT");
                private static final javax.xml.namespace.QName IT1$14 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "IT1");
                private static final javax.xml.namespace.QName CAF$16 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "CAF");
                private static final javax.xml.namespace.QName TSTED$18 = 
                    new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "TSTED");
                
                
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
                public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR xgetRSR()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR)get_store().find_element_user(RSR$10, 0);
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
                public void xsetRSR(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR rsr)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR)get_store().find_element_user(RSR$10, 0);
                      if (target == null)
                      {
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR)get_store().add_element_user(RSR$10);
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
                public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 xgetIT1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1)get_store().find_element_user(IT1$14, 0);
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
                public void xsetIT1(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 it1)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1)get_store().find_element_user(IT1$14, 0);
                      if (target == null)
                      {
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1)get_store().add_element_user(IT1$14);
                      }
                      target.set(it1);
                    }
                }
                
                /**
                 * Gets the "CAF" element
                 */
                public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF getCAF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF)get_store().find_element_user(CAF$16, 0);
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
                public void setCAF(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF caf)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF)get_store().find_element_user(CAF$16, 0);
                      if (target == null)
                      {
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF)get_store().add_element_user(CAF$16);
                      }
                      target.set(caf);
                    }
                }
                
                /**
                 * Appends and returns a new empty "CAF" element
                 */
                public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF addNewCAF()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF)get_store().add_element_user(CAF$16);
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
                 * An XML RSR(@http://www.nic.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$DD$RSR.
                 */
                public static class RSRImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR
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
                 * An XML IT1(@http://www.nic.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$DD$IT1.
                 */
                public static class IT1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1
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
                 * An XML CAF(@http://www.nic.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class CAFImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CAFImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName DA$0 = 
                      new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "DA");
                    private static final javax.xml.namespace.QName FRMA$2 = 
                      new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "FRMA");
                    private static final javax.xml.namespace.QName VERSION$4 = 
                      new javax.xml.namespace.QName("", "version");
                    
                    
                    /**
                     * Gets the "DA" element
                     */
                    public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA getDA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA target = null;
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA)get_store().find_element_user(DA$0, 0);
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
                    public void setDA(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA da)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA target = null;
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA)get_store().find_element_user(DA$0, 0);
                        if (target == null)
                        {
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA)get_store().add_element_user(DA$0);
                        }
                        target.set(da);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "DA" element
                     */
                    public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA addNewDA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA target = null;
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA)get_store().add_element_user(DA$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "FRMA" element
                     */
                    public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA getFRMA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA target = null;
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA)get_store().find_element_user(FRMA$2, 0);
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
                    public void setFRMA(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA frma)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA target = null;
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA)get_store().find_element_user(FRMA$2, 0);
                        if (target == null)
                        {
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA)get_store().add_element_user(FRMA$2);
                        }
                        target.set(frma);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "FRMA" element
                     */
                    public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA addNewFRMA()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA target = null;
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA)get_store().add_element_user(FRMA$2);
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
                     * An XML DA(@http://www.nic.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public static class DAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public DAImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName RE$0 = 
                        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "RE");
                      private static final javax.xml.namespace.QName RS$2 = 
                        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "RS");
                      private static final javax.xml.namespace.QName TD$4 = 
                        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "TD");
                      private static final javax.xml.namespace.QName RNG$6 = 
                        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "RNG");
                      private static final javax.xml.namespace.QName FA$8 = 
                        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "FA");
                      private static final javax.xml.namespace.QName RSAPK$10 = 
                        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "RSAPK");
                      private static final javax.xml.namespace.QName DSAPK$12 = 
                        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "DSAPK");
                      private static final javax.xml.namespace.QName IDK$14 = 
                        new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "IDK");
                      
                      
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
                      public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS xgetRS()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS)get_store().find_element_user(RS$2, 0);
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
                      public void xsetRS(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS rs)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS)get_store().find_element_user(RS$2, 0);
                          if (target == null)
                          {
                            target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS)get_store().add_element_user(RS$2);
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
                      public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG getRNG()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG)get_store().find_element_user(RNG$6, 0);
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
                      public void setRNG(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG rng)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG)get_store().find_element_user(RNG$6, 0);
                          if (target == null)
                          {
                            target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG)get_store().add_element_user(RNG$6);
                          }
                          target.set(rng);
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty "RNG" element
                       */
                      public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG addNewRNG()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG)get_store().add_element_user(RNG$6);
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
                      public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK getRSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK)get_store().find_element_user(RSAPK$10, 0);
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
                      public void setRSAPK(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK rsapk)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK)get_store().find_element_user(RSAPK$10, 0);
                          if (target == null)
                          {
                            target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK)get_store().add_element_user(RSAPK$10);
                          }
                          target.set(rsapk);
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty "RSAPK" element
                       */
                      public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK addNewRSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK)get_store().add_element_user(RSAPK$10);
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
                      public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK getDSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK)get_store().find_element_user(DSAPK$12, 0);
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
                      public void setDSAPK(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK dsapk)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK)get_store().find_element_user(DSAPK$12, 0);
                          if (target == null)
                          {
                            target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK)get_store().add_element_user(DSAPK$12);
                          }
                          target.set(dsapk);
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty "DSAPK" element
                       */
                      public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK addNewDSAPK()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK target = null;
                          target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK)get_store().add_element_user(DSAPK$12);
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
                       * An XML RS(@http://www.nic.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$DD$CAF$DA$RS.
                       */
                      public static class RSImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS
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
                       * An XML RNG(@http://www.nic.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public static class RNGImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public RNGImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName D$0 = 
                          new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "D");
                        private static final javax.xml.namespace.QName H$2 = 
                          new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "H");
                        
                        
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
                       * An XML RSAPK(@http://www.nic.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public static class RSAPKImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public RSAPKImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName M$0 = 
                          new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "M");
                        private static final javax.xml.namespace.QName E$2 = 
                          new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "E");
                        
                        
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
                       * An XML DSAPK(@http://www.nic.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public static class DSAPKImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public DSAPKImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName P$0 = 
                          new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "P");
                        private static final javax.xml.namespace.QName Q$2 = 
                          new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "Q");
                        private static final javax.xml.namespace.QName G$4 = 
                          new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "G");
                        private static final javax.xml.namespace.QName Y$6 = 
                          new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "Y");
                        
                        
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
                     * An XML FRMA(@http://www.nic.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$DD$CAF$FRMA.
                     */
                    public static class FRMAImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA
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
             * An XML FRMT(@http://www.nic.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$FRMT.
             */
            public static class FRMTImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT
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
                public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo.Enum getAlgoritmo()
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
                      return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "algoritmo" attribute
                 */
                public cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo xgetAlgoritmo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo)get_store().find_attribute_user(ALGORITMO$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "algoritmo" attribute
                 */
                public void setAlgoritmo(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo.Enum algoritmo)
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
                public void xsetAlgoritmo(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo algoritmo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo target = null;
                      target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo)get_store().find_attribute_user(ALGORITMO$0);
                      if (target == null)
                      {
                        target = (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo)get_store().add_attribute_user(ALGORITMO$0);
                      }
                      target.set(algoritmo);
                    }
                }
                /**
                 * An XML algoritmo(@).
                 *
                 * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$FRMT$Algoritmo.
                 */
                public static class AlgoritmoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo
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
        /**
         * An XML barcode(@http://www.nic.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class BarcodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode
        {
            private static final long serialVersionUID = 1L;
            
            public BarcodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName COLUMNS$0 = 
                new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "columns");
            private static final javax.xml.namespace.QName QUITEZONE$2 = 
                new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "quiteZone");
            private static final javax.xml.namespace.QName ECLEVEL$4 = 
                new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "ec-level");
            private static final javax.xml.namespace.QName WIDTH$6 = 
                new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "width");
            private static final javax.xml.namespace.QName HEIGHT$8 = 
                new javax.xml.namespace.QName("http://www.nic.cl/SiiDte", "height");
            
            
            /**
             * Gets the "columns" element
             */
            public int getColumns()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNS$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "columns" element
             */
            public org.apache.xmlbeans.XmlInt xgetColumns()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COLUMNS$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "columns" element
             */
            public void setColumns(int columns)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNS$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNS$0);
                    }
                    target.setIntValue(columns);
                }
            }
            
            /**
             * Sets (as xml) the "columns" element
             */
            public void xsetColumns(org.apache.xmlbeans.XmlInt columns)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COLUMNS$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COLUMNS$0);
                    }
                    target.set(columns);
                }
            }
            
            /**
             * Gets the "quiteZone" element
             */
            public int getQuiteZone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUITEZONE$2, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "quiteZone" element
             */
            public org.apache.xmlbeans.XmlInt xgetQuiteZone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUITEZONE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "quiteZone" element
             */
            public void setQuiteZone(int quiteZone)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUITEZONE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUITEZONE$2);
                    }
                    target.setIntValue(quiteZone);
                }
            }
            
            /**
             * Sets (as xml) the "quiteZone" element
             */
            public void xsetQuiteZone(org.apache.xmlbeans.XmlInt quiteZone)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUITEZONE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUITEZONE$2);
                    }
                    target.set(quiteZone);
                }
            }
            
            /**
             * Gets the "ec-level" element
             */
            public int getEcLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECLEVEL$4, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "ec-level" element
             */
            public org.apache.xmlbeans.XmlInt xgetEcLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ECLEVEL$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ec-level" element
             */
            public void setEcLevel(int ecLevel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECLEVEL$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ECLEVEL$4);
                    }
                    target.setIntValue(ecLevel);
                }
            }
            
            /**
             * Sets (as xml) the "ec-level" element
             */
            public void xsetEcLevel(org.apache.xmlbeans.XmlInt ecLevel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ECLEVEL$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ECLEVEL$4);
                    }
                    target.set(ecLevel);
                }
            }
            
            /**
             * Gets the "width" element
             */
            public int getWidth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WIDTH$6, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "width" element
             */
            public org.apache.xmlbeans.XmlInt xgetWidth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WIDTH$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "width" element
             */
            public void setWidth(int width)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WIDTH$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WIDTH$6);
                    }
                    target.setIntValue(width);
                }
            }
            
            /**
             * Sets (as xml) the "width" element
             */
            public void xsetWidth(org.apache.xmlbeans.XmlInt width)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WIDTH$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WIDTH$6);
                    }
                    target.set(width);
                }
            }
            
            /**
             * Gets the "height" element
             */
            public int getHeight()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEIGHT$8, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "height" element
             */
            public org.apache.xmlbeans.XmlInt xgetHeight()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HEIGHT$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "height" element
             */
            public void setHeight(int height)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEIGHT$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEIGHT$8);
                    }
                    target.setIntValue(height);
                }
            }
            
            /**
             * Sets (as xml) the "height" element
             */
            public void xsetHeight(org.apache.xmlbeans.XmlInt height)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HEIGHT$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HEIGHT$8);
                    }
                    target.set(height);
                }
            }
        }
    }
}
