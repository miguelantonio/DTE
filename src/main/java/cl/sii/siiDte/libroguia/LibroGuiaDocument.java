/*
 * An XML document type.
 * Localname: LibroGuia
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.libroguia.LibroGuiaDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.libroguia;


/**
 * A document containing one LibroGuia(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface LibroGuiaDocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.LibroGuiaDocumentExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LibroGuiaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("libroguia9fb5doctype");
    
    /**
     * Gets the "LibroGuia" element
     */
    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia getLibroGuia();
    
    /**
     * Sets the "LibroGuia" element
     */
    void setLibroGuia(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia libroGuia);
    
    /**
     * Appends and returns a new empty "LibroGuia" element
     */
    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia addNewLibroGuia();
    
    /**
     * An XML LibroGuia(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface LibroGuia extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LibroGuia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("libroguia18c1elemtype");
        
        /**
         * Gets the "EnvioLibro" element
         */
        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro getEnvioLibro();
        
        /**
         * Sets the "EnvioLibro" element
         */
        void setEnvioLibro(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro envioLibro);
        
        /**
         * Appends and returns a new empty "EnvioLibro" element
         */
        cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro addNewEnvioLibro();
        
        /**
         * Gets the "Signature" element
         */
        cl.sii.siiDte.libroguia.SignatureType getSignature();
        
        /**
         * Sets the "Signature" element
         */
        void setSignature(cl.sii.siiDte.libroguia.SignatureType signature);
        
        /**
         * Appends and returns a new empty "Signature" element
         */
        cl.sii.siiDte.libroguia.SignatureType addNewSignature();
        
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
         * An XML EnvioLibro(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface EnvioLibro extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioLibro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("enviolibro68f6elemtype");
            
            /**
             * Gets the "Caratula" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula getCaratula();
            
            /**
             * Sets the "Caratula" element
             */
            void setCaratula(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula caratula);
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula addNewCaratula();
            
            /**
             * Gets the "ResumenSegmento" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento getResumenSegmento();
            
            /**
             * True if has "ResumenSegmento" element
             */
            boolean isSetResumenSegmento();
            
            /**
             * Sets the "ResumenSegmento" element
             */
            void setResumenSegmento(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento resumenSegmento);
            
            /**
             * Appends and returns a new empty "ResumenSegmento" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento addNewResumenSegmento();
            
            /**
             * Unsets the "ResumenSegmento" element
             */
            void unsetResumenSegmento();
            
            /**
             * Gets the "ResumenPeriodo" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo getResumenPeriodo();
            
            /**
             * True if has "ResumenPeriodo" element
             */
            boolean isSetResumenPeriodo();
            
            /**
             * Sets the "ResumenPeriodo" element
             */
            void setResumenPeriodo(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo resumenPeriodo);
            
            /**
             * Appends and returns a new empty "ResumenPeriodo" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo addNewResumenPeriodo();
            
            /**
             * Unsets the "ResumenPeriodo" element
             */
            void unsetResumenPeriodo();
            
            /**
             * Gets array of all "Detalle" elements
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle[] getDetalleArray();
            
            /**
             * Gets ith "Detalle" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle getDetalleArray(int i);
            
            /**
             * Returns number of "Detalle" element
             */
            int sizeOfDetalleArray();
            
            /**
             * Sets array of all "Detalle" element
             */
            void setDetalleArray(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle[] detalleArray);
            
            /**
             * Sets ith "Detalle" element
             */
            void setDetalleArray(int i, cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle detalle);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Detalle" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle insertNewDetalle(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Detalle" element
             */
            cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle addNewDetalle();
            
            /**
             * Removes the ith "Detalle" element
             */
            void removeDetalle(int i);
            
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
             * An XML Caratula(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface Caratula extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caratula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("caratula25b5elemtype");
                
                /**
                 * Gets the "RutEmisorLibro" element
                 */
                java.lang.String getRutEmisorLibro();
                
                /**
                 * Gets (as xml) the "RutEmisorLibro" element
                 */
                cl.sii.siiDte.libroguia.RUTType xgetRutEmisorLibro();
                
                /**
                 * Sets the "RutEmisorLibro" element
                 */
                void setRutEmisorLibro(java.lang.String rutEmisorLibro);
                
                /**
                 * Sets (as xml) the "RutEmisorLibro" element
                 */
                void xsetRutEmisorLibro(cl.sii.siiDte.libroguia.RUTType rutEmisorLibro);
                
                /**
                 * Gets the "RutEnvia" element
                 */
                java.lang.String getRutEnvia();
                
                /**
                 * Gets (as xml) the "RutEnvia" element
                 */
                cl.sii.siiDte.libroguia.RUTType xgetRutEnvia();
                
                /**
                 * Sets the "RutEnvia" element
                 */
                void setRutEnvia(java.lang.String rutEnvia);
                
                /**
                 * Sets (as xml) the "RutEnvia" element
                 */
                void xsetRutEnvia(cl.sii.siiDte.libroguia.RUTType rutEnvia);
                
                /**
                 * Gets the "PeriodoTributario" element
                 */
                java.util.Calendar getPeriodoTributario();
                
                /**
                 * Gets (as xml) the "PeriodoTributario" element
                 */
                org.apache.xmlbeans.XmlGYearMonth xgetPeriodoTributario();
                
                /**
                 * Sets the "PeriodoTributario" element
                 */
                void setPeriodoTributario(java.util.Calendar periodoTributario);
                
                /**
                 * Sets (as xml) the "PeriodoTributario" element
                 */
                void xsetPeriodoTributario(org.apache.xmlbeans.XmlGYearMonth periodoTributario);
                
                /**
                 * Gets the "FchResol" element
                 */
                java.util.Calendar getFchResol();
                
                /**
                 * Gets (as xml) the "FchResol" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchResol();
                
                /**
                 * Sets the "FchResol" element
                 */
                void setFchResol(java.util.Calendar fchResol);
                
                /**
                 * Sets (as xml) the "FchResol" element
                 */
                void xsetFchResol(org.apache.xmlbeans.XmlDate fchResol);
                
                /**
                 * Gets the "NroResol" element
                 */
                java.math.BigInteger getNroResol();
                
                /**
                 * Gets (as xml) the "NroResol" element
                 */
                org.apache.xmlbeans.XmlNonNegativeInteger xgetNroResol();
                
                /**
                 * Sets the "NroResol" element
                 */
                void setNroResol(java.math.BigInteger nroResol);
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                void xsetNroResol(org.apache.xmlbeans.XmlNonNegativeInteger nroResol);
                
                /**
                 * Gets the "TipoLibro" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro.Enum getTipoLibro();
                
                /**
                 * Gets (as xml) the "TipoLibro" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro xgetTipoLibro();
                
                /**
                 * Sets the "TipoLibro" element
                 */
                void setTipoLibro(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro.Enum tipoLibro);
                
                /**
                 * Sets (as xml) the "TipoLibro" element
                 */
                void xsetTipoLibro(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro tipoLibro);
                
                /**
                 * Gets the "TipoEnvio" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio.Enum getTipoEnvio();
                
                /**
                 * Gets (as xml) the "TipoEnvio" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio xgetTipoEnvio();
                
                /**
                 * True if has "TipoEnvio" element
                 */
                boolean isSetTipoEnvio();
                
                /**
                 * Sets the "TipoEnvio" element
                 */
                void setTipoEnvio(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio.Enum tipoEnvio);
                
                /**
                 * Sets (as xml) the "TipoEnvio" element
                 */
                void xsetTipoEnvio(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio tipoEnvio);
                
                /**
                 * Unsets the "TipoEnvio" element
                 */
                void unsetTipoEnvio();
                
                /**
                 * Gets the "NroSegmento" element
                 */
                int getNroSegmento();
                
                /**
                 * Gets (as xml) the "NroSegmento" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento xgetNroSegmento();
                
                /**
                 * True if has "NroSegmento" element
                 */
                boolean isSetNroSegmento();
                
                /**
                 * Sets the "NroSegmento" element
                 */
                void setNroSegmento(int nroSegmento);
                
                /**
                 * Sets (as xml) the "NroSegmento" element
                 */
                void xsetNroSegmento(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento nroSegmento);
                
                /**
                 * Unsets the "NroSegmento" element
                 */
                void unsetNroSegmento();
                
                /**
                 * Gets the "FolioNotificacion" element
                 */
                long getFolioNotificacion();
                
                /**
                 * Gets (as xml) the "FolioNotificacion" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion xgetFolioNotificacion();
                
                /**
                 * Sets the "FolioNotificacion" element
                 */
                void setFolioNotificacion(long folioNotificacion);
                
                /**
                 * Sets (as xml) the "FolioNotificacion" element
                 */
                void xsetFolioNotificacion(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion folioNotificacion);
                
                /**
                 * An XML TipoLibro(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$TipoLibro.
                 */
                public interface TipoLibro extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoLibro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("tipolibroabfbelemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum ESPECIAL = Enum.forString("ESPECIAL");
                    
                    static final int INT_ESPECIAL = Enum.INT_ESPECIAL;
                    
                    /**
                     * Enumeration value class for cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$TipoLibro.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_ESPECIAL
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
                      
                      static final int INT_ESPECIAL = 1;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("ESPECIAL", INT_ESPECIAL),
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
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TipoEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$TipoEnvio.
                 */
                public interface TipoEnvio extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoEnvio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("tipoenviof3caelemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum PARCIAL = Enum.forString("PARCIAL");
                    static final Enum FINAL = Enum.forString("FINAL");
                    static final Enum TOTAL = Enum.forString("TOTAL");
                    static final Enum AJUSTE = Enum.forString("AJUSTE");
                    
                    static final int INT_PARCIAL = Enum.INT_PARCIAL;
                    static final int INT_FINAL = Enum.INT_FINAL;
                    static final int INT_TOTAL = Enum.INT_TOTAL;
                    static final int INT_AJUSTE = Enum.INT_AJUSTE;
                    
                    /**
                     * Enumeration value class for cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$TipoEnvio.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_PARCIAL
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
                      
                      static final int INT_PARCIAL = 1;
                      static final int INT_FINAL = 2;
                      static final int INT_TOTAL = 3;
                      static final int INT_AJUSTE = 4;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("PARCIAL", INT_PARCIAL),
                          new Enum("FINAL", INT_FINAL),
                          new Enum("TOTAL", INT_TOTAL),
                          new Enum("AJUSTE", INT_AJUSTE),
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
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.TipoEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML NroSegmento(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$NroSegmento.
                 */
                public interface NroSegmento extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroSegmento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("nrosegmento7ae2elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.NroSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML FolioNotificacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Caratula$FolioNotificacion.
                 */
                public interface FolioNotificacion extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FolioNotificacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("folionotificacion4824elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula.FolioNotificacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula newInstance() {
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ResumenSegmento(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface ResumenSegmento extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResumenSegmento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("resumensegmentoac1felemtype");
                
                /**
                 * Gets the "TotFolAnulado" element
                 */
                long getTotFolAnulado();
                
                /**
                 * Gets (as xml) the "TotFolAnulado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado xgetTotFolAnulado();
                
                /**
                 * True if has "TotFolAnulado" element
                 */
                boolean isSetTotFolAnulado();
                
                /**
                 * Sets the "TotFolAnulado" element
                 */
                void setTotFolAnulado(long totFolAnulado);
                
                /**
                 * Sets (as xml) the "TotFolAnulado" element
                 */
                void xsetTotFolAnulado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado totFolAnulado);
                
                /**
                 * Unsets the "TotFolAnulado" element
                 */
                void unsetTotFolAnulado();
                
                /**
                 * Gets the "TotGuiaAnulada" element
                 */
                long getTotGuiaAnulada();
                
                /**
                 * Gets (as xml) the "TotGuiaAnulada" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada xgetTotGuiaAnulada();
                
                /**
                 * True if has "TotGuiaAnulada" element
                 */
                boolean isSetTotGuiaAnulada();
                
                /**
                 * Sets the "TotGuiaAnulada" element
                 */
                void setTotGuiaAnulada(long totGuiaAnulada);
                
                /**
                 * Sets (as xml) the "TotGuiaAnulada" element
                 */
                void xsetTotGuiaAnulada(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada totGuiaAnulada);
                
                /**
                 * Unsets the "TotGuiaAnulada" element
                 */
                void unsetTotGuiaAnulada();
                
                /**
                 * Gets the "TotGuiaVenta" element
                 */
                long getTotGuiaVenta();
                
                /**
                 * Gets (as xml) the "TotGuiaVenta" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta xgetTotGuiaVenta();
                
                /**
                 * Sets the "TotGuiaVenta" element
                 */
                void setTotGuiaVenta(long totGuiaVenta);
                
                /**
                 * Sets (as xml) the "TotGuiaVenta" element
                 */
                void xsetTotGuiaVenta(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta totGuiaVenta);
                
                /**
                 * Gets the "TotMntGuiaVta" element
                 */
                long getTotMntGuiaVta();
                
                /**
                 * Gets (as xml) the "TotMntGuiaVta" element
                 */
                cl.sii.siiDte.libroguia.ValorType xgetTotMntGuiaVta();
                
                /**
                 * Sets the "TotMntGuiaVta" element
                 */
                void setTotMntGuiaVta(long totMntGuiaVta);
                
                /**
                 * Sets (as xml) the "TotMntGuiaVta" element
                 */
                void xsetTotMntGuiaVta(cl.sii.siiDte.libroguia.ValorType totMntGuiaVta);
                
                /**
                 * Gets the "TotMntModificado" element
                 */
                long getTotMntModificado();
                
                /**
                 * Gets (as xml) the "TotMntModificado" element
                 */
                cl.sii.siiDte.libroguia.ValorType xgetTotMntModificado();
                
                /**
                 * True if has "TotMntModificado" element
                 */
                boolean isSetTotMntModificado();
                
                /**
                 * Sets the "TotMntModificado" element
                 */
                void setTotMntModificado(long totMntModificado);
                
                /**
                 * Sets (as xml) the "TotMntModificado" element
                 */
                void xsetTotMntModificado(cl.sii.siiDte.libroguia.ValorType totMntModificado);
                
                /**
                 * Unsets the "TotMntModificado" element
                 */
                void unsetTotMntModificado();
                
                /**
                 * Gets array of all "TotTraslado" elements
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado[] getTotTrasladoArray();
                
                /**
                 * Gets ith "TotTraslado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado getTotTrasladoArray(int i);
                
                /**
                 * Returns number of "TotTraslado" element
                 */
                int sizeOfTotTrasladoArray();
                
                /**
                 * Sets array of all "TotTraslado" element
                 */
                void setTotTrasladoArray(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado[] totTrasladoArray);
                
                /**
                 * Sets ith "TotTraslado" element
                 */
                void setTotTrasladoArray(int i, cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado totTraslado);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotTraslado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado insertNewTotTraslado(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotTraslado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado addNewTotTraslado();
                
                /**
                 * Removes the ith "TotTraslado" element
                 */
                void removeTotTraslado(int i);
                
                /**
                 * An XML TotFolAnulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotFolAnulado.
                 */
                public interface TotFolAnulado extends org.apache.xmlbeans.XmlInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotFolAnulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("totfolanulado3909elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotFolAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TotGuiaAnulada(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotGuiaAnulada.
                 */
                public interface TotGuiaAnulada extends org.apache.xmlbeans.XmlInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotGuiaAnulada.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("totguiaanulada2af6elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaAnulada) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TotGuiaVenta(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotGuiaVenta.
                 */
                public interface TotGuiaVenta extends org.apache.xmlbeans.XmlInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotGuiaVenta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("totguiaventa44e8elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotGuiaVenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TotTraslado(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface TotTraslado extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotTraslado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("tottrasladof2d4elemtype");
                    
                    /**
                     * Gets the "TpoTraslado" element
                     */
                    int getTpoTraslado();
                    
                    /**
                     * Gets (as xml) the "TpoTraslado" element
                     */
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado xgetTpoTraslado();
                    
                    /**
                     * Sets the "TpoTraslado" element
                     */
                    void setTpoTraslado(int tpoTraslado);
                    
                    /**
                     * Sets (as xml) the "TpoTraslado" element
                     */
                    void xsetTpoTraslado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado tpoTraslado);
                    
                    /**
                     * Gets the "CantGuia" element
                     */
                    long getCantGuia();
                    
                    /**
                     * Gets (as xml) the "CantGuia" element
                     */
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia xgetCantGuia();
                    
                    /**
                     * Sets the "CantGuia" element
                     */
                    void setCantGuia(long cantGuia);
                    
                    /**
                     * Sets (as xml) the "CantGuia" element
                     */
                    void xsetCantGuia(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia cantGuia);
                    
                    /**
                     * Gets the "MntGuia" element
                     */
                    long getMntGuia();
                    
                    /**
                     * Gets (as xml) the "MntGuia" element
                     */
                    cl.sii.siiDte.libroguia.ValorType xgetMntGuia();
                    
                    /**
                     * True if has "MntGuia" element
                     */
                    boolean isSetMntGuia();
                    
                    /**
                     * Sets the "MntGuia" element
                     */
                    void setMntGuia(long mntGuia);
                    
                    /**
                     * Sets (as xml) the "MntGuia" element
                     */
                    void xsetMntGuia(cl.sii.siiDte.libroguia.ValorType mntGuia);
                    
                    /**
                     * Unsets the "MntGuia" element
                     */
                    void unsetMntGuia();
                    
                    /**
                     * An XML TpoTraslado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotTraslado$TpoTraslado.
                     */
                    public interface TpoTraslado extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      int getIntValue();
                      void setIntValue(int i);
                      /** @deprecated */
                      int intValue();
                      /** @deprecated */
                      void set(int i);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoTraslado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("tpotraslado2563elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado newInstance() {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.TpoTraslado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML CantGuia(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenSegmento$TotTraslado$CantGuia.
                     */
                    public interface CantGuia extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CantGuia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("cantguia5c5aelemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia newInstance() {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado.CantGuia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento.TotTraslado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento newInstance() {
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ResumenPeriodo(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface ResumenPeriodo extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResumenPeriodo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("resumenperiodoff9felemtype");
                
                /**
                 * Gets the "TotFolAnulado" element
                 */
                long getTotFolAnulado();
                
                /**
                 * Gets (as xml) the "TotFolAnulado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado xgetTotFolAnulado();
                
                /**
                 * True if has "TotFolAnulado" element
                 */
                boolean isSetTotFolAnulado();
                
                /**
                 * Sets the "TotFolAnulado" element
                 */
                void setTotFolAnulado(long totFolAnulado);
                
                /**
                 * Sets (as xml) the "TotFolAnulado" element
                 */
                void xsetTotFolAnulado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado totFolAnulado);
                
                /**
                 * Unsets the "TotFolAnulado" element
                 */
                void unsetTotFolAnulado();
                
                /**
                 * Gets the "TotGuiaAnulada" element
                 */
                long getTotGuiaAnulada();
                
                /**
                 * Gets (as xml) the "TotGuiaAnulada" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada xgetTotGuiaAnulada();
                
                /**
                 * True if has "TotGuiaAnulada" element
                 */
                boolean isSetTotGuiaAnulada();
                
                /**
                 * Sets the "TotGuiaAnulada" element
                 */
                void setTotGuiaAnulada(long totGuiaAnulada);
                
                /**
                 * Sets (as xml) the "TotGuiaAnulada" element
                 */
                void xsetTotGuiaAnulada(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada totGuiaAnulada);
                
                /**
                 * Unsets the "TotGuiaAnulada" element
                 */
                void unsetTotGuiaAnulada();
                
                /**
                 * Gets the "TotGuiaVenta" element
                 */
                long getTotGuiaVenta();
                
                /**
                 * Gets (as xml) the "TotGuiaVenta" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta xgetTotGuiaVenta();
                
                /**
                 * Sets the "TotGuiaVenta" element
                 */
                void setTotGuiaVenta(long totGuiaVenta);
                
                /**
                 * Sets (as xml) the "TotGuiaVenta" element
                 */
                void xsetTotGuiaVenta(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta totGuiaVenta);
                
                /**
                 * Gets the "TotMntGuiaVta" element
                 */
                long getTotMntGuiaVta();
                
                /**
                 * Gets (as xml) the "TotMntGuiaVta" element
                 */
                cl.sii.siiDte.libroguia.MontoType xgetTotMntGuiaVta();
                
                /**
                 * Sets the "TotMntGuiaVta" element
                 */
                void setTotMntGuiaVta(long totMntGuiaVta);
                
                /**
                 * Sets (as xml) the "TotMntGuiaVta" element
                 */
                void xsetTotMntGuiaVta(cl.sii.siiDte.libroguia.MontoType totMntGuiaVta);
                
                /**
                 * Gets the "TotMntModificado" element
                 */
                long getTotMntModificado();
                
                /**
                 * Gets (as xml) the "TotMntModificado" element
                 */
                cl.sii.siiDte.libroguia.MontoType xgetTotMntModificado();
                
                /**
                 * True if has "TotMntModificado" element
                 */
                boolean isSetTotMntModificado();
                
                /**
                 * Sets the "TotMntModificado" element
                 */
                void setTotMntModificado(long totMntModificado);
                
                /**
                 * Sets (as xml) the "TotMntModificado" element
                 */
                void xsetTotMntModificado(cl.sii.siiDte.libroguia.MontoType totMntModificado);
                
                /**
                 * Unsets the "TotMntModificado" element
                 */
                void unsetTotMntModificado();
                
                /**
                 * Gets array of all "TotTraslado" elements
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado[] getTotTrasladoArray();
                
                /**
                 * Gets ith "TotTraslado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado getTotTrasladoArray(int i);
                
                /**
                 * Returns number of "TotTraslado" element
                 */
                int sizeOfTotTrasladoArray();
                
                /**
                 * Sets array of all "TotTraslado" element
                 */
                void setTotTrasladoArray(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado[] totTrasladoArray);
                
                /**
                 * Sets ith "TotTraslado" element
                 */
                void setTotTrasladoArray(int i, cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado totTraslado);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotTraslado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado insertNewTotTraslado(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotTraslado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado addNewTotTraslado();
                
                /**
                 * Removes the ith "TotTraslado" element
                 */
                void removeTotTraslado(int i);
                
                /**
                 * An XML TotFolAnulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotFolAnulado.
                 */
                public interface TotFolAnulado extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotFolAnulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("totfolanulado2d75elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotFolAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TotGuiaAnulada(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotGuiaAnulada.
                 */
                public interface TotGuiaAnulada extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotGuiaAnulada.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("totguiaanuladac9e8elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaAnulada) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TotGuiaVenta(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotGuiaVenta.
                 */
                public interface TotGuiaVenta extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotGuiaVenta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("totguiaventaa9b6elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotGuiaVenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TotTraslado(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface TotTraslado extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotTraslado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("tottraslado8e4aelemtype");
                    
                    /**
                     * Gets the "TpoTraslado" element
                     */
                    int getTpoTraslado();
                    
                    /**
                     * Gets (as xml) the "TpoTraslado" element
                     */
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado xgetTpoTraslado();
                    
                    /**
                     * Sets the "TpoTraslado" element
                     */
                    void setTpoTraslado(int tpoTraslado);
                    
                    /**
                     * Sets (as xml) the "TpoTraslado" element
                     */
                    void xsetTpoTraslado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado tpoTraslado);
                    
                    /**
                     * Gets the "CantGuia" element
                     */
                    long getCantGuia();
                    
                    /**
                     * Gets (as xml) the "CantGuia" element
                     */
                    cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia xgetCantGuia();
                    
                    /**
                     * Sets the "CantGuia" element
                     */
                    void setCantGuia(long cantGuia);
                    
                    /**
                     * Sets (as xml) the "CantGuia" element
                     */
                    void xsetCantGuia(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia cantGuia);
                    
                    /**
                     * Gets the "MntGuia" element
                     */
                    long getMntGuia();
                    
                    /**
                     * Gets (as xml) the "MntGuia" element
                     */
                    cl.sii.siiDte.libroguia.MontoType xgetMntGuia();
                    
                    /**
                     * True if has "MntGuia" element
                     */
                    boolean isSetMntGuia();
                    
                    /**
                     * Sets the "MntGuia" element
                     */
                    void setMntGuia(long mntGuia);
                    
                    /**
                     * Sets (as xml) the "MntGuia" element
                     */
                    void xsetMntGuia(cl.sii.siiDte.libroguia.MontoType mntGuia);
                    
                    /**
                     * Unsets the "MntGuia" element
                     */
                    void unsetMntGuia();
                    
                    /**
                     * An XML TpoTraslado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotTraslado$TpoTraslado.
                     */
                    public interface TpoTraslado extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      int getIntValue();
                      void setIntValue(int i);
                      /** @deprecated */
                      int intValue();
                      /** @deprecated */
                      void set(int i);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoTraslado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("tpotraslado4ddbelemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado newInstance() {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.TpoTraslado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML CantGuia(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$ResumenPeriodo$TotTraslado$CantGuia.
                     */
                    public interface CantGuia extends org.apache.xmlbeans.XmlNonNegativeInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CantGuia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("cantguiadc04elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia newInstance() {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado.CantGuia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo.TotTraslado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo newInstance() {
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.ResumenPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Detalle(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface Detalle extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Detalle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("detalle9779elemtype");
                
                /**
                 * Gets the "Folio" element
                 */
                long getFolio();
                
                /**
                 * Gets (as xml) the "Folio" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio xgetFolio();
                
                /**
                 * Sets the "Folio" element
                 */
                void setFolio(long folio);
                
                /**
                 * Sets (as xml) the "Folio" element
                 */
                void xsetFolio(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio folio);
                
                /**
                 * Gets the "Anulado" element
                 */
                int getAnulado();
                
                /**
                 * Gets (as xml) the "Anulado" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado xgetAnulado();
                
                /**
                 * True if has "Anulado" element
                 */
                boolean isSetAnulado();
                
                /**
                 * Sets the "Anulado" element
                 */
                void setAnulado(int anulado);
                
                /**
                 * Sets (as xml) the "Anulado" element
                 */
                void xsetAnulado(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado anulado);
                
                /**
                 * Unsets the "Anulado" element
                 */
                void unsetAnulado();
                
                /**
                 * Gets the "Operacion" element
                 */
                int getOperacion();
                
                /**
                 * Gets (as xml) the "Operacion" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion xgetOperacion();
                
                /**
                 * True if has "Operacion" element
                 */
                boolean isSetOperacion();
                
                /**
                 * Sets the "Operacion" element
                 */
                void setOperacion(int operacion);
                
                /**
                 * Sets (as xml) the "Operacion" element
                 */
                void xsetOperacion(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion operacion);
                
                /**
                 * Unsets the "Operacion" element
                 */
                void unsetOperacion();
                
                /**
                 * Gets the "TpoOper" element
                 */
                int getTpoOper();
                
                /**
                 * Gets (as xml) the "TpoOper" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper xgetTpoOper();
                
                /**
                 * True if has "TpoOper" element
                 */
                boolean isSetTpoOper();
                
                /**
                 * Sets the "TpoOper" element
                 */
                void setTpoOper(int tpoOper);
                
                /**
                 * Sets (as xml) the "TpoOper" element
                 */
                void xsetTpoOper(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper tpoOper);
                
                /**
                 * Unsets the "TpoOper" element
                 */
                void unsetTpoOper();
                
                /**
                 * Gets the "FchDoc" element
                 */
                java.util.Calendar getFchDoc();
                
                /**
                 * Gets (as xml) the "FchDoc" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchDoc();
                
                /**
                 * True if has "FchDoc" element
                 */
                boolean isSetFchDoc();
                
                /**
                 * Sets the "FchDoc" element
                 */
                void setFchDoc(java.util.Calendar fchDoc);
                
                /**
                 * Sets (as xml) the "FchDoc" element
                 */
                void xsetFchDoc(org.apache.xmlbeans.XmlDate fchDoc);
                
                /**
                 * Unsets the "FchDoc" element
                 */
                void unsetFchDoc();
                
                /**
                 * Gets the "RUTDoc" element
                 */
                java.lang.String getRUTDoc();
                
                /**
                 * Gets (as xml) the "RUTDoc" element
                 */
                cl.sii.siiDte.libroguia.RUTType xgetRUTDoc();
                
                /**
                 * True if has "RUTDoc" element
                 */
                boolean isSetRUTDoc();
                
                /**
                 * Sets the "RUTDoc" element
                 */
                void setRUTDoc(java.lang.String rutDoc);
                
                /**
                 * Sets (as xml) the "RUTDoc" element
                 */
                void xsetRUTDoc(cl.sii.siiDte.libroguia.RUTType rutDoc);
                
                /**
                 * Unsets the "RUTDoc" element
                 */
                void unsetRUTDoc();
                
                /**
                 * Gets the "RznSoc" element
                 */
                java.lang.String getRznSoc();
                
                /**
                 * Gets (as xml) the "RznSoc" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc xgetRznSoc();
                
                /**
                 * True if has "RznSoc" element
                 */
                boolean isSetRznSoc();
                
                /**
                 * Sets the "RznSoc" element
                 */
                void setRznSoc(java.lang.String rznSoc);
                
                /**
                 * Sets (as xml) the "RznSoc" element
                 */
                void xsetRznSoc(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc rznSoc);
                
                /**
                 * Unsets the "RznSoc" element
                 */
                void unsetRznSoc();
                
                /**
                 * Gets the "MntNeto" element
                 */
                long getMntNeto();
                
                /**
                 * Gets (as xml) the "MntNeto" element
                 */
                cl.sii.siiDte.libroguia.MontoType xgetMntNeto();
                
                /**
                 * True if has "MntNeto" element
                 */
                boolean isSetMntNeto();
                
                /**
                 * Sets the "MntNeto" element
                 */
                void setMntNeto(long mntNeto);
                
                /**
                 * Sets (as xml) the "MntNeto" element
                 */
                void xsetMntNeto(cl.sii.siiDte.libroguia.MontoType mntNeto);
                
                /**
                 * Unsets the "MntNeto" element
                 */
                void unsetMntNeto();
                
                /**
                 * Gets the "TasaImp" element
                 */
                java.math.BigDecimal getTasaImp();
                
                /**
                 * Gets (as xml) the "TasaImp" element
                 */
                cl.sii.siiDte.libroguia.PctType xgetTasaImp();
                
                /**
                 * True if has "TasaImp" element
                 */
                boolean isSetTasaImp();
                
                /**
                 * Sets the "TasaImp" element
                 */
                void setTasaImp(java.math.BigDecimal tasaImp);
                
                /**
                 * Sets (as xml) the "TasaImp" element
                 */
                void xsetTasaImp(cl.sii.siiDte.libroguia.PctType tasaImp);
                
                /**
                 * Unsets the "TasaImp" element
                 */
                void unsetTasaImp();
                
                /**
                 * Gets the "IVA" element
                 */
                long getIVA();
                
                /**
                 * Gets (as xml) the "IVA" element
                 */
                cl.sii.siiDte.libroguia.MontoType xgetIVA();
                
                /**
                 * True if has "IVA" element
                 */
                boolean isSetIVA();
                
                /**
                 * Sets the "IVA" element
                 */
                void setIVA(long iva);
                
                /**
                 * Sets (as xml) the "IVA" element
                 */
                void xsetIVA(cl.sii.siiDte.libroguia.MontoType iva);
                
                /**
                 * Unsets the "IVA" element
                 */
                void unsetIVA();
                
                /**
                 * Gets the "MntTotal" element
                 */
                long getMntTotal();
                
                /**
                 * Gets (as xml) the "MntTotal" element
                 */
                cl.sii.siiDte.libroguia.MontoType xgetMntTotal();
                
                /**
                 * True if has "MntTotal" element
                 */
                boolean isSetMntTotal();
                
                /**
                 * Sets the "MntTotal" element
                 */
                void setMntTotal(long mntTotal);
                
                /**
                 * Sets (as xml) the "MntTotal" element
                 */
                void xsetMntTotal(cl.sii.siiDte.libroguia.MontoType mntTotal);
                
                /**
                 * Unsets the "MntTotal" element
                 */
                void unsetMntTotal();
                
                /**
                 * Gets the "MntModificado" element
                 */
                long getMntModificado();
                
                /**
                 * Gets (as xml) the "MntModificado" element
                 */
                cl.sii.siiDte.libroguia.MontoType xgetMntModificado();
                
                /**
                 * True if has "MntModificado" element
                 */
                boolean isSetMntModificado();
                
                /**
                 * Sets the "MntModificado" element
                 */
                void setMntModificado(long mntModificado);
                
                /**
                 * Sets (as xml) the "MntModificado" element
                 */
                void xsetMntModificado(cl.sii.siiDte.libroguia.MontoType mntModificado);
                
                /**
                 * Unsets the "MntModificado" element
                 */
                void unsetMntModificado();
                
                /**
                 * Gets the "TpoDocRef" element
                 */
                java.math.BigInteger getTpoDocRef();
                
                /**
                 * Gets (as xml) the "TpoDocRef" element
                 */
                cl.sii.siiDte.libroguia.DoctoType xgetTpoDocRef();
                
                /**
                 * True if has "TpoDocRef" element
                 */
                boolean isSetTpoDocRef();
                
                /**
                 * Sets the "TpoDocRef" element
                 */
                void setTpoDocRef(java.math.BigInteger tpoDocRef);
                
                /**
                 * Sets (as xml) the "TpoDocRef" element
                 */
                void xsetTpoDocRef(cl.sii.siiDte.libroguia.DoctoType tpoDocRef);
                
                /**
                 * Unsets the "TpoDocRef" element
                 */
                void unsetTpoDocRef();
                
                /**
                 * Gets the "FolioDocRef" element
                 */
                long getFolioDocRef();
                
                /**
                 * Gets (as xml) the "FolioDocRef" element
                 */
                cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef xgetFolioDocRef();
                
                /**
                 * True if has "FolioDocRef" element
                 */
                boolean isSetFolioDocRef();
                
                /**
                 * Sets the "FolioDocRef" element
                 */
                void setFolioDocRef(long folioDocRef);
                
                /**
                 * Sets (as xml) the "FolioDocRef" element
                 */
                void xsetFolioDocRef(cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef folioDocRef);
                
                /**
                 * Unsets the "FolioDocRef" element
                 */
                void unsetFolioDocRef();
                
                /**
                 * Gets the "FchDocRef" element
                 */
                java.util.Calendar getFchDocRef();
                
                /**
                 * Gets (as xml) the "FchDocRef" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchDocRef();
                
                /**
                 * True if has "FchDocRef" element
                 */
                boolean isSetFchDocRef();
                
                /**
                 * Sets the "FchDocRef" element
                 */
                void setFchDocRef(java.util.Calendar fchDocRef);
                
                /**
                 * Sets (as xml) the "FchDocRef" element
                 */
                void xsetFchDocRef(org.apache.xmlbeans.XmlDate fchDocRef);
                
                /**
                 * Unsets the "FchDocRef" element
                 */
                void unsetFchDocRef();
                
                /**
                 * An XML Folio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$Folio.
                 */
                public interface Folio extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Folio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("folio45eeelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Folio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Anulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$Anulado.
                 */
                public interface Anulado extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Anulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("anuladoce6delemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Anulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Operacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$Operacion.
                 */
                public interface Operacion extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("operacion30ddelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.Operacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TpoOper(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$TpoOper.
                 */
                public interface TpoOper extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoOper.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("tpooper5126elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.TpoOper) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML RznSoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$RznSoc.
                 */
                public interface RznSoc extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RznSoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("rznsocb5b6elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.RznSoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML FolioDocRef(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.LibroGuiaDocument$LibroGuia$EnvioLibro$Detalle$FolioDocRef.
                 */
                public interface FolioDocRef extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FolioDocRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE5E26BD6F50B2F6E4088BF269A72BC02").resolveHandle("foliodocref0689elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef newInstance() {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle.FolioDocRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle newInstance() {
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro.Detalle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro newInstance() {
                  return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia.EnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia newInstance() {
              return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.libroguia.LibroGuiaDocument.LibroGuia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument newInstance() {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.libroguia.LibroGuiaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.libroguia.LibroGuiaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
