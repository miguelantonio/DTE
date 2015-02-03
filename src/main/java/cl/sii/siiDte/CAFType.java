/*
 * XML Type:  CAFType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.CAFType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte;


/**
 * An XML CAFType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public interface CAFType extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.CAFTypeExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CAFType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("caftypeb32btype");
    
    /**
     * Gets the "DA" element
     */
    cl.sii.siiDte.CAFType.DA getDA();
    
    /**
     * Sets the "DA" element
     */
    void setDA(cl.sii.siiDte.CAFType.DA da);
    
    /**
     * Appends and returns a new empty "DA" element
     */
    cl.sii.siiDte.CAFType.DA addNewDA();
    
    /**
     * Gets the "FRMA" element
     */
    cl.sii.siiDte.CAFType.FRMA getFRMA();
    
    /**
     * Sets the "FRMA" element
     */
    void setFRMA(cl.sii.siiDte.CAFType.FRMA frma);
    
    /**
     * Appends and returns a new empty "FRMA" element
     */
    cl.sii.siiDte.CAFType.FRMA addNewFRMA();
    
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
     * An XML DA(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface DA extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("da0972elemtype");
        
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
        cl.sii.siiDte.CAFType.DA.RS xgetRS();
        
        /**
         * Sets the "RS" element
         */
        void setRS(java.lang.String rs);
        
        /**
         * Sets (as xml) the "RS" element
         */
        void xsetRS(cl.sii.siiDte.CAFType.DA.RS rs);
        
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
        cl.sii.siiDte.CAFType.DA.RNG getRNG();
        
        /**
         * Sets the "RNG" element
         */
        void setRNG(cl.sii.siiDte.CAFType.DA.RNG rng);
        
        /**
         * Appends and returns a new empty "RNG" element
         */
        cl.sii.siiDte.CAFType.DA.RNG addNewRNG();
        
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
        cl.sii.siiDte.CAFType.DA.RSAPK getRSAPK();
        
        /**
         * True if has "RSAPK" element
         */
        boolean isSetRSAPK();
        
        /**
         * Sets the "RSAPK" element
         */
        void setRSAPK(cl.sii.siiDte.CAFType.DA.RSAPK rsapk);
        
        /**
         * Appends and returns a new empty "RSAPK" element
         */
        cl.sii.siiDte.CAFType.DA.RSAPK addNewRSAPK();
        
        /**
         * Unsets the "RSAPK" element
         */
        void unsetRSAPK();
        
        /**
         * Gets the "DSAPK" element
         */
        cl.sii.siiDte.CAFType.DA.DSAPK getDSAPK();
        
        /**
         * True if has "DSAPK" element
         */
        boolean isSetDSAPK();
        
        /**
         * Sets the "DSAPK" element
         */
        void setDSAPK(cl.sii.siiDte.CAFType.DA.DSAPK dsapk);
        
        /**
         * Appends and returns a new empty "DSAPK" element
         */
        cl.sii.siiDte.CAFType.DA.DSAPK addNewDSAPK();
        
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
         * An XML RS(@http://www.sii.cl/SiiDte).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.CAFType$DA$RS.
         */
        public interface RS extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("rs754felemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.CAFType.DA.RS newValue(java.lang.Object obj) {
                  return (cl.sii.siiDte.CAFType.DA.RS) type.newValue( obj ); }
                
                public static cl.sii.siiDte.CAFType.DA.RS newInstance() {
                  return (cl.sii.siiDte.CAFType.DA.RS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.CAFType.DA.RS newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.CAFType.DA.RS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML RNG(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface RNG extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RNG.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("rngd469elemtype");
            
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
                public static cl.sii.siiDte.CAFType.DA.RNG newInstance() {
                  return (cl.sii.siiDte.CAFType.DA.RNG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.CAFType.DA.RNG newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.CAFType.DA.RNG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML RSAPK(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface RSAPK extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RSAPK.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("rsapk8cf9elemtype");
            
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
                public static cl.sii.siiDte.CAFType.DA.RSAPK newInstance() {
                  return (cl.sii.siiDte.CAFType.DA.RSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.CAFType.DA.RSAPK newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.CAFType.DA.RSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML DSAPK(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface DSAPK extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DSAPK.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("dsapke9ebelemtype");
            
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
                public static cl.sii.siiDte.CAFType.DA.DSAPK newInstance() {
                  return (cl.sii.siiDte.CAFType.DA.DSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.CAFType.DA.DSAPK newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.CAFType.DA.DSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.CAFType.DA newInstance() {
              return (cl.sii.siiDte.CAFType.DA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.CAFType.DA newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.CAFType.DA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML FRMA(@http://www.sii.cl/SiiDte).
     *
     * This is an atomic type that is a restriction of cl.sii.siiDte.CAFType$FRMA.
     */
    public interface FRMA extends org.apache.xmlbeans.XmlBase64Binary
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FRMA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("frma45afelemtype");
        
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
            public static cl.sii.siiDte.CAFType.FRMA newInstance() {
              return (cl.sii.siiDte.CAFType.FRMA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.CAFType.FRMA newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.CAFType.FRMA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.CAFType newInstance() {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.CAFType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.CAFType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.CAFType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.CAFType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.CAFType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.CAFType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.CAFType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.CAFType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.CAFType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.CAFType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.CAFType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.CAFType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.CAFType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.CAFType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.CAFType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.CAFType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.CAFType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.CAFType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
