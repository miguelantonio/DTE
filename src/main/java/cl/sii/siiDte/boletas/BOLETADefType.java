/*
 * XML Type:  BOLETADefType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.boletas.BOLETADefType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.boletas;


/**
 * An XML BOLETADefType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public interface BOLETADefType extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.BOLETADefTypeExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BOLETADefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("boletadeftype84c1type");
    
    /**
     * Gets the "Documento" element
     */
    cl.sii.siiDte.boletas.BOLETADefType.Documento getDocumento();
    
    /**
     * Sets the "Documento" element
     */
    void setDocumento(cl.sii.siiDte.boletas.BOLETADefType.Documento documento);
    
    /**
     * Appends and returns a new empty "Documento" element
     */
    cl.sii.siiDte.boletas.BOLETADefType.Documento addNewDocumento();
    
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
     * An XML Documento(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface Documento extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Documento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("documento8fc1elemtype");
        
        /**
         * Gets the "Encabezado" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado getEncabezado();
        
        /**
         * Sets the "Encabezado" element
         */
        void setEncabezado(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado encabezado);
        
        /**
         * Appends and returns a new empty "Encabezado" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado addNewEncabezado();
        
        /**
         * Gets array of all "Detalle" elements
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle[] getDetalleArray();
        
        /**
         * Gets ith "Detalle" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle getDetalleArray(int i);
        
        /**
         * Returns number of "Detalle" element
         */
        int sizeOfDetalleArray();
        
        /**
         * Sets array of all "Detalle" element
         */
        void setDetalleArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle[] detalleArray);
        
        /**
         * Sets ith "Detalle" element
         */
        void setDetalleArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle detalle);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Detalle" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle insertNewDetalle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Detalle" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle addNewDetalle();
        
        /**
         * Removes the ith "Detalle" element
         */
        void removeDetalle(int i);
        
        /**
         * Gets array of all "SubTotInfo" elements
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo[] getSubTotInfoArray();
        
        /**
         * Gets ith "SubTotInfo" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo getSubTotInfoArray(int i);
        
        /**
         * Returns number of "SubTotInfo" element
         */
        int sizeOfSubTotInfoArray();
        
        /**
         * Sets array of all "SubTotInfo" element
         */
        void setSubTotInfoArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo[] subTotInfoArray);
        
        /**
         * Sets ith "SubTotInfo" element
         */
        void setSubTotInfoArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo subTotInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SubTotInfo" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo insertNewSubTotInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SubTotInfo" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo addNewSubTotInfo();
        
        /**
         * Removes the ith "SubTotInfo" element
         */
        void removeSubTotInfo(int i);
        
        /**
         * Gets array of all "DscRcgGlobal" elements
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal[] getDscRcgGlobalArray();
        
        /**
         * Gets ith "DscRcgGlobal" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal getDscRcgGlobalArray(int i);
        
        /**
         * Returns number of "DscRcgGlobal" element
         */
        int sizeOfDscRcgGlobalArray();
        
        /**
         * Sets array of all "DscRcgGlobal" element
         */
        void setDscRcgGlobalArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal[] dscRcgGlobalArray);
        
        /**
         * Sets ith "DscRcgGlobal" element
         */
        void setDscRcgGlobalArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal dscRcgGlobal);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DscRcgGlobal" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal insertNewDscRcgGlobal(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DscRcgGlobal" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal addNewDscRcgGlobal();
        
        /**
         * Removes the ith "DscRcgGlobal" element
         */
        void removeDscRcgGlobal(int i);
        
        /**
         * Gets array of all "Referencia" elements
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia[] getReferenciaArray();
        
        /**
         * Gets ith "Referencia" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia getReferenciaArray(int i);
        
        /**
         * Returns number of "Referencia" element
         */
        int sizeOfReferenciaArray();
        
        /**
         * Sets array of all "Referencia" element
         */
        void setReferenciaArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia[] referenciaArray);
        
        /**
         * Sets ith "Referencia" element
         */
        void setReferenciaArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia referencia);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Referencia" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia insertNewReferencia(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Referencia" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia addNewReferencia();
        
        /**
         * Removes the ith "Referencia" element
         */
        void removeReferencia(int i);
        
        /**
         * Gets the "TED" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.TED getTED();
        
        /**
         * Sets the "TED" element
         */
        void setTED(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED ted);
        
        /**
         * Appends and returns a new empty "TED" element
         */
        cl.sii.siiDte.boletas.BOLETADefType.Documento.TED addNewTED();
        
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
         * An XML Encabezado(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface Encabezado extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Encabezado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("encabezadof1c9elemtype");
            
            /**
             * Gets the "IdDoc" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc getIdDoc();
            
            /**
             * Sets the "IdDoc" element
             */
            void setIdDoc(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc idDoc);
            
            /**
             * Appends and returns a new empty "IdDoc" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc addNewIdDoc();
            
            /**
             * Gets the "Emisor" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor getEmisor();
            
            /**
             * Sets the "Emisor" element
             */
            void setEmisor(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor emisor);
            
            /**
             * Appends and returns a new empty "Emisor" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor addNewEmisor();
            
            /**
             * Gets the "Receptor" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor getReceptor();
            
            /**
             * Sets the "Receptor" element
             */
            void setReceptor(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor receptor);
            
            /**
             * Appends and returns a new empty "Receptor" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor addNewReceptor();
            
            /**
             * Gets the "Totales" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales getTotales();
            
            /**
             * Sets the "Totales" element
             */
            void setTotales(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales totales);
            
            /**
             * Appends and returns a new empty "Totales" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales addNewTotales();
            
            /**
             * An XML IdDoc(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface IdDoc extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdDoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("iddoc7ff2elemtype");
                
                /**
                 * Gets the "TipoDTE" element
                 */
                java.math.BigInteger getTipoDTE();
                
                /**
                 * Gets (as xml) the "TipoDTE" element
                 */
                cl.sii.siiDte.boletas.DTEType xgetTipoDTE();
                
                /**
                 * Sets the "TipoDTE" element
                 */
                void setTipoDTE(java.math.BigInteger tipoDTE);
                
                /**
                 * Sets (as xml) the "TipoDTE" element
                 */
                void xsetTipoDTE(cl.sii.siiDte.boletas.DTEType tipoDTE);
                
                /**
                 * Gets the "Folio" element
                 */
                long getFolio();
                
                /**
                 * Gets (as xml) the "Folio" element
                 */
                cl.sii.siiDte.boletas.FolioType xgetFolio();
                
                /**
                 * Sets the "Folio" element
                 */
                void setFolio(long folio);
                
                /**
                 * Sets (as xml) the "Folio" element
                 */
                void xsetFolio(cl.sii.siiDte.boletas.FolioType folio);
                
                /**
                 * Gets the "FchEmis" element
                 */
                java.util.Calendar getFchEmis();
                
                /**
                 * Gets (as xml) the "FchEmis" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchEmis();
                
                /**
                 * Sets the "FchEmis" element
                 */
                void setFchEmis(java.util.Calendar fchEmis);
                
                /**
                 * Sets (as xml) the "FchEmis" element
                 */
                void xsetFchEmis(org.apache.xmlbeans.XmlDate fchEmis);
                
                /**
                 * Gets the "IndServicio" element
                 */
                java.math.BigInteger getIndServicio();
                
                /**
                 * Gets (as xml) the "IndServicio" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio xgetIndServicio();
                
                /**
                 * Sets the "IndServicio" element
                 */
                void setIndServicio(java.math.BigInteger indServicio);
                
                /**
                 * Sets (as xml) the "IndServicio" element
                 */
                void xsetIndServicio(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio indServicio);
                
                /**
                 * Gets the "IndMntNeto" element
                 */
                java.math.BigInteger getIndMntNeto();
                
                /**
                 * Gets (as xml) the "IndMntNeto" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto xgetIndMntNeto();
                
                /**
                 * True if has "IndMntNeto" element
                 */
                boolean isSetIndMntNeto();
                
                /**
                 * Sets the "IndMntNeto" element
                 */
                void setIndMntNeto(java.math.BigInteger indMntNeto);
                
                /**
                 * Sets (as xml) the "IndMntNeto" element
                 */
                void xsetIndMntNeto(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto indMntNeto);
                
                /**
                 * Unsets the "IndMntNeto" element
                 */
                void unsetIndMntNeto();
                
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
                 * Gets the "FchVenc" element
                 */
                java.util.Calendar getFchVenc();
                
                /**
                 * Gets (as xml) the "FchVenc" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchVenc();
                
                /**
                 * True if has "FchVenc" element
                 */
                boolean isSetFchVenc();
                
                /**
                 * Sets the "FchVenc" element
                 */
                void setFchVenc(java.util.Calendar fchVenc);
                
                /**
                 * Sets (as xml) the "FchVenc" element
                 */
                void xsetFchVenc(org.apache.xmlbeans.XmlDate fchVenc);
                
                /**
                 * Unsets the "FchVenc" element
                 */
                void unsetFchVenc();
                
                /**
                 * An XML IndServicio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$IdDoc$IndServicio.
                 */
                public interface IndServicio extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndServicio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("indservicio10d3elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndServicio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML IndMntNeto(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$IdDoc$IndMntNeto.
                 */
                public interface IndMntNeto extends org.apache.xmlbeans.XmlInteger
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndMntNeto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("indmntneto2f54elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc.IndMntNeto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.IdDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Emisor(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface Emisor extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Emisor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("emisorc57aelemtype");
                
                /**
                 * Gets the "RUTEmisor" element
                 */
                java.lang.String getRUTEmisor();
                
                /**
                 * Gets (as xml) the "RUTEmisor" element
                 */
                cl.sii.siiDte.boletas.RUTType xgetRUTEmisor();
                
                /**
                 * Sets the "RUTEmisor" element
                 */
                void setRUTEmisor(java.lang.String rutEmisor);
                
                /**
                 * Sets (as xml) the "RUTEmisor" element
                 */
                void xsetRUTEmisor(cl.sii.siiDte.boletas.RUTType rutEmisor);
                
                /**
                 * Gets the "RznSocEmisor" element
                 */
                java.lang.String getRznSocEmisor();
                
                /**
                 * Gets (as xml) the "RznSocEmisor" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor xgetRznSocEmisor();
                
                /**
                 * True if has "RznSocEmisor" element
                 */
                boolean isSetRznSocEmisor();
                
                /**
                 * Sets the "RznSocEmisor" element
                 */
                void setRznSocEmisor(java.lang.String rznSocEmisor);
                
                /**
                 * Sets (as xml) the "RznSocEmisor" element
                 */
                void xsetRznSocEmisor(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor rznSocEmisor);
                
                /**
                 * Unsets the "RznSocEmisor" element
                 */
                void unsetRznSocEmisor();
                
                /**
                 * Gets the "GiroEmisor" element
                 */
                java.lang.String getGiroEmisor();
                
                /**
                 * Gets (as xml) the "GiroEmisor" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor xgetGiroEmisor();
                
                /**
                 * True if has "GiroEmisor" element
                 */
                boolean isSetGiroEmisor();
                
                /**
                 * Sets the "GiroEmisor" element
                 */
                void setGiroEmisor(java.lang.String giroEmisor);
                
                /**
                 * Sets (as xml) the "GiroEmisor" element
                 */
                void xsetGiroEmisor(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor giroEmisor);
                
                /**
                 * Unsets the "GiroEmisor" element
                 */
                void unsetGiroEmisor();
                
                /**
                 * Gets the "CdgSIISucur" element
                 */
                int getCdgSIISucur();
                
                /**
                 * Gets (as xml) the "CdgSIISucur" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur xgetCdgSIISucur();
                
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
                void xsetCdgSIISucur(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur cdgSIISucur);
                
                /**
                 * Unsets the "CdgSIISucur" element
                 */
                void unsetCdgSIISucur();
                
                /**
                 * Gets the "DirOrigen" element
                 */
                java.lang.String getDirOrigen();
                
                /**
                 * Gets (as xml) the "DirOrigen" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen xgetDirOrigen();
                
                /**
                 * True if has "DirOrigen" element
                 */
                boolean isSetDirOrigen();
                
                /**
                 * Sets the "DirOrigen" element
                 */
                void setDirOrigen(java.lang.String dirOrigen);
                
                /**
                 * Sets (as xml) the "DirOrigen" element
                 */
                void xsetDirOrigen(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen dirOrigen);
                
                /**
                 * Unsets the "DirOrigen" element
                 */
                void unsetDirOrigen();
                
                /**
                 * Gets the "CmnaOrigen" element
                 */
                java.lang.String getCmnaOrigen();
                
                /**
                 * Gets (as xml) the "CmnaOrigen" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen xgetCmnaOrigen();
                
                /**
                 * True if has "CmnaOrigen" element
                 */
                boolean isSetCmnaOrigen();
                
                /**
                 * Sets the "CmnaOrigen" element
                 */
                void setCmnaOrigen(java.lang.String cmnaOrigen);
                
                /**
                 * Sets (as xml) the "CmnaOrigen" element
                 */
                void xsetCmnaOrigen(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen cmnaOrigen);
                
                /**
                 * Unsets the "CmnaOrigen" element
                 */
                void unsetCmnaOrigen();
                
                /**
                 * Gets the "CiudadOrigen" element
                 */
                java.lang.String getCiudadOrigen();
                
                /**
                 * Gets (as xml) the "CiudadOrigen" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen xgetCiudadOrigen();
                
                /**
                 * True if has "CiudadOrigen" element
                 */
                boolean isSetCiudadOrigen();
                
                /**
                 * Sets the "CiudadOrigen" element
                 */
                void setCiudadOrigen(java.lang.String ciudadOrigen);
                
                /**
                 * Sets (as xml) the "CiudadOrigen" element
                 */
                void xsetCiudadOrigen(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen ciudadOrigen);
                
                /**
                 * Unsets the "CiudadOrigen" element
                 */
                void unsetCiudadOrigen();
                
                /**
                 * An XML RznSocEmisor(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$RznSocEmisor.
                 */
                public interface RznSocEmisor extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RznSocEmisor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("rznsocemisor7c68elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.RznSocEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML GiroEmisor(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$GiroEmisor.
                 */
                public interface GiroEmisor extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GiroEmisor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("giroemisor240aelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.GiroEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CdgSIISucur(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$CdgSIISucur.
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CdgSIISucur.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("cdgsiisucur573delemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CdgSIISucur) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML DirOrigen(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$DirOrigen.
                 */
                public interface DirOrigen extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DirOrigen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("dirorigen1db7elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.DirOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CmnaOrigen(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$CmnaOrigen.
                 */
                public interface CmnaOrigen extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CmnaOrigen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("cmnaorigen9237elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CmnaOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CiudadOrigen(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Emisor$CiudadOrigen.
                 */
                public interface CiudadOrigen extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CiudadOrigen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("ciudadorigenb0dcelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor.CiudadOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Emisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Receptor(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface Receptor extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Receptor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("receptorbac1elemtype");
                
                /**
                 * Gets the "RUTRecep" element
                 */
                java.lang.String getRUTRecep();
                
                /**
                 * Gets (as xml) the "RUTRecep" element
                 */
                cl.sii.siiDte.boletas.RUTType xgetRUTRecep();
                
                /**
                 * Sets the "RUTRecep" element
                 */
                void setRUTRecep(java.lang.String rutRecep);
                
                /**
                 * Sets (as xml) the "RUTRecep" element
                 */
                void xsetRUTRecep(cl.sii.siiDte.boletas.RUTType rutRecep);
                
                /**
                 * Gets the "CdgIntRecep" element
                 */
                java.lang.String getCdgIntRecep();
                
                /**
                 * Gets (as xml) the "CdgIntRecep" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep xgetCdgIntRecep();
                
                /**
                 * True if has "CdgIntRecep" element
                 */
                boolean isSetCdgIntRecep();
                
                /**
                 * Sets the "CdgIntRecep" element
                 */
                void setCdgIntRecep(java.lang.String cdgIntRecep);
                
                /**
                 * Sets (as xml) the "CdgIntRecep" element
                 */
                void xsetCdgIntRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep cdgIntRecep);
                
                /**
                 * Unsets the "CdgIntRecep" element
                 */
                void unsetCdgIntRecep();
                
                /**
                 * Gets the "RznSocRecep" element
                 */
                java.lang.String getRznSocRecep();
                
                /**
                 * Gets (as xml) the "RznSocRecep" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep xgetRznSocRecep();
                
                /**
                 * True if has "RznSocRecep" element
                 */
                boolean isSetRznSocRecep();
                
                /**
                 * Sets the "RznSocRecep" element
                 */
                void setRznSocRecep(java.lang.String rznSocRecep);
                
                /**
                 * Sets (as xml) the "RznSocRecep" element
                 */
                void xsetRznSocRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep rznSocRecep);
                
                /**
                 * Unsets the "RznSocRecep" element
                 */
                void unsetRznSocRecep();
                
                /**
                 * Gets the "Contacto" element
                 */
                java.lang.String getContacto();
                
                /**
                 * Gets (as xml) the "Contacto" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto xgetContacto();
                
                /**
                 * True if has "Contacto" element
                 */
                boolean isSetContacto();
                
                /**
                 * Sets the "Contacto" element
                 */
                void setContacto(java.lang.String contacto);
                
                /**
                 * Sets (as xml) the "Contacto" element
                 */
                void xsetContacto(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto contacto);
                
                /**
                 * Unsets the "Contacto" element
                 */
                void unsetContacto();
                
                /**
                 * Gets the "DirRecep" element
                 */
                java.lang.String getDirRecep();
                
                /**
                 * Gets (as xml) the "DirRecep" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep xgetDirRecep();
                
                /**
                 * True if has "DirRecep" element
                 */
                boolean isSetDirRecep();
                
                /**
                 * Sets the "DirRecep" element
                 */
                void setDirRecep(java.lang.String dirRecep);
                
                /**
                 * Sets (as xml) the "DirRecep" element
                 */
                void xsetDirRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep dirRecep);
                
                /**
                 * Unsets the "DirRecep" element
                 */
                void unsetDirRecep();
                
                /**
                 * Gets the "CmnaRecep" element
                 */
                java.lang.String getCmnaRecep();
                
                /**
                 * Gets (as xml) the "CmnaRecep" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep xgetCmnaRecep();
                
                /**
                 * True if has "CmnaRecep" element
                 */
                boolean isSetCmnaRecep();
                
                /**
                 * Sets the "CmnaRecep" element
                 */
                void setCmnaRecep(java.lang.String cmnaRecep);
                
                /**
                 * Sets (as xml) the "CmnaRecep" element
                 */
                void xsetCmnaRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep cmnaRecep);
                
                /**
                 * Unsets the "CmnaRecep" element
                 */
                void unsetCmnaRecep();
                
                /**
                 * Gets the "CiudadRecep" element
                 */
                java.lang.String getCiudadRecep();
                
                /**
                 * Gets (as xml) the "CiudadRecep" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep xgetCiudadRecep();
                
                /**
                 * True if has "CiudadRecep" element
                 */
                boolean isSetCiudadRecep();
                
                /**
                 * Sets the "CiudadRecep" element
                 */
                void setCiudadRecep(java.lang.String ciudadRecep);
                
                /**
                 * Sets (as xml) the "CiudadRecep" element
                 */
                void xsetCiudadRecep(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep ciudadRecep);
                
                /**
                 * Unsets the "CiudadRecep" element
                 */
                void unsetCiudadRecep();
                
                /**
                 * Gets the "DirPostal" element
                 */
                java.lang.String getDirPostal();
                
                /**
                 * Gets (as xml) the "DirPostal" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal xgetDirPostal();
                
                /**
                 * True if has "DirPostal" element
                 */
                boolean isSetDirPostal();
                
                /**
                 * Sets the "DirPostal" element
                 */
                void setDirPostal(java.lang.String dirPostal);
                
                /**
                 * Sets (as xml) the "DirPostal" element
                 */
                void xsetDirPostal(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal dirPostal);
                
                /**
                 * Unsets the "DirPostal" element
                 */
                void unsetDirPostal();
                
                /**
                 * Gets the "CmnaPostal" element
                 */
                java.lang.String getCmnaPostal();
                
                /**
                 * Gets (as xml) the "CmnaPostal" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal xgetCmnaPostal();
                
                /**
                 * True if has "CmnaPostal" element
                 */
                boolean isSetCmnaPostal();
                
                /**
                 * Sets the "CmnaPostal" element
                 */
                void setCmnaPostal(java.lang.String cmnaPostal);
                
                /**
                 * Sets (as xml) the "CmnaPostal" element
                 */
                void xsetCmnaPostal(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal cmnaPostal);
                
                /**
                 * Unsets the "CmnaPostal" element
                 */
                void unsetCmnaPostal();
                
                /**
                 * Gets the "CiudadPostal" element
                 */
                java.lang.String getCiudadPostal();
                
                /**
                 * Gets (as xml) the "CiudadPostal" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal xgetCiudadPostal();
                
                /**
                 * True if has "CiudadPostal" element
                 */
                boolean isSetCiudadPostal();
                
                /**
                 * Sets the "CiudadPostal" element
                 */
                void setCiudadPostal(java.lang.String ciudadPostal);
                
                /**
                 * Sets (as xml) the "CiudadPostal" element
                 */
                void xsetCiudadPostal(cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal ciudadPostal);
                
                /**
                 * Unsets the "CiudadPostal" element
                 */
                void unsetCiudadPostal();
                
                /**
                 * An XML CdgIntRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CdgIntRecep.
                 */
                public interface CdgIntRecep extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CdgIntRecep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("cdgintrecep4663elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CdgIntRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML RznSocRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$RznSocRecep.
                 */
                public interface RznSocRecep extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RznSocRecep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("rznsocrecep1afbelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.RznSocRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Contacto(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$Contacto.
                 */
                public interface Contacto extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contacto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("contactoa796elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.Contacto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML DirRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$DirRecep.
                 */
                public interface DirRecep extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DirRecep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("dirrecep9597elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CmnaRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CmnaRecep.
                 */
                public interface CmnaRecep extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CmnaRecep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("cmnarecepb117elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CiudadRecep(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CiudadRecep.
                 */
                public interface CiudadRecep extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CiudadRecep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("ciudadrecep6712elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadRecep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML DirPostal(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$DirPostal.
                 */
                public interface DirPostal extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DirPostal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("dirpostalef3delemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.DirPostal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CmnaPostal(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CmnaPostal.
                 */
                public interface CmnaPostal extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CmnaPostal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("cmnapostal43bdelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CmnaPostal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CiudadPostal(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Encabezado$Receptor$CiudadPostal.
                 */
                public interface CiudadPostal extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CiudadPostal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("ciudadpostal4d22elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor.CiudadPostal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Receptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Totales(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface Totales extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Totales.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("totales8587elemtype");
                
                /**
                 * Gets the "MntNeto" element
                 */
                long getMntNeto();
                
                /**
                 * Gets (as xml) the "MntNeto" element
                 */
                cl.sii.siiDte.boletas.MontoType xgetMntNeto();
                
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
                void xsetMntNeto(cl.sii.siiDte.boletas.MontoType mntNeto);
                
                /**
                 * Unsets the "MntNeto" element
                 */
                void unsetMntNeto();
                
                /**
                 * Gets the "MntExe" element
                 */
                long getMntExe();
                
                /**
                 * Gets (as xml) the "MntExe" element
                 */
                cl.sii.siiDte.boletas.MontoType xgetMntExe();
                
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
                void xsetMntExe(cl.sii.siiDte.boletas.MontoType mntExe);
                
                /**
                 * Unsets the "MntExe" element
                 */
                void unsetMntExe();
                
                /**
                 * Gets the "IVA" element
                 */
                long getIVA();
                
                /**
                 * Gets (as xml) the "IVA" element
                 */
                cl.sii.siiDte.boletas.MntImpType xgetIVA();
                
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
                void xsetIVA(cl.sii.siiDte.boletas.MntImpType iva);
                
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
                cl.sii.siiDte.boletas.MontoType xgetMntTotal();
                
                /**
                 * Sets the "MntTotal" element
                 */
                void setMntTotal(long mntTotal);
                
                /**
                 * Sets (as xml) the "MntTotal" element
                 */
                void xsetMntTotal(cl.sii.siiDte.boletas.MontoType mntTotal);
                
                /**
                 * Gets the "MontoNF" element
                 */
                long getMontoNF();
                
                /**
                 * Gets (as xml) the "MontoNF" element
                 */
                cl.sii.siiDte.boletas.ValorType xgetMontoNF();
                
                /**
                 * True if has "MontoNF" element
                 */
                boolean isSetMontoNF();
                
                /**
                 * Sets the "MontoNF" element
                 */
                void setMontoNF(long montoNF);
                
                /**
                 * Sets (as xml) the "MontoNF" element
                 */
                void xsetMontoNF(cl.sii.siiDte.boletas.ValorType montoNF);
                
                /**
                 * Unsets the "MontoNF" element
                 */
                void unsetMontoNF();
                
                /**
                 * Gets the "TotalPeriodo" element
                 */
                long getTotalPeriodo();
                
                /**
                 * Gets (as xml) the "TotalPeriodo" element
                 */
                cl.sii.siiDte.boletas.MontoType xgetTotalPeriodo();
                
                /**
                 * True if has "TotalPeriodo" element
                 */
                boolean isSetTotalPeriodo();
                
                /**
                 * Sets the "TotalPeriodo" element
                 */
                void setTotalPeriodo(long totalPeriodo);
                
                /**
                 * Sets (as xml) the "TotalPeriodo" element
                 */
                void xsetTotalPeriodo(cl.sii.siiDte.boletas.MontoType totalPeriodo);
                
                /**
                 * Unsets the "TotalPeriodo" element
                 */
                void unsetTotalPeriodo();
                
                /**
                 * Gets the "SaldoAnterior" element
                 */
                long getSaldoAnterior();
                
                /**
                 * Gets (as xml) the "SaldoAnterior" element
                 */
                cl.sii.siiDte.boletas.ValorType xgetSaldoAnterior();
                
                /**
                 * True if has "SaldoAnterior" element
                 */
                boolean isSetSaldoAnterior();
                
                /**
                 * Sets the "SaldoAnterior" element
                 */
                void setSaldoAnterior(long saldoAnterior);
                
                /**
                 * Sets (as xml) the "SaldoAnterior" element
                 */
                void xsetSaldoAnterior(cl.sii.siiDte.boletas.ValorType saldoAnterior);
                
                /**
                 * Unsets the "SaldoAnterior" element
                 */
                void unsetSaldoAnterior();
                
                /**
                 * Gets the "VlrPagar" element
                 */
                long getVlrPagar();
                
                /**
                 * Gets (as xml) the "VlrPagar" element
                 */
                cl.sii.siiDte.boletas.ValorType xgetVlrPagar();
                
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
                void xsetVlrPagar(cl.sii.siiDte.boletas.ValorType vlrPagar);
                
                /**
                 * Unsets the "VlrPagar" element
                 */
                void unsetVlrPagar();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado.Totales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado newInstance() {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Encabezado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Detalle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("detalle71deelemtype");
            
            /**
             * Gets the "NroLinDet" element
             */
            java.math.BigInteger getNroLinDet();
            
            /**
             * Gets (as xml) the "NroLinDet" element
             */
            org.apache.xmlbeans.XmlPositiveInteger xgetNroLinDet();
            
            /**
             * Sets the "NroLinDet" element
             */
            void setNroLinDet(java.math.BigInteger nroLinDet);
            
            /**
             * Sets (as xml) the "NroLinDet" element
             */
            void xsetNroLinDet(org.apache.xmlbeans.XmlPositiveInteger nroLinDet);
            
            /**
             * Gets array of all "CdgItem" elements
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem[] getCdgItemArray();
            
            /**
             * Gets ith "CdgItem" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem getCdgItemArray(int i);
            
            /**
             * Returns number of "CdgItem" element
             */
            int sizeOfCdgItemArray();
            
            /**
             * Sets array of all "CdgItem" element
             */
            void setCdgItemArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem[] cdgItemArray);
            
            /**
             * Sets ith "CdgItem" element
             */
            void setCdgItemArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem cdgItem);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "CdgItem" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem insertNewCdgItem(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "CdgItem" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem addNewCdgItem();
            
            /**
             * Removes the ith "CdgItem" element
             */
            void removeCdgItem(int i);
            
            /**
             * Gets the "IndExe" element
             */
            java.math.BigInteger getIndExe();
            
            /**
             * Gets (as xml) the "IndExe" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe xgetIndExe();
            
            /**
             * True if has "IndExe" element
             */
            boolean isSetIndExe();
            
            /**
             * Sets the "IndExe" element
             */
            void setIndExe(java.math.BigInteger indExe);
            
            /**
             * Sets (as xml) the "IndExe" element
             */
            void xsetIndExe(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe indExe);
            
            /**
             * Unsets the "IndExe" element
             */
            void unsetIndExe();
            
            /**
             * Gets the "NmbItem" element
             */
            java.lang.String getNmbItem();
            
            /**
             * Gets (as xml) the "NmbItem" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem xgetNmbItem();
            
            /**
             * Sets the "NmbItem" element
             */
            void setNmbItem(java.lang.String nmbItem);
            
            /**
             * Sets (as xml) the "NmbItem" element
             */
            void xsetNmbItem(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem nmbItem);
            
            /**
             * Gets the "DscItem" element
             */
            java.lang.String getDscItem();
            
            /**
             * Gets (as xml) the "DscItem" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem xgetDscItem();
            
            /**
             * True if has "DscItem" element
             */
            boolean isSetDscItem();
            
            /**
             * Sets the "DscItem" element
             */
            void setDscItem(java.lang.String dscItem);
            
            /**
             * Sets (as xml) the "DscItem" element
             */
            void xsetDscItem(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem dscItem);
            
            /**
             * Unsets the "DscItem" element
             */
            void unsetDscItem();
            
            /**
             * Gets the "QtyItem" element
             */
            java.math.BigDecimal getQtyItem();
            
            /**
             * Gets (as xml) the "QtyItem" element
             */
            cl.sii.siiDte.boletas.Dec5Type xgetQtyItem();
            
            /**
             * True if has "QtyItem" element
             */
            boolean isSetQtyItem();
            
            /**
             * Sets the "QtyItem" element
             */
            void setQtyItem(java.math.BigDecimal qtyItem);
            
            /**
             * Sets (as xml) the "QtyItem" element
             */
            void xsetQtyItem(cl.sii.siiDte.boletas.Dec5Type qtyItem);
            
            /**
             * Unsets the "QtyItem" element
             */
            void unsetQtyItem();
            
            /**
             * Gets the "UnmdItem" element
             */
            java.lang.String getUnmdItem();
            
            /**
             * Gets (as xml) the "UnmdItem" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem xgetUnmdItem();
            
            /**
             * True if has "UnmdItem" element
             */
            boolean isSetUnmdItem();
            
            /**
             * Sets the "UnmdItem" element
             */
            void setUnmdItem(java.lang.String unmdItem);
            
            /**
             * Sets (as xml) the "UnmdItem" element
             */
            void xsetUnmdItem(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem unmdItem);
            
            /**
             * Unsets the "UnmdItem" element
             */
            void unsetUnmdItem();
            
            /**
             * Gets the "PrcItem" element
             */
            java.math.BigDecimal getPrcItem();
            
            /**
             * Gets (as xml) the "PrcItem" element
             */
            cl.sii.siiDte.boletas.Dec5Type xgetPrcItem();
            
            /**
             * True if has "PrcItem" element
             */
            boolean isSetPrcItem();
            
            /**
             * Sets the "PrcItem" element
             */
            void setPrcItem(java.math.BigDecimal prcItem);
            
            /**
             * Sets (as xml) the "PrcItem" element
             */
            void xsetPrcItem(cl.sii.siiDte.boletas.Dec5Type prcItem);
            
            /**
             * Unsets the "PrcItem" element
             */
            void unsetPrcItem();
            
            /**
             * Gets the "MontoItem" element
             */
            long getMontoItem();
            
            /**
             * Gets (as xml) the "MontoItem" element
             */
            cl.sii.siiDte.boletas.MontoType xgetMontoItem();
            
            /**
             * Sets the "MontoItem" element
             */
            void setMontoItem(long montoItem);
            
            /**
             * Sets (as xml) the "MontoItem" element
             */
            void xsetMontoItem(cl.sii.siiDte.boletas.MontoType montoItem);
            
            /**
             * An XML CdgItem(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface CdgItem extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CdgItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("cdgitemd099elemtype");
                
                /**
                 * Gets the "TpoCodigo" element
                 */
                java.lang.String getTpoCodigo();
                
                /**
                 * Gets (as xml) the "TpoCodigo" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo xgetTpoCodigo();
                
                /**
                 * Sets the "TpoCodigo" element
                 */
                void setTpoCodigo(java.lang.String tpoCodigo);
                
                /**
                 * Sets (as xml) the "TpoCodigo" element
                 */
                void xsetTpoCodigo(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo tpoCodigo);
                
                /**
                 * Gets the "VlrCodigo" element
                 */
                java.lang.String getVlrCodigo();
                
                /**
                 * Gets (as xml) the "VlrCodigo" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo xgetVlrCodigo();
                
                /**
                 * Sets the "VlrCodigo" element
                 */
                void setVlrCodigo(java.lang.String vlrCodigo);
                
                /**
                 * Sets (as xml) the "VlrCodigo" element
                 */
                void xsetVlrCodigo(cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo vlrCodigo);
                
                /**
                 * An XML TpoCodigo(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$CdgItem$TpoCodigo.
                 */
                public interface TpoCodigo extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoCodigo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("tpocodigo7f61elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.TpoCodigo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML VlrCodigo(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$CdgItem$VlrCodigo.
                 */
                public interface VlrCodigo extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VlrCodigo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("vlrcodigo2d38elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem.VlrCodigo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.CdgItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML IndExe(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$IndExe.
             */
            public interface IndExe extends org.apache.xmlbeans.XmlPositiveInteger
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndExe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("indexe038felemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.IndExe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML NmbItem(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$NmbItem.
             */
            public interface NmbItem extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NmbItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("nmbitem151celemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.NmbItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML DscItem(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$DscItem.
             */
            public interface DscItem extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DscItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("dscitema84belemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.DscItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML UnmdItem(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Detalle$UnmdItem.
             */
            public interface UnmdItem extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnmdItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("unmditem8c1felemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle.UnmdItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle newInstance() {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Detalle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML SubTotInfo(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface SubTotInfo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubTotInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("subtotinfo2d9eelemtype");
            
            /**
             * Gets the "NroSTI" element
             */
            int getNroSTI();
            
            /**
             * Gets (as xml) the "NroSTI" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI xgetNroSTI();
            
            /**
             * Sets the "NroSTI" element
             */
            void setNroSTI(int nroSTI);
            
            /**
             * Sets (as xml) the "NroSTI" element
             */
            void xsetNroSTI(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI nroSTI);
            
            /**
             * Gets the "GlosaSTI" element
             */
            java.lang.String getGlosaSTI();
            
            /**
             * Gets (as xml) the "GlosaSTI" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI xgetGlosaSTI();
            
            /**
             * True if has "GlosaSTI" element
             */
            boolean isSetGlosaSTI();
            
            /**
             * Sets the "GlosaSTI" element
             */
            void setGlosaSTI(java.lang.String glosaSTI);
            
            /**
             * Sets (as xml) the "GlosaSTI" element
             */
            void xsetGlosaSTI(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI glosaSTI);
            
            /**
             * Unsets the "GlosaSTI" element
             */
            void unsetGlosaSTI();
            
            /**
             * Gets the "OrdenSTI" element
             */
            int getOrdenSTI();
            
            /**
             * Gets (as xml) the "OrdenSTI" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI xgetOrdenSTI();
            
            /**
             * Sets the "OrdenSTI" element
             */
            void setOrdenSTI(int ordenSTI);
            
            /**
             * Sets (as xml) the "OrdenSTI" element
             */
            void xsetOrdenSTI(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI ordenSTI);
            
            /**
             * Gets the "SubTotNetoSTI" element
             */
            java.math.BigDecimal getSubTotNetoSTI();
            
            /**
             * Gets (as xml) the "SubTotNetoSTI" element
             */
            cl.sii.siiDte.boletas.Dec1Type xgetSubTotNetoSTI();
            
            /**
             * True if has "SubTotNetoSTI" element
             */
            boolean isSetSubTotNetoSTI();
            
            /**
             * Sets the "SubTotNetoSTI" element
             */
            void setSubTotNetoSTI(java.math.BigDecimal subTotNetoSTI);
            
            /**
             * Sets (as xml) the "SubTotNetoSTI" element
             */
            void xsetSubTotNetoSTI(cl.sii.siiDte.boletas.Dec1Type subTotNetoSTI);
            
            /**
             * Unsets the "SubTotNetoSTI" element
             */
            void unsetSubTotNetoSTI();
            
            /**
             * Gets the "SubTotIVASTI" element
             */
            java.math.BigDecimal getSubTotIVASTI();
            
            /**
             * Gets (as xml) the "SubTotIVASTI" element
             */
            cl.sii.siiDte.boletas.Dec1Type xgetSubTotIVASTI();
            
            /**
             * True if has "SubTotIVASTI" element
             */
            boolean isSetSubTotIVASTI();
            
            /**
             * Sets the "SubTotIVASTI" element
             */
            void setSubTotIVASTI(java.math.BigDecimal subTotIVASTI);
            
            /**
             * Sets (as xml) the "SubTotIVASTI" element
             */
            void xsetSubTotIVASTI(cl.sii.siiDte.boletas.Dec1Type subTotIVASTI);
            
            /**
             * Unsets the "SubTotIVASTI" element
             */
            void unsetSubTotIVASTI();
            
            /**
             * Gets the "SubTotAdicSTI" element
             */
            java.math.BigDecimal getSubTotAdicSTI();
            
            /**
             * Gets (as xml) the "SubTotAdicSTI" element
             */
            cl.sii.siiDte.boletas.Dec1Type xgetSubTotAdicSTI();
            
            /**
             * True if has "SubTotAdicSTI" element
             */
            boolean isSetSubTotAdicSTI();
            
            /**
             * Sets the "SubTotAdicSTI" element
             */
            void setSubTotAdicSTI(java.math.BigDecimal subTotAdicSTI);
            
            /**
             * Sets (as xml) the "SubTotAdicSTI" element
             */
            void xsetSubTotAdicSTI(cl.sii.siiDte.boletas.Dec1Type subTotAdicSTI);
            
            /**
             * Unsets the "SubTotAdicSTI" element
             */
            void unsetSubTotAdicSTI();
            
            /**
             * Gets the "SubTotExeSTI" element
             */
            java.math.BigDecimal getSubTotExeSTI();
            
            /**
             * Gets (as xml) the "SubTotExeSTI" element
             */
            cl.sii.siiDte.boletas.Dec1Type xgetSubTotExeSTI();
            
            /**
             * True if has "SubTotExeSTI" element
             */
            boolean isSetSubTotExeSTI();
            
            /**
             * Sets the "SubTotExeSTI" element
             */
            void setSubTotExeSTI(java.math.BigDecimal subTotExeSTI);
            
            /**
             * Sets (as xml) the "SubTotExeSTI" element
             */
            void xsetSubTotExeSTI(cl.sii.siiDte.boletas.Dec1Type subTotExeSTI);
            
            /**
             * Unsets the "SubTotExeSTI" element
             */
            void unsetSubTotExeSTI();
            
            /**
             * Gets the "ValSubtotSTI" element
             */
            java.math.BigDecimal getValSubtotSTI();
            
            /**
             * Gets (as xml) the "ValSubtotSTI" element
             */
            cl.sii.siiDte.boletas.Dec1Type xgetValSubtotSTI();
            
            /**
             * True if has "ValSubtotSTI" element
             */
            boolean isSetValSubtotSTI();
            
            /**
             * Sets the "ValSubtotSTI" element
             */
            void setValSubtotSTI(java.math.BigDecimal valSubtotSTI);
            
            /**
             * Sets (as xml) the "ValSubtotSTI" element
             */
            void xsetValSubtotSTI(cl.sii.siiDte.boletas.Dec1Type valSubtotSTI);
            
            /**
             * Unsets the "ValSubtotSTI" element
             */
            void unsetValSubtotSTI();
            
            /**
             * Gets array of all "LineasDeta" elements
             */
            int[] getLineasDetaArray();
            
            /**
             * Gets ith "LineasDeta" element
             */
            int getLineasDetaArray(int i);
            
            /**
             * Gets (as xml) array of all "LineasDeta" elements
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta[] xgetLineasDetaArray();
            
            /**
             * Gets (as xml) ith "LineasDeta" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta xgetLineasDetaArray(int i);
            
            /**
             * Returns number of "LineasDeta" element
             */
            int sizeOfLineasDetaArray();
            
            /**
             * Sets array of all "LineasDeta" element
             */
            void setLineasDetaArray(int[] lineasDetaArray);
            
            /**
             * Sets ith "LineasDeta" element
             */
            void setLineasDetaArray(int i, int lineasDeta);
            
            /**
             * Sets (as xml) array of all "LineasDeta" element
             */
            void xsetLineasDetaArray(cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta[] lineasDetaArray);
            
            /**
             * Sets (as xml) ith "LineasDeta" element
             */
            void xsetLineasDetaArray(int i, cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta lineasDeta);
            
            /**
             * Inserts the value as the ith "LineasDeta" element
             */
            void insertLineasDeta(int i, int lineasDeta);
            
            /**
             * Appends the value as the last "LineasDeta" element
             */
            void addLineasDeta(int lineasDeta);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "LineasDeta" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta insertNewLineasDeta(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "LineasDeta" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta addNewLineasDeta();
            
            /**
             * Removes the ith "LineasDeta" element
             */
            void removeLineasDeta(int i);
            
            /**
             * An XML NroSTI(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$SubTotInfo$NroSTI.
             */
            public interface NroSTI extends org.apache.xmlbeans.XmlPositiveInteger
            {
                int getIntValue();
                void setIntValue(int i);
                /** @deprecated */
                int intValue();
                /** @deprecated */
                void set(int i);
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroSTI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("nrostic117elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.NroSTI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML GlosaSTI(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$SubTotInfo$GlosaSTI.
             */
            public interface GlosaSTI extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GlosaSTI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("glosasti426aelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.GlosaSTI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML OrdenSTI(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$SubTotInfo$OrdenSTI.
             */
            public interface OrdenSTI extends org.apache.xmlbeans.XmlPositiveInteger
            {
                int getIntValue();
                void setIntValue(int i);
                /** @deprecated */
                int intValue();
                /** @deprecated */
                void set(int i);
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrdenSTI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("ordenstica58elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.OrdenSTI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML LineasDeta(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$SubTotInfo$LineasDeta.
             */
            public interface LineasDeta extends org.apache.xmlbeans.XmlPositiveInteger
            {
                int getIntValue();
                void setIntValue(int i);
                /** @deprecated */
                int intValue();
                /** @deprecated */
                void set(int i);
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LineasDeta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("lineasdeta074eelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo.LineasDeta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo newInstance() {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.SubTotInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML DscRcgGlobal(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface DscRcgGlobal extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DscRcgGlobal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("dscrcgglobala160elemtype");
            
            /**
             * Gets the "NroLinDR" element
             */
            int getNroLinDR();
            
            /**
             * Gets (as xml) the "NroLinDR" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR xgetNroLinDR();
            
            /**
             * Sets the "NroLinDR" element
             */
            void setNroLinDR(int nroLinDR);
            
            /**
             * Sets (as xml) the "NroLinDR" element
             */
            void xsetNroLinDR(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR nroLinDR);
            
            /**
             * Gets the "TpoMov" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov.Enum getTpoMov();
            
            /**
             * Gets (as xml) the "TpoMov" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov xgetTpoMov();
            
            /**
             * Sets the "TpoMov" element
             */
            void setTpoMov(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov.Enum tpoMov);
            
            /**
             * Sets (as xml) the "TpoMov" element
             */
            void xsetTpoMov(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov tpoMov);
            
            /**
             * Gets the "GlosaDR" element
             */
            java.lang.String getGlosaDR();
            
            /**
             * Gets (as xml) the "GlosaDR" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR xgetGlosaDR();
            
            /**
             * True if has "GlosaDR" element
             */
            boolean isSetGlosaDR();
            
            /**
             * Sets the "GlosaDR" element
             */
            void setGlosaDR(java.lang.String glosaDR);
            
            /**
             * Sets (as xml) the "GlosaDR" element
             */
            void xsetGlosaDR(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR glosaDR);
            
            /**
             * Unsets the "GlosaDR" element
             */
            void unsetGlosaDR();
            
            /**
             * Gets the "TpoValor" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor.Enum getTpoValor();
            
            /**
             * Gets (as xml) the "TpoValor" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor xgetTpoValor();
            
            /**
             * Sets the "TpoValor" element
             */
            void setTpoValor(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor.Enum tpoValor);
            
            /**
             * Sets (as xml) the "TpoValor" element
             */
            void xsetTpoValor(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor tpoValor);
            
            /**
             * Gets the "ValorDR" element
             */
            java.math.BigDecimal getValorDR();
            
            /**
             * Gets (as xml) the "ValorDR" element
             */
            cl.sii.siiDte.boletas.Dec1Type xgetValorDR();
            
            /**
             * Sets the "ValorDR" element
             */
            void setValorDR(java.math.BigDecimal valorDR);
            
            /**
             * Sets (as xml) the "ValorDR" element
             */
            void xsetValorDR(cl.sii.siiDte.boletas.Dec1Type valorDR);
            
            /**
             * Gets the "IndExeDR" element
             */
            java.math.BigInteger getIndExeDR();
            
            /**
             * Gets (as xml) the "IndExeDR" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR xgetIndExeDR();
            
            /**
             * True if has "IndExeDR" element
             */
            boolean isSetIndExeDR();
            
            /**
             * Sets the "IndExeDR" element
             */
            void setIndExeDR(java.math.BigInteger indExeDR);
            
            /**
             * Sets (as xml) the "IndExeDR" element
             */
            void xsetIndExeDR(cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR indExeDR);
            
            /**
             * Unsets the "IndExeDR" element
             */
            void unsetIndExeDR();
            
            /**
             * An XML NroLinDR(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$NroLinDR.
             */
            public interface NroLinDR extends org.apache.xmlbeans.XmlPositiveInteger
            {
                int getIntValue();
                void setIntValue(int i);
                /** @deprecated */
                int intValue();
                /** @deprecated */
                void set(int i);
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroLinDR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("nrolindr5090elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.NroLinDR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML TpoMov(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$TpoMov.
             */
            public interface TpoMov extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoMov.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("tpomov7a3delemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum D = Enum.forString("D");
                static final Enum R = Enum.forString("R");
                
                static final int INT_D = Enum.INT_D;
                static final int INT_R = Enum.INT_R;
                
                /**
                 * Enumeration value class for cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$TpoMov.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_D
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
                    
                    static final int INT_D = 1;
                    static final int INT_R = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("D", INT_D),
                        new Enum("R", INT_R),
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
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoMov) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML GlosaDR(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$GlosaDR.
             */
            public interface GlosaDR extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GlosaDR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("glosadrb332elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.GlosaDR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML TpoValor(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$TpoValor.
             */
            public interface TpoValor extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TpoValor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("tpovalor2eadelemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum X = Enum.forString("%");
                static final Enum $ = Enum.forString("$");
                
                static final int INT_X = Enum.INT_X;
                static final int INT_$ = Enum.INT_$;
                
                /**
                 * Enumeration value class for cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$TpoValor.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_X
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
                    
                    static final int INT_X = 1;
                    static final int INT_$ = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("%", INT_X),
                        new Enum("$", INT_$),
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
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.TpoValor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML IndExeDR(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$DscRcgGlobal$IndExeDR.
             */
            public interface IndExeDR extends org.apache.xmlbeans.XmlPositiveInteger
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndExeDR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("indexedr091delemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal.IndExeDR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal newInstance() {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.DscRcgGlobal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Referencia(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface Referencia extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Referencia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("referencia8ed3elemtype");
            
            /**
             * Gets the "NroLinRef" element
             */
            int getNroLinRef();
            
            /**
             * Gets (as xml) the "NroLinRef" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef xgetNroLinRef();
            
            /**
             * Sets the "NroLinRef" element
             */
            void setNroLinRef(int nroLinRef);
            
            /**
             * Sets (as xml) the "NroLinRef" element
             */
            void xsetNroLinRef(cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef nroLinRef);
            
            /**
             * Gets the "CodRef" element
             */
            java.lang.String getCodRef();
            
            /**
             * Gets (as xml) the "CodRef" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef xgetCodRef();
            
            /**
             * True if has "CodRef" element
             */
            boolean isSetCodRef();
            
            /**
             * Sets the "CodRef" element
             */
            void setCodRef(java.lang.String codRef);
            
            /**
             * Sets (as xml) the "CodRef" element
             */
            void xsetCodRef(cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef codRef);
            
            /**
             * Unsets the "CodRef" element
             */
            void unsetCodRef();
            
            /**
             * Gets the "RazonRef" element
             */
            java.lang.String getRazonRef();
            
            /**
             * Gets (as xml) the "RazonRef" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef xgetRazonRef();
            
            /**
             * True if has "RazonRef" element
             */
            boolean isSetRazonRef();
            
            /**
             * Sets the "RazonRef" element
             */
            void setRazonRef(java.lang.String razonRef);
            
            /**
             * Sets (as xml) the "RazonRef" element
             */
            void xsetRazonRef(cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef razonRef);
            
            /**
             * Unsets the "RazonRef" element
             */
            void unsetRazonRef();
            
            /**
             * An XML NroLinRef(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Referencia$NroLinRef.
             */
            public interface NroLinRef extends org.apache.xmlbeans.XmlPositiveInteger
            {
                int getIntValue();
                void setIntValue(int i);
                /** @deprecated */
                int intValue();
                /** @deprecated */
                void set(int i);
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroLinRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("nrolinref1a2celemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.NroLinRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML CodRef(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Referencia$CodRef.
             */
            public interface CodRef extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("codref53caelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.CodRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML RazonRef(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$Referencia$RazonRef.
             */
            public interface RazonRef extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RazonRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("razonref8338elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia.RazonRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia newInstance() {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.Referencia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML TED(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface TED extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TED.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("tedb8c2elemtype");
            
            /**
             * Gets the "DD" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD getDD();
            
            /**
             * Sets the "DD" element
             */
            void setDD(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD dd);
            
            /**
             * Appends and returns a new empty "DD" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD addNewDD();
            
            /**
             * Gets the "FRMT" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT getFRMT();
            
            /**
             * Sets the "FRMT" element
             */
            void setFRMT(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT frmt);
            
            /**
             * Appends and returns a new empty "FRMT" element
             */
            cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT addNewFRMT();
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("ddcc26elemtype");
                
                /**
                 * Gets the "RE" element
                 */
                java.lang.String getRE();
                
                /**
                 * Gets (as xml) the "RE" element
                 */
                cl.sii.siiDte.boletas.RUTType xgetRE();
                
                /**
                 * Sets the "RE" element
                 */
                void setRE(java.lang.String re);
                
                /**
                 * Sets (as xml) the "RE" element
                 */
                void xsetRE(cl.sii.siiDte.boletas.RUTType re);
                
                /**
                 * Gets the "TD" element
                 */
                java.math.BigInteger getTD();
                
                /**
                 * Gets (as xml) the "TD" element
                 */
                cl.sii.siiDte.boletas.DTEType xgetTD();
                
                /**
                 * Sets the "TD" element
                 */
                void setTD(java.math.BigInteger td);
                
                /**
                 * Sets (as xml) the "TD" element
                 */
                void xsetTD(cl.sii.siiDte.boletas.DTEType td);
                
                /**
                 * Gets the "F" element
                 */
                long getF();
                
                /**
                 * Gets (as xml) the "F" element
                 */
                cl.sii.siiDte.boletas.FolioType xgetF();
                
                /**
                 * Sets the "F" element
                 */
                void setF(long f);
                
                /**
                 * Sets (as xml) the "F" element
                 */
                void xsetF(cl.sii.siiDte.boletas.FolioType f);
                
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
                cl.sii.siiDte.boletas.RUTType xgetRR();
                
                /**
                 * Sets the "RR" element
                 */
                void setRR(java.lang.String rr);
                
                /**
                 * Sets (as xml) the "RR" element
                 */
                void xsetRR(cl.sii.siiDte.boletas.RUTType rr);
                
                /**
                 * Gets the "RSR" element
                 */
                java.lang.String getRSR();
                
                /**
                 * Gets (as xml) the "RSR" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR xgetRSR();
                
                /**
                 * Sets the "RSR" element
                 */
                void setRSR(java.lang.String rsr);
                
                /**
                 * Sets (as xml) the "RSR" element
                 */
                void xsetRSR(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR rsr);
                
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
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 xgetIT1();
                
                /**
                 * Sets the "IT1" element
                 */
                void setIT1(java.lang.String it1);
                
                /**
                 * Sets (as xml) the "IT1" element
                 */
                void xsetIT1(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 it1);
                
                /**
                 * Gets the "CAF" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF getCAF();
                
                /**
                 * Sets the "CAF" element
                 */
                void setCAF(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF caf);
                
                /**
                 * Appends and returns a new empty "CAF" element
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF addNewCAF();
                
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$DD$RSR.
                 */
                public interface RSR extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RSR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("rsrb2c3elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.RSR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML IT1(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$DD$IT1.
                 */
                public interface IT1 extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IT1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("it168f8elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1 newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.IT1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CAF(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface CAF extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CAF.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("caf403aelemtype");
                    
                    /**
                     * Gets the "DA" element
                     */
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA getDA();
                    
                    /**
                     * Sets the "DA" element
                     */
                    void setDA(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA da);
                    
                    /**
                     * Appends and returns a new empty "DA" element
                     */
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA addNewDA();
                    
                    /**
                     * Gets the "FRMA" element
                     */
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA getFRMA();
                    
                    /**
                     * Sets the "FRMA" element
                     */
                    void setFRMA(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA frma);
                    
                    /**
                     * Appends and returns a new empty "FRMA" element
                     */
                    cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA addNewFRMA();
                    
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
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("dacc93elemtype");
                      
                      /**
                       * Gets the "RE" element
                       */
                      java.lang.String getRE();
                      
                      /**
                       * Gets (as xml) the "RE" element
                       */
                      cl.sii.siiDte.boletas.RUTType xgetRE();
                      
                      /**
                       * Sets the "RE" element
                       */
                      void setRE(java.lang.String re);
                      
                      /**
                       * Sets (as xml) the "RE" element
                       */
                      void xsetRE(cl.sii.siiDte.boletas.RUTType re);
                      
                      /**
                       * Gets the "RS" element
                       */
                      java.lang.String getRS();
                      
                      /**
                       * Gets (as xml) the "RS" element
                       */
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS xgetRS();
                      
                      /**
                       * Sets the "RS" element
                       */
                      void setRS(java.lang.String rs);
                      
                      /**
                       * Sets (as xml) the "RS" element
                       */
                      void xsetRS(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS rs);
                      
                      /**
                       * Gets the "TD" element
                       */
                      java.math.BigInteger getTD();
                      
                      /**
                       * Gets (as xml) the "TD" element
                       */
                      cl.sii.siiDte.boletas.DTEType xgetTD();
                      
                      /**
                       * Sets the "TD" element
                       */
                      void setTD(java.math.BigInteger td);
                      
                      /**
                       * Sets (as xml) the "TD" element
                       */
                      void xsetTD(cl.sii.siiDte.boletas.DTEType td);
                      
                      /**
                       * Gets the "RNG" element
                       */
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG getRNG();
                      
                      /**
                       * Sets the "RNG" element
                       */
                      void setRNG(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG rng);
                      
                      /**
                       * Appends and returns a new empty "RNG" element
                       */
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG addNewRNG();
                      
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
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK getRSAPK();
                      
                      /**
                       * True if has "RSAPK" element
                       */
                      boolean isSetRSAPK();
                      
                      /**
                       * Sets the "RSAPK" element
                       */
                      void setRSAPK(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK rsapk);
                      
                      /**
                       * Appends and returns a new empty "RSAPK" element
                       */
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK addNewRSAPK();
                      
                      /**
                       * Unsets the "RSAPK" element
                       */
                      void unsetRSAPK();
                      
                      /**
                       * Gets the "DSAPK" element
                       */
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK getDSAPK();
                      
                      /**
                       * True if has "DSAPK" element
                       */
                      boolean isSetDSAPK();
                      
                      /**
                       * Sets the "DSAPK" element
                       */
                      void setDSAPK(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK dsapk);
                      
                      /**
                       * Appends and returns a new empty "DSAPK" element
                       */
                      cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK addNewDSAPK();
                      
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
                       * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$DD$CAF$DA$RS.
                       */
                      public interface RS extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("rs2b96elemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS newValue(java.lang.Object obj) {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS) type.newValue( obj ); }
                          
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS newInstance() {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
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
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RNG.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("rng263celemtype");
                        
                        /**
                         * Gets the "D" element
                         */
                        long getD();
                        
                        /**
                         * Gets (as xml) the "D" element
                         */
                        cl.sii.siiDte.boletas.FolioType xgetD();
                        
                        /**
                         * Sets the "D" element
                         */
                        void setD(long d);
                        
                        /**
                         * Sets (as xml) the "D" element
                         */
                        void xsetD(cl.sii.siiDte.boletas.FolioType d);
                        
                        /**
                         * Gets the "H" element
                         */
                        long getH();
                        
                        /**
                         * Gets (as xml) the "H" element
                         */
                        cl.sii.siiDte.boletas.FolioType xgetH();
                        
                        /**
                         * Sets the "H" element
                         */
                        void setH(long h);
                        
                        /**
                         * Sets (as xml) the "H" element
                         */
                        void xsetH(cl.sii.siiDte.boletas.FolioType h);
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG newInstance() {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RNG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
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
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RSAPK.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("rsapk23acelemtype");
                        
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
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK newInstance() {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.RSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
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
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DSAPK.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("dsapk917aelemtype");
                        
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
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK newInstance() {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA.DSAPK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA newInstance() {
                          return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.DA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML FRMA(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$DD$CAF$FRMA.
                     */
                    public interface FRMA extends org.apache.xmlbeans.XmlBase64Binary
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FRMA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("frma7f36elemtype");
                      
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
                        public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA newInstance() {
                          return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF.FRMA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD.CAF) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.DD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML FRMT(@http://www.sii.cl/SiiDte).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$FRMT.
             */
            public interface FRMT extends org.apache.xmlbeans.XmlBase64Binary
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FRMT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("frmt1753elemtype");
                
                /**
                 * Gets the "algoritmo" attribute
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo.Enum getAlgoritmo();
                
                /**
                 * Gets (as xml) the "algoritmo" attribute
                 */
                cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo xgetAlgoritmo();
                
                /**
                 * Sets the "algoritmo" attribute
                 */
                void setAlgoritmo(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo.Enum algoritmo);
                
                /**
                 * Sets (as xml) the "algoritmo" attribute
                 */
                void xsetAlgoritmo(cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo algoritmo);
                
                /**
                 * An XML algoritmo(@).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$FRMT$Algoritmo.
                 */
                public interface Algoritmo extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Algoritmo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("algoritmo36c7attrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum SHA_1_WITH_RSA = Enum.forString("SHA1withRSA");
                    static final Enum SHA_1_WITH_DSA = Enum.forString("SHA1withDSA");
                    
                    static final int INT_SHA_1_WITH_RSA = Enum.INT_SHA_1_WITH_RSA;
                    static final int INT_SHA_1_WITH_DSA = Enum.INT_SHA_1_WITH_DSA;
                    
                    /**
                     * Enumeration value class for cl.sii.siiDte.boletas.BOLETADefType$Documento$TED$FRMT$Algoritmo.
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
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo newInstance() {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT.Algoritmo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT newInstance() {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED.FRMT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED newInstance() {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.boletas.BOLETADefType.Documento.TED newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.boletas.BOLETADefType.Documento.TED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.boletas.BOLETADefType.Documento newInstance() {
              return (cl.sii.siiDte.boletas.BOLETADefType.Documento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.boletas.BOLETADefType.Documento newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.boletas.BOLETADefType.Documento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.boletas.BOLETADefType newInstance() {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.boletas.BOLETADefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.boletas.BOLETADefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.boletas.BOLETADefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.boletas.BOLETADefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
