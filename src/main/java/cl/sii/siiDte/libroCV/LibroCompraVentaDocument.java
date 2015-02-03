/*
 * An XML document type.
 * Localname: LibroCompraVenta
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.libroCV.LibroCompraVentaDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.libroCV;


/**
 * A document containing one LibroCompraVenta(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface LibroCompraVentaDocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.LibroCompraVentaDocumentExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LibroCompraVentaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("librocompraventa3fffdoctype");
    
    /**
     * Gets the "LibroCompraVenta" element
     */
    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta getLibroCompraVenta();
    
    /**
     * Sets the "LibroCompraVenta" element
     */
    void setLibroCompraVenta(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta libroCompraVenta);
    
    /**
     * Appends and returns a new empty "LibroCompraVenta" element
     */
    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta addNewLibroCompraVenta();
    
    /**
     * An XML LibroCompraVenta(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface LibroCompraVenta extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LibroCompraVenta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("librocompraventa3347elemtype");
        
        /**
         * Gets the "EnvioLibro" element
         */
        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro getEnvioLibro();
        
        /**
         * Sets the "EnvioLibro" element
         */
        void setEnvioLibro(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro envioLibro);
        
        /**
         * Appends and returns a new empty "EnvioLibro" element
         */
        cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro addNewEnvioLibro();
        
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
         * An XML EnvioLibro(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface EnvioLibro extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioLibro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("enviolibro82bcelemtype");
            
            /**
             * Gets the "Caratula" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula getCaratula();
            
            /**
             * Sets the "Caratula" element
             */
            void setCaratula(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula caratula);
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula addNewCaratula();
            
            /**
             * Gets the "ResumenSegmento" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento getResumenSegmento();
            
            /**
             * True if has "ResumenSegmento" element
             */
            boolean isSetResumenSegmento();
            
            /**
             * Sets the "ResumenSegmento" element
             */
            void setResumenSegmento(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento resumenSegmento);
            
            /**
             * Appends and returns a new empty "ResumenSegmento" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento addNewResumenSegmento();
            
            /**
             * Unsets the "ResumenSegmento" element
             */
            void unsetResumenSegmento();
            
            /**
             * Gets the "ResumenPeriodo" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo getResumenPeriodo();
            
            /**
             * True if has "ResumenPeriodo" element
             */
            boolean isSetResumenPeriodo();
            
            /**
             * Sets the "ResumenPeriodo" element
             */
            void setResumenPeriodo(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo resumenPeriodo);
            
            /**
             * Appends and returns a new empty "ResumenPeriodo" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo addNewResumenPeriodo();
            
            /**
             * Unsets the "ResumenPeriodo" element
             */
            void unsetResumenPeriodo();
            
            /**
             * Gets array of all "Detalle" elements
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle[] getDetalleArray();
            
            /**
             * Gets ith "Detalle" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle getDetalleArray(int i);
            
            /**
             * Returns number of "Detalle" element
             */
            int sizeOfDetalleArray();
            
            /**
             * Sets array of all "Detalle" element
             */
            void setDetalleArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle[] detalleArray);
            
            /**
             * Sets ith "Detalle" element
             */
            void setDetalleArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle detalle);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Detalle" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle insertNewDetalle(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Detalle" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle addNewDetalle();
            
            /**
             * Removes the ith "Detalle" element
             */
            void removeDetalle(int i);
            
            /**
             * Gets the "LceCal" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal getLceCal();
            
            /**
             * True if has "LceCal" element
             */
            boolean isSetLceCal();
            
            /**
             * Sets the "LceCal" element
             */
            void setLceCal(cl.sii.siiLce.LceCalDocument.LceCal lceCal);
            
            /**
             * Appends and returns a new empty "LceCal" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal addNewLceCal();
            
            /**
             * Unsets the "LceCal" element
             */
            void unsetLceCal();
            
            /**
             * Gets the "LceCoCertif" element
             */
            cl.sii.siiLce.LceCoCertifDocument.LceCoCertif getLceCoCertif();
            
            /**
             * True if has "LceCoCertif" element
             */
            boolean isSetLceCoCertif();
            
            /**
             * Sets the "LceCoCertif" element
             */
            void setLceCoCertif(cl.sii.siiLce.LceCoCertifDocument.LceCoCertif lceCoCertif);
            
            /**
             * Appends and returns a new empty "LceCoCertif" element
             */
            cl.sii.siiLce.LceCoCertifDocument.LceCoCertif addNewLceCoCertif();
            
            /**
             * Unsets the "LceCoCertif" element
             */
            void unsetLceCoCertif();
            
            /**
             * Gets the "TmstFirma" element
             */
            java.util.Calendar getTmstFirma();
            
            /**
             * Gets (as xml) the "TmstFirma" element
             */
            cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma xgetTmstFirma();
            
            /**
             * Sets the "TmstFirma" element
             */
            void setTmstFirma(java.util.Calendar tmstFirma);
            
            /**
             * Sets (as xml) the "TmstFirma" element
             */
            void xsetTmstFirma(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma tmstFirma);
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caratula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("caratula853belemtype");
                
                /**
                 * Gets the "RutEmisorLibro" element
                 */
                java.lang.String getRutEmisorLibro();
                
                /**
                 * Gets (as xml) the "RutEmisorLibro" element
                 */
                cl.sii.siiDte.libroCV.RUTType xgetRutEmisorLibro();
                
                /**
                 * Sets the "RutEmisorLibro" element
                 */
                void setRutEmisorLibro(java.lang.String rutEmisorLibro);
                
                /**
                 * Sets (as xml) the "RutEmisorLibro" element
                 */
                void xsetRutEmisorLibro(cl.sii.siiDte.libroCV.RUTType rutEmisorLibro);
                
                /**
                 * Gets the "RutEnvia" element
                 */
                java.lang.String getRutEnvia();
                
                /**
                 * Gets (as xml) the "RutEnvia" element
                 */
                cl.sii.siiDte.libroCV.RUTType xgetRutEnvia();
                
                /**
                 * Sets the "RutEnvia" element
                 */
                void setRutEnvia(java.lang.String rutEnvia);
                
                /**
                 * Sets (as xml) the "RutEnvia" element
                 */
                void xsetRutEnvia(cl.sii.siiDte.libroCV.RUTType rutEnvia);
                
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
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol xgetNroResol();
                
                /**
                 * Sets the "NroResol" element
                 */
                void setNroResol(int nroResol);
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                void xsetNroResol(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol nroResol);
                
                /**
                 * Gets the "TipoOperacion" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion.Enum getTipoOperacion();
                
                /**
                 * Gets (as xml) the "TipoOperacion" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion xgetTipoOperacion();
                
                /**
                 * Sets the "TipoOperacion" element
                 */
                void setTipoOperacion(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion.Enum tipoOperacion);
                
                /**
                 * Sets (as xml) the "TipoOperacion" element
                 */
                void xsetTipoOperacion(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion tipoOperacion);
                
                /**
                 * Gets the "TipoLibro" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro.Enum getTipoLibro();
                
                /**
                 * Gets (as xml) the "TipoLibro" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro xgetTipoLibro();
                
                /**
                 * Sets the "TipoLibro" element
                 */
                void setTipoLibro(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro.Enum tipoLibro);
                
                /**
                 * Sets (as xml) the "TipoLibro" element
                 */
                void xsetTipoLibro(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro tipoLibro);
                
                /**
                 * Gets the "TipoEnvio" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio.Enum getTipoEnvio();
                
                /**
                 * Gets (as xml) the "TipoEnvio" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio xgetTipoEnvio();
                
                /**
                 * Sets the "TipoEnvio" element
                 */
                void setTipoEnvio(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio.Enum tipoEnvio);
                
                /**
                 * Sets (as xml) the "TipoEnvio" element
                 */
                void xsetTipoEnvio(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio tipoEnvio);
                
                /**
                 * Gets the "NroSegmento" element
                 */
                int getNroSegmento();
                
                /**
                 * Gets (as xml) the "NroSegmento" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento xgetNroSegmento();
                
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
                void xsetNroSegmento(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento nroSegmento);
                
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
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion xgetFolioNotificacion();
                
                /**
                 * True if has "FolioNotificacion" element
                 */
                boolean isSetFolioNotificacion();
                
                /**
                 * Sets the "FolioNotificacion" element
                 */
                void setFolioNotificacion(long folioNotificacion);
                
                /**
                 * Sets (as xml) the "FolioNotificacion" element
                 */
                void xsetFolioNotificacion(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion folioNotificacion);
                
                /**
                 * Unsets the "FolioNotificacion" element
                 */
                void unsetFolioNotificacion();
                
                /**
                 * Gets the "CodAutRec" element
                 */
                java.lang.String getCodAutRec();
                
                /**
                 * Gets (as xml) the "CodAutRec" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec xgetCodAutRec();
                
                /**
                 * True if has "CodAutRec" element
                 */
                boolean isSetCodAutRec();
                
                /**
                 * Sets the "CodAutRec" element
                 */
                void setCodAutRec(java.lang.String codAutRec);
                
                /**
                 * Sets (as xml) the "CodAutRec" element
                 */
                void xsetCodAutRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec codAutRec);
                
                /**
                 * Unsets the "CodAutRec" element
                 */
                void unsetCodAutRec();
                
                /**
                 * An XML NroResol(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$NroResol.
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroResol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("nroresol92adelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroResol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TipoOperacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoOperacion.
                 */
                public interface TipoOperacion extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoOperacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tipooperacion42abelemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum COMPRA = Enum.forString("COMPRA");
                    static final Enum VENTA = Enum.forString("VENTA");
                    
                    static final int INT_COMPRA = Enum.INT_COMPRA;
                    static final int INT_VENTA = Enum.INT_VENTA;
                    
                    /**
                     * Enumeration value class for cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoOperacion.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_COMPRA
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
                      
                      static final int INT_COMPRA = 1;
                      static final int INT_VENTA = 2;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("COMPRA", INT_COMPRA),
                          new Enum("VENTA", INT_VENTA),
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
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoOperacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TipoLibro(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoLibro.
                 */
                public interface TipoLibro extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoLibro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tipolibro9901elemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum MENSUAL = Enum.forString("MENSUAL");
                    static final Enum ESPECIAL = Enum.forString("ESPECIAL");
                    static final Enum RECTIFICA = Enum.forString("RECTIFICA");
                    
                    static final int INT_MENSUAL = Enum.INT_MENSUAL;
                    static final int INT_ESPECIAL = Enum.INT_ESPECIAL;
                    static final int INT_RECTIFICA = Enum.INT_RECTIFICA;
                    
                    /**
                     * Enumeration value class for cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoLibro.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_MENSUAL
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
                      
                      static final int INT_MENSUAL = 1;
                      static final int INT_ESPECIAL = 2;
                      static final int INT_RECTIFICA = 3;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("MENSUAL", INT_MENSUAL),
                          new Enum("ESPECIAL", INT_ESPECIAL),
                          new Enum("RECTIFICA", INT_RECTIFICA),
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
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TipoEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoEnvio.
                 */
                public interface TipoEnvio extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoEnvio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tipoenvio8a90elemtype");
                    
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
                     * Enumeration value class for cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$TipoEnvio.
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
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.TipoEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML NroSegmento(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$NroSegmento.
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroSegmento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("nrosegmentoc7a8elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.NroSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML FolioNotificacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$FolioNotificacion.
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FolioNotificacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("folionotificacion396aelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.FolioNotificacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CodAutRec(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Caratula$CodAutRec.
                 */
                public interface CodAutRec extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodAutRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("codautrecdb27elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula.CodAutRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula newInstance() {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResumenSegmento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("resumensegmento8a25elemtype");
                
                /**
                 * Gets array of all "TotalesSegmento" elements
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento[] getTotalesSegmentoArray();
                
                /**
                 * Gets ith "TotalesSegmento" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento getTotalesSegmentoArray(int i);
                
                /**
                 * Returns number of "TotalesSegmento" element
                 */
                int sizeOfTotalesSegmentoArray();
                
                /**
                 * Sets array of all "TotalesSegmento" element
                 */
                void setTotalesSegmentoArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento[] totalesSegmentoArray);
                
                /**
                 * Sets ith "TotalesSegmento" element
                 */
                void setTotalesSegmentoArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento totalesSegmento);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotalesSegmento" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento insertNewTotalesSegmento(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotalesSegmento" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento addNewTotalesSegmento();
                
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotalesSegmento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totalessegmento759felemtype");
                    
                    /**
                     * Gets the "TpoDoc" element
                     */
                    java.math.BigInteger getTpoDoc();
                    
                    /**
                     * Gets (as xml) the "TpoDoc" element
                     */
                    cl.sii.siiDte.libroCV.DoctoType xgetTpoDoc();
                    
                    /**
                     * Sets the "TpoDoc" element
                     */
                    void setTpoDoc(java.math.BigInteger tpoDoc);
                    
                    /**
                     * Sets (as xml) the "TpoDoc" element
                     */
                    void xsetTpoDoc(cl.sii.siiDte.libroCV.DoctoType tpoDoc);
                    
                    /**
                     * Gets the "TpoImp" element
                     */
                    int getTpoImp();
                    
                    /**
                     * Gets (as xml) the "TpoImp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp xgetTpoImp();
                    
                    /**
                     * True if has "TpoImp" element
                     */
                    boolean isSetTpoImp();
                    
                    /**
                     * Sets the "TpoImp" element
                     */
                    void setTpoImp(int tpoImp);
                    
                    /**
                     * Sets (as xml) the "TpoImp" element
                     */
                    void xsetTpoImp(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp tpoImp);
                    
                    /**
                     * Unsets the "TpoImp" element
                     */
                    void unsetTpoImp();
                    
                    /**
                     * Gets the "TotDoc" element
                     */
                    long getTotDoc();
                    
                    /**
                     * Gets (as xml) the "TotDoc" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc xgetTotDoc();
                    
                    /**
                     * Sets the "TotDoc" element
                     */
                    void setTotDoc(long totDoc);
                    
                    /**
                     * Sets (as xml) the "TotDoc" element
                     */
                    void xsetTotDoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc totDoc);
                    
                    /**
                     * Gets the "TotAnulado" element
                     */
                    long getTotAnulado();
                    
                    /**
                     * Gets (as xml) the "TotAnulado" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado xgetTotAnulado();
                    
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
                    void xsetTotAnulado(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado totAnulado);
                    
                    /**
                     * Unsets the "TotAnulado" element
                     */
                    void unsetTotAnulado();
                    
                    /**
                     * Gets the "TotOpExe" element
                     */
                    long getTotOpExe();
                    
                    /**
                     * Gets (as xml) the "TotOpExe" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe xgetTotOpExe();
                    
                    /**
                     * True if has "TotOpExe" element
                     */
                    boolean isSetTotOpExe();
                    
                    /**
                     * Sets the "TotOpExe" element
                     */
                    void setTotOpExe(long totOpExe);
                    
                    /**
                     * Sets (as xml) the "TotOpExe" element
                     */
                    void xsetTotOpExe(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe totOpExe);
                    
                    /**
                     * Unsets the "TotOpExe" element
                     */
                    void unsetTotOpExe();
                    
                    /**
                     * Gets the "TotMntExe" element
                     */
                    long getTotMntExe();
                    
                    /**
                     * Gets (as xml) the "TotMntExe" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntExe();
                    
                    /**
                     * Sets the "TotMntExe" element
                     */
                    void setTotMntExe(long totMntExe);
                    
                    /**
                     * Sets (as xml) the "TotMntExe" element
                     */
                    void xsetTotMntExe(cl.sii.siiDte.libroCV.ValorType totMntExe);
                    
                    /**
                     * Gets the "TotMntNeto" element
                     */
                    long getTotMntNeto();
                    
                    /**
                     * Gets (as xml) the "TotMntNeto" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntNeto();
                    
                    /**
                     * Sets the "TotMntNeto" element
                     */
                    void setTotMntNeto(long totMntNeto);
                    
                    /**
                     * Sets (as xml) the "TotMntNeto" element
                     */
                    void xsetTotMntNeto(cl.sii.siiDte.libroCV.ValorType totMntNeto);
                    
                    /**
                     * Gets the "TotOpIVARec" element
                     */
                    long getTotOpIVARec();
                    
                    /**
                     * Gets (as xml) the "TotOpIVARec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec xgetTotOpIVARec();
                    
                    /**
                     * True if has "TotOpIVARec" element
                     */
                    boolean isSetTotOpIVARec();
                    
                    /**
                     * Sets the "TotOpIVARec" element
                     */
                    void setTotOpIVARec(long totOpIVARec);
                    
                    /**
                     * Sets (as xml) the "TotOpIVARec" element
                     */
                    void xsetTotOpIVARec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec totOpIVARec);
                    
                    /**
                     * Unsets the "TotOpIVARec" element
                     */
                    void unsetTotOpIVARec();
                    
                    /**
                     * Gets the "TotMntIVA" element
                     */
                    long getTotMntIVA();
                    
                    /**
                     * Gets (as xml) the "TotMntIVA" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntIVA();
                    
                    /**
                     * Sets the "TotMntIVA" element
                     */
                    void setTotMntIVA(long totMntIVA);
                    
                    /**
                     * Sets (as xml) the "TotMntIVA" element
                     */
                    void xsetTotMntIVA(cl.sii.siiDte.libroCV.ValorType totMntIVA);
                    
                    /**
                     * Gets the "TotOpActivoFijo" element
                     */
                    long getTotOpActivoFijo();
                    
                    /**
                     * Gets (as xml) the "TotOpActivoFijo" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo xgetTotOpActivoFijo();
                    
                    /**
                     * True if has "TotOpActivoFijo" element
                     */
                    boolean isSetTotOpActivoFijo();
                    
                    /**
                     * Sets the "TotOpActivoFijo" element
                     */
                    void setTotOpActivoFijo(long totOpActivoFijo);
                    
                    /**
                     * Sets (as xml) the "TotOpActivoFijo" element
                     */
                    void xsetTotOpActivoFijo(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo totOpActivoFijo);
                    
                    /**
                     * Unsets the "TotOpActivoFijo" element
                     */
                    void unsetTotOpActivoFijo();
                    
                    /**
                     * Gets the "TotMntActivoFijo" element
                     */
                    long getTotMntActivoFijo();
                    
                    /**
                     * Gets (as xml) the "TotMntActivoFijo" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntActivoFijo();
                    
                    /**
                     * True if has "TotMntActivoFijo" element
                     */
                    boolean isSetTotMntActivoFijo();
                    
                    /**
                     * Sets the "TotMntActivoFijo" element
                     */
                    void setTotMntActivoFijo(long totMntActivoFijo);
                    
                    /**
                     * Sets (as xml) the "TotMntActivoFijo" element
                     */
                    void xsetTotMntActivoFijo(cl.sii.siiDte.libroCV.ValorType totMntActivoFijo);
                    
                    /**
                     * Unsets the "TotMntActivoFijo" element
                     */
                    void unsetTotMntActivoFijo();
                    
                    /**
                     * Gets the "TotMntIVAActivoFijo" element
                     */
                    long getTotMntIVAActivoFijo();
                    
                    /**
                     * Gets (as xml) the "TotMntIVAActivoFijo" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntIVAActivoFijo();
                    
                    /**
                     * True if has "TotMntIVAActivoFijo" element
                     */
                    boolean isSetTotMntIVAActivoFijo();
                    
                    /**
                     * Sets the "TotMntIVAActivoFijo" element
                     */
                    void setTotMntIVAActivoFijo(long totMntIVAActivoFijo);
                    
                    /**
                     * Sets (as xml) the "TotMntIVAActivoFijo" element
                     */
                    void xsetTotMntIVAActivoFijo(cl.sii.siiDte.libroCV.ValorType totMntIVAActivoFijo);
                    
                    /**
                     * Unsets the "TotMntIVAActivoFijo" element
                     */
                    void unsetTotMntIVAActivoFijo();
                    
                    /**
                     * Gets array of all "TotIVANoRec" elements
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec[] getTotIVANoRecArray();
                    
                    /**
                     * Gets ith "TotIVANoRec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec getTotIVANoRecArray(int i);
                    
                    /**
                     * Returns number of "TotIVANoRec" element
                     */
                    int sizeOfTotIVANoRecArray();
                    
                    /**
                     * Sets array of all "TotIVANoRec" element
                     */
                    void setTotIVANoRecArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec[] totIVANoRecArray);
                    
                    /**
                     * Sets ith "TotIVANoRec" element
                     */
                    void setTotIVANoRecArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec totIVANoRec);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotIVANoRec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec insertNewTotIVANoRec(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotIVANoRec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec addNewTotIVANoRec();
                    
                    /**
                     * Removes the ith "TotIVANoRec" element
                     */
                    void removeTotIVANoRec(int i);
                    
                    /**
                     * Gets the "TotOpIVAUsoComun" element
                     */
                    long getTotOpIVAUsoComun();
                    
                    /**
                     * Gets (as xml) the "TotOpIVAUsoComun" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun xgetTotOpIVAUsoComun();
                    
                    /**
                     * True if has "TotOpIVAUsoComun" element
                     */
                    boolean isSetTotOpIVAUsoComun();
                    
                    /**
                     * Sets the "TotOpIVAUsoComun" element
                     */
                    void setTotOpIVAUsoComun(long totOpIVAUsoComun);
                    
                    /**
                     * Sets (as xml) the "TotOpIVAUsoComun" element
                     */
                    void xsetTotOpIVAUsoComun(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun totOpIVAUsoComun);
                    
                    /**
                     * Unsets the "TotOpIVAUsoComun" element
                     */
                    void unsetTotOpIVAUsoComun();
                    
                    /**
                     * Gets the "TotIVAUsoComun" element
                     */
                    long getTotIVAUsoComun();
                    
                    /**
                     * Gets (as xml) the "TotIVAUsoComun" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVAUsoComun();
                    
                    /**
                     * True if has "TotIVAUsoComun" element
                     */
                    boolean isSetTotIVAUsoComun();
                    
                    /**
                     * Sets the "TotIVAUsoComun" element
                     */
                    void setTotIVAUsoComun(long totIVAUsoComun);
                    
                    /**
                     * Sets (as xml) the "TotIVAUsoComun" element
                     */
                    void xsetTotIVAUsoComun(cl.sii.siiDte.libroCV.ValorType totIVAUsoComun);
                    
                    /**
                     * Unsets the "TotIVAUsoComun" element
                     */
                    void unsetTotIVAUsoComun();
                    
                    /**
                     * Gets the "TotIVAFueraPlazo" element
                     */
                    long getTotIVAFueraPlazo();
                    
                    /**
                     * Gets (as xml) the "TotIVAFueraPlazo" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVAFueraPlazo();
                    
                    /**
                     * True if has "TotIVAFueraPlazo" element
                     */
                    boolean isSetTotIVAFueraPlazo();
                    
                    /**
                     * Sets the "TotIVAFueraPlazo" element
                     */
                    void setTotIVAFueraPlazo(long totIVAFueraPlazo);
                    
                    /**
                     * Sets (as xml) the "TotIVAFueraPlazo" element
                     */
                    void xsetTotIVAFueraPlazo(cl.sii.siiDte.libroCV.ValorType totIVAFueraPlazo);
                    
                    /**
                     * Unsets the "TotIVAFueraPlazo" element
                     */
                    void unsetTotIVAFueraPlazo();
                    
                    /**
                     * Gets the "TotIVAPropio" element
                     */
                    long getTotIVAPropio();
                    
                    /**
                     * Gets (as xml) the "TotIVAPropio" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVAPropio();
                    
                    /**
                     * True if has "TotIVAPropio" element
                     */
                    boolean isSetTotIVAPropio();
                    
                    /**
                     * Sets the "TotIVAPropio" element
                     */
                    void setTotIVAPropio(long totIVAPropio);
                    
                    /**
                     * Sets (as xml) the "TotIVAPropio" element
                     */
                    void xsetTotIVAPropio(cl.sii.siiDte.libroCV.ValorType totIVAPropio);
                    
                    /**
                     * Unsets the "TotIVAPropio" element
                     */
                    void unsetTotIVAPropio();
                    
                    /**
                     * Gets the "TotIVATerceros" element
                     */
                    long getTotIVATerceros();
                    
                    /**
                     * Gets (as xml) the "TotIVATerceros" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVATerceros();
                    
                    /**
                     * True if has "TotIVATerceros" element
                     */
                    boolean isSetTotIVATerceros();
                    
                    /**
                     * Sets the "TotIVATerceros" element
                     */
                    void setTotIVATerceros(long totIVATerceros);
                    
                    /**
                     * Sets (as xml) the "TotIVATerceros" element
                     */
                    void xsetTotIVATerceros(cl.sii.siiDte.libroCV.ValorType totIVATerceros);
                    
                    /**
                     * Unsets the "TotIVATerceros" element
                     */
                    void unsetTotIVATerceros();
                    
                    /**
                     * Gets the "TotLey18211" element
                     */
                    long getTotLey18211();
                    
                    /**
                     * Gets (as xml) the "TotLey18211" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotLey18211();
                    
                    /**
                     * True if has "TotLey18211" element
                     */
                    boolean isSetTotLey18211();
                    
                    /**
                     * Sets the "TotLey18211" element
                     */
                    void setTotLey18211(long totLey18211);
                    
                    /**
                     * Sets (as xml) the "TotLey18211" element
                     */
                    void xsetTotLey18211(cl.sii.siiDte.libroCV.ValorType totLey18211);
                    
                    /**
                     * Unsets the "TotLey18211" element
                     */
                    void unsetTotLey18211();
                    
                    /**
                     * Gets array of all "TotOtrosImp" elements
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp[] getTotOtrosImpArray();
                    
                    /**
                     * Gets ith "TotOtrosImp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp getTotOtrosImpArray(int i);
                    
                    /**
                     * Returns number of "TotOtrosImp" element
                     */
                    int sizeOfTotOtrosImpArray();
                    
                    /**
                     * Sets array of all "TotOtrosImp" element
                     */
                    void setTotOtrosImpArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp[] totOtrosImpArray);
                    
                    /**
                     * Sets ith "TotOtrosImp" element
                     */
                    void setTotOtrosImpArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp totOtrosImp);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotOtrosImp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp insertNewTotOtrosImp(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotOtrosImp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp addNewTotOtrosImp();
                    
                    /**
                     * Removes the ith "TotOtrosImp" element
                     */
                    void removeTotOtrosImp(int i);
                    
                    /**
                     * Gets the "TotImpSinCredito" element
                     */
                    long getTotImpSinCredito();
                    
                    /**
                     * Gets (as xml) the "TotImpSinCredito" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotImpSinCredito();
                    
                    /**
                     * True if has "TotImpSinCredito" element
                     */
                    boolean isSetTotImpSinCredito();
                    
                    /**
                     * Sets the "TotImpSinCredito" element
                     */
                    void setTotImpSinCredito(long totImpSinCredito);
                    
                    /**
                     * Sets (as xml) the "TotImpSinCredito" element
                     */
                    void xsetTotImpSinCredito(cl.sii.siiDte.libroCV.ValorType totImpSinCredito);
                    
                    /**
                     * Unsets the "TotImpSinCredito" element
                     */
                    void unsetTotImpSinCredito();
                    
                    /**
                     * Gets the "TotOpIVARetTotal" element
                     */
                    long getTotOpIVARetTotal();
                    
                    /**
                     * Gets (as xml) the "TotOpIVARetTotal" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal xgetTotOpIVARetTotal();
                    
                    /**
                     * True if has "TotOpIVARetTotal" element
                     */
                    boolean isSetTotOpIVARetTotal();
                    
                    /**
                     * Sets the "TotOpIVARetTotal" element
                     */
                    void setTotOpIVARetTotal(long totOpIVARetTotal);
                    
                    /**
                     * Sets (as xml) the "TotOpIVARetTotal" element
                     */
                    void xsetTotOpIVARetTotal(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal totOpIVARetTotal);
                    
                    /**
                     * Unsets the "TotOpIVARetTotal" element
                     */
                    void unsetTotOpIVARetTotal();
                    
                    /**
                     * Gets the "TotIVARetTotal" element
                     */
                    long getTotIVARetTotal();
                    
                    /**
                     * Gets (as xml) the "TotIVARetTotal" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVARetTotal();
                    
                    /**
                     * True if has "TotIVARetTotal" element
                     */
                    boolean isSetTotIVARetTotal();
                    
                    /**
                     * Sets the "TotIVARetTotal" element
                     */
                    void setTotIVARetTotal(long totIVARetTotal);
                    
                    /**
                     * Sets (as xml) the "TotIVARetTotal" element
                     */
                    void xsetTotIVARetTotal(cl.sii.siiDte.libroCV.ValorType totIVARetTotal);
                    
                    /**
                     * Unsets the "TotIVARetTotal" element
                     */
                    void unsetTotIVARetTotal();
                    
                    /**
                     * Gets the "TotOpIVARetParcial" element
                     */
                    long getTotOpIVARetParcial();
                    
                    /**
                     * Gets (as xml) the "TotOpIVARetParcial" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial xgetTotOpIVARetParcial();
                    
                    /**
                     * True if has "TotOpIVARetParcial" element
                     */
                    boolean isSetTotOpIVARetParcial();
                    
                    /**
                     * Sets the "TotOpIVARetParcial" element
                     */
                    void setTotOpIVARetParcial(long totOpIVARetParcial);
                    
                    /**
                     * Sets (as xml) the "TotOpIVARetParcial" element
                     */
                    void xsetTotOpIVARetParcial(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial totOpIVARetParcial);
                    
                    /**
                     * Unsets the "TotOpIVARetParcial" element
                     */
                    void unsetTotOpIVARetParcial();
                    
                    /**
                     * Gets the "TotIVARetParcial" element
                     */
                    long getTotIVARetParcial();
                    
                    /**
                     * Gets (as xml) the "TotIVARetParcial" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVARetParcial();
                    
                    /**
                     * True if has "TotIVARetParcial" element
                     */
                    boolean isSetTotIVARetParcial();
                    
                    /**
                     * Sets the "TotIVARetParcial" element
                     */
                    void setTotIVARetParcial(long totIVARetParcial);
                    
                    /**
                     * Sets (as xml) the "TotIVARetParcial" element
                     */
                    void xsetTotIVARetParcial(cl.sii.siiDte.libroCV.ValorType totIVARetParcial);
                    
                    /**
                     * Unsets the "TotIVARetParcial" element
                     */
                    void unsetTotIVARetParcial();
                    
                    /**
                     * Gets the "TotCredEC" element
                     */
                    long getTotCredEC();
                    
                    /**
                     * Gets (as xml) the "TotCredEC" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotCredEC();
                    
                    /**
                     * True if has "TotCredEC" element
                     */
                    boolean isSetTotCredEC();
                    
                    /**
                     * Sets the "TotCredEC" element
                     */
                    void setTotCredEC(long totCredEC);
                    
                    /**
                     * Sets (as xml) the "TotCredEC" element
                     */
                    void xsetTotCredEC(cl.sii.siiDte.libroCV.ValorType totCredEC);
                    
                    /**
                     * Unsets the "TotCredEC" element
                     */
                    void unsetTotCredEC();
                    
                    /**
                     * Gets the "TotDepEnvase" element
                     */
                    long getTotDepEnvase();
                    
                    /**
                     * Gets (as xml) the "TotDepEnvase" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotDepEnvase();
                    
                    /**
                     * True if has "TotDepEnvase" element
                     */
                    boolean isSetTotDepEnvase();
                    
                    /**
                     * Sets the "TotDepEnvase" element
                     */
                    void setTotDepEnvase(long totDepEnvase);
                    
                    /**
                     * Sets (as xml) the "TotDepEnvase" element
                     */
                    void xsetTotDepEnvase(cl.sii.siiDte.libroCV.ValorType totDepEnvase);
                    
                    /**
                     * Unsets the "TotDepEnvase" element
                     */
                    void unsetTotDepEnvase();
                    
                    /**
                     * Gets the "TotLiquidaciones" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones getTotLiquidaciones();
                    
                    /**
                     * True if has "TotLiquidaciones" element
                     */
                    boolean isSetTotLiquidaciones();
                    
                    /**
                     * Sets the "TotLiquidaciones" element
                     */
                    void setTotLiquidaciones(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones totLiquidaciones);
                    
                    /**
                     * Appends and returns a new empty "TotLiquidaciones" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones addNewTotLiquidaciones();
                    
                    /**
                     * Unsets the "TotLiquidaciones" element
                     */
                    void unsetTotLiquidaciones();
                    
                    /**
                     * Gets the "TotMntTotal" element
                     */
                    long getTotMntTotal();
                    
                    /**
                     * Gets (as xml) the "TotMntTotal" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntTotal();
                    
                    /**
                     * Sets the "TotMntTotal" element
                     */
                    void setTotMntTotal(long totMntTotal);
                    
                    /**
                     * Sets (as xml) the "TotMntTotal" element
                     */
                    void xsetTotMntTotal(cl.sii.siiDte.libroCV.ValorType totMntTotal);
                    
                    /**
                     * Gets the "TotOpIVANoRetenido" element
                     */
                    long getTotOpIVANoRetenido();
                    
                    /**
                     * Gets (as xml) the "TotOpIVANoRetenido" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido xgetTotOpIVANoRetenido();
                    
                    /**
                     * True if has "TotOpIVANoRetenido" element
                     */
                    boolean isSetTotOpIVANoRetenido();
                    
                    /**
                     * Sets the "TotOpIVANoRetenido" element
                     */
                    void setTotOpIVANoRetenido(long totOpIVANoRetenido);
                    
                    /**
                     * Sets (as xml) the "TotOpIVANoRetenido" element
                     */
                    void xsetTotOpIVANoRetenido(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido totOpIVANoRetenido);
                    
                    /**
                     * Unsets the "TotOpIVANoRetenido" element
                     */
                    void unsetTotOpIVANoRetenido();
                    
                    /**
                     * Gets the "TotIVANoRetenido" element
                     */
                    long getTotIVANoRetenido();
                    
                    /**
                     * Gets (as xml) the "TotIVANoRetenido" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVANoRetenido();
                    
                    /**
                     * True if has "TotIVANoRetenido" element
                     */
                    boolean isSetTotIVANoRetenido();
                    
                    /**
                     * Sets the "TotIVANoRetenido" element
                     */
                    void setTotIVANoRetenido(long totIVANoRetenido);
                    
                    /**
                     * Sets (as xml) the "TotIVANoRetenido" element
                     */
                    void xsetTotIVANoRetenido(cl.sii.siiDte.libroCV.ValorType totIVANoRetenido);
                    
                    /**
                     * Unsets the "TotIVANoRetenido" element
                     */
                    void unsetTotIVANoRetenido();
                    
                    /**
                     * Gets the "TotMntNoFact" element
                     */
                    long getTotMntNoFact();
                    
                    /**
                     * Gets (as xml) the "TotMntNoFact" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntNoFact();
                    
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
                    void xsetTotMntNoFact(cl.sii.siiDte.libroCV.ValorType totMntNoFact);
                    
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
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntPeriodo();
                    
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
                    void xsetTotMntPeriodo(cl.sii.siiDte.libroCV.ValorType totMntPeriodo);
                    
                    /**
                     * Unsets the "TotMntPeriodo" element
                     */
                    void unsetTotMntPeriodo();
                    
                    /**
                     * Gets the "TotPsjNac" element
                     */
                    long getTotPsjNac();
                    
                    /**
                     * Gets (as xml) the "TotPsjNac" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotPsjNac();
                    
                    /**
                     * True if has "TotPsjNac" element
                     */
                    boolean isSetTotPsjNac();
                    
                    /**
                     * Sets the "TotPsjNac" element
                     */
                    void setTotPsjNac(long totPsjNac);
                    
                    /**
                     * Sets (as xml) the "TotPsjNac" element
                     */
                    void xsetTotPsjNac(cl.sii.siiDte.libroCV.ValorType totPsjNac);
                    
                    /**
                     * Unsets the "TotPsjNac" element
                     */
                    void unsetTotPsjNac();
                    
                    /**
                     * Gets the "TotPsjInt" element
                     */
                    long getTotPsjInt();
                    
                    /**
                     * Gets (as xml) the "TotPsjInt" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotPsjInt();
                    
                    /**
                     * True if has "TotPsjInt" element
                     */
                    boolean isSetTotPsjInt();
                    
                    /**
                     * Sets the "TotPsjInt" element
                     */
                    void setTotPsjInt(long totPsjInt);
                    
                    /**
                     * Sets (as xml) the "TotPsjInt" element
                     */
                    void xsetTotPsjInt(cl.sii.siiDte.libroCV.ValorType totPsjInt);
                    
                    /**
                     * Unsets the "TotPsjInt" element
                     */
                    void unsetTotPsjInt();
                    
                    /**
                     * Gets the "TotTabPuros" element
                     */
                    long getTotTabPuros();
                    
                    /**
                     * Gets (as xml) the "TotTabPuros" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotTabPuros();
                    
                    /**
                     * True if has "TotTabPuros" element
                     */
                    boolean isSetTotTabPuros();
                    
                    /**
                     * Sets the "TotTabPuros" element
                     */
                    void setTotTabPuros(long totTabPuros);
                    
                    /**
                     * Sets (as xml) the "TotTabPuros" element
                     */
                    void xsetTotTabPuros(cl.sii.siiDte.libroCV.ValorType totTabPuros);
                    
                    /**
                     * Unsets the "TotTabPuros" element
                     */
                    void unsetTotTabPuros();
                    
                    /**
                     * Gets the "TotTabCigarrillos" element
                     */
                    long getTotTabCigarrillos();
                    
                    /**
                     * Gets (as xml) the "TotTabCigarrillos" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotTabCigarrillos();
                    
                    /**
                     * True if has "TotTabCigarrillos" element
                     */
                    boolean isSetTotTabCigarrillos();
                    
                    /**
                     * Sets the "TotTabCigarrillos" element
                     */
                    void setTotTabCigarrillos(long totTabCigarrillos);
                    
                    /**
                     * Sets (as xml) the "TotTabCigarrillos" element
                     */
                    void xsetTotTabCigarrillos(cl.sii.siiDte.libroCV.ValorType totTabCigarrillos);
                    
                    /**
                     * Unsets the "TotTabCigarrillos" element
                     */
                    void unsetTotTabCigarrillos();
                    
                    /**
                     * Gets the "TotTabElaborado" element
                     */
                    long getTotTabElaborado();
                    
                    /**
                     * Gets (as xml) the "TotTabElaborado" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotTabElaborado();
                    
                    /**
                     * True if has "TotTabElaborado" element
                     */
                    boolean isSetTotTabElaborado();
                    
                    /**
                     * Sets the "TotTabElaborado" element
                     */
                    void setTotTabElaborado(long totTabElaborado);
                    
                    /**
                     * Sets (as xml) the "TotTabElaborado" element
                     */
                    void xsetTotTabElaborado(cl.sii.siiDte.libroCV.ValorType totTabElaborado);
                    
                    /**
                     * Unsets the "TotTabElaborado" element
                     */
                    void unsetTotTabElaborado();
                    
                    /**
                     * An XML TpoImp(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TpoImp.
                     */
                    public interface TpoImp extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      int getIntValue();
                      void setIntValue(int i);
                      /** @deprecated */
                      int intValue();
                      /** @deprecated */
                      void set(int i);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoImp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tpoimp17b4elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TpoImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotDoc(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotDoc.
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
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotDoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totdoc1f7aelemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotAnulado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotAnulado.
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
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotAnulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totanuladoe96aelemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpExe(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpExe.
                     */
                    public interface TotOpExe extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpExe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopexe1cf3elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpExe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVARec(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVARec.
                     */
                    public interface TotOpIVARec extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVARec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivarec3ec1elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpActivoFijo(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpActivoFijo.
                     */
                    public interface TotOpActivoFijo extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpActivoFijo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopactivofijo3b1delemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpActivoFijo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotIVANoRec(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface TotIVANoRec extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotIVANoRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totivanorecf0ffelemtype");
                      
                      /**
                       * Gets the "CodIVANoRec" element
                       */
                      int getCodIVANoRec();
                      
                      /**
                       * Gets (as xml) the "CodIVANoRec" element
                       */
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec xgetCodIVANoRec();
                      
                      /**
                       * Sets the "CodIVANoRec" element
                       */
                      void setCodIVANoRec(int codIVANoRec);
                      
                      /**
                       * Sets (as xml) the "CodIVANoRec" element
                       */
                      void xsetCodIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec codIVANoRec);
                      
                      /**
                       * Gets the "TotOpIVANoRec" element
                       */
                      long getTotOpIVANoRec();
                      
                      /**
                       * Gets (as xml) the "TotOpIVANoRec" element
                       */
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec xgetTotOpIVANoRec();
                      
                      /**
                       * True if has "TotOpIVANoRec" element
                       */
                      boolean isSetTotOpIVANoRec();
                      
                      /**
                       * Sets the "TotOpIVANoRec" element
                       */
                      void setTotOpIVANoRec(long totOpIVANoRec);
                      
                      /**
                       * Sets (as xml) the "TotOpIVANoRec" element
                       */
                      void xsetTotOpIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec totOpIVANoRec);
                      
                      /**
                       * Unsets the "TotOpIVANoRec" element
                       */
                      void unsetTotOpIVANoRec();
                      
                      /**
                       * Gets the "TotMntIVANoRec" element
                       */
                      long getTotMntIVANoRec();
                      
                      /**
                       * Gets (as xml) the "TotMntIVANoRec" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotMntIVANoRec();
                      
                      /**
                       * Sets the "TotMntIVANoRec" element
                       */
                      void setTotMntIVANoRec(long totMntIVANoRec);
                      
                      /**
                       * Sets (as xml) the "TotMntIVANoRec" element
                       */
                      void xsetTotMntIVANoRec(cl.sii.siiDte.libroCV.ValorType totMntIVANoRec);
                      
                      /**
                       * An XML CodIVANoRec(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotIVANoRec$CodIVANoRec.
                       */
                      public interface CodIVANoRec extends org.apache.xmlbeans.XmlPositiveInteger
                      {
                        int getIntValue();
                        void setIntValue(int i);
                        /** @deprecated */
                        int intValue();
                        /** @deprecated */
                        void set(int i);
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodIVANoRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("codivanorec013eelemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec newInstance() {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.CodIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML TotOpIVANoRec(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotIVANoRec$TotOpIVANoRec.
                       */
                      public interface TotOpIVANoRec extends org.apache.xmlbeans.XmlInteger
                      {
                        long getLongValue();
                        void setLongValue(long l);
                        /** @deprecated */
                        long longValue();
                        /** @deprecated */
                        void set(long l);
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVANoRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivanorec0560elemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec newInstance() {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec.TotOpIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVAUsoComun(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVAUsoComun.
                     */
                    public interface TotOpIVAUsoComun extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVAUsoComun.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivausocomunb09eelemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVAUsoComun) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOtrosImp(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface TotOtrosImp extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOtrosImp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tototrosimp5e9felemtype");
                      
                      /**
                       * Gets the "CodImp" element
                       */
                      java.math.BigInteger getCodImp();
                      
                      /**
                       * Gets (as xml) the "CodImp" element
                       */
                      cl.sii.siiDte.libroCV.ImptoType xgetCodImp();
                      
                      /**
                       * Sets the "CodImp" element
                       */
                      void setCodImp(java.math.BigInteger codImp);
                      
                      /**
                       * Sets (as xml) the "CodImp" element
                       */
                      void xsetCodImp(cl.sii.siiDte.libroCV.ImptoType codImp);
                      
                      /**
                       * Gets the "TotMntImp" element
                       */
                      long getTotMntImp();
                      
                      /**
                       * Gets (as xml) the "TotMntImp" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotMntImp();
                      
                      /**
                       * Sets the "TotMntImp" element
                       */
                      void setTotMntImp(long totMntImp);
                      
                      /**
                       * Sets (as xml) the "TotMntImp" element
                       */
                      void xsetTotMntImp(cl.sii.siiDte.libroCV.ValorType totMntImp);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOtrosImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVARetTotal(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVARetTotal.
                     */
                    public interface TotOpIVARetTotal extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVARetTotal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivarettotal22f8elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetTotal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVARetParcial(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVARetParcial.
                     */
                    public interface TotOpIVARetParcial extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVARetParcial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivaretparciald2a6elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVARetParcial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotLiquidaciones(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface TotLiquidaciones extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotLiquidaciones.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totliquidaciones969aelemtype");
                      
                      /**
                       * Gets the "TotValComNeto" element
                       */
                      long getTotValComNeto();
                      
                      /**
                       * Gets (as xml) the "TotValComNeto" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotValComNeto();
                      
                      /**
                       * True if has "TotValComNeto" element
                       */
                      boolean isSetTotValComNeto();
                      
                      /**
                       * Sets the "TotValComNeto" element
                       */
                      void setTotValComNeto(long totValComNeto);
                      
                      /**
                       * Sets (as xml) the "TotValComNeto" element
                       */
                      void xsetTotValComNeto(cl.sii.siiDte.libroCV.ValorType totValComNeto);
                      
                      /**
                       * Unsets the "TotValComNeto" element
                       */
                      void unsetTotValComNeto();
                      
                      /**
                       * Gets the "TotValComExe" element
                       */
                      long getTotValComExe();
                      
                      /**
                       * Gets (as xml) the "TotValComExe" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotValComExe();
                      
                      /**
                       * True if has "TotValComExe" element
                       */
                      boolean isSetTotValComExe();
                      
                      /**
                       * Sets the "TotValComExe" element
                       */
                      void setTotValComExe(long totValComExe);
                      
                      /**
                       * Sets (as xml) the "TotValComExe" element
                       */
                      void xsetTotValComExe(cl.sii.siiDte.libroCV.ValorType totValComExe);
                      
                      /**
                       * Unsets the "TotValComExe" element
                       */
                      void unsetTotValComExe();
                      
                      /**
                       * Gets the "TotValComIVA" element
                       */
                      long getTotValComIVA();
                      
                      /**
                       * Gets (as xml) the "TotValComIVA" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotValComIVA();
                      
                      /**
                       * True if has "TotValComIVA" element
                       */
                      boolean isSetTotValComIVA();
                      
                      /**
                       * Sets the "TotValComIVA" element
                       */
                      void setTotValComIVA(long totValComIVA);
                      
                      /**
                       * Sets (as xml) the "TotValComIVA" element
                       */
                      void xsetTotValComIVA(cl.sii.siiDte.libroCV.ValorType totValComIVA);
                      
                      /**
                       * Unsets the "TotValComIVA" element
                       */
                      void unsetTotValComIVA();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotLiquidaciones) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVANoRetenido(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenSegmento$TotalesSegmento$TotOpIVANoRetenido.
                     */
                    public interface TotOpIVANoRetenido extends org.apache.xmlbeans.XmlInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVANoRetenido.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivanoretenidoc1a0elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento.TotOpIVANoRetenido) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento.TotalesSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento newInstance() {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenSegmento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResumenPeriodo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("resumenperiodobda5elemtype");
                
                /**
                 * Gets array of all "TotalesPeriodo" elements
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] getTotalesPeriodoArray();
                
                /**
                 * Gets ith "TotalesPeriodo" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo getTotalesPeriodoArray(int i);
                
                /**
                 * Returns number of "TotalesPeriodo" element
                 */
                int sizeOfTotalesPeriodoArray();
                
                /**
                 * Sets array of all "TotalesPeriodo" element
                 */
                void setTotalesPeriodoArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo[] totalesPeriodoArray);
                
                /**
                 * Sets ith "TotalesPeriodo" element
                 */
                void setTotalesPeriodoArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo totalesPeriodo);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "TotalesPeriodo" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo insertNewTotalesPeriodo(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "TotalesPeriodo" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo addNewTotalesPeriodo();
                
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotalesPeriodo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totalesperiodofe6delemtype");
                    
                    /**
                     * Gets the "TpoDoc" element
                     */
                    java.math.BigInteger getTpoDoc();
                    
                    /**
                     * Gets (as xml) the "TpoDoc" element
                     */
                    cl.sii.siiDte.libroCV.DoctoType xgetTpoDoc();
                    
                    /**
                     * Sets the "TpoDoc" element
                     */
                    void setTpoDoc(java.math.BigInteger tpoDoc);
                    
                    /**
                     * Sets (as xml) the "TpoDoc" element
                     */
                    void xsetTpoDoc(cl.sii.siiDte.libroCV.DoctoType tpoDoc);
                    
                    /**
                     * Gets the "TpoImp" element
                     */
                    int getTpoImp();
                    
                    /**
                     * Gets (as xml) the "TpoImp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp xgetTpoImp();
                    
                    /**
                     * True if has "TpoImp" element
                     */
                    boolean isSetTpoImp();
                    
                    /**
                     * Sets the "TpoImp" element
                     */
                    void setTpoImp(int tpoImp);
                    
                    /**
                     * Sets (as xml) the "TpoImp" element
                     */
                    void xsetTpoImp(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp tpoImp);
                    
                    /**
                     * Unsets the "TpoImp" element
                     */
                    void unsetTpoImp();
                    
                    /**
                     * Gets the "TotDoc" element
                     */
                    long getTotDoc();
                    
                    /**
                     * Gets (as xml) the "TotDoc" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc xgetTotDoc();
                    
                    /**
                     * Sets the "TotDoc" element
                     */
                    void setTotDoc(long totDoc);
                    
                    /**
                     * Sets (as xml) the "TotDoc" element
                     */
                    void xsetTotDoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc totDoc);
                    
                    /**
                     * Gets the "TotAnulado" element
                     */
                    long getTotAnulado();
                    
                    /**
                     * Gets (as xml) the "TotAnulado" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado xgetTotAnulado();
                    
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
                    void xsetTotAnulado(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado totAnulado);
                    
                    /**
                     * Unsets the "TotAnulado" element
                     */
                    void unsetTotAnulado();
                    
                    /**
                     * Gets the "TotOpExe" element
                     */
                    long getTotOpExe();
                    
                    /**
                     * Gets (as xml) the "TotOpExe" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe xgetTotOpExe();
                    
                    /**
                     * True if has "TotOpExe" element
                     */
                    boolean isSetTotOpExe();
                    
                    /**
                     * Sets the "TotOpExe" element
                     */
                    void setTotOpExe(long totOpExe);
                    
                    /**
                     * Sets (as xml) the "TotOpExe" element
                     */
                    void xsetTotOpExe(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe totOpExe);
                    
                    /**
                     * Unsets the "TotOpExe" element
                     */
                    void unsetTotOpExe();
                    
                    /**
                     * Gets the "TotMntExe" element
                     */
                    long getTotMntExe();
                    
                    /**
                     * Gets (as xml) the "TotMntExe" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntExe();
                    
                    /**
                     * Sets the "TotMntExe" element
                     */
                    void setTotMntExe(long totMntExe);
                    
                    /**
                     * Sets (as xml) the "TotMntExe" element
                     */
                    void xsetTotMntExe(cl.sii.siiDte.libroCV.ValorType totMntExe);
                    
                    /**
                     * Gets the "TotMntNeto" element
                     */
                    long getTotMntNeto();
                    
                    /**
                     * Gets (as xml) the "TotMntNeto" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntNeto();
                    
                    /**
                     * Sets the "TotMntNeto" element
                     */
                    void setTotMntNeto(long totMntNeto);
                    
                    /**
                     * Sets (as xml) the "TotMntNeto" element
                     */
                    void xsetTotMntNeto(cl.sii.siiDte.libroCV.ValorType totMntNeto);
                    
                    /**
                     * Gets the "TotOpIVARec" element
                     */
                    long getTotOpIVARec();
                    
                    /**
                     * Gets (as xml) the "TotOpIVARec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec xgetTotOpIVARec();
                    
                    /**
                     * True if has "TotOpIVARec" element
                     */
                    boolean isSetTotOpIVARec();
                    
                    /**
                     * Sets the "TotOpIVARec" element
                     */
                    void setTotOpIVARec(long totOpIVARec);
                    
                    /**
                     * Sets (as xml) the "TotOpIVARec" element
                     */
                    void xsetTotOpIVARec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec totOpIVARec);
                    
                    /**
                     * Unsets the "TotOpIVARec" element
                     */
                    void unsetTotOpIVARec();
                    
                    /**
                     * Gets the "TotMntIVA" element
                     */
                    long getTotMntIVA();
                    
                    /**
                     * Gets (as xml) the "TotMntIVA" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntIVA();
                    
                    /**
                     * Sets the "TotMntIVA" element
                     */
                    void setTotMntIVA(long totMntIVA);
                    
                    /**
                     * Sets (as xml) the "TotMntIVA" element
                     */
                    void xsetTotMntIVA(cl.sii.siiDte.libroCV.ValorType totMntIVA);
                    
                    /**
                     * Gets the "TotOpActivoFijo" element
                     */
                    long getTotOpActivoFijo();
                    
                    /**
                     * Gets (as xml) the "TotOpActivoFijo" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo xgetTotOpActivoFijo();
                    
                    /**
                     * True if has "TotOpActivoFijo" element
                     */
                    boolean isSetTotOpActivoFijo();
                    
                    /**
                     * Sets the "TotOpActivoFijo" element
                     */
                    void setTotOpActivoFijo(long totOpActivoFijo);
                    
                    /**
                     * Sets (as xml) the "TotOpActivoFijo" element
                     */
                    void xsetTotOpActivoFijo(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo totOpActivoFijo);
                    
                    /**
                     * Unsets the "TotOpActivoFijo" element
                     */
                    void unsetTotOpActivoFijo();
                    
                    /**
                     * Gets the "TotMntActivoFijo" element
                     */
                    long getTotMntActivoFijo();
                    
                    /**
                     * Gets (as xml) the "TotMntActivoFijo" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotMntActivoFijo();
                    
                    /**
                     * True if has "TotMntActivoFijo" element
                     */
                    boolean isSetTotMntActivoFijo();
                    
                    /**
                     * Sets the "TotMntActivoFijo" element
                     */
                    void setTotMntActivoFijo(long totMntActivoFijo);
                    
                    /**
                     * Sets (as xml) the "TotMntActivoFijo" element
                     */
                    void xsetTotMntActivoFijo(cl.sii.siiDte.libroCV.MontoType totMntActivoFijo);
                    
                    /**
                     * Unsets the "TotMntActivoFijo" element
                     */
                    void unsetTotMntActivoFijo();
                    
                    /**
                     * Gets the "TotMntIVAActivoFijo" element
                     */
                    long getTotMntIVAActivoFijo();
                    
                    /**
                     * Gets (as xml) the "TotMntIVAActivoFijo" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotMntIVAActivoFijo();
                    
                    /**
                     * True if has "TotMntIVAActivoFijo" element
                     */
                    boolean isSetTotMntIVAActivoFijo();
                    
                    /**
                     * Sets the "TotMntIVAActivoFijo" element
                     */
                    void setTotMntIVAActivoFijo(long totMntIVAActivoFijo);
                    
                    /**
                     * Sets (as xml) the "TotMntIVAActivoFijo" element
                     */
                    void xsetTotMntIVAActivoFijo(cl.sii.siiDte.libroCV.MontoType totMntIVAActivoFijo);
                    
                    /**
                     * Unsets the "TotMntIVAActivoFijo" element
                     */
                    void unsetTotMntIVAActivoFijo();
                    
                    /**
                     * Gets array of all "TotIVANoRec" elements
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec[] getTotIVANoRecArray();
                    
                    /**
                     * Gets ith "TotIVANoRec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec getTotIVANoRecArray(int i);
                    
                    /**
                     * Returns number of "TotIVANoRec" element
                     */
                    int sizeOfTotIVANoRecArray();
                    
                    /**
                     * Sets array of all "TotIVANoRec" element
                     */
                    void setTotIVANoRecArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec[] totIVANoRecArray);
                    
                    /**
                     * Sets ith "TotIVANoRec" element
                     */
                    void setTotIVANoRecArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec totIVANoRec);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotIVANoRec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec insertNewTotIVANoRec(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotIVANoRec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec addNewTotIVANoRec();
                    
                    /**
                     * Removes the ith "TotIVANoRec" element
                     */
                    void removeTotIVANoRec(int i);
                    
                    /**
                     * Gets the "TotOpIVAUsoComun" element
                     */
                    long getTotOpIVAUsoComun();
                    
                    /**
                     * Gets (as xml) the "TotOpIVAUsoComun" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun xgetTotOpIVAUsoComun();
                    
                    /**
                     * True if has "TotOpIVAUsoComun" element
                     */
                    boolean isSetTotOpIVAUsoComun();
                    
                    /**
                     * Sets the "TotOpIVAUsoComun" element
                     */
                    void setTotOpIVAUsoComun(long totOpIVAUsoComun);
                    
                    /**
                     * Sets (as xml) the "TotOpIVAUsoComun" element
                     */
                    void xsetTotOpIVAUsoComun(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun totOpIVAUsoComun);
                    
                    /**
                     * Unsets the "TotOpIVAUsoComun" element
                     */
                    void unsetTotOpIVAUsoComun();
                    
                    /**
                     * Gets the "TotIVAUsoComun" element
                     */
                    long getTotIVAUsoComun();
                    
                    /**
                     * Gets (as xml) the "TotIVAUsoComun" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotIVAUsoComun();
                    
                    /**
                     * True if has "TotIVAUsoComun" element
                     */
                    boolean isSetTotIVAUsoComun();
                    
                    /**
                     * Sets the "TotIVAUsoComun" element
                     */
                    void setTotIVAUsoComun(long totIVAUsoComun);
                    
                    /**
                     * Sets (as xml) the "TotIVAUsoComun" element
                     */
                    void xsetTotIVAUsoComun(cl.sii.siiDte.libroCV.MontoType totIVAUsoComun);
                    
                    /**
                     * Unsets the "TotIVAUsoComun" element
                     */
                    void unsetTotIVAUsoComun();
                    
                    /**
                     * Gets the "FctProp" element
                     */
                    java.math.BigDecimal getFctProp();
                    
                    /**
                     * Gets (as xml) the "FctProp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp xgetFctProp();
                    
                    /**
                     * True if has "FctProp" element
                     */
                    boolean isSetFctProp();
                    
                    /**
                     * Sets the "FctProp" element
                     */
                    void setFctProp(java.math.BigDecimal fctProp);
                    
                    /**
                     * Sets (as xml) the "FctProp" element
                     */
                    void xsetFctProp(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp fctProp);
                    
                    /**
                     * Unsets the "FctProp" element
                     */
                    void unsetFctProp();
                    
                    /**
                     * Gets the "TotCredIVAUsoComun" element
                     */
                    long getTotCredIVAUsoComun();
                    
                    /**
                     * Gets (as xml) the "TotCredIVAUsoComun" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotCredIVAUsoComun();
                    
                    /**
                     * True if has "TotCredIVAUsoComun" element
                     */
                    boolean isSetTotCredIVAUsoComun();
                    
                    /**
                     * Sets the "TotCredIVAUsoComun" element
                     */
                    void setTotCredIVAUsoComun(long totCredIVAUsoComun);
                    
                    /**
                     * Sets (as xml) the "TotCredIVAUsoComun" element
                     */
                    void xsetTotCredIVAUsoComun(cl.sii.siiDte.libroCV.MontoType totCredIVAUsoComun);
                    
                    /**
                     * Unsets the "TotCredIVAUsoComun" element
                     */
                    void unsetTotCredIVAUsoComun();
                    
                    /**
                     * Gets the "TotIVAFueraPlazo" element
                     */
                    long getTotIVAFueraPlazo();
                    
                    /**
                     * Gets (as xml) the "TotIVAFueraPlazo" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotIVAFueraPlazo();
                    
                    /**
                     * True if has "TotIVAFueraPlazo" element
                     */
                    boolean isSetTotIVAFueraPlazo();
                    
                    /**
                     * Sets the "TotIVAFueraPlazo" element
                     */
                    void setTotIVAFueraPlazo(long totIVAFueraPlazo);
                    
                    /**
                     * Sets (as xml) the "TotIVAFueraPlazo" element
                     */
                    void xsetTotIVAFueraPlazo(cl.sii.siiDte.libroCV.MontoType totIVAFueraPlazo);
                    
                    /**
                     * Unsets the "TotIVAFueraPlazo" element
                     */
                    void unsetTotIVAFueraPlazo();
                    
                    /**
                     * Gets the "TotIVAPropio" element
                     */
                    long getTotIVAPropio();
                    
                    /**
                     * Gets (as xml) the "TotIVAPropio" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVAPropio();
                    
                    /**
                     * True if has "TotIVAPropio" element
                     */
                    boolean isSetTotIVAPropio();
                    
                    /**
                     * Sets the "TotIVAPropio" element
                     */
                    void setTotIVAPropio(long totIVAPropio);
                    
                    /**
                     * Sets (as xml) the "TotIVAPropio" element
                     */
                    void xsetTotIVAPropio(cl.sii.siiDte.libroCV.ValorType totIVAPropio);
                    
                    /**
                     * Unsets the "TotIVAPropio" element
                     */
                    void unsetTotIVAPropio();
                    
                    /**
                     * Gets the "TotIVATerceros" element
                     */
                    long getTotIVATerceros();
                    
                    /**
                     * Gets (as xml) the "TotIVATerceros" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotIVATerceros();
                    
                    /**
                     * True if has "TotIVATerceros" element
                     */
                    boolean isSetTotIVATerceros();
                    
                    /**
                     * Sets the "TotIVATerceros" element
                     */
                    void setTotIVATerceros(long totIVATerceros);
                    
                    /**
                     * Sets (as xml) the "TotIVATerceros" element
                     */
                    void xsetTotIVATerceros(cl.sii.siiDte.libroCV.ValorType totIVATerceros);
                    
                    /**
                     * Unsets the "TotIVATerceros" element
                     */
                    void unsetTotIVATerceros();
                    
                    /**
                     * Gets the "TotLey18211" element
                     */
                    long getTotLey18211();
                    
                    /**
                     * Gets (as xml) the "TotLey18211" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotLey18211();
                    
                    /**
                     * True if has "TotLey18211" element
                     */
                    boolean isSetTotLey18211();
                    
                    /**
                     * Sets the "TotLey18211" element
                     */
                    void setTotLey18211(long totLey18211);
                    
                    /**
                     * Sets (as xml) the "TotLey18211" element
                     */
                    void xsetTotLey18211(cl.sii.siiDte.libroCV.MontoType totLey18211);
                    
                    /**
                     * Unsets the "TotLey18211" element
                     */
                    void unsetTotLey18211();
                    
                    /**
                     * Gets array of all "TotOtrosImp" elements
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp[] getTotOtrosImpArray();
                    
                    /**
                     * Gets ith "TotOtrosImp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp getTotOtrosImpArray(int i);
                    
                    /**
                     * Returns number of "TotOtrosImp" element
                     */
                    int sizeOfTotOtrosImpArray();
                    
                    /**
                     * Sets array of all "TotOtrosImp" element
                     */
                    void setTotOtrosImpArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp[] totOtrosImpArray);
                    
                    /**
                     * Sets ith "TotOtrosImp" element
                     */
                    void setTotOtrosImpArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp totOtrosImp);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "TotOtrosImp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp insertNewTotOtrosImp(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "TotOtrosImp" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp addNewTotOtrosImp();
                    
                    /**
                     * Removes the ith "TotOtrosImp" element
                     */
                    void removeTotOtrosImp(int i);
                    
                    /**
                     * Gets the "TotImpSinCredito" element
                     */
                    long getTotImpSinCredito();
                    
                    /**
                     * Gets (as xml) the "TotImpSinCredito" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotImpSinCredito();
                    
                    /**
                     * True if has "TotImpSinCredito" element
                     */
                    boolean isSetTotImpSinCredito();
                    
                    /**
                     * Sets the "TotImpSinCredito" element
                     */
                    void setTotImpSinCredito(long totImpSinCredito);
                    
                    /**
                     * Sets (as xml) the "TotImpSinCredito" element
                     */
                    void xsetTotImpSinCredito(cl.sii.siiDte.libroCV.MontoType totImpSinCredito);
                    
                    /**
                     * Unsets the "TotImpSinCredito" element
                     */
                    void unsetTotImpSinCredito();
                    
                    /**
                     * Gets the "TotOpIVARetTotal" element
                     */
                    long getTotOpIVARetTotal();
                    
                    /**
                     * Gets (as xml) the "TotOpIVARetTotal" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal xgetTotOpIVARetTotal();
                    
                    /**
                     * True if has "TotOpIVARetTotal" element
                     */
                    boolean isSetTotOpIVARetTotal();
                    
                    /**
                     * Sets the "TotOpIVARetTotal" element
                     */
                    void setTotOpIVARetTotal(long totOpIVARetTotal);
                    
                    /**
                     * Sets (as xml) the "TotOpIVARetTotal" element
                     */
                    void xsetTotOpIVARetTotal(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal totOpIVARetTotal);
                    
                    /**
                     * Unsets the "TotOpIVARetTotal" element
                     */
                    void unsetTotOpIVARetTotal();
                    
                    /**
                     * Gets the "TotIVARetTotal" element
                     */
                    long getTotIVARetTotal();
                    
                    /**
                     * Gets (as xml) the "TotIVARetTotal" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotIVARetTotal();
                    
                    /**
                     * True if has "TotIVARetTotal" element
                     */
                    boolean isSetTotIVARetTotal();
                    
                    /**
                     * Sets the "TotIVARetTotal" element
                     */
                    void setTotIVARetTotal(long totIVARetTotal);
                    
                    /**
                     * Sets (as xml) the "TotIVARetTotal" element
                     */
                    void xsetTotIVARetTotal(cl.sii.siiDte.libroCV.MontoType totIVARetTotal);
                    
                    /**
                     * Unsets the "TotIVARetTotal" element
                     */
                    void unsetTotIVARetTotal();
                    
                    /**
                     * Gets the "TotOpIVARetParcial" element
                     */
                    long getTotOpIVARetParcial();
                    
                    /**
                     * Gets (as xml) the "TotOpIVARetParcial" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial xgetTotOpIVARetParcial();
                    
                    /**
                     * True if has "TotOpIVARetParcial" element
                     */
                    boolean isSetTotOpIVARetParcial();
                    
                    /**
                     * Sets the "TotOpIVARetParcial" element
                     */
                    void setTotOpIVARetParcial(long totOpIVARetParcial);
                    
                    /**
                     * Sets (as xml) the "TotOpIVARetParcial" element
                     */
                    void xsetTotOpIVARetParcial(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial totOpIVARetParcial);
                    
                    /**
                     * Unsets the "TotOpIVARetParcial" element
                     */
                    void unsetTotOpIVARetParcial();
                    
                    /**
                     * Gets the "TotIVARetParcial" element
                     */
                    long getTotIVARetParcial();
                    
                    /**
                     * Gets (as xml) the "TotIVARetParcial" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotIVARetParcial();
                    
                    /**
                     * True if has "TotIVARetParcial" element
                     */
                    boolean isSetTotIVARetParcial();
                    
                    /**
                     * Sets the "TotIVARetParcial" element
                     */
                    void setTotIVARetParcial(long totIVARetParcial);
                    
                    /**
                     * Sets (as xml) the "TotIVARetParcial" element
                     */
                    void xsetTotIVARetParcial(cl.sii.siiDte.libroCV.MontoType totIVARetParcial);
                    
                    /**
                     * Unsets the "TotIVARetParcial" element
                     */
                    void unsetTotIVARetParcial();
                    
                    /**
                     * Gets the "TotCredEC" element
                     */
                    long getTotCredEC();
                    
                    /**
                     * Gets (as xml) the "TotCredEC" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotCredEC();
                    
                    /**
                     * True if has "TotCredEC" element
                     */
                    boolean isSetTotCredEC();
                    
                    /**
                     * Sets the "TotCredEC" element
                     */
                    void setTotCredEC(long totCredEC);
                    
                    /**
                     * Sets (as xml) the "TotCredEC" element
                     */
                    void xsetTotCredEC(cl.sii.siiDte.libroCV.MontoType totCredEC);
                    
                    /**
                     * Unsets the "TotCredEC" element
                     */
                    void unsetTotCredEC();
                    
                    /**
                     * Gets the "TotDepEnvase" element
                     */
                    long getTotDepEnvase();
                    
                    /**
                     * Gets (as xml) the "TotDepEnvase" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotDepEnvase();
                    
                    /**
                     * True if has "TotDepEnvase" element
                     */
                    boolean isSetTotDepEnvase();
                    
                    /**
                     * Sets the "TotDepEnvase" element
                     */
                    void setTotDepEnvase(long totDepEnvase);
                    
                    /**
                     * Sets (as xml) the "TotDepEnvase" element
                     */
                    void xsetTotDepEnvase(cl.sii.siiDte.libroCV.MontoType totDepEnvase);
                    
                    /**
                     * Unsets the "TotDepEnvase" element
                     */
                    void unsetTotDepEnvase();
                    
                    /**
                     * Gets the "TotLiquidaciones" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones getTotLiquidaciones();
                    
                    /**
                     * True if has "TotLiquidaciones" element
                     */
                    boolean isSetTotLiquidaciones();
                    
                    /**
                     * Sets the "TotLiquidaciones" element
                     */
                    void setTotLiquidaciones(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones totLiquidaciones);
                    
                    /**
                     * Appends and returns a new empty "TotLiquidaciones" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones addNewTotLiquidaciones();
                    
                    /**
                     * Unsets the "TotLiquidaciones" element
                     */
                    void unsetTotLiquidaciones();
                    
                    /**
                     * Gets the "TotMntTotal" element
                     */
                    long getTotMntTotal();
                    
                    /**
                     * Gets (as xml) the "TotMntTotal" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntTotal();
                    
                    /**
                     * Sets the "TotMntTotal" element
                     */
                    void setTotMntTotal(long totMntTotal);
                    
                    /**
                     * Sets (as xml) the "TotMntTotal" element
                     */
                    void xsetTotMntTotal(cl.sii.siiDte.libroCV.ValorType totMntTotal);
                    
                    /**
                     * Gets the "TotOpIVANoRetenido" element
                     */
                    long getTotOpIVANoRetenido();
                    
                    /**
                     * Gets (as xml) the "TotOpIVANoRetenido" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido xgetTotOpIVANoRetenido();
                    
                    /**
                     * True if has "TotOpIVANoRetenido" element
                     */
                    boolean isSetTotOpIVANoRetenido();
                    
                    /**
                     * Sets the "TotOpIVANoRetenido" element
                     */
                    void setTotOpIVANoRetenido(long totOpIVANoRetenido);
                    
                    /**
                     * Sets (as xml) the "TotOpIVANoRetenido" element
                     */
                    void xsetTotOpIVANoRetenido(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido totOpIVANoRetenido);
                    
                    /**
                     * Unsets the "TotOpIVANoRetenido" element
                     */
                    void unsetTotOpIVANoRetenido();
                    
                    /**
                     * Gets the "TotIVANoRetenido" element
                     */
                    long getTotIVANoRetenido();
                    
                    /**
                     * Gets (as xml) the "TotIVANoRetenido" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotIVANoRetenido();
                    
                    /**
                     * True if has "TotIVANoRetenido" element
                     */
                    boolean isSetTotIVANoRetenido();
                    
                    /**
                     * Sets the "TotIVANoRetenido" element
                     */
                    void setTotIVANoRetenido(long totIVANoRetenido);
                    
                    /**
                     * Sets (as xml) the "TotIVANoRetenido" element
                     */
                    void xsetTotIVANoRetenido(cl.sii.siiDte.libroCV.MontoType totIVANoRetenido);
                    
                    /**
                     * Unsets the "TotIVANoRetenido" element
                     */
                    void unsetTotIVANoRetenido();
                    
                    /**
                     * Gets the "TotMntNoFact" element
                     */
                    long getTotMntNoFact();
                    
                    /**
                     * Gets (as xml) the "TotMntNoFact" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntNoFact();
                    
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
                    void xsetTotMntNoFact(cl.sii.siiDte.libroCV.ValorType totMntNoFact);
                    
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
                    cl.sii.siiDte.libroCV.ValorType xgetTotMntPeriodo();
                    
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
                    void xsetTotMntPeriodo(cl.sii.siiDte.libroCV.ValorType totMntPeriodo);
                    
                    /**
                     * Unsets the "TotMntPeriodo" element
                     */
                    void unsetTotMntPeriodo();
                    
                    /**
                     * Gets the "TotPsjNac" element
                     */
                    long getTotPsjNac();
                    
                    /**
                     * Gets (as xml) the "TotPsjNac" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotPsjNac();
                    
                    /**
                     * True if has "TotPsjNac" element
                     */
                    boolean isSetTotPsjNac();
                    
                    /**
                     * Sets the "TotPsjNac" element
                     */
                    void setTotPsjNac(long totPsjNac);
                    
                    /**
                     * Sets (as xml) the "TotPsjNac" element
                     */
                    void xsetTotPsjNac(cl.sii.siiDte.libroCV.MontoType totPsjNac);
                    
                    /**
                     * Unsets the "TotPsjNac" element
                     */
                    void unsetTotPsjNac();
                    
                    /**
                     * Gets the "TotPsjInt" element
                     */
                    long getTotPsjInt();
                    
                    /**
                     * Gets (as xml) the "TotPsjInt" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotPsjInt();
                    
                    /**
                     * True if has "TotPsjInt" element
                     */
                    boolean isSetTotPsjInt();
                    
                    /**
                     * Sets the "TotPsjInt" element
                     */
                    void setTotPsjInt(long totPsjInt);
                    
                    /**
                     * Sets (as xml) the "TotPsjInt" element
                     */
                    void xsetTotPsjInt(cl.sii.siiDte.libroCV.MontoType totPsjInt);
                    
                    /**
                     * Unsets the "TotPsjInt" element
                     */
                    void unsetTotPsjInt();
                    
                    /**
                     * Gets the "TotTabPuros" element
                     */
                    long getTotTabPuros();
                    
                    /**
                     * Gets (as xml) the "TotTabPuros" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotTabPuros();
                    
                    /**
                     * True if has "TotTabPuros" element
                     */
                    boolean isSetTotTabPuros();
                    
                    /**
                     * Sets the "TotTabPuros" element
                     */
                    void setTotTabPuros(long totTabPuros);
                    
                    /**
                     * Sets (as xml) the "TotTabPuros" element
                     */
                    void xsetTotTabPuros(cl.sii.siiDte.libroCV.MontoType totTabPuros);
                    
                    /**
                     * Unsets the "TotTabPuros" element
                     */
                    void unsetTotTabPuros();
                    
                    /**
                     * Gets the "TotTabCigarrillos" element
                     */
                    long getTotTabCigarrillos();
                    
                    /**
                     * Gets (as xml) the "TotTabCigarrillos" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotTabCigarrillos();
                    
                    /**
                     * True if has "TotTabCigarrillos" element
                     */
                    boolean isSetTotTabCigarrillos();
                    
                    /**
                     * Sets the "TotTabCigarrillos" element
                     */
                    void setTotTabCigarrillos(long totTabCigarrillos);
                    
                    /**
                     * Sets (as xml) the "TotTabCigarrillos" element
                     */
                    void xsetTotTabCigarrillos(cl.sii.siiDte.libroCV.MontoType totTabCigarrillos);
                    
                    /**
                     * Unsets the "TotTabCigarrillos" element
                     */
                    void unsetTotTabCigarrillos();
                    
                    /**
                     * Gets the "TotTabElaborado" element
                     */
                    long getTotTabElaborado();
                    
                    /**
                     * Gets (as xml) the "TotTabElaborado" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotTabElaborado();
                    
                    /**
                     * True if has "TotTabElaborado" element
                     */
                    boolean isSetTotTabElaborado();
                    
                    /**
                     * Sets the "TotTabElaborado" element
                     */
                    void setTotTabElaborado(long totTabElaborado);
                    
                    /**
                     * Sets (as xml) the "TotTabElaborado" element
                     */
                    void xsetTotTabElaborado(cl.sii.siiDte.libroCV.MontoType totTabElaborado);
                    
                    /**
                     * Unsets the "TotTabElaborado" element
                     */
                    void unsetTotTabElaborado();
                    
                    /**
                     * Gets the "TotImpVehiculo" element
                     */
                    long getTotImpVehiculo();
                    
                    /**
                     * Gets (as xml) the "TotImpVehiculo" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetTotImpVehiculo();
                    
                    /**
                     * True if has "TotImpVehiculo" element
                     */
                    boolean isSetTotImpVehiculo();
                    
                    /**
                     * Sets the "TotImpVehiculo" element
                     */
                    void setTotImpVehiculo(long totImpVehiculo);
                    
                    /**
                     * Sets (as xml) the "TotImpVehiculo" element
                     */
                    void xsetTotImpVehiculo(cl.sii.siiDte.libroCV.MontoType totImpVehiculo);
                    
                    /**
                     * Unsets the "TotImpVehiculo" element
                     */
                    void unsetTotImpVehiculo();
                    
                    /**
                     * An XML TpoImp(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TpoImp.
                     */
                    public interface TpoImp extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      int getIntValue();
                      void setIntValue(int i);
                      /** @deprecated */
                      int intValue();
                      /** @deprecated */
                      void set(int i);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoImp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tpoimp21c2elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TpoImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotDoc(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotDoc.
                     */
                    public interface TotDoc extends org.apache.xmlbeans.XmlNonNegativeInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotDoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totdoc6308elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotAnulado(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotAnulado.
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
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotAnulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totanuladoe8f8elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotAnulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpExe(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpExe.
                     */
                    public interface TotOpExe extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpExe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopexe6ac1elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpExe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVARec(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVARec.
                     */
                    public interface TotOpIVARec extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVARec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivareca80felemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpActivoFijo(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpActivoFijo.
                     */
                    public interface TotOpActivoFijo extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpActivoFijo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopactivofijo0b6belemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpActivoFijo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotIVANoRec(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface TotIVANoRec extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotIVANoRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totivanorecd1cdelemtype");
                      
                      /**
                       * Gets the "CodIVANoRec" element
                       */
                      java.math.BigInteger getCodIVANoRec();
                      
                      /**
                       * Gets (as xml) the "CodIVANoRec" element
                       */
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec xgetCodIVANoRec();
                      
                      /**
                       * Sets the "CodIVANoRec" element
                       */
                      void setCodIVANoRec(java.math.BigInteger codIVANoRec);
                      
                      /**
                       * Sets (as xml) the "CodIVANoRec" element
                       */
                      void xsetCodIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec codIVANoRec);
                      
                      /**
                       * Gets the "TotOpIVANoRec" element
                       */
                      long getTotOpIVANoRec();
                      
                      /**
                       * Gets (as xml) the "TotOpIVANoRec" element
                       */
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec xgetTotOpIVANoRec();
                      
                      /**
                       * True if has "TotOpIVANoRec" element
                       */
                      boolean isSetTotOpIVANoRec();
                      
                      /**
                       * Sets the "TotOpIVANoRec" element
                       */
                      void setTotOpIVANoRec(long totOpIVANoRec);
                      
                      /**
                       * Sets (as xml) the "TotOpIVANoRec" element
                       */
                      void xsetTotOpIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec totOpIVANoRec);
                      
                      /**
                       * Unsets the "TotOpIVANoRec" element
                       */
                      void unsetTotOpIVANoRec();
                      
                      /**
                       * Gets the "TotMntIVANoRec" element
                       */
                      long getTotMntIVANoRec();
                      
                      /**
                       * Gets (as xml) the "TotMntIVANoRec" element
                       */
                      cl.sii.siiDte.libroCV.MontoType xgetTotMntIVANoRec();
                      
                      /**
                       * Sets the "TotMntIVANoRec" element
                       */
                      void setTotMntIVANoRec(long totMntIVANoRec);
                      
                      /**
                       * Sets (as xml) the "TotMntIVANoRec" element
                       */
                      void xsetTotMntIVANoRec(cl.sii.siiDte.libroCV.MontoType totMntIVANoRec);
                      
                      /**
                       * An XML CodIVANoRec(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotIVANoRec$CodIVANoRec.
                       */
                      public interface CodIVANoRec extends org.apache.xmlbeans.XmlPositiveInteger
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodIVANoRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("codivanorece5ccelemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec newInstance() {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.CodIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML TotOpIVANoRec(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotIVANoRec$TotOpIVANoRec.
                       */
                      public interface TotOpIVANoRec extends org.apache.xmlbeans.XmlPositiveInteger
                      {
                        long getLongValue();
                        void setLongValue(long l);
                        /** @deprecated */
                        long longValue();
                        /** @deprecated */
                        void set(long l);
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVANoRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivanorec8a6eelemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec newInstance() {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec.TotOpIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVAUsoComun(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVAUsoComun.
                     */
                    public interface TotOpIVAUsoComun extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVAUsoComun.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivausocomuned2celemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVAUsoComun) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML FctProp(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$FctProp.
                     */
                    public interface FctProp extends org.apache.xmlbeans.XmlDecimal
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FctProp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("fctpropaf93elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.FctProp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOtrosImp(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface TotOtrosImp extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOtrosImp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tototrosimp276delemtype");
                      
                      /**
                       * Gets the "CodImp" element
                       */
                      java.math.BigInteger getCodImp();
                      
                      /**
                       * Gets (as xml) the "CodImp" element
                       */
                      cl.sii.siiDte.libroCV.ImptoType xgetCodImp();
                      
                      /**
                       * Sets the "CodImp" element
                       */
                      void setCodImp(java.math.BigInteger codImp);
                      
                      /**
                       * Sets (as xml) the "CodImp" element
                       */
                      void xsetCodImp(cl.sii.siiDte.libroCV.ImptoType codImp);
                      
                      /**
                       * Gets the "TotMntImp" element
                       */
                      long getTotMntImp();
                      
                      /**
                       * Gets (as xml) the "TotMntImp" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotMntImp();
                      
                      /**
                       * Sets the "TotMntImp" element
                       */
                      void setTotMntImp(long totMntImp);
                      
                      /**
                       * Sets (as xml) the "TotMntImp" element
                       */
                      void xsetTotMntImp(cl.sii.siiDte.libroCV.ValorType totMntImp);
                      
                      /**
                       * Gets the "FctImpAdic" element
                       */
                      java.math.BigDecimal getFctImpAdic();
                      
                      /**
                       * Gets (as xml) the "FctImpAdic" element
                       */
                      cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic xgetFctImpAdic();
                      
                      /**
                       * True if has "FctImpAdic" element
                       */
                      boolean isSetFctImpAdic();
                      
                      /**
                       * Sets the "FctImpAdic" element
                       */
                      void setFctImpAdic(java.math.BigDecimal fctImpAdic);
                      
                      /**
                       * Sets (as xml) the "FctImpAdic" element
                       */
                      void xsetFctImpAdic(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic fctImpAdic);
                      
                      /**
                       * Unsets the "FctImpAdic" element
                       */
                      void unsetFctImpAdic();
                      
                      /**
                       * Gets the "TotCredImp" element
                       */
                      long getTotCredImp();
                      
                      /**
                       * Gets (as xml) the "TotCredImp" element
                       */
                      cl.sii.siiDte.libroCV.MontoType xgetTotCredImp();
                      
                      /**
                       * True if has "TotCredImp" element
                       */
                      boolean isSetTotCredImp();
                      
                      /**
                       * Sets the "TotCredImp" element
                       */
                      void setTotCredImp(long totCredImp);
                      
                      /**
                       * Sets (as xml) the "TotCredImp" element
                       */
                      void xsetTotCredImp(cl.sii.siiDte.libroCV.MontoType totCredImp);
                      
                      /**
                       * Unsets the "TotCredImp" element
                       */
                      void unsetTotCredImp();
                      
                      /**
                       * An XML FctImpAdic(@http://www.sii.cl/SiiDte).
                       *
                       * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOtrosImp$FctImpAdic.
                       */
                      public interface FctImpAdic extends org.apache.xmlbeans.XmlDecimal
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FctImpAdic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("fctimpadic343belemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic newInstance() {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp.FctImpAdic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOtrosImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVARetTotal(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVARetTotal.
                     */
                    public interface TotOpIVARetTotal extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVARetTotal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivarettotal2e06elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetTotal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVARetParcial(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVARetParcial.
                     */
                    public interface TotOpIVARetParcial extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVARetParcial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivaretparcialf134elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVARetParcial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotLiquidaciones(@http://www.sii.cl/SiiDte).
                     *
                     * This is a complex type.
                     */
                    public interface TotLiquidaciones extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotLiquidaciones.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totliquidaciones2228elemtype");
                      
                      /**
                       * Gets the "TotValComNeto" element
                       */
                      long getTotValComNeto();
                      
                      /**
                       * Gets (as xml) the "TotValComNeto" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotValComNeto();
                      
                      /**
                       * True if has "TotValComNeto" element
                       */
                      boolean isSetTotValComNeto();
                      
                      /**
                       * Sets the "TotValComNeto" element
                       */
                      void setTotValComNeto(long totValComNeto);
                      
                      /**
                       * Sets (as xml) the "TotValComNeto" element
                       */
                      void xsetTotValComNeto(cl.sii.siiDte.libroCV.ValorType totValComNeto);
                      
                      /**
                       * Unsets the "TotValComNeto" element
                       */
                      void unsetTotValComNeto();
                      
                      /**
                       * Gets the "TotValComExe" element
                       */
                      long getTotValComExe();
                      
                      /**
                       * Gets (as xml) the "TotValComExe" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotValComExe();
                      
                      /**
                       * True if has "TotValComExe" element
                       */
                      boolean isSetTotValComExe();
                      
                      /**
                       * Sets the "TotValComExe" element
                       */
                      void setTotValComExe(long totValComExe);
                      
                      /**
                       * Sets (as xml) the "TotValComExe" element
                       */
                      void xsetTotValComExe(cl.sii.siiDte.libroCV.ValorType totValComExe);
                      
                      /**
                       * Unsets the "TotValComExe" element
                       */
                      void unsetTotValComExe();
                      
                      /**
                       * Gets the "TotValComIVA" element
                       */
                      long getTotValComIVA();
                      
                      /**
                       * Gets (as xml) the "TotValComIVA" element
                       */
                      cl.sii.siiDte.libroCV.ValorType xgetTotValComIVA();
                      
                      /**
                       * True if has "TotValComIVA" element
                       */
                      boolean isSetTotValComIVA();
                      
                      /**
                       * Sets the "TotValComIVA" element
                       */
                      void setTotValComIVA(long totValComIVA);
                      
                      /**
                       * Sets (as xml) the "TotValComIVA" element
                       */
                      void xsetTotValComIVA(cl.sii.siiDte.libroCV.ValorType totValComIVA);
                      
                      /**
                       * Unsets the "TotValComIVA" element
                       */
                      void unsetTotValComIVA();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotLiquidaciones) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML TotOpIVANoRetenido(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$ResumenPeriodo$TotalesPeriodo$TotOpIVANoRetenido.
                     */
                    public interface TotOpIVANoRetenido extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      long getLongValue();
                      void setLongValue(long l);
                      /** @deprecated */
                      long longValue();
                      /** @deprecated */
                      void set(long l);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotOpIVANoRetenido.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("totopivanoretenido56aeelemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo.TotOpIVANoRetenido) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo.TotalesPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo newInstance() {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.ResumenPeriodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Detalle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("detalle8fffelemtype");
                
                /**
                 * Gets the "TpoDoc" element
                 */
                java.math.BigInteger getTpoDoc();
                
                /**
                 * Gets (as xml) the "TpoDoc" element
                 */
                cl.sii.siiDte.libroCV.DoctoType xgetTpoDoc();
                
                /**
                 * Sets the "TpoDoc" element
                 */
                void setTpoDoc(java.math.BigInteger tpoDoc);
                
                /**
                 * Sets (as xml) the "TpoDoc" element
                 */
                void xsetTpoDoc(cl.sii.siiDte.libroCV.DoctoType tpoDoc);
                
                /**
                 * Gets the "Emisor" element
                 */
                int getEmisor();
                
                /**
                 * Gets (as xml) the "Emisor" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor xgetEmisor();
                
                /**
                 * True if has "Emisor" element
                 */
                boolean isSetEmisor();
                
                /**
                 * Sets the "Emisor" element
                 */
                void setEmisor(int emisor);
                
                /**
                 * Sets (as xml) the "Emisor" element
                 */
                void xsetEmisor(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor emisor);
                
                /**
                 * Unsets the "Emisor" element
                 */
                void unsetEmisor();
                
                /**
                 * Gets the "IndFactCompra" element
                 */
                int getIndFactCompra();
                
                /**
                 * Gets (as xml) the "IndFactCompra" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra xgetIndFactCompra();
                
                /**
                 * True if has "IndFactCompra" element
                 */
                boolean isSetIndFactCompra();
                
                /**
                 * Sets the "IndFactCompra" element
                 */
                void setIndFactCompra(int indFactCompra);
                
                /**
                 * Sets (as xml) the "IndFactCompra" element
                 */
                void xsetIndFactCompra(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra indFactCompra);
                
                /**
                 * Unsets the "IndFactCompra" element
                 */
                void unsetIndFactCompra();
                
                /**
                 * Gets the "NroDoc" element
                 */
                long getNroDoc();
                
                /**
                 * Gets (as xml) the "NroDoc" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc xgetNroDoc();
                
                /**
                 * Sets the "NroDoc" element
                 */
                void setNroDoc(long nroDoc);
                
                /**
                 * Sets (as xml) the "NroDoc" element
                 */
                void xsetNroDoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc nroDoc);
                
                /**
                 * Gets the "Anulado" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado.Enum getAnulado();
                
                /**
                 * Gets (as xml) the "Anulado" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado xgetAnulado();
                
                /**
                 * True if has "Anulado" element
                 */
                boolean isSetAnulado();
                
                /**
                 * Sets the "Anulado" element
                 */
                void setAnulado(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado.Enum anulado);
                
                /**
                 * Sets (as xml) the "Anulado" element
                 */
                void xsetAnulado(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado anulado);
                
                /**
                 * Unsets the "Anulado" element
                 */
                void unsetAnulado();
                
                /**
                 * Gets the "Operacion" element
                 */
                java.math.BigInteger getOperacion();
                
                /**
                 * Gets (as xml) the "Operacion" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion xgetOperacion();
                
                /**
                 * True if has "Operacion" element
                 */
                boolean isSetOperacion();
                
                /**
                 * Sets the "Operacion" element
                 */
                void setOperacion(java.math.BigInteger operacion);
                
                /**
                 * Sets (as xml) the "Operacion" element
                 */
                void xsetOperacion(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion operacion);
                
                /**
                 * Unsets the "Operacion" element
                 */
                void unsetOperacion();
                
                /**
                 * Gets the "TpoImp" element
                 */
                int getTpoImp();
                
                /**
                 * Gets (as xml) the "TpoImp" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp xgetTpoImp();
                
                /**
                 * True if has "TpoImp" element
                 */
                boolean isSetTpoImp();
                
                /**
                 * Sets the "TpoImp" element
                 */
                void setTpoImp(int tpoImp);
                
                /**
                 * Sets (as xml) the "TpoImp" element
                 */
                void xsetTpoImp(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp tpoImp);
                
                /**
                 * Unsets the "TpoImp" element
                 */
                void unsetTpoImp();
                
                /**
                 * Gets the "TasaImp" element
                 */
                java.math.BigDecimal getTasaImp();
                
                /**
                 * Gets (as xml) the "TasaImp" element
                 */
                cl.sii.siiDte.libroCV.PctType xgetTasaImp();
                
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
                void xsetTasaImp(cl.sii.siiDte.libroCV.PctType tasaImp);
                
                /**
                 * Unsets the "TasaImp" element
                 */
                void unsetTasaImp();
                
                /**
                 * Gets the "NumInt" element
                 */
                java.lang.String getNumInt();
                
                /**
                 * Gets (as xml) the "NumInt" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt xgetNumInt();
                
                /**
                 * True if has "NumInt" element
                 */
                boolean isSetNumInt();
                
                /**
                 * Sets the "NumInt" element
                 */
                void setNumInt(java.lang.String numInt);
                
                /**
                 * Sets (as xml) the "NumInt" element
                 */
                void xsetNumInt(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt numInt);
                
                /**
                 * Unsets the "NumInt" element
                 */
                void unsetNumInt();
                
                /**
                 * Gets the "IndServicio" element
                 */
                java.math.BigInteger getIndServicio();
                
                /**
                 * Gets (as xml) the "IndServicio" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio xgetIndServicio();
                
                /**
                 * True if has "IndServicio" element
                 */
                boolean isSetIndServicio();
                
                /**
                 * Sets the "IndServicio" element
                 */
                void setIndServicio(java.math.BigInteger indServicio);
                
                /**
                 * Sets (as xml) the "IndServicio" element
                 */
                void xsetIndServicio(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio indServicio);
                
                /**
                 * Unsets the "IndServicio" element
                 */
                void unsetIndServicio();
                
                /**
                 * Gets the "IndSinCosto" element
                 */
                java.math.BigInteger getIndSinCosto();
                
                /**
                 * Gets (as xml) the "IndSinCosto" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto xgetIndSinCosto();
                
                /**
                 * True if has "IndSinCosto" element
                 */
                boolean isSetIndSinCosto();
                
                /**
                 * Sets the "IndSinCosto" element
                 */
                void setIndSinCosto(java.math.BigInteger indSinCosto);
                
                /**
                 * Sets (as xml) the "IndSinCosto" element
                 */
                void xsetIndSinCosto(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto indSinCosto);
                
                /**
                 * Unsets the "IndSinCosto" element
                 */
                void unsetIndSinCosto();
                
                /**
                 * Gets the "FchDoc" element
                 */
                java.util.Calendar getFchDoc();
                
                /**
                 * Gets (as xml) the "FchDoc" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc xgetFchDoc();
                
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
                void xsetFchDoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc fchDoc);
                
                /**
                 * Unsets the "FchDoc" element
                 */
                void unsetFchDoc();
                
                /**
                 * Gets the "CdgSIISucur" element
                 */
                int getCdgSIISucur();
                
                /**
                 * Gets (as xml) the "CdgSIISucur" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur xgetCdgSIISucur();
                
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
                void xsetCdgSIISucur(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur cdgSIISucur);
                
                /**
                 * Unsets the "CdgSIISucur" element
                 */
                void unsetCdgSIISucur();
                
                /**
                 * Gets the "RUTDoc" element
                 */
                java.lang.String getRUTDoc();
                
                /**
                 * Gets (as xml) the "RUTDoc" element
                 */
                cl.sii.siiDte.libroCV.RUTType xgetRUTDoc();
                
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
                void xsetRUTDoc(cl.sii.siiDte.libroCV.RUTType rutDoc);
                
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
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc xgetRznSoc();
                
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
                void xsetRznSoc(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc rznSoc);
                
                /**
                 * Unsets the "RznSoc" element
                 */
                void unsetRznSoc();
                
                /**
                 * Gets the "Extranjero" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero getExtranjero();
                
                /**
                 * True if has "Extranjero" element
                 */
                boolean isSetExtranjero();
                
                /**
                 * Sets the "Extranjero" element
                 */
                void setExtranjero(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero extranjero);
                
                /**
                 * Appends and returns a new empty "Extranjero" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero addNewExtranjero();
                
                /**
                 * Unsets the "Extranjero" element
                 */
                void unsetExtranjero();
                
                /**
                 * Gets the "TpoDocRef" element
                 */
                java.math.BigInteger getTpoDocRef();
                
                /**
                 * Gets (as xml) the "TpoDocRef" element
                 */
                cl.sii.siiDte.libroCV.DoctoType xgetTpoDocRef();
                
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
                void xsetTpoDocRef(cl.sii.siiDte.libroCV.DoctoType tpoDocRef);
                
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
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef xgetFolioDocRef();
                
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
                void xsetFolioDocRef(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef folioDocRef);
                
                /**
                 * Unsets the "FolioDocRef" element
                 */
                void unsetFolioDocRef();
                
                /**
                 * Gets the "MntExe" element
                 */
                long getMntExe();
                
                /**
                 * Gets (as xml) the "MntExe" element
                 */
                cl.sii.siiDte.libroCV.ValorType xgetMntExe();
                
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
                void xsetMntExe(cl.sii.siiDte.libroCV.ValorType mntExe);
                
                /**
                 * Unsets the "MntExe" element
                 */
                void unsetMntExe();
                
                /**
                 * Gets the "MntNeto" element
                 */
                long getMntNeto();
                
                /**
                 * Gets (as xml) the "MntNeto" element
                 */
                cl.sii.siiDte.libroCV.ValorType xgetMntNeto();
                
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
                void xsetMntNeto(cl.sii.siiDte.libroCV.ValorType mntNeto);
                
                /**
                 * Unsets the "MntNeto" element
                 */
                void unsetMntNeto();
                
                /**
                 * Gets the "MntIVA" element
                 */
                long getMntIVA();
                
                /**
                 * Gets (as xml) the "MntIVA" element
                 */
                cl.sii.siiDte.libroCV.ValorType xgetMntIVA();
                
                /**
                 * True if has "MntIVA" element
                 */
                boolean isSetMntIVA();
                
                /**
                 * Sets the "MntIVA" element
                 */
                void setMntIVA(long mntIVA);
                
                /**
                 * Sets (as xml) the "MntIVA" element
                 */
                void xsetMntIVA(cl.sii.siiDte.libroCV.ValorType mntIVA);
                
                /**
                 * Unsets the "MntIVA" element
                 */
                void unsetMntIVA();
                
                /**
                 * Gets the "MntActivoFijo" element
                 */
                long getMntActivoFijo();
                
                /**
                 * Gets (as xml) the "MntActivoFijo" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetMntActivoFijo();
                
                /**
                 * True if has "MntActivoFijo" element
                 */
                boolean isSetMntActivoFijo();
                
                /**
                 * Sets the "MntActivoFijo" element
                 */
                void setMntActivoFijo(long mntActivoFijo);
                
                /**
                 * Sets (as xml) the "MntActivoFijo" element
                 */
                void xsetMntActivoFijo(cl.sii.siiDte.libroCV.MontoType mntActivoFijo);
                
                /**
                 * Unsets the "MntActivoFijo" element
                 */
                void unsetMntActivoFijo();
                
                /**
                 * Gets the "MntIVAActivoFijo" element
                 */
                long getMntIVAActivoFijo();
                
                /**
                 * Gets (as xml) the "MntIVAActivoFijo" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetMntIVAActivoFijo();
                
                /**
                 * True if has "MntIVAActivoFijo" element
                 */
                boolean isSetMntIVAActivoFijo();
                
                /**
                 * Sets the "MntIVAActivoFijo" element
                 */
                void setMntIVAActivoFijo(long mntIVAActivoFijo);
                
                /**
                 * Sets (as xml) the "MntIVAActivoFijo" element
                 */
                void xsetMntIVAActivoFijo(cl.sii.siiDte.libroCV.MontoType mntIVAActivoFijo);
                
                /**
                 * Unsets the "MntIVAActivoFijo" element
                 */
                void unsetMntIVAActivoFijo();
                
                /**
                 * Gets array of all "IVANoRec" elements
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec[] getIVANoRecArray();
                
                /**
                 * Gets ith "IVANoRec" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec getIVANoRecArray(int i);
                
                /**
                 * Returns number of "IVANoRec" element
                 */
                int sizeOfIVANoRecArray();
                
                /**
                 * Sets array of all "IVANoRec" element
                 */
                void setIVANoRecArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec[] ivaNoRecArray);
                
                /**
                 * Sets ith "IVANoRec" element
                 */
                void setIVANoRecArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec ivaNoRec);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IVANoRec" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec insertNewIVANoRec(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IVANoRec" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec addNewIVANoRec();
                
                /**
                 * Removes the ith "IVANoRec" element
                 */
                void removeIVANoRec(int i);
                
                /**
                 * Gets the "IVAUsoComun" element
                 */
                long getIVAUsoComun();
                
                /**
                 * Gets (as xml) the "IVAUsoComun" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetIVAUsoComun();
                
                /**
                 * True if has "IVAUsoComun" element
                 */
                boolean isSetIVAUsoComun();
                
                /**
                 * Sets the "IVAUsoComun" element
                 */
                void setIVAUsoComun(long ivaUsoComun);
                
                /**
                 * Sets (as xml) the "IVAUsoComun" element
                 */
                void xsetIVAUsoComun(cl.sii.siiDte.libroCV.MontoType ivaUsoComun);
                
                /**
                 * Unsets the "IVAUsoComun" element
                 */
                void unsetIVAUsoComun();
                
                /**
                 * Gets the "IVAFueraPlazo" element
                 */
                long getIVAFueraPlazo();
                
                /**
                 * Gets (as xml) the "IVAFueraPlazo" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetIVAFueraPlazo();
                
                /**
                 * True if has "IVAFueraPlazo" element
                 */
                boolean isSetIVAFueraPlazo();
                
                /**
                 * Sets the "IVAFueraPlazo" element
                 */
                void setIVAFueraPlazo(long ivaFueraPlazo);
                
                /**
                 * Sets (as xml) the "IVAFueraPlazo" element
                 */
                void xsetIVAFueraPlazo(cl.sii.siiDte.libroCV.MontoType ivaFueraPlazo);
                
                /**
                 * Unsets the "IVAFueraPlazo" element
                 */
                void unsetIVAFueraPlazo();
                
                /**
                 * Gets the "IVAPropio" element
                 */
                long getIVAPropio();
                
                /**
                 * Gets (as xml) the "IVAPropio" element
                 */
                cl.sii.siiDte.libroCV.ValorType xgetIVAPropio();
                
                /**
                 * True if has "IVAPropio" element
                 */
                boolean isSetIVAPropio();
                
                /**
                 * Sets the "IVAPropio" element
                 */
                void setIVAPropio(long ivaPropio);
                
                /**
                 * Sets (as xml) the "IVAPropio" element
                 */
                void xsetIVAPropio(cl.sii.siiDte.libroCV.ValorType ivaPropio);
                
                /**
                 * Unsets the "IVAPropio" element
                 */
                void unsetIVAPropio();
                
                /**
                 * Gets the "IVATerceros" element
                 */
                long getIVATerceros();
                
                /**
                 * Gets (as xml) the "IVATerceros" element
                 */
                cl.sii.siiDte.libroCV.ValorType xgetIVATerceros();
                
                /**
                 * True if has "IVATerceros" element
                 */
                boolean isSetIVATerceros();
                
                /**
                 * Sets the "IVATerceros" element
                 */
                void setIVATerceros(long ivaTerceros);
                
                /**
                 * Sets (as xml) the "IVATerceros" element
                 */
                void xsetIVATerceros(cl.sii.siiDte.libroCV.ValorType ivaTerceros);
                
                /**
                 * Unsets the "IVATerceros" element
                 */
                void unsetIVATerceros();
                
                /**
                 * Gets the "Ley18211" element
                 */
                long getLey18211();
                
                /**
                 * Gets (as xml) the "Ley18211" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetLey18211();
                
                /**
                 * True if has "Ley18211" element
                 */
                boolean isSetLey18211();
                
                /**
                 * Sets the "Ley18211" element
                 */
                void setLey18211(long ley18211);
                
                /**
                 * Sets (as xml) the "Ley18211" element
                 */
                void xsetLey18211(cl.sii.siiDte.libroCV.MontoType ley18211);
                
                /**
                 * Unsets the "Ley18211" element
                 */
                void unsetLey18211();
                
                /**
                 * Gets array of all "OtrosImp" elements
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp[] getOtrosImpArray();
                
                /**
                 * Gets ith "OtrosImp" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp getOtrosImpArray(int i);
                
                /**
                 * Returns number of "OtrosImp" element
                 */
                int sizeOfOtrosImpArray();
                
                /**
                 * Sets array of all "OtrosImp" element
                 */
                void setOtrosImpArray(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp[] otrosImpArray);
                
                /**
                 * Sets ith "OtrosImp" element
                 */
                void setOtrosImpArray(int i, cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp otrosImp);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "OtrosImp" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp insertNewOtrosImp(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "OtrosImp" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp addNewOtrosImp();
                
                /**
                 * Removes the ith "OtrosImp" element
                 */
                void removeOtrosImp(int i);
                
                /**
                 * Gets the "MntSinCred" element
                 */
                long getMntSinCred();
                
                /**
                 * Gets (as xml) the "MntSinCred" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetMntSinCred();
                
                /**
                 * True if has "MntSinCred" element
                 */
                boolean isSetMntSinCred();
                
                /**
                 * Sets the "MntSinCred" element
                 */
                void setMntSinCred(long mntSinCred);
                
                /**
                 * Sets (as xml) the "MntSinCred" element
                 */
                void xsetMntSinCred(cl.sii.siiDte.libroCV.MontoType mntSinCred);
                
                /**
                 * Unsets the "MntSinCred" element
                 */
                void unsetMntSinCred();
                
                /**
                 * Gets the "IVARetTotal" element
                 */
                long getIVARetTotal();
                
                /**
                 * Gets (as xml) the "IVARetTotal" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetIVARetTotal();
                
                /**
                 * True if has "IVARetTotal" element
                 */
                boolean isSetIVARetTotal();
                
                /**
                 * Sets the "IVARetTotal" element
                 */
                void setIVARetTotal(long ivaRetTotal);
                
                /**
                 * Sets (as xml) the "IVARetTotal" element
                 */
                void xsetIVARetTotal(cl.sii.siiDte.libroCV.MontoType ivaRetTotal);
                
                /**
                 * Unsets the "IVARetTotal" element
                 */
                void unsetIVARetTotal();
                
                /**
                 * Gets the "IVARetParcial" element
                 */
                long getIVARetParcial();
                
                /**
                 * Gets (as xml) the "IVARetParcial" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetIVARetParcial();
                
                /**
                 * True if has "IVARetParcial" element
                 */
                boolean isSetIVARetParcial();
                
                /**
                 * Sets the "IVARetParcial" element
                 */
                void setIVARetParcial(long ivaRetParcial);
                
                /**
                 * Sets (as xml) the "IVARetParcial" element
                 */
                void xsetIVARetParcial(cl.sii.siiDte.libroCV.MontoType ivaRetParcial);
                
                /**
                 * Unsets the "IVARetParcial" element
                 */
                void unsetIVARetParcial();
                
                /**
                 * Gets the "CredEC" element
                 */
                long getCredEC();
                
                /**
                 * Gets (as xml) the "CredEC" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetCredEC();
                
                /**
                 * True if has "CredEC" element
                 */
                boolean isSetCredEC();
                
                /**
                 * Sets the "CredEC" element
                 */
                void setCredEC(long credEC);
                
                /**
                 * Sets (as xml) the "CredEC" element
                 */
                void xsetCredEC(cl.sii.siiDte.libroCV.MontoType credEC);
                
                /**
                 * Unsets the "CredEC" element
                 */
                void unsetCredEC();
                
                /**
                 * Gets the "DepEnvase" element
                 */
                long getDepEnvase();
                
                /**
                 * Gets (as xml) the "DepEnvase" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetDepEnvase();
                
                /**
                 * True if has "DepEnvase" element
                 */
                boolean isSetDepEnvase();
                
                /**
                 * Sets the "DepEnvase" element
                 */
                void setDepEnvase(long depEnvase);
                
                /**
                 * Sets (as xml) the "DepEnvase" element
                 */
                void xsetDepEnvase(cl.sii.siiDte.libroCV.MontoType depEnvase);
                
                /**
                 * Unsets the "DepEnvase" element
                 */
                void unsetDepEnvase();
                
                /**
                 * Gets the "Liquidaciones" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones getLiquidaciones();
                
                /**
                 * True if has "Liquidaciones" element
                 */
                boolean isSetLiquidaciones();
                
                /**
                 * Sets the "Liquidaciones" element
                 */
                void setLiquidaciones(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones liquidaciones);
                
                /**
                 * Appends and returns a new empty "Liquidaciones" element
                 */
                cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones addNewLiquidaciones();
                
                /**
                 * Unsets the "Liquidaciones" element
                 */
                void unsetLiquidaciones();
                
                /**
                 * Gets the "MntTotal" element
                 */
                long getMntTotal();
                
                /**
                 * Gets (as xml) the "MntTotal" element
                 */
                cl.sii.siiDte.libroCV.ValorType xgetMntTotal();
                
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
                void xsetMntTotal(cl.sii.siiDte.libroCV.ValorType mntTotal);
                
                /**
                 * Unsets the "MntTotal" element
                 */
                void unsetMntTotal();
                
                /**
                 * Gets the "IVANoRetenido" element
                 */
                long getIVANoRetenido();
                
                /**
                 * Gets (as xml) the "IVANoRetenido" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetIVANoRetenido();
                
                /**
                 * True if has "IVANoRetenido" element
                 */
                boolean isSetIVANoRetenido();
                
                /**
                 * Sets the "IVANoRetenido" element
                 */
                void setIVANoRetenido(long ivaNoRetenido);
                
                /**
                 * Sets (as xml) the "IVANoRetenido" element
                 */
                void xsetIVANoRetenido(cl.sii.siiDte.libroCV.MontoType ivaNoRetenido);
                
                /**
                 * Unsets the "IVANoRetenido" element
                 */
                void unsetIVANoRetenido();
                
                /**
                 * Gets the "MntNoFact" element
                 */
                long getMntNoFact();
                
                /**
                 * Gets (as xml) the "MntNoFact" element
                 */
                cl.sii.siiDte.libroCV.ValorType xgetMntNoFact();
                
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
                void xsetMntNoFact(cl.sii.siiDte.libroCV.ValorType mntNoFact);
                
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
                cl.sii.siiDte.libroCV.ValorType xgetMntPeriodo();
                
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
                void xsetMntPeriodo(cl.sii.siiDte.libroCV.ValorType mntPeriodo);
                
                /**
                 * Unsets the "MntPeriodo" element
                 */
                void unsetMntPeriodo();
                
                /**
                 * Gets the "PsjNac" element
                 */
                long getPsjNac();
                
                /**
                 * Gets (as xml) the "PsjNac" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetPsjNac();
                
                /**
                 * True if has "PsjNac" element
                 */
                boolean isSetPsjNac();
                
                /**
                 * Sets the "PsjNac" element
                 */
                void setPsjNac(long psjNac);
                
                /**
                 * Sets (as xml) the "PsjNac" element
                 */
                void xsetPsjNac(cl.sii.siiDte.libroCV.MontoType psjNac);
                
                /**
                 * Unsets the "PsjNac" element
                 */
                void unsetPsjNac();
                
                /**
                 * Gets the "PsjInt" element
                 */
                long getPsjInt();
                
                /**
                 * Gets (as xml) the "PsjInt" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetPsjInt();
                
                /**
                 * True if has "PsjInt" element
                 */
                boolean isSetPsjInt();
                
                /**
                 * Sets the "PsjInt" element
                 */
                void setPsjInt(long psjInt);
                
                /**
                 * Sets (as xml) the "PsjInt" element
                 */
                void xsetPsjInt(cl.sii.siiDte.libroCV.MontoType psjInt);
                
                /**
                 * Unsets the "PsjInt" element
                 */
                void unsetPsjInt();
                
                /**
                 * Gets the "TabPuros" element
                 */
                long getTabPuros();
                
                /**
                 * Gets (as xml) the "TabPuros" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetTabPuros();
                
                /**
                 * True if has "TabPuros" element
                 */
                boolean isSetTabPuros();
                
                /**
                 * Sets the "TabPuros" element
                 */
                void setTabPuros(long tabPuros);
                
                /**
                 * Sets (as xml) the "TabPuros" element
                 */
                void xsetTabPuros(cl.sii.siiDte.libroCV.MontoType tabPuros);
                
                /**
                 * Unsets the "TabPuros" element
                 */
                void unsetTabPuros();
                
                /**
                 * Gets the "TabCigarrillos" element
                 */
                long getTabCigarrillos();
                
                /**
                 * Gets (as xml) the "TabCigarrillos" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetTabCigarrillos();
                
                /**
                 * True if has "TabCigarrillos" element
                 */
                boolean isSetTabCigarrillos();
                
                /**
                 * Sets the "TabCigarrillos" element
                 */
                void setTabCigarrillos(long tabCigarrillos);
                
                /**
                 * Sets (as xml) the "TabCigarrillos" element
                 */
                void xsetTabCigarrillos(cl.sii.siiDte.libroCV.MontoType tabCigarrillos);
                
                /**
                 * Unsets the "TabCigarrillos" element
                 */
                void unsetTabCigarrillos();
                
                /**
                 * Gets the "TabElaborado" element
                 */
                long getTabElaborado();
                
                /**
                 * Gets (as xml) the "TabElaborado" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetTabElaborado();
                
                /**
                 * True if has "TabElaborado" element
                 */
                boolean isSetTabElaborado();
                
                /**
                 * Sets the "TabElaborado" element
                 */
                void setTabElaborado(long tabElaborado);
                
                /**
                 * Sets (as xml) the "TabElaborado" element
                 */
                void xsetTabElaborado(cl.sii.siiDte.libroCV.MontoType tabElaborado);
                
                /**
                 * Unsets the "TabElaborado" element
                 */
                void unsetTabElaborado();
                
                /**
                 * Gets the "ImpVehiculo" element
                 */
                long getImpVehiculo();
                
                /**
                 * Gets (as xml) the "ImpVehiculo" element
                 */
                cl.sii.siiDte.libroCV.MontoType xgetImpVehiculo();
                
                /**
                 * True if has "ImpVehiculo" element
                 */
                boolean isSetImpVehiculo();
                
                /**
                 * Sets the "ImpVehiculo" element
                 */
                void setImpVehiculo(long impVehiculo);
                
                /**
                 * Sets (as xml) the "ImpVehiculo" element
                 */
                void xsetImpVehiculo(cl.sii.siiDte.libroCV.MontoType impVehiculo);
                
                /**
                 * Unsets the "ImpVehiculo" element
                 */
                void unsetImpVehiculo();
                
                /**
                 * An XML Emisor(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Emisor.
                 */
                public interface Emisor extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Emisor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("emisora130elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Emisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML IndFactCompra(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$IndFactCompra.
                 */
                public interface IndFactCompra extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndFactCompra.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("indfactcomprad8d4elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndFactCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML NroDoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$NroDoc.
                 */
                public interface NroDoc extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroDoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("nrodoc4c08elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NroDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Anulado(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Anulado.
                 */
                public interface Anulado extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Anulado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("anulado8bf3elemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum A = Enum.forString("A");
                    
                    static final int INT_A = Enum.INT_A;
                    
                    /**
                     * Enumeration value class for cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Anulado.
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
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Anulado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Operacion(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Operacion.
                 */
                public interface Operacion extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("operacionea63elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Operacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML TpoImp(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$TpoImp.
                 */
                public interface TpoImp extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoImp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tpoimp2254elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.TpoImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML NumInt(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$NumInt.
                 */
                public interface NumInt extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumInt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("numint1784elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.NumInt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML IndServicio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$IndServicio.
                 */
                public interface IndServicio extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndServicio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("indserviciod760elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndServicio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML IndSinCosto(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$IndSinCosto.
                 */
                public interface IndSinCosto extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndSinCosto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("indsincosto3bd4elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IndSinCosto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML FchDoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$FchDoc.
                 */
                public interface FchDoc extends org.apache.xmlbeans.XmlDate
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FchDoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("fchdoccfe8elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FchDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CdgSIISucur(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$CdgSIISucur.
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CdgSIISucur.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("cdgsiisucur565celemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.CdgSIISucur) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML RznSoc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$RznSoc.
                 */
                public interface RznSoc extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RznSoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("rznsoc7f7celemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.RznSoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Extranjero(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface Extranjero extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extranjero.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("extranjero8551elemtype");
                    
                    /**
                     * Gets the "NumId" element
                     */
                    java.lang.String getNumId();
                    
                    /**
                     * Gets (as xml) the "NumId" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId xgetNumId();
                    
                    /**
                     * True if has "NumId" element
                     */
                    boolean isSetNumId();
                    
                    /**
                     * Sets the "NumId" element
                     */
                    void setNumId(java.lang.String numId);
                    
                    /**
                     * Sets (as xml) the "NumId" element
                     */
                    void xsetNumId(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId numId);
                    
                    /**
                     * Unsets the "NumId" element
                     */
                    void unsetNumId();
                    
                    /**
                     * Gets the "Nacionalidad" element
                     */
                    java.lang.String getNacionalidad();
                    
                    /**
                     * Gets (as xml) the "Nacionalidad" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad xgetNacionalidad();
                    
                    /**
                     * True if has "Nacionalidad" element
                     */
                    boolean isSetNacionalidad();
                    
                    /**
                     * Sets the "Nacionalidad" element
                     */
                    void setNacionalidad(java.lang.String nacionalidad);
                    
                    /**
                     * Sets (as xml) the "Nacionalidad" element
                     */
                    void xsetNacionalidad(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad nacionalidad);
                    
                    /**
                     * Unsets the "Nacionalidad" element
                     */
                    void unsetNacionalidad();
                    
                    /**
                     * An XML NumId(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Extranjero$NumId.
                     */
                    public interface NumId extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("numid48a4elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.NumId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML Nacionalidad(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$Extranjero$Nacionalidad.
                     */
                    public interface Nacionalidad extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Nacionalidad.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("nacionalidad2754elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero.Nacionalidad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Extranjero) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML FolioDocRef(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$FolioDocRef.
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FolioDocRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("foliodocref630felemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.FolioDocRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML IVANoRec(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface IVANoRec extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IVANoRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("ivanorecb016elemtype");
                    
                    /**
                     * Gets the "CodIVANoRec" element
                     */
                    java.math.BigInteger getCodIVANoRec();
                    
                    /**
                     * Gets (as xml) the "CodIVANoRec" element
                     */
                    cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec xgetCodIVANoRec();
                    
                    /**
                     * Sets the "CodIVANoRec" element
                     */
                    void setCodIVANoRec(java.math.BigInteger codIVANoRec);
                    
                    /**
                     * Sets (as xml) the "CodIVANoRec" element
                     */
                    void xsetCodIVANoRec(cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec codIVANoRec);
                    
                    /**
                     * Gets the "MntIVANoRec" element
                     */
                    long getMntIVANoRec();
                    
                    /**
                     * Gets (as xml) the "MntIVANoRec" element
                     */
                    cl.sii.siiDte.libroCV.MontoType xgetMntIVANoRec();
                    
                    /**
                     * Sets the "MntIVANoRec" element
                     */
                    void setMntIVANoRec(long mntIVANoRec);
                    
                    /**
                     * Sets (as xml) the "MntIVANoRec" element
                     */
                    void xsetMntIVANoRec(cl.sii.siiDte.libroCV.MontoType mntIVANoRec);
                    
                    /**
                     * An XML CodIVANoRec(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$Detalle$IVANoRec$CodIVANoRec.
                     */
                    public interface CodIVANoRec extends org.apache.xmlbeans.XmlPositiveInteger
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodIVANoRec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("codivanorec0777elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec newInstance() {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec.CodIVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.IVANoRec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML OtrosImp(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface OtrosImp extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OtrosImp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("otrosimpe5b6elemtype");
                    
                    /**
                     * Gets the "CodImp" element
                     */
                    java.math.BigInteger getCodImp();
                    
                    /**
                     * Gets (as xml) the "CodImp" element
                     */
                    cl.sii.siiDte.libroCV.ImptoType xgetCodImp();
                    
                    /**
                     * Sets the "CodImp" element
                     */
                    void setCodImp(java.math.BigInteger codImp);
                    
                    /**
                     * Sets (as xml) the "CodImp" element
                     */
                    void xsetCodImp(cl.sii.siiDte.libroCV.ImptoType codImp);
                    
                    /**
                     * Gets the "TasaImp" element
                     */
                    java.math.BigDecimal getTasaImp();
                    
                    /**
                     * Gets (as xml) the "TasaImp" element
                     */
                    cl.sii.siiDte.libroCV.PctType xgetTasaImp();
                    
                    /**
                     * Sets the "TasaImp" element
                     */
                    void setTasaImp(java.math.BigDecimal tasaImp);
                    
                    /**
                     * Sets (as xml) the "TasaImp" element
                     */
                    void xsetTasaImp(cl.sii.siiDte.libroCV.PctType tasaImp);
                    
                    /**
                     * Gets the "MntImp" element
                     */
                    long getMntImp();
                    
                    /**
                     * Gets (as xml) the "MntImp" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetMntImp();
                    
                    /**
                     * Sets the "MntImp" element
                     */
                    void setMntImp(long mntImp);
                    
                    /**
                     * Sets (as xml) the "MntImp" element
                     */
                    void xsetMntImp(cl.sii.siiDte.libroCV.ValorType mntImp);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.OtrosImp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Liquidaciones(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface Liquidaciones extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Liquidaciones.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("liquidacionesa263elemtype");
                    
                    /**
                     * Gets the "RutEmisor" element
                     */
                    java.lang.String getRutEmisor();
                    
                    /**
                     * Gets (as xml) the "RutEmisor" element
                     */
                    cl.sii.siiDte.libroCV.RUTType xgetRutEmisor();
                    
                    /**
                     * Sets the "RutEmisor" element
                     */
                    void setRutEmisor(java.lang.String rutEmisor);
                    
                    /**
                     * Sets (as xml) the "RutEmisor" element
                     */
                    void xsetRutEmisor(cl.sii.siiDte.libroCV.RUTType rutEmisor);
                    
                    /**
                     * Gets the "ValComNeto" element
                     */
                    long getValComNeto();
                    
                    /**
                     * Gets (as xml) the "ValComNeto" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetValComNeto();
                    
                    /**
                     * True if has "ValComNeto" element
                     */
                    boolean isSetValComNeto();
                    
                    /**
                     * Sets the "ValComNeto" element
                     */
                    void setValComNeto(long valComNeto);
                    
                    /**
                     * Sets (as xml) the "ValComNeto" element
                     */
                    void xsetValComNeto(cl.sii.siiDte.libroCV.ValorType valComNeto);
                    
                    /**
                     * Unsets the "ValComNeto" element
                     */
                    void unsetValComNeto();
                    
                    /**
                     * Gets the "ValComExe" element
                     */
                    long getValComExe();
                    
                    /**
                     * Gets (as xml) the "ValComExe" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetValComExe();
                    
                    /**
                     * True if has "ValComExe" element
                     */
                    boolean isSetValComExe();
                    
                    /**
                     * Sets the "ValComExe" element
                     */
                    void setValComExe(long valComExe);
                    
                    /**
                     * Sets (as xml) the "ValComExe" element
                     */
                    void xsetValComExe(cl.sii.siiDte.libroCV.ValorType valComExe);
                    
                    /**
                     * Unsets the "ValComExe" element
                     */
                    void unsetValComExe();
                    
                    /**
                     * Gets the "ValComIVA" element
                     */
                    long getValComIVA();
                    
                    /**
                     * Gets (as xml) the "ValComIVA" element
                     */
                    cl.sii.siiDte.libroCV.ValorType xgetValComIVA();
                    
                    /**
                     * True if has "ValComIVA" element
                     */
                    boolean isSetValComIVA();
                    
                    /**
                     * Sets the "ValComIVA" element
                     */
                    void setValComIVA(long valComIVA);
                    
                    /**
                     * Sets (as xml) the "ValComIVA" element
                     */
                    void xsetValComIVA(cl.sii.siiDte.libroCV.ValorType valComIVA);
                    
                    /**
                     * Unsets the "ValComIVA" element
                     */
                    void unsetValComIVA();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones newInstance() {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle.Liquidaciones) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle newInstance() {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.Detalle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML TmstFirma(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.libroCV.LibroCompraVentaDocument$LibroCompraVenta$EnvioLibro$TmstFirma.
             */
            public interface TmstFirma extends org.apache.xmlbeans.XmlDateTime
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TmstFirma.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B3BA2ECBEBB544F8A0D87764A5875F1").resolveHandle("tmstfirmac4f1elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma newInstance() {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro.TmstFirma) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro newInstance() {
                  return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta.EnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta newInstance() {
              return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument.LibroCompraVenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument newInstance() {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.libroCV.LibroCompraVentaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.libroCV.LibroCompraVentaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
