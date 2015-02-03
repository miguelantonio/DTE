/*
 * XML Type:  Periodo
 * Namespace: http://www.sii.cl/SiiLce
 * Java type: cl.sii.siiLce.Periodo
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiLce;


/**
 * An XML Periodo(@http://www.sii.cl/SiiLce).
 *
 * This is a complex type.
 */
public interface Periodo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Periodo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8456C93EBBDB8033F1619C241E02AA61").resolveHandle("periodoa0f8type");
    
    /**
     * Gets the "Inicial" element
     */
    java.util.Calendar getInicial();
    
    /**
     * Gets (as xml) the "Inicial" element
     */
    org.apache.xmlbeans.XmlGYearMonth xgetInicial();
    
    /**
     * Sets the "Inicial" element
     */
    void setInicial(java.util.Calendar inicial);
    
    /**
     * Sets (as xml) the "Inicial" element
     */
    void xsetInicial(org.apache.xmlbeans.XmlGYearMonth inicial);
    
    /**
     * Gets the "Final" element
     */
    java.util.Calendar getFinal();
    
    /**
     * Gets (as xml) the "Final" element
     */
    org.apache.xmlbeans.XmlGYearMonth xgetFinal();
    
    /**
     * Sets the "Final" element
     */
    void setFinal(java.util.Calendar xfinal);
    
    /**
     * Sets (as xml) the "Final" element
     */
    void xsetFinal(org.apache.xmlbeans.XmlGYearMonth xfinal);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiLce.Periodo newInstance() {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiLce.Periodo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiLce.Periodo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiLce.Periodo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiLce.Periodo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiLce.Periodo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiLce.Periodo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiLce.Periodo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiLce.Periodo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiLce.Periodo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiLce.Periodo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiLce.Periodo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiLce.Periodo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiLce.Periodo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiLce.Periodo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiLce.Periodo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiLce.Periodo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiLce.Periodo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiLce.Periodo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
