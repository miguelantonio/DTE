/*
 * An XML document type.
 * Localname: LceCal
 * Namespace: http://www.sii.cl/SiiLce
 * Java type: cl.sii.siiLce.LceCalDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiLce;


/**
 * A document containing one LceCal(@http://www.sii.cl/SiiLce) element.
 *
 * This is a complex type.
 */
public interface LceCalDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LceCalDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8456C93EBBDB8033F1619C241E02AA61").resolveHandle("lcecal0ea4doctype");
    
    /**
     * Gets the "LceCal" element
     */
    cl.sii.siiLce.LceCalDocument.LceCal getLceCal();
    
    /**
     * Sets the "LceCal" element
     */
    void setLceCal(cl.sii.siiLce.LceCalDocument.LceCal lceCal);
    
    /**
     * Appends and returns a new empty "LceCal" element
     */
    cl.sii.siiLce.LceCalDocument.LceCal addNewLceCal();
    
    /**
     * An XML LceCal(@http://www.sii.cl/SiiLce).
     *
     * This is a complex type.
     */
    public interface LceCal extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LceCal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8456C93EBBDB8033F1619C241E02AA61").resolveHandle("lcecal2580elemtype");
        
        /**
         * Gets the "DocumentoCal" element
         */
        cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal getDocumentoCal();
        
        /**
         * Sets the "DocumentoCal" element
         */
        void setDocumentoCal(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal documentoCal);
        
        /**
         * Appends and returns a new empty "DocumentoCal" element
         */
        cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal addNewDocumentoCal();
        
        /**
         * Gets the "Signature" element
         */
        cl.sii.siiDte.dsig.SignatureType getSignature();
        
        /**
         * Sets the "Signature" element
         */
        void setSignature(cl.sii.siiDte.dsig.SignatureType signature);
        
        /**
         * Appends and returns a new empty "Signature" element
         */
        cl.sii.siiDte.dsig.SignatureType addNewSignature();
        
        /**
         * Gets the "version" attribute
         */
        java.math.BigDecimal getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlDecimal xgetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.math.BigDecimal version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlDecimal version);
        
        /**
         * An XML DocumentoCal(@http://www.sii.cl/SiiLce).
         *
         * This is a complex type.
         */
        public interface DocumentoCal extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentoCal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8456C93EBBDB8033F1619C241E02AA61").resolveHandle("documentocal3e8aelemtype");
            
            /**
             * Gets the "RutDistribuidor" element
             */
            java.lang.String getRutDistribuidor();
            
            /**
             * Gets (as xml) the "RutDistribuidor" element
             */
            cl.sii.siiLce.RUTType xgetRutDistribuidor();
            
            /**
             * Sets the "RutDistribuidor" element
             */
            void setRutDistribuidor(java.lang.String rutDistribuidor);
            
            /**
             * Sets (as xml) the "RutDistribuidor" element
             */
            void xsetRutDistribuidor(cl.sii.siiLce.RUTType rutDistribuidor);
            
            /**
             * Gets the "TipoCertificado" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado.Enum getTipoCertificado();
            
            /**
             * Gets (as xml) the "TipoCertificado" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado xgetTipoCertificado();
            
            /**
             * Sets the "TipoCertificado" element
             */
            void setTipoCertificado(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado.Enum tipoCertificado);
            
            /**
             * Sets (as xml) the "TipoCertificado" element
             */
            void xsetTipoCertificado(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado tipoCertificado);
            
            /**
             * Gets the "Clase" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase.Enum getClase();
            
            /**
             * Gets (as xml) the "Clase" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase xgetClase();
            
            /**
             * Sets the "Clase" element
             */
            void setClase(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase.Enum clase);
            
            /**
             * Sets (as xml) the "Clase" element
             */
            void xsetClase(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase clase);
            
            /**
             * Gets the "TipoLCE" element
             */
            java.math.BigInteger getTipoLCE();
            
            /**
             * Gets (as xml) the "TipoLCE" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE xgetTipoLCE();
            
            /**
             * Sets the "TipoLCE" element
             */
            void setTipoLCE(java.math.BigInteger tipoLCE);
            
            /**
             * Sets (as xml) the "TipoLCE" element
             */
            void xsetTipoLCE(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE tipoLCE);
            
            /**
             * Gets the "FchEmision" element
             */
            java.util.Calendar getFchEmision();
            
            /**
             * Gets (as xml) the "FchEmision" element
             */
            org.apache.xmlbeans.XmlDate xgetFchEmision();
            
            /**
             * Sets the "FchEmision" element
             */
            void setFchEmision(java.util.Calendar fchEmision);
            
            /**
             * Sets (as xml) the "FchEmision" element
             */
            void xsetFchEmision(org.apache.xmlbeans.XmlDate fchEmision);
            
            /**
             * Gets the "PeriodoVigencia" element
             */
            java.util.Calendar getPeriodoVigencia();
            
            /**
             * Gets (as xml) the "PeriodoVigencia" element
             */
            org.apache.xmlbeans.XmlGYear xgetPeriodoVigencia();
            
            /**
             * Sets the "PeriodoVigencia" element
             */
            void setPeriodoVigencia(java.util.Calendar periodoVigencia);
            
            /**
             * Sets (as xml) the "PeriodoVigencia" element
             */
            void xsetPeriodoVigencia(org.apache.xmlbeans.XmlGYear periodoVigencia);
            
            /**
             * Gets the "TmstFirma" element
             */
            java.util.Calendar getTmstFirma();
            
            /**
             * Gets (as xml) the "TmstFirma" element
             */
            org.apache.xmlbeans.XmlDateTime xgetTmstFirma();
            
            /**
             * Sets the "TmstFirma" element
             */
            void setTmstFirma(java.util.Calendar tmstFirma);
            
            /**
             * Sets (as xml) the "TmstFirma" element
             */
            void xsetTmstFirma(org.apache.xmlbeans.XmlDateTime tmstFirma);
            
            /**
             * Gets the "ID" attribute
             */
            java.lang.String getID();
            
            /**
             * Gets (as xml) the "ID" attribute
             */
            org.apache.xmlbeans.XmlID xgetID();
            
            /**
             * Sets the "ID" attribute
             */
            void setID(java.lang.String id);
            
            /**
             * Sets (as xml) the "ID" attribute
             */
            void xsetID(org.apache.xmlbeans.XmlID id);
            
            /**
             * An XML TipoCertificado(@http://www.sii.cl/SiiLce).
             *
             * This is an atomic type that is a restriction of cl.sii.siiLce.LceCalDocument$LceCal$DocumentoCal$TipoCertificado.
             */
            public interface TipoCertificado extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoCertificado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8456C93EBBDB8033F1619C241E02AA61").resolveHandle("tipocertificadoc173elemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum C = Enum.forString("C");
                static final Enum P = Enum.forString("P");
                
                static final int INT_C = Enum.INT_C;
                static final int INT_P = Enum.INT_P;
                
                /**
                 * Enumeration value class for cl.sii.siiLce.LceCalDocument$LceCal$DocumentoCal$TipoCertificado.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_C
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
                    
                    static final int INT_C = 1;
                    static final int INT_P = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("C", INT_C),
                        new Enum("P", INT_P),
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
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado newValue(java.lang.Object obj) {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado) type.newValue( obj ); }
                    
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado newInstance() {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Clase(@http://www.sii.cl/SiiLce).
             *
             * This is an atomic type that is a restriction of cl.sii.siiLce.LceCalDocument$LceCal$DocumentoCal$Clase.
             */
            public interface Clase extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Clase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8456C93EBBDB8033F1619C241E02AA61").resolveHandle("clase5ec0elemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum X_1 = Enum.forString("1");
                static final Enum X_2 = Enum.forString("2");
                static final Enum X_3 = Enum.forString("3");
                
                static final int INT_X_1 = Enum.INT_X_1;
                static final int INT_X_2 = Enum.INT_X_2;
                static final int INT_X_3 = Enum.INT_X_3;
                
                /**
                 * Enumeration value class for cl.sii.siiLce.LceCalDocument$LceCal$DocumentoCal$Clase.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_X_1
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
                    
                    static final int INT_X_1 = 1;
                    static final int INT_X_2 = 2;
                    static final int INT_X_3 = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("1", INT_X_1),
                        new Enum("2", INT_X_2),
                        new Enum("3", INT_X_3),
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
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase newValue(java.lang.Object obj) {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase) type.newValue( obj ); }
                    
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase newInstance() {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML TipoLCE(@http://www.sii.cl/SiiLce).
             *
             * This is an atomic type that is a restriction of cl.sii.siiLce.LceCalDocument$LceCal$DocumentoCal$TipoLCE.
             */
            public interface TipoLCE extends org.apache.xmlbeans.XmlPositiveInteger
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoLCE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8456C93EBBDB8033F1619C241E02AA61").resolveHandle("tipolce8550elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE newValue(java.lang.Object obj) {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE) type.newValue( obj ); }
                    
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE newInstance() {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal newInstance() {
                  return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiLce.LceCalDocument.LceCal newInstance() {
              return (cl.sii.siiLce.LceCalDocument.LceCal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiLce.LceCalDocument.LceCal newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiLce.LceCalDocument.LceCal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiLce.LceCalDocument newInstance() {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiLce.LceCalDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiLce.LceCalDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiLce.LceCalDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiLce.LceCalDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiLce.LceCalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiLce.LceCalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiLce.LceCalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
