/*
 * An XML document type.
 * Localname: LibroBoleta
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.libroboletas.LibroBoletaDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.libroboletas;


/**
 * A document containing one LibroBoleta(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface LibroBoletaDocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.LibroBoletaDocumentExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LibroBoletaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("libroboletac9a8doctype");
    
    /**
     * Gets the "LibroBoleta" element
     */
    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta getLibroBoleta();
    
    /**
     * Sets the "LibroBoleta" element
     */
    void setLibroBoleta(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta libroBoleta);
    
    /**
     * Appends and returns a new empty "LibroBoleta" element
     */
    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta addNewLibroBoleta();
    
    /**
     * An XML LibroBoleta(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface LibroBoleta extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LibroBoleta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("libroboleta68a7elemtype");
        
        /**
         * Gets the "EnvioLibro" element
         */
        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro getEnvioLibro();
        
        /**
         * Sets the "EnvioLibro" element
         */
        void setEnvioLibro(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro envioLibro);
        
        /**
         * Appends and returns a new empty "EnvioLibro" element
         */
        cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro addNewEnvioLibro();
        
        /**
         * Gets the "Signature" element
         */
        cl.sii.siiDte.libroboletas.SignatureType getSignature();
        
        /**
         * Sets the "Signature" element
         */
        void setSignature(cl.sii.siiDte.libroboletas.SignatureType signature);
        
        /**
         * Appends and returns a new empty "Signature" element
         */
        cl.sii.siiDte.libroboletas.SignatureType addNewSignature();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioLibro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("enviolibro965celemtype");
            
            /**
             * Gets the "Caratula" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula getCaratula();
            
            /**
             * Sets the "Caratula" element
             */
            void setCaratula(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula caratula);
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula addNewCaratula();
            
            /**
             * Gets the "ResumenSegmento" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento getResumenSegmento();
            
            /**
             * True if has "ResumenSegmento" element
             */
            boolean isSetResumenSegmento();
            
            /**
             * Sets the "ResumenSegmento" element
             */
            void setResumenSegmento(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento resumenSegmento);
            
            /**
             * Appends and returns a new empty "ResumenSegmento" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento addNewResumenSegmento();
            
            /**
             * Unsets the "ResumenSegmento" element
             */
            void unsetResumenSegmento();
            
            /**
             * Gets the "ResumenPeriodo" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo getResumenPeriodo();
            
            /**
             * True if has "ResumenPeriodo" element
             */
            boolean isSetResumenPeriodo();
            
            /**
             * Sets the "ResumenPeriodo" element
             */
            void setResumenPeriodo(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo resumenPeriodo);
            
            /**
             * Appends and returns a new empty "ResumenPeriodo" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo addNewResumenPeriodo();
            
            /**
             * Unsets the "ResumenPeriodo" element
             */
            void unsetResumenPeriodo();
            
            /**
             * Gets array of all "Detalle" elements
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle[] getDetalleArray();
            
            /**
             * Gets ith "Detalle" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle getDetalleArray(int i);
            
            /**
             * Returns number of "Detalle" element
             */
            int sizeOfDetalleArray();
            
            /**
             * Sets array of all "Detalle" element
             */
            void setDetalleArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle[] detalleArray);
            
            /**
             * Sets ith "Detalle" element
             */
            void setDetalleArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle detalle);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Detalle" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle insertNewDetalle(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Detalle" element
             */
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle addNewDetalle();
            
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
            cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma xgetTmstFirma();
            
            /**
             * Sets the "TmstFirma" element
             */
            void setTmstFirma(java.util.Calendar tmstFirma);
            
            /**
             * Sets (as xml) the "TmstFirma" element
             */
            void xsetTmstFirma(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma tmstFirma);
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caratula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("caratuladb9belemtype");
                
                /**
                 * Gets the "RutEmisorLibro" element
                 */
                java.lang.String getRutEmisorLibro();
                
                /**
                 * Gets (as xml) the "RutEmisorLibro" element
                 */
                cl.sii.siiDte.libroboletas.RUTType xgetRutEmisorLibro();
                
                /**
                 * Sets the "RutEmisorLibro" element
                 */
                void setRutEmisorLibro(java.lang.String rutEmisorLibro);
                
                /**
                 * Sets (as xml) the "RutEmisorLibro" element
                 */
                void xsetRutEmisorLibro(cl.sii.siiDte.libroboletas.RUTType rutEmisorLibro);
                
                /**
                 * Gets the "RutEnvia" element
                 */
                java.lang.String getRutEnvia();
                
                /**
                 * Gets (as xml) the "RutEnvia" element
                 */
                cl.sii.siiDte.libroboletas.RUTType xgetRutEnvia();
                
                /**
                 * Sets the "RutEnvia" element
                 */
                void setRutEnvia(java.lang.String rutEnvia);
                
                /**
                 * Sets (as xml) the "RutEnvia" element
                 */
                void xsetRutEnvia(cl.sii.siiDte.libroboletas.RUTType rutEnvia);
                
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
                int getNroResol();
                
                /**
                 * Gets (as xml) the "NroResol" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol xgetNroResol();
                
                /**
                 * Sets the "NroResol" element
                 */
                void setNroResol(int nroResol);
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                void xsetNroResol(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol nroResol);
                
                /**
                 * Gets the "TipoLibro" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro.Enum getTipoLibro();
                
                /**
                 * Gets (as xml) the "TipoLibro" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro xgetTipoLibro();
                
                /**
                 * Sets the "TipoLibro" element
                 */
                void setTipoLibro(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro.Enum tipoLibro);
                
                /**
                 * Sets (as xml) the "TipoLibro" element
                 */
                void xsetTipoLibro(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro tipoLibro);
                
                /**
                 * Gets the "TipoEnvio" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio.Enum getTipoEnvio();
                
                /**
                 * Gets (as xml) the "TipoEnvio" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio xgetTipoEnvio();
                
                /**
                 * True if has "TipoEnvio" element
                 */
                boolean isSetTipoEnvio();
                
                /**
                 * Sets the "TipoEnvio" element
                 */
                void setTipoEnvio(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio.Enum tipoEnvio);
                
                /**
                 * Sets (as xml) the "TipoEnvio" element
                 */
                void xsetTipoEnvio(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio tipoEnvio);
                
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
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento xgetNroSegmento();
                
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
                void xsetNroSegmento(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento nroSegmento);
                
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
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion xgetFolioNotificacion();
                
                /**
                 * Sets the "FolioNotificacion" element
                 */
                void setFolioNotificacion(long folioNotificacion);
                
                /**
                 * Sets (as xml) the "FolioNotificacion" element
                 */
                void xsetFolioNotificacion(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion folioNotificacion);
                
                /**
                 * An XML NroResol(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$NroResol.
                 */
                public interface NroResol extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroResol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("nroresolaf8delemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroResol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TipoLibro(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$TipoLibro.
                 */
                public interface TipoLibro extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoLibro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("tipolibrocee1elemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum ESPECIAL = Enum.forString("ESPECIAL");
                    
                    static final int INT_ESPECIAL = Enum.INT_ESPECIAL;
                    
                    /**
                     * Enumeration value class for cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$TipoLibro.
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
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TipoEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$TipoEnvio.
                 */
                public interface TipoEnvio extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoEnvio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("tipoenvio9730elemtype");
                    
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
                     * Enumeration value class for cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$TipoEnvio.
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
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.TipoEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML NroSegmento(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$NroSegmento.
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroSegmento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("nrosegmentod248elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.NroSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML FolioNotificacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Caratula$FolioNotificacion.
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FolioNotificacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("folionotificacion2e8aelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula.FolioNotificacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula newInstance() {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResumenSegmento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("resumensegmento1d05elemtype");
                
                /**
                 * Gets array of all "TotalesSegmento" elements
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento[] getTotalesSegmentoArray();
                
                /**
                 * Gets ith "TotalesSegmento" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento getTotalesSegmentoArray(int i);
                
                /**
                 * Returns number of "TotalesSegmento" element
                 */
                int sizeOfTotalesSegmentoArray();
                
                /**
                 * Sets array of all "TotalesSegmento" element
                 */
                void setTotalesSegmentoArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento[] totalesSegmentoArray);
                
                /**
                 * Sets ith "TotalesSegmento" element
                 */
                void setTotalesSegmentoArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento totalesSegmento);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotalesSegmento" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento insertNewTotalesSegmento(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotalesSegmento" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento addNewTotalesSegmento();
                
                /**
                 * Removes the ith "TotalesSegmento" element
                 */
                void removeTotalesSegmento(int i);
                
                /**
                 * An XML TotalesSegmento(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface TotalesSegmento extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotalesSegmento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("totalessegmento38ffelemtype");
                    
                    /**
                     * Gets the "TpoDoc" element
                     */
                    java.math.BigInteger getTpoDoc();
                    
                    /**
                     * Gets (as xml) the "TpoDoc" element
                     */
                    cl.sii.siiDte.libroboletas.DoctoType xgetTpoDoc();
                    
                    /**
                     * Sets the "TpoDoc" element
                     */
                    void setTpoDoc(java.math.BigInteger tpoDoc);
                    
                    /**
                     * Sets (as xml) the "TpoDoc" element
                     */
                    void xsetTpoDoc(cl.sii.siiDte.libroboletas.DoctoType tpoDoc);
                    
                    /**
                     * Gets the "TotAnulado" element
                     */
                    long getTotAnulado();
                    
                    /**
                     * Gets (as xml) the "TotAnulado" element
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado xgetTotAnulado();
                    
                    /**
                     * True if has "TotAnulado" element
                     */
                    boolean isSetTotAnulado();
                    
                    /**
                     * Sets the "TotAnulado" element
                     */
                    void setTotAnulado(long totAnulado);
                    
                    /**
                     * Sets (as xml) the "TotAnulado" element
                     */
                    void xsetTotAnulado(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado totAnulado);
                    
                    /**
                     * Unsets the "TotAnulado" element
                     */
                    void unsetTotAnulado();
                    
                    /**
                     * Gets array of all "TotalesServicio" elements
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio[] getTotalesServicioArray();
                    
                    /**
                     * Gets ith "TotalesServicio" element
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio getTotalesServicioArray(int i);
                    
                    /**
                     * Returns number of "TotalesServicio" element
                     */
                    int sizeOfTotalesServicioArray();
                    
                    /**
                     * Sets array of all "TotalesServicio" element
                     */
                    void setTotalesServicioArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio[] totalesServicioArray);
                    
                    /**
                     * Sets ith "TotalesServicio" element
                     */
                    void setTotalesServicioArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio totalesServicio);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotalesServicio" element
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio insertNewTotalesServicio(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotalesServicio" element
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio addNewTotalesServicio();
                    
                    /**
                     * Removes the ith "TotalesServicio" element
                     */
                    void removeTotalesServicio(int i);
                    
                    /**
                     * An XML TotAnulado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotAnulado.
                     */
                    public interface TotAnulado extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotAnulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("totanuladode8aelemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado newInstance() {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotalesServicio(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface TotalesServicio extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotalesServicio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("totalesservicio4833elemtype");
                      
                      /**
                       * Gets the "TpoServ" element
                       */
                      int getTpoServ();
                      
                      /**
                       * Gets (as xml) the "TpoServ" element
                       */
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ xgetTpoServ();
                      
                      /**
                       * Sets the "TpoServ" element
                       */
                      void setTpoServ(int tpoServ);
                      
                      /**
                       * Sets (as xml) the "TpoServ" element
                       */
                      void xsetTpoServ(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ tpoServ);
                      
                      /**
                       * Gets the "PeriodoDevengo" element
                       */
                      java.util.Calendar getPeriodoDevengo();
                      
                      /**
                       * Gets (as xml) the "PeriodoDevengo" element
                       */
                      org.apache.xmlbeans.XmlGYearMonth xgetPeriodoDevengo();
                      
                      /**
                       * True if has "PeriodoDevengo" element
                       */
                      boolean isSetPeriodoDevengo();
                      
                      /**
                       * Sets the "PeriodoDevengo" element
                       */
                      void setPeriodoDevengo(java.util.Calendar periodoDevengo);
                      
                      /**
                       * Sets (as xml) the "PeriodoDevengo" element
                       */
                      void xsetPeriodoDevengo(org.apache.xmlbeans.XmlGYearMonth periodoDevengo);
                      
                      /**
                       * Unsets the "PeriodoDevengo" element
                       */
                      void unsetPeriodoDevengo();
                      
                      /**
                       * Gets the "TotDoc" element
                       */
                      long getTotDoc();
                      
                      /**
                       * Gets (as xml) the "TotDoc" element
                       */
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc xgetTotDoc();
                      
                      /**
                       * Sets the "TotDoc" element
                       */
                      void setTotDoc(long totDoc);
                      
                      /**
                       * Sets (as xml) the "TotDoc" element
                       */
                      void xsetTotDoc(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc totDoc);
                      
                      /**
                       * Gets the "TotMntExe" element
                       */
                      long getTotMntExe();
                      
                      /**
                       * Gets (as xml) the "TotMntExe" element
                       */
                      cl.sii.siiDte.libroboletas.MontoType xgetTotMntExe();
                      
                      /**
                       * True if has "TotMntExe" element
                       */
                      boolean isSetTotMntExe();
                      
                      /**
                       * Sets the "TotMntExe" element
                       */
                      void setTotMntExe(long totMntExe);
                      
                      /**
                       * Sets (as xml) the "TotMntExe" element
                       */
                      void xsetTotMntExe(cl.sii.siiDte.libroboletas.MontoType totMntExe);
                      
                      /**
                       * Unsets the "TotMntExe" element
                       */
                      void unsetTotMntExe();
                      
                      /**
                       * Gets the "TotMntTotal" element
                       */
                      long getTotMntTotal();
                      
                      /**
                       * Gets (as xml) the "TotMntTotal" element
                       */
                      cl.sii.siiDte.libroboletas.MontoType xgetTotMntTotal();
                      
                      /**
                       * Sets the "TotMntTotal" element
                       */
                      void setTotMntTotal(long totMntTotal);
                      
                      /**
                       * Sets (as xml) the "TotMntTotal" element
                       */
                      void xsetTotMntTotal(cl.sii.siiDte.libroboletas.MontoType totMntTotal);
                      
                      /**
                       * Gets the "TotMntNoFact" element
                       */
                      long getTotMntNoFact();
                      
                      /**
                       * Gets (as xml) the "TotMntNoFact" element
                       */
                      cl.sii.siiDte.libroboletas.ValorType xgetTotMntNoFact();
                      
                      /**
                       * True if has "TotMntNoFact" element
                       */
                      boolean isSetTotMntNoFact();
                      
                      /**
                       * Sets the "TotMntNoFact" element
                       */
                      void setTotMntNoFact(long totMntNoFact);
                      
                      /**
                       * Sets (as xml) the "TotMntNoFact" element
                       */
                      void xsetTotMntNoFact(cl.sii.siiDte.libroboletas.ValorType totMntNoFact);
                      
                      /**
                       * Unsets the "TotMntNoFact" element
                       */
                      void unsetTotMntNoFact();
                      
                      /**
                       * Gets the "TotMntPeriodo" element
                       */
                      long getTotMntPeriodo();
                      
                      /**
                       * Gets (as xml) the "TotMntPeriodo" element
                       */
                      cl.sii.siiDte.libroboletas.ValorType xgetTotMntPeriodo();
                      
                      /**
                       * True if has "TotMntPeriodo" element
                       */
                      boolean isSetTotMntPeriodo();
                      
                      /**
                       * Sets the "TotMntPeriodo" element
                       */
                      void setTotMntPeriodo(long totMntPeriodo);
                      
                      /**
                       * Sets (as xml) the "TotMntPeriodo" element
                       */
                      void xsetTotMntPeriodo(cl.sii.siiDte.libroboletas.ValorType totMntPeriodo);
                      
                      /**
                       * Unsets the "TotMntPeriodo" element
                       */
                      void unsetTotMntPeriodo();
                      
                      /**
                       * Gets the "TotSaldoAnt" element
                       */
                      long getTotSaldoAnt();
                      
                      /**
                       * Gets (as xml) the "TotSaldoAnt" element
                       */
                      cl.sii.siiDte.libroboletas.ValorType xgetTotSaldoAnt();
                      
                      /**
                       * True if has "TotSaldoAnt" element
                       */
                      boolean isSetTotSaldoAnt();
                      
                      /**
                       * Sets the "TotSaldoAnt" element
                       */
                      void setTotSaldoAnt(long totSaldoAnt);
                      
                      /**
                       * Sets (as xml) the "TotSaldoAnt" element
                       */
                      void xsetTotSaldoAnt(cl.sii.siiDte.libroboletas.ValorType totSaldoAnt);
                      
                      /**
                       * Unsets the "TotSaldoAnt" element
                       */
                      void unsetTotSaldoAnt();
                      
                      /**
                       * Gets the "TotVlrPagar" element
                       */
                      long getTotVlrPagar();
                      
                      /**
                       * Gets (as xml) the "TotVlrPagar" element
                       */
                      cl.sii.siiDte.libroboletas.ValorType xgetTotVlrPagar();
                      
                      /**
                       * True if has "TotVlrPagar" element
                       */
                      boolean isSetTotVlrPagar();
                      
                      /**
                       * Sets the "TotVlrPagar" element
                       */
                      void setTotVlrPagar(long totVlrPagar);
                      
                      /**
                       * Sets (as xml) the "TotVlrPagar" element
                       */
                      void xsetTotVlrPagar(cl.sii.siiDte.libroboletas.ValorType totVlrPagar);
                      
                      /**
                       * Unsets the "TotVlrPagar" element
                       */
                      void unsetTotVlrPagar();
                      
                      /**
                       * An XML TpoServ(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotalesServicio$TpoServ.
                       */
                      public interface TpoServ extends org.apache.xmlbeans.XmlPositiveInteger
                      {
                        int getIntValue();
                        void setIntValue(int i);
                        /** @deprecated */
                        int intValue();
                        /** @deprecated */
                        void set(int i);
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoServ.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("tposerv85a8elemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ newInstance() {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TpoServ) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML TotDoc(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotalesServicio$TotDoc.
                       */
                      public interface TotDoc extends org.apache.xmlbeans.XmlInteger
                      {
                        long getLongValue();
                        void setLongValue(long l);
                        /** @deprecated */
                        long longValue();
                        /** @deprecated */
                        void set(long l);
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotDoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("totdoce70eelemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc newInstance() {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio.TotDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio newInstance() {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotalesServicio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento.TotalesSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento newInstance() {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResumenPeriodo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("resumenperiodob085elemtype");
                
                /**
                 * Gets array of all "TotalesPeriodo" elements
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] getTotalesPeriodoArray();
                
                /**
                 * Gets ith "TotalesPeriodo" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo getTotalesPeriodoArray(int i);
                
                /**
                 * Returns number of "TotalesPeriodo" element
                 */
                int sizeOfTotalesPeriodoArray();
                
                /**
                 * Sets array of all "TotalesPeriodo" element
                 */
                void setTotalesPeriodoArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] totalesPeriodoArray);
                
                /**
                 * Sets ith "TotalesPeriodo" element
                 */
                void setTotalesPeriodoArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo totalesPeriodo);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotalesPeriodo" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo insertNewTotalesPeriodo(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotalesPeriodo" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo addNewTotalesPeriodo();
                
                /**
                 * Removes the ith "TotalesPeriodo" element
                 */
                void removeTotalesPeriodo(int i);
                
                /**
                 * An XML TotalesPeriodo(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface TotalesPeriodo extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotalesPeriodo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("totalesperiodocb4delemtype");
                    
                    /**
                     * Gets the "TpoDoc" element
                     */
                    java.math.BigInteger getTpoDoc();
                    
                    /**
                     * Gets (as xml) the "TpoDoc" element
                     */
                    cl.sii.siiDte.libroboletas.DoctoType xgetTpoDoc();
                    
                    /**
                     * Sets the "TpoDoc" element
                     */
                    void setTpoDoc(java.math.BigInteger tpoDoc);
                    
                    /**
                     * Sets (as xml) the "TpoDoc" element
                     */
                    void xsetTpoDoc(cl.sii.siiDte.libroboletas.DoctoType tpoDoc);
                    
                    /**
                     * Gets the "TotAnulado" element
                     */
                    long getTotAnulado();
                    
                    /**
                     * Gets (as xml) the "TotAnulado" element
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado xgetTotAnulado();
                    
                    /**
                     * True if has "TotAnulado" element
                     */
                    boolean isSetTotAnulado();
                    
                    /**
                     * Sets the "TotAnulado" element
                     */
                    void setTotAnulado(long totAnulado);
                    
                    /**
                     * Sets (as xml) the "TotAnulado" element
                     */
                    void xsetTotAnulado(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado totAnulado);
                    
                    /**
                     * Unsets the "TotAnulado" element
                     */
                    void unsetTotAnulado();
                    
                    /**
                     * Gets array of all "TotalesServicio" elements
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio[] getTotalesServicioArray();
                    
                    /**
                     * Gets ith "TotalesServicio" element
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio getTotalesServicioArray(int i);
                    
                    /**
                     * Returns number of "TotalesServicio" element
                     */
                    int sizeOfTotalesServicioArray();
                    
                    /**
                     * Sets array of all "TotalesServicio" element
                     */
                    void setTotalesServicioArray(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio[] totalesServicioArray);
                    
                    /**
                     * Sets ith "TotalesServicio" element
                     */
                    void setTotalesServicioArray(int i, cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio totalesServicio);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotalesServicio" element
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio insertNewTotalesServicio(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotalesServicio" element
                     */
                    cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio addNewTotalesServicio();
                    
                    /**
                     * Removes the ith "TotalesServicio" element
                     */
                    void removeTotalesServicio(int i);
                    
                    /**
                     * An XML TotAnulado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotAnulado.
                     */
                    public interface TotAnulado extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotAnulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("totanulado5798elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado newInstance() {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotalesServicio(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface TotalesServicio extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotalesServicio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("totalesservicio1781elemtype");
                      
                      /**
                       * Gets the "TpoServ" element
                       */
                      int getTpoServ();
                      
                      /**
                       * Gets (as xml) the "TpoServ" element
                       */
                      cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ xgetTpoServ();
                      
                      /**
                       * Sets the "TpoServ" element
                       */
                      void setTpoServ(int tpoServ);
                      
                      /**
                       * Sets (as xml) the "TpoServ" element
                       */
                      void xsetTpoServ(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ tpoServ);
                      
                      /**
                       * Gets the "PeriodoDevengado" element
                       */
                      java.util.Calendar getPeriodoDevengado();
                      
                      /**
                       * Gets (as xml) the "PeriodoDevengado" element
                       */
                      org.apache.xmlbeans.XmlGYearMonth xgetPeriodoDevengado();
                      
                      /**
                       * True if has "PeriodoDevengado" element
                       */
                      boolean isSetPeriodoDevengado();
                      
                      /**
                       * Sets the "PeriodoDevengado" element
                       */
                      void setPeriodoDevengado(java.util.Calendar periodoDevengado);
                      
                      /**
                       * Sets (as xml) the "PeriodoDevengado" element
                       */
                      void xsetPeriodoDevengado(org.apache.xmlbeans.XmlGYearMonth periodoDevengado);
                      
                      /**
                       * Unsets the "PeriodoDevengado" element
                       */
                      void unsetPeriodoDevengado();
                      
                      /**
                       * Gets the "TotDoc" element
                       */
                      java.math.BigInteger getTotDoc();
                      
                      /**
                       * Gets (as xml) the "TotDoc" element
                       */
                      org.apache.xmlbeans.XmlPositiveInteger xgetTotDoc();
                      
                      /**
                       * Sets the "TotDoc" element
                       */
                      void setTotDoc(java.math.BigInteger totDoc);
                      
                      /**
                       * Sets (as xml) the "TotDoc" element
                       */
                      void xsetTotDoc(org.apache.xmlbeans.XmlPositiveInteger totDoc);
                      
                      /**
                       * Gets the "TotMntExe" element
                       */
                      long getTotMntExe();
                      
                      /**
                       * Gets (as xml) the "TotMntExe" element
                       */
                      cl.sii.siiDte.libroboletas.MontoType xgetTotMntExe();
                      
                      /**
                       * True if has "TotMntExe" element
                       */
                      boolean isSetTotMntExe();
                      
                      /**
                       * Sets the "TotMntExe" element
                       */
                      void setTotMntExe(long totMntExe);
                      
                      /**
                       * Sets (as xml) the "TotMntExe" element
                       */
                      void xsetTotMntExe(cl.sii.siiDte.libroboletas.MontoType totMntExe);
                      
                      /**
                       * Unsets the "TotMntExe" element
                       */
                      void unsetTotMntExe();
                      
                      /**
                       * Gets the "TotMntNeto" element
                       */
                      long getTotMntNeto();
                      
                      /**
                       * Gets (as xml) the "TotMntNeto" element
                       */
                      cl.sii.siiDte.libroboletas.MontoType xgetTotMntNeto();
                      
                      /**
                       * Sets the "TotMntNeto" element
                       */
                      void setTotMntNeto(long totMntNeto);
                      
                      /**
                       * Sets (as xml) the "TotMntNeto" element
                       */
                      void xsetTotMntNeto(cl.sii.siiDte.libroboletas.MontoType totMntNeto);
                      
                      /**
                       * Gets the "TasaIVA" element
                       */
                      java.math.BigDecimal getTasaIVA();
                      
                      /**
                       * Gets (as xml) the "TasaIVA" element
                       */
                      cl.sii.siiDte.libroboletas.PctType xgetTasaIVA();
                      
                      /**
                       * True if has "TasaIVA" element
                       */
                      boolean isSetTasaIVA();
                      
                      /**
                       * Sets the "TasaIVA" element
                       */
                      void setTasaIVA(java.math.BigDecimal tasaIVA);
                      
                      /**
                       * Sets (as xml) the "TasaIVA" element
                       */
                      void xsetTasaIVA(cl.sii.siiDte.libroboletas.PctType tasaIVA);
                      
                      /**
                       * Unsets the "TasaIVA" element
                       */
                      void unsetTasaIVA();
                      
                      /**
                       * Gets the "TotMntIVA" element
                       */
                      long getTotMntIVA();
                      
                      /**
                       * Gets (as xml) the "TotMntIVA" element
                       */
                      cl.sii.siiDte.libroboletas.MontoType xgetTotMntIVA();
                      
                      /**
                       * Sets the "TotMntIVA" element
                       */
                      void setTotMntIVA(long totMntIVA);
                      
                      /**
                       * Sets (as xml) the "TotMntIVA" element
                       */
                      void xsetTotMntIVA(cl.sii.siiDte.libroboletas.MontoType totMntIVA);
                      
                      /**
                       * Gets the "TotMntTotal" element
                       */
                      long getTotMntTotal();
                      
                      /**
                       * Gets (as xml) the "TotMntTotal" element
                       */
                      cl.sii.siiDte.libroboletas.MontoType xgetTotMntTotal();
                      
                      /**
                       * Sets the "TotMntTotal" element
                       */
                      void setTotMntTotal(long totMntTotal);
                      
                      /**
                       * Sets (as xml) the "TotMntTotal" element
                       */
                      void xsetTotMntTotal(cl.sii.siiDte.libroboletas.MontoType totMntTotal);
                      
                      /**
                       * Gets the "TotMntNoFact" element
                       */
                      long getTotMntNoFact();
                      
                      /**
                       * Gets (as xml) the "TotMntNoFact" element
                       */
                      cl.sii.siiDte.libroboletas.ValorType xgetTotMntNoFact();
                      
                      /**
                       * True if has "TotMntNoFact" element
                       */
                      boolean isSetTotMntNoFact();
                      
                      /**
                       * Sets the "TotMntNoFact" element
                       */
                      void setTotMntNoFact(long totMntNoFact);
                      
                      /**
                       * Sets (as xml) the "TotMntNoFact" element
                       */
                      void xsetTotMntNoFact(cl.sii.siiDte.libroboletas.ValorType totMntNoFact);
                      
                      /**
                       * Unsets the "TotMntNoFact" element
                       */
                      void unsetTotMntNoFact();
                      
                      /**
                       * Gets the "TotMntPeriodo" element
                       */
                      long getTotMntPeriodo();
                      
                      /**
                       * Gets (as xml) the "TotMntPeriodo" element
                       */
                      cl.sii.siiDte.libroboletas.ValorType xgetTotMntPeriodo();
                      
                      /**
                       * True if has "TotMntPeriodo" element
                       */
                      boolean isSetTotMntPeriodo();
                      
                      /**
                       * Sets the "TotMntPeriodo" element
                       */
                      void setTotMntPeriodo(long totMntPeriodo);
                      
                      /**
                       * Sets (as xml) the "TotMntPeriodo" element
                       */
                      void xsetTotMntPeriodo(cl.sii.siiDte.libroboletas.ValorType totMntPeriodo);
                      
                      /**
                       * Unsets the "TotMntPeriodo" element
                       */
                      void unsetTotMntPeriodo();
                      
                      /**
                       * Gets the "TotSaldoAnt" element
                       */
                      long getTotSaldoAnt();
                      
                      /**
                       * Gets (as xml) the "TotSaldoAnt" element
                       */
                      cl.sii.siiDte.libroboletas.MontoType xgetTotSaldoAnt();
                      
                      /**
                       * True if has "TotSaldoAnt" element
                       */
                      boolean isSetTotSaldoAnt();
                      
                      /**
                       * Sets the "TotSaldoAnt" element
                       */
                      void setTotSaldoAnt(long totSaldoAnt);
                      
                      /**
                       * Sets (as xml) the "TotSaldoAnt" element
                       */
                      void xsetTotSaldoAnt(cl.sii.siiDte.libroboletas.MontoType totSaldoAnt);
                      
                      /**
                       * Unsets the "TotSaldoAnt" element
                       */
                      void unsetTotSaldoAnt();
                      
                      /**
                       * Gets the "TotVlrPagar" element
                       */
                      long getTotVlrPagar();
                      
                      /**
                       * Gets (as xml) the "TotVlrPagar" element
                       */
                      cl.sii.siiDte.libroboletas.MontoType xgetTotVlrPagar();
                      
                      /**
                       * True if has "TotVlrPagar" element
                       */
                      boolean isSetTotVlrPagar();
                      
                      /**
                       * Sets the "TotVlrPagar" element
                       */
                      void setTotVlrPagar(long totVlrPagar);
                      
                      /**
                       * Sets (as xml) the "TotVlrPagar" element
                       */
                      void xsetTotVlrPagar(cl.sii.siiDte.libroboletas.MontoType totVlrPagar);
                      
                      /**
                       * Unsets the "TotVlrPagar" element
                       */
                      void unsetTotVlrPagar();
                      
                      /**
                       * An XML TpoServ(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotalesServicio$TpoServ.
                       */
                      public interface TpoServ extends org.apache.xmlbeans.XmlPositiveInteger
                      {
                        int getIntValue();
                        void setIntValue(int i);
                        /** @deprecated */
                        int intValue();
                        /** @deprecated */
                        void set(int i);
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoServ.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("tposerv2e36elemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ newInstance() {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio.TpoServ) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio newInstance() {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotalesServicio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo.TotalesPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo newInstance() {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.ResumenPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Detalle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("detallecb5felemtype");
                
                /**
                 * Gets the "TpoDoc" element
                 */
                java.math.BigInteger getTpoDoc();
                
                /**
                 * Gets (as xml) the "TpoDoc" element
                 */
                cl.sii.siiDte.libroboletas.DoctoType xgetTpoDoc();
                
                /**
                 * Sets the "TpoDoc" element
                 */
                void setTpoDoc(java.math.BigInteger tpoDoc);
                
                /**
                 * Sets (as xml) the "TpoDoc" element
                 */
                void xsetTpoDoc(cl.sii.siiDte.libroboletas.DoctoType tpoDoc);
                
                /**
                 * Gets the "FolioDoc" element
                 */
                long getFolioDoc();
                
                /**
                 * Gets (as xml) the "FolioDoc" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc xgetFolioDoc();
                
                /**
                 * Sets the "FolioDoc" element
                 */
                void setFolioDoc(long folioDoc);
                
                /**
                 * Sets (as xml) the "FolioDoc" element
                 */
                void xsetFolioDoc(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc folioDoc);
                
                /**
                 * Gets the "Anulado" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado.Enum getAnulado();
                
                /**
                 * Gets (as xml) the "Anulado" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado xgetAnulado();
                
                /**
                 * True if has "Anulado" element
                 */
                boolean isSetAnulado();
                
                /**
                 * Sets the "Anulado" element
                 */
                void setAnulado(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado.Enum anulado);
                
                /**
                 * Sets (as xml) the "Anulado" element
                 */
                void xsetAnulado(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado anulado);
                
                /**
                 * Unsets the "Anulado" element
                 */
                void unsetAnulado();
                
                /**
                 * Gets the "TpoServ" element
                 */
                int getTpoServ();
                
                /**
                 * Gets (as xml) the "TpoServ" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ xgetTpoServ();
                
                /**
                 * True if has "TpoServ" element
                 */
                boolean isSetTpoServ();
                
                /**
                 * Sets the "TpoServ" element
                 */
                void setTpoServ(int tpoServ);
                
                /**
                 * Sets (as xml) the "TpoServ" element
                 */
                void xsetTpoServ(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ tpoServ);
                
                /**
                 * Unsets the "TpoServ" element
                 */
                void unsetTpoServ();
                
                /**
                 * Gets the "FchEmiDoc" element
                 */
                java.util.Calendar getFchEmiDoc();
                
                /**
                 * Gets (as xml) the "FchEmiDoc" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchEmiDoc();
                
                /**
                 * True if has "FchEmiDoc" element
                 */
                boolean isSetFchEmiDoc();
                
                /**
                 * Sets the "FchEmiDoc" element
                 */
                void setFchEmiDoc(java.util.Calendar fchEmiDoc);
                
                /**
                 * Sets (as xml) the "FchEmiDoc" element
                 */
                void xsetFchEmiDoc(org.apache.xmlbeans.XmlDate fchEmiDoc);
                
                /**
                 * Unsets the "FchEmiDoc" element
                 */
                void unsetFchEmiDoc();
                
                /**
                 * Gets the "FchVencDoc" element
                 */
                java.util.Calendar getFchVencDoc();
                
                /**
                 * Gets (as xml) the "FchVencDoc" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchVencDoc();
                
                /**
                 * True if has "FchVencDoc" element
                 */
                boolean isSetFchVencDoc();
                
                /**
                 * Sets the "FchVencDoc" element
                 */
                void setFchVencDoc(java.util.Calendar fchVencDoc);
                
                /**
                 * Sets (as xml) the "FchVencDoc" element
                 */
                void xsetFchVencDoc(org.apache.xmlbeans.XmlDate fchVencDoc);
                
                /**
                 * Unsets the "FchVencDoc" element
                 */
                void unsetFchVencDoc();
                
                /**
                 * Gets the "PeriodoDesde" element
                 */
                java.util.Calendar getPeriodoDesde();
                
                /**
                 * Gets (as xml) the "PeriodoDesde" element
                 */
                org.apache.xmlbeans.XmlDate xgetPeriodoDesde();
                
                /**
                 * True if has "PeriodoDesde" element
                 */
                boolean isSetPeriodoDesde();
                
                /**
                 * Sets the "PeriodoDesde" element
                 */
                void setPeriodoDesde(java.util.Calendar periodoDesde);
                
                /**
                 * Sets (as xml) the "PeriodoDesde" element
                 */
                void xsetPeriodoDesde(org.apache.xmlbeans.XmlDate periodoDesde);
                
                /**
                 * Unsets the "PeriodoDesde" element
                 */
                void unsetPeriodoDesde();
                
                /**
                 * Gets the "PeriodoHasta" element
                 */
                java.util.Calendar getPeriodoHasta();
                
                /**
                 * Gets (as xml) the "PeriodoHasta" element
                 */
                org.apache.xmlbeans.XmlDate xgetPeriodoHasta();
                
                /**
                 * True if has "PeriodoHasta" element
                 */
                boolean isSetPeriodoHasta();
                
                /**
                 * Sets the "PeriodoHasta" element
                 */
                void setPeriodoHasta(java.util.Calendar periodoHasta);
                
                /**
                 * Sets (as xml) the "PeriodoHasta" element
                 */
                void xsetPeriodoHasta(org.apache.xmlbeans.XmlDate periodoHasta);
                
                /**
                 * Unsets the "PeriodoHasta" element
                 */
                void unsetPeriodoHasta();
                
                /**
                 * Gets the "CdgSIISucur" element
                 */
                int getCdgSIISucur();
                
                /**
                 * Gets (as xml) the "CdgSIISucur" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur xgetCdgSIISucur();
                
                /**
                 * True if has "CdgSIISucur" element
                 */
                boolean isSetCdgSIISucur();
                
                /**
                 * Sets the "CdgSIISucur" element
                 */
                void setCdgSIISucur(int cdgSIISucur);
                
                /**
                 * Sets (as xml) the "CdgSIISucur" element
                 */
                void xsetCdgSIISucur(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur cdgSIISucur);
                
                /**
                 * Unsets the "CdgSIISucur" element
                 */
                void unsetCdgSIISucur();
                
                /**
                 * Gets the "RUTCliente" element
                 */
                java.lang.String getRUTCliente();
                
                /**
                 * Gets (as xml) the "RUTCliente" element
                 */
                cl.sii.siiDte.libroboletas.RUTType xgetRUTCliente();
                
                /**
                 * True if has "RUTCliente" element
                 */
                boolean isSetRUTCliente();
                
                /**
                 * Sets the "RUTCliente" element
                 */
                void setRUTCliente(java.lang.String rutCliente);
                
                /**
                 * Sets (as xml) the "RUTCliente" element
                 */
                void xsetRUTCliente(cl.sii.siiDte.libroboletas.RUTType rutCliente);
                
                /**
                 * Unsets the "RUTCliente" element
                 */
                void unsetRUTCliente();
                
                /**
                 * Gets the "CodIntCli" element
                 */
                java.lang.String getCodIntCli();
                
                /**
                 * Gets (as xml) the "CodIntCli" element
                 */
                cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli xgetCodIntCli();
                
                /**
                 * True if has "CodIntCli" element
                 */
                boolean isSetCodIntCli();
                
                /**
                 * Sets the "CodIntCli" element
                 */
                void setCodIntCli(java.lang.String codIntCli);
                
                /**
                 * Sets (as xml) the "CodIntCli" element
                 */
                void xsetCodIntCli(cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli codIntCli);
                
                /**
                 * Unsets the "CodIntCli" element
                 */
                void unsetCodIntCli();
                
                /**
                 * Gets the "MntExe" element
                 */
                long getMntExe();
                
                /**
                 * Gets (as xml) the "MntExe" element
                 */
                cl.sii.siiDte.libroboletas.MontoType xgetMntExe();
                
                /**
                 * True if has "MntExe" element
                 */
                boolean isSetMntExe();
                
                /**
                 * Sets the "MntExe" element
                 */
                void setMntExe(long mntExe);
                
                /**
                 * Sets (as xml) the "MntExe" element
                 */
                void xsetMntExe(cl.sii.siiDte.libroboletas.MontoType mntExe);
                
                /**
                 * Unsets the "MntExe" element
                 */
                void unsetMntExe();
                
                /**
                 * Gets the "MntTotal" element
                 */
                long getMntTotal();
                
                /**
                 * Gets (as xml) the "MntTotal" element
                 */
                cl.sii.siiDte.libroboletas.MontoType xgetMntTotal();
                
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
                void xsetMntTotal(cl.sii.siiDte.libroboletas.MontoType mntTotal);
                
                /**
                 * Unsets the "MntTotal" element
                 */
                void unsetMntTotal();
                
                /**
                 * Gets the "MntNoFact" element
                 */
                long getMntNoFact();
                
                /**
                 * Gets (as xml) the "MntNoFact" element
                 */
                cl.sii.siiDte.libroboletas.ValorType xgetMntNoFact();
                
                /**
                 * True if has "MntNoFact" element
                 */
                boolean isSetMntNoFact();
                
                /**
                 * Sets the "MntNoFact" element
                 */
                void setMntNoFact(long mntNoFact);
                
                /**
                 * Sets (as xml) the "MntNoFact" element
                 */
                void xsetMntNoFact(cl.sii.siiDte.libroboletas.ValorType mntNoFact);
                
                /**
                 * Unsets the "MntNoFact" element
                 */
                void unsetMntNoFact();
                
                /**
                 * Gets the "MntPeriodo" element
                 */
                long getMntPeriodo();
                
                /**
                 * Gets (as xml) the "MntPeriodo" element
                 */
                cl.sii.siiDte.libroboletas.ValorType xgetMntPeriodo();
                
                /**
                 * True if has "MntPeriodo" element
                 */
                boolean isSetMntPeriodo();
                
                /**
                 * Sets the "MntPeriodo" element
                 */
                void setMntPeriodo(long mntPeriodo);
                
                /**
                 * Sets (as xml) the "MntPeriodo" element
                 */
                void xsetMntPeriodo(cl.sii.siiDte.libroboletas.ValorType mntPeriodo);
                
                /**
                 * Unsets the "MntPeriodo" element
                 */
                void unsetMntPeriodo();
                
                /**
                 * Gets the "SaldoAnt" element
                 */
                long getSaldoAnt();
                
                /**
                 * Gets (as xml) the "SaldoAnt" element
                 */
                cl.sii.siiDte.libroboletas.ValorType xgetSaldoAnt();
                
                /**
                 * True if has "SaldoAnt" element
                 */
                boolean isSetSaldoAnt();
                
                /**
                 * Sets the "SaldoAnt" element
                 */
                void setSaldoAnt(long saldoAnt);
                
                /**
                 * Sets (as xml) the "SaldoAnt" element
                 */
                void xsetSaldoAnt(cl.sii.siiDte.libroboletas.ValorType saldoAnt);
                
                /**
                 * Unsets the "SaldoAnt" element
                 */
                void unsetSaldoAnt();
                
                /**
                 * Gets the "VlrPagar" element
                 */
                long getVlrPagar();
                
                /**
                 * Gets (as xml) the "VlrPagar" element
                 */
                cl.sii.siiDte.libroboletas.ValorType xgetVlrPagar();
                
                /**
                 * True if has "VlrPagar" element
                 */
                boolean isSetVlrPagar();
                
                /**
                 * Sets the "VlrPagar" element
                 */
                void setVlrPagar(long vlrPagar);
                
                /**
                 * Sets (as xml) the "VlrPagar" element
                 */
                void xsetVlrPagar(cl.sii.siiDte.libroboletas.ValorType vlrPagar);
                
                /**
                 * Unsets the "VlrPagar" element
                 */
                void unsetVlrPagar();
                
                /**
                 * An XML FolioDoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$FolioDoc.
                 */
                public interface FolioDoc extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FolioDoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("foliodocaaeaelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.FolioDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Anulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$Anulado.
                 */
                public interface Anulado extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Anulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("anulado6853elemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum A = Enum.forString("A");
                    
                    static final int INT_A = Enum.INT_A;
                    
                    /**
                     * Enumeration value class for cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$Anulado.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_A
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
                      
                      static final int INT_A = 1;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("A", INT_A),
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
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.Anulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TpoServ(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$TpoServ.
                 */
                public interface TpoServ extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoServ.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("tposerve454elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.TpoServ) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CdgSIISucur(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$CdgSIISucur.
                 */
                public interface CdgSIISucur extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CdgSIISucur.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("cdgsiisucur71fcelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CdgSIISucur) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CodIntCli(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$Detalle$CodIntCli.
                 */
                public interface CodIntCli extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodIntCli.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("codintclid874elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli newInstance() {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle.CodIntCli) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle newInstance() {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.Detalle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML TmstFirma(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.LibroBoletaDocument$LibroBoleta$EnvioLibro$TmstFirma.
             */
            public interface TmstFirma extends org.apache.xmlbeans.XmlDateTime
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TmstFirma.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("tmstfirma26d1elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma newInstance() {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro.TmstFirma) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro newInstance() {
                  return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta.EnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta newInstance() {
              return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.libroboletas.LibroBoletaDocument.LibroBoleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument newInstance() {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.libroboletas.LibroBoletaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.libroboletas.LibroBoletaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
