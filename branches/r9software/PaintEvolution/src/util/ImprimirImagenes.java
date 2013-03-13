/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;  
import javax.imageio.ImageIO;

/**
 *
 * @author proyectosbeta
 */
public class ImprimirImagenes implements Printable{
    // Objetos.
    protected ArrayList imageList = new ArrayList<String>();
    private ArrayList imagenes = new ArrayList();
    
  
    /**
     * 
     */
    public ImprimirImagenes(){     
    }  
    
    /**
     * 
     * @param images
     * @param printerName
     * @param requestNumber 
     */
    @SuppressWarnings("unchecked")  
    public void print(Collection images, String requestNumber){  
        this.imageList.clear();  
        this.imageList.addAll(images);  
        
        crearImagenes();
        
        printData(requestNumber);  
    }  
  
    /**
     * 
     * @param printerName
     * @param requestNumber 
     */
    protected void printData(String requestNumber){   
        try{  
            PrinterJob printJob = PrinterJob.getPrinterJob();
            
            // El nombre por defecto de la impresion.
            printJob.setJobName(requestNumber);
            
            if (printJob.printDialog()){
                try{ 
                    // Resolucion.
                    //HashPrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    //PrinterResolution pr = new PrinterResolution(100, 250, ResolutionSyntax.DPI);
                    //set.add(pr);
                    /*
                    PageFormat pf = printJob.defaultPage();
                    Paper paper = new Paper();
                    paper.setSize(200.0, 500.0);
                    double margin = 10;
                   // paper.setImageableArea(margin, margin, paper.getWidth() – margin, paper.getHeight() – margin);
                    pf.setPaper(paper);
                    
                    // Se coloco en forma Vertical la pagina para la impresion.
                    pf.setOrientation(PageFormat.PORTRAIT);
                    */
                    printJob.setPrintable(this);
                    printJob.print();
                }catch(PrinterException pe) {
                     System.out.println("Error printing: " + pe);
                }
            }
            // Borrar todas las imagenes temporales que se imprimieron.
            //eliminarArchivosTemporalesImpresion();
        }catch(Exception pe){  
             System.err.println(pe);  
        }  
    }  
  
    /**
     * 
     * @param g
     * @param f
     * @param pageIndex
     * @return 
     */
    @Override
    public int print(Graphics g, PageFormat f, int pageIndex){  
        if (pageIndex >= imageList.size()){  
            return Printable.NO_SUCH_PAGE;  
        }  
        RenderedImage  image = (RenderedImage ) imagenes.get(pageIndex);  
        
        // Tamanhio de la pagina.
        //Paper paper = new Paper();
        //paper.setSize(200.0,500.0);
        /*
        double margin = 10.0;
        paper.setImageableArea(margin, margin, paper.getWidth() - margin, 
            paper.getHeight() - margin);*/
        //f.setPaper(paper);
                    
        // Se coloco en forma Vertical la pagina para la impresion.
        f.setOrientation(PageFormat.PORTRAIT);
        
        if (image != null){  
            Graphics2D g2 = (Graphics2D) g;  
            /*
            g2.translate(f.getImageableX(), f.getImageableY());  
            */
  /*
            AffineTransform at = AffineTransform.getTranslateInstance(f.getImageableX(), f.getImageableY());  
            g2.drawRenderedImage(image, at); 
            */
            //g.drawString("texto que se imprime", 100, 200);
            g.drawImage((BufferedImage)image, 0, 0, null);  
                  
            return Printable.PAGE_EXISTS;  
        }else{  
            return Printable.NO_SUCH_PAGE;  
        }  
    }  
    
    /**
     * Metodo privado que crea las imagenes y guarda en un arrayList.
     */
    private void crearImagenes(){
        // Objetos.
         BufferedImage ri;
        
        try{
            for(int j = 0; j < imageList.size(); j++){                     
                FileInputStream fis = new FileInputStream((imageList.get(j).toString()));  
                ri = ImageIO.read(fis);  
                imagenes.add(ri);  

                fis.close();  
                ri.flush();                    
            } 
        }catch(Exception e){
             System.out.println("El error es: " + e.getMessage());   
        }   
    }
    
    
    /**
     * Metodo publico que elimina las imagenes temporales que se imprimio.
     */
    public void eliminarArchivosTemporalesImpresion(){
        // Objetos.
        String rutaImagenTemporal;
        
        for(int j = 0; j < imageList.size(); j++){    
            rutaImagenTemporal = imageList.get(j).toString();
            File eliminarArchivo = new File(rutaImagenTemporal);
            
            // Se elimina el archivo de la imagen Temporal.
            eliminarArchivo.delete();
        } 
    }
}