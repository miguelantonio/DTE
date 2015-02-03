/*
 * XML Type:  TEDType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.TEDType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte;


/**
 * An XML TEDType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public interface TEDType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TEDType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("tedtypebac0type");
    
    /**
     * Gets the "DD" element
     */
    cl.sii.siiDte.TEDType.DD getDD();
    
    /**
     * Sets the "DD" element
     */
    void setDD(cl.sii.siiDte.TEDType.DD dd);
    
    /**
     * Appends and returns a new empty "DD" element
     */
    cl.sii.siiDte.TEDType.DD addNewDD();
    
    /**
     * Gets the "FRMT" element
     */
    cl.sii.siiDte.TEDType.FRMT getFRMT();
    
    /**
     * Sets the "FRMT" element
     */
    void setFRMT(cl.sii.siiDte.TEDType.FRMT frmt);
    
    /**
     * Appends and returns a new empty "FRMT" element
     */
    cl.sii.siiDte.TEDType.FRMT addNewFRMT();
    
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
     * An XML DD(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface DD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("ddba24elemtype");
        
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
        cl.sii.siiDte.TEDType.DD.RSR xgetRSR();
        
        /**
         * Sets the "RSR" element
         */
        void setRSR(java.lang.String rsr);
        
        /**
         * Sets (as xml) the "RSR" element
         */
        void xsetRSR(cl.sii.siiDte.TEDType.DD.RSR rsr);
        
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
        cl.sii.siiDte.TEDType.DD.IT1 xgetIT1();
        
        /**
         * Sets the "IT1" element
         */
        void setIT1(java.lang.String it1);
        
        /**
         * Sets (as xml) the "IT1" element
         */
        void xsetIT1(cl.sii.siiDte.TEDType.DD.IT1 it1);
        
        /**
         * Gets the "CAF" element
         */
        cl.sii.siiDte.CAFType getCAF();
        
        /**
         * Sets the "CAF" element
         */
        void setCAF(cl.sii.siiDte.CAFType caf);
        
        /**
         * Appends and returns a new empty "CAF" element
         */
        cl.sii.siiDte.CAFType addNewCAF();
        
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
         * An XML RSR(@http://www.sii.cl/SiiDte).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.TEDType$DD$RSR.
         */
        public interface RSR extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RSR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("rsr67c1elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.TEDType.DD.RSR newValue(java.lang.Object obj) {
                  return (cl.sii.siiDte.TEDType.DD.RSR) type.newValue( obj ); }
                
                public static cl.sii.siiDte.TEDType.DD.RSR newInstance() {
                  return (cl.sii.siiDte.TEDType.DD.RSR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.TEDType.DD.RSR newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.TEDType.DD.RSR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML IT1(@http://www.sii.cl/SiiDte).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.TEDType$DD$IT1.
         */
        public interface IT1 extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IT1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("it12cf6elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.TEDType.DD.IT1 newValue(java.lang.Object obj) {
                  return (cl.sii.siiDte.TEDType.DD.IT1) type.newValue( obj ); }
                
                public static cl.sii.siiDte.TEDType.DD.IT1 newInstance() {
                  return (cl.sii.siiDte.TEDType.DD.IT1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.TEDType.DD.IT1 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.TEDType.DD.IT1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.TEDType.DD newInstance() {
              return (cl.sii.siiDte.TEDType.DD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.TEDType.DD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.TEDType.DD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML FRMT(@http://www.sii.cl/SiiDte).
     *
     * This is an atomic type that is a restriction of cl.sii.siiDte.TEDType$FRMT.
     */
    public interface FRMT extends org.apache.xmlbeans.XmlBase64Binary
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FRMT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("frmt7c51elemtype");
        
        /**
         * Gets the "algoritmo" attribute
         */
        cl.sii.siiDte.TEDType.FRMT.Algoritmo.Enum getAlgoritmo();
        
        /**
         * Gets (as xml) the "algoritmo" attribute
         */
        cl.sii.siiDte.TEDType.FRMT.Algoritmo xgetAlgoritmo();
        
        /**
         * Sets the "algoritmo" attribute
         */
        void setAlgoritmo(cl.sii.siiDte.TEDType.FRMT.Algoritmo.Enum algoritmo);
        
        /**
         * Sets (as xml) the "algoritmo" attribute
         */
        void xsetAlgoritmo(cl.sii.siiDte.TEDType.FRMT.Algoritmo algoritmo);
        
        /**
         * An XML algoritmo(@).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.TEDType$FRMT$Algoritmo.
         */
        public interface Algoritmo extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Algoritmo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E51E27A7494EF1BD82527CD39BFB27A").resolveHandle("algoritmob7c5attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SHA_1_WITH_RSA = Enum.forString("SHA1withRSA");
            static final Enum SHA_1_WITH_DSA = Enum.forString("SHA1withDSA");
            
            static final int INT_SHA_1_WITH_RSA = Enum.INT_SHA_1_WITH_RSA;
            static final int INT_SHA_1_WITH_DSA = Enum.INT_SHA_1_WITH_DSA;
            
            /**
             * Enumeration value class for cl.sii.siiDte.TEDType$FRMT$Algoritmo.
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
                public static cl.sii.siiDte.TEDType.FRMT.Algoritmo newValue(java.lang.Object obj) {
                  return (cl.sii.siiDte.TEDType.FRMT.Algoritmo) type.newValue( obj ); }
                
                public static cl.sii.siiDte.TEDType.FRMT.Algoritmo newInstance() {
                  return (cl.sii.siiDte.TEDType.FRMT.Algoritmo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.TEDType.FRMT.Algoritmo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.TEDType.FRMT.Algoritmo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.TEDType.FRMT newInstance() {
              return (cl.sii.siiDte.TEDType.FRMT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.TEDType.FRMT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.TEDType.FRMT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.TEDType newInstance() {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.TEDType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.TEDType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.TEDType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.TEDType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.TEDType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.TEDType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.TEDType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.TEDType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.TEDType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.TEDType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.TEDType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.TEDType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.TEDType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.TEDType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.TEDType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.TEDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.TEDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.TEDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
