/*
 * An XML document type.
 * Localname: LceCal
 * Namespace: http://www.sii.cl/SiiLce
 * Java type: cl.sii.siiLce.LceCalDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiLce.impl;
/**
 * A document containing one LceCal(@http://www.sii.cl/SiiLce) element.
 *
 * This is a complex type.
 */
public class LceCalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiLce.LceCalDocument
{
    private static final long serialVersionUID = 1L;
    
    public LceCalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LCECAL$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "LceCal");
    
    
    /**
     * Gets the "LceCal" element
     */
    public cl.sii.siiLce.LceCalDocument.LceCal getLceCal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiLce.LceCalDocument.LceCal target = null;
            target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().find_element_user(LCECAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LceCal" element
     */
    public void setLceCal(cl.sii.siiLce.LceCalDocument.LceCal lceCal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiLce.LceCalDocument.LceCal target = null;
            target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().find_element_user(LCECAL$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().add_element_user(LCECAL$0);
            }
            target.set(lceCal);
        }
    }
    
    /**
     * Appends and returns a new empty "LceCal" element
     */
    public cl.sii.siiLce.LceCalDocument.LceCal addNewLceCal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiLce.LceCalDocument.LceCal target = null;
            target = (cl.sii.siiLce.LceCalDocument.LceCal)get_store().add_element_user(LCECAL$0);
            return target;
        }
    }
    /**
     * An XML LceCal(@http://www.sii.cl/SiiLce).
     *
     * This is a complex type.
     */
    public static class LceCalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiLce.LceCalDocument.LceCal
    {
        private static final long serialVersionUID = 1L;
        
        public LceCalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCUMENTOCAL$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "DocumentoCal");
        private static final javax.xml.namespace.QName SIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "DocumentoCal" element
         */
        public cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal getDocumentoCal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal target = null;
                target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal)get_store().find_element_user(DOCUMENTOCAL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "DocumentoCal" element
         */
        public void setDocumentoCal(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal documentoCal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal target = null;
                target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal)get_store().find_element_user(DOCUMENTOCAL$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal)get_store().add_element_user(DOCUMENTOCAL$0);
                }
                target.set(documentoCal);
            }
        }
        
        /**
         * Appends and returns a new empty "DocumentoCal" element
         */
        public cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal addNewDocumentoCal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal target = null;
                target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal)get_store().add_element_user(DOCUMENTOCAL$0);
                return target;
            }
        }
        
        /**
         * Gets the "Signature" element
         */
        public cl.sii.siiDte.dsig.SignatureType getSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.dsig.SignatureType target = null;
                target = (cl.sii.siiDte.dsig.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Signature" element
         */
        public void setSignature(cl.sii.siiDte.dsig.SignatureType signature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.dsig.SignatureType target = null;
                target = (cl.sii.siiDte.dsig.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.dsig.SignatureType)get_store().add_element_user(SIGNATURE$2);
                }
                target.set(signature);
            }
        }
        
        /**
         * Appends and returns a new empty "Signature" element
         */
        public cl.sii.siiDte.dsig.SignatureType addNewSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.dsig.SignatureType target = null;
                target = (cl.sii.siiDte.dsig.SignatureType)get_store().add_element_user(SIGNATURE$2);
                return target;
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.math.BigDecimal getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$4);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlDecimal xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_default_attribute_value(VERSION$4);
                }
                return target;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.math.BigDecimal version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
                }
                target.setBigDecimalValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlDecimal version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$4);
                }
                target.set(version);
            }
        }
        /**
         * An XML DocumentoCal(@http://www.sii.cl/SiiLce).
         *
         * This is a complex type.
         */
        public static class DocumentoCalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal
        {
            private static final long serialVersionUID = 1L;
            
            public DocumentoCalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RUTDISTRIBUIDOR$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "RutDistribuidor");
            private static final javax.xml.namespace.QName TIPOCERTIFICADO$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "TipoCertificado");
            private static final javax.xml.namespace.QName CLASE$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "Clase");
            private static final javax.xml.namespace.QName TIPOLCE$6 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "TipoLCE");
            private static final javax.xml.namespace.QName FCHEMISION$8 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "FchEmision");
            private static final javax.xml.namespace.QName PERIODOVIGENCIA$10 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "PeriodoVigencia");
            private static final javax.xml.namespace.QName TMSTFIRMA$12 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "TmstFirma");
            private static final javax.xml.namespace.QName ID$14 = 
                new javax.xml.namespace.QName("", "ID");
            
            
            /**
             * Gets the "RutDistribuidor" element
             */
            public java.lang.String getRutDistribuidor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTDISTRIBUIDOR$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RutDistribuidor" element
             */
            public cl.sii.siiLce.RUTType xgetRutDistribuidor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.RUTType target = null;
                    target = (cl.sii.siiLce.RUTType)get_store().find_element_user(RUTDISTRIBUIDOR$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RutDistribuidor" element
             */
            public void setRutDistribuidor(java.lang.String rutDistribuidor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTDISTRIBUIDOR$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTDISTRIBUIDOR$0);
                    }
                    target.setStringValue(rutDistribuidor);
                }
            }
            
            /**
             * Sets (as xml) the "RutDistribuidor" element
             */
            public void xsetRutDistribuidor(cl.sii.siiLce.RUTType rutDistribuidor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.RUTType target = null;
                    target = (cl.sii.siiLce.RUTType)get_store().find_element_user(RUTDISTRIBUIDOR$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.RUTType)get_store().add_element_user(RUTDISTRIBUIDOR$0);
                    }
                    target.set(rutDistribuidor);
                }
            }
            
            /**
             * Gets the "TipoCertificado" element
             */
            public cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado.Enum getTipoCertificado()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOCERTIFICADO$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "TipoCertificado" element
             */
            public cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado xgetTipoCertificado()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado)get_store().find_element_user(TIPOCERTIFICADO$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TipoCertificado" element
             */
            public void setTipoCertificado(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado.Enum tipoCertificado)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOCERTIFICADO$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOCERTIFICADO$2);
                    }
                    target.setEnumValue(tipoCertificado);
                }
            }
            
            /**
             * Sets (as xml) the "TipoCertificado" element
             */
            public void xsetTipoCertificado(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado tipoCertificado)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado)get_store().find_element_user(TIPOCERTIFICADO$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado)get_store().add_element_user(TIPOCERTIFICADO$2);
                    }
                    target.set(tipoCertificado);
                }
            }
            
            /**
             * Gets the "Clase" element
             */
            public cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase.Enum getClase()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Clase" element
             */
            public cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase xgetClase()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase)get_store().find_element_user(CLASE$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Clase" element
             */
            public void setClase(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase.Enum clase)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASE$4);
                    }
                    target.setEnumValue(clase);
                }
            }
            
            /**
             * Sets (as xml) the "Clase" element
             */
            public void xsetClase(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase clase)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase)get_store().find_element_user(CLASE$4, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase)get_store().add_element_user(CLASE$4);
                    }
                    target.set(clase);
                }
            }
            
            /**
             * Gets the "TipoLCE" element
             */
            public java.math.BigInteger getTipoLCE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOLCE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "TipoLCE" element
             */
            public cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE xgetTipoLCE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE)get_store().find_element_user(TIPOLCE$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TipoLCE" element
             */
            public void setTipoLCE(java.math.BigInteger tipoLCE)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOLCE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOLCE$6);
                    }
                    target.setBigIntegerValue(tipoLCE);
                }
            }
            
            /**
             * Sets (as xml) the "TipoLCE" element
             */
            public void xsetTipoLCE(cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE tipoLCE)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE target = null;
                    target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE)get_store().find_element_user(TIPOLCE$6, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE)get_store().add_element_user(TIPOLCE$6);
                    }
                    target.set(tipoLCE);
                }
            }
            
            /**
             * Gets the "FchEmision" element
             */
            public java.util.Calendar getFchEmision()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMISION$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "FchEmision" element
             */
            public org.apache.xmlbeans.XmlDate xgetFchEmision()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMISION$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "FchEmision" element
             */
            public void setFchEmision(java.util.Calendar fchEmision)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMISION$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHEMISION$8);
                    }
                    target.setCalendarValue(fchEmision);
                }
            }
            
            /**
             * Sets (as xml) the "FchEmision" element
             */
            public void xsetFchEmision(org.apache.xmlbeans.XmlDate fchEmision)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMISION$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHEMISION$8);
                    }
                    target.set(fchEmision);
                }
            }
            
            /**
             * Gets the "PeriodoVigencia" element
             */
            public java.util.Calendar getPeriodoVigencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOVIGENCIA$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "PeriodoVigencia" element
             */
            public org.apache.xmlbeans.XmlGYear xgetPeriodoVigencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlGYear target = null;
                    target = (org.apache.xmlbeans.XmlGYear)get_store().find_element_user(PERIODOVIGENCIA$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PeriodoVigencia" element
             */
            public void setPeriodoVigencia(java.util.Calendar periodoVigencia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODOVIGENCIA$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODOVIGENCIA$10);
                    }
                    target.setCalendarValue(periodoVigencia);
                }
            }
            
            /**
             * Sets (as xml) the "PeriodoVigencia" element
             */
            public void xsetPeriodoVigencia(org.apache.xmlbeans.XmlGYear periodoVigencia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlGYear target = null;
                    target = (org.apache.xmlbeans.XmlGYear)get_store().find_element_user(PERIODOVIGENCIA$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlGYear)get_store().add_element_user(PERIODOVIGENCIA$10);
                    }
                    target.set(periodoVigencia);
                }
            }
            
            /**
             * Gets the "TmstFirma" element
             */
            public java.util.Calendar getTmstFirma()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMA$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "TmstFirma" element
             */
            public org.apache.xmlbeans.XmlDateTime xgetTmstFirma()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMA$12, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TmstFirma" element
             */
            public void setTmstFirma(java.util.Calendar tmstFirma)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMA$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTFIRMA$12);
                    }
                    target.setCalendarValue(tmstFirma);
                }
            }
            
            /**
             * Sets (as xml) the "TmstFirma" element
             */
            public void xsetTmstFirma(org.apache.xmlbeans.XmlDateTime tmstFirma)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMA$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TMSTFIRMA$12);
                    }
                    target.set(tmstFirma);
                }
            }
            
            /**
             * Gets the "ID" attribute
             */
            public java.lang.String getID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ID" attribute
             */
            public org.apache.xmlbeans.XmlID xgetID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlID target = null;
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
                    return target;
                }
            }
            
            /**
             * Sets the "ID" attribute
             */
            public void setID(java.lang.String id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
                    }
                    target.setStringValue(id);
                }
            }
            
            /**
             * Sets (as xml) the "ID" attribute
             */
            public void xsetID(org.apache.xmlbeans.XmlID id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlID target = null;
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$14);
                    }
                    target.set(id);
                }
            }
            /**
             * An XML TipoCertificado(@http://www.sii.cl/SiiLce).
             *
             * This is an atomic type that is a restriction of cl.sii.siiLce.LceCalDocument$LceCal$DocumentoCal$TipoCertificado.
             */
            public static class TipoCertificadoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoCertificado
            {
                private static final long serialVersionUID = 1L;
                
                public TipoCertificadoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected TipoCertificadoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML Clase(@http://www.sii.cl/SiiLce).
             *
             * This is an atomic type that is a restriction of cl.sii.siiLce.LceCalDocument$LceCal$DocumentoCal$Clase.
             */
            public static class ClaseImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.Clase
            {
                private static final long serialVersionUID = 1L;
                
                public ClaseImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ClaseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML TipoLCE(@http://www.sii.cl/SiiLce).
             *
             * This is an atomic type that is a restriction of cl.sii.siiLce.LceCalDocument$LceCal$DocumentoCal$TipoLCE.
             */
            public static class TipoLCEImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements cl.sii.siiLce.LceCalDocument.LceCal.DocumentoCal.TipoLCE
            {
                private static final long serialVersionUID = 1L;
                
                public TipoLCEImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected TipoLCEImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
