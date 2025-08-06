
public class EjecutarBuilder {

    public static void main(String[] args) {
        Converter objConvASCII = new ASCIIConverter();
        Converter objConvPDF = new PDFConverter();
        Converter objConvPostScript = new PostScriptConverter();
        
        Reader objReader1 = new Reader(objConvASCII);
        Reader objReader2 = new Reader(objConvPDF);
        Reader objReader3 = new Reader(objConvPostScript);
        
        objReader1.parseInput("LINEA");
        objReader1.parseInput("PARRAFO");
        objReader1.parseInput("TABLA");
        
        objReader2.parseInput("LINEA");
        objReader2.parseInput("PARRAFO");
        
        objReader3.parseInput("TABLA");
        objReader3.parseInput("LINEA");
        objReader3.parseInput("PARRAFO");
        objReader3.parseInput("TABLA");

        objReader1.parseInput("LINEA");
    }
}