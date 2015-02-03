/*
 * An XML document type.
 * Localname: ResultadoEnvioLibro
 * Namespace: 
 * Java type: noNamespace.ResultadoEnvioLibroDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one ResultadoEnvioLibro(@) element.
 *
 * This is a complex type.
 */
public class ResultadoEnvioLibroDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ResultadoEnvioLibroDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResultadoEnvioLibroDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ResultadoEnvioLibroDocumentExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.ResultadoEnvioLibroDocumentExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ResultadoEnvioLibroDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.ResultadoEnvioLibroDocumentExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName RESULTADOENVIOLIBRO$0 = 
        new javax.xml.namespace.QName("", "ResultadoEnvioLibro");
    
    
    /**
     * Gets the "ResultadoEnvioLibro" element
     */
    public noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro getResultadoEnvioLibro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro target = null;
            target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro)get_store().find_element_user(RESULTADOENVIOLIBRO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResultadoEnvioLibro" element
     */
    public void setResultadoEnvioLibro(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro resultadoEnvioLibro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro target = null;
            target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro)get_store().find_element_user(RESULTADOENVIOLIBRO$0, 0);
            if (target == null)
            {
                target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro)get_store().add_element_user(RESULTADOENVIOLIBRO$0);
            }
            target.set(resultadoEnvioLibro);
        }
    }
    
    /**
     * Appends and returns a new empty "ResultadoEnvioLibro" element
     */
    public noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro addNewResultadoEnvioLibro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro target = null;
            target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro)get_store().add_element_user(RESULTADOENVIOLIBRO$0);
            return target;
        }
    }
    /**
     * An XML ResultadoEnvioLibro(@).
     *
     * This is a complex type.
     */
    public static class ResultadoEnvioLibroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro
    {
        private static final long serialVersionUID = 1L;
        
        public ResultadoEnvioLibroImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFICACION$0 = 
            new javax.xml.namespace.QName("", "Identificacion");
        private static final javax.xml.namespace.QName ERRORENVIOLIBRO$2 = 
            new javax.xml.namespace.QName("", "ErrorEnvioLibro");
        
        
        /**
         * Gets the "Identificacion" element
         */
        public noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion getIdentificacion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion target = null;
                target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion)get_store().find_element_user(IDENTIFICACION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Identificacion" element
         */
        public void setIdentificacion(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion identificacion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion target = null;
                target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion)get_store().find_element_user(IDENTIFICACION$0, 0);
                if (target == null)
                {
                    target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion)get_store().add_element_user(IDENTIFICACION$0);
                }
                target.set(identificacion);
            }
        }
        
        /**
         * Appends and returns a new empty "Identificacion" element
         */
        public noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion addNewIdentificacion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion target = null;
                target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion)get_store().add_element_user(IDENTIFICACION$0);
                return target;
            }
        }
        
        /**
         * Gets the "ErrorEnvioLibro" element
         */
        public noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro getErrorEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro target = null;
                target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro)get_store().find_element_user(ERRORENVIOLIBRO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ErrorEnvioLibro" element
         */
        public boolean isSetErrorEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORENVIOLIBRO$2) != 0;
            }
        }
        
        /**
         * Sets the "ErrorEnvioLibro" element
         */
        public void setErrorEnvioLibro(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro errorEnvioLibro)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro target = null;
                target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro)get_store().find_element_user(ERRORENVIOLIBRO$2, 0);
                if (target == null)
                {
                    target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro)get_store().add_element_user(ERRORENVIOLIBRO$2);
                }
                target.set(errorEnvioLibro);
            }
        }
        
        /**
         * Appends and returns a new empty "ErrorEnvioLibro" element
         */
        public noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro addNewErrorEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro target = null;
                target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro)get_store().add_element_user(ERRORENVIOLIBRO$2);
                return target;
            }
        }
        
        /**
         * Unsets the "ErrorEnvioLibro" element
         */
        public void unsetErrorEnvioLibro()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORENVIOLIBRO$2, 0);
            }
        }
        /**
         * An XML Identificacion(@).
         *
         * This is a complex type.
         */
        public static class IdentificacionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion
        {
            private static final long serialVersionUID = 1L;
            
            public IdentificacionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TRACKID$0 = 
                new javax.xml.namespace.QName("", "TrackId");
            private static final javax.xml.namespace.QName RUTEMISOR$2 = 
                new javax.xml.namespace.QName("", "RutEmisor");
            private static final javax.xml.namespace.QName RUTENVIA$4 = 
                new javax.xml.namespace.QName("", "RutEnvia");
            private static final javax.xml.namespace.QName TMSTRECEPCION$6 = 
                new javax.xml.namespace.QName("", "TmstRecepcion");
            private static final javax.xml.namespace.QName ESTADOENVIO$8 = 
                new javax.xml.namespace.QName("", "EstadoEnvio");
            private static final javax.xml.namespace.QName TIPOSEGMENTO$10 = 
                new javax.xml.namespace.QName("", "TipoSegmento");
            private static final javax.xml.namespace.QName NROSEGMENTO$12 = 
                new javax.xml.namespace.QName("", "NroSegmento");
            private static final javax.xml.namespace.QName TIPOLIBRO$14 = 
                new javax.xml.namespace.QName("", "TipoLibro");
            private static final javax.xml.namespace.QName TIPOOPERACION$16 = 
                new javax.xml.namespace.QName("", "TipoOperacion");
            private static final javax.xml.namespace.QName PERIODOTRIBUTARIO$18 = 
                new javax.xml.namespace.QName("", "PeriodoTributario");
            private static final javax.xml.namespace.QName ESTADOLIBRO$20 = 
                new javax.xml.namespace.QName("", "EstadoLibro");
            
            
            /**
             * Gets the "TrackId" element
             */
            public long getTrackId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKID$0, 0);
                    if (target == null)
                    {
                      return 0L;
                    }
                    return target.getLongValue();
                }
            }
            
            /**
             * Gets (as xml) the "TrackId" element
             */
            public noNamespace.EnteroType xgetTrackId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EnteroType target = null;
                    target = (noNamespace.EnteroType)get_store().find_element_user(TRACKID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TrackId" element
             */
            public void setTrackId(long trackId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKID$0);
                    }
                    target.setLongValue(trackId);
                }
            }
            
            /**
             * Sets (as xml) the "TrackId" element
             */
            public void xsetTrackId(noNamespace.EnteroType trackId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EnteroType target = null;
                    target = (noNamespace.EnteroType)get_store().find_element_user(TRACKID$0, 0);
                    if (target == null)
                    {
                      target = (noNamespace.EnteroType)get_store().add_element_user(TRACKID$0);
                    }
                    target.set(trackId);
                }
            }
            
            /**
             * Gets the "RutEmisor" element
             */
            public java.lang.String getRutEmisor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RutEmisor" element
             */
            public noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor xgetRutEmisor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor target = null;
                    target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor)get_store().find_element_user(RUTEMISOR$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RutEmisor" element
             */
            public void setRutEmisor(java.lang.String rutEmisor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTEMISOR$2);
                    }
                    target.setStringValue(rutEmisor);
                }
            }
            
            /**
             * Sets (as xml) the "RutEmisor" element
             */
            public void xsetRutEmisor(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor rutEmisor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor target = null;
                    target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor)get_store().find_element_user(RUTEMISOR$2, 0);
                    if (target == null)
                    {
                      target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor)get_store().add_element_user(RUTEMISOR$2);
                    }
                    target.set(rutEmisor);
                }
            }
            
            /**
             * Gets the "RutEnvia" element
             */
            public java.lang.String getRutEnvia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTENVIA$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RutEnvia" element
             */
            public noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia xgetRutEnvia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia target = null;
                    target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia)get_store().find_element_user(RUTENVIA$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RutEnvia" element
             */
            public void setRutEnvia(java.lang.String rutEnvia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTENVIA$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTENVIA$4);
                    }
                    target.setStringValue(rutEnvia);
                }
            }
            
            /**
             * Sets (as xml) the "RutEnvia" element
             */
            public void xsetRutEnvia(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia rutEnvia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia target = null;
                    target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia)get_store().find_element_user(RUTENVIA$4, 0);
                    if (target == null)
                    {
                      target = (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia)get_store().add_element_user(RUTENVIA$4);
                    }
                    target.set(rutEnvia);
                }
            }
            
            /**
             * Gets the "TmstRecepcion" element
             */
            public java.util.Calendar getTmstRecepcion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTRECEPCION$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "TmstRecepcion" element
             */
            public org.apache.xmlbeans.XmlDateTime xgetTmstRecepcion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTRECEPCION$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TmstRecepcion" element
             */
            public void setTmstRecepcion(java.util.Calendar tmstRecepcion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTRECEPCION$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTRECEPCION$6);
                    }
                    target.setCalendarValue(tmstRecepcion);
                }
            }
            
            /**
             * Sets (as xml) the "TmstRecepcion" element
             */
            public void xsetTmstRecepcion(org.apache.xmlbeans.XmlDateTime tmstRecepcion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTRECEPCION$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TMSTRECEPCION$6);
                    }
                    target.set(tmstRecepcion);
                }
            }
            
            /**
             * Gets the "EstadoEnvio" element
             */
            public java.lang.String getEstadoEnvio()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADOENVIO$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "EstadoEnvio" element
             */
            public org.apache.xmlbeans.XmlString xgetEstadoEnvio()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADOENVIO$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "EstadoEnvio" element
             */
            public void setEstadoEnvio(java.lang.String estadoEnvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADOENVIO$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADOENVIO$8);
                    }
                    target.setStringValue(estadoEnvio);
                }
            }
            
            /**
             * Sets (as xml) the "EstadoEnvio" element
             */
            public void xsetEstadoEnvio(org.apache.xmlbeans.XmlString estadoEnvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADOENVIO$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTADOENVIO$8);
                    }
                    target.set(estadoEnvio);
                }
            }
            
            /**
             * Gets the "TipoSegmento" element
             */
            public java.lang.String getTipoSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOSEGMENTO$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "TipoSegmento" element
             */
            public org.apache.xmlbeans.XmlString xgetTipoSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOSEGMENTO$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "TipoSegmento" element
             */
            public boolean isSetTipoSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TIPOSEGMENTO$10) != 0;
                }
            }
            
            /**
             * Sets the "TipoSegmento" element
             */
            public void setTipoSegmento(java.lang.String tipoSegmento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOSEGMENTO$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOSEGMENTO$10);
                    }
                    target.setStringValue(tipoSegmento);
                }
            }
            
            /**
             * Sets (as xml) the "TipoSegmento" element
             */
            public void xsetTipoSegmento(org.apache.xmlbeans.XmlString tipoSegmento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOSEGMENTO$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOSEGMENTO$10);
                    }
                    target.set(tipoSegmento);
                }
            }
            
            /**
             * Unsets the "TipoSegmento" element
             */
            public void unsetTipoSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TIPOSEGMENTO$10, 0);
                }
            }
            
            /**
             * Gets the "NroSegmento" element
             */
            public java.lang.String getNroSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROSEGMENTO$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NroSegmento" element
             */
            public org.apache.xmlbeans.XmlString xgetNroSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NROSEGMENTO$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "NroSegmento" element
             */
            public boolean isSetNroSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NROSEGMENTO$12) != 0;
                }
            }
            
            /**
             * Sets the "NroSegmento" element
             */
            public void setNroSegmento(java.lang.String nroSegmento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROSEGMENTO$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROSEGMENTO$12);
                    }
                    target.setStringValue(nroSegmento);
                }
            }
            
            /**
             * Sets (as xml) the "NroSegmento" element
             */
            public void xsetNroSegmento(org.apache.xmlbeans.XmlString nroSegmento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NROSEGMENTO$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NROSEGMENTO$12);
                    }
                    target.set(nroSegmento);
                }
            }
            
            /**
             * Unsets the "NroSegmento" element
             */
            public void unsetNroSegmento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NROSEGMENTO$12, 0);
                }
            }
            
            /**
             * Gets the "TipoLibro" element
             */
            public java.lang.String getTipoLibro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOLIBRO$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "TipoLibro" element
             */
            public org.apache.xmlbeans.XmlString xgetTipoLibro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOLIBRO$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "TipoLibro" element
             */
            public boolean isSetTipoLibro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TIPOLIBRO$14) != 0;
                }
            }
            
            /**
             * Sets the "TipoLibro" element
             */
            public void setTipoLibro(java.lang.String tipoLibro)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOLIBRO$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOLIBRO$14);
                    }
                    target.setStringValue(tipoLibro);
                }
            }
            
            /**
             * Sets (as xml) the "TipoLibro" element
             */
            public void xsetTipoLibro(org.apache.xmlbeans.XmlString tipoLibro)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOLIBRO$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOLIBRO$14);
                    }
                    target.set(tipoLibro);
                }
            }
            
            /**
             * Unsets the "TipoLibro" element
             */
            public void unsetTipoLibro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TIPOLIBRO$14, 0);
                }
            }
            
            /**
             * Gets the "TipoOperacion" element
             */
            public java.lang.String getTipoOperacion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOOPERACION$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "TipoOperacion" element
             */
            public org.apache.xmlbeans.XmlString xgetTipoOperacion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOOPERACION$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "TipoOperacion" element
             */
            public boolean isSetTipoOperacion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TIPOOPERACION$16) != 0;
                }
            }
            
            /**
             * Sets the "TipoOperacion" element
             */
            public void setTipoOperacion(java.lang.String tipoOperacion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOOPERACION$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOOPERACION$16);
                    }
                    target.setStringValue(tipoOperacion);
                }
            }
            
            /**
             * Sets (as xml) the "TipoOperacion" element
             */
            public void xsetTipoOperacion(org.apache.xmlbeans.XmlString tipoOperacion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOOPERACION$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOOPERACION$16);
                    }
                    target.set(tipoOperacion);
                }
            }
            
            /**
             * Unsets the "TipoOperacion" element
             */
            public void unsetTipoOperacion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TIPOOPERACION$16, 0);
                }
            }
            
            /**
             * Gets the "PeriodoTributario" element
             */
            public java.lang.String getPeriodoTributario()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOTRIBUTARIO$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PeriodoTributario" element
             */
            public org.apache.xmlbeans.XmlString xgetPeriodoTributario()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIODOTRIBUTARIO$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "PeriodoTributario" element
             */
            public boolean isSetPeriodoTributario()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PERIODOTRIBUTARIO$18) != 0;
                }
            }
            
            /**
             * Sets the "PeriodoTributario" element
             */
            public void setPeriodoTributario(java.lang.String periodoTributario)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOTRIBUTARIO$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODOTRIBUTARIO$18);
                    }
                    target.setStringValue(periodoTributario);
                }
            }
            
            /**
             * Sets (as xml) the "PeriodoTributario" element
             */
            public void xsetPeriodoTributario(org.apache.xmlbeans.XmlString periodoTributario)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIODOTRIBUTARIO$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERIODOTRIBUTARIO$18);
                    }
                    target.set(periodoTributario);
                }
            }
            
            /**
             * Unsets the "PeriodoTributario" element
             */
            public void unsetPeriodoTributario()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PERIODOTRIBUTARIO$18, 0);
                }
            }
            
            /**
             * Gets the "EstadoLibro" element
             */
            public java.lang.String getEstadoLibro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADOLIBRO$20, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "EstadoLibro" element
             */
            public org.apache.xmlbeans.XmlString xgetEstadoLibro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADOLIBRO$20, 0);
                    return target;
                }
            }
            
            /**
             * True if has "EstadoLibro" element
             */
            public boolean isSetEstadoLibro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ESTADOLIBRO$20) != 0;
                }
            }
            
            /**
             * Sets the "EstadoLibro" element
             */
            public void setEstadoLibro(java.lang.String estadoLibro)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADOLIBRO$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADOLIBRO$20);
                    }
                    target.setStringValue(estadoLibro);
                }
            }
            
            /**
             * Sets (as xml) the "EstadoLibro" element
             */
            public void xsetEstadoLibro(org.apache.xmlbeans.XmlString estadoLibro)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADOLIBRO$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTADOLIBRO$20);
                    }
                    target.set(estadoLibro);
                }
            }
            
            /**
             * Unsets the "EstadoLibro" element
             */
            public void unsetEstadoLibro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ESTADOLIBRO$20, 0);
                }
            }
            /**
             * An XML RutEmisor(@).
             *
             * This is an atomic type that is a restriction of noNamespace.ResultadoEnvioLibroDocument$ResultadoEnvioLibro$Identificacion$RutEmisor.
             */
            public static class RutEmisorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor
            {
                private static final long serialVersionUID = 1L;
                
                public RutEmisorImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected RutEmisorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML RutEnvia(@).
             *
             * This is an atomic type that is a restriction of noNamespace.ResultadoEnvioLibroDocument$ResultadoEnvioLibro$Identificacion$RutEnvia.
             */
            public static class RutEnviaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia
            {
                private static final long serialVersionUID = 1L;
                
                public RutEnviaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected RutEnviaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML ErrorEnvioLibro(@).
         *
         * This is a complex type.
         */
        public static class ErrorEnvioLibroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro
        {
            private static final long serialVersionUID = 1L;
            
            public ErrorEnvioLibroImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DETERRENVIO$0 = 
                new javax.xml.namespace.QName("", "DetErrEnvio");
            
            
            /**
             * Gets array of all "DetErrEnvio" elements
             */
            public java.lang.String[] getDetErrEnvioArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DETERRENVIO$0, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "DetErrEnvio" element
             */
            public java.lang.String getDetErrEnvioArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETERRENVIO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "DetErrEnvio" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetDetErrEnvioArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DETERRENVIO$0, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "DetErrEnvio" element
             */
            public org.apache.xmlbeans.XmlString xgetDetErrEnvioArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETERRENVIO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "DetErrEnvio" element
             */
            public int sizeOfDetErrEnvioArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DETERRENVIO$0);
                }
            }
            
            /**
             * Sets array of all "DetErrEnvio" element
             */
            public void setDetErrEnvioArray(java.lang.String[] detErrEnvioArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(detErrEnvioArray, DETERRENVIO$0);
                }
            }
            
            /**
             * Sets ith "DetErrEnvio" element
             */
            public void setDetErrEnvioArray(int i, java.lang.String detErrEnvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETERRENVIO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(detErrEnvio);
                }
            }
            
            /**
             * Sets (as xml) array of all "DetErrEnvio" element
             */
            public void xsetDetErrEnvioArray(org.apache.xmlbeans.XmlString[]detErrEnvioArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(detErrEnvioArray, DETERRENVIO$0);
                }
            }
            
            /**
             * Sets (as xml) ith "DetErrEnvio" element
             */
            public void xsetDetErrEnvioArray(int i, org.apache.xmlbeans.XmlString detErrEnvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETERRENVIO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(detErrEnvio);
                }
            }
            
            /**
             * Inserts the value as the ith "DetErrEnvio" element
             */
            public void insertDetErrEnvio(int i, java.lang.String detErrEnvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DETERRENVIO$0, i);
                    target.setStringValue(detErrEnvio);
                }
            }
            
            /**
             * Appends the value as the last "DetErrEnvio" element
             */
            public void addDetErrEnvio(java.lang.String detErrEnvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETERRENVIO$0);
                    target.setStringValue(detErrEnvio);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DetErrEnvio" element
             */
            public org.apache.xmlbeans.XmlString insertNewDetErrEnvio(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DETERRENVIO$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DetErrEnvio" element
             */
            public org.apache.xmlbeans.XmlString addNewDetErrEnvio()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETERRENVIO$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DetErrEnvio" element
             */
            public void removeDetErrEnvio(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DETERRENVIO$0, i);
                }
            }
        }
    }
}
