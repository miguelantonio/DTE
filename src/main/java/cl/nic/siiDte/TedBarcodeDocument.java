/*
 * An XML document type.
 * Localname: TedBarcode
 * Namespace: http://www.nic.cl/SiiDte
 * Java type: cl.nic.siiDte.TedBarcodeDocument
 *
 * Automatically generated - do not modify.
 */
package cl.nic.siiDte;


/**
 * A document containing one TedBarcode(@http://www.nic.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface TedBarcodeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TedBarcodeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("tedbarcode2cf3doctype");
    
    /**
     * Gets the "TedBarcode" element
     */
    cl.nic.siiDte.TedBarcodeDocument.TedBarcode getTedBarcode();
    
    /**
     * Sets the "TedBarcode" element
     */
    void setTedBarcode(cl.nic.siiDte.TedBarcodeDocument.TedBarcode tedBarcode);
    
    /**
     * Appends and returns a new empty "TedBarcode" element
     */
    cl.nic.siiDte.TedBarcodeDocument.TedBarcode addNewTedBarcode();
    
    /**
     * An XML TedBarcode(@http://www.nic.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface TedBarcode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TedBarcode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("tedbarcode41dcelemtype");
        
        /**
         * Gets the "TED" element
         */
        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED getTED();
        
        /**
         * Sets the "TED" element
         */
        void setTED(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED ted);
        
        /**
         * Appends and returns a new empty "TED" element
         */
        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED addNewTED();
        
        /**
         * Gets the "barcode" element
         */
        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode getBarcode();
        
        /**
         * Sets the "barcode" element
         */
        void setBarcode(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode barcode);
        
        /**
         * Appends and returns a new empty "barcode" element
         */
        cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode addNewBarcode();
        
        /**
         * An XML TED(@http://www.nic.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface TED extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TED.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("tedb71delemtype");
            
            /**
             * Gets the "DD" element
             */
            cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD getDD();
            
            /**
             * Sets the "DD" element
             */
            void setDD(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD dd);
            
            /**
             * Appends and returns a new empty "DD" element
             */
            cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD addNewDD();
            
            /**
             * Gets the "FRMT" element
             */
            cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT getFRMT();
            
            /**
             * Sets the "FRMT" element
             */
            void setFRMT(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT frmt);
            
            /**
             * Appends and returns a new empty "FRMT" element
             */
            cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT addNewFRMT();
            
            /**
             * Gets the "version" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType getVersion();
            
            /**
             * Sets the "version" attribute
             */
            void setVersion(org.apache.xmlbeans.XmlAnySimpleType version);
            
            /**
             * Appends and returns a new empty "version" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType addNewVersion();
            
            /**
             * An XML DD(@http://www.nic.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface DD extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("dd5381elemtype");
                
                /**
                 * Gets the "RE" element
                 */
                java.lang.String getRE();
                
                /**
                 * Gets (as xml) the "RE" element
                 */
                cl.sii.siiDte.RUTType xgetRE();
                
                /**
                 * Sets the "RE" element
                 */
                void setRE(java.lang.String re);
                
                /**
                 * Sets (as xml) the "RE" element
                 */
                void xsetRE(cl.sii.siiDte.RUTType re);
                
                /**
                 * Gets the "TD" element
                 */
                java.math.BigInteger getTD();
                
                /**
                 * Gets (as xml) the "TD" element
                 */
                cl.sii.siiDte.DTEType xgetTD();
                
                /**
                 * Sets the "TD" element
                 */
                void setTD(java.math.BigInteger td);
                
                /**
                 * Sets (as xml) the "TD" element
                 */
                void xsetTD(cl.sii.siiDte.DTEType td);
                
                /**
                 * Gets the "F" element
                 */
                long getF();
                
                /**
                 * Gets (as xml) the "F" element
                 */
                cl.sii.siiDte.FolioType xgetF();
                
                /**
                 * Sets the "F" element
                 */
                void setF(long f);
                
                /**
                 * Sets (as xml) the "F" element
                 */
                void xsetF(cl.sii.siiDte.FolioType f);
                
                /**
                 * Gets the "FE" element
                 */
                java.util.Calendar getFE();
                
                /**
                 * Gets (as xml) the "FE" element
                 */
                org.apache.xmlbeans.XmlDate xgetFE();
                
                /**
                 * Sets the "FE" element
                 */
                void setFE(java.util.Calendar fe);
                
                /**
                 * Sets (as xml) the "FE" element
                 */
                void xsetFE(org.apache.xmlbeans.XmlDate fe);
                
                /**
                 * Gets the "RR" element
                 */
                java.lang.String getRR();
                
                /**
                 * Gets (as xml) the "RR" element
                 */
                cl.sii.siiDte.RUTType xgetRR();
                
                /**
                 * Sets the "RR" element
                 */
                void setRR(java.lang.String rr);
                
                /**
                 * Sets (as xml) the "RR" element
                 */
                void xsetRR(cl.sii.siiDte.RUTType rr);
                
                /**
                 * Gets the "RSR" element
                 */
                java.lang.String getRSR();
                
                /**
                 * Gets (as xml) the "RSR" element
                 */
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR xgetRSR();
                
                /**
                 * Sets the "RSR" element
                 */
                void setRSR(java.lang.String rsr);
                
                /**
                 * Sets (as xml) the "RSR" element
                 */
                void xsetRSR(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR rsr);
                
                /**
                 * Gets the "MNT" element
                 */
                java.math.BigInteger getMNT();
                
                /**
                 * Gets (as xml) the "MNT" element
                 */
                org.apache.xmlbeans.XmlUnsignedLong xgetMNT();
                
                /**
                 * Sets the "MNT" element
                 */
                void setMNT(java.math.BigInteger mnt);
                
                /**
                 * Sets (as xml) the "MNT" element
                 */
                void xsetMNT(org.apache.xmlbeans.XmlUnsignedLong mnt);
                
                /**
                 * Gets the "IT1" element
                 */
                java.lang.String getIT1();
                
                /**
                 * Gets (as xml) the "IT1" element
                 */
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 xgetIT1();
                
                /**
                 * Sets the "IT1" element
                 */
                void setIT1(java.lang.String it1);
                
                /**
                 * Sets (as xml) the "IT1" element
                 */
                void xsetIT1(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 it1);
                
                /**
                 * Gets the "CAF" element
                 */
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF getCAF();
                
                /**
                 * Sets the "CAF" element
                 */
                void setCAF(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF caf);
                
                /**
                 * Appends and returns a new empty "CAF" element
                 */
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF addNewCAF();
                
                /**
                 * Gets the "TSTED" element
                 */
                java.util.Calendar getTSTED();
                
                /**
                 * Gets (as xml) the "TSTED" element
                 */
                org.apache.xmlbeans.XmlDateTime xgetTSTED();
                
                /**
                 * Sets the "TSTED" element
                 */
                void setTSTED(java.util.Calendar tsted);
                
                /**
                 * Sets (as xml) the "TSTED" element
                 */
                void xsetTSTED(org.apache.xmlbeans.XmlDateTime tsted);
                
                /**
                 * An XML RSR(@http://www.nic.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$DD$RSR.
                 */
                public interface RSR extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RSR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("rsr3d5eelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR newValue(java.lang.Object obj) {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR) type.newValue( obj ); }
                      
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR newInstance() {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.RSR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML IT1(@http://www.nic.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$DD$IT1.
                 */
                public interface IT1 extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IT1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("it1fcd3elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 newValue(java.lang.Object obj) {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1) type.newValue( obj ); }
                      
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 newInstance() {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1 newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.IT1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CAF(@http://www.nic.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface CAF extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CAF.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("cafbc95elemtype");
                    
                    /**
                     * Gets the "DA" element
                     */
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA getDA();
                    
                    /**
                     * Sets the "DA" element
                     */
                    void setDA(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA da);
                    
                    /**
                     * Appends and returns a new empty "DA" element
                     */
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA addNewDA();
                    
                    /**
                     * Gets the "FRMA" element
                     */
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA getFRMA();
                    
                    /**
                     * Sets the "FRMA" element
                     */
                    void setFRMA(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA frma);
                    
                    /**
                     * Appends and returns a new empty "FRMA" element
                     */
                    cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA addNewFRMA();
                    
                    /**
                     * Gets the "version" attribute
                     */
                    org.apache.xmlbeans.XmlAnySimpleType getVersion();
                    
                    /**
                     * Sets the "version" attribute
                     */
                    void setVersion(org.apache.xmlbeans.XmlAnySimpleType version);
                    
                    /**
                     * Appends and returns a new empty "version" attribute
                     */
                    org.apache.xmlbeans.XmlAnySimpleType addNewVersion();
                    
                    /**
                     * An XML DA(@http://www.nic.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface DA extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("da8b2eelemtype");
                      
                      /**
                       * Gets the "RE" element
                       */
                      java.lang.String getRE();
                      
                      /**
                       * Gets (as xml) the "RE" element
                       */
                      cl.sii.siiDte.RUTType xgetRE();
                      
                      /**
                       * Sets the "RE" element
                       */
                      void setRE(java.lang.String re);
                      
                      /**
                       * Sets (as xml) the "RE" element
                       */
                      void xsetRE(cl.sii.siiDte.RUTType re);
                      
                      /**
                       * Gets the "RS" element
                       */
                      java.lang.String getRS();
                      
                      /**
                       * Gets (as xml) the "RS" element
                       */
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS xgetRS();
                      
                      /**
                       * Sets the "RS" element
                       */
                      void setRS(java.lang.String rs);
                      
                      /**
                       * Sets (as xml) the "RS" element
                       */
                      void xsetRS(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS rs);
                      
                      /**
                       * Gets the "TD" element
                       */
                      java.math.BigInteger getTD();
                      
                      /**
                       * Gets (as xml) the "TD" element
                       */
                      cl.sii.siiDte.DTEType xgetTD();
                      
                      /**
                       * Sets the "TD" element
                       */
                      void setTD(java.math.BigInteger td);
                      
                      /**
                       * Sets (as xml) the "TD" element
                       */
                      void xsetTD(cl.sii.siiDte.DTEType td);
                      
                      /**
                       * Gets the "RNG" element
                       */
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG getRNG();
                      
                      /**
                       * Sets the "RNG" element
                       */
                      void setRNG(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG rng);
                      
                      /**
                       * Appends and returns a new empty "RNG" element
                       */
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG addNewRNG();
                      
                      /**
                       * Gets the "FA" element
                       */
                      java.util.Calendar getFA();
                      
                      /**
                       * Gets (as xml) the "FA" element
                       */
                      org.apache.xmlbeans.XmlDate xgetFA();
                      
                      /**
                       * Sets the "FA" element
                       */
                      void setFA(java.util.Calendar fa);
                      
                      /**
                       * Sets (as xml) the "FA" element
                       */
                      void xsetFA(org.apache.xmlbeans.XmlDate fa);
                      
                      /**
                       * Gets the "RSAPK" element
                       */
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK getRSAPK();
                      
                      /**
                       * True if has "RSAPK" element
                       */
                      boolean isSetRSAPK();
                      
                      /**
                       * Sets the "RSAPK" element
                       */
                      void setRSAPK(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK rsapk);
                      
                      /**
                       * Appends and returns a new empty "RSAPK" element
                       */
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK addNewRSAPK();
                      
                      /**
                       * Unsets the "RSAPK" element
                       */
                      void unsetRSAPK();
                      
                      /**
                       * Gets the "DSAPK" element
                       */
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK getDSAPK();
                      
                      /**
                       * True if has "DSAPK" element
                       */
                      boolean isSetDSAPK();
                      
                      /**
                       * Sets the "DSAPK" element
                       */
                      void setDSAPK(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK dsapk);
                      
                      /**
                       * Appends and returns a new empty "DSAPK" element
                       */
                      cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK addNewDSAPK();
                      
                      /**
                       * Unsets the "DSAPK" element
                       */
                      void unsetDSAPK();
                      
                      /**
                       * Gets the "IDK" element
                       */
                      long getIDK();
                      
                      /**
                       * Gets (as xml) the "IDK" element
                       */
                      org.apache.xmlbeans.XmlLong xgetIDK();
                      
                      /**
                       * Sets the "IDK" element
                       */
                      void setIDK(long idk);
                      
                      /**
                       * Sets (as xml) the "IDK" element
                       */
                      void xsetIDK(org.apache.xmlbeans.XmlLong idk);
                      
                      /**
                       * An XML RS(@http://www.nic.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$DD$CAF$DA$RS.
                       */
                      public interface RS extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("rscef1elemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS newValue(java.lang.Object obj) {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS) type.newValue( obj ); }
                          
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS newInstance() {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML RNG(@http://www.nic.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public interface RNG extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RNG.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("rng3b17elemtype");
                        
                        /**
                         * Gets the "D" element
                         */
                        long getD();
                        
                        /**
                         * Gets (as xml) the "D" element
                         */
                        cl.sii.siiDte.FolioType xgetD();
                        
                        /**
                         * Sets the "D" element
                         */
                        void setD(long d);
                        
                        /**
                         * Sets (as xml) the "D" element
                         */
                        void xsetD(cl.sii.siiDte.FolioType d);
                        
                        /**
                         * Gets the "H" element
                         */
                        long getH();
                        
                        /**
                         * Gets (as xml) the "H" element
                         */
                        cl.sii.siiDte.FolioType xgetH();
                        
                        /**
                         * Sets the "H" element
                         */
                        void setH(long h);
                        
                        /**
                         * Sets (as xml) the "H" element
                         */
                        void xsetH(cl.sii.siiDte.FolioType h);
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG newInstance() {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RNG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML RSAPK(@http://www.nic.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public interface RSAPK extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RSAPK.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("rsapkd487elemtype");
                        
                        /**
                         * Gets the "M" element
                         */
                        byte[] getM();
                        
                        /**
                         * Gets (as xml) the "M" element
                         */
                        org.apache.xmlbeans.XmlBase64Binary xgetM();
                        
                        /**
                         * Sets the "M" element
                         */
                        void setM(byte[] m);
                        
                        /**
                         * Sets (as xml) the "M" element
                         */
                        void xsetM(org.apache.xmlbeans.XmlBase64Binary m);
                        
                        /**
                         * Gets the "E" element
                         */
                        byte[] getE();
                        
                        /**
                         * Gets (as xml) the "E" element
                         */
                        org.apache.xmlbeans.XmlBase64Binary xgetE();
                        
                        /**
                         * Sets the "E" element
                         */
                        void setE(byte[] e);
                        
                        /**
                         * Sets (as xml) the "E" element
                         */
                        void xsetE(org.apache.xmlbeans.XmlBase64Binary e);
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK newInstance() {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.RSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML DSAPK(@http://www.nic.cl/SiiDte).
                       *
                       * This is a complex type.
                       */
                      public interface DSAPK extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DSAPK.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("dsapk5dd5elemtype");
                        
                        /**
                         * Gets the "P" element
                         */
                        byte[] getP();
                        
                        /**
                         * Gets (as xml) the "P" element
                         */
                        org.apache.xmlbeans.XmlBase64Binary xgetP();
                        
                        /**
                         * Sets the "P" element
                         */
                        void setP(byte[] p);
                        
                        /**
                         * Sets (as xml) the "P" element
                         */
                        void xsetP(org.apache.xmlbeans.XmlBase64Binary p);
                        
                        /**
                         * Gets the "Q" element
                         */
                        byte[] getQ();
                        
                        /**
                         * Gets (as xml) the "Q" element
                         */
                        org.apache.xmlbeans.XmlBase64Binary xgetQ();
                        
                        /**
                         * Sets the "Q" element
                         */
                        void setQ(byte[] q);
                        
                        /**
                         * Sets (as xml) the "Q" element
                         */
                        void xsetQ(org.apache.xmlbeans.XmlBase64Binary q);
                        
                        /**
                         * Gets the "G" element
                         */
                        byte[] getG();
                        
                        /**
                         * Gets (as xml) the "G" element
                         */
                        org.apache.xmlbeans.XmlBase64Binary xgetG();
                        
                        /**
                         * Sets the "G" element
                         */
                        void setG(byte[] g);
                        
                        /**
                         * Sets (as xml) the "G" element
                         */
                        void xsetG(org.apache.xmlbeans.XmlBase64Binary g);
                        
                        /**
                         * Gets the "Y" element
                         */
                        byte[] getY();
                        
                        /**
                         * Gets (as xml) the "Y" element
                         */
                        org.apache.xmlbeans.XmlBase64Binary xgetY();
                        
                        /**
                         * Sets the "Y" element
                         */
                        void setY(byte[] y);
                        
                        /**
                         * Sets (as xml) the "Y" element
                         */
                        void xsetY(org.apache.xmlbeans.XmlBase64Binary y);
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK newInstance() {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA.DSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA newInstance() {
                          return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.DA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML FRMA(@http://www.nic.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$DD$CAF$FRMA.
                     */
                    public interface FRMA extends org.apache.xmlbeans.XmlBase64Binary
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FRMA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("frma8a91elemtype");
                      
                      /**
                       * Gets the "algoritmo" attribute
                       */
                      java.lang.String getAlgoritmo();
                      
                      /**
                       * Gets (as xml) the "algoritmo" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAlgoritmo();
                      
                      /**
                       * Sets the "algoritmo" attribute
                       */
                      void setAlgoritmo(java.lang.String algoritmo);
                      
                      /**
                       * Sets (as xml) the "algoritmo" attribute
                       */
                      void xsetAlgoritmo(org.apache.xmlbeans.XmlString algoritmo);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA newInstance() {
                          return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF.FRMA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF newInstance() {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD.CAF) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD newInstance() {
                      return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.DD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML FRMT(@http://www.nic.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$FRMT.
             */
            public interface FRMT extends org.apache.xmlbeans.XmlBase64Binary
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FRMT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("frmt85eeelemtype");
                
                /**
                 * Gets the "algoritmo" attribute
                 */
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo.Enum getAlgoritmo();
                
                /**
                 * Gets (as xml) the "algoritmo" attribute
                 */
                cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo xgetAlgoritmo();
                
                /**
                 * Sets the "algoritmo" attribute
                 */
                void setAlgoritmo(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo.Enum algoritmo);
                
                /**
                 * Sets (as xml) the "algoritmo" attribute
                 */
                void xsetAlgoritmo(cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo algoritmo);
                
                /**
                 * An XML algoritmo(@).
                 *
                 * This is an atomic type that is a restriction of cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$FRMT$Algoritmo.
                 */
                public interface Algoritmo extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Algoritmo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("algoritmof262attrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum SHA_1_WITH_RSA = Enum.forString("SHA1withRSA");
                    static final Enum SHA_1_WITH_DSA = Enum.forString("SHA1withDSA");
                    
                    static final int INT_SHA_1_WITH_RSA = Enum.INT_SHA_1_WITH_RSA;
                    static final int INT_SHA_1_WITH_DSA = Enum.INT_SHA_1_WITH_DSA;
                    
                    /**
                     * Enumeration value class for cl.nic.siiDte.TedBarcodeDocument$TedBarcode$TED$FRMT$Algoritmo.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_SHA_1_WITH_RSA
                     * Enum.forString(s); // returns the enum value for a string
                     * Enum.forInt(i); // returns the enum value for an int
                     * </pre>
                     * Enumeration objects are immutable singleton objects that
                     * can be compared using == object equality. They have no
                     * public constructor. See the constants defined within this
                     * class for all the valid values.
                     */
                    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                    {
                      /**
                       * Returns the enum value for a string, or null if none.
                       */
                      public static Enum forString(java.lang.String s)
                          { return (Enum)table.forString(s); }
                      /**
                       * Returns the enum value corresponding to an int, or null if none.
                       */
                      public static Enum forInt(int i)
                          { return (Enum)table.forInt(i); }
                      
                      private Enum(java.lang.String s, int i)
                          { super(s, i); }
                      
                      static final int INT_SHA_1_WITH_RSA = 1;
                      static final int INT_SHA_1_WITH_DSA = 2;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("SHA1withRSA", INT_SHA_1_WITH_RSA),
                          new Enum("SHA1withDSA", INT_SHA_1_WITH_DSA),
                        }
                      );
                      private static final long serialVersionUID = 1L;
                      private java.lang.Object readResolve() { return forInt(intValue()); } 
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo newValue(java.lang.Object obj) {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo) type.newValue( obj ); }
                      
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo newInstance() {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT.Algoritmo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT newInstance() {
                      return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED.FRMT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED newInstance() {
                  return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.TED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML barcode(@http://www.nic.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface Barcode extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Barcode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82F3C045322A56C4FB22C4FCA1F23522").resolveHandle("barcode8d70elemtype");
            
            /**
             * Gets the "columns" element
             */
            int getColumns();
            
            /**
             * Gets (as xml) the "columns" element
             */
            org.apache.xmlbeans.XmlInt xgetColumns();
            
            /**
             * Sets the "columns" element
             */
            void setColumns(int columns);
            
            /**
             * Sets (as xml) the "columns" element
             */
            void xsetColumns(org.apache.xmlbeans.XmlInt columns);
            
            /**
             * Gets the "quiteZone" element
             */
            int getQuiteZone();
            
            /**
             * Gets (as xml) the "quiteZone" element
             */
            org.apache.xmlbeans.XmlInt xgetQuiteZone();
            
            /**
             * Sets the "quiteZone" element
             */
            void setQuiteZone(int quiteZone);
            
            /**
             * Sets (as xml) the "quiteZone" element
             */
            void xsetQuiteZone(org.apache.xmlbeans.XmlInt quiteZone);
            
            /**
             * Gets the "ec-level" element
             */
            int getEcLevel();
            
            /**
             * Gets (as xml) the "ec-level" element
             */
            org.apache.xmlbeans.XmlInt xgetEcLevel();
            
            /**
             * Sets the "ec-level" element
             */
            void setEcLevel(int ecLevel);
            
            /**
             * Sets (as xml) the "ec-level" element
             */
            void xsetEcLevel(org.apache.xmlbeans.XmlInt ecLevel);
            
            /**
             * Gets the "width" element
             */
            int getWidth();
            
            /**
             * Gets (as xml) the "width" element
             */
            org.apache.xmlbeans.XmlInt xgetWidth();
            
            /**
             * Sets the "width" element
             */
            void setWidth(int width);
            
            /**
             * Sets (as xml) the "width" element
             */
            void xsetWidth(org.apache.xmlbeans.XmlInt width);
            
            /**
             * Gets the "height" element
             */
            int getHeight();
            
            /**
             * Gets (as xml) the "height" element
             */
            org.apache.xmlbeans.XmlInt xgetHeight();
            
            /**
             * Sets the "height" element
             */
            void setHeight(int height);
            
            /**
             * Sets (as xml) the "height" element
             */
            void xsetHeight(org.apache.xmlbeans.XmlInt height);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode newInstance() {
                  return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode.Barcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode newInstance() {
              return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.nic.siiDte.TedBarcodeDocument.TedBarcode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.nic.siiDte.TedBarcodeDocument.TedBarcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.nic.siiDte.TedBarcodeDocument newInstance() {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.nic.siiDte.TedBarcodeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.nic.siiDte.TedBarcodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.nic.siiDte.TedBarcodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.nic.siiDte.TedBarcodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
